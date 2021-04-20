package com.wez.spring.study.circular.dependency;

/**
 * @Author wez
 * @Date 2021/4/20
 */
public class A {

	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
