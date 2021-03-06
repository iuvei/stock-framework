package com.stock.service.sys.impl;



import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.common.util.convert.DateConvert;
import com.stock.dao.mapper.sys.SysLoginLogMapper;
import com.stock.dao.model.sys.SysLoginLog;
import com.stock.dao.model.sys.SysLoginLogExample;
import com.stock.dao.model.sys.SysLoginLogExample.Criteria;
import com.stock.dao.page.Page;
import com.stock.service.common.DataAuthorizeService;
import com.stock.service.common.util.DateJsonValueProcessor;
import com.stock.service.sys.SysLoginLogService;

/**
 *
 * ClassName : SysLoginLogServiceImpl Function : TODO date : 2017年5月7日下午6:02:39
 *
 * @author chengxl
 * @version :
 * @since JDK 1.7
 */

@Service("loginLogService")
public class SysLoginLogServiceImpl implements SysLoginLogService {

    @Autowired
    private SysLoginLogMapper loginLogMapper;

    @Autowired
    private  DataAuthorizeService dataAuthorizeService;

    @Override
    public List<SysLoginLog> getLogs(String keys) {
        // TODO Auto-generated method stub

        SysLoginLogExample example = new SysLoginLogExample();

        JSONObject jKeys = JSONObject.fromObject(keys);

        Criteria criteria = example.createCriteria();

        // 设置截关日期
        if (jKeys.containsKey("startDate"))
            criteria.andLoginTimeGreaterThanOrEqualTo(DateConvert.strToDate(
                    jKeys.getString("startDate"), "yyyy-MM-dd"));

        if (jKeys.containsKey("endDate"))
            criteria.andLoginTimeLessThanOrEqualTo(DateConvert.strToDate(
                    jKeys.getString("endDate"), "yyyy-MM-dd"));

        return loginLogMapper.selectByExample(example);
    }

    @Override
    public Map<String, Object> getLogsByPage(String keys, Integer pageSize,
                                             Integer pageIndex) {
        // TODO Auto-generated method stub

        JSONObject jKeys = JSONObject.fromObject(keys);

        SysLoginLogExample example = new SysLoginLogExample();

        Criteria criteria = example.createCriteria();

        if (jKeys.containsKey("logUserId")
                && !"".equals(jKeys.getString("logUserId")))
            criteria.andUserIdEqualTo(jKeys.getInt("logUserId"));

//		if (jKeys.containsKey("type") && !"".equals(jKeys.getString("type")))
//			criteria.andLogTypeEqualTo(jKeys.getString("type"));
        // criteria.andLogUserIdEqualTo(123);

        // 设置截关日期
        if (jKeys.containsKey("startDate")
                && !"".equals(jKeys.getString("startDate")))
            criteria.andLoginTimeGreaterThanOrEqualTo(DateConvert.strToDate(
                    jKeys.getString("startDate"), "yyyy-MM-dd"));

        if (jKeys.containsKey("endDate")
                && !"".equals(jKeys.getString("endDate")))
            criteria.andLoginTimeLessThanOrEqualTo(DateConvert.strToDate(
                    jKeys.getString("endDate"), "yyyy-MM-dd"));

        int totalrecords = loginLogMapper.countByExample(example);

        /**
         * for my sql db
         */
        Page page = new Page();

        // page.setBegin((pageIndex-1)*pageSize);
        // page.setLength(pageSize);

        page.setBegin(pageIndex);// (-1)*pageSize
        page.setLength(pageSize);

        example.setPage(page);

        example.setOrderByClause(" create_time desc");

        List<SysLoginLog> listLog = loginLogMapper.selectByExample(example);

        // 处理json数据中的日期格式
        JsonConfig config = new JsonConfig();
        config.setIgnoreDefaultExcludes(false);
        config.registerJsonValueProcessor(Date.class,
                new DateJsonValueProcessor("yyyy-MM-dd HH:ss:mm"));

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("recordsTotal", totalrecords);// total
        map.put("recordsFiltered", totalrecords);// total

        map.put("aaData", JSONArray.fromObject(listLog, config));

        return map;
    }

    @Override
    public void insert(SysLoginLog loginLog) {
        // TODO Auto-generated method stub
        dataAuthorizeService.addDataAuthorizeInfo(loginLog,"insert");
        loginLogMapper.insertSelective(loginLog);
    };
}
