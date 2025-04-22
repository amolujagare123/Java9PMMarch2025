package CollectionsDemo.stackDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

        System.out.println(st.empty());

        st.push("amol");
        st.push("kiran");
        st.push("deepali");
        st.push("pratik");
        st.push("Manshi");
        System.out.println(st.empty());
        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);


        System.out.println(st.peek());
        System.out.println(st);



    }
}
