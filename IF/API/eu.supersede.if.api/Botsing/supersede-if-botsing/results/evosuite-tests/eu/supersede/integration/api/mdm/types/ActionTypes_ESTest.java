/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 11:02:58 GMT 2019
 */

package eu.supersede.integration.api.mdm.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.mdm.types.ActionTypes;

public class ActionTypes_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionTypes actionTypes0 = ActionTypes.ALERT_MONITOR_DETERMINISTIC_RECONFIGURATION;
      String string0 = actionTypes0.val();
      assertEquals("Monitors Deterministic Reconfiguration Alert", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActionTypes actionTypes0 = ActionTypes.valueOf("ALERT_MONITOR_DETERMINISTIC_RECONFIGURATION");
      assertEquals(ActionTypes.ALERT_MONITOR_DETERMINISTIC_RECONFIGURATION, actionTypes0);
  }
}
