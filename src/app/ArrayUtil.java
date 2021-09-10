package app;

public class ArrayUtil {

	public static Object[] reverse (Object[] array) {
		
		Object[] tmp = new Object[array.length];
		
		int i, j;
		
		for (i = array.length-1, j = 0; i >= 0; i--, j++) {
//			System.out.print(array[j] + " ");
			tmp[j] = array[i];
		}
		
//		System.out.println();
		
		for (i = 0; i < array.length; i++) {
			array[i] = tmp[i];
//			System.out.print(array[i] + " ");
		}
		return array;
	}
}
