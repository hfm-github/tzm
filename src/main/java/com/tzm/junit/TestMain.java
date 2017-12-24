package com.tzm.junit;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain{

	public static void main(String[] args){
		ApplicationContext fx = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/spring-context.xml");
		System.out.println(fx.getBean("userBean"));
	}
}
