import java.util.*;
class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,sum=0;
        System.out.println("How much time: ");
        int n = sc.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("the value sun="+sum);
    }
}
