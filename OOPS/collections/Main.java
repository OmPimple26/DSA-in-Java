// Java Collection Framework (JCF) is a set of classes and interfaces that provide ready-made data structures to store and manipulate groups of objects efficiently.

// Java provides collection interfaces such as List, Set, and Queue, along with the Map interface. These interfaces have ready-made implementations such as ArrayList, HashSet, HashMap, and PriorityQueue, reducing the need to build common data structures from scratch.

// The Collection Framework improves productivity by making code more reusable, maintainable and faster to develop.

package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

//        list2.add(34);
//        list2.add(78);
//        list2.add(55);
//        list2.add(89);
//
//        System.out.println(list2);


        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);

        System.out.println(vector);
    }
}
