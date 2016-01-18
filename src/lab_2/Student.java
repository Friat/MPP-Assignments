package lab_2;

import java.util.ArrayList;

//import generalexcersie.Course;

class Student extends Person
	{
		private double GPA;
		private ArrayList <Course> courselist;
		
		public Student(String name, String phonenumber, int age, double GPA)
		{
			super(name, phonenumber, age);
			this.GPA = GPA;
			courselist = new ArrayList<Course>();
			
		}
		
		public Student(double GPA)
		{
			super();
			this.GPA = GPA;
			courselist = new ArrayList<Course>();
		}
	
		public double getGPA() {
			return GPA;
		}
	
		public void setGPA(double gPA) {
			GPA = gPA;
		}
	
		public ArrayList<Course> getCourselist() {
			return courselist;
		}
	
		public void setCourselist(ArrayList<Course> courselist) {
			this.courselist = courselist;
		}
		public void addCourse(Course c)
		{
			courselist.add(c);
		}
		
	}