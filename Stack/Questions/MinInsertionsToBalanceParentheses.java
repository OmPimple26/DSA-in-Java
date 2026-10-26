// Leetcode 1541 - Minimum Insertions to Balance a Parentheses String (https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/)

// Time Complexity: O(n)
// Space Complexity: O(n)


package Questions;

import java.util.Stack;

public class MinInsertionsToBalanceParentheses {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                // If the next character is also ')',
                // consume it as part of the required pair.
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    // Insert one ')' to complete the pair.
                    count++;
                }

                // Match the pair with an opening '('.
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    // Insert '(' because no opening exists.
                    count++;
                }
            }
        }

        // Each remaining '(' requires two ')'.
        count += stack.size() * 2;

        return count;
    }

    public static void main(String[] args) {
        MinInsertionsToBalanceParentheses obj = new MinInsertionsToBalanceParentheses();
        System.out.println(obj.minInsertions("(()))"));
        System.out.println(obj.minInsertions("())"));
        System.out.println(obj.minInsertions("))())("));
    }
}
