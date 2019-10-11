/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 11:31:49 GMT 2019
 */

package eu.supersede.integration.api.replan.controller.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.replan.controller.types.Format;
import eu.supersede.integration.api.replan.controller.types.Property;

public class Property_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Property property0 = new Property();
      property0.getFormat();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Property property0 = new Property();
      Format format0 = Format.DATETIME;
      property0.setFormat(format0);
      Format format1 = property0.getFormat();
      assertSame(format1, format0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Property property0 = new Property();
      String string0 = property0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Property property0 = new Property();
      String string0 = property0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Property property0 = new Property();
      property0.setKey("");
      String string0 = property0.getKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Property property0 = new Property();
      property0.key = "Ha2>*KgaOJ";
      String string0 = property0.getKey();
      assertEquals("Ha2>*KgaOJ", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Property property0 = new Property();
      property0.value = "";
      String string0 = property0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Property property0 = new Property();
      property0.setValue("\"B*hq$]F.eL");
      String string0 = property0.getValue();
      assertEquals("\"B*hq$]F.eL", string0);
  }
}