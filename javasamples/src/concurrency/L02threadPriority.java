package concurrency;

public class L02threadPriority {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+":main thread started");
		Thread t1=new Thread(new campaign());
		Thread t2=new Thread(new pollResearch());
		t1.setName("AdCampaign");
		t2.setName("PollResearch");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		try {
			t2.join(); //main thread suspended until t2 finishes
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+":main thread ended");

	}
}
class campaign implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
			if(i==5) {
				Thread.currentThread().yield(); //hint to scheduler that u r willing to wait
			}
		}
		
	}
	
}
class pollResearch implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}