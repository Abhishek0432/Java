class Stu 
{
	int sid;
	String sname;
	Stu(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	public static void main(String[] args) 
	{
		Stu s = new Stu(3,"abhi");
		System.out.println(s.sid);
		System.out.println(s.sname);
	}
}
