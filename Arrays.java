

public class Arrays {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {

        // //creating an arrays
        // int marks[] = new int[50];
        // int number[] = {5,4,3};
        // String fruitsp[] = {"apple","mango"};

        // //taking inputs in arrays
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // // output in arrays
        // System.out.println("Phy: "+marks[0]);
        // System.out.println("Che: "+marks[1]);
        // System.out.println("Maths: "+marks[2]);

        // //uptate in array
        // marks[2] = 100;
        // marks[1] = marks[1]+1;
        // System.out.println("Che: "+marks[1]);
        // System.out.println("Maths: "+marks[2]);

        // //length of array
        // System.out.println("length of this array"+marks.length);

        //passing by value
        int marks[]= {97,82,76};
        update(marks);

        //to print our marks
        for(int i = 0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        
    }
}
