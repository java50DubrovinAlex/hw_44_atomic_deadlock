package atomic;
import java.util.concurrent.atomic.AtomicInteger;

public class Racer extends Thread{
	private Race race;
	private int racerNumber; 
	static int sleepMin = 2;
	static int sleepMax = 5;
	AtomicInteger winner = new AtomicInteger();
	public Racer(Race race, int racerNumber) {
		this.race = race;
		this.racerNumber = racerNumber;
		
	}
	public int getRacerNumber() {
		return racerNumber;
	}
	public static int sleepTimer() {
		return (int) (Math.random() * (sleepMax - sleepMin + 1) + sleepMin);
	}
	@Override
	public void run() {
		for(int i = 0; i < race.distance;i++) {
			try {
				
				sleep(sleepTimer());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(racerNumber);
			
		}
		
			race.checkWinner.add(winner.addAndGet(racerNumber));
		
		
		
		}
	}


