package concurrency;

public class L01threadDemo {
	public static void main(String[] args) {
		Task t1=new Task();
		Thread th=new Thread(t1);
		th.setName("A1");
		th.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		funccall();
		System.out.println(Thread.currentThread().getName()+":inside main method..");
	}

	private static void funccall() {
		System.out.println(Thread.currentThread().getName()+":inside function...");
		
	}
}
class Task implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":inside run methd in task....");
		go();
		
	}
	public void go()
	{
		System.out.println(Thread.currentThread().getName()+":inside task go method..");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		more();
	}
	private void more() {
		System.out.println(Thread.currentThread().getName()+":inside more method..");
		
	}
}
