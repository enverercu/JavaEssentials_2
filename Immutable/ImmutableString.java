package Basic.Immutable;

//In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
//Once string object is created its data or state can't be changed but a new string object is created.

public class ImmutableString {

	 public static void main(String args[]){  
		   String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		   
//		   As you can see in the above figure that two objects are created but s reference variable still 
//		   refers to "Sachin" not to "Sachin Tendulkar".
		   
//		   But if we explicitely assign it to the reference variable, it will refer to "Sachin Tendulkar" object
		   
		   s=s.concat(" Tendulkar");  
		   System.out.println(s);  
	 }  
}
