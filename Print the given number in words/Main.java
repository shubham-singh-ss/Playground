import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int a = sc.nextInt();
      if(a>5){
        System.out.println("Invalid");
      }
      else if(a == 1){
        System.out.println("One");
      }
      else if(a == 2){
        System.out.println("Two");
      }
      else if(a == 3){
        System.out.println("Three");
      }
      else if(a == 4){
        System.out.println("Four");
      }
      else if(a == 5){
        System.out.println("Five");
      }
        
	}
}