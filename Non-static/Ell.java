class Ell 
{
	void area()
	{
		final double pi = 3.142;
		int a = 3;
		int b = 4;
		double res = pi*a*b;
		System.out.println("area of ellipse:"+res);

	}
	public static void main(String[] args) 
	{
		new Ell().area();
	}
}
