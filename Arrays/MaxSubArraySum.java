public class MaxSubArraySum {

// Brute Force Algorithm

    public static void BruteForce(int number[]){
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

// Prefix Sum Algorithm

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

// Kadanse Algorithm

    public static void Kadanes(int number[]){
        int MaxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i<number.length;i++){
            currSum = currSum + number[i];
            if(currSum < 0){
                currSum = 0;
            }
            MaxSum = Math.max(currSum, MaxSum);
        }

        System.out.println("Maximum Sun Array is: " + MaxSum);
    }
    
    public static void main(String[] args) {
        
        // int arr[] = {1,-2,6,-1,3};
        // int arr[] = {1,-2,6,-1,3};
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // BruteForce(arr);
        // PrefixSum(arr);
        Kadanes(arr);
    }
}
