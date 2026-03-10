// A simple class to use for object examples
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

public class refrenceVsvalue {

    // In Java, all arguments are passed by value.
    // Let's see what this means for primitive types and for object references.

    // ** 1. Call by Value with Primitive Types **
    // When a primitive type (like int, double, boolean) is passed to a method,
    // a copy of its value is made. Changes inside the method do not affect the
    // original variable outside the method.

    public static void modifyPrimitive(int number) {
        System.out.println("  Inside modifyPrimitive - before modification: " + number);
        number = 100; // This changes the local copy 'number', not the original 'myValue'
        System.out.println("  Inside modifyPrimitive - after modification: " + number);
    }

    // ** 2. Call by Value with Object References **
    // When an object is passed, the "value" that gets passed is the reference
    // (memory address) to the object. A copy of this reference is made.
    // Both the original reference and the copy point to the SAME object.

    // This method modifies the STATE of the object it receives.
    public static void modifyObjectState(Animal animal) {
        System.out.println("  Inside modifyObjectState - before modification: " + animal.name);
        animal.name = "Max"; // We are changing a field of the object that both references point to.
        System.out.println("  Inside modifyObjectState - after modification: " + animal.name);
    }
    
    // This method tries to REASSIGN the reference to a new object.
    public static void reassignObjectReference(Animal animal) {
        System.out.println("  Inside reassignObjectReference - before reassignment. Animal is: " + animal.name);
        animal = new Animal("Charlie"); // This creates a NEW object and makes the local reference 'animal' point to it.
                                        // It does NOT change where the original 'myAnimal' reference is pointing.
        System.out.println("  Inside reassignObjectReference - after reassignment. Animal is now: " + animal.name);
    }


    public static void main(String[] args) {
        System.out.println("--- Demonstrating Call by Value with a Primitive (int) ---");
        int myValue = 10;
        System.out.println("Before calling modifyPrimitive: " + myValue);
        modifyPrimitive(myValue);
        System.out.println("After calling modifyPrimitive: " + myValue);
        System.out.println("-> RESULT: The original value (10) is unchanged.\n");

        System.out.println("--- Demonstrating 'Call by Reference' like behavior by changing an object's state ---");
        Animal myAnimal = new Animal("Buddy");
        System.out.println("Before calling modifyObjectState: " + myAnimal.name);
        modifyObjectState(myAnimal);
        System.out.println("After calling modifyObjectState: " + myAnimal.name);
        System.out.println("-> RESULT: The object's state WAS changed because the method got a reference to the same object.\n");
        
        System.out.println("--- Proving it's really Call by Value by trying to reassign the object reference ---");
        System.out.println("Before calling reassignObjectReference: " + myAnimal.name);
        reassignObjectReference(myAnimal);
        System.out.println("After calling reassignObjectReference: " + myAnimal.name);
        System.out.println("-> RESULT: The original reference was NOT changed. It still points to the object with name 'Max'.");
        System.out.println("This proves Java is pass-by-value, as reassigning the copied reference in the method had no effect on the original reference.");
    }
}
