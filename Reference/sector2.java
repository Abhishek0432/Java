
class sector2
{
static double area()
{
final double t=30.5;
int r=8;
double res=0.5*r*r*t;
return(res);
}
public static void main(String[] args)
{
sector s1=new sector();
double x=s1.area();
System.out.println(x);
}
}