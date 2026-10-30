// String Buffer is mutable sequence of characters

// Advantages over String:
// i) Mutable
// ii) Efficient
// iii) Thread-safe. Hence, it is slower

// String Builder is not thread safe. Hence, it is faster


import java.text.DecimalFormat;
import java.util.Arrays;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("WeMakeDevs");

        String str = sb.toString();
        System.out.println(str);


        // Constructor 1:
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());  // Initial capacity is 16

        // Constructor 2:
        StringBuffer sb2 = new StringBuffer("Om Pimple");
        System.out.println(sb2.capacity());  // Here it prints capacity as 25

        // Constructor 3:
        StringBuffer sb3 = new StringBuffer(30); // String Buffer initial capacity is of size 16
        System.out.println(sb3.capacity());  // But here it will print 30


        // In-built methods:
        StringBuffer sb4 = new StringBuffer();

        sb4.append("WeMakeDevs");  // append
        sb4.append(" is nice!");

//        sb4.insert(2," Om ");  // insert

        sb4.replace(1,5,"Om");  // replace

        sb4.delete(1,5);  // delete

        sb4.reverse();  // reverse

        System.out.println(sb4);


        // Methods that we can perform on strings:
        String sentence = "Hi h   hjh  hjkso  siowi     w ";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));  // remove whitespaces

        String arr = "Kunal,Apoorv,Rahul,Snehal";
        String[] names = arr.split(",");  // split
        System.out.println(Arrays.toString(names));

        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));  // rounding off
    }
}
