package com.bhanu.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bhanu.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ioc= new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee bean= ioc.getBean("e1", Employee.class);
		System.out.println(bean);
		
		Employee bean2= ioc.getBean("e2", Employee.class);
		System.out.println(bean2);
	}

}
