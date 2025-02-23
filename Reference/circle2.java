class circle2
{
static double area()
{
int r=5;
final double pi=3.142;
double res=pi*r*r;
return(res);
}
public static void main(String[] args)
{
circle c1=new circle();
double x=c1.area();
System.out.println(x);
}
}