import java.util.Scanner; 

public class Factorial {     

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Input a number: ");
        int a = scan.nextInt();
    try {
            System.out.print("The factorial of " + a + " is: " + factorial(a));
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid Input: " + e.getMessage());
    }
  }  
  // the beginning of this function
    public static int factorial(int a) { // we use "int" to return the resulting factorial number    
    // base case - tells the program to stop running if this is satisfied  
        if (a < 0) {
        throw new IllegalArgumentException("The input should be greater than 0");
    } else if(a == 1) { 
            return 1; 
        } else {
    // recursive step - calls itself over and over until the data satisfies the base case
            return a * factorial(a - 1);
        }
    }
}  
