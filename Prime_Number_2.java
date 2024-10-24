import java.util.*;
public class Prime_Number_2 {

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

    public static void PrimeInRange(int n){
        for(int i=2;i<=n;i++){
            if (isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. :");
        int n=sc.nextInt();
        PrimeInRange(n);
    }
}