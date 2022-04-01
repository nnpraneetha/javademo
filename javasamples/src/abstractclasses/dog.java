package abstractclasses;

public class dog extends animal{

	public dog(String name) {
		super(name);
	}
	
	@Override
	void eat() {
		System.out.println(getName() +" is eating");
		
	}

	@Override
	void breath() {
		System.out.println("breathing....");
	}
		
}
