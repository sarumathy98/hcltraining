package org.hcl;

import java.util.ArrayList;
import java.util.List;

public class CoursesList {
	private  List<Course>course;
	List<Course> list=new ArrayList<Course>();
	public CoursesList()
	{
		
	}
	public CoursesList(List<Course> course) {
		super();
		this.course = course;
	
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public void insert(Course course)
	{
		
	}
	public List<String> noOfCourse(double budget)
	
	{
		List<String> amount=new ArrayList<String>();
		if(((Course)course).getFee()==budget)
		{
			amount.add(((Course)course).getName());
			
		}
		return amount;
	}
	
	
	
	
	
	
	
	

}
