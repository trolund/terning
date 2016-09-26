package terning;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest 
{
	@Test
	public void TC01()
	{
			
			Dice roll = new Dice();
			boolean x = false;
			int rollint = roll.roll();
			
			if(rollint >= 1 && rollint <= 6)
			x = true;
			
			assertEquals(true, x);
	}
	
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
}
