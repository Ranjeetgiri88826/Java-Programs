import java.util.*;

class Conditional_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if-else statement
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is grater");
        }
        else{
            System.out.println("b is grater");
        }
        //else if statement
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("adult");
        }
        else if (age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult nor teenager ");
        }
    }
}
