package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		
		d3 = (int) Math.floor(Math.random() * 5)
						           // 0-5 integer
		return d3 + 1;                     // 1-6		
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.println(roll() + " ");
		}		
	}
}
