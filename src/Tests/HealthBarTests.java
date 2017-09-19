package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.HealthBar;

public class HealthBarTests
{
	// Test Cases
	private HealthBar hp = new HealthBar(100);
	
	
	
	@Test
	public void testGetCurrentHP()
	{
		assertEquals(hp.getCurrentHP(), 100);
	}
	
	
	
	@Test
	public void testGetMaximumHP()
	{
		assertEquals(hp.getMaximumHP(), 100);
	}
	
	
	
	@Test
	public void testToString()
	{
		assertEquals(hp.toString(), "100 / 100");
	}
	
	
	
	@Test
	public void testSetCurrentHP()
	{
		hp.setCurrentHP(50);
		assertEquals(hp.getCurrentHP(), 50);
	}
	
	
	
	@Test
	public void testSetCurrentHP_BelowZero()
	{
		hp.setCurrentHP(-1);
		assertEquals(hp.getCurrentHP(), 0);
	}
	
	
	
	@Test
	public void testSetCurrentHP_AboveMax()
	{
		hp.setCurrentHP(101);
		assertEquals(hp.getCurrentHP(), 100);
	}
	
	
	
	@Test
	public void testSetCurrentHP_Zero()
	{
		hp.setCurrentHP(0);
		assertEquals(hp.getCurrentHP(), 0);
	}
	
} // HealthBarTests
