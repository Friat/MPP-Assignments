package lambdaexpressions;

import java.util.stream.Collector;
import java.util.stream.Collectors;
//import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.Arrays;
public class LambdaTest {

	 interface consumer<String>{
		  public void accept(String s);
	  }
	public static void main(String[] args)
	{
		int [] numbers = {4,6,3,10,2,7};
		Integer[] nums = {3,5,7,1};
		System.out.println("Orginal Array: ");
		
		IntStream.of(numbers)
		         .forEach(number -> System.out.printf("%d ", number));
		
		//Count elements
	    System.out.printf("Count of the elements: %d ",IntStream.of(numbers).count());
	    System.out.println();
	    System.out.printf("average: %.2f", IntStream.of(numbers)
	             .average().getAsDouble());
	    
	    System.out.printf("Product via reduce method:%d %n",IntStream.of(numbers)
		         .reduce(1, (x,y) -> x * y ));
	    // filter even numbers and multiply by 10 , sort and output
	    IntStream.of(numbers)
	             .filter(value -> value % 2 == 0)
	             .map(value -> value * 10)
	             .sorted()
	             .forEach(value -> System.out.println(value));
	    
	    // adding numbers 1 to 9
	   System.out.printf("Sum: %d", IntStream.rangeClosed(1, 9).sum());
	   
	   //Changing array to list
	   System.out.println();
	  System.out.printf("Sorted > 4 List %s %n", Arrays.stream(nums)
			                                         .filter(n -> n > 4)
			                                         .sorted()
			                                         .collect(Collectors.toList()));
	/*  
	class MyBiFunction implements BiFunction<Integer, Integer, Integer>
	{

		@Override
		public Integer apply(Integer x, Integer y) 
		{
			return 2 * x - y;
			
		}
		
	}  
	  MyBiFunction f = new MyBiFunction();
	  System.out.println(f.apply(3,5));
	  
	  */
	  
	  
	  BiFunction<Integer, Integer, Integer> f = 
			                (x,y ) -> 2 * x - y;
      System.out.println("Result: "+f.apply(4, 6));
	  
	  
	  Consumer<String> s = new Consumer<String>()
	  {
		  public void accept(String s){
			  System.out.println(s);
		  }
	  };
	  s.accept("Hello");
	  	  
	  
	  
	  
	   //Arrays.asList(nums);
	   
		/*
		IntStream.of(numbers)
		         .forEach(number -> System.out.printf("%d ",number));
		System.out.printf("Display Count %d :", IntStream.of(numbers).count());
		System.out.printf("Min: %d",
				IntStream.of(numbers).min().getAsInt());
		System.out.println();
		System.out.printf("Max: %d",
				IntStream.of(numbers).max().getAsInt());
		System.out.printf("Average: %.2f",
				IntStream.of(numbers).average().getAsDouble());
		
		System.out.printf("Product via reduce method:%d %n",IntStream.of(numbers)
		         .reduce(1, (x,y) -> x * y ));
		
		System.out.println("");
		
		System.out.print("Sorted Even numbers: ");
		IntStream.of(numbers)
				 .filter(value -> value % 2 == 0)
				 .map(value -> value * 10)
				 .sorted()
				 .forEach(value -> System.out.printf("%d ", value));
		System.out.println();
		System.out.printf(" The sum of 1 to 9 is:  %d ", IntStream.rangeClosed(1,10).sum());
		
		System.out.printf("Change Array to List %s%n: ", Arrays.asList(nums));
		//System.out.printf("Original values: %s%n", Arrays.asList(nums));
		System.out.printf("Sorted nums %s%n ",Arrays.stream(nums)
				                                      //.filter(value -> value > 4)
				                                      .sorted()
				                                      .collect(Collectors.toList()));
		List<Integer> greaterthanfour = Arrays.stream(nums)
											   .filter(value -> value > 4)
											   .sorted()
											   .collect(Collectors.toList());
											    
		System.out.printf("Sorted greater than 4 nums %s%n ",greaterthanfour);
		
		System.out.println("Array of Strings: ");
		Stream<String> stream = Stream.generate(() -> "test").limit(10);
		String[] strarr = stream.toArray(String[] :: new);
		System.out.println(Arrays.toString(strarr));
		
		// stream method from APIs
		System.out.println("Words Splited from sentence");
		String sentence = "Program creek is a Java site.";
		Stream<String> wordStream = Pattern.compile("\\W").splitAsStream(sentence);
		String[] wordArr = wordStream.toArray(String[]::new);
		System.out.println(Arrays.toString(wordArr));
		*/
	} 
}
