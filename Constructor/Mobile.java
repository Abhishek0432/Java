class Mobile 
{
	String Mob_name;
	String Mob_col;
	double Mob_cost;

	Mobile(String a,String b,double c)
	{
		Mob_name=a;
		Mob_col=b;
		Mob_cost=c;
		
	}
	public static void main(String[] args) 
	{
		Mobile m = new Mobile("realme","blue",34000.0);

		System.out.println(m.Mob_name);
		System.out.println(m.Mob_col);
		System.out.println(m.Mob_cost);
	}
}
