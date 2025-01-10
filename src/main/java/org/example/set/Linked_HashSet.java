package org.example.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet {
    public static void main(String[] args) {

        // In set the duplicate elements are not allowed.
        // LinkedHashSet maintains the  insertion order.
        // LinkedHashSet implements the properties of set
        // and as well as of linked list.

        Set<Integer> set = new LinkedHashSet<>();
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
