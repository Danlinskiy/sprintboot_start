package com.shan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shan.modal.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IBookDao extends BaseMapper<Book> {

}
