/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 10:57:21 GMT 2019
 */

package eu.supersede.integration.api.feedback.repository.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.feedback.repository.types.Status;

public class Status_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = Integer.getInteger("com.google.common.base.Converter$ConverterComposition", 0);
      Status status0 = new Status(integer0, integer0, "com.google.common.base.Converter$ConverterComposition");
      Integer integer1 = status0.getId();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Status status0 = new Status();
      Integer integer0 = status0.getApiUserId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Status status0 = new Status();
      status0.setStatus("@T0uFBY_");
      assertNull(status0.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Status status0 = new Status(integer0, integer0, "");
      String string0 = status0.getStatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(364);
      Status status0 = new Status(integer0, (Integer) null, "");
      Integer integer1 = status0.getFeedbackId();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Status status0 = new Status();
      Integer integer0 = new Integer((-568));
      status0.setApiUserId(integer0);
      Integer integer1 = status0.getApiUserId();
      assertEquals((-568), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Status status0 = new Status();
      Integer integer0 = new Integer(59);
      Status status1 = new Status(integer0, integer0, (String) null);
      status0.Merge(status1);
      Integer integer1 = status0.getApiUserId();
      assertEquals(59, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Status status0 = new Status(integer0, integer0, "com.google.common.cache.LocalCache$LocalManualCache");
      Integer integer1 = status0.getApiUserId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer((-5480));
      Status status0 = new Status(integer0, integer0, "&CQ.Oz0hXTlq4u");
      Integer integer1 = status0.getFeedbackId();
      assertEquals((-5480), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(59);
      Status status0 = new Status(integer0, integer0, (String) null);
      Integer integer1 = status0.getFeedbackId();
      assertEquals(59, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Status status0 = new Status();
      Integer integer0 = new Integer(0);
      status0.setFeedbackId(integer0);
      Integer integer1 = status0.getFeedbackId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Status status0 = new Status();
      Integer integer0 = new Integer((-568));
      status0.setId(integer0);
      Integer integer1 = status0.getId();
      assertEquals((-568), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Status status0 = new Status();
      Integer integer0 = new Integer(429);
      status0.setId(integer0);
      Integer integer1 = status0.getId();
      assertEquals(429, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Status status0 = new Status(integer0, integer0, "com.google.common.cache.LocalCache$LocalManualCache");
      status0.setId(integer0);
      Integer integer1 = status0.getId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Status status0 = new Status(integer0, integer0, "~Fn{eo@JO");
      String string0 = status0.getStatus();
      assertEquals("~Fn{eo@JO", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Status status0 = new Status();
      String string0 = status0.getStatus();
      assertNull(string0);
  }
}
