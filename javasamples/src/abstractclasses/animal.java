package abstractclasses;

public abstract class animal {
	
	private String name;
	public animal(String name) {
		this.setName(name);
	}
	abstract void eat();
	abstract void breath();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
