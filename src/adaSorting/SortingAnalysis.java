package adaSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAnalysis {
	static int min = 1;
	static int max = 1000;
	static int range = max-min +1;
	
public void mergeSort(int arrayOfRandomValues[],int left,int middle, int right) {
	
	//int arraySize1,arraySize2,left=1,right=10,middle=5;
	//int leftArray, rightArray;	
	//Finding the size of two subarrays
		int arraySize1 = middle - left + 1;
		int arraySize2 = right - middle;
		//Creating two subarrays
		int leftArray[] = new int[arraySize1];
		int rightArray[] = new int[arraySize2];
		
		for (int i=0; i<arraySize1; ++i) 
			leftArray[i] = arrayOfRandomValues[left + i]; 
        for (int j=0; j<arraySize2; ++j) 
        	rightArray[j] = arrayOfRandomValues[middle + 1+ j]; 
        
        int i = 0,j=0;
        int k=left;
        while(arraySize1 > i && arraySize2 > j) {
        	 if (leftArray[i] <= rightArray[j]) 
             { 
        		 arrayOfRandomValues[k] = leftArray[i]; 
                 i++; 
             } 
             else
             { 
            	 arrayOfRandomValues[k] = rightArray[j]; 
                 j++; 
             } 
             k++; 
         }
        while (i < arraySize1) 
        { 
        	arrayOfRandomValues[k] = leftArray[i]; 
            i++; 
            k++; 
        } 
  
       
        while (j < arraySize2) 
        { 
        	arrayOfRandomValues[k] = rightArray[j]; 
            j++; 
            k++;
        
        }  
        
}
void sort(int arrayOfRandomValues[], int left, int right) 
{ 
    if (left < right) 
    { 
        // Find the middle point 
        int middle = (left+right)/2; 

        // Sort first and second halves 
        sort(arrayOfRandomValues, left, middle); 
        sort(arrayOfRandomValues , middle+1, right); 

        // Merge the sorted halves 
        mergeSort(arrayOfRandomValues, left, middle, right); 
        
    } 
} 	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array[] = int [];
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter the size of an array : ");
		int arraySize = reader.nextInt();
		int[] arrayOfRandomValues = new int[arraySize];
		
		for(int i = 0;i < arrayOfRandomValues.length;i++) {
			int randomValues = (int)(Math.random() * ((max - min) + 1) + min);
			arrayOfRandomValues[i] = randomValues;
			//System.out.println(arrayOfRandomValues[i]);
		}
		System.out.println("The original array is " + Arrays.toString(arrayOfRandomValues) );
			
			SortingAnalysis sortAnalysis = new SortingAnalysis();
			long startingTime = System.currentTimeMillis();
			sortAnalysis.sort(arrayOfRandomValues, 0, arrayOfRandomValues.length-1);
			long endingTime = System.currentTimeMillis();
			System.out.println("Sorted Array is " + Arrays.toString(arrayOfRandomValues));	
			long totalTimeTaken = endingTime - startingTime;
			long totalTimeTakenInSeconds = (totalTimeTaken/1000);
			System.out.println("Total time taken for Merge sort for Array size " + arraySize + " is : " + totalTimeTakenInSeconds + " seconds");
			/*int left;
			int right;
			int[] array;
			sortAnalysis.sort(array, left, right);*/
			
	}

}
