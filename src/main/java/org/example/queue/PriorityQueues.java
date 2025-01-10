package org.example.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(48);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
// Here the program works  as Min heap
        // the smallest element is stored first

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
