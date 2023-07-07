import java.util.*;

class Animal
{
	public void makeSound()
	{
		System.out.println("sounds of animals");
	}

}

class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("DOF barks bhuuu bhuuu");
	}
}


class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("cat meooo meooo");
	}
}

public class AnimalsVoice
{
	public static void main(String args[])
	{
		Animal d1=new Dog();
		Animal c1=new Cat();
		d1.makeSound();
		c1.makeSound();

	}
}
