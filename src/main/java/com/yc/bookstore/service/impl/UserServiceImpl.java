package com.yc.bookstore.service.impl;

import com.yc.bookstore.entity.User;
import com.yc.bookstore.entity.UserExample;
import com.yc.bookstore.mapper.UserMapper;
import com.yc.bookstore.service.UserService;
import com.yc.bookstore.util.MD5;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 用户登录
     * @param userid
     * @param password
     * @return true-登录成功，false-登录失败
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @Override
    public User userLogin(String userid, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String pwd = MD5.EncoderByMd5(password);

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<User> users = userMapper.selectByExample(example);
        if(users.size()==0){
            return null;
        }else {
            if (users.get(0).getPassword().equals(pwd)){
                return users.get(0);
            }else {
                return null;
            }
        }
    }


}
