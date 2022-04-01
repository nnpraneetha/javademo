package interfacedemo;

public class mobilephone implements ITelephone {

	@Override
	public void poweron() {
		System.out.println("powering on mobilephone");
		
	}

	@Override
	public void dail(int pno) {
		System.out.println("dailing");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
	}

}
