package applicationForAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class RadixSort {
	 void countingSort(int array[], int size, int place) {
		    int[] output = new int[size + 1];
		    int max = array[0];
		    for (int i = 1; i < size; i++) {
		      if (array[i] > max)
		        max = array[i];
		    }
		    int[] count = new int[max + 1];

		    for (int i = 0; i < max; ++i)
		      count[i] = 0;

		    // Calculate count of elements
		    for (int i = 0; i < size; i++)
		      count[(array[i] / place) % 10]++;

		    // Calculate cummulative count
		    for (int i = 1; i < 10; i++)
		      count[i] += count[i - 1];

		    // Place the elements in sorted order
		    for (int i = size - 1; i >= 0; i--) {
		      output[count[(array[i] / place) % 10] - 1] = array[i];
		      count[(array[i] / place) % 10]--;
		    }

		    for (int i = 0; i < size; i++)
		      array[i] = output[i];
		  }

		  // Function to get the largest element from an array
		  int getMax(int array[], int n) {
		    int max = array[0];
		    for (int i = 1; i < n; i++)
		      if (array[i] > max)
		        max = array[i];
		    return max;
		  }

		  // Main function to implement radix sort
		  void radixSort(int array[], int size) {
		    // Get maximum element
		    int max = getMax(array, size);

		    // Apply counting sort to sort elements based on place value.
		    for (int place = 1; max / place > 0; place *= 10)
		      countingSort(array, size, place);
		  }

		  // Driver code
		  public static void main(String args[]) {
			  long beginTime = 0, endTime = 0;
			  beginTime = System.currentTimeMillis();
			  Scanner reader = new Scanner(System.in);
			  Random rand = new Random();
			   System.out.print("Dizinin eleman sayýsýný girin: ");
			   int sayi = reader.nextInt();
			   int[] dizi = new int[sayi+1];
			   for (int i=0;i<sayi;i++) {
			        dizi[i]= 1+rand.nextInt(100);
			       System.out.println(dizi[i]) ;
			     
			       }
		 		    int size = dizi.length;
		    RadixSort rs = new RadixSort();
		    rs.radixSort(dizi, size);
		    System.out.println("Sýralanmýþ hali: ");
		    System.out.println(Arrays.toString(dizi));
		    endTime = System.currentTimeMillis();
		    System.out.println("Çalýþma Süresi : " + ((double) (endTime - beginTime)) / 1000);
		  }
}
