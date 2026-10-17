public class InterviewQuestions {

//    Leetcode 141 - https://leetcode.com/problems/linked-list-cycle ->
//    Amazon and Microsoft

//    public boolean hasCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                return true;
//            }
//        }
//        return false;
//    }


// Find length of the cycle ->

//    public int lengthCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                // calculate the length
//                ListNode temp = slow;
//                int length = 0;
//                do {
//                    temp = temp.next;
//                    length++;
//                } while (temp != slow);
//                return length;
//            }
//        }
//        return 0;
//    }
}
