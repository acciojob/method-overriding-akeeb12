package com.driver;

public class Main {
public static class A {
    public String meth() {

        return "Invoking method from class A";
    }
}

public static class B extends A {
    // Task 4: Override meth() method of class A in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}


    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B obj = new B();
        obj.meth();
        
        B objA = new B();
        objA.meth(); // This will call the overridden method from class B
    }
}
