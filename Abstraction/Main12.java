interface Phonepe
{
	void pay();
	
}

class Recharge implements Phonepe
{
	public void pay()
	{
		System.out.println("hellooooo");

	}
}

class Booktrain implements Phonepe
{
	public void pay()
	{
		System.out.println("brooooo");

	}
}

class Bookbus implements Phonepe
{
	public void pay()
	{
		System.out.println("hiii giii");

	}
}

class Users
{
	static void sends(Phonepe p)
	{
		p.pay();

	}
}
class Main12
{
	public static void main(String[] args) 
	{
		Recharge r = new Recharge();
		Booktrain b = new Booktrain();
		Bookbus d = new Bookbus();

		Users.sends(r);
		Users.sends(b);
		Users.sends(d);

		
	}
}

