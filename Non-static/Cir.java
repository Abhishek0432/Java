class Cir 
{
	void area()
	{
		final double pi = 3.142;
		int r = 5;
		double res = pi*r*r;
		System.out.println("area of circle:"+res);
	}
	public static void main(String[] args) 
	{
		new Cir().area();
	}
}
