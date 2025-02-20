class Ellipse_2classes
{
	static void area(double pi,int a,int b)
	{   
		double result=pi*a*b;
		System.out.println("area of Ellipse" + result);

}
}
class Ellipse_parameter_2classes
{
	public static void main(String[] args)
	{
		Ellipse_2classes.area(3.142,8,7);

}
}