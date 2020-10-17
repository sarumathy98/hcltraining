package org.hcl;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) throws ClassCastException {
		double a;
		Scanner amount=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CoursesList course=context.getBean(CoursesList.class,"courseslist");
		List<Course> c=course.getCourse();
		System.out.println("Enter the budget amount");
		a=amount.nextDouble();
		List<String> CourseDetails=course.noOfCourse(a);
		for(String course1:CourseDetails )
		{
			System.out.println(course1);
		}

	}

}