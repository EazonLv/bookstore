package com.yc.bookstore.controller;

import com.alibaba.fastjson.JSONObject;
import com.yc.bookstore.base.BaseController;
import com.yc.bookstore.entity.User;
import com.yc.bookstore.service.BookService;
import com.yc.bookstore.service.SortService;
import com.yc.bookstore.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Resource
    private UserService userService;
    @Resource
    private BookService bookService;
    @Resource
    private SortService sortService;

    @RequestMapping("/loginPage")
    public String loginPage(){
        return "user/login";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public HashMap<String,Object> userLogin(@RequestParam("JSONString") String JSONString, HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        JSONObject object = JSONObject.parseObject(JSONString);

        String userid = object.getString("userid");
        String password = object.getString("password");
        User user = userService.userLogin(userid, password);

        if (user == null){
            return wrapFailedResult("用户名或密码错误！");
        }else {
            user.setPassword(null);
            request.getSession().setAttribute("user",user);
            return wrapSuccessResult("登录成功！");
        }
    }

    @RequestMapping("/indexPage")
    public String indexPage(Model model){

        model.addAttribute("book",bookService.findAllBook());
        model.addAttribute("sort",sortService.findAllSorts());
        return "user/index";
    }
}
