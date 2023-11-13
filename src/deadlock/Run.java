package deadlock;

public class  Run extends Thread {
	private  Object resourse1;
    private  Object resourse2;
	
	
	public Run(Object resourse1, Object resourse2) {
		this.resourse1 = resourse1;
		this.resourse2 = resourse2;
	}


	@Override
	public void run() {
		synchronized (resourse1) {
			System.out.println(currentThread().getName() + "hold" + resourse1);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread().getName() + "waiting for" + resourse2);
			synchronized (resourse2) {
				System.out.println(currentThread().getName() + ": Holding " + resourse1 + " and " + resourse2);
			}
		}
	}
	
	

}
