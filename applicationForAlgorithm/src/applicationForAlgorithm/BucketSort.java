package applicationForAlgorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class BucketSort {
	public void bucketSort(int[] dizi, int n) {
	    if (n <= 0)
	      return;
	    @SuppressWarnings("unchecked")
	    ArrayList<Integer>[] bucket = new ArrayList[n];

	    // Create empty buckets
	    for (int i = 0; i < n; i++)
	      bucket[i] = new ArrayList<Integer>();

	    // Add elements into the buckets
	    for (int i = 0; i < n; i++) {
	      int bucketIndex = (int) dizi[i] * n;
	      bucket[bucketIndex].add(dizi[i]);
	    }

	    // Sort the elements of each bucket
	    for (int i = 0; i < n; i++) {
	      Collections.sort((bucket[i]));
	    }

	    // Get the sorted array
	    int index = 0;
	    for (int i = 0; i < n; i++) {
	      for (int j = 0, size = bucket[i].size(); j < size; j++) {
	        dizi[index++] = bucket[i].get(j);
	      }
	    }
	  }

	  // Driver code
	  public static void main(String[] args) {
		  long beginTime = 0, endTime = 0;
		  beginTime = System.currentTimeMillis();
		  
		  Scanner reader = new Scanner(System.in);
		  Random rand = new Random();
		   System.out.print("Bir Sayý Girin: ");
		   int sayi = reader.nextInt();
		   int[] dizi = new int[sayi+1];
		   for (int i=0;i<sayi;i++) {
		        dizi[i]= 1+rand.nextInt(100);
		       System.out.println(dizi[i]) ;
		     
		       }
	    BucketSort b = new BucketSort();
	   	    b.bucketSort(dizi,sayi);

	    for (int i : dizi)
	      System.out.print(i + "  ");
	    endTime = System.currentTimeMillis();
	    System.out.println("Çalýþma Süresi : " + ((double) (endTime - beginTime)) / 1000);
	  }
}
