package cn.wolfcode.mycat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wolfcode.mycat.domain.User;
import cn.wolfcode.mycat.mapper.UserMapper;

/**
 * @author 向问天
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/save")
    public String save(User user){
        userMapper.insert(user);
        return "保存成功";
    }
    @RequestMapping("/list")
    public List<User> list(){
        return userMapper.selectAll();
    }
}
