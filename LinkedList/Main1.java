public class Main1 {
    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        //  list.display();
//
//        list.insertLast(5);
//        //  list.display();
//
//        list.insert(100, 3);
//        list.display();
//
//        System.out.println();
//
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println();
//
//        System.out.println(list.delete(2));
//        list.display();
//
//        System.out.println();
//
//        System.out.println(list.find(2));


        DLL list1 = new DLL();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);

        list1.insertLast(5);

        list1.insert(2, 100);

        list1.display();
        list1.reverse();
    }
}
