class Sector_2class
{
	static double area()
	{   
		double t=30.5;
		int r=6;
		double result=1/2.0*t*r*r;
		return result;

}
}
class Sector_return_2Class
{
	public static void main(String[] args)
	{
		double y=Sector_2class.area();
		System.out.println("area of Sector " + y);

}
}