package applicationForAlgorithm;
import java.util.Scanner;
import java.util.Random;

public class MergeSort {
	
	void merge(int array[], int p, int q, int r) {

	    // Create L ← A[p..q] and M ← A[q+1..r]
	    int n1 = q - p + 1;
	    int n2 = r - q;

	    int L[] = new int[n1];
	    int M[] = new int[n2];

	    for (int i = 0; i < n1; i++)
	      L[i] = array[p + i];
	    for (int j = 0; j < n2; j++)
	      M[j] = array[q + 1 + j];

	    // Maintain current index of sub-arrays and main array
	    int i, j, k;
	    i = 0;
	    j = 0;
	    k = p;

	    // Until we reach either end of either L or M, pick larger among
	    // elements L and M and place them in the correct position at A[p..r]
	    while (i < n1 && j < n2) {
	      if (L[i] <= M[j]) {
	        array[k] = L[i];
	        i++;
	      } else {
	        array[k] = M[j];
	        j++;
	      }
	      k++;
	    }

	    // When we run out of elements in either L or M,
	    // pick up the remaining elements and put in A[p..r]
	    while (i < n1) {
	      array[k] = L[i];
	      i++;
	      k++;
	    }

	    while (j < n2) {
	      array[k] = M[j];
	      j++;
	      k++;
	    }
	  }

	  // Divide the array into two subarrays, sort them and merge them
	  void mergeSort(int arr[], int l, int r) {
	    if (l < r) {

	      // m is the point where the array is divided into two subarrays
	      int m = (l + r) / 2;

	      mergeSort(arr, l, m);
	      mergeSort(arr, m + 1, r);

	      // Merge the sorted subarrays
	      merge(arr, l, m, r);
	    }
	  }

	  // Print the array
	  static void printArray(int array[]) {
	    int n = array.length;
	    for (int i = 0; i < n; ++i)
	      System.out.print(array[i] + " ");
	    System.out.println();
	  }

	  // Driver program
	  public static void main(String args[]) {
		  long beginTime = 0, endTime = 0;
		  beginTime = System.currentTimeMillis();
		  Scanner reader = new Scanner(System.in);
		  Random rand = new Random();
		   System.out.print("Dizinin eleman sayisini giriniz: ");
		   int sayi = reader.nextInt();
		   int[] dizi = new int[sayi+1];
		   for (int i=0;i<sayi;i++) {
		        dizi[i]= 1+rand.nextInt(100);
		       System.out.println(dizi[i]) ;
		     
		       }
	  
	    MergeSort ob = new MergeSort();
	    ob.mergeSort(dizi, 0, dizi.length - 1);

	    System.out.println("Sorted array:");
	    printArray(dizi);
	    endTime = System.currentTimeMillis();
	    System.out.println("Çalışma Süresi : " + ((double) (endTime - beginTime)) / 1000);
	  }
}
