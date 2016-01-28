package lab_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	
	public static void putText(String s) //writes string s to the screen
    {
    System.out.println(s);
    }
//-------------------------------------------------------------
    public static String getString() throws IOException  //reads a string from the keyboard input
    {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
    }
    
    public static char getChar() throws IOException //reads a character from the keyboard input
    {
    String s = getString();
    return s.charAt(0);
    }

//-------------------------------------------------------------
 public static int getInt() throws IOException // reads an integers from the keyboard input
    {
    String s = getString();
    return Integer.parseInt(s);
    }


	public static void main(String[] args) throws ParseException, IOException
	{
		Department dept = new Department("Computer Science");
		
		SimpleDateFormat startDate = new SimpleDateFormat("MM-DD-YYYY"); // Date
			
		// Testing interface
		
		System.out.println("Static method test: " + IPerson.myStatic());
		IPerson test = new Staff("Frank Gore","472-3321",33,4050);
		System.out.println("Default method test:" + test.myDefault());
		
		// Create faculty objects
		
		Person per1 = new Faculty("Frank Moore","472-5921",43,10000);	
		Person per2 = new Faculty("Sam Howard","472-7222",55,9500);
		Person per3 = new Faculty("John Doodle","472-6190",39,8600);
		
        dept.addPerson(per1);
        dept.addPerson(per2);
        dept.addPerson(per3);
        
        //System.out.println("");
        
		// Create student objects
        
		Person per4 = new Student("John Doe","472-1121",22,4.0);
		Person per5 = new Student("Mary Jones","472-7322",32,3.80);
		Person per6 = new Student("Lee Johnson","472-6009",19,3.65);
		
		
	
		dept.addPerson(per4);
		dept.addPerson(per5);
		dept.addPerson(per6);
		
		
		// Create staff objects
				
		Person per7 = new Staff("Frank Gore","472-3321",33,4050);
		Person per8 = new Staff("Adam Davis","472-7552",50,5500);
		Person per9 = new Staff("David Heck","472-8890",29,3600);
		
		dept.addPerson(per7);
		dept.addPerson(per8);
		dept.addPerson(per9);
				
		// Create StaffStudents objects
		
		//StaffStudents 
		
		// Create course objects
		Faculty f1 = (Faculty)per1;
		Faculty f2 = (Faculty)per2;
		Faculty f3 = (Faculty)per3;
		
		Course cs201 = new Course("cs201","programming",4, f3);
		Course cs360 = new Course("cs360","database",3, f2);
		Course cs404 = new Course("cs404","compiler",4, f3);
		Course cs240 = new Course("cs240","datastructure",2, f3);
		Course cs301 = new Course("cs301","Software engg",3, f2);
		Course cs450 = new Course("cs450","Advanced architecture",5,f1);
				
		// Adding Faculty Courses to the courses list
		f1.addCourse(cs450);
		f2.addCourse(cs360);
		f2.addCourse(cs301);
		f3.addCourse(cs240);
		f3.addCourse(cs404);
		f3.addCourse(cs201);

       // Adding Courses to the Student course list
		
		Student s1 = (Student)per4;
		Student s2 = (Student)per5;
		Student s3 = (Student)per6;
		
		s1.addCourse(cs201);
		s1.addCourse(cs360);
		s1.addCourse(cs404);
		s1.addCourse(cs301);
		
		s2.addCourse(cs201);
		s2.addCourse(cs404);
		s2.addCourse(cs450);
		
		s3.addCourse(cs201);
		s3.addCourse(cs360);
		s3.addCourse(cs240);
		s3.addCourse(cs450);
		
		// from Staff to StaffStudents
		
		Staff staffstudent1 = (Staff)per7;
		Student stuobj = new Student(3.8);
		stuobj.addCourse(cs201);
		
		Person per10 = new StaffStudents(staffstudent1.name, staffstudent1.phonenumber, staffstudent1.getAge(),staffstudent1.getSalary(),startDate.parse("05-11-2015"),stuobj);
		
		dept.getPersonList().remove(per7);
		
		// New staff students
		Student stuobj2 = new Student(3.5);
		stuobj2.addCourse(cs301);
		Person per11 = new StaffStudents("Friat", "4353635144",27, 5000.0,startDate.parse("05-11-2015"),stuobj2);
		
		
		Student stuobj3 = new Student(4.0);
		stuobj3.addCourse(cs240);
		Person per12 = new StaffStudents("Tinbit", "4353635144",27, 10000.0,startDate.parse("05-11-2015"),stuobj3);
		
		//Student to StaffStudents
		Person per13 = new StaffStudents(s1.name, s1.phonenumber, s1.age, 3500.0, startDate.parse("03-06-2015"), s1);
		dept.getPersonList().remove(per4);
		
		
		// Adding staff students to the person list
		
		dept.addPerson(per10);
		dept.addPerson(per11);
		dept.addPerson(per12);
		dept.addPerson(per13);
				
		double totsalary = 0;

	      while(true)
	         {
	         putText("Enter first letter of ");
	         putText("getTotalSalary, showAllMembers, unitsPerFaculty , Faculty member a or quit : ");
	         int choice = getChar();
	         switch(choice)
	            {
	            case 'g':
	               totsalary=dept.getTotalSalary();
	               //putText("Total sum of all salaries is:"+ totsalary);
	               System.out.printf("Total sum of all salarie is: $%2.2f ", totsalary);
	               System.out.println();
	               //putText(String.valueOf(totsalary)+"\n");              
	               break;
	            case 's':
	               dept.showAllMembers();
	               break;
	            case 'u':
	               dept.unitsPerFaculty();
	               break;
	            case 'f':
	            	Scanner input = new Scanner(System.in);
	            	
	            	System.out.println("Enter The Name of The Faculty");
	            	
	            	String Facultyname = input.nextLine(); 
	            	dept.FacultyStudents(Facultyname);
	            case 'q': return;
	            default:
	               putText("Invalid entry\n");
	            }  // end switch
	         }  // end while

		
	}


	}


