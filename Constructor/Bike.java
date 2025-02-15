class Bike 
{
	double Bike_cost;
	String Bike_name;
	String Bike_color;

	Bike(double a,String b,String c)
	{
		Bike_cost=a;
		Bike_name=b;
		Bike_color=c;

	}
	public static void main(String[] args) 
	{
		Bike b = new Bike(230000.0,"himalayan","black");
		System.out.println(b.Bike_cost);
		System.out.println(b.Bike_name);
		System.out.println(b.Bike_color);
	}
}
