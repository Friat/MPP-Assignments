package lambdaexpressions;

import java.util.ArrayList;
//Program 4: ProcessingEmployees.java
//Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees

{
	public static List<String >wordCount(List<String> words, char c, char d, int len)
    {
		return
          words.stream()
         .filter(w -> w.contains(""+ c ))
         .filter(w -> !w.contains(""+ d))
         .filter(w -> w.length()== len)
         .collect(Collectors.toList());
         //.count();
		//return count;
		    
     }
	
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("AJames", "Indigo", 4700.77, "Marketing"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("AWendy", "Brown", 4236.4, "Marketing"),
         new Employee("shley", "Green", 7600, "IT"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("AWendy", "Bolt", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);
      
      
      // List of words
      
      List<String> words = new ArrayList<String>();
      words.add("celo");
      words.add("ciao");
      words.add("lelc");
      words.add("does");
      words.add("dcar");

      
      //String [] arrs =  (String[]) words.toArray();
     // System.out.println(arrs.toString());
      // display all Employees
      System.out.println("Complete Employee list:");
      System.out.println("==============================================================");
      list.stream().forEach( System.out::println);
      
      System.out.println();
      System.out.println("==============================================================");
      //Number of last Names that begins with the letter B
      System.out.println("Number of Last Name Starts with B");
           list.stream()
      	  .filter(e ->e.getLastName().startsWith("B"))
      	.map(e -> e.getLastName())
      	  .count();
          System.out.println( list.stream()
              	  .filter(e ->e.getLastName().startsWith("B"))
              	  .map(e -> e.getLastName())
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
        
       System.out.println(list.stream()
         .mapToDouble(e -> e.getSalary())
         .average().getAsDouble());
       
       System.out.println();
       System.out.println("Total salary of all employees Using reduce");
       System.out.println("================================================================================");  
       
      double total =  list.stream()
       .mapToDouble(e -> e.getSalary())
       .reduce(0,(x,y) -> x + y);
       
       System.out.println(total);
       

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
     
       // Predicate that returns true for salaries in the range $4000-$6000
      Predicate<Employee> fourToSixThousand = 
         e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
      // Display Employees with salaries in the range $4000-$6000
         // sorted into ascending order by salary
         System.out.printf(
            "%nEmployees earning $4000-$6000 per month sorted by salary:%n");
         list.stream()
             .filter(fourToSixThousand)
             .map(e -> e.getSalary())
             .sorted()
             .forEach(System.out::println);

         // Display first Employee with salary in the range $4000-$6000
         System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
            list.stream()
                .filter(fourToSixThousand)
                .findAny()
                .get());

         // Functions for getting first and last names from an Employee
         Function<Employee, String> byFirstName = Employee::getFirstName;
       //  Function<Employee, String> byLastName = Employee::getLastName;

         // Comparator for comparing Employees by first name then last name
         Comparator<Employee> lastThenFirst = 
            Comparator.comparing(byLastName).thenComparing(byFirstName);

         // sort employees by last name, then first name 
         System.out.printf(
                 "%nEmployees in ascending order by last name then first:%n");
              list.stream()
                  .sorted(lastThenFirst)
                  .forEach(System.out::println);

              // sort employees in descending order by last name, then first name
              System.out.printf(
                 "%nEmployees in descending order by last name then first:%n");
              list.stream()
                  .sorted(lastThenFirst.reversed())
                  .forEach(System.out::println);

              // display unique employee last names sorted
              System.out.printf("%nUnique employee last names:%n");
              list.stream()
                  .map(Employee::getLastName)
                  .sorted()
                  .distinct()
                  .forEach(System.out::println);

              // display only first and last names
              System.out.printf(
                 "%nEmployee names in order by last name then first name:%n"); 
              list.stream()
                  .sorted(lastThenFirst)
                  .map(Employee::getName)
                  .forEach(System.out::println);

              // group Employees by department
              System.out.printf("%nEmployees by department:%n"); 
              Map<String, List<Employee>> groupedByDepartment =
                 list.stream()
                     .collect(Collectors.groupingBy(Employee::getDepartment));
              groupedByDepartment.forEach(
                 (department, employeesInDepartment) -> 
                 {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                       employee -> System.out.printf("   %s%n", employee));
                 }
              );

              // count number of Employees in each department
              System.out.printf("%nCount of Employees by department:%n"); 
              Map<String, Long> employeeCountByDepartment =
                 list.stream()
                     .collect(Collectors.groupingBy(Employee::getDepartment, 
                        TreeMap::new, Collectors.counting()));
              employeeCountByDepartment.forEach((dept, count) -> System.out.printf("%s has %d employees",dept, count));
              

              // sum of Employee salaries with DoubleStream sum method
              System.out.printf(
                 "%nSum of Employees' salaries (via sum method): %.2f%n",
                 list.stream()
                     .mapToDouble(Employee::getSalary)
                     .sum());

              // calculate sum of Employee salaries with Stream reduce method
              System.out.printf(
                 "Sum of Employees' salaries (via reduce method): %.2f%n",
                 list.stream()
                     .mapToDouble(Employee::getSalary)
                     .reduce(0, (value1, value2) -> value1 + value2));  

              // average of Employee salaries with DoubleStream average method
              System.out.printf("Average of Employees' salaries: %.2f%n",
                 list.stream()
                     .mapToDouble(Employee::getSalary)
                     .average()
                     .getAsDouble()); 
              
              final Optional<String> foundName = list.stream()
            		  								.filter(name -> name.getFirstName().startsWith("A"))
            		  								.map(e -> e.getFirstName())
            		  								.findAny();
            		  								
             // System.out.println(foundName.toString());
              foundName.ifPresent(name-> System.out.println("Hello  "+ name));
             System.out.println(String.format("A name starts with A is %s :",foundName.orElse("Not Found")));
            		  								
              
              // first name
             // list.stream()
             //     .map(e -> e.getFirstName())
                  
             // Function<Employee, String>firstname = Employee::getFirstName;
              //Function<Employee, String>lastname2 = Employee::getLastName;
              //Concatnate First name and last name
              Stream<String> firstname = list.stream()
            		                         .map(Employee::getFirstName);
              
              System.out.println("Concatnation");
              Stream<String> lastname2 = list.stream()
            		                         .map(e -> e.getLastName());
              Stream<String> firstlast = Stream.concat(firstname,lastname2);
              firstlast.distinct()
              .forEach(System.out:: print);
                  
                 
            //sort by decreasing lengths of words
              System.out.println();
              System.out.println("Sort by Decreasing lenght of words");
              System.out.println();
              List<String> wordss = Arrays.asList("Tom", "Joseph", "Richard");
              		  	Stream<String> longestFirst 
                          = wordss.stream().sorted((String x, String y) -> 

              		          (new Integer(y.length()).compareTo(new Integer(x.length()))));  //show how this 
                                                       //works with a concrete example like  “hat” and “runner”

                       System.out.println(longestFirst.collect(Collectors.toList()));
              //output: Richard, Joseph, Tom

                     
           } // end main
        } // end class ProcessingEmployees

