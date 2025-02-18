class Zomato
{
	void food()
	{
		System.out.println("food is taste");
	}
}

class Veg extends Zomato
{
	void food()
	{
		System.out.println("food quality not good");
	}
}
class Nonveg extends Zomato
{
	void food()
	{
		System.out.println("food quality is good");
	}
}

class Vegandnonveg extends Zomato
{
	void food()
	{
		System.out.println("tastetyyyyy");
	}
}
class Customer
{
	static void address(Zomato z1)
	{
		z1.food();
		
	}
}


class Main1
{
	public static void main(String[] args) 
	{
		Veg v1 = new Veg();
		Nonveg n1 = new Nonveg();
		Vegandnonveg g1 = new Vegandnonveg();

		Customer.address(v1);
		Customer.address(n1);
		Customer.address(g1);
	}
}
