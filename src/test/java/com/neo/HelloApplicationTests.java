package com.neo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.Entity.PageEntity;
import com.neo.mapper.UserMapper;
import com.neo.services.pageservices;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {
	@Autowired
    private UserMapper UserMapper;
	
/*	@Test
	public void contextLoads() {
		System.out.println("Hello Spring Boot 2.0!");
	}*/
/*	@Test
    public void testInsert() throws Exception {
        UserMapper.insert(new UserEntity("aa", "a123456", UserSexEnum.MAN));
        UserMapper.insert(new UserEntity("bb", "b123456", UserSexEnum.WOMAN));
        UserMapper.insert(new UserEntity("cc", "b123456", UserSexEnum.WOMAN));

        Assert.assertEquals(3, UserMapper.getAll().size());
    }*/

/*    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = UserMapper.getAll();
        System.out.println(users.toString());
    }*/

 /*   @Test
    public void testUpdate() throws Exception {
        UserEntity user = UserMapper.getOne(3);
        System.out.println(user.toString());
        user.setNickName("neo");
        UserMapper.update(user);
        Assert.assertTrue(("neo".equals(UserMapper.getOne(3).getNickName())));
    }*/
/*    @Test
    public void testDelete() throws Exception{
    	UserMapper.deletebyusername("aa");
    	UserMapper.deletebyusername("bb");
    	UserMapper.deletebyusername("cc");
    }*/
    @Resource
    pageservices page;
    
	@Test
	public void login(){
		 List<String> list=new ArrayList<String>();
		 list=page.getforpagename();

		
//		String json=JSONArray.fromObject(list).toString();

		JSONArray jsonArray = JSONArray.fromObject(list);    //将json字符串转为json对象
		System.out.println(jsonArray);
	}
}
