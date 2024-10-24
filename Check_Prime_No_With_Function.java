import java.util.*;
public class Check_Prime_No_With_Function {

    // // only for n>=2
    // public static boolean isPrime(int n){
    //     // corner cases
    //     if (n==2){
    //         return true;
    //     }
    //     boolean isprime = true; // we can remove this line 
    //     for(int i =2;i<=(n-1);i++){
    //         if (n % i == 0){
    //             isprime=false; // we can write "return false" instead of this line
    //             break; // then not required to write this line.
    //         }
    //     }
    //     return isprime; // also write "return true " 
    // }

    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int n = sc.nextInt();
        System.out.println(" Your number is: "+isPrime(n));
    }
    
}
