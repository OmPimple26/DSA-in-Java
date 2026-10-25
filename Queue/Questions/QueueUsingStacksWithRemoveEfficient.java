package Questions;

import java.util.Stack;

public class QueueUsingStacksWithRemoveEfficient {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacksWithRemoveEfficient() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // Time Complexity: O(n)
    // Auxiliary Space Complexity: O(n)
    public void add(int item) throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    // Time Complexity: O(1)
    // Auxiliary Space Complexity: O(1)
    public int remove() throws Exception {
        return first.pop();
    }

    // Time Complexity: O(1)
    // Auxiliary Space Complexity: O(1)
    public int peek() throws Exception {
        return first.peek();
    }

    // Time Complexity: O(1)
    // Auxiliary Space Complexity: O(1)
    public boolean isEmpty() {
        return first.isEmpty();
    }
}
