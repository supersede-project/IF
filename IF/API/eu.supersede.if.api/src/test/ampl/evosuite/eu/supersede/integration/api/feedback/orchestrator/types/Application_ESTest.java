/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 10:22:48 GMT 2019
 */

package eu.supersede.integration.api.feedback.orchestrator.types;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import eu.supersede.integration.api.feedback.orchestrator.types.ApiUser;
import eu.supersede.integration.api.feedback.orchestrator.types.ApiUserPermission;
import eu.supersede.integration.api.feedback.orchestrator.types.Application;
import eu.supersede.integration.api.feedback.orchestrator.types.Configuration;
import eu.supersede.integration.api.feedback.orchestrator.types.ConfigurationMechanism;
import eu.supersede.integration.api.feedback.orchestrator.types.ConfigurationUserGroup;
import eu.supersede.integration.api.feedback.orchestrator.types.GeneralConfiguration;
import eu.supersede.integration.api.feedback.orchestrator.types.Mechanism;
import eu.supersede.integration.api.feedback.orchestrator.types.TriggerType;
import eu.supersede.integration.api.feedback.orchestrator.types.User;
import eu.supersede.integration.api.feedback.orchestrator.types.UserGroup;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.mock.java.util.MockDate;

public class Application_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Application application0 = new Application();
      application0.setState((-2702));
      assertEquals((-2702), application0.getState());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1634, (-1), (-1), 10, 775, 306654252);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("+P$.`eeOAX", 10, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      application0.setName("+P$.`eeOAX");
      assertEquals(10, application0.getState());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Application application0 = new Application();
      MockDate mockDate0 = new MockDate();
      application0.setUpdatedAt(mockDate0);
      assertEquals(0, application0.getState());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2108L);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      Vector<Configuration> vector0 = new Vector<Configuration>();
      LinkedList<User> linkedList0 = new LinkedList<User>();
      Application application0 = new Application("4y.BAQp", 1, mockDate0, mockDate0, generalConfiguration0, vector0, linkedList0);
      application0.getConfigurations();
      assertEquals(1, application0.getState());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Application application0 = new Application();
      LinkedList<ApiUserPermission> linkedList0 = new LinkedList<ApiUserPermission>();
      application0.setApiUserPermissions(linkedList0);
      assertEquals(0L, application0.getId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Stack<Configuration> stack0 = new Stack<Configuration>();
      Application application0 = new Application("", 1, (Date) null, (Date) null, stack0);
      application0.getGeneralConfiguration();
      assertEquals(1, application0.getState());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      MockDate mockDate0 = new MockDate();
      Application application0 = new Application("", (-4192), mockDate0, mockDate0, linkedList0);
      int int0 = application0.getState();
      assertEquals((-4192), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Application application0 = new Application();
      Date date0 = application0.getCreatedAt();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Application application0 = new Application();
      Vector<UserGroup> vector0 = new Vector<UserGroup>();
      application0.setUserGroups(vector0);
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Application application0 = new Application();
      application0.onUpdate();
      assertEquals(0, application0.getState());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Application application0 = new Application();
      application0.setCreatedAt((Date) null);
      assertEquals(0L, application0.getId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate(8202, 8202, 8202);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      LinkedList<User> linkedList1 = new LinkedList<User>();
      ArrayList<UserGroup> arrayList0 = new ArrayList<UserGroup>();
      Application application0 = new Application("/3>.c", 8202, mockDate0, mockDate0, generalConfiguration0, linkedList0, linkedList1, arrayList0);
      application0.setId((-1L));
      application0.filterByUserIdentification("/3>.c");
      assertEquals((-1L), application0.getId());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Application application0 = new Application();
      application0.onCreate();
      Date date0 = application0.getCreatedAt();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Application application0 = new Application();
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      application0.setGeneralConfiguration(generalConfiguration0);
      assertEquals(0L, application0.getId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate(70L);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Vector<User> vector0 = new Vector<User>();
      ArrayList<UserGroup> arrayList0 = new ArrayList<UserGroup>(3);
      Application application0 = new Application("", 3, mockDate0, mockDate0, generalConfiguration0, linkedList0, vector0, arrayList0);
      application0.getName();
      assertEquals(3, application0.getState());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0);
      Vector<Configuration> vector0 = new Vector<Configuration>(0, 5);
      Application application0 = new Application("1j%,N?irRJ~@5s@@rn", 0, mockDate0, mockDate0, vector0);
      application0.getUpdatedAt();
      assertEquals(0, application0.getState());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2410), 2, (-2410));
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("'a\"^$~a?]^", 2355, mockDate0, mockDate0, linkedList0);
      application0.getUserGroups();
      assertEquals(2355, application0.getState());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2108L);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      Vector<Configuration> vector0 = new Vector<Configuration>();
      LinkedList<User> linkedList0 = new LinkedList<User>();
      Application application0 = new Application("4y.BAQp", 1, mockDate0, mockDate0, generalConfiguration0, vector0, linkedList0);
      application0.getApiUserPermissions();
      assertEquals(1, application0.getState());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1634, (-1), (-1), 10, 775, 306654252);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("+P$.`eeOAX", 10, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      application0.getId();
      assertEquals(10, application0.getState());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2108L);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      Vector<Configuration> vector0 = new Vector<Configuration>();
      LinkedList<User> linkedList0 = new LinkedList<User>();
      ArrayList<UserGroup> arrayList0 = new ArrayList<UserGroup>();
      Application application0 = new Application("4y.BAQp", (-1015), mockDate0, mockDate0, generalConfiguration0, vector0, linkedList0, arrayList0, (List<ApiUserPermission>) null);
      Application application1 = application0.filterByUserGroupId((-3097L));
      assertEquals((-1015), application1.getState());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1634, (-1), (-1), 10, 775, 306654252);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("+P$.`eeOAX", 10, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      String string0 = application0.toString();
      assertEquals("Application[id=0, name='+P$.`eeOAX', state='10', generalConfiguration='GeneralConfiguration[id=0, name='null']', configurations='']", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Application application0 = new Application();
      String string0 = application0.toString();
      assertEquals("Application[id=0, name='null', state='0', generalConfiguration='null', configurations='null']", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1634, (-1), (-1), 10, 775, 306654252);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("+P$.`eeOAX", 10, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      application0.filterByLanguage("C", "eu.supersede.integration.api.feedback.orchestrator.types.Application");
      assertEquals(10, application0.getState());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashSet<Configuration> linkedHashSet0 = new LinkedHashSet<Configuration>();
      linkedHashSet0.add((Configuration) null);
      Vector<Configuration> vector0 = new Vector<Configuration>(linkedHashSet0);
      Application application0 = new Application(", ", (-542), (Date) null, (Date) null, vector0);
      // Undeclared exception!
      try { 
        application0.filterByLanguage(", ", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Application application0 = new Application();
      // Undeclared exception!
      try { 
        application0.filterByUserGroupId(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Application application0 = new Application();
      // Undeclared exception!
      try { 
        application0.filterByUserIdentification("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Application application0 = new Application();
      // Undeclared exception!
      try { 
        application0.filterForAnonymousUser();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Application application0 = new Application();
      Stack<Configuration> stack0 = new Stack<Configuration>();
      stack0.add((Configuration) null);
      application0.setConfigurations(stack0);
      // Undeclared exception!
      try { 
        application0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate(70L);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Vector<User> vector0 = new Vector<User>();
      ArrayList<UserGroup> arrayList0 = new ArrayList<UserGroup>(3);
      Application application0 = new Application("J~+VAWUp\"zWw)(", 4099, mockDate0, mockDate0, generalConfiguration0, linkedList0, vector0, arrayList0);
      application0.setId((-528L));
      application0.filterByUserGroupId(2465L);
      assertEquals((-528L), application0.getId());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1634, (-1), (-1), 10, 775, 306654252);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("+P$.`eeOAX", 10, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      application0.setId(306654252);
      application0.filterByUserGroupId((-1L));
      assertEquals(306654252L, application0.getId());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Vector<User> vector0 = new Vector<User>();
      Application application0 = new Application("CharMatcher.singleWidth()", 0, (Date) null, (Date) null, generalConfiguration0, linkedList0, vector0);
      Application application1 = application0.filterByUserGroupId(0L);
      assertEquals(0, application1.getState());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1634, (-1), (-1), 10, 775, 306654252);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("+P$.`eeOAX", 10, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      application0.setId(306654252);
      application0.filterByUserIdentification("eu.supersede.integration.api.feedback.orchestrator.types.Application");
      assertEquals(306654252L, application0.getId());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2108L);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      Vector<Configuration> vector0 = new Vector<Configuration>();
      LinkedList<User> linkedList0 = new LinkedList<User>();
      ArrayList<UserGroup> arrayList0 = new ArrayList<UserGroup>();
      Application application0 = new Application("4y.BAQp", (-1015), mockDate0, mockDate0, generalConfiguration0, vector0, linkedList0, arrayList0, (List<ApiUserPermission>) null);
      Application application1 = application0.filterByUserIdentification("");
      assertEquals((-1015), application1.getState());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2410), 2, (-2410));
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Stack<User> stack0 = new Stack<User>();
      Vector<ApiUserPermission> vector0 = new Vector<ApiUserPermission>();
      Application application0 = new Application("Application[id=%d, name='%s', state='%d', generalConfiguration='%s', configurations='%s']", 0, mockDate0, mockDate0, generalConfiguration0, linkedList0, stack0, (List<UserGroup>) null, vector0);
      Application application1 = application0.filterByUserIdentification("M-JG`e^M]J");
      assertEquals(0, application1.getState());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2108L);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      Vector<Configuration> vector0 = new Vector<Configuration>();
      LinkedList<User> linkedList0 = new LinkedList<User>();
      Application application0 = new Application("4y.BAQp", 1, mockDate0, mockDate0, generalConfiguration0, vector0, linkedList0);
      application0.setId((-1907L));
      application0.filterForAnonymousUser();
      assertEquals((-1907L), application0.getId());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1634, (-1), (-1), 10, 775, 306654252);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("+P$.`eeOAX", 10, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      application0.setId(306654252);
      application0.filterForAnonymousUser();
      assertEquals(306654252L, application0.getId());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2108L);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      Vector<Configuration> vector0 = new Vector<Configuration>();
      LinkedList<User> linkedList0 = new LinkedList<User>();
      ArrayList<UserGroup> arrayList0 = new ArrayList<UserGroup>();
      Application application0 = new Application("4y.BAQp", (-1015), mockDate0, mockDate0, generalConfiguration0, vector0, linkedList0, arrayList0, (List<ApiUserPermission>) null);
      Application application1 = application0.filterForAnonymousUser();
      assertEquals((-1015), application1.getState());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("vuu%>mfZ", 0, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      Application application1 = application0.filterForAnonymousUser();
      assertEquals(0, application1.getState());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2410), 2, (-2410));
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("'a\"^$~a?]^", 2355, mockDate0, mockDate0, linkedList0);
      Stack<User> stack0 = new Stack<User>();
      Vector<ApiUserPermission> vector0 = new Vector<ApiUserPermission>();
      ApiUser apiUser0 = new ApiUser("'a\"^$~a?]^", "aMF|m[\\N,2PZ");
      ApiUserPermission apiUserPermission0 = new ApiUserPermission(apiUser0, application0, false);
      vector0.add(apiUserPermission0);
      assertEquals(2355, application0.getState());
      
      Application application1 = new Application("Application[id=%d, name='%s', state='%d', generalConfiguration='%s', configurations='%s']", 0, mockDate0, mockDate0, generalConfiguration0, linkedList0, stack0, (List<UserGroup>) null, vector0);
      List<ApiUserPermission> list0 = application1.getApiUserPermissions();
      assertTrue(list0.contains(apiUserPermission0));
      assertNotNull(list0);
      assertEquals(0, application1.getState());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Vector<User> vector0 = new Vector<User>();
      Vector<UserGroup> vector1 = new Vector<UserGroup>();
      Vector<ApiUserPermission> vector2 = new Vector<ApiUserPermission>();
      Application application0 = new Application("", (-785), (Date) null, (Date) null, generalConfiguration0, linkedList0, vector0, vector1, vector2);
      application0.getApiUserPermissions();
      assertEquals((-785), application0.getState());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(302, 302, 65536, 1, 302);
      ArrayList<Configuration> arrayList0 = new ArrayList<Configuration>();
      Application application0 = new Application("com.google.common.base.Functions$IdentityFunction", 65536, mockDate0, mockDate0, arrayList0);
      Configuration configuration0 = new Configuration();
      arrayList0.add(configuration0);
      application0.getConfigurations();
      assertEquals(65536, application0.getState());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Application application0 = new Application();
      List<Configuration> list0 = application0.getConfigurations();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-690L));
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      Stack<Configuration> stack0 = new Stack<Configuration>();
      generalConfiguration0.setId((-690L));
      Application application0 = new Application("missCount", 66, mockDate0, mockDate0, generalConfiguration0, stack0);
      application0.getGeneralConfiguration();
      assertEquals(66, application0.getState());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2410), 2, (-2410));
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Stack<User> stack0 = new Stack<User>();
      Vector<ApiUserPermission> vector0 = new Vector<ApiUserPermission>();
      Application application0 = new Application("Application[id=%d, name='%s', state='%d', generalConfiguration='%s', configurations='%s']", 0, mockDate0, mockDate0, generalConfiguration0, linkedList0, stack0, (List<UserGroup>) null, vector0);
      application0.getGeneralConfiguration();
      assertEquals(0, application0.getState());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Application application0 = new Application();
      application0.setId((-2147483648L));
      long long0 = application0.getId();
      assertEquals((-2147483648L), long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1634, (-1), (-1), 10, 775, 306654252);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("+P$.`eeOAX", 10, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      application0.setId(306654252);
      long long0 = application0.getId();
      assertEquals(306654252L, long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate(302, 302, 0, 1, 302);
      ArrayList<Configuration> arrayList0 = new ArrayList<Configuration>();
      Application application0 = new Application("com.google.common.base.Functions$IdentityFunction", 65536, mockDate0, mockDate0, arrayList0);
      application0.getName();
      assertEquals(65536, application0.getState());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Application application0 = new Application();
      String string0 = application0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockDate mockDate0 = new MockDate(70L);
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("com.fasterxml.jackson.databind.KeyDeserializer", 3, mockDate0, mockDate0, linkedList0);
      int int0 = application0.getState();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Vector<User> vector0 = new Vector<User>();
      Application application0 = new Application("CharMatcher.singleWidth()", 0, (Date) null, (Date) null, generalConfiguration0, linkedList0, vector0);
      int int0 = application0.getState();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Vector<User> vector0 = new Vector<User>();
      Vector<UserGroup> vector1 = new Vector<UserGroup>();
      Vector<ApiUserPermission> vector2 = new Vector<ApiUserPermission>();
      Application application0 = new Application("", (-785), (Date) null, (Date) null, generalConfiguration0, linkedList0, vector0, vector1, vector2);
      application0.getUpdatedAt();
      assertEquals((-785), application0.getState());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(70L);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Vector<User> vector0 = new Vector<User>();
      ArrayList<UserGroup> arrayList0 = new ArrayList<UserGroup>(3);
      Application application0 = new Application("", 3, mockDate0, mockDate0, generalConfiguration0, linkedList0, vector0, arrayList0);
      UserGroup userGroup0 = new UserGroup("eR9d C:%>sX", vector0, application0);
      arrayList0.add(userGroup0);
      List<UserGroup> list0 = application0.getUserGroups();
      assertTrue(list0.contains(userGroup0));
      assertEquals(3, application0.getState());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4, (-2059), 4, 5, 4, 5);
      Vector<Configuration> vector0 = new Vector<Configuration>();
      Vector<UserGroup> vector1 = new Vector<UserGroup>();
      Application application0 = new Application("com.google.common.base.CharMatcher$JavaLetterOrDigit", (-2059), mockDate0, mockDate0, (GeneralConfiguration) null, vector0, (List<User>) null, vector1, (List<ApiUserPermission>) null);
      List<UserGroup> list0 = application0.getUserGroups();
      assertEquals((-2059), application0.getState());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Application application0 = new Application();
      Stack<User> stack0 = new Stack<User>();
      User user0 = new User();
      stack0.add(user0);
      application0.setUsers(stack0);
      List<User> list0 = application0.getUsers();
      assertTrue(list0.contains(user0));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Vector<User> vector0 = new Vector<User>();
      Vector<UserGroup> vector1 = new Vector<UserGroup>();
      Vector<ApiUserPermission> vector2 = new Vector<ApiUserPermission>();
      Application application0 = new Application("", (-785), (Date) null, (Date) null, generalConfiguration0, linkedList0, vector0, vector1, vector2);
      application0.getUsers();
      assertEquals((-785), application0.getState());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1634, (-1), (-1), 10, 775, 306654252);
      GeneralConfiguration generalConfiguration0 = new GeneralConfiguration();
      LinkedList<Configuration> linkedList0 = new LinkedList<Configuration>();
      Application application0 = new Application("+P$.`eeOAX", 10, mockDate0, mockDate0, generalConfiguration0, linkedList0);
      application0.getUsers();
      assertEquals(10, application0.getState());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3), (-2111), (-3), 766, (-3), 4);
      ArrayList<Configuration> arrayList0 = new ArrayList<Configuration>(766);
      Application application0 = new Application("Application[id=%d, name='%s', state='%d', generalConfiguration='%s', configurations='%s']", (-1203), mockDate0, mockDate0, (GeneralConfiguration) null, arrayList0);
      TriggerType triggerType0 = TriggerType.PUSH;
      Vector<ConfigurationUserGroup> vector0 = new Vector<ConfigurationUserGroup>();
      ArrayList<Mechanism> arrayList1 = new ArrayList<Mechanism>();
      Configuration configuration0 = new Configuration("Application[id=%d, name='%s', state='%d', generalConfiguration='%s', configurations='%s']", triggerType0, mockDate0, mockDate0, (List<ConfigurationMechanism>) null, vector0, application0, (GeneralConfiguration) null, arrayList1);
      arrayList0.add(configuration0);
      application0.filterByLanguage(">(9JtL*KQc-", "Application[id=%d, name='%s', state='%d', generalConfiguration='%s', configurations='%s']");
      assertEquals((-1203), application0.getState());
  }
}