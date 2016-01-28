package regularexpression;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import javax.swing.JOptionPane;

public class regextest {

	private static final String STOP = "STOP";
	private static final String VALID = "VALID IDENTIFIER";
	private static final String INVALID = "NOT VALID IDENTIFIER";
	
	private static final String VALID_IDENTIFIER_PATTERN = "[ab|cd|gh]";
			//"[a-z && ^a^b]";
			//"[a|ab]xyz";
			//"[A-Z][0-9]{3}[a-z]{4}";
			//"[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}";
	
	public static void main(String[] args)
	{
		String str, reply = null;
		Matcher matcher;
		Pattern pattern = Pattern.compile(VALID_IDENTIFIER_PATTERN);
		
		
		while(true)
		{
			str = JOptionPane.showInputDialog(null, "Identifier :");
			if(str.equals(STOP))
				break;
			matcher = pattern.matcher(str);
			if(matcher.matches())
			{
				reply = VALID;
			}
			else
				reply = INVALID;
			
			JOptionPane.showMessageDialog(null,str+ "\n"+ reply);
		}
		
		
	}
	
}
