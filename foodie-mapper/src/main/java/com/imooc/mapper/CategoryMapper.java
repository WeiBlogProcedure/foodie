package com.imooc.mapper;

import com.imooc.common.mapper.BaseMapper;
import com.imooc.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}