package lab_2;

import java.util.ArrayList;

//import generalexcersie.Course;

class Faculty extends Person
{
		private double salary;
		private ArrayList <Course> courseList;
		
		
		public Faculty(String name, String phonenumber, int age, double salary) {
			super(name, phonenumber, age);
			this.salary = salary;
			courseList = new ArrayList<Course>();
		}
	
	
		public double getSalary() {
			return salary;
		}
	
	
		public void setSalary(double salary) {
			this.salary = salary;
		}
	
	
		public ArrayList<Course> getCourseList() {
			return courseList;
		}
	
	
		public void setCourselist(ArrayList<Course> courselist) {
			this.courseList = courselist;
		}
	public void addCourse(Course c)
	{
		courseList.add(c);
	}
	
		public int getTotalUnits()
		{
			int sum = 0;
			for(Course c : courseList)
			{
				//if
				sum = sum + c.getUnits();
			}
			return sum;
			
		}
		
	}