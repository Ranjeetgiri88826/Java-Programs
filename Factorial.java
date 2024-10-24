import java.util.*;
public class Factorial {
    static int factorial(int n){
        int fact=1;
        
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fac=factorial(num);
        System.out.println(factorial(fac));
    }
}