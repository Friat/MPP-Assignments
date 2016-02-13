package schoolLabusinglambda;

import java.util.Date;
//import java.util.ArrayList;

public class StaffStudents extends Staff{

	//private double GPA;
	private Student student1;
	Date courseStartDate;
	//public ArrayList <Course> courseList;
	
	public StaffStudents(String name, String phonenumber, int age, double salary, Date startDate, Student s)
	{
		super(name, phonenumber, age, salary);
		//this.GPA = GPA;
		this.courseStartDate = startDate;
		this.student1 = s;
	}
	
	
	public Student getStudent1() {
		return student1;
	}


	public void setStudent1(Student student1) {
		this.student1 = student1;
	}


	public Date getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(Date courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

		
}
