package com.yc.bookstore.service.impl;

import com.yc.bookstore.entity.Book;
import com.yc.bookstore.entity.BookExample;
import com.yc.bookstore.mapper.BookMapper;
import com.yc.bookstore.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    /**
     * 查询所有书籍
     * @return
     */
    @Override
    public List<Book> findAllBook() {
        BookExample example = new BookExample();
        return bookMapper.selectByExample(example);
    }

    /**
     * 查询所有有效的书籍
     *
     * @return
     */
    @Override
    public List<Book> findAllBookActive() {
        BookExample example = new BookExample();
        BookExample.Criteria criteria = example.createCriteria();
        criteria.andIsActiveEqualTo("Y");
        return bookMapper.selectByExample(example);
    }

    /**
     * 按种类查询书籍
     *
     * @return
     */
    @Override
    public List<Book> findBookBySort(Integer sortid) {
        BookExample example = new BookExample();
        BookExample.Criteria criteria = example.createCriteria();
        criteria.andIsActiveEqualTo("Y");
        criteria.andSortidEqualTo(sortid);
        return bookMapper.selectByExample(example);
    }
}
