

class trapezoid1
{
void area(int a,int b,int h)
{
double res=0.5*(a+b)*h;
System.out.println(res);
}
public static void main(String[] args)
{
trapezoid t1=new trapezoid();
t1.area(3,4,6);
t1.area(3,5,7);
}
}