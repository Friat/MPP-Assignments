package lambdaexpressions;

import java.util.stream.Collector;
import java.util.stream.Collectors;
//import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;
public class LambdaTest {

	public static void main(String[] args)
	{
		int [] numbers = {4,6,3,10,2,7};
		Integer[] nums = {3,5,7,1};
		System.out.println("Orginal Array: ");
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
		         .reduce(1, (x,y) -> x * y * x));
		
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
	} 
}
