package psk.saks;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] fred = new int[] { 15, 123, 4, 19, 8 }; 
		System.out.println(findLargest(fred));
		System.out.println(findLargest(null));
	}

	/**
	 * Assume that array is unordered
	 * Will perform in O(n)
	 * @param arr the input array of integers
	 * @return largest element or integer min if input array is null
	 */
	static public int findLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		if (arr == null)
			return largest;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}
		
		return largest;
	}
}
