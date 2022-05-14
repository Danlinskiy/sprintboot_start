package com.shan;

import com.shan.dao.IBookDao;
import com.shan.modal.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprintbootStartApplicationTests {
    @Autowired
    IBookDao dao;

    @Test
    void contextLoads() {
        Book book = dao.selectById(1);
        System.out.println(book.toString());
    }

}
