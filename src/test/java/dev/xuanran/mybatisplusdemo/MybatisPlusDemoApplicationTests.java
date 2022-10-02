package dev.xuanran.mybatisplusdemo;

import dev.xuanran.mybatisplusdemo.bean.User;
import dev.xuanran.mybatisplusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> list = userMapper.selectList(null);
        System.out.println(list);
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setName("XuanRan2");
        user.setAge(20);
        user.setEmail("XuanRanDev2@qq.com");
        int i = userMapper.insert(user);
        System.out.println(i);
    }

}
