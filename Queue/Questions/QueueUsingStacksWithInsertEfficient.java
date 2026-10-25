// Leetcode 232 - https://leetcode.com/problems/implement-queue-using-stacks/

package Questions;

import java.util.Stack;

public class QueueUsingStacksWithInsertEfficient {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacksWithInsertEfficient() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1) auxiliary space
    public void add(int item) {
        first.push(item);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) auxiliary space
    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) auxiliary space
    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1) auxiliary space
    public boolean isEmpty() {
        return first.isEmpty();
    }
}
