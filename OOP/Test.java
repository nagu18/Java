
//Declare the Object : 

class Dog {
    //Instance Variables (State)
    String name; 
    int age;
    //Methods (Behavior)
    void bark() {
        System.out.println(name + " says Woof!");
    }
}


// Usage of Object: 
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog(); // Create an object of the Dog class
        Dog c = new Dog();// Create another object of the Dog class
        c.name = "Max"; // Set the name of the dog
        c.age = 12; // Set the age of the dog
        d.name = "Buddy";   // Set the name of the dog
        d.age = 10; // Set the age of the dog
        d.bark();   // Call the bark method on the dog object
        c.bark();   // Call the bark method on the dog object
    }
}
