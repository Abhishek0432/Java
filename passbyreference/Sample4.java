
class Sample4
{
	public static void main(String[] args) 
	{
		Sample4 s1 = new Sample4();
		System.out.println(s1.a);
		m1(s1);
		m2(s1);
	}
	int a = 40;
	static void m1(Sample4 s2)
	{
		int d = s2.a+s2.a;
		System.out.println(d);
	}
	static void m2(Sample4 s2)
	{
		int f = s2.a*s2.a;
		System.out.println(f);
	}
}
