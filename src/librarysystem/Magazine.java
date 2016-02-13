package librarysystem;

public class Magazine extends Item {

	private int limit;
	private int issue;

	public Magazine(String title, boolean available, int limit, int issue) {
		super(title, available);
		this.limit = limit;
		this.issue = issue;
		// TODO Auto-generated constructor stub
	}

}