package Basic.Immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Test {
	
	// Concatenates to String 
    public static void concat1(String s1) 
    { 
        s1 = s1 + "forgeeks";
        System.out.println("String 2:" +s1);
        
        //Altering the value of string creates another object and s1 in concat1() stores reference of new string
    }
    
    // Concatenates to StringBuilder 
    public static void concat2(StringBuilder s2) 
    { 
        s2.append("forgeeks"); 
    } 
  
    // Concatenates to StringBuffer 
    public static void concat3(StringBuffer s3) 
    { 
        s3.append("forgeeks"); 
    } 
	
	public static void main(String args[]) 
	   { 
	        Student s = new Student("ABC", 101); 
	        System.out.println(s.getName()); 
	        System.out.println(s.getRegNo()); 
	  
	        // Uncommenting below line causes error 
	        // s.regNo = 102; 
	        
	        String s1 = "Geeks";
	        concat1(s1); // s1 is not changed
	        System.out.println("String 1:" +s1);
	        
	        StringBuilder s2 = new StringBuilder("Geeks"); 
	        concat2(s2); // s2 is changed 
	        System.out.println("StringBuilder: " + s2); 
	  
	        StringBuffer s3 = new StringBuffer("Geeks"); 
	        concat3(s3); // s3 is changed 
	        System.out.println("StringBuffer: " + s3); 
	        
	        //convert string to stringbuilder and stringbuffer
	        
	        String str = "Geeks";
	        	          
	        // conversion from String object to StringBuffer 
	        StringBuffer sbr = new StringBuffer(str); 
	        sbr.reverse(); 
	        System.out.println(sbr); 
	          
	        // conversion from String object to StringBuilder 
	        StringBuilder sbl = new StringBuilder(str); 
	        sbl.reverse(); 
	        System.out.println(sbl);
	        
//	        From StringBuffer and StringBuilder to String : 
//	        This conversions can be perform using toString() method 
//	        which is overridden in both StringBuffer and StringBuilder classes.
//	        Below is the java program to demonstrate the same. Note that while we use toString() method
//	        , a new String object(in Heap area) is allocated and initialized to character sequence currently 
//	        represented by StringBuffer object, that means the subsequent changes to the StringBuffer 
//	        object do not affect the contents of the String object.
	        
	        StringBuffer sbuffer = new StringBuffer("Geeks"); 
	        StringBuilder sbuilder = new StringBuilder("Hello"); 
	          
	        // conversion from StringBuffer object to String 
	        String strg = sbuffer.toString(); 
	        System.out.println("StringBuffer object to String : "); 
	        System.out.println(strg); 
	          
	        // conversion from StringBuilder object to String 
	        String strg1 = sbuilder.toString(); 
	        System.out.println("StringBuilder object to String : "); 
	        System.out.println(strg1); 
	          
	        // changing StringBuffer object sbr 
	        // but String object(str) doesn't change 
	        sbuffer.append("ForGeeks"); 
	        System.out.println(sbuffer); 
	        System.out.println(strg);
	        
	        strg = sbuffer.toString();//strg in new memory address
	        System.out.println(strg);
	        
	        
	        // Java program to demonstrate conversion from  
	        // String to StringBuffer and StringBuilder. 
	        StringBuffer sbr2 = new StringBuffer("Geeks"); 
	          
	        // conversion from StringBuffer object to StringBuilder 
	        String str2 = sbr2.toString(); 
	        StringBuilder sbl2 = new StringBuilder(str2); 
	          
	        System.out.println(sbl2); 
	        
	        //Reverse a string in Java
//	        Objects of String are immutable.
//	        String class in Java does not have reverse() method, however StringBuilder class has built in reverse() method.
//	        StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method.
	        
	        // Java program to ReverseString using StringBuilder 
	        String input = "Geeks for Geeks"; 
	        
	        StringBuilder input1 = new StringBuilder(); 
	  
	        // append a string into StringBuilder input1 
	        input1.append(input); 
	  
	        // reverse StringBuilder input1 
	        input1 = input1.reverse(); 
	  
	        // print reversed String 
	        System.out.println(input1);
	        
	        
	     // Java program to Reverse a String using ListIterator
	        
	        String strr = "sample reverse technic";
	        char[] charArr = strr.toCharArray();
	        List<Character> list = new ArrayList();
	        
	        for (char c:charArr){
	        	list.add(c);
	        }
	        
	        Collections.reverse(list);
	        
	        ListIterator iterator = list.listIterator();
	        while (iterator.hasNext()){
	        	System.out.print(iterator.next());
	        }
	        
	        
	     // This program prints false
	     // StringBuffer does not override equals method of Object class
	        StringBuffer sb1 = new StringBuffer("GFG"); 
	        StringBuffer sb2 = new StringBuffer("GFG"); 
	        System.out.println(sb1.equals(sb2));
	        
	     // This program prints true
	        String strr1 = "GFG"; 
	        String strr2 = "GFG";  
	        System.out.println(strr1.equals(strr2));
	        
	        strr1 = sb1.toString();
	        strr2 = sb2.toString();
	        System.out.println(strr1.equals(strr2));
	        
	     // Java program to demonstrate StringBuffer insert
	        String strTemp = "Ercu Yilmaz";
	        StringBuffer strBuffer  = new StringBuffer(strTemp);
	        strBuffer.insert(0," ");
	        strBuffer.insert(0,"Enver");
	        System.out.println(strBuffer);
	        
	     // character array to be inserted 
	        char cArr[] = { 'n', 'a', 'm', 'e', ':' };
	        strBuffer.insert(0,cArr);
	        System.out.println(strBuffer);
	        
	        System.out.println(strBuffer.subSequence(0,4));
	        
	        int ind = strTemp.indexOf("Yilmaz");
	        System.out.println(ind);
	        
	        System.out.println();
	        
	        //index and replace
	        String strSample = "abc bca cba cab";
	        StringBuffer strBuff = new StringBuffer();
	        char[] chrArray = strSample.toCharArray();
	        int i = 0;
	        for(char c:chrArray){
	        	if ( c == 'a'){
	        		System.out.print(String.valueOf(i)  + " ");
	        		strBuff.append("xxx");
	        	}
	        	else{
	        		strBuff.append(c);
	        	}
	        	
	        	i++;
	        }
	        
	        System.out.print(strBuff);
	        
	        System.out.println();
	        
	        //index and replace
	        String sstr = "ansþlakdjþfwþlasdjflakdfd";
	        System.out.print(sstr + " : ");
	        int index = 0;
	        while (index < sstr.length()){
	        	index = sstr.indexOf("a",index);
	        	if (index == -1) break;
	        	System.out.print(String.valueOf(index) + " ");
	        	index++;
	        }
	        
	        
	        System.out.println();
	        
	        
	        //replace
	        String strS1 = "abc bca cba cab";
	        strS1 = strS1.replace("a","xxx");
	        System.out.print(strS1);
	        
	        System.out.println();
	        
	        //sort
	        char[] cc = strSample.toCharArray();
	        Arrays.sort(cc);
	        String ss = new String(cc);
	        System.out.println(ss);
	        
	        //trim
	        String strS2 = "abc bca cba cab";
	        strS2 = strS2.trim();
	        strS2 = strS2.replace(" ", "");
	        System.out.println(strS2);
	        
	        System.out.println();
	        
	        //split
	        String strS3 = "abc bca cba cab";
	        String[] strArr = strS3.split(" ");
	        for (String ss1:strArr){
	        	System.out.print(ss1 + "-");
	        }
	        
	        
	        
	    } 
}
