public class Binomial_Cofficient {
    static int factorial(int n){
        int fact=1;
        
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    
    }

    public static int bino(int x,int y){
        int fact_x=factorial(x);
        int fact_y=factorial(y);
        int xmr=factorial(x-y);
        // for(int i=1;i<=x;i++){
        //     fact_x=fact_x*i;
        // }
        // for(int i=1;i<=y;i++){
        //     fact_y=fact_y*i;
        // }
        // for(int i=1;i<=x-y;i++){
        //     z=z*i;
        // }
        int binCoff = (fact_x)/((fact_y)*(xmr));
        return binCoff;
        
        
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println(bino(n,r));
    }
}
