package com.stock.dao.mapper.sys;

import com.stock.dao.model.sys.SysResource;
import com.stock.dao.model.sys.SysResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int countByExample(SysResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int deleteByExample(SysResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int deleteByPrimaryKey(Integer resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int insert(SysResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int insertSelective(SysResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    List<SysResource> selectByExample(SysResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    SysResource selectByPrimaryKey(Integer resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByExample(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByPrimaryKeySelective(SysResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByPrimaryKey(SysResource record);
}