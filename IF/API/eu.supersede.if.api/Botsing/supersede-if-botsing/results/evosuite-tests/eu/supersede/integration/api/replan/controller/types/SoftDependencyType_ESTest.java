/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 11:36:25 GMT 2019
 */

package eu.supersede.integration.api.replan.controller.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.replan.controller.types.SoftDependencyType;

public class SoftDependencyType_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SoftDependencyType softDependencyType0 = SoftDependencyType.FUNCTIONAL;
      String string0 = softDependencyType0.toString();
      assertEquals("functional", string0);
  }
}
