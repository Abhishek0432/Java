class Employee 
{
	int eid;
	String eName;
	Employee(int eid,String eName)
	{
		this.eid=eid;
		this.eName=eName;
	}
	public String toString()
	{
		return eid+" "+eName;

	}  
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(4,"abhii");

		System.out.println(e1); //or System.out.println(e1.otString);
	//	System.out.println(e1.eName);
	}
}
