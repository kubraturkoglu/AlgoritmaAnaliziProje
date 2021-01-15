package applicationForAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class QuickSort {
	int partition(int array[], int low, int high) {
	    
	    // Select the pivot element
	    int pivot = array[high];
	    int i = (low - 1);

	    // Put the elements smaller than pivot on the left and 
	    // greater than pivot on the right of pivot
	    for (int j = low; j < high; j++) {
	      if (array[j] <= pivot) {
	        i++;
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	      }
	    }
	    int temp = array[i + 1];
	    array[i + 1] = array[high];
	    array[high] = temp;
	    return (i + 1);
	  }

	  void quickSort(int array[], int low, int high) {
	    if (low < high) {

	      // Select pivot position and put all the elements smaller 
	      // than pivot on left and greater than pivot on right
	      int pi = partition(array, low, high);
	      
	      // Sort the elements on the left of pivot
	      quickSort(array, low, pi - 1);

	      // Sort the elements on the right of pivot
	      quickSort(array, pi + 1, high);
	    }
	  }

	  // Driver code
	  public static void main(String args[]) {
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
	    QuickSort qs = new QuickSort();
	    qs.quickSort(dizi, 0, size - 1);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(dizi));
	  }
}
