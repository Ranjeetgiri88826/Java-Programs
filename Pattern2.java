class AdvPatterns {
    public static void Rec(int row,int cols){
        for(int i = 1;i<=row;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || i== row || j==1 || j== cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

    public static void InvertedHlfPyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void InvertedRotatedHalfPyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void FloydsTringle(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void ZeroOneTringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n){
        //1st Half
        for(int i = 1;i<=n;i++){
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2(n-i)
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for(int i = n;i>=1;i--){
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2(n-i)
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void SolidRhombus(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=n;j++){
                if(i==1 || i== n || j==1 || j== n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Dimond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Pattern2{
    public static void main(String[] args) {
        AdvPatterns p = new AdvPatterns();
        // p.Rec(4, 5);
        // p.InvertedHlfPyramid(5);
        // p.InvertedRotatedHalfPyramid(5);
        // p.FloydsTringle(5);
        // p.ZeroOneTringle(5);
        // p.Butterfly(4);
        // p.SolidRhombus(5);
        // p.HollowRhombus(5);
        p.Dimond(4);
    }
}
    
