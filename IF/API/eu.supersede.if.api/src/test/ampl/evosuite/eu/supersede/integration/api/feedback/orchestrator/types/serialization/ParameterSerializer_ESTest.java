/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 10:43:33 GMT 2019
 */

package eu.supersede.integration.api.feedback.orchestrator.types.serialization;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import eu.supersede.integration.api.feedback.orchestrator.types.Parameter;
import eu.supersede.integration.api.feedback.orchestrator.types.serialization.ParameterSerializer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.util.MockDate;

public class ParameterSerializer_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      // Undeclared exception!
      try { 
        parameterSerializer0.serialize((Parameter) null, (JsonGenerator) null, (SerializerProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Vector<Parameter> vector0 = new Vector<Parameter>();
      Parameter parameter0 = new Parameter("e)Zq", "e)Zq", (Date) null, (Date) null, "e)Zq", (Parameter) null, vector0);
      JsonFactory jsonFactory0 = new JsonFactory();
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) null);
      SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
      Parameter parameter1 = new Parameter(0L, "SS+nx/", "id", "SS+nx/", parameter0, (List<Parameter>) null);
      parameterSerializer0.serialize(parameter1, jsonGenerator0, serializerProvider0);
      assertEquals(106, jsonGenerator0.getOutputBuffered());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Vector<Parameter> vector0 = new Vector<Parameter>();
      Parameter parameter0 = new Parameter("eZ", "eZ", (Date) null, (Date) null, "eZ", (Parameter) null, vector0);
      JsonFactory jsonFactory0 = new JsonFactory();
      vector0.add(parameter0);
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) null);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        parameterSerializer0.serialize(parameter0, jsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed eu.supersede.integration.api.feedback.orchestrator.types.Parameter)
         //
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Vector<Parameter> vector0 = new Vector<Parameter>();
      vector0.add((Parameter) null);
      Parameter parameter0 = new Parameter("/eZ", "/eZ", (Date) null, (Date) null, "/eZ", (Parameter) null, vector0);
      JsonFactory jsonFactory0 = new JsonFactory();
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) null);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      parameterSerializer0.serialize(parameter0, jsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
      assertEquals(106, jsonGenerator0.getOutputBuffered());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Vector<Parameter> vector0 = new Vector<Parameter>();
      Parameter parameter0 = new Parameter((String) null, (String) null, (Date) null, (Date) null, "ContainerBase.setCluster: start: ", (Parameter) null, vector0);
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) null);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      parameterSerializer0.serialize(parameter0, jsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
      assertEquals(129, jsonGenerator0.getOutputBuffered());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Stack<Parameter> stack0 = new Stack<Parameter>();
      MockDate mockDate0 = new MockDate();
      Parameter parameter0 = new Parameter("true", "true", mockDate0, mockDate0, "v:WU", (Parameter) null, stack0);
      JsonFactory jsonFactory0 = new JsonFactory();
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) null);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      parameterSerializer0.serialize(parameter0, jsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
      assertEquals(154, jsonGenerator0.getOutputBuffered());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Vector<Parameter> vector0 = new Vector<Parameter>();
      MockDate mockDate0 = new MockDate();
      Parameter parameter0 = new Parameter("false", "false", mockDate0, mockDate0, "#t", (Parameter) null, vector0);
      JsonFactory jsonFactory0 = new JsonFactory();
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) null);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      parameterSerializer0.serialize(parameter0, jsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
      assertEquals(154, jsonGenerator0.getOutputBuffered());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Stack<Parameter> stack0 = new Stack<Parameter>();
      MockDate mockDate0 = new MockDate();
      Parameter parameter0 = new Parameter("value", "value", mockDate0, mockDate0, "value", (Parameter) null, stack0);
      JsonFactory jsonFactory0 = new JsonFactory();
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) null);
      jsonGenerator0.writeStartObject();
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      try { 
        parameterSerializer0.serialize(parameter0, jsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Can not start an object, expecting field name (context: Object)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Parameter parameter0 = new Parameter();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, parameterSerializer0, false);
      JsonFactory jsonFactory0 = new JsonFactory();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[9];
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 3, objectMapper0, pipedOutputStream0, byteArray0, (byte)125, true);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      try { 
        parameterSerializer0.serialize(parameter0, (JsonGenerator) uTF8JsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, "_CyBMIiO1e~L$]F5j2", true);
      ObjectMapper objectMapper0 = new ObjectMapper();
      InjectableValues.Std injectableValues_Std0 = new InjectableValues.Std();
      ObjectReader objectReader0 = objectMapper0.reader((InjectableValues) injectableValues_Std0);
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 3, objectReader0, byteArrayBuilder0, byteArrayBuilder0.NO_BYTES, (-4160), true);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        parameterSerializer0.serialize((Parameter) null, (JsonGenerator) uTF8JsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, (Object) null, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      byte[] byteArray0 = new byte[2];
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 3, (ObjectCodec) null, byteArrayOutputStream0, byteArray0, (byte)23, true);
      // Undeclared exception!
      try { 
        parameterSerializer0.serialize((Parameter) null, (JsonGenerator) uTF8JsonGenerator0, (SerializerProvider) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Vector<Parameter> vector0 = new Vector<Parameter>();
      Parameter parameter0 = new Parameter("e)Zq", "e)Zq", (Date) null, (Date) null, "e)Zq", (Parameter) null, vector0);
      ObjectMapper objectMapper0 = new ObjectMapper();
      ObjectMapper objectMapper1 = objectMapper0.setAnnotationIntrospectors((AnnotationIntrospector) null, (AnnotationIntrospector) null);
      JsonFactory jsonFactory0 = new JsonFactory(objectMapper1);
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) null);
      SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
      // Undeclared exception!
      try { 
        parameterSerializer0.serialize(parameter0, jsonGenerator0, serializerProvider0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Stack<Parameter> stack0 = new Stack<Parameter>();
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Parameter parameter0 = new Parameter("/d>m;3Q", "JSON", (String) null, (Parameter) null, stack0);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, (Object) null, true);
      ObjectMapper objectMapper0 = new ObjectMapper();
      ObjectReader objectReader0 = objectMapper0.reader((FormatSchema) null);
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1, objectReader0, (OutputStream) null);
      // Undeclared exception!
      try { 
        parameterSerializer0.serialize(parameter0, (JsonGenerator) uTF8JsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented for ObjectReader
         //
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      ParameterSerializer parameterSerializer0 = new ParameterSerializer();
      Parameter parameter0 = new Parameter();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      Object object0 = new Object();
      IOContext iOContext0 = new IOContext(bufferRecycler0, object0, false);
      ObjectMapper objectMapper0 = new ObjectMapper();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(";Z6daxWk-OCc", false);
      byte[] byteArray0 = new byte[6];
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 2, objectMapper0, mockFileOutputStream0, byteArray0, 1236, false);
      JsonGeneratorDelegate jsonGeneratorDelegate0 = new JsonGeneratorDelegate(uTF8JsonGenerator0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      parameterSerializer0.serialize(parameter0, (JsonGenerator) jsonGeneratorDelegate0, (SerializerProvider) defaultSerializerProvider_Impl0);
  }
}
