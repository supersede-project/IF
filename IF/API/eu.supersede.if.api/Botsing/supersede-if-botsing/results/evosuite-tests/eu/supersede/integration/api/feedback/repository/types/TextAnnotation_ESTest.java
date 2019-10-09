/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 10:57:45 GMT 2019
 */

package eu.supersede.integration.api.feedback.repository.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.feedback.repository.types.TextAnnotation;

public class TextAnnotation_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = textAnnotation0.getScreenshotId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      textAnnotation0.setText("");
      String string0 = textAnnotation0.getText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = textAnnotation0.getReferenceNumber();
      textAnnotation0.setScreenshotId(integer0);
      assertNull(textAnnotation0.getText());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = textAnnotation0.getId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      String string0 = textAnnotation0.getText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = new Integer(Integer.MIN_VALUE);
      textAnnotation0.setId(integer0);
      Integer integer1 = textAnnotation0.getId();
      assertEquals(Integer.MIN_VALUE, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = new Integer(74);
      textAnnotation0.setId(integer0);
      Integer integer1 = textAnnotation0.getId();
      assertEquals(74, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = new Integer(0);
      textAnnotation0.setId(integer0);
      Integer integer1 = textAnnotation0.getId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = new Integer((-21));
      textAnnotation0.setReferenceNumber(integer0);
      Integer integer1 = textAnnotation0.getReferenceNumber();
      assertEquals((-21), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = new Integer(8202);
      textAnnotation0.setReferenceNumber(integer0);
      Integer integer1 = textAnnotation0.getReferenceNumber();
      assertEquals(8202, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = new Integer(0);
      textAnnotation0.setReferenceNumber(integer0);
      Integer integer1 = textAnnotation0.getReferenceNumber();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = new Integer((-21));
      textAnnotation0.setScreenshotId(integer0);
      Integer integer1 = textAnnotation0.getScreenshotId();
      assertEquals((-21), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = new Integer(1085);
      textAnnotation0.setScreenshotId(integer0);
      Integer integer1 = textAnnotation0.getScreenshotId();
      assertEquals(1085, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      Integer integer0 = new Integer(0);
      textAnnotation0.setScreenshotId(integer0);
      Integer integer1 = textAnnotation0.getScreenshotId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextAnnotation textAnnotation0 = new TextAnnotation();
      textAnnotation0.setText("MN|y%\f%,#Js");
      String string0 = textAnnotation0.getText();
      assertEquals("MN|y%\f%,#Js", string0);
  }
}
