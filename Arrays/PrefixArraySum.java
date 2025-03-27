
// Prefix Sum Algorithm

public class PrefixArraySum {
    public static void PrefixSum(int number[]){
        // int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        // calculate prifix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+ number[i];
        }

        for(int i = 0; i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                int currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("the Maximum Sum is: "+ maxSum);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        PrefixSum(arr);
    }
}
