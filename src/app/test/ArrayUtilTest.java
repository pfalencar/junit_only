package app.test;

import org.junit.Assert;
import org.junit.Test;

import app.ArrayUtil;

public class ArrayUtilTest {
	
	@Test
	public void testReverse() {
		Object[] array = {"A", "B", "C", "D"};
		
		Object[] arrayInvertido = ArrayUtil.reverse(array);
		
		Object[] expected = {"D", "C", "B", "A"};
		
		Assert.assertArrayEquals(expected, arrayInvertido);
	}

}
