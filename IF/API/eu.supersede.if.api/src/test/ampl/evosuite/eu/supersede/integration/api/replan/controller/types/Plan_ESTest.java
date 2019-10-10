/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 11:29:18 GMT 2019
 */

package eu.supersede.integration.api.replan.controller.types;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import eu.supersede.integration.api.replan.controller.types.Job;
import eu.supersede.integration.api.replan.controller.types.Plan;
import eu.supersede.integration.api.replan.controller.types.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.mock.java.util.MockDate;

public class Plan_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = plan0.getNumberFeatures();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = plan0.getReleaseId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = new Integer((-2863));
      plan0.setgetNumberJobs(integer0);
      Integer integer1 = plan0.getNumberJobs();
      assertEquals((-2863), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = plan0.getNumberJobs();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Plan plan0 = new Plan();
      Date date0 = plan0.getCreationDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Plan plan0 = new Plan();
      plan0.setJobs((List<Job>) null);
      List<Job> list0 = plan0.getJobs();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Plan plan0 = new Plan();
      plan0.getResourceUsage();
      List<Resource> list0 = plan0.getResourceUsage();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Plan plan0 = new Plan();
      MockDate mockDate0 = new MockDate(1482, 1482, 1482, 0, (-3123));
      plan0.setCreationDate(mockDate0);
      Date date0 = plan0.getCreationDate();
      assertEquals("Sun Jul 18 19:57:00 GMT 3509", date0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Plan plan0 = new Plan();
      Stack<Job> stack0 = new Stack<Job>();
      Job job0 = new Job();
      stack0.add(job0);
      plan0.setJobs(stack0);
      List<Job> list0 = plan0.getJobs();
      assertTrue(list0.contains(job0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = new Integer((-2347));
      plan0.setgetNumberFeatures(integer0);
      Integer integer1 = plan0.getNumberFeatures();
      assertEquals((-2347), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = new Integer(524);
      plan0.setgetNumberFeatures(integer0);
      Integer integer1 = plan0.getNumberFeatures();
      assertEquals(524, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = Integer.valueOf(0);
      plan0.setgetNumberFeatures(integer0);
      Integer integer1 = plan0.getNumberFeatures();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = new Integer(1070);
      plan0.setgetNumberJobs(integer0);
      Integer integer1 = plan0.getNumberJobs();
      assertEquals(1070, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = Integer.getInteger("", 0);
      plan0.setgetNumberJobs(integer0);
      Integer integer1 = plan0.getNumberJobs();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = new Integer((-2388));
      plan0.setReleaseId(integer0);
      Integer integer1 = plan0.getReleaseId();
      assertEquals((-2388), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = new Integer(Integer.MAX_VALUE);
      plan0.setReleaseId(integer0);
      Integer integer1 = plan0.getReleaseId();
      assertEquals(Integer.MAX_VALUE, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Plan plan0 = new Plan();
      Integer integer0 = new Integer(0);
      plan0.setReleaseId(integer0);
      Integer integer1 = plan0.getReleaseId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Plan plan0 = new Plan();
      ArrayList<Resource> arrayList0 = new ArrayList<Resource>();
      Resource resource0 = new Resource();
      arrayList0.add(resource0);
      plan0.setResourceUsage(arrayList0);
      List<Resource> list0 = plan0.getResourceUsage();
      assertTrue(list0.contains(resource0));
  }
}
