/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 11:08:45 GMT 2019
 */

package eu.supersede.integration.api.mdm.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.mdm.types.OperatorTypes;

public class OperatorTypes_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OperatorTypes operatorTypes0 = OperatorTypes.ONTOLOGICAL_DISTANCE;
      String string0 = operatorTypes0.val();
      assertEquals("Ontological Distance", string0);
  }
}