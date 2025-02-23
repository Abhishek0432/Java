
class trapezoid2
{
static double area()
{
int a=4;
int b=7;
int h=8;
double res=0.5*(a+b)*h;
return(res);
}
public static void main(String[] args)
{
trapezoid t1=new trapezoid();
double x=t1.area();
System.out.println(x);
}
}