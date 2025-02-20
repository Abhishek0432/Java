class Ellipse_2classes
{
	static double area()
	{   
		double pi=3.142;
		int a=6;
		int b=3;
		double result=pi*a*b;
		return result;

}
}
class Ellipse_return_2classes
{
	public static void main(String[] args)
	{
		double y=Ellipse_2classes.area();
		System.out.println("area of Ellipse " + y);

}
}