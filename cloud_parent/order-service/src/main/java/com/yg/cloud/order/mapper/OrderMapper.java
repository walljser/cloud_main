package com.yg.cloud.order.mapper;

import com.yg.cloud.order.pojo.Order;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {
    @Select("select * from t_order where id = #{id}")
    Order selectById(Long id);
}
