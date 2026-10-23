// Time Complexity for simple Custom Queue:
// i) Peek - O(1)
// ii) Pop - O(n)
// iii) Front/Peek - O(1)

// Time Complexity for displaying simple Custom Queue: O(1)

// Space Complexity for simple Custom Queue: O(1)


// Time Complexity for Circular Queue:
// i) Peek - O(1)
// ii) Pop - O(1)
// iii) Front/Peek - O(1)

// Time Complexity for displaying Circular Queue: O(n)

// Space Complexity for simple Custom Queue: O(1)


public class QueueMain {
    public static void main(String[] args) throws Exception{
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(5);
//        queue.insert(19);
//        queue.insert(1);
//
//        queue.display();
//        System.out.println("Item present at the front is: "+queue.front());
//
//        System.out.println(queue.remove());
//        queue.insert(133);
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.insert(99);
//        queue.display();


        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();
    }
}
