public class InterviewQuestions {

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }



    // Leetcode 141 - https://leetcode.com/problems/linked-list-cycle ->
    // Amazon and Microsoft

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }



    // Find length of the cycle ->

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }



    // Leetcode 142 - https://leetcode.com/problems/linked-list-cycle-ii/ ->

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        ListNode first = head;
        ListNode second = head;

        while (length > 0) {
            second = second.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (first != second) {
            first = first.next;
            second = second.next;
        }
//        return first;
        return second;
    }



    // Leetcode 202 - https://leetcode.com/problems/happy-number/ ->

    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }else{
            return false;
        }
    }

    private int findSquare(int number){
        int ans = 0;

        while(number>0){
            int rem = number%10;
            ans += rem*rem;
            number /= 10;
        }
        return ans;
    }
}
