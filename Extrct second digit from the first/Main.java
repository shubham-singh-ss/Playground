import java.util.Scanner;
import java.lang.*;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int c = n;
      int l = 0;
      while(n>0){
        l = l+1;
        n = n /10;
      }
      int a = c%10;
      int s = (int)Math.pow(10,l-2);
     
      int b = c/(s);
      int k = b%10;
      System.out.println(k);
	}
}