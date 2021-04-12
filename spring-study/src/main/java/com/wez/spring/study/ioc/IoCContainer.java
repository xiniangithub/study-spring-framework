package com.wez.spring.study.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wez
 * @Date 2021/4/5
 */
public class IoCContainer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
		Object person = context.getBean("person");
		System.out.println(person);
	}

}
