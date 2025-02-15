class Course 
{
	String Course_name;
	String unvr_name;
	double exm_cost;

	Course(String x,String y,double z)
	{
		Course_name = x;
		unvr_name = y;
		exm_cost = z;
	}
	public static void main(String[] args) 
	{
		Course c = new Course("MCA","VTU",2600.0);
		System.out.println(c.Course_name);
		System.out.println(c.unvr_name);
		System.out.println(c.exm_cost);
	}
}
