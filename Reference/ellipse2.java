class ellipse2
{
static double area()
{
final double pi=3.142;
int a=7;
int b=8;
double res=pi*a*b;
return(res);
}
public static void main(String[] args)
{
ellipse e1=new ellipse();
double x=e1.area();
System.out.println(x);
}
}