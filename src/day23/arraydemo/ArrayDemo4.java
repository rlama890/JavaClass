package day23.arraydemo;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int [] arr = new int[]{4, 3, 8};
		
		int max = arr(0);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
//			sum = sum +arr[i];
			}
		}
		System.out.println("Largest element of an array: " + max);
	}

}
