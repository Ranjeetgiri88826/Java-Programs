public class subArray {
    public static void printSubArrays( int number[]) {
        int ts =0;
        for(int i = 0; i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the number of total subarray is: "+ts);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        printSubArrays(num);
    }
}
