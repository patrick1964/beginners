package np.com.rts.internship.beginners;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ruraj on 5/18/16.
 */
public class TestAnswersparse {

  @Test
  public void testAnswer() {
    Mainparse main = new Mainparse();

    Assert.assertEquals("Answer incorrect", 3.0, main.value, 0);
  }
}
