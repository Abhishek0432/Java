class Whatsapp1 
{
	void send(int no);
	{
		System.out.println(no);

	}
	void send(String msg)
	{
		System.out.println(msg);
	}
	void send(int no,String msg)
	{
		System.out.println(no+"  "+msg);
	}

	void send(String msg,int no)
	{
		System.out.println(msg+"  "+no);
	}
	public static void main(String[]args)
	{
		Whatsapp1 w = new Whatsapp1();
		w.send(4);
		w.send("hiiiii",56);
		w.send(44,"gtgt");
		w.send("bhushan");
	}
}

