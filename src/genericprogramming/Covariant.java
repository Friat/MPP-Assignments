package genericprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Covariant {
	
	public static <K, V> boolean compare(SimplePair<K, V> p1, SimplePair<K, V> p2) {

		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}

	public static Integer maxInt(List<Integer> lst) {

		Integer max = lst.get(0);
		for (Integer ints : lst) {
			if (ints.compareTo(max) > 0)
				max = ints;
		}
		return max;
	}

	public static <T extends Comparable<T>> T max(List<T> lst) {

		T max = lst.get(0);
		for (T tts : lst) {
			if (tts.compareTo(max) > 0)
				max = tts;
		}

		return max;

	}

	public static double sum(Collection<? extends Number> lsts) {

		double sum = 0.0;

		for (Number nums : lsts)
			sum += nums.doubleValue();
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ints = new ArrayList<Integer>();

		ints.add(12);
		ints.add(34);

		List<? extends Number> nums = ints;
		// nums.add(3.14);
		nums.add(null);
		System.out.println(nums);
		System.out.println(ints);
		// ArrayList<String>[] = new ArrayList<String>();
		SimplePair<Integer, String> p1 = new SimplePair(12, "Apple");
		SimplePair<Integer, String> p2 = new SimplePair(12, "Orange");

		System.out.println(Covariant.<Integer, String> compare(p1, p2));

		List<Number> nmbrs = new ArrayList<Number>();
		List<Integer> intss = Arrays.asList(1, 2, 4);
		List<Double> dbls = Arrays.asList(3.4, 5.4, 3.3);

		nmbrs.addAll(intss);
		nmbrs.addAll(dbls);

		System.out.println(nmbrs);

		System.out.println("Testing the super wild card!");

		List<? super Integer> lstInt = new ArrayList<>();

		lstInt.add(3);

		Object obj = lstInt.get(0);
		System.out.println("Get from super wild card: " + obj);

		List<Integer> intts = Arrays.asList(12, 45, 6, 7);
		System.out.println(sum(intts));

		List<Double> dls = Arrays.asList(3.5, 4.6, 7.0);
		System.out.println(sum(dls));

	}


}
