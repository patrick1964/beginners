package np.com.rts.internship.beginners;

import java.util.*;


public class Mainsimplething {

  SimpleThing[] simpleThings = new SimpleThing[] {
          new SimpleThing("hello", 1),
          new SimpleThing("mello", 2),
          new SimpleThing("mell", 3),
          new SimpleThing("1mell", 4),
          new SimpleThing("hmmm", 5),
          new SimpleThing("h2mmm", 6),
          new SimpleThing("zxcvb", 7),
          new SimpleThing("asdf", 8),
          new SimpleThing("%$compli", 9)
  };

  public Mainsimplething() {
    for(int i=0; i<simpleThings.length; i++){
    	if(i+1<simpleThings.length&&simpleThings[i].nothingSpecial.charAt(0)>simpleThings[i+1].nothingSpecial.charAt(0)){
    		SimpleThing temp=simpleThings[i+1];
    		simpleThings[i+1]=simpleThings[i];
    		simpleThings[i]=temp;
    	}
    }


  }

  public static void main(String[] args) {
    new Mainsimplething();
  }
}
