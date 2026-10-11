public class DLL {

    private Node head;

//    private Node tail;
//    private int size;
//
//    public DLL() {
//        this.size = 0;
//    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverse(){
        Node temp = head;
        Node last = null;

        while(temp != null){
            last = temp;
            temp = temp.next;
        }

        System.out.println("Printing Linked List in Reverse Order");

        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
