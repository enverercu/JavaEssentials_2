package Basic.String;

import java.lang.*;

public class StringSubstring {
   public static void main(String[] args) {
      String str = "This is tutorials point";
      String substr = "";

      // prints the substring after index 7 till index 17
      substr = str.substring(7, 17);
      System.out.println("substring = " + substr);

      // prints the substring after index 0 till index 7
      substr = str.substring(0, 7);
      System.out.println("substring = " + substr);
   }
}
