package librarysystem;

import java.util.Date;

public class Loan {

	private Date check_Out_Date;
	private Date return_Date;
	private Member member;
	private ItemCopy itemcopy;
	
	public Loan(Date check_Out_Date, Date return_Date, Member member, ItemCopy itemcopy) {
		
		this.check_Out_Date = check_Out_Date;
		this.return_Date = return_Date;
		this.member = member;
		this.itemcopy = itemcopy;
	}
	
	
}
