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
interface Vehicle {}
class Car implements Vehicle {}

public class TestInterface {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v instanceof Car);     // true
        System.out.println(v instanceof Vehicle); // true
    }
}
