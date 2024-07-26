package codes;
  

class Animal{
	void animalsound() {
		System.out.println("The Animal Sounds :");
	}
}
class Dog extends Animal{
	void animalsound() {
		System.out.println("1-Dogs make Bow Bow sound.");
	}
}

class Cat extends Animal{
	void animalsound() {
		System.out.println("2-Cats make Meow sounds.");
	}
}

public class Car {
	public static void main(String[] args) {
		Animal myanimal=new Animal();
		myanimal.animalsound();
	    Animal mydog=new Dog();
	    mydog.animalsound();
	    Animal mycat=new Cat();
	    mycat.animalsound();
	}

}
