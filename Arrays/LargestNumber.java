
public class LargestNumber {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,6,4,5};
        System.out.println("The largest value is: "+getLargest(num));

    }
}
