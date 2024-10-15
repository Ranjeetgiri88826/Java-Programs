

public class Operators {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
    // (1). Arithmetic Operator
        // Binary Operators
        System.out.println("add="+(A+B));
        System.out.println("subtract="+(A-B));
        System.out.println("multiply="+(A*B));
        System.out.println("divide="+(A/B));
        System.out.println("remainder or modulo="+(A%B));
        // Unary Operators (Pre increment)
        System.out.println("**************************");
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        // Unary Operators (Post increment)
        System.out.println("**************************");
        int x = 5;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        // Unary Operators (Pre decrement)
        System.out.println("**************************");
        int p = 10;
        int q = ++a;
        System.out.println(p);
        System.out.println(q);
        // Unary Operators (Post decrement)
        System.out.println("**************************");
        int r = 5;
        int s = x++;
        System.out.println(r);
        System.out.println(s);
    // (2). Relational Operator
        System.out.println("**************************");
        int c = 20;
        int d = 15;
        System.out.println(c==d);// equal to
        System.out.println(c!=d);// not equal to
        System.out.println(c>d);// grater than
        System.out.println(c<d);// less than
        System.out.println(c>=d);// grater than equal
        System.out.println(c<=d);// less than equal
    // (3). Logical Operators
        System.out.println("**************************");
        System.out.println( (3>2) && (5>0));// logical AND
        System.out.println( (3<2) || (4>0));// logical OR
        System.out.println( !(3>2) );// logical NOT
    // (4). Assignment Operator
        System.out.println("**************************");
        int F = 16;
        int G=F;
        System.out.println(G);
        int C = 10;
        // C=C+10;
        C +=10;
        System.out.println(C);
        int D = 5;
        // D=D-2;
        D-=2;
        System.out.println(D);
        int E = 6;
        // E=E*3;
        E*=3;
        System.out.println(E);
        int H = 8;
        // H=H/4;
        H/=4;
        System.out.println(H);
        int I = 15;
        // I=I%5;
        I%=5;
        System.out.println(I);
    // Ternary Operator
        int number = 4;
        String type = ((number%2==0)?"even":"odd");
        System.out.println(type);
    }
}