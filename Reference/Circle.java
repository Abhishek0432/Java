class Circle 
{
	void area()
	{
		final double pi = 3.142;
		int r = 7;
		double res = pi*r*r;
		System.out.println(res);

	}
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		c1.area();
		
	}
}
