package com.yg.cloud.user.mapper;

import com.yg.cloud.user.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from t_user where id = #{id}")
    User selectById(Long id);
}
