package com.wez.spring.study.circular.dependency;

/**
 * @Author wez
 * @Date 2021/4/20
 */
public class B {

	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
