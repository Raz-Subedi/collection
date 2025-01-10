package org.example.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {

        //TreeSet implements set properties.
        //BinarySearchTree
        //The elements in this will be unique as well as sorted
        // sorted because it is inside binary search tree.


        Set<Integer> set = new TreeSet<>();
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);

        set.add(54);//  uses hashing technique
        set.add(54);// Already there is one
        set.add(54);// so another is not inserted in the set

        set.remove(21);
        System.out.println(set);

        System.out.println(set.contains(100));
        System.out.println(set.contains(54));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
