import java.io.*;
public class Main {
   public static void main(String args[]) {
      String str = new String("        Sample String       "+"\n");
      System.out.println("String: "+str);
      System.out.print("Result after removing leading and trailing spaces:" );
      System.out.println(str.trim() );
   }
}