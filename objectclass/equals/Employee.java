class Employee 
{
	int eid;
	String eName;
	Employee(int eid,String eName)
	{
		this.eid=eid;
		this.eName=eName;
	}
	public boolean equals(Object o)
	{
		Employee a = (Employee)o;
		return this.eName==a.eName;
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(2,"abhi");
		Employee e2 = new Employee(3,"abhi");
		System.out.println(e1.equals(e2));
	}
}







