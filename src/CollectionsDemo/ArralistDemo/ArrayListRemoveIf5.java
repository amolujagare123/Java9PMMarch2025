package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf5 {

    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList<>();
        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');
        al.add('n');
        al.add('o');
        al.add('p');



        System.out.println(al);

        // remove the all the vowels - a ,e , i , o , u
        // predicate symbol ->

        al.removeIf(ch -> (ch =='a' || ch == 'e' || ch == 'o' || ch =='u' || ch == 'i'));
      //   al.removeIf(z-> z!='a' && z!='e' && z!='i' && z!='o' && z!='u');
        System.out.println(al);



    }
}
