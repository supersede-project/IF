/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 09:53:38 GMT 2019
 */

package eu.supersede.integration.api.adaptation.dashboad.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.adaptation.dashboad.types.Action;
import eu.supersede.integration.api.adaptation.dashboad.types.Adaptation;
import eu.supersede.integration.api.adaptation.types.ModelSystem;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.mock.java.time.MockInstant;

public class Adaptation_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      adaptation0.setFc_id("1");
      int int0 = adaptation0.compareTo(adaptation0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      adaptation0.getModel_system();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      int int0 = adaptation0.compareTo(adaptation0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      double double0 = adaptation0.getRank();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      Date date0 = adaptation0.getComputation_timestamp();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      String string0 = adaptation0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      List<Action> list0 = adaptation0.getActions();
      List<Action> list1 = adaptation0.getActions();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      Adaptation adaptation1 = new Adaptation();
      adaptation1.setFc_id("");
      int int0 = adaptation0.compareTo(adaptation1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      String string0 = adaptation0.getFc_id();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      Vector<Action> vector0 = new Vector<Action>();
      Action action0 = new Action();
      vector0.add(action0);
      adaptation0.setActions(vector0);
      List<Action> list0 = adaptation0.getActions();
      assertTrue(list0.contains(action0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      Instant instant0 = MockInstant.ofEpochSecond((-1L), 659L);
      Date date0 = Date.from(instant0);
      adaptation0.setComputation_timestamp(date0);
      Date date1 = adaptation0.getComputation_timestamp();
      assertSame(date1, date0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      adaptation0.setFc_id("");
      String string0 = adaptation0.getFc_id();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      adaptation0.setFc_id("eu.supersede.integration.api.adaptation.dashboad.types.Adaptation");
      String string0 = adaptation0.getFc_id();
      assertEquals("eu.supersede.integration.api.adaptation.dashboad.types.Adaptation", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      ModelSystem modelSystem0 = ModelSystem.SiemensMonitoring;
      adaptation0.setModel_system(modelSystem0);
      ModelSystem modelSystem1 = adaptation0.getModel_system();
      assertSame(modelSystem1, modelSystem0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      adaptation0.setName("");
      String string0 = adaptation0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      adaptation0.setName("6qwY#yQP~Z");
      String string0 = adaptation0.getName();
      assertEquals("6qwY#yQP~Z", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      adaptation0.setRank((-2065.395911));
      double double0 = adaptation0.getRank();
      assertEquals((-2065.395911), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      adaptation0.setRank(2.0);
      double double0 = adaptation0.getRank();
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Adaptation adaptation0 = new Adaptation();
      Adaptation adaptation1 = new Adaptation();
      adaptation1.setFc_id("");
      adaptation0.setFc_id("");
      int int0 = adaptation0.compareTo(adaptation1);
      assertEquals(0, int0);
  }
}
