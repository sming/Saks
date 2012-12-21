package psk.saks;

public class SumArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumArray(new int[] { 1, 2, 4} ));
	}
	
	/**
	 * @param arr input array to sum up
	 * @return 0 if arr is null otherwise sum of all elements
	 */
	static public int sumArray(int[] arr) {
		if (arr == null)
			return 0;
		
		return sumArray(arr, 0);
	}

	static private int sumArray(int[] arr, int idx) {
		if (idx < arr.length)
			return arr[idx] + sumArray(arr, ++idx);
		
		return 0;
	}
}
