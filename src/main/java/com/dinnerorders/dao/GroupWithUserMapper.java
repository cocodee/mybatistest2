package com.dinnerorders.dao;
import com.dinnerorders.domain.User;
import com.dinnerorders.domain.GroupWithUser;

import java.util.List;

import org.apache.ibatis.annotations.Param;
public interface GroupWithUserMapper {
    GroupWithUser selectByPrimaryKey(Integer id);
    int addUserToGroup(@Param("group") GroupWithUser g,@Param("user") User u);
}
