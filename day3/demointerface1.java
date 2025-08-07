package day3;

// Interface 1
interface myInter1 {
    public void display();  // Abstract method

    default void display1() {
        System.out.println("Default method from interface1");
    }
}

// Interface 2
interface myInter2 {
    default void display1() {
        System.out.println("Default method from interface2");
    }
}

// Class implementing both interfaces
class sample implements myInter1, myInter2 {

    // Implement the abstract method from myInter1
    @Override
    public void display() {
        System.out.println("display here");
    }

    // Override the conflicting default method
    @Override
    public void display1() {
        System.out.println("inside default");

        // Explicitly call default methods from both interfaces
        myInter2.super.display1();
        myInter1.super.display1();
    }
}

// Main class
public class demointerface1 {
    public static void main(String[] args) {
        sample obj = new sample();

        obj.display();   // Calls sample.display()
        obj.display1();  // Calls sample.display1()
    }
}
