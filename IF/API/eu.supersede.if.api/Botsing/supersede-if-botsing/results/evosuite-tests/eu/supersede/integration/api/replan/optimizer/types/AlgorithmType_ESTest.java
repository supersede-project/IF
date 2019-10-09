/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 11:37:45 GMT 2019
 */

package eu.supersede.integration.api.replan.optimizer.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.replan.optimizer.types.AlgorithmType;

public class AlgorithmType_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AlgorithmType algorithmType0 = AlgorithmType.SPEA2;
      String string0 = algorithmType0.getName();
      assertEquals("SPEA2", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AlgorithmType algorithmType0 = AlgorithmType.fromName("MOCell");
      assertEquals(AlgorithmType.MOCell, algorithmType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AlgorithmType.fromName("");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AlgorithmType algorithmType0 = AlgorithmType.fromName("SMSEMOA");
      assertEquals(AlgorithmType.SMSEMOA, algorithmType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AlgorithmType algorithmType0 = AlgorithmType.fromName("NSGA-II");
      assertEquals(AlgorithmType.NSGAII, algorithmType0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AlgorithmType algorithmType0 = AlgorithmType.fromName("PESA2");
      assertEquals(AlgorithmType.PESA2, algorithmType0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AlgorithmType algorithmType0 = AlgorithmType.fromName("SPEA2");
      assertEquals(AlgorithmType.SPEA2, algorithmType0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        AlgorithmType.fromName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AlgorithmType algorithmType0 = AlgorithmType.valueOf("SPEA2");
      assertEquals(AlgorithmType.SPEA2, algorithmType0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AlgorithmType[] algorithmTypeArray0 = AlgorithmType.values();
      assertEquals(5, algorithmTypeArray0.length);
  }
}
