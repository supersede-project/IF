/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 10:46:11 GMT 2019
 */

package eu.supersede.integration.api.feedback.orchestrator.types.serialization;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import eu.supersede.integration.api.feedback.orchestrator.types.serialization.ParameterValueDeserializer;

public class ParameterValueDeserializer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParameterValueDeserializer parameterValueDeserializer0 = new ParameterValueDeserializer();
      JsonFactory jsonFactory0 = new JsonFactory();
      JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
      String string0 = parameterValueDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParameterValueDeserializer parameterValueDeserializer0 = new ParameterValueDeserializer();
      // Undeclared exception!
      try { 
        parameterValueDeserializer0.deserialize((JsonParser) null, (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
