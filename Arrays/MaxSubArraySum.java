
// Brute Force Algorithm

class MaxSubArraySum {
    public static void MaxSubArray(int number[]){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                int currSum =0;
                for(int k=start;k<=end;k++){
                    //subarray sum
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("the Maximum Sum is: "+ maxSum);
    }
    
    public static void main(String[] args) {
        // int arr[] = {2,4,6,8,10};
        int arr[] = {1,-2,6,-1,3};
        MaxSubArray(arr);
    }
}
