package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import map.Map;
import map.MapSpaceException;

public class MapTests {

	@Test
	public void testMapPrint() {
		Map map = new Map(17, 0);
		System.out.println("zero rooms:");
		System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		System.out.println("1");
		
	}
	@Test
	public void testMap1Room() {
		Map map = new Map(50, 1);
		System.out.println("one room:");
		System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		System.out.println("2");
		
	}
	@Test
	public void testMap2Rooms() {
		Map map = new Map(40, 2);
		System.out.println("two rooms:");
		System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		System.out.println("3");
		
	}
	
	@Test
	public void testMap3Rooms() {
		Map map = new Map(40, 3);
		System.out.println("three rooms:");
		System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		System.out.println("5");
		
	}
	 
	
	@Test
	public void testHugeMap() {
		Map map = new Map(200, 25);
		System.out.println("fifteen rooms:");
		System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		System.out.println("6");
	}
	
	@Test
	public void testSetRoomSizesSmall() {
		Map map = new Map(200, 25, 5, 10);
		System.out.println("fifteen rooms:");
		System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		System.out.println("7");
		map.PlayerXStart();
		map.PlayerYStart();
		map.move(0, 1);
		map.move(0, -1);
		map.move(1, 0);
		map.move(-1, 0);
	}
	@Test
	public void testSetRoomSizesLarge() {
		Map map = new Map(200, 25, 30, 50);
		System.out.println("sizes large:");
	//	System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		
	}
	@Test (expected = MapSpaceException.class)
	public void testExceptionMapToSmall(){
		Map map = new Map(10, 1);
	}
	@Test(expected = MapSpaceException.class)
	public void testSetRoomSizesTooLarge() {
		Map map = new Map(200, 25, 200, 200);
		System.out.println("to large:");
		System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		
	}
	@Test(expected = MapSpaceException.class)
	public void testMaxLessThenMin() {
		Map map = new Map(204, 25, 200, 199);
		System.out.println("fifteen rooms:");
		System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		
	}
	@Test(expected = MapSpaceException.class)
	public void testMaxLessThenMinAndTooLarge() {
		Map map = new Map(200, 25, 200, 199);
		System.out.println("fifteen rooms:");
		System.out.println(map.toString());
		System.out.println("\n\n\n\n");
		
	}
	
	@Test
	public void testFun(){
		Map map = new Map(200, 25, 10, 30);
		System.out.println("Fun room:");
		System.out.println(map.toString());
		System.out.println(map.toStringView());
		System.out.println("\n\n\n\n");
		System.out.println("Fun");
	}
	

}
