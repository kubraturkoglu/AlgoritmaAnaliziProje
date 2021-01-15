package applicationForAlgorithm;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BinarySearch {
	int binarySearch(int array[], int x, int low, int high) {

	    if (high >= low) {
	      int mid =(low + (high - low) / 2) ;

	      // If found at mid, then return it
	      if (array[mid] == x)
	        return mid;

	      // Search the left half
	      if (array[mid] > x)
	        return binarySearch(array, x, low, mid - 1);

	      // Search the right half
	      return binarySearch(array, x, mid + 1, high);
	    }

	    return -1;
	  }

	  public static void main(String args[]) {
		  long beginTime = 0, endTime = 0;
		  beginTime = System.currentTimeMillis();
		  
		  Scanner reader = new Scanner(System.in);
		  // System.out.print("Dizi kaç basamaklý : ");
		   int sayi = reader.nextInt();
		   Random rand = new Random();
	        int[] dizi = new int[sayi+1];
	        
	        for (int i=0;i<sayi;i++) {
	        	dizi[i]= 1+rand.nextInt(50);
	        	System.out.print(" "+dizi[i] );
	        	}
	        Arrays.sort(dizi);
	        System.out.println(" ") ;
		    BinarySearch ob = new BinarySearch();
	    int n = sayi;
	   // System.out.print("Aranacak Sayýyý Girin: ");
		   int x = reader.nextInt();
	   
	    int result = ob.binarySearch(dizi, x, 0, n - 1);
	    if (result == -1)
	      System.out.println("Bulunamadý");
	    else
	      System.out.println("Bulunduðu index: " + result);
	    endTime = System.currentTimeMillis();
	    System.out.println("Çalýþma Süresi : " + ((double) (endTime - beginTime)) / 1000);
	  }
}
