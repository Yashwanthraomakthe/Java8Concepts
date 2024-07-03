package lambda_Expressions_Task01;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Numbers from child thread" + i);
		}

	}

}

public class RunnableInterface_04 {

	public static void main(String[] args) {
		/*
		 * MyThread r = new MyThread(); in lambda expression we can skipp this and can
		 * provide run SAM in Runnable interface as shown below
		 * so that above run() method implementation from MyThread class will not executed.
		 */

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Numbers from child thread" + i);
			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Numbers from main thread" + i);
		}

	}

}
