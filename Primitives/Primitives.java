package Basic.Primitives;

import java.util.Locale;

public class Primitives {

	public static void main(String args[])
    {
        
		// byte : 8 bits
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Minimum Byte: " + minByte);
        System.out.println("Maximum Byte: " + maxByte);
        
        // short : 2 bytes : 16 bits
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("\nMinimum Short: " + minShort);
        System.out.println("Maximum Short: " + maxShort);
        
        // int :  4 bytes : 32 bits
        int myMinIntNumber = Integer.MIN_VALUE;
        int myMaxIntNumber = Integer.MAX_VALUE;
        System.out.println("\nMinimum Integer : " + myMinIntNumber);
        System.out.println("Maximum Integer : " + myMaxIntNumber);
        System.out.println("Maximum Integer + 1 : " + (myMaxIntNumber+1));
        
        // long : 8 bytes : 64 bits
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("\nMinimum Long : " + minLong);
        System.out.println("Maximum Long : " + maxLong);
        
        // long 64 bits
        long bigLongNumber = 2147483647; // 32 bits
        long bigLongNumberL = 2147483647L; // 64 bits
        
        //casting
        byte newByte = (byte)(minByte/2); //act as integer
        System.out.println(newByte);
        
        int newInt = 500;
        short newShort = (short) (32000 + newInt); // act as integer
        System.out.println(newShort);
        
        //floating numbers
        //float 32 bits : 4 bytes : single precision
        float fmin = Float.MIN_VALUE;
        float fmax = Float.MAX_VALUE;
        System.out.println("Float Minimum : " + fmin);
        System.out.println("Float Maximum : " + fmax);
        
        //double 64 bits : 8 bytes : double precision - more precision
        //double is the default .point numbers
        double dmin = Double.MIN_VALUE;
        double dmax = Double.MAX_VALUE;
        System.out.println("Double Minimum : " + dmin);
        System.out.println("Double Maximum : " + dmax);
        
        int myInt = 5;
        float myFloat = 5.25f;
        float myFloat_ = (float)5.25;//5.25 act as double
        double myDouble = 5.25d;
        
        int myNewInt = 5;
        float myNewFloat = 5f;
        double myNewDouble = 5d;
        System.out.println("int 5 : " + myNewInt);
        System.out.println("float 5f :" + myNewFloat);
        System.out.println("double 5d : " + myNewDouble);
        
        int myNewInt_ = 5 / 3;
        float myNewFloat_ = 5f / 3f;
        double myNewDouble_ = 5d / 3d; // double have more precision
        System.out.println("int 5 / 3 : " + myNewInt_);
        System.out.println("float 5f / 3f : " + myNewFloat_);
        System.out.println("double 5d / 3d : " + myNewDouble_);
        
        float myNewFloat__ = (float)5.0 / 3f; //5.0 act as double
        System.out.println(myNewFloat__);
        
        //int and double is the most common used and java default primitives
        
        
        //CONVERSION: automatic conversion smaller data type into ==> bigger data type
        double dd;
        int i = 10;
        dd = i;
        System.out.println("dd : " + dd);
        System.out.println("dd : " + String.format("%4.3f", dd));
        
        
        //CASTING: if you dont cast, compiler gives error.
        double d3 = 10;
        int ii;
        ii = (int) d3;
        
        float fNumber = 5.000000000000000f;
        System.out.println("fNumber :" + String.format("%.2f",fNumber));
        
        
        //char : 16 bits : 2 bytes : unicode : different languages : 16 bits = 65535 different types of characters
        // unicode-table.com
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        
        char myCopyRight = '\u00A9';
        System.out.println(myCopyRight);
        
        //String is not a primitive, a Class
        //String:32 bits act as the same as int in the memory: 2.147 billion characters
        String myString = "\u00A9 2019";
        System.out.println(myString);
        
        String lastString = "50";
        int lastInt = 10;
        lastString = lastString + lastInt;
        System.out.println(lastString);
        
        //String is immutable
        //You cant change a String after its created, instead create a new String
        //When appending a String dont use String, use StringBuffer which can be changed.
        
        int result = 2;
        result += 5; //result = result + 5;
        System.out.println(result);
        
        //boolean : 8 bits : 1 byte
        int isCarInt = 20;
        boolean isTheCase = isCarInt==20 ? true : false;
        System.out.println(isTheCase);
	
		int tryit = 5;
		tryit++; // act as tryit = tryit + 1;
		tryit--; // act as tryit = tryit - 1;
		
		int anyInteger = 5;
	        if (anyInteger > 5)
	            System.out.println("anyInteger is bigger than 5");
	            System.out.println("This was executed");
		
		int anyInteger_ = 5;
	        if (anyInteger_ == 5){
	            int finalScore = anyInteger_;
	        }
	      //  System.out.println(finalScore);//error
		
		

	        

    }
}
