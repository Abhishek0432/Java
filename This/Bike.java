class Bike 
{
	int B_cost;
	String B_color;
	String B_name;

	Bike(int B_cost,String B_color,String B_name)
	{
		this.B_cost=B_cost;
		this.B_color=B_color;
		this.B_name=B_name;
	}
	public static void main(String[] args) 
	{
		Bike b = new Bike(50000,"black","himalayan");
		System.out.println(b.B_cost);
		System.out.println(b.B_color);
		System.out.println(b.B_name);
	}
}
