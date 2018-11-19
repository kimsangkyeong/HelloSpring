package com.sk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.service.AccountService;

public class AccountMain {

	public static void main(String[] args) {
		//account-conf.xml ���Ϸ� Context ����
		//ApplicationContext context = new ClassPathXmlApplicationContext("account-conf.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-conf.xml");
		//context�� getBean()�� �̿��Ͽ� Service Bean �˻�
		AccountService service=context.getBean(AccountService.class);
		AccountService service1=context.getBean(AccountService.class);
		
		service.getAccount();
		service1.getAccount();
        System.out.println(service==service1);
        context.close();
        System.out.println("end");
	}

}
