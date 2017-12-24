package com.tzm.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class JunitTest {

	@Before
	public void before(){
		ApplicationContext fx = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/spring-context.xml");
		System.out.println(fx.getBean("userBean"));
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
