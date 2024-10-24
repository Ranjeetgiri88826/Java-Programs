import java.util.*;
public class Functions {
// functions without parameters
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        return;
    }
// functions with parameters

    public static void sumOf(int x, int y) { //parameters of formal parameters
       int sum = x + y;
        System.out.print("Sum = "+sum);
        return;
    } 
    /*public static void sumOf(int x, int y) { //parameters of formal parameters
       int sum = x + y;
        return sum;
    }  */

    public static void main(String[] args) {
        // printHelloWorld(); //Function call
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a & b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOf(a,b); // Arguments or Actual parameters
        // int sum = sumOf(a,b);
        // System.out.print("Sum = "+sum);
    }
}
