package enumandimmutableclass;

public final class Immutable
{
	private final int id = 984922;
	private final String name = "Friat";
	private final String phone = "4353635122";
	private final String SSN = "SSN1234";
	
	public int getid()
	{
		return id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	/*final variables in the Immutable Class cannot be set with a new value  
	 * 	public void setName(String name)
	{
		this.name = name;
	}
	*/
	
	public String getPhone()
	{
		return this.phone;
	}
	public String getSSN()
	{
		return this.SSN;
	}
	
	public static void main(String[] args)
	{
		Immutable obj = new Immutable();
		System.out.println("Name: "+ obj.getName());
		
	}

}
