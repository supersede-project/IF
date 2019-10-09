/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 11:07:05 GMT 2019
 */

package eu.supersede.integration.api.mdm.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.mdm.types.Feedback;

public class Feedback_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Feedback feedback0 = new Feedback();
      String string0 = feedback0.getFeedback();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Feedback feedback0 = new Feedback("R74SUW}7J}o`JgCF~[0");
      String string0 = feedback0.getFeedback();
      assertEquals("R74SUW}7J}o`JgCF~[0", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Feedback feedback0 = new Feedback("Pi");
      feedback0.setFeedback("");
      String string0 = feedback0.getFeedback();
      assertEquals("", string0);
  }
}
