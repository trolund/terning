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
	public void TC02() 
	{
		//Skrevet af: Kasper Leiszner
		Dice dc = new Dice();
		
		int countOfOne = 0;
		int countOfTwo = 0;
		int countOfThree = 0;
		int countOfFour = 0;
		int countOfFive = 0;
		int countOfSix = 0;

		for (int i = 0; i < 60000; i++) 
		{
			switch(dc.roll())
			{
			case 1:
				countOfOne++;
				break;
			case 2:
				countOfTwo++;
				break;
			case 3:
				countOfThree++;
				break;
			case 4:
				countOfFour++;
				break;
			case 5:
				countOfFive++;
				break;
			case 6:
				countOfSix++;
				break;
			}
		}
		
		assertEquals(countOfOne, 10000, 400);
		assertEquals(countOfTwo, 10000, 400);
		assertEquals(countOfThree, 10000, 400);
		assertEquals(countOfFour, 10000, 400);
		assertEquals(countOfFive, 10000, 400);
		assertEquals(countOfSix, 10000, 400);
	}
}
