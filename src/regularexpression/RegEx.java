package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class RegEx {

		public static String checkValidJavaIdentifier(String input) {

			String valid = "Valid Java identifier!";
			String invalid = "not valid java identifier";
			String pattern = "[a-zA-Z][a-zA-z_$]*";
			String reply = null;

			if (input.matches(pattern))
				reply = valid;
			else
				reply = invalid;

			return reply;

		}

		public static String checkValidEmail(String input) {

			String valid = "Valid Email address";
			String invalid = "Invalid email address";
			String pattern = "[a-zA-Z][a-zA-Z0-9_-$]*[.]{0,1}[a-zA-Z0-9_$]*[@][a-zA-Z]+[.][a-zA-Z]+";
			String reply = null;

			if (input.matches(pattern))
				reply = valid;
			else
				reply = invalid;

			return reply;
		}

		public static int coutOccurenceOfWord(String word, String pattern) {

			int totalCount = 0;

			Pattern pt = Pattern.compile(pattern);
			Matcher match = pt.matcher(word);
			while (match.find()) {
				totalCount++;
			}
			return totalCount;

		}

		public static void positionOfAWord(String word, String pattern) {

			Pattern pt = Pattern.compile(pattern);
			Matcher match = pt.matcher(word);
			while (match.find()) {

				System.out.println(word.substring(match.start(), match.end()) + " at Position " + match.start());
			}
		}

		public static String checkLicnsePlate(String plate) {

			String valid = "Valid license plate";
			String invalid = "Invalid license plate";
			String pattern = "[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}";
			String reply = null;
			if (plate.matches(pattern))
				reply = valid;
			else
				reply = invalid;

			return reply;
		}

		public static String replaceWord(String word, String pattern, String replace) {

			// Pattern pt = Pattern.compile(pattern);
			// Matcher match = pt.matcher(word);
			// String reply = match.replaceAll(replace);

			String reply = word.replaceAll(pattern, replace);

			return reply;
		}

		public static void main(String[] args) {

			System.out.println("Enter a java identifier to check if it is valid!");
			/*
			 * String input, email; while (true) { Scanner sci = new
			 * Scanner(System.in); input = sci.nextLine(); if (input.equals("s"))
			 * break; System.out.println(checkValidJavaIdentifier(input)); } while
			 * (true) { Scanner sc = new Scanner(System.in); email = sc.nextLine();
			 * if (email.equals("s")) break;
			 * System.out.println(checkValidEmail(email)); }
			 */

			Scanner sc = new Scanner(System.in);
			String counter = sc.nextLine();
			System.out.println(coutOccurenceOfWord(counter, "java"));

			// String pos = sc.next();
			positionOfAWord(counter, "java");

			System.out.println(checkLicnsePlate("AK9576kib"));
			System.out.println(replaceWord(counter, "8", "eight"));
		}

	
}
