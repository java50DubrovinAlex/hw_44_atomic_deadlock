package atomic;
import java.util.ArrayList;

public class Race {
	int numbersOfRacer;
	int distance;
	ArrayList<Integer> checkWinner = new ArrayList<>();

	public void addToList(Object object) {
		checkWinner.add((Integer) object);
	}
	public Race(int numbersOfRacer,  int distance) {
		this.numbersOfRacer = numbersOfRacer;
		this.distance = distance;
	}
	
	public static int sleepTimer() {
		return (int) (Math.random() * (5 - 2 + 1) + 2);
	}
	}


