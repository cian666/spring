package cn.cian.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		People people = (People) applicationContext.getBean("people");
		people.say();
		System.out.println(true & false);
	}
}
