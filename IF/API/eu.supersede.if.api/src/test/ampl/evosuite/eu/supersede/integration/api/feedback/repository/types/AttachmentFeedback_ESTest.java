/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 10:48:44 GMT 2019
 */

package eu.supersede.integration.api.feedback.repository.types;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.supersede.integration.api.feedback.orchestrator.types.ConfigurationMechanism;
import eu.supersede.integration.api.feedback.orchestrator.types.Mechanism;
import eu.supersede.integration.api.feedback.orchestrator.types.MechanismType;
import eu.supersede.integration.api.feedback.orchestrator.types.Parameter;
import eu.supersede.integration.api.feedback.repository.types.AttachmentFeedback;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.MissingFormatArgumentException;

public class AttachmentFeedback_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("lzjm9q;z", 0L);
      long long0 = attachmentFeedback0.getId();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("", (-302), "", "", (-302));
      attachmentFeedback0.getMechanism();
      assertEquals((-302), attachmentFeedback0.getSize());
      assertEquals((-302L), attachmentFeedback0.getMechanismId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      String string0 = attachmentFeedback0.getPath();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback(0L);
      assertEquals(0, attachmentFeedback0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("aelmf;!2<", 756L);
      attachmentFeedback0.setFileExtension("aelmf;!2<");
      assertEquals(756L, attachmentFeedback0.getMechanismId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("", 131, "", "", (-1242L));
      attachmentFeedback0.getFileExtension();
      assertEquals((-1242L), attachmentFeedback0.getMechanismId());
      assertEquals(131, attachmentFeedback0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("", (-302), "", "", (-302));
      // Undeclared exception!
      try { 
        attachmentFeedback0.toString();
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // d != java.lang.String
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("aelmf;!2<", 756L);
      attachmentFeedback0.setMechanismId(756L);
      assertEquals(756L, attachmentFeedback0.getMechanismId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      attachmentFeedback0.setId((-1L));
      assertEquals((-1L), attachmentFeedback0.getId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      int int0 = attachmentFeedback0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      String string0 = attachmentFeedback0.getPart();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      long long0 = attachmentFeedback0.getMechanismId();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      // Undeclared exception!
      try { 
        attachmentFeedback0.toString();
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%s'
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("|&\"jQB^ ;SK8*]iAq1*", (-801), "|&\"jQB^ ;SK8*]iAq1*", "(@T48-U|Nkt+/:<.o", 64L);
      String string0 = attachmentFeedback0.getFileExtension();
      assertEquals("|&\"jQB^ ;SK8*]iAq1*", attachmentFeedback0.getPath());
      assertEquals("|&\"jQB^ ;SK8*]iAq1*", attachmentFeedback0.getPart());
      assertEquals((-801), attachmentFeedback0.getSize());
      assertEquals(64L, attachmentFeedback0.getMechanismId());
      assertEquals("(@T48-U|Nkt+/:<.o", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      String string0 = attachmentFeedback0.getFileExtension();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("lzjm9q;z", 0L);
      attachmentFeedback0.id = (-220L);
      long long0 = attachmentFeedback0.getId();
      assertEquals((-220L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("", 0L);
      attachmentFeedback0.id = 1L;
      long long0 = attachmentFeedback0.getId();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("aelmf;!2<", 756L);
      Mechanism mechanism0 = new Mechanism();
      mechanism0.setId((-2147483648L));
      attachmentFeedback0.setMechanism(mechanism0);
      attachmentFeedback0.getMechanism();
      assertEquals(756L, attachmentFeedback0.getMechanismId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("aelmf;!2<", 756L);
      Mechanism mechanism0 = new Mechanism();
      mechanism0.setId(756L);
      attachmentFeedback0.setMechanism(mechanism0);
      attachmentFeedback0.getMechanism();
      assertEquals(756L, attachmentFeedback0.getMechanismId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("", (-302), "", "", (-302));
      MechanismType mechanismType0 = MechanismType.ATTACHMENT_TYPE;
      Mechanism mechanism0 = new Mechanism(mechanismType0, (List<ConfigurationMechanism>) null, (List<Parameter>) null);
      mechanism0.setOrder((-302));
      attachmentFeedback0.setMechanism(mechanism0);
      attachmentFeedback0.getMechanism();
      assertEquals((-302L), attachmentFeedback0.getMechanismId());
      assertEquals((-302), attachmentFeedback0.getSize());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      Mechanism mechanism0 = new Mechanism();
      mechanism0.setOrder(729);
      attachmentFeedback0.setMechanism(mechanism0);
      Mechanism mechanism1 = attachmentFeedback0.getMechanism();
      assertFalse(mechanism1.isActive());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("aelmf;!2<", 756L);
      Mechanism mechanism0 = new Mechanism();
      attachmentFeedback0.setMechanism(mechanism0);
      mechanism0.setActive(true);
      attachmentFeedback0.getMechanism();
      assertEquals(756L, attachmentFeedback0.getMechanismId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("U=ClVXH8p/", (-1L));
      long long0 = attachmentFeedback0.getMechanismId();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback((String) null, 938L);
      long long0 = attachmentFeedback0.getMechanismId();
      assertEquals(938L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("", 131, "", "", (-1242L));
      attachmentFeedback0.getPart();
      assertEquals(131, attachmentFeedback0.getSize());
      assertEquals((-1242L), attachmentFeedback0.getMechanismId());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      attachmentFeedback0.setPart("01| T2");
      String string0 = attachmentFeedback0.getPart();
      assertEquals("01| T2", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("|&\"jQB^ ;SK8*]iAq1*", (-801), "|&\"jQB^ ;SK8*]iAq1*", "(@T48-U|Nkt+/:<.o", 64L);
      assertEquals("|&\"jQB^ ;SK8*]iAq1*", attachmentFeedback0.getPath());
      
      attachmentFeedback0.setPath("");
      attachmentFeedback0.getPath();
      assertEquals((-801), attachmentFeedback0.getSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("j=LN,Sje`Vg+[ihq", 160, "j=LN,Sje`Vg+[ihq", "", 160);
      String string0 = attachmentFeedback0.getPath();
      assertEquals("", attachmentFeedback0.getFileExtension());
      assertEquals("j=LN,Sje`Vg+[ihq", string0);
      assertEquals("j=LN,Sje`Vg+[ihq", attachmentFeedback0.getPart());
      assertEquals(160L, attachmentFeedback0.getMechanismId());
      assertEquals(160, attachmentFeedback0.getSize());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback("HG/@Qq+'p0<op@}=$W", 0, "HG/@Qq+'p0<op@}=$W", "HG/@Qq+'p0<op@}=$W", (-2147483648L));
      attachmentFeedback0.setSize((-1924));
      int int0 = attachmentFeedback0.getSize();
      assertEquals((-1924), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AttachmentFeedback attachmentFeedback0 = new AttachmentFeedback();
      attachmentFeedback0.setSize(2218);
      int int0 = attachmentFeedback0.getSize();
      assertEquals(2218, int0);
  }
}