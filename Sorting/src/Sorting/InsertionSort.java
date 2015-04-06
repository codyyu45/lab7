package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		for (int i = 1; i < unsortedArray.length - 1; i++){
			int x = unsortedArray[i];
			int j = i;
			while (j > 0 && unsortedArray[j-1] > x){
				unsortedArray[j] = unsortedArray[j-1];
				j--;
			}
			unsortedArray[j] = x;
		}
		return unsortedArray;
	}
}
