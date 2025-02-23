class sector
{
void area()
{
final double t=30.5; 
int r=5;
double res=0.5*r*r*t;
System.out.println(res);
}
public static void main(String[] args)
{
sector s1=new sector();
s1.area();
s1.area();
}
}