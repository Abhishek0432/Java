class Whatsapp
{
	void chat()
	{
		System.out.println("hiiiiii");
	}
}

class user1 extends Whatsapp
{
	void chat()
	{
		System.out.println("hiiiiii dingiii");
	}
}

class user2 extends Whatsapp
{
	void chat()
	{
		System.out.println("helloooo dingaaaa");
	}
}

class  user3 extends Whatsapp
{
	void chat()
	{
		System.out.println("hiiiiii");
	}
}

class Users
{
	static void use(Whatsapp w)
	{
		w.chat();
	}
}

class Main2
{
	public static void main(String[] args) 
	{

		user1 q = new user1();
		user2 e = new user2();
		user3 r = new user3();

		Users.use(q);
		Users.use(e);
		Users.use(r);
		
	}
}
