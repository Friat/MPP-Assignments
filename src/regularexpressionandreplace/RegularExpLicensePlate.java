package regularexpressionandreplace;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RegularExpLicensePlate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
;		System.out.println("Select the first Later of What you want to do");
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
		}	
        	
	}
	
	static void licensePlateNumber()
	{
		String str;
	    final String VALID_IDENTIFIER_PATTERN = "\\w{2}\\d{4}\\w{3}";

        str = JOptionPane.showInputDialog(null, "Identifier:");
        if(str.matches(VALID_IDENTIFIER_PATTERN))
        {
        	JOptionPane.showMessageDialog(null, "Valid License Plate Number ");
        }
        else
        	JOptionPane.showMessageDialog(null, "Not a Valid License Plate Number ");
	}

	static void replaceAllOccurrence()
	{
		String str;	    

        str = JOptionPane.showInputDialog(null, "Identifier:");
        str = str.replaceAll("\\b8", "eight");
        JOptionPane.showMessageDialog(null, str.replaceAll("8", str));
	}
}
