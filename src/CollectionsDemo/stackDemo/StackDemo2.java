package CollectionsDemo.stackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();



        st.push("amol");
        st.push("kiran");
        st.push("deepali");
        st.push("pratik");
        st.push("Manshi");

        System.out.println(st);

        System.out.println(st.search("deepali"));




    }
}
