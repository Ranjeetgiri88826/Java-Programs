// by defautl the size of ArrayList is 10.
import java.util.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.List;

class MyComparator1 implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
    
}

class MyComparator2 implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
    
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length(); // for Accending order
        // return s2.length() - s1.length(); // for Decending order
        
    }
    
}

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // to add the element in list
        list.add(1); // 0 index
        list.add(5); // 1 index
        list.add(38);
        list.add(43);
        list.add(180);
        System.out.println(list.get(2)); //to print  element of index 2    
        System.out.println(list.size()); // to find the size of list
        for(int i=0;i<list.size();i++){ // 'i' is a pionter
            System.out.println(list.get(i));
        }
        for(int x: list){ // 'x' is a element not a pointer
            System.out.println(x);
        }

        // to check the existance of elements
        System.out.println(list.contains(55));
        System.out.println(list.contains(43));
         
        // to remove the index elements
        list.remove(2); // by index 
        list.remove(Integer.valueOf(1)); //By value

        // to insert elements in decided index
        list.add(2,50);
        
        // to replace the element in index
        list.set(2, 66);
        System.out.println(list);
        // to find size
        list.size();
        // to clear all elements
        list.clear();

        //collection list in another list
        List<Integer> list1 = List.of(4,5,6,7,8);
        list.addAll(list1);
        System.out.println(list);

        // converting to array
        Object[] array =  list.toArray();
        Integer[] array1 = list.toArray(new Integer[0]);
        
        // Sorting an array
        // Collections.sort(list);
        list.sort(null);
        System.out.println(list);

        // Comparator
        // -> it is an interface
        list.sort(new MyComparator1()); //Accending Order
        System.out.println(list);

        list.sort(new MyComparator2()); // Deccending Order
        System.out.println(list);

        List<String> words1 = Arrays.asList("Apple","Mango","Orange","Banana");
        words1.sort(new StringLengthComparator()); // Accending order
        System.out.println(words1);

        List<String> words = Arrays.asList("Apple","Mango","Orange","Banana");
        words.sort(new StringLengthComparator()); // Accending order
        System.out.println(words);

        // -> with Lambda Expression
        words1.sort((a,b) -> a.length() - b.length()); // Accending order
        System.out.println(words1);

        words.sort((a,b) -> b.length() - a.length()); // Accending order
        System.out.println(words);

        list.sort((a,b) -> a-b); //Accending Order
        System.out.println(list);

        list.sort((a,b) -> b-a); // Deccending Order
        System.out.println(list);
    }
}


//   //creating a arraylist with specified initial capacity
//  ArrayList<String> liat = new ArrayList<>();
//  ArrayList<String> liat = new ArrayList<>(20);
//  List<String> liat = Arrays.asList("Apple","Banana","Orange");
//  ArrayList<String> list = new ArrayList<>(liat);
 
