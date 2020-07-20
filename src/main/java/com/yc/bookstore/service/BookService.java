package com.yc.bookstore.service;

import com.yc.bookstore.entity.Book;

import java.util.List;

public interface BookService {

    /**
     * 查询所有书籍
     * @return
     */
    public List<Book> findAllBook();

    /**
     * 查询所有有效的书籍
     * @return
     */
    public List<Book> findAllBookActive();

    /**
     * 按种类查询书籍
     * @return
     */
    public List<Book> findBookBySort(Integer sortid);
}
