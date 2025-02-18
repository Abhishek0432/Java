/*class Animal
{
	void m1()
	{
		System.out.println("Hello World!");
	}
}
class Dog extends Animal
{
	void m1()
	{
		System.out.println("Hello Worlddddddddd!");
	}
}
class Stimulator
{
	static void ansim(Animal a1)
	{
		if(a1 instanceof Animal)
		{

			a1.m1();
		}
	}
}
class Mainclasss
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		Stimulator.ansim(null);
		Stimulator.ansim(d1);
		
	}
}
*/ 
class Animal {}
class Dog extends Animal {}

public class TestInstanceof {
    public static void main(String[] args) {
        Animal a = new Dog(); // Dog is an Animal
        System.out.println(a instanceof Dog);    // true
        System.out.println(a instanceof Animal); // true
       System.out.println(a instanceof String); // false
    }
}

