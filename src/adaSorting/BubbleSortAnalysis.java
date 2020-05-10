import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAnalysis {
	static int min = 1;
	static int max = 1000;
	static int swaps = 0;
	
	void bubbleSort(int arrayOfRandomValues[]) 
    {  
        for (int i = 0; i < arrayOfRandomValues.length-1; i++) 
            for (int j = 0; j < arrayOfRandomValues.length-i-1; j++) 
                if (arrayOfRandomValues[j] > arrayOfRandomValues[j+1]) 
                { 
                     
                    int temp = arrayOfRandomValues[j]; 
                    arrayOfRandomValues[j] = arrayOfRandomValues[j+1]; 
                    arrayOfRandomValues[j+1] = temp;
                    swaps++;
                } 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter the size of an array : ");
		int arraySize = reader.nextInt();
		int[] arrayOfRandomValues = new int[arraySize];
		//int[] array = new int[10];
		int startTime = (int) System.currentTimeMillis();
		for(int i = 0;i < arrayOfRandomValues.length;i++) {
			int randomValues = (int)(Math.random() * ((max - min) + 1) + min);
			arrayOfRandomValues[i] = randomValues;
			//System.out.println(arrayOfRandomValues[i]);
		}
		int endTime = (int) System.currentTimeMillis();
		System.out.println("The original array is " + Arrays.toString(arrayOfRandomValues));
		BubbleSortAnalysis bubbleSort = new BubbleSortAnalysis();
		System.out.println("The sorted array is " + Arrays.toString(arrayOfRandomValues));
		
		int totalTimeInSecs = (endTime - startTime)/1000;
		System.out.println("The total time taken for Bubble sort for sorting " + arraySize + " is " + totalTimeInSecs + " seconds" );
		System.out.println("The Total swaps made during the Bubble sort is " + swaps);
	}

}
