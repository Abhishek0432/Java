
class Triangle_2classes
{
	static void area(double b,int h)
	{
		double result=1/2.0*b*h;
		System.out.println("area of Triangle " + result);

}
}
class Triangle_parameter_2classes
{
	public static void main(String[] args)
	{
		Triangle_2classes.area(2.5,5);

}
}