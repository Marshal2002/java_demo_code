package codes;

class Phones {
	String mbl = "Smart Phone Market";
	//int prices = 10000_15000;

	void list() {
		System.out.println(" Mobile Phone lists");
	}

}

class Iphone extends Phones {

	void price() {
		System.out.print("Iphone-");
		System.out.println("price: 40k");
	}

	void camera() {
		System.out.println("camera:Good");
	}
}

class Redmi extends Phones {
	void price() {
	System.out.print("Redmi-");
		System.out.println("price:30k");
	}

	void camera() {
		System.out.println("camera:Average");
	}
}

class vivo extends Phones {
	void price() {
		System.out.print("Vivo-");
		System.out.println("price:20k");
	}

	void camera() {
		System.out.println("camera:Poor");
	}
}

public class ClassesAndObject {
	public static void main(String[] args) {
		Phones x=new Phones();
		System.out.println(x.mbl);
		 x.list();
		Iphone apple = new Iphone();
		apple.price();
		apple.camera();
		
		Redmi mi = new Redmi();
		mi.price();
		mi.camera();
		
		vivo vi = new vivo();
		vi.price();
		vi.camera();
	}

}
