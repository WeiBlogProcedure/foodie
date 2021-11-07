package com.imooc.mapper;

import com.imooc.common.mapper.BaseMapper;
import com.imooc.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}