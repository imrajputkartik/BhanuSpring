package com.bhanu.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bhanu.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ioc= new AnnotationConfigApplicationContext("com.bhanu.spring");
		
		Employee bean= ioc.getBean("employee", Employee.class);
		Employee bean1= ioc.getBean("employee", Employee.class);
		Employee bean2= ioc.getBean("employee", Employee.class);
		System.out.println(bean);
		System.out.println(bean1);
		System.out.println(bean2);
		
	}

}
