package lab_2;

import java.util.ArrayList;


public class Department
		{
			private String name;
			private ArrayList <Person> personList;
			//private ArrayList <Persons> 
			
			
			public Department(String name)
			{
				this.name = name;
				personList = new ArrayList<Person>();
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public ArrayList<Person> getPersonList() {
				return personList;
			}
			public void setPersonlist(ArrayList<Person> personList) {
				this.personList = personList;
			}
			public double getTotalSalary()
			{
				double sum = 0.0;
				for(Person p: personList)
				{
					if(p instanceof Staff)
					{
						Staff s = (Staff)p;
						sum = sum + s.getSalary();
					}
					else if(p instanceof Faculty)
					{
						Faculty f = (Faculty)p;
						sum = sum + f.getSalary();
					}
					else if(p instanceof StaffStudents)
					{
						StaffStudents stfstu = (StaffStudents)p;
					    sum = sum + stfstu.getSalary();
					}
				}
				return sum;
				 	
		}
			
			public void showAllMembers()
			{
				System.out.println("All Members in Department:");
				
				for(Person p : personList)
				{
					//String name = p.getName();
					System.out.println("Name: "+ p.getName()+"   "+ "Phone Number: " + p.getPhonenumber()+"   " + "Age: "+p.getAge()+"   "+  "Type: "+ p.getClass().getSimpleName() );
					System.out.println();
				}
			}
			
			public void unitsPerFaculty()
			{
				
				for(Person p : personList)
				{
					if(p instanceof Faculty)
					{
						Faculty f = (Faculty)p;
						System.out.println("Name: "+ f.getName()+","+ "Total Unit: "+f.getTotalUnits());
						//System.out.println();
						
					}
				}
				
			}
			
			ArrayList<Student> studentList = new ArrayList<Student>();
			public void studentInfo(Course c)
			{
				for(Person p:personList)
				{
					if(p instanceof Student)
					{
						Student stuObj = (Student) p;
						ArrayList<Course> courseList = stuObj.getCourselist();
						for(Course cc:courseList)
						{
							if(cc.getNumber().equals(c.getNumber()))
							{
								if(!studentList.contains(stuObj))
									studentList.add(stuObj);
								break;
							}
						}
					}
				}
			}
			
			public void FacultyStudents(String facultyName)
			{
				studentList.clear();
				for(Person p:personList)
				{
					if(p instanceof Faculty)
					{
						if(p.getName().equals(facultyName))
						{
							Faculty f = (Faculty)p;
							for(Course c:f.getCourseList())
							{
							     studentInfo(c);
							}
						}
					}
				}
				for(Student s:studentList)
				{
					System.out.println(s.getName());
				}
			}
		public void addPerson(Person p)
		{
			personList.add(p);
		}
		}
