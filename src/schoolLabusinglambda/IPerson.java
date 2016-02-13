package schoolLabusinglambda;

public interface IPerson
{
	default String myDefault()
	{
		return ("From default method:");
	}
	static String myStatic()
	{
		return ("From Static method:");
	}
	abstract void myAbstract();
	
}
