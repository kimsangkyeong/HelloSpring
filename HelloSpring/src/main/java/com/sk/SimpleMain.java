package com.sk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-conf.xml");
		HelloBean bean = context.getBean(HelloBean.class);
		System.out.println(bean.hello());
		
		Repo repo = context.getBean(Repo.class); // type based�� ã�ƿ��� : ����ü�� �ڵ����� ã���ش�.
		repo.doSomething();
	}
}
