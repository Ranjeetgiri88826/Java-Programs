import java.util.*;

class Largest_of_3_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of third number: ");
        int c = sc.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("a is largest of 3");
            }
            else{
                System.out.println("c is largest of 3");
            }
            
        }
        else{
            if (b>c){
                System.out.println("b is largest of 3");
            }
            else{
                System.out.println("c is largest of 3");
            }
        }

    }
}
