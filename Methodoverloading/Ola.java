class Ola
{
	public void send(int id)
	{
		System.out.println(id);
	}
	public void send(String name)
	{
		System.out.println(name);
	}
	public void send(String name,int id)
	{
		System.out.println(name +"  "+ id);
	}
	public void send(int id,String name)
	{
		System.out.println(id+"          "+name);
	}
	public static void main(String[] args) 
	{
		Ola o = new Ola();
		o.send(32);
		o.send("abhishekk");
		o.send("abhii",45);
		o.send(2,"upariii");
		
	}
}