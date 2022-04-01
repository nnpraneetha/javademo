package abstractclasses;

public abstract class bird extends animal{

	public bird(String name) {
		super(name);
	}

	@Override
	void eat() {
		System.out.println(getName()+" is eating");
		
	}

	@Override
	void breath() {
		System.out.println(getName() + "is breathing");
		
	}
	
	public abstract void fly();

}
