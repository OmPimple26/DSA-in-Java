// Note: Java does not support user defined operator overloading for custom classes

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println('1'+'2');
        System.out.println('1'+2);
        System.out.println('a'+1);
        System.out.println('A'+1);

        System.out.println();

        System.out.println("a"+"b");
        System.out.println("1"+"2");
        System.out.println("1"+2);
        System.out.println("a"+1);
        System.out.println("A"+1);

        System.out.println();

        System.out.println(1+"a");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));

        System.out.println();

        System.out.println("Om"+new ArrayList<>());
        System.out.println("Om"+new Integer(56));

        System.out.println();

//        System.out.println(new Integer(56)+new ArrayList<>()); // It will not execute
        String ans = new Integer(56)+""+new ArrayList<>();
        System.out.println(ans);
    }
}