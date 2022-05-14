package com.shan.modal;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("tbl_book")
@Data
public class Book {
    int id;
    String type;
    String name;
    String description;
}
