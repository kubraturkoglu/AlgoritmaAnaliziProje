package applicationForAlgorithm;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class LinearSearch {

	public int  sayi;
	public static int linearSearch(int array[], int x) {
		  int n = array.length;

		 
		  for (int i = 0; i < n; i++) {
		    if (array[i] == x)
		    return i;
		  }
		  return -1;
		  }

		  public static void main(String args[]) {
			  long beginTime = 0, endTime = 0;
			  beginTime = System.currentTimeMillis();
		   Scanner reader = new Scanner(System.in);
		   Random rand = new Random();
		   System.out.print("Dizinin eleman sayisini giriniz: ");
		  algoritmanalizi Algo = new algoritmanalizi();
		   int sayi =Algo.;
		   int[] array = new int[sayi+1];
	        
	        for (int i=0;i<sayi;i++) {
	        array[i]= 1+rand.nextInt(100);
	       System.out.println(array[i]) ;
	     
	       }
	        System.out.print("aradýðýnýz sayiyi giriniz: ");
		  int x = reader.nextInt();

		  int result = linearSearch(array, x);

		  if (result == -1)
		    System.out.print("Sayý bulunamadý");
		  else
		    System.out.println("Bulunan elemanýn indexi: " + result);
		  endTime = System.currentTimeMillis();
		    System.out.println("Çalýþma Süresi : " + ((double) (endTime - beginTime)) / 1000);
		  }
		}


