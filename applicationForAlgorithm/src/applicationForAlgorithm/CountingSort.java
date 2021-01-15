package applicationForAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class CountingSort {
	 void countSort(int array[], int size) {
		    int[] output = new int[size + 1];

		    // Find the largest element of the array
		    int max = array[0];
		    for (int i = 1; i < size; i++) {
		      if (array[i] > max)
		        max = array[i];
		    }
		    int[] count = new int[max + 1];

		    // Initialize count array with all zeros.
		    for (int i = 0; i < max; ++i) {
		      count[i] = 0;
		    }

		    // Store the count of each element
		    for (int i = 0; i < size; i++) {
		      count[array[i]]++;
		    }

		    // Store the cummulative count of each array
		    for (int i = 1; i <= max; i++) {
		      count[i] += count[i - 1];
		    }

		    // Find the index of each element of the original array in count array, and
		    // place the elements in output array
		    for (int i = size - 1; i >= 0; i--) {
		      output[count[array[i]] - 1] = array[i];
		      count[array[i]]--;
		    }

		    // Copy the sorted elements into original array
		    for (int i = 0; i < size; i++) {
		      array[i] = output[i];
		    }
		  }

		  // Driver code
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
		     int size = dizi.length;
		    CountingSort cs = new CountingSort();
		    cs.countSort(dizi, size);
		    System.out.println("Sorted Array in Ascending Order: ");
		    System.out.println(Arrays.toString(dizi));
		    endTime = System.currentTimeMillis();
		    System.out.println("Çalýþma Süresi : " + ((double) (endTime - beginTime)) / 1000);
		  }
}
