// Stack, Vector ko extend karta hai isiliye vector ka sara method stack bhi use kr sakta hai

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // Adding the element in the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // removing the element in the stack
        st.pop();
        System.out.println(st);
        // See the top element not remove
        int top = st.peek();
        System.out.println(top);
        // check the stack is empty or not
        System.out.println(st.isEmpty());
        // check the size of stack
        System.out.println(st.size());
        // to searcha the elements
        System.out.println(st.search(3));

        // Use LinkedList as a stack
        LinkedList<Integer> l = new LinkedList<>();
        l.addLast(1);// push
        l.addLast(2);
        l.addLast(3);
        l.getLast(); // peek
        l.removeLast(); // pop
        l.size();
        l.isEmpty();

        // arrayList as a stack but not make for stack implementation and also not easy
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); // push
        arr.add(2);
        arr.add(3);
        arr.get(arr.size()-1); // peek
        arr.remove(arr.size()-1); // pop


    }
}
