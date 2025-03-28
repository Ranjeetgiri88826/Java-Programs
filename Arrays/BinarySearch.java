public class BinarySearch {
    public static int Search(int number[],int key){
        int start = 0;
        int end = number.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            //comparision
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]==key){
                return mid;
            }if(number[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key =20;
        int index = Search(num, key);
        if (index==-1){
            System.out.println("The key is not found.");
        }else{
            System.out.println("Index for key is: "+Search(num, key));
        }
    }
}
