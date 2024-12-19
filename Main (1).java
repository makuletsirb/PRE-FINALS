class A {

    public void test() {
    System.out.println("A");

  }

}

class B extends A {

    public void test() {
    System.out.println("B");

   }

}

class C extends A {
    
   public void test() {
   System.out.println("C");

   }

}

public class Main {

   public static void main(String[] args) {

   A b1= new A();

   A b2 = new C();

   b1.test();

   b2.test();

   }

}