interface Zomato
{
	void food();
}
class Veg implements Zomato
{
	public void food()
	{
		System.out.println("Hiii");
	}
}

class NonVeg implements Zomato
{
	public void food()
	{
		System.out.println("Hiiiiiiiii");
	}
}

class Nonandveg implements Zomato
{
	 public void food()
	{
		System.out.println("Hiiiiiiiii");
	}
}
 class Customer
 {
	 static void address(Zomato z1)
	 {
		 z1.food();
	 }
 }


class Mainclass8 
{
	public static void main(String[] args) 
	{
		Veg v1 = new Veg();
		NonVeg n1 = new NonVeg();
		Nonandveg g1 = new Nonandveg();
		Customer.address(v1);
		Customer.address(n1);
		Customer.address(g1);


	}
}
