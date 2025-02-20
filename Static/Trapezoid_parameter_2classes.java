class Trapezoid_2classes
{
	static void area(int a,int b,int h)
	{   
		int c=a+b;
		double result=1/2.0*c*h;
		System.out.println("area of Trapezoid" + result);

}
}
class Trapezoid_parameter_2classes
{
	public static void main(String[] args)
	{
		Trapezoid_2classes.area(4,8,7);

}
}