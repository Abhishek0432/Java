class Phonepe
{
	void pay()
	{
		System.out.println("hiii giii");

	}
}

class Recharge extends Phonepe
{
	void pay()
	{
		System.out.println("hellooooo");

	}
}

class Booktrain extends Phonepe
{
	void pay()
	{
		System.out.println("brooooo");

	}
}

class Bookbus extends Phonepe
{
	void pay()
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
class Main7 
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

