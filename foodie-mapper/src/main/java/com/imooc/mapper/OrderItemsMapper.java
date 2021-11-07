package com.imooc.mapper;

import com.imooc.common.mapper.BaseMapper;
import com.imooc.pojo.OrderItems;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemsMapper extends BaseMapper<OrderItems> {
}