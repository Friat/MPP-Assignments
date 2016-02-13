package lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class EmployeeUsingLambdaExp {

	
	 public static int wordCount(List<String> words, char c, char d, int len)
	    {
			return
	         (int) words.stream()
	         .filter(w -> w.contains(""+ c ))
	         .filter(w -> !w.contains(""+ d))
	         .filter(w -> w.length()== len)
	         .count();
			//return count;
			    
	     }
		
	   public static void main(String[] args)
	   {
	      // initialize array of Employees
	      Employee[] employees = {
	         new Employee("Jason", "Red", 5000, "IT"),
	         new Employee("Ashley", "Green", 7600, "IT"),
	         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
	         new Employee("James", "Indigo", 4700.77, "Marketing"),
	         new Employee("Luke", "Indigo", 6200, "IT"),
	         new Employee("Jason", "Blue", 3200, "Sales"),
	         new Employee("Wendy", "Brown", 4236.4, "Marketing"),
	         new Employee("Wendy", "Bolt", 4236.4, "Marketing")};

	      // get List view of the Employees
	      List<Employee> list = Arrays.asList(employees);
	      
	      // List of words
	      
	      List<String> words = new ArrayList<String>();
	      words.add("celo");
	      words.add("ciao");
	      words.add("lelc");
	      words.add("does");
	      words.add("dcar");

	      // display all Employees
	      System.out.println("Complete Employee list:");
	      System.out.println("==============================================================");
	      list.stream().forEach(System.out::println);
	      
	      System.out.println();
	      System.out.println("==============================================================");
	      //Number of last Names that begins with the letter B
	      System.out.println("Number of Last Name Starts with B");
	           list.stream()
	      	  .filter(e ->e.getLastName().startsWith("B"))
	      	  .count();
	          System.out.println( list.stream()
	              	  .filter(e ->e.getLastName().startsWith("B"))
	               	 .count());
	       System.out.println();
	       //System.out.println("///////////////////////////////////");
	       System.out.println("List of Employees whose last name starts with B in Sorted Order");
	       System.out.println("==============================================================");
	       
	       Function<Employee, String> byLastName = Employee::getLastName;
	       Comparator<Employee> lastname = Comparator.comparing(byLastName);
	       list.stream()
	           .filter(e -> e.getLastName().startsWith("B"))
	           .map(e -> e.getLastName())
	           .sorted()
	           .forEach(System.out :: println);
	       
	       System.out.println();
	       System.out.println("All Employees whose last name starts with B: First Name and Last Name Capitalize");
	       System.out.println("================================================================================");
	       list.stream()
	           .filter(e -> e.getLastName().startsWith("B"))
	           .map(e -> new Employee(e.getFirstName().toUpperCase(), e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment()))
	           .forEach(System.out :: println); 
	       
	       System.out.println();
	       System.out.println("All Employees whose last name starts with B: Only Last Name Capitalize");
	       System.out.println("================================================================================");
	       list.stream()
	           .filter(e -> e.getLastName().startsWith("B"))
	           .map(e -> new Employee(e.getFirstName(), e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment()))
	      	   .forEach(System.out :: println);
	       
	       System.out.println();
	       System.out.println("All Employees whose last name starts with I in sorted Order and get rid of duplicates:");
	       System.out.println("================================================================================");
	       
	       list.stream()
	       .filter(e -> e.getLastName().startsWith("I"))
	       .map(e -> e.getLastName())
	       .sorted()
	       .distinct()
	       .forEach(System.out :: println);
	       
	       System.out.println();
	       System.out.println("Average salary of all employees");
	       System.out.println("================================================================================");
	      
	       list.stream()
	         .mapToDouble(e -> e.getSalary())
	         .average().getAsDouble();
	         System.out.println("Total Salary: "+list.stream()
	         .mapToDouble(e -> e.getSalary())
	         .average().getAsDouble());
	       
	       System.out.println();
	       System.out.println("Total salary of all employees Using reduce");
	       System.out.println("================================================================================");  
	       
	       list.stream()
	       .mapToDouble(e -> e.getSalary())
	       .reduce(0,(x,y) -> x + y);
	       System.out.println("Total Salary: "+list.stream()
	    	       .mapToDouble(e -> e.getSalary())
	    	       .reduce(0,(x,y) -> x + y));
	       

	       System.out.println();
	       System.out.println("First Names of all employee");
	       System.out.println("================================================================================");
	       
	       list.stream()
	       .map(e -> e.getFirstName())
	       .forEach(System.out :: println);
	       
	       
	       System.out.println();
	       System.out.println("First 20 even numbers");
	       System.out.println("================================================================================");
	     
	       Stream<Integer> even_num = Stream.iterate(0,n -> n +2).limit(20);
	       even_num.forEach(System.out :: println);
	       
	       //random number
	       
	     System.out.println("Random numbers");
	     Stream<Double> random = Stream.generate(Math :: random).limit(10);
	     random.forEach(System.out :: println);
	     
	     System.out.println();
	     System.out.println("Words with character c but not d of length len");
	     System.out.println("================================================================================");
	     System.out.println("Count: "+ wordCount(words, 'c', 'd', 4));
	     
}
	}
