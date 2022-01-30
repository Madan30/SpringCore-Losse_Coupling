package com.NepalCode.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		/*
		 * Student s = new Student(); MathCheat cheat = new MathCheat();
		 * s.setMathCheat(cheat); s.cheating();
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = context.getBean("stud", Student.class);
		student.cheating();

	}

}
