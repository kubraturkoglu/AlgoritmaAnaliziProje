package applicationForAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class InsertionSort {
	 void insertionSort(int array[]) {
		    int size = array.length;

		    for (int step = 1; step < size; step++) {
		      int key = array[step];
		      int j = step - 1;

		      while (j >= 0 && key < array[j]) {
		        array[j + 1] = array[j];
		        --j;
		      }

		    
		      array[j + 1] = key;
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
		    InsertionSort is = new InsertionSort();
		    is.insertionSort(dizi);
		    System.out.println("Dizinin sýralanmýþ hali:");
		    System.out.println(Arrays.toString(dizi));
		    endTime = System.currentTimeMillis();
		    System.out.println("Çalýþma Süresi : " + ((double) (endTime - beginTime)) / 1000);
		  }
}
