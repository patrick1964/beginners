package np.com.rts.internship.beginners;

import java.util.*;


public class Mainparse {

  private String parseThis = "3127162:261111\n" +
          "TUY-7.4/1\n" +
          "DPOG5";

  // Parsed value must be inserted into this variable
  double value;

  public Mainparse() {
    String decryptedStr = "";
    for (int i =0; i<parseThis.length();i++)
    {
    	int temp = (int)parseThis.charAt(i)-1;
    	decryptedStr+=Character.toString((char)temp);
    }
    int dot=decryptedStr.indexOf(".");
    String val= decryptedStr.substring(dot-1, dot+1);
    value= Double.parseDouble(val);
  }
    

  public static void main(String[] args) {
    new Mainparse();
  }
}
