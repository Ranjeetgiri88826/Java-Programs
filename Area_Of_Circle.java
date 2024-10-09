import java.util.*;

class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f,Area;
        System.out.print("Enter the raius of circle:");
        int r = sc.nextInt();
        Area = pi*r*r;
        System.out.println("The area of circle is:"+Area);
    }    
}
