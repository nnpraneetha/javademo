package abstractclasses;

public class testabstraction {
public static void main(String[] args) {
	animal a=new dog("doggy");
	a.eat();
	a.breath();
	
	bird b = new Parrot("Parrot");
	b.eat();
	b.fly();
	
}
}
