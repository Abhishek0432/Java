class School 
{
	String Sch_name;
	String Sch_grade;
	int Sch_strength;

	School(String x,String y,int z)
	{
		Sch_name = x;
		Sch_grade = y;
		Sch_strength = z;
	}
	public static void main(String[] args) 
	{
		School s = new School("TMV","A+",132);
		System.out.println(s.Sch_name);
		System.out.println(s.Sch_grade);
		System.out.println(s.Sch_strength);

	}
}
