package lambdaexpressions;

import java.math.BigInteger;
import java.util.ArrayList;
//Program 1: IntStreamOperations.java  
//Demonstrating IntStream operations.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;  

public class IntStreamOperations
{
	public static Stream<Character> characterStream(String s){
		
		List<Character>chars = new ArrayList<Character>();
		for(Character c: s.toCharArray()){
			chars.add(c);
		}
		return 
				chars.stream();
		
	}
	
		public static void main(String[] args)
		{
		   int[] values = {3, 10,8};
		
		   // display original values
		  // System.out.print("Original values: ");
		  int sum = IntStream.of(values)
				              //.sum();
		                     .reduce(1,(x,y) -> x*y);
		            //.forEach(value -> System.out.printf("%d ", value));
		   System.out.println("Product: "+ sum);
		
		   // count, min, max, sum and average of the values
		   System.out.printf("%nCount: %d%n", IntStream.of(values).count());
		   System.out.printf("Min: %d%n", 
		      IntStream.of(values).min());
		   System.out.printf("Max: %d%n", 
		      IntStream.of(values).max().getAsInt());
		   System.out.printf("Sum: %d%n", IntStream.of(values).sum());
		   System.out.printf("Average: %.2f%n", 
		      IntStream.of(values).average().getAsDouble());
		   // sum of values with reduce method
		   System.out.printf("%nSum via reduce method: %d%n", 
		      IntStream.of(values)                      
		               .reduce(0, (x, y) -> x + y));
		   
		   // sum of squares of values with reduce method
		   System.out.printf("Sum of squares via reduce method: %d%n", 
		      IntStream.of(values)                   
		               .reduce(0, (x, y) -> x + y * y));
		   
		   // product of values with reduce method
		  // System.out.printf("Product via reduce method: %d%n", 
		     double result =  IntStream.of(values)
		              // .reduce(1, (x, y) -> x + y * x)
		               .average().getAsDouble();
		    // System.out.println("Result: "+result);
		               
		   
		   // even values displayed in sorted order
		   System.out.printf("%nEven values displayed in sorted order: "); 
		   IntStream.of(values)
		            .filter(value -> value % 2 == 0)
		            .sorted()
		            .forEach(value -> System.out.printf("%d ", value));
		            
		   System.out.println();
		
		   // odd values multiplied by 10 and displayed in sorted order
		   System.out.printf(
				   "Odd values multiplied by 10 displayed in sorted order: "); 
		   IntStream.of(values)
		            .filter(value -> value % 2 != 0)
		            .map(value -> value * 10)
		            .sorted()
		            .forEach(value -> System.out.printf("%d ", value));
		   System.out.println();
		
		   // sum range of integers from 1 to 10, exlusive
		   System.out.printf("%nSum of integers from 1 to 9: %d%n",
		      IntStream.range(1, 10).sum());
		
		   // sum range of integers from 1 to 10, inclusive
		   System.out.printf("Sum of integers from 1 to 10: %d%n",
		      IntStream.rangeClosed(1, 10)
		      .sum());
		   
		   Stream<Integer> naturalnum = Stream.iterate(0, n -> 1+ n).limit(10);
		   naturalnum.forEach(System.out::println);
		
		   // concatenating streams
		   Stream<Character> combined = Stream.concat(characterStream("Hello"),characterStream("World"));
		   System.out.println("Combined String: ");
		   combined.forEach(System.out::print);
		   
		   //System.out.println((characterStream("Hello").forEach(System.out::println)));
		   
		   List<Integer> ints = Arrays.asList(1,2,3,6);
		   List<int[]> intarrays = ints.stream()
				                      .map(int[]:: new)
				                      .collect(Collectors.toList());
		   System.out.println("intarrays:"+ intarrays);
		   List<String> strarray = intarrays.stream()
				   							.map(Arrays::toString)
				   							.collect(Collectors.toList());
		   System.out.println("Output: "+ strarray);
				   							
		   
		   // Stream to array
		   List<String> strlist = Arrays.asList("hello", "hi", "bye");
		   System.out.println("strList: "+strlist);
		   String[] straray = strlist.stream().toArray(String[]::new);
		   
		   System.out.println("straray: "+straray.toString());
		   
		   Stream<Character> flatresult = strlist.stream().flatMap(s -> characterStream(s));
		   System.out.println("flat result:");
		   //flatresult.collect(Collectors.toList());
		   flatresult.forEach(System.out:: print);
				                      
		} 
		} // end class IntStreamOperations
		
