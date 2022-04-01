package abstractclasses;

public class Parrot extends bird {

	public Parrot(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(getName()+ " is flying");

	}

}
