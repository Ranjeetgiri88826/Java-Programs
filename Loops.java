import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // While loop
        System.out.print("How many time: ");
        int n = sc.nextInt();
        int num = 1;
        while(num<=n){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();

        // For loop

        for (int i = 0;i < n;i++){
            System.out.println("Hello world");
        }

        // do-while loop

        int i=0;
        do{
            System.out.println("Hello World!");
            i++;
        }while(i<=2);
    }
}
