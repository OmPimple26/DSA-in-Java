// Notes:

// 1. Introduction to Strings and Memory Storage
//
// i) Strings are sequences or collections of characters stored as objects of the String class in Java.
// ii) They are reference variables pointing to objects stored in the heap memory, while the references themselves reside in the stack memory.
// iii) Strings are distinct from primitive data types like integers but have similar declaration syntax.
//
// iv) When two variables are assigned the same string literal (e.g., "om"), Java does not create two separate objects but reuses the instance in a special memory region called the String Pool.
// v) The String Pool is a dedicated memory structure within the heap used to store common string literals, optimizing memory usage by avoiding duplication.
//
//
// 2. Core Concepts: String Pool and Immutability
//
// 1) String Pool:
// i) A unique memory space inside the heap for reusing string literals.
// ii) If a string literal already exists in the pool, new references point to that object instead of creating a duplicate.
//
// 2) Immutability:
// i) Unlike arrays, strings in Java cannot be modified once created; they are immutable.
// ii) If a change is needed, a new string object is created, and the reference is updated.
// iii) This avoids side effects where changing one reference unintentionally affects others pointing to the same object.
//
// iv) Reason for Immutability: Primarily for security and stability; eg. multiple users named "om" share same string instance, changes by one user won’t affect others.


public class StringIntro {
    public static void main(String[] args) {
//        int arr[] = {2,3,5,4,19};
//        int num = 10;

        String name = "Om Pimple";
        System.out.println(name);

        String a = "Om";
        System.out.println(a);
        a = "Pimple";
        System.out.println(a);
    }
}