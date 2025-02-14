interface Movies
{
	void watch();
	
}

class Kannada implements Movies
{
	public void watch()
	{
		System.out.println("hellooooo");

	}
}

class Telagu implements Movies
{
	public void watch()
	{
		System.out.println("brooooo");

	}
}

class Tamil implements Movies
{
	public void watch()
	{
		System.out.println("hiii giii");

	}
}

class All
{
	static void seen(Movies m)
	{
		m.watch();

	}
}
class Main11 
{
	public static void main(String[] args) 
	{
		Kannada k = new Kannada();
		Telagu t = new Telagu();
		Tamil v = new Tamil();

		All.seen(k);
		All.seen(t);
		All.seen(v);

		
	}
}

