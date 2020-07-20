package com.yc.bookstore.service;

import com.yc.bookstore.entity.Sort;

import java.util.List;

public interface SortService {
    /**
     * 查找所有种类
     * @return
     */
    public List<Sort> findAllSorts();

}
