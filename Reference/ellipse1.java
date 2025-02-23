
class ellipse1
{
void area(int a,int b)
{
final double pi=3.142;
double res=pi*a*b;
System.out.println(res);
}
public static void main(String[] args)
{
ellipse e1=new ellipse();
e1.area(3,4);
e1.area(3,5);
}
}