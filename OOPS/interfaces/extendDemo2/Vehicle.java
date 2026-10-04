package interfaces.extendDemo2;

public interface Vehicle {
    // Abstract method (must be implemented by classes)
    void clean();

    // Default method (already has a body)
    default void startEngine() {
        System.out.println("Engine started. Ready to go!");
    }
}

class Car implements Vehicle {
    @Override
    public void clean() {
        System.out.println("Car is being washed.");
    }
    // startEngine() is automatically available here without overriding it
}