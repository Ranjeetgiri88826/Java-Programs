
import java.util.*;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        // while(n!=0){
        //     int rem = n%10;
        //     n/=10;
        //     System.out.print(rem);

        // }
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n/=10;
        }
        System.out.print(rev);
    }
}
