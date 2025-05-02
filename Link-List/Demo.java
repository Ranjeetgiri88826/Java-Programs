
import java.util.*;


// class Node{
//     public int value;
//     public Node next;
// }
public class Demo {
    public static void main(String[] args) {
        // // Creating a LinkList
        // Node node1 = new Node();
        // Node node2 = new Node();
        // node1.value = 1;
        // node2.value = 2;
        // node1.next = node2;
        // node2.next = null;

        LinkedList<Integer> linkList = new LinkedList<>();
        // Adding the elements in linkedlist
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);

        // Add elements in first
        linkList.addFirst(0);

        // Add elements in last
        linkList.addLast(4);

        // Get the element from Linkedlist
        linkList.get(2);

        // Get the element from First
        linkList.getFirst();

        // Get the element from Last
        linkList.getLast();

        // Removing elements
        linkList.remove();
        linkList.remove(0);
        linkList.removeFirst();
        linkList.removeLast(); 
        linkList.removeIf(x -> x % 2 == 0); // there are more removing methods are exist

        // remove all the elements
        linkList.clear();
        // to find size
        linkList.size();
        
        System.out.println(linkList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","dog","horse"));
        LinkedList<String> removeAnimals = new LinkedList<>(Arrays.asList("lion","dog"));
        animals.removeAll(removeAnimals);
        System.out.println(animals);
    }
}
