package Basic.StaticBlock;

class Test { 
    
	static int i; 
    int j; 
    
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    
    Test(){ 
        System.out.println("Constructor called"); 
    } 
} 

public class StaticMain {

	public static void main(String args[]) { 
		  
	       // Although we have two objects, static block is executed only once. 
	       Test t1 = new Test(); 
	       Test t2 = new Test(); 
	       
	       System.out.println("Static variable : " + Test.i);
	    } 
}