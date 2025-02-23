class Circle3 
{
	void area(int r)
	{
		final double pi = 3.142;
		double res = pi*r*r;

		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Circle3 c1 = new Circle3();
		c1.area(4);
	
	}
}
