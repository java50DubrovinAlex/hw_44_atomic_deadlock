package atomic;


public class RaceControllerAppl {

	public static void main(String[] args) throws InterruptedException {
		
		
		Race race = new Race(3, 3);
		Racer [] racers = new Racer[race.numbersOfRacer];
		for(int i = 0; i < race.numbersOfRacer;i++) {
			racers[i] = new Racer(race, i);
		}
		for(int i = 0; i < race.numbersOfRacer; i++) {
			racers[i].start();
		}
		for(int i = 0; i < race.numbersOfRacer;i++) {
			racers[i].join();
			
		}
		System.out.println("The winner is: " + race.checkWinner.get(0));

	}

}
