package com.imooc.mapper;

import com.imooc.common.mapper.BaseMapper;
import com.imooc.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper extends BaseMapper<Users> {
}