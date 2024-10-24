public class Swaping_using_function {

    public static void swap(int a,int b){
        System.out.println("Before Swapping");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a, b);
    }
}
