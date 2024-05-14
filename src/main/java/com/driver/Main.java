package com.driver;

class A{
    public String meth()
    {
        return "Invoking method from class A";
    }
}
class B extends A{

}
public class Main {
  public static  void main(String[] args)
  {
      B objB = new B();
      System.out.println(objB.meth());
      System.out.println(objB.meth());
  }
}