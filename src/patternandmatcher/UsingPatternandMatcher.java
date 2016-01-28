package patternandmatcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class UsingPatternandMatcher {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			
			System.out.println("Select l for License Plate Number and r for Replace All Occurrence Of Eight ");
			System.out.println("\"License Plate Number\" OR \"Replace All Occurrence Of Eight\"");
			String input = in.nextLine();
			char temp = input.charAt(0);
			switch(temp){
			case 'l':
				licensePlateNumber();
				break;
			case 'r':
				replaceAllOccurrence();
				break;
			default:
				System.out.println("Try again: ");
			}	
			
		}

		private static void replaceAllOccurrence()
		{
			
			String   str;
	        Matcher  matcher;
	        str = JOptionPane.showInputDialog(null, "Identifier:");
	        matcher = Pattern.compile("8").matcher(str);
	        String replaced = matcher.replaceAll("eight");
	        JOptionPane.showMessageDialog(null, replaced );
		}

		private static void licensePlateNumber() {
			// TODO Auto-generated method stub
		    final String VALID_IDENTIFIER_PATTERN = "\\w{2}\\d{4}\\w{3}";

	        String   str;
	        Matcher  matcher;
	        Pattern  pattern = Pattern.compile(VALID_IDENTIFIER_PATTERN);
	        str = JOptionPane.showInputDialog(null, "Identifier:");
	        matcher = pattern.matcher(str);
	        if(matcher.matches())
	        {
	        	JOptionPane.showMessageDialog(null, "Valid License Plate Number ");
	        }else{
	        	JOptionPane.showMessageDialog(null, "Not a Valid License Plate Number ");
	        }
		}
		
		

	}


