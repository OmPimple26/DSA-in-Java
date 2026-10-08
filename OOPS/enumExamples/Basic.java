// An enum (short for enumeration) in Java is a special data type used to define a fixed set of constants. Introduced in Java 5, enums provide compile-time type safety, making code more readable and preventing invalid values from being assigned.

// All the enums explicitly extends java.lang.enum class

// this keyword actually prints the name of the constants present in the enum

// Enum can implement as many interfaces as you want but it cannot extend classes

// It can have constructors but since you cannot create objects explicitly hence you cannot invoke this constructor explicitly it only happen when we try to access something and even if we try to access only one constant it will call all the constants present in the enum

// We cannot create abstract methods in enum class. Method body is required


package enumExamples;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is Week

        void display() {

        }

        Week() {
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }

        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));
//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
    }
}
