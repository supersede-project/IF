/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 11:05:43 GMT 2019
 */

package eu.supersede.integration.api.mdm.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.mdm.types.ActionTypes;
import eu.supersede.integration.api.mdm.types.Condition;
import eu.supersede.integration.api.mdm.types.ECA_Rule;
import eu.supersede.integration.api.mdm.types.Event;
import eu.supersede.integration.api.mdm.types.OperatorTypes;
import eu.supersede.integration.api.mdm.types.Parameter;
import eu.supersede.integration.api.mdm.types.PredicatesTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ECA_Rule_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      String string0 = eCA_Rule0.getEca_ruleID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setGlobalLevel("");
      String string0 = eCA_Rule0.getGlobalLevel();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setGraph("");
      String string0 = eCA_Rule0.getGraph();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      String string0 = eCA_Rule0.getGlobalLevel();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.getAction();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      String string0 = eCA_Rule0.getFeature();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      int int0 = eCA_Rule0.getWindowSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      String string0 = eCA_Rule0.getGraph();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      Event event0 = new Event();
      eCA_Rule0.setEvent(event0);
      Event event1 = eCA_Rule0.getEvent();
      assertNull(event1.getTenant());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.getPredicate();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      String string0 = eCA_Rule0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      Object object0 = eCA_Rule0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      Event event0 = eCA_Rule0.getEvent();
      assertNull(event0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.getOperator();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      int int0 = eCA_Rule0.getWindowTime();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      List<Condition> list0 = eCA_Rule0.getConditions();
      List<Condition> list1 = eCA_Rule0.getConditions();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.getAlertParameters();
      List<String> list0 = eCA_Rule0.getAlertParameters();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      List<Parameter> list0 = eCA_Rule0.getParameters();
      List<Parameter> list1 = eCA_Rule0.getParameters();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      ActionTypes actionTypes0 = ActionTypes.ALERT_FEEDBACK_RECONFIGURATION;
      eCA_Rule0.setAction(actionTypes0);
      ActionTypes actionTypes1 = eCA_Rule0.getAction();
      assertEquals("Feedback Reconfiguration Alert", actionTypes1.val());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("fTHxKr'*3CF9.l3W=^");
      eCA_Rule0.setAlertParameters(arrayList0);
      List<String> list0 = eCA_Rule0.getAlertParameters();
      assertTrue(list0.contains("fTHxKr'*3CF9.l3W=^"));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      ArrayList<Condition> arrayList0 = new ArrayList<Condition>();
      Condition condition0 = new Condition();
      arrayList0.add(condition0);
      eCA_Rule0.setConditions(arrayList0);
      List<Condition> list0 = eCA_Rule0.getConditions();
      assertTrue(list0.contains(condition0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setEca_ruleID("");
      String string0 = eCA_Rule0.getEca_ruleID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setEca_ruleID("eu.supersede.integration.api.mdm.types.ECA_Rule");
      String string0 = eCA_Rule0.getEca_ruleID();
      assertEquals("eu.supersede.integration.api.mdm.types.ECA_Rule", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setFeature("");
      String string0 = eCA_Rule0.getFeature();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setFeature("2J7!]QY-Y,m/o");
      String string0 = eCA_Rule0.getFeature();
      assertEquals("2J7!]QY-Y,m/o", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setGlobalLevel("=a*upNN%rl$\"Poc");
      String string0 = eCA_Rule0.getGlobalLevel();
      assertEquals("=a*upNN%rl$\"Poc", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setGraph("dwj|B]aS9P<");
      String string0 = eCA_Rule0.getGraph();
      assertEquals("dwj|B]aS9P<", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setName("");
      String string0 = eCA_Rule0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setName("eu.supersede.integration.api.mdm.types.ECA_Rule");
      String string0 = eCA_Rule0.getName();
      assertEquals("eu.supersede.integration.api.mdm.types.ECA_Rule", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      OperatorTypes operatorTypes0 = OperatorTypes.ENGLISH_OVERALL_SENTIMENT;
      eCA_Rule0.setOperator(operatorTypes0);
      OperatorTypes operatorTypes1 = eCA_Rule0.getOperator();
      assertEquals("English Overall Sentiment", operatorTypes1.val());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      Vector<Parameter> vector0 = new Vector<Parameter>();
      Parameter parameter0 = new Parameter();
      vector0.add(parameter0);
      eCA_Rule0.setParameters(vector0);
      List<Parameter> list0 = eCA_Rule0.getParameters();
      assertTrue(list0.contains(parameter0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      PredicatesTypes predicatesTypes0 = PredicatesTypes.CONTAINS;
      eCA_Rule0.setPredicate(predicatesTypes0);
      PredicatesTypes predicatesTypes1 = eCA_Rule0.getPredicate();
      assertEquals("Contains", predicatesTypes1.val());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setValue("");
      Object object0 = eCA_Rule0.getValue();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setWindowSize((-1926));
      int int0 = eCA_Rule0.getWindowSize();
      assertEquals((-1926), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setWindowSize(1024);
      int int0 = eCA_Rule0.getWindowSize();
      assertEquals(1024, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setWindowTime((-1));
      int int0 = eCA_Rule0.getWindowTime();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ECA_Rule eCA_Rule0 = new ECA_Rule();
      eCA_Rule0.setWindowTime(886);
      int int0 = eCA_Rule0.getWindowTime();
      assertEquals(886, int0);
  }
}