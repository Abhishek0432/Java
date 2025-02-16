class Facebook
{
	public void send(int no)
	{
		System.out.println(no);
	}
	public void send(String message)
	{
		System.out.println(message);
	}
	public void send(String message,int no)
	{
		System.out.println(message+""+no);
	}
	public void send(int no,String message)
	{
		System.out.println(no+""+message);
	}
	public static void main(String[] args) 
	{
		Facebook f = new Facebook();
		f.send(32);
		f.send("abhishekk");
		f.send("abhii",45);
		f.send(2,"upariii");
		
	}
}