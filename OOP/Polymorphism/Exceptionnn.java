package Basic.OOP.Polymorphism;

class Parent_11 { 
    void m1() throws RuntimeException 
    { 
        System.out.println("From parent m1()"); 
    } 
} 
  
class Child_1 extends Parent_11 { 
    @Override
    // no issue while throwing same exception 
    void m1() throws RuntimeException 
    { 
        System.out.println("From child1 m1()"); 
    } 
} 
class Child_2 extends Parent_11 { 
    @Override
    // no issue while throwing subclass exception 
    void m1() throws ArithmeticException 
    { 
        System.out.println("From child2 m1()"); 
    } 
} 
class Child_3 extends Parent_11 { 
    @Override
    // no issue while not throwing any exception 
    void m1() 
    { 
        System.out.println("From child3 m1()"); 
    } 
} 
class Child_4 extends Parent_11 { 
//    @Override
    // compile-time error 
    // issue while throwing parent exception 
//    void m1() throws Exception 
//    { 
//        System.out.println("From child4 m1()"); 
//    } 
} 
