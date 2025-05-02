
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,2);
        vector.add(1);// add elemrnt at the end
        vector.add(2);
        vector.add(3);
        Vector<Integer> vector1 = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println(vector);

        vector.add(2, 7);// insert element at specified index
        vector.get(3);// retrive the elements at specified index
        vector.set(5, 8);// replace the elements at specific index 
        vector.remove(3);// remove elements at specified index
        vector.remove(vector1);// remove the first occurance at specified index
        vector.size();// return the no. of elements in the vector
        vector.isEmpty();// check if the vector is empty
        vector.contains(7);// check the vector contains specified element
        vector.clear();// remove all the elements of the vector
    }    
}
