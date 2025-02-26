class Mobile 
{
	String M_name;
	double M_cost;
	String M_color;

	Mobile(String M_name,double M_cost,String M_color)
	{
		this.M_name = M_name;
		this.M_cost=M_cost;
		this.M_color=M_color;
	}
	public static void main(String[] args) 
	{
		Mobile m = new Mobile("sony",23000.0,"blue");
		System.out.println(m.M_name);
		System.out.println(m.M_cost);
		System.out.println(m.M_color);
	}
}
