package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {

        // In set the duplicate elements are not allowed.
        // No orderly insertion (Unorderd).

        Set<Integer> set = new HashSet<>();
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
