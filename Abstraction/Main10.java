interface Flower
{
	void smell();

}

class  lilly implements Flower
{
	public void smell()
	{
		System.out.println("hellooooo");

	}
}

class rose implements Flower
{
	public void smell()
	{
		System.out.println("brooooo");

	}
}

class lotus implements Flower
{
	public void smell()
	{
		System.out.println("hiii giii");

	}
}

class Fragnance
{
	static void gam(Flower f)
	{
		f.smell();

	}
}
class Main10 
{
	public static void main(String[] args) 
	{
		lilly l = new lilly();
		rose r = new rose();
		lotus d = new lotus();
		
		Fragnance.gam(l);
		Fragnance.gam(r);
		Fragnance.gam(d);

		
	}
}
