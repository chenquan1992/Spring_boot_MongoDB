package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserDaoImpl userDaoImpl;

	@Test
	public void testSaveUser() throws Exception {
		UserEntity user=new UserEntity();
		user.setId(2l);
		user.setUserName("小明");
		user.setPassWord("fffooo123");
		userDaoImpl.saveUser(user);
	}

	@Test
	public void findUserByUserName(){
		UserEntity user= userDaoImpl.findUserByUserName("小明");
		System.out.println("user is "+user);
	}

	@Test
	public void updateUser(){
		UserEntity user=new UserEntity();
		user.setId(2l);
		user.setUserName("天空");
		user.setPassWord("fffxxxx");
		userDaoImpl.updateUser(user);
	}

	@Test
	public void deleteUserById(){
		userDaoImpl.deleteUserById(1l);
	}

}
