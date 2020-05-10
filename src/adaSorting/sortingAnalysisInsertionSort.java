package adaSorting;

import java.util.Arrays;
import java.util.Scanner;

public class sortingAnalysisInsertionSort {
static int min = 1;
static int max = 1000;
static int swaps;
	void sort(int arrayOfRandomValues[]) {
		//int num = arrayOfRandomValues.length;
		  swaps = 0;
		for(int i = 1; i < arrayOfRandomValues.length ; ++i) {
			int keyElement = arrayOfRandomValues[i];
			int j = i - 1;
			while (j >= 0 && arrayOfRandomValues[j] > keyElement) {
				arrayOfRandomValues[j+1] = arrayOfRandomValues[j];
				j = j-1;
				swaps++;
			}
			arrayOfRandomValues[j+1] = keyElement;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter the size of an array : ");
		int arraySize = reader.nextInt();
		int[] arrayOfRandomValues = new int[arraySize];
		//int[] array = new int[10];
		
		for(int i = 0;i < arrayOfRandomValues.length;i++) {
			int randomValues = (int)(Math.random() * ((max - min) + 1) + min);
			arrayOfRandomValues[i] = randomValues;
			//System.out.println(arrayOfRandomValues[i]);
		}
		System.out.println("The original array is " + Arrays.toString(arrayOfRandomValues));
		sortingAnalysisInsertionSort insertionSort = new sortingAnalysisInsertionSort();
		int startTime = (int) System.currentTimeMillis();
		insertionSort.sort(arrayOfRandomValues);
		int endTime = (int) System.currentTimeMillis();
		int totalTime = endTime - startTime;
		int totalTimeInSecs = (totalTime/1000);
		System.out.println("The Sorted Array is " + Arrays.toString(arrayOfRandomValues));
		System.out.println("The time taken for the Insertion sort for Array of size " +arraySize+ " is " + totalTimeInSecs + " seconds");
		System.out.println("The total swaps made during sorting is " + swaps );
	}

}
