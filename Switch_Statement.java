import java.util.*;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of a : ");
        int b = sc.nextInt();
        System.out.println("Enter your choice: ");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulo or Remainder");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Addition is : "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction is : "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication is : "+(a*b));
                break;
            case 4:
                System.out.println("Division is : "+(a/b));
                break;
            case 5:
                System.out.println("Modulo or Remainder is : "+(a%b));
                break;
            default:
                System.out.println("Wrong Choice");
        }   
        
    }
}
