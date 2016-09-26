package terning;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		
		
		
		
		
	}
	
	@test
	public void test_roll(){
			
			Dice roll = new Dice();
			boolean x = false;
			int rollint = roll.roll();
			
			if(rollint >= 1 || rollint <= 6)
			x = true;
			
			assertEquals(true, x);
		}
		

}
