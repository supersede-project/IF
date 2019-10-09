/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 11:11:59 GMT 2019
 */

package eu.supersede.integration.api.monitoring.manager.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.monitoring.manager.types.HttpMonitorConfiguration;
import eu.supersede.integration.api.monitoring.manager.types.Method;

public class HttpMonitorConfiguration_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpMonitorConfiguration httpMonitorConfiguration0 = new HttpMonitorConfiguration();
      String string0 = httpMonitorConfiguration0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpMonitorConfiguration httpMonitorConfiguration0 = new HttpMonitorConfiguration();
      Method method0 = Method.POST;
      httpMonitorConfiguration0.setMethod(method0);
      Method method1 = httpMonitorConfiguration0.getMethod();
      assertSame(method1, method0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HttpMonitorConfiguration httpMonitorConfiguration0 = new HttpMonitorConfiguration();
      httpMonitorConfiguration0.setUrl("");
      String string0 = httpMonitorConfiguration0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HttpMonitorConfiguration httpMonitorConfiguration0 = new HttpMonitorConfiguration();
      httpMonitorConfiguration0.getMethod();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HttpMonitorConfiguration httpMonitorConfiguration0 = new HttpMonitorConfiguration();
      httpMonitorConfiguration0.setUrl("[G");
      String string0 = httpMonitorConfiguration0.getUrl();
      assertEquals("[G", string0);
  }
}
