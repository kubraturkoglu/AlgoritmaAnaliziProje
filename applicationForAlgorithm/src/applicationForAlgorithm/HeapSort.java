package applicationForAlgorithm;

import java.util.Random;
import java.util.Scanner;

public class HeapSort {
	public void sort(int array[]) {
	      int n = array.length;
	  
	      // Build max heap
	      for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(array, n, i);
	      }
	  
	      // Heap sort
	      for (int i = n - 1; i >= 0; i--) {
	        int temp = array[0];
	        array[0] = array[i];
	        array[i] = temp;
	  
	        // Heapify root element
	        heapify(array, i, 0);
	      }
	    }
	  
	    void heapify(int array[], int n, int i) {
	      // Find largest among root, left child and right child
	      int largest = i;
	      int l = 2 * i + 1;
	      int r = 2 * i + 2;
	  
	      if (l < n && array[l] > array[largest])
	        largest = l;
	  
	      if (r < n && array[r] > array[largest])
	        largest = r;
	  
	      // Swap and continue heapifying if root is not largest
	      if (largest != i) {
	        int swap = array[i];
	        array[i] = array[largest];
	        array[largest] = swap;
	  
	        heapify(array, n, largest);
	      }
	    }
	  
	    // Function to print an array
	    static void printArray(int arr[]) {
	      int n = arr.length;
	      for (int i = 0; i < n; ++i)
	        System.out.print(arr[i] + " ");
	      System.out.println();
	    }
	  
	    // Driver code
	    public static void main(String args[]) {
	    	 long beginTime = 0, endTime = 0;
			  beginTime = System.currentTimeMillis();
	    	 Scanner reader = new Scanner(System.in);
			  Random rand = new Random();
			   System.out.print("Dizinin eleman sayisýný giriniz: ");
			   int sayi = reader.nextInt();
			   int[] dizi = new int[sayi+1];
			   for (int i=0;i<sayi;i++) {
			        dizi[i]= 1+rand.nextInt(100);
			       System.out.println(dizi[i]) ;
			     
			       }
	     
	      HeapSort hs = new HeapSort();
	      hs.sort(dizi);
	  
	      System.out.println("Sorted array is");
	      printArray(dizi);
	      endTime = System.currentTimeMillis();
		    System.out.println("Çalýþma Süresi : " + ((double) (endTime - beginTime)) / 1000);
	    }
}
