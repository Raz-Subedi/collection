package org.example.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

       /* List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4); // This will add 4 at the end of the list.
        System.out.println(list);

        list.add(1,50); //This will add %0 at index 1
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();  // Creating new ArrayList
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // This will add all the elements in old list
        System.out.println(list);

        System.out.println(list.get(1));*/


        // For Remove
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        for (int i=0; i<list.size(); i++){
            System.out.println("The element is " +list.get(i));
        }

        for (Integer element: list){
            System.out.println("Foreach element is "+ element);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator " +it.next());
        }

        list.set(2,1000); // To change the value at the index 2. O(1)
        System.out.println(list);

        System.out.println(list.contains(50)); // To check if the element is present in the list or not.
        System.out.println(list.contains(500));


        list.remove(1); // This will remove the element from the index 1
        System.out.println(list);

        list.remove(Integer.valueOf(30)); // This will remove the 30 from the list.
        System.out.println(list);

        list.clear(); //This will remove all the elements from the list.
        System.out.println(list);

        //Time Complexity
        //While inserting and removing the elements in the middle O(n).




        /* ArrayList li = new ArrayList();
        li.add(1);
        li.add("raz");
        System.out.println(li);

        ArrayList li = new ArrayList<>();
        li.add(15);
        li.add("rax");
        li.add(50.000);
        System.out.println(li);*/
    }


}
