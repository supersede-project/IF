/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 10:11:41 GMT 2019
 */

package eu.supersede.integration.api.datastore.fe.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.datastore.fe.types.Notification;
import java.util.Date;
import org.evosuite.runtime.mock.java.util.MockDate;

public class Notification_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Notification notification0 = new Notification();
      Date date0 = notification0.getCreation_time();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Notification notification0 = new Notification();
      boolean boolean0 = notification0.isEmail_sent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Notification notification0 = new Notification();
      String string0 = notification0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Notification notification0 = new Notification();
      String string0 = notification0.getLink();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Notification notification0 = new Notification();
      boolean boolean0 = notification0.isRead();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setEmail_sent(true);
      assertTrue(notification0.isEmail_sent());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Notification notification0 = new Notification();
      int int0 = notification0.getUser_id();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Notification notification0 = new Notification();
      int int0 = notification0.getNotification_id();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setRead(true);
      boolean boolean0 = notification0.isRead();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Notification notification0 = new Notification();
      MockDate mockDate0 = new MockDate((-436), (-169), (-169), (-169), 1);
      notification0.setCreation_time(mockDate0);
      Date date0 = notification0.getCreation_time();
      assertEquals("Fri Jun 06 23:01:00 GMT 1449", date0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.link = "";
      String string0 = notification0.getLink();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setLink("eu.supersede.integration.api.datastore.fe.types.Notification");
      String string0 = notification0.getLink();
      assertEquals("eu.supersede.integration.api.datastore.fe.types.Notification", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setMessage("");
      String string0 = notification0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setMessage("bkq_jR)");
      String string0 = notification0.getMessage();
      assertEquals("bkq_jR)", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setNotification_id((-1));
      int int0 = notification0.getNotification_id();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.notification_id = (-74);
      notification0.notification_id = 0;
      notification0.notification_id = 1824;
      int int0 = notification0.getNotification_id();
      assertEquals(1824, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setUser_id((-1756));
      int int0 = notification0.getUser_id();
      assertEquals((-1756), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.user_id = 1123;
      int int0 = notification0.getUser_id();
      assertEquals(1123, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.email_sent = true;
      boolean boolean0 = notification0.isEmail_sent();
      assertTrue(boolean0);
  }
}
