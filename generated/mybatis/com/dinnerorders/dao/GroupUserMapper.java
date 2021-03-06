package com.dinnerorders.dao;

import com.dinnerorders.domain.GroupUser;
import com.dinnerorders.domain.GroupUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    int countByExample(GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    int deleteByExample(GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    int insert(GroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    int insertSelective(GroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    List<GroupUser> selectByExample(GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    GroupUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GroupUser record, @Param("example") GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GroupUser record, @Param("example") GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_users
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GroupUser record);
}