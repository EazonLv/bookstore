package com.yc.bookstore.service.impl;

import com.yc.bookstore.entity.Sort;
import com.yc.bookstore.entity.SortExample;
import com.yc.bookstore.mapper.SortMapper;
import com.yc.bookstore.service.SortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SortServiceImpl implements SortService {
    @Resource
    private SortMapper sortMapper;

    /**
     * 查找所有种类
     * @return
     */
    @Override
    public List<Sort> findAllSorts() {
        SortExample example = new SortExample();
        return sortMapper.selectByExample(example);
    }
}
