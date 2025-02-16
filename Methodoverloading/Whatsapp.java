class Whatsapp
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
		Whatsapp w = new Whatsapp();
		w.send(2);
		w.send("abhii");
		w.send("abhii",3);
		w.send(2,"abiiii");
		
	}
}
