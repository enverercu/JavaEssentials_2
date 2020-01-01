package Basic.Serialization;

import java.io.*; 

class Demo implements java.io.Serializable 
{ 
    public int a; 
    public String b;
    public transient String c;
    public static String d;
    
    static{
    	d = "sta";
    }
  
    // Default constructor 
    public Demo(int a, String b, String c) 
    { 
        this.a = a; 
        this.b = b; 
        this.c = c;
    } 
  
} 
  
class Test 
{ 
    public static void main(String[] args) 
    {    
        Demo object = new Demo(1, "geeksforgeeks","tra"); 
        String filename = "file.ser"; 
          
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(object); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
  
        Demo object1 = null; 
  
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            object1 = (Demo)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + object1.a); 
            System.out.println("b = " + object1.b); 
            System.out.println("c = " + object1.c);
            System.out.println("d = " + object1.d);
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
    } 
} 