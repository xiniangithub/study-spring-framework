package com.wez.spring.study.circular.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wez
 * @Date 2021/4/20
 */
public class CircularDependencyMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("circular-dependency.xml");
		A a = context.getBean(A.class);
		B b = context.getBean(B.class);
	}

}
