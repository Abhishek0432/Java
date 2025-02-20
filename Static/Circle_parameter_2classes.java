
class Circle_2classes
{
	static void area(double pi,int r)
	{
		double result=pi*r*r;
		System.out.println("area of circle " + result);

}
}
class Circle_parameter_2classes
{
	public static void main(String[] args)
	{
		Circle_2classes.area(3.142,5);

}
}