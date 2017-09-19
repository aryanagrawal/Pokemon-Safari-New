package map;

import java.io.Serializable;
import java.util.Random;

public class IntRange implements Serializable {
	private int max;
	private int min;

	public IntRange(int minInput, int maxInput) {
		min = minInput;
		max = maxInput;
	}
	
	public int RandomRange(){
		Random random = new Random();
		return random.nextInt(max-min) + min;
		
	}
}
