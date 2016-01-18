package generalexcersie;

import java.util.ArrayList;

class Box<T>
	{
		public T t;
		public void add(T t)
		{
			this.t= t;
		}
		public T get(){
			return t;
		}
		
	}
public class Test {
	
	public static <E> void printarray(E[] arrayitems)
	{
		for(E elements:arrayitems)
		{
			System.out.print(elements);
		}
		
		//System.out.println();
	}
	
	
	public static <T extends Comparable<T> > T findmax(T x, T y, T z)
	{
		T max = x;
		if(y.compareTo(max) > 0)
			max = y;
		if(z.compareTo(max) > 0)
			max = z;
		
		return max;
	}

	public static void main(String[] args) {
		
		ArrayList <String> arr = new ArrayList<String>();
		arr.add("Name");
		arr.add("Age");
		arr.add("Gender");
		//arr.add(new Integer(10));
		
		String str1 = (String)arr.get(0);
		String str2 = (String)arr.get(1);
		//int str3 = (Integer)arr.get(3);
		
		//System.out.println(str1 +"," + str2 );
		
		Integer[] numbers = {1,2,3,4};
		printarray(numbers);
		
		String[] names = {"aa","bb","cc"};
		printarray(names);
		
		Double[] decimals = {1.2, 1.5, 3.6, 6.7};
		printarray(decimals);
		
		Character[] vowles = {'a', 'o','u','e','i'};
		printarray(vowles);
		
		System.out.printf("The max of %d, %d and %d is %d", 3,4,5, findmax(3,4,5));
		System.out.println();
		
		System.out.printf("The max of %.1f, %.1f and %.1f is %.1f", 3.6, 1.4, 5.7, findmax(3.6,1.4,5.7));
		System.out.println();
		
		System.out.printf("The max of %s, %s and %s is %s","hello", "Hi","Selam", findmax("hello","Hi","Selam"));
		System.out.println();
		
		Box<Integer> intvalues = new Box<Integer>();
		Box<String> stringval = new Box<String>();
		
		intvalues.add(new Integer(10));
		stringval.add(new String("Hello world"));
		
		System.out.println("Generic class test");
		System.out.printf("%d",intvalues.get());
		System.out.println();
		System.out.printf("%s", stringval.get());
		
	}

}
