package interfacedemo;

public class testinterface {
public static void main(String[] args) {
	ITelephone tele=new mobilephone();
	tele.poweron();
	ITelephone t=new deskphone();
	t.poweron();
}
}
