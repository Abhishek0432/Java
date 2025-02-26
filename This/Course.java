class Course 
{
	String c_name;
	String u_name;
	int e_cost;

	Course(String c_name,String u_name,int e_cost)
	{
		this.c_name=c_name;
		this.u_name=u_name;
		this.e_cost=e_cost;
	}
	public static void main(String[] args) 
	{
		Course c = new Course("mca","vtu",2600);
		System.out.println(c.c_name);
		System.out.println(c.u_name);
		System.out.println(c.e_cost);
	}
}
