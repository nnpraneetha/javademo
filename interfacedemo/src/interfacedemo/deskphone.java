package interfacedemo;

public class deskphone implements ITelephone {
	
	@Override
	public void poweron() {
		System.out.println("always on");
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
