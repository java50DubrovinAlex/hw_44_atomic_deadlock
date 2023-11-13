package deadlock;

public class Start {
	

	public static void main(String[] args) {
		Object lock1 = new Object();
        Object lock2 = new Object();
        
        Run thread1 =  new Run(lock1, lock2);
        Run thread2 =  new Run(lock2, lock1);
        
        thread1.start();
        thread2.start();
	}

}
