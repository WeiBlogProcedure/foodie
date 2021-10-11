package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.UserAddress;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAddressMapper extends MyMapper<UserAddress> {
}