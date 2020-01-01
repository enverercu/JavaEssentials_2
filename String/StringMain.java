package Basic.String;

public class StringMain {
	
	public static void main(String[] args){
	
		//String is an array of characters
		//CONVER CHAR[] TO STRING
		char[] arrSample = {'R', 'O', 'S', 'E'};
		String strSample_1 = new String (arrSample);
		
		String str1 = "Rock";
		String str2 = "Star";
		
		String str3 = str1.concat(str2);
		
		System.out.println("Length of String: " + str3.length());
		
		System.out.println("Character at position 5: " + str3.charAt(5));
		
		System.out.println("Index of character 'S': " + str3.indexOf('S'));
		
		System.out.println("Compare To 'ROCKSTAR': " + str3.compareTo("rockstar"));
		
		System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str3.compareToIgnoreCase("ROCKSTAR"));
		
		System.out.println("Contains sequence 'tar': " + str3.contains("tar"));
		
		System.out.println("EndsWith character 'r': " + str3.endsWith("r"));
		
		System.out.println("Replace 'Rock' with 'Duke': " + str3.replace("Rock", "Duke"));
		
		System.out.println("Convert to LowerCase: " + str3.toLowerCase());
		
		System.out.println("Convert to UpperCase: " + str3.toUpperCase());
		
		String S1 ="The number is: "+ "123"+"456";
		System.out.println(S1);
		
		String S2 = "The number is: "+(123+456);
		System.out.println(S2);
	
	}

}
