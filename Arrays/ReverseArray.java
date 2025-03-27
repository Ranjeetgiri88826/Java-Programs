
import java.util.Arrays;

public class ReverseArray {
    public static void Reverse(int number[]){
        int first = 0;
        int last = number.length-1;
        System.out.println("The original array is: "+Arrays.toString(number));
        while(first<last){
            int temp = number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
