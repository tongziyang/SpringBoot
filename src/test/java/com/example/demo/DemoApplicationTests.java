package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.autolayout.HelloPersonBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private HelloPersonBean helloPersonBean;
	
	@Test
	public void contextLoads() {
	     System.out.println(helloPersonBean.say());
	}

}
