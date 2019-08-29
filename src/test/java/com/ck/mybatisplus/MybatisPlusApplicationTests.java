package com.ck.mybatisplus;

import com.ck.mybatisplus.foundation.entity.FndUser;
import com.ck.mybatisplus.foundation.service.IFndUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

    @Autowired
    private IFndUserService iFndUserService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void fndUserSaveTest() {
        FndUser fndUser = new FndUser();
        fndUser.setJobNumber("123456789");
        fndUser.setUserPhone("1888888888");
        fndUser.setUserName("橙子");
        fndUser.setLoginName("chenkang");
        iFndUserService.save(fndUser);
    }

    @Test
    public void fndUserUpdateTest() {
        FndUser fndUser = new FndUser();
        fndUser.setJobNumber("1234567891");
        fndUser.setUserName("栗子");
        fndUser.setId("1154034819131699202");
        fndUser.setLoginName("lizi");
        iFndUserService.updateById(fndUser);
    }

    @Test
    public void fndUserListTest() {
        List<FndUser> fndUserList = iFndUserService.list();
    }

    @Test
    public void fndUserDeleteTest() {
        iFndUserService.removeById("1154034819131699202");
    }

    @Test
    public void fndUserTest() {
        FndUser fndUser = new FndUser();
        fndUser.setJobNumber("01378803");
        fndUser.setAge(25);
        fndUser.setLoginName("chenkang");
//        List<FndUser> fndUserList = iFndUserService.simpleQuery(fndUser);
        List<FndUser> fndUserList = iFndUserService.lambdaSimpleQuery(fndUser);
        System.out.println("查询结果：" + fndUserList.toString());
    }

}
