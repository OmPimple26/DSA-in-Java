// Leetcode 921 - Minimum Add to Make Parentheses Valid (https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/)

// Time Complexity: O(n)
// Space Complexity: O(n)


package Questions;

import java.util.Stack;

public class ValidParenthesesMinAdd {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        ValidParenthesesMinAdd obj = new ValidParenthesesMinAdd();

        int ans = obj.minAddToMakeValid("())");
        System.out.println(ans);

        int res = obj.minAddToMakeValid("(((");
        System.out.println(res);
    }
}
