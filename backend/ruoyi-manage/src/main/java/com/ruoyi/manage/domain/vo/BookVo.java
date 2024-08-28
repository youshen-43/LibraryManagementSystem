package com.ruoyi.manage.domain.vo;

import com.ruoyi.manage.domain.Book;
import lombok.Data;

@Data
public class BookVo extends Book {
    private String regionName;
    private String categoryName;

}
