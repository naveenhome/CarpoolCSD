package playscrum.com.test;

import playscrum.com.main.EmptyArrarException;
import playscrum.com.main.Largest;
import junit.framework.TestCase;

public class TestLargest extends TestCase{
	
	public void testCase1() throws Throwable
	{
		int arr[]={3,5,7,9,4,2};
		Largest large = new Largest();
		assertEquals(9, large.find(arr));
	}
	public void testCase2() throws Throwable
	{
		int arr[]={3,5,7,8,4,2};
		Largest large = new Largest();
		assertEquals(8, large.find(arr));
	}
	public void testCase3() throws Throwable
	{
		int arr[]={-3,-5,-7,-8,-4,-2};
		Largest large = new Largest();
		assertEquals(-2, large.find(arr));
	}
	public void testCase4() throws Throwable
	{
		int arr[]={};
		Largest large = new Largest();
		try{
			int lenght = large.find(arr);
			fail("Exception");
		}catch (EmptyArrarException ex)
		{
			assertTrue(ex.getMessage(), true);
			System.out.print(ex.getMessage());
		}
		
	}



}
