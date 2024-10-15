import java.util.*;

class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax;
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        if (income<500000){
            tax=0;
            System.out.println("Your tax is: "+tax);
        }
        else if (income>=500000 && income<=1000000){
            tax = (int) (income*(0.2));
            System.out.println("Your tax is: "+tax);
        }
        else{
            tax = (int) (income*(0.3));
            System.out.println("Your tax is: "+tax);
        }
    }
}
