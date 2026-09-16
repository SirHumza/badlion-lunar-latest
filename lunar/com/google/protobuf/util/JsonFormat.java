package com.google.protobuf.util;

import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.protobuf.Any;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Duration;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.FieldMask;
import com.google.protobuf.FloatValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ListValue;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.NullValue;
import com.google.protobuf.StringValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt64Value;
import com.google.protobuf.Value;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.logging.Logger;
import javax.annotation.Nullable;

public class JsonFormat {
   private static final Logger logger = Logger.getLogger(JsonFormat.class.getName());

   private JsonFormat() {
   }

   public static JsonFormat.Printer printer() {
      return new JsonFormat.Printer(
         com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(),
         JsonFormat.TypeRegistry.getEmptyTypeRegistry(),
         false,
         Collections.emptySet(),
         false,
         false,
         false,
         false
      );
   }

   public static JsonFormat.Parser parser() {
      return new JsonFormat.Parser(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), JsonFormat.TypeRegistry.getEmptyTypeRegistry(), false, 100);
   }

   private static String unsignedToString(int var0) {
      return var0 >= 0 ? Integer.toString(var0) : Long.toString(var0 & 4294967295L);
   }

   private static String unsignedToString(long var0) {
      return var0 >= 0L ? Long.toString(var0) : BigInteger.valueOf(var0 & Long.MAX_VALUE).setBit(63).toString();
   }

   private static String getTypeName(String var0) {
      String[] var1 = var0.split("/");
      if (var1.length == 1) {
         throw new InvalidProtocolBufferException("Invalid type url found: " + var0);
      } else {
         return var1[var1.length - 1];
      }
   }

   private static final class CompactTextGenerator implements JsonFormat.TextGenerator {
      private final Appendable output;

      private CompactTextGenerator(Appendable var1) {
         this.output = var1;
      }

      @Override
      public void indent() {
      }

      @Override
      public void outdent() {
      }

      @Override
      public void print(CharSequence var1) {
         this.output.append(var1);
      }
   }

   public static class Parser {
      private final com.google.protobuf.TypeRegistry registry;
      private final JsonFormat.TypeRegistry oldRegistry;
      private final boolean ignoringUnknownFields;
      private final int recursionLimit;
      private static final int DEFAULT_RECURSION_LIMIT = 100;

      private Parser(com.google.protobuf.TypeRegistry var1, JsonFormat.TypeRegistry var2, boolean var3, int var4) {
         this.registry = var1;
         this.oldRegistry = var2;
         this.ignoringUnknownFields = var3;
         this.recursionLimit = var4;
      }

      public JsonFormat.Parser usingTypeRegistry(JsonFormat.TypeRegistry var1) {
         if (this.oldRegistry == JsonFormat.TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
            return new JsonFormat.Parser(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), var1, this.ignoringUnknownFields, this.recursionLimit);
         } else {
            throw new IllegalArgumentException("Only one registry is allowed.");
         }
      }

      public JsonFormat.Parser usingTypeRegistry(com.google.protobuf.TypeRegistry var1) {
         if (this.oldRegistry == JsonFormat.TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
            return new JsonFormat.Parser(var1, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit);
         } else {
            throw new IllegalArgumentException("Only one registry is allowed.");
         }
      }

      public JsonFormat.Parser ignoringUnknownFields() {
         return new JsonFormat.Parser(this.registry, this.oldRegistry, true, this.recursionLimit);
      }

      public void merge(String var1, Message.Builder var2) {
         new JsonFormat.ParserImpl(this.registry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit).merge(var1, var2);
      }

      public void merge(Reader var1, Message.Builder var2) {
         new JsonFormat.ParserImpl(this.registry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit).merge(var1, var2);
      }

      JsonFormat.Parser usingRecursionLimit(int var1) {
         return new JsonFormat.Parser(this.registry, this.oldRegistry, this.ignoringUnknownFields, var1);
      }
   }

   private static class ParserImpl {
      private final com.google.protobuf.TypeRegistry registry;
      private final JsonFormat.TypeRegistry oldRegistry;
      private final boolean ignoringUnknownFields;
      private final int recursionLimit;
      private int currentDepth;
      private static final Map<String, JsonFormat.ParserImpl.WellKnownTypeParser> wellKnownTypeParsers = buildWellKnownTypeParsers();
      private final Map<Descriptors.Descriptor, Map<String, Descriptors.FieldDescriptor>> fieldNameMaps = new HashMap<>();
      private static final BigInteger MAX_UINT64 = new BigInteger("FFFFFFFFFFFFFFFF", 16);
      private static final double EPSILON = 1.0E-6;
      private static final BigDecimal MORE_THAN_ONE = new BigDecimal(String.valueOf(1.000001));
      private static final BigDecimal MAX_DOUBLE = new BigDecimal(String.valueOf(Double.MAX_VALUE)).multiply(MORE_THAN_ONE);
      private static final BigDecimal MIN_DOUBLE = new BigDecimal(String.valueOf(-Double.MAX_VALUE)).multiply(MORE_THAN_ONE);

      ParserImpl(com.google.protobuf.TypeRegistry var1, JsonFormat.TypeRegistry var2, boolean var3, int var4) {
         this.registry = var1;
         this.oldRegistry = var2;
         this.ignoringUnknownFields = var3;
         this.recursionLimit = var4;
         this.currentDepth = 0;
      }

      void merge(Reader var1, Message.Builder var2) {
         try {
            JsonReader var3 = new JsonReader(var1);
            var3.setLenient(false);
            this.merge(JsonParser.parseReader(var3), var2);
         } catch (JsonIOException var4) {
            if (var4.getCause() instanceof IOException) {
               throw (IOException)var4.getCause();
            } else {
               throw new InvalidProtocolBufferException(var4.getMessage(), var4);
            }
         } catch (RuntimeException var5) {
            throw new InvalidProtocolBufferException(var5.getMessage(), var5);
         }
      }

      void merge(String var1, Message.Builder var2) {
         try {
            JsonReader var3 = new JsonReader(new StringReader(var1));
            var3.setLenient(false);
            this.merge(JsonParser.parseReader(var3), var2);
         } catch (RuntimeException var5) {
            InvalidProtocolBufferException var4 = new InvalidProtocolBufferException(var5.getMessage());
            var4.initCause(var5);
            throw var4;
         }
      }

      private static Map<String, JsonFormat.ParserImpl.WellKnownTypeParser> buildWellKnownTypeParsers() {
         HashMap var0 = new HashMap();
         var0.put(Any.getDescriptor().getFullName(), new JsonFormat.ParserImpl.WellKnownTypeParser() {
            @Override
            public void merge(JsonFormat.ParserImpl var1, JsonElement var2, Message.Builder var3) {
               var1.mergeAny(var2, var3);
            }
         });
         JsonFormat.ParserImpl.WellKnownTypeParser var1 = new JsonFormat.ParserImpl.WellKnownTypeParser() {
            @Override
            public void merge(JsonFormat.ParserImpl var1, JsonElement var2, Message.Builder var3) {
               var1.mergeWrapper(var2, var3);
            }
         };
         var0.put(BoolValue.getDescriptor().getFullName(), var1);
         var0.put(Int32Value.getDescriptor().getFullName(), var1);
         var0.put(UInt32Value.getDescriptor().getFullName(), var1);
         var0.put(Int64Value.getDescriptor().getFullName(), var1);
         var0.put(UInt64Value.getDescriptor().getFullName(), var1);
         var0.put(StringValue.getDescriptor().getFullName(), var1);
         var0.put(BytesValue.getDescriptor().getFullName(), var1);
         var0.put(FloatValue.getDescriptor().getFullName(), var1);
         var0.put(DoubleValue.getDescriptor().getFullName(), var1);
         var0.put(Timestamp.getDescriptor().getFullName(), new JsonFormat.ParserImpl.WellKnownTypeParser() {
            @Override
            public void merge(JsonFormat.ParserImpl var1, JsonElement var2, Message.Builder var3) {
               var1.mergeTimestamp(var2, var3);
            }
         });
         var0.put(Duration.getDescriptor().getFullName(), new JsonFormat.ParserImpl.WellKnownTypeParser() {
            @Override
            public void merge(JsonFormat.ParserImpl var1, JsonElement var2, Message.Builder var3) {
               var1.mergeDuration(var2, var3);
            }
         });
         var0.put(FieldMask.getDescriptor().getFullName(), new JsonFormat.ParserImpl.WellKnownTypeParser() {
            @Override
            public void merge(JsonFormat.ParserImpl var1, JsonElement var2, Message.Builder var3) {
               var1.mergeFieldMask(var2, var3);
            }
         });
         var0.put(Struct.getDescriptor().getFullName(), new JsonFormat.ParserImpl.WellKnownTypeParser() {
            @Override
            public void merge(JsonFormat.ParserImpl var1, JsonElement var2, Message.Builder var3) {
               var1.mergeStruct(var2, var3);
            }
         });
         var0.put(ListValue.getDescriptor().getFullName(), new JsonFormat.ParserImpl.WellKnownTypeParser() {
            @Override
            public void merge(JsonFormat.ParserImpl var1, JsonElement var2, Message.Builder var3) {
               var1.mergeListValue(var2, var3);
            }
         });
         var0.put(Value.getDescriptor().getFullName(), new JsonFormat.ParserImpl.WellKnownTypeParser() {
            @Override
            public void merge(JsonFormat.ParserImpl var1, JsonElement var2, Message.Builder var3) {
               var1.mergeValue(var2, var3);
            }
         });
         return var0;
      }

      private void merge(JsonElement var1, Message.Builder var2) {
         JsonFormat.ParserImpl.WellKnownTypeParser var3 = wellKnownTypeParsers.get(var2.getDescriptorForType().getFullName());
         if (var3 != null) {
            var3.merge(this, var1, var2);
         } else {
            this.mergeMessage(var1, var2, false);
         }
      }

      private Map<String, Descriptors.FieldDescriptor> getFieldNameMap(Descriptors.Descriptor var1) {
         if (this.fieldNameMaps.containsKey(var1)) {
            return this.fieldNameMaps.get(var1);
         }

         HashMap var2 = new HashMap();

         for (Descriptors.FieldDescriptor var4 : var1.getFields()) {
            var2.put(var4.getName(), var4);
            var2.put(var4.getJsonName(), var4);
         }

         this.fieldNameMaps.put(var1, var2);
         return var2;
      }

      private void mergeMessage(JsonElement var1, Message.Builder var2, boolean var3) {
         if (!(var1 instanceof JsonObject)) {
            throw new InvalidProtocolBufferException("Expect message object but got: " + var1);
         }

         JsonObject var4 = (JsonObject)var1;
         Map var5 = this.getFieldNameMap(var2.getDescriptorForType());

         for (Entry var7 : var4.entrySet()) {
            if (!var3 || !((String)var7.getKey()).equals("@type")) {
               Descriptors.FieldDescriptor var8 = (Descriptors.FieldDescriptor)var5.get(var7.getKey());
               if (var8 == null) {
                  if (!this.ignoringUnknownFields) {
                     throw new InvalidProtocolBufferException(
                        "Cannot find field: " + (String)var7.getKey() + " in message " + var2.getDescriptorForType().getFullName()
                     );
                  }
               } else {
                  this.mergeField(var8, (JsonElement)var7.getValue(), var2);
               }
            }
         }
      }

      private void mergeAny(JsonElement var1, Message.Builder var2) {
         Descriptors.Descriptor var3 = var2.getDescriptorForType();
         Descriptors.FieldDescriptor var4 = var3.findFieldByName("type_url");
         Descriptors.FieldDescriptor var5 = var3.findFieldByName("value");
         if (var4 == null
            || var5 == null
            || var4.getType() != Descriptors.FieldDescriptor.Type.STRING
            || var5.getType() != Descriptors.FieldDescriptor.Type.BYTES) {
            throw new InvalidProtocolBufferException("Invalid Any type.");
         }

         if (!(var1 instanceof JsonObject)) {
            throw new InvalidProtocolBufferException("Expect message object but got: " + var1);
         }

         JsonObject var6 = (JsonObject)var1;
         if (!var6.entrySet().isEmpty()) {
            JsonElement var7 = var6.get("@type");
            if (var7 == null) {
               throw new InvalidProtocolBufferException("Missing type url when parsing: " + var1);
            }

            String var8 = var7.getAsString();
            Descriptors.Descriptor var9 = this.registry.getDescriptorForTypeUrl(var8);
            if (var9 == null) {
               var9 = this.oldRegistry.getDescriptorForTypeUrl(var8);
               if (var9 == null) {
                  throw new InvalidProtocolBufferException("Cannot resolve type: " + var8);
               }
            }

            var2.setField(var4, var8);
            DynamicMessage.Builder var10 = DynamicMessage.getDefaultInstance(var9).newBuilderForType();
            JsonFormat.ParserImpl.WellKnownTypeParser var11 = wellKnownTypeParsers.get(var9.getFullName());
            if (var11 != null) {
               JsonElement var12 = var6.get("value");
               if (var12 != null) {
                  var11.merge(this, var12, var10);
               }
            } else {
               this.mergeMessage(var1, var10, true);
            }

            var2.setField(var5, var10.build().toByteString());
         }
      }

      private void mergeFieldMask(JsonElement var1, Message.Builder var2) {
         FieldMask var3 = FieldMaskUtil.fromJsonString(var1.getAsString());
         var2.mergeFrom(var3.toByteString());
      }

      private void mergeTimestamp(JsonElement var1, Message.Builder var2) {
         try {
            Timestamp var3 = Timestamps.parse(var1.getAsString());
            var2.mergeFrom(var3.toByteString());
         } catch (ParseException | UnsupportedOperationException var5) {
            InvalidProtocolBufferException var4 = new InvalidProtocolBufferException("Failed to parse timestamp: " + var1);
            var4.initCause(var5);
            throw var4;
         }
      }

      private void mergeDuration(JsonElement var1, Message.Builder var2) {
         try {
            Duration var3 = Durations.parse(var1.getAsString());
            var2.mergeFrom(var3.toByteString());
         } catch (ParseException | UnsupportedOperationException var5) {
            InvalidProtocolBufferException var4 = new InvalidProtocolBufferException("Failed to parse duration: " + var1);
            var4.initCause(var5);
            throw var4;
         }
      }

      private void mergeStruct(JsonElement var1, Message.Builder var2) {
         Descriptors.Descriptor var3 = var2.getDescriptorForType();
         Descriptors.FieldDescriptor var4 = var3.findFieldByName("fields");
         if (var4 == null) {
            throw new InvalidProtocolBufferException("Invalid Struct type.");
         }

         this.mergeMapField(var4, var1, var2);
      }

      private void mergeListValue(JsonElement var1, Message.Builder var2) {
         Descriptors.Descriptor var3 = var2.getDescriptorForType();
         Descriptors.FieldDescriptor var4 = var3.findFieldByName("values");
         if (var4 == null) {
            throw new InvalidProtocolBufferException("Invalid ListValue type.");
         }

         this.mergeRepeatedField(var4, var1, var2);
      }

      private void mergeValue(JsonElement var1, Message.Builder var2) {
         Descriptors.Descriptor var3 = var2.getDescriptorForType();
         if (var1 instanceof JsonPrimitive) {
            JsonPrimitive var4 = (JsonPrimitive)var1;
            if (var4.isBoolean()) {
               var2.setField(var3.findFieldByName("bool_value"), var4.getAsBoolean());
            } else if (var4.isNumber()) {
               var2.setField(var3.findFieldByName("number_value"), var4.getAsDouble());
            } else {
               var2.setField(var3.findFieldByName("string_value"), var4.getAsString());
            }
         } else if (var1 instanceof JsonObject) {
            Descriptors.FieldDescriptor var6 = var3.findFieldByName("struct_value");
            Message.Builder var5 = var2.newBuilderForField(var6);
            this.merge(var1, var5);
            var2.setField(var6, var5.build());
         } else if (var1 instanceof JsonArray) {
            Descriptors.FieldDescriptor var7 = var3.findFieldByName("list_value");
            Message.Builder var8 = var2.newBuilderForField(var7);
            this.merge(var1, var8);
            var2.setField(var7, var8.build());
         } else {
            if (!(var1 instanceof JsonNull)) {
               throw new IllegalStateException("Unexpected json data: " + var1);
            }

            var2.setField(var3.findFieldByName("null_value"), NullValue.NULL_VALUE.getValueDescriptor());
         }
      }

      private void mergeWrapper(JsonElement var1, Message.Builder var2) {
         Descriptors.Descriptor var3 = var2.getDescriptorForType();
         Descriptors.FieldDescriptor var4 = var3.findFieldByName("value");
         if (var4 == null) {
            throw new InvalidProtocolBufferException("Invalid wrapper type: " + var3.getFullName());
         }

         var2.setField(var4, this.parseFieldValue(var4, var1, var2));
      }

      private void mergeField(Descriptors.FieldDescriptor var1, JsonElement var2, Message.Builder var3) {
         if (var1.isRepeated()) {
            if (var3.getRepeatedFieldCount(var1) > 0) {
               throw new InvalidProtocolBufferException("Field " + var1.getFullName() + " has already been set.");
            }
         } else if (var3.hasField(var1)) {
            throw new InvalidProtocolBufferException("Field " + var1.getFullName() + " has already been set.");
         }

         if (!var1.isRepeated() || !(var2 instanceof JsonNull)) {
            if (var1.isMapField()) {
               this.mergeMapField(var1, var2, var3);
            } else if (var1.isRepeated()) {
               this.mergeRepeatedField(var1, var2, var3);
            } else if (var1.getContainingOneof() != null) {
               this.mergeOneofField(var1, var2, var3);
            } else {
               Object var4 = this.parseFieldValue(var1, var2, var3);
               if (var4 != null) {
                  var3.setField(var1, var4);
               }
            }
         }
      }

      private void mergeMapField(Descriptors.FieldDescriptor var1, JsonElement var2, Message.Builder var3) {
         if (!(var2 instanceof JsonObject)) {
            throw new InvalidProtocolBufferException("Expect a map object but found: " + var2);
         }

         Descriptors.Descriptor var4 = var1.getMessageType();
         Descriptors.FieldDescriptor var5 = var4.findFieldByName("key");
         Descriptors.FieldDescriptor var6 = var4.findFieldByName("value");
         if (var5 != null && var6 != null) {
            JsonObject var7 = (JsonObject)var2;

            for (Entry var9 : var7.entrySet()) {
               Message.Builder var10 = var3.newBuilderForField(var1);
               Object var11 = this.parseFieldValue(var5, new JsonPrimitive((String)var9.getKey()), var10);
               Object var12 = this.parseFieldValue(var6, (JsonElement)var9.getValue(), var10);
               if (var12 == null) {
                  if (!this.ignoringUnknownFields || var6.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                     throw new InvalidProtocolBufferException("Map value cannot be null.");
                  }
               } else {
                  var10.setField(var5, var11);
                  var10.setField(var6, var12);
                  var3.addRepeatedField(var1, var10.build());
               }
            }
         } else {
            throw new InvalidProtocolBufferException("Invalid map field: " + var1.getFullName());
         }
      }

      private void mergeOneofField(Descriptors.FieldDescriptor var1, JsonElement var2, Message.Builder var3) {
         Object var4 = this.parseFieldValue(var1, var2, var3);
         if (var4 != null) {
            if (var3.getOneofFieldDescriptor(var1.getContainingOneof()) != null) {
               throw new InvalidProtocolBufferException(
                  "Cannot set field "
                     + var1.getFullName()
                     + " because another field "
                     + var3.getOneofFieldDescriptor(var1.getContainingOneof()).getFullName()
                     + " belonging to the same oneof has already been set "
               );
            }

            var3.setField(var1, var4);
         }
      }

      private void mergeRepeatedField(Descriptors.FieldDescriptor var1, JsonElement var2, Message.Builder var3) {
         if (!(var2 instanceof JsonArray)) {
            throw new InvalidProtocolBufferException("Expected an array for " + var1.getName() + " but found " + var2);
         }

         JsonArray var4 = (JsonArray)var2;

         for (int var5 = 0; var5 < var4.size(); var5++) {
            Object var6 = this.parseFieldValue(var1, var4.get(var5), var3);
            if (var6 == null) {
               if (!this.ignoringUnknownFields || var1.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                  throw new InvalidProtocolBufferException("Repeated field elements cannot be null in field: " + var1.getFullName());
               }
            } else {
               var3.addRepeatedField(var1, var6);
            }
         }
      }

      private int parseInt32(JsonElement var1) {
         try {
            return Integer.parseInt(var1.getAsString());
         } catch (RuntimeException var5) {
            try {
               BigDecimal var2 = new BigDecimal(var1.getAsString());
               return var2.intValueExact();
            } catch (RuntimeException var4) {
               InvalidProtocolBufferException var3 = new InvalidProtocolBufferException("Not an int32 value: " + var1);
               var3.initCause(var4);
               throw var3;
            }
         }
      }

      private long parseInt64(JsonElement var1) {
         try {
            return Long.parseLong(var1.getAsString());
         } catch (RuntimeException var5) {
            try {
               BigDecimal var2 = new BigDecimal(var1.getAsString());
               return var2.longValueExact();
            } catch (RuntimeException var4) {
               InvalidProtocolBufferException var3 = new InvalidProtocolBufferException("Not an int64 value: " + var1);
               var3.initCause(var4);
               throw var3;
            }
         }
      }

      private int parseUint32(JsonElement var1) {
         try {
            long var6 = Long.parseLong(var1.getAsString());
            if (var6 >= 0L && var6 <= 4294967295L) {
               return (int)var6;
            } else {
               throw new InvalidProtocolBufferException("Out of range uint32 value: " + var1);
            }
         } catch (RuntimeException var5) {
            try {
               BigDecimal var2 = new BigDecimal(var1.getAsString());
               BigInteger var7 = var2.toBigIntegerExact();
               if (var7.signum() >= 0 && var7.compareTo(new BigInteger("FFFFFFFF", 16)) <= 0) {
                  return var7.intValue();
               } else {
                  throw new InvalidProtocolBufferException("Out of range uint32 value: " + var1);
               }
            } catch (RuntimeException var4) {
               InvalidProtocolBufferException var3 = new InvalidProtocolBufferException("Not an uint32 value: " + var1);
               var3.initCause(var4);
               throw var3;
            }
         }
      }

      private long parseUint64(JsonElement var1) {
         try {
            BigDecimal var2 = new BigDecimal(var1.getAsString());
            BigInteger var5 = var2.toBigIntegerExact();
            if (var5.compareTo(BigInteger.ZERO) >= 0 && var5.compareTo(MAX_UINT64) <= 0) {
               return var5.longValue();
            } else {
               throw new InvalidProtocolBufferException("Out of range uint64 value: " + var1);
            }
         } catch (RuntimeException var4) {
            InvalidProtocolBufferException var3 = new InvalidProtocolBufferException("Not an uint64 value: " + var1);
            var3.initCause(var4);
            throw var3;
         }
      }

      private boolean parseBool(JsonElement var1) {
         if (var1.getAsString().equals("true")) {
            return true;
         } else if (var1.getAsString().equals("false")) {
            return false;
         } else {
            throw new InvalidProtocolBufferException("Invalid bool value: " + var1);
         }
      }

      private float parseFloat(JsonElement var1) {
         if (var1.getAsString().equals("NaN")) {
            return Float.NaN;
         }

         if (var1.getAsString().equals("Infinity")) {
            return Float.POSITIVE_INFINITY;
         }

         if (var1.getAsString().equals("-Infinity")) {
            return Float.NEGATIVE_INFINITY;
         }

         try {
            double var2 = Double.parseDouble(var1.getAsString());
            if (!(var2 > 3.402826869208755E38) && !(var2 < -3.402826869208755E38)) {
               return (float)var2;
            } else {
               throw new InvalidProtocolBufferException("Out of range float value: " + var1);
            }
         } catch (RuntimeException var4) {
            InvalidProtocolBufferException var3 = new InvalidProtocolBufferException("Not a float value: " + var1);
            var3.initCause(var4);
            throw var4;
         }
      }

      private double parseDouble(JsonElement var1) {
         if (var1.getAsString().equals("NaN")) {
            return Double.NaN;
         }

         if (var1.getAsString().equals("Infinity")) {
            return Double.POSITIVE_INFINITY;
         }

         if (var1.getAsString().equals("-Infinity")) {
            return Double.NEGATIVE_INFINITY;
         }

         try {
            BigDecimal var2 = new BigDecimal(var1.getAsString());
            if (var2.compareTo(MAX_DOUBLE) <= 0 && var2.compareTo(MIN_DOUBLE) >= 0) {
               return var2.doubleValue();
            } else {
               throw new InvalidProtocolBufferException("Out of range double value: " + var1);
            }
         } catch (RuntimeException var4) {
            InvalidProtocolBufferException var3 = new InvalidProtocolBufferException("Not a double value: " + var1);
            var3.initCause(var4);
            throw var3;
         }
      }

      private String parseString(JsonElement var1) {
         return var1.getAsString();
      }

      private ByteString parseBytes(JsonElement var1) {
         try {
            return ByteString.copyFrom(BaseEncoding.base64().decode(var1.getAsString()));
         } catch (IllegalArgumentException var3) {
            return ByteString.copyFrom(BaseEncoding.base64Url().decode(var1.getAsString()));
         }
      }

      @Nullable
      private Descriptors.EnumValueDescriptor parseEnum(Descriptors.EnumDescriptor var1, JsonElement var2) {
         String var3 = var2.getAsString();
         Descriptors.EnumValueDescriptor var4 = var1.findValueByName(var3);
         if (var4 == null) {
            try {
               int var5 = this.parseInt32(var2);
               if (var1.isClosed()) {
                  var4 = var1.findValueByNumber(var5);
               } else {
                  var4 = var1.findValueByNumberCreatingIfUnknown(var5);
               }
            } catch (InvalidProtocolBufferException var6) {
            }

            if (var4 == null && !this.ignoringUnknownFields) {
               throw new InvalidProtocolBufferException("Invalid enum value: " + var3 + " for enum type: " + var1.getFullName());
            }
         }

         return var4;
      }

      @Nullable
      private Object parseFieldValue(Descriptors.FieldDescriptor var1, JsonElement var2, Message.Builder var3) {
         if (var2 instanceof JsonNull) {
            if (var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE
               && var1.getMessageType().getFullName().equals(Value.getDescriptor().getFullName())) {
               Value var5 = Value.newBuilder().setNullValueValue(0).build();
               return var3.newBuilderForField(var1).mergeFrom(var5.toByteString()).build();
            } else {
               return var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM
                     && var1.getEnumType().getFullName().equals(NullValue.getDescriptor().getFullName())
                  ? var1.getEnumType().findValueByNumber(0)
                  : null;
            }
         } else {
            if (var2 instanceof JsonObject
               && var1.getType() != Descriptors.FieldDescriptor.Type.MESSAGE
               && var1.getType() != Descriptors.FieldDescriptor.Type.GROUP) {
               throw new InvalidProtocolBufferException(String.format("Invalid value: %s for expected type: %s", var2, var1.getType()));
            }

            switch (var1.getType()) {
               case INT32:
               case SINT32:
               case SFIXED32:
                  return this.parseInt32(var2);
               case INT64:
               case SINT64:
               case SFIXED64:
                  return this.parseInt64(var2);
               case BOOL:
                  return this.parseBool(var2);
               case FLOAT:
                  return this.parseFloat(var2);
               case DOUBLE:
                  return this.parseDouble(var2);
               case UINT32:
               case FIXED32:
                  return this.parseUint32(var2);
               case UINT64:
               case FIXED64:
                  return this.parseUint64(var2);
               case STRING:
                  return this.parseString(var2);
               case BYTES:
                  return this.parseBytes(var2);
               case ENUM:
                  return this.parseEnum(var1.getEnumType(), var2);
               case MESSAGE:
               case GROUP:
                  if (this.currentDepth >= this.recursionLimit) {
                     throw new InvalidProtocolBufferException("Hit recursion limit.");
                  }

                  this.currentDepth++;
                  Message.Builder var4 = var3.newBuilderForField(var1);
                  this.merge(var2, var4);
                  this.currentDepth--;
                  return var4.build();
               default:
                  throw new InvalidProtocolBufferException("Invalid field type: " + var1.getType());
            }
         }
      }

      private interface WellKnownTypeParser {
         void merge(JsonFormat.ParserImpl var1, JsonElement var2, Message.Builder var3);
      }
   }

   private static final class PrettyTextGenerator implements JsonFormat.TextGenerator {
      private final Appendable output;
      private final StringBuilder indent = new StringBuilder();
      private boolean atStartOfLine = true;

      private PrettyTextGenerator(Appendable var1) {
         this.output = var1;
      }

      @Override
      public void indent() {
         this.indent.append("  ");
      }

      @Override
      public void outdent() {
         int var1 = this.indent.length();
         if (var1 < 2) {
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
         }

         this.indent.delete(var1 - 2, var1);
      }

      @Override
      public void print(CharSequence var1) {
         int var2 = var1.length();
         int var3 = 0;

         for (int var4 = 0; var4 < var2; var4++) {
            if (var1.charAt(var4) == '\n') {
               this.write(var1.subSequence(var3, var4 + 1));
               var3 = var4 + 1;
               this.atStartOfLine = true;
            }
         }

         this.write(var1.subSequence(var3, var2));
      }

      private void write(CharSequence var1) {
         if (var1.length() != 0) {
            if (this.atStartOfLine) {
               this.atStartOfLine = false;
               this.output.append(this.indent);
            }

            this.output.append(var1);
         }
      }
   }

   public static class Printer {
      private final com.google.protobuf.TypeRegistry registry;
      private final JsonFormat.TypeRegistry oldRegistry;
      private boolean alwaysOutputDefaultValueFields;
      private Set<Descriptors.FieldDescriptor> includingDefaultValueFields;
      private final boolean preservingProtoFieldNames;
      private final boolean omittingInsignificantWhitespace;
      private final boolean printingEnumsAsInts;
      private final boolean sortingMapKeys;

      private Printer(
         com.google.protobuf.TypeRegistry var1,
         JsonFormat.TypeRegistry var2,
         boolean var3,
         Set<Descriptors.FieldDescriptor> var4,
         boolean var5,
         boolean var6,
         boolean var7,
         boolean var8
      ) {
         this.registry = var1;
         this.oldRegistry = var2;
         this.alwaysOutputDefaultValueFields = var3;
         this.includingDefaultValueFields = var4;
         this.preservingProtoFieldNames = var5;
         this.omittingInsignificantWhitespace = var6;
         this.printingEnumsAsInts = var7;
         this.sortingMapKeys = var8;
      }

      public JsonFormat.Printer usingTypeRegistry(JsonFormat.TypeRegistry var1) {
         if (this.oldRegistry == JsonFormat.TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
            return new JsonFormat.Printer(
               com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(),
               var1,
               this.alwaysOutputDefaultValueFields,
               this.includingDefaultValueFields,
               this.preservingProtoFieldNames,
               this.omittingInsignificantWhitespace,
               this.printingEnumsAsInts,
               this.sortingMapKeys
            );
         } else {
            throw new IllegalArgumentException("Only one registry is allowed.");
         }
      }

      public JsonFormat.Printer usingTypeRegistry(com.google.protobuf.TypeRegistry var1) {
         if (this.oldRegistry == JsonFormat.TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
            return new JsonFormat.Printer(
               var1,
               this.oldRegistry,
               this.alwaysOutputDefaultValueFields,
               this.includingDefaultValueFields,
               this.preservingProtoFieldNames,
               this.omittingInsignificantWhitespace,
               this.printingEnumsAsInts,
               this.sortingMapKeys
            );
         } else {
            throw new IllegalArgumentException("Only one registry is allowed.");
         }
      }

      public JsonFormat.Printer includingDefaultValueFields() {
         this.checkUnsetIncludingDefaultValueFields();
         return new JsonFormat.Printer(
            this.registry,
            this.oldRegistry,
            true,
            Collections.emptySet(),
            this.preservingProtoFieldNames,
            this.omittingInsignificantWhitespace,
            this.printingEnumsAsInts,
            this.sortingMapKeys
         );
      }

      public JsonFormat.Printer printingEnumsAsInts() {
         this.checkUnsetPrintingEnumsAsInts();
         return new JsonFormat.Printer(
            this.registry,
            this.oldRegistry,
            this.alwaysOutputDefaultValueFields,
            this.includingDefaultValueFields,
            this.preservingProtoFieldNames,
            this.omittingInsignificantWhitespace,
            true,
            this.sortingMapKeys
         );
      }

      private void checkUnsetPrintingEnumsAsInts() {
         if (this.printingEnumsAsInts) {
            throw new IllegalStateException("JsonFormat printingEnumsAsInts has already been set.");
         }
      }

      public JsonFormat.Printer includingDefaultValueFields(Set<Descriptors.FieldDescriptor> var1) {
         Preconditions.checkArgument(null != var1 && !var1.isEmpty(), "Non-empty Set must be supplied for includingDefaultValueFields.");
         this.checkUnsetIncludingDefaultValueFields();
         return new JsonFormat.Printer(
            this.registry,
            this.oldRegistry,
            false,
            Collections.unmodifiableSet(new HashSet<>(var1)),
            this.preservingProtoFieldNames,
            this.omittingInsignificantWhitespace,
            this.printingEnumsAsInts,
            this.sortingMapKeys
         );
      }

      private void checkUnsetIncludingDefaultValueFields() {
         if (this.alwaysOutputDefaultValueFields || !this.includingDefaultValueFields.isEmpty()) {
            throw new IllegalStateException("JsonFormat includingDefaultValueFields has already been set.");
         }
      }

      public JsonFormat.Printer preservingProtoFieldNames() {
         return new JsonFormat.Printer(
            this.registry,
            this.oldRegistry,
            this.alwaysOutputDefaultValueFields,
            this.includingDefaultValueFields,
            true,
            this.omittingInsignificantWhitespace,
            this.printingEnumsAsInts,
            this.sortingMapKeys
         );
      }

      public JsonFormat.Printer omittingInsignificantWhitespace() {
         return new JsonFormat.Printer(
            this.registry,
            this.oldRegistry,
            this.alwaysOutputDefaultValueFields,
            this.includingDefaultValueFields,
            this.preservingProtoFieldNames,
            true,
            this.printingEnumsAsInts,
            this.sortingMapKeys
         );
      }

      public JsonFormat.Printer sortingMapKeys() {
         return new JsonFormat.Printer(
            this.registry,
            this.oldRegistry,
            this.alwaysOutputDefaultValueFields,
            this.includingDefaultValueFields,
            this.preservingProtoFieldNames,
            this.omittingInsignificantWhitespace,
            this.printingEnumsAsInts,
            true
         );
      }

      public void appendTo(MessageOrBuilder var1, Appendable var2) {
         new JsonFormat.PrinterImpl(
               this.registry,
               this.oldRegistry,
               this.alwaysOutputDefaultValueFields,
               this.includingDefaultValueFields,
               this.preservingProtoFieldNames,
               var2,
               this.omittingInsignificantWhitespace,
               this.printingEnumsAsInts,
               this.sortingMapKeys
            )
            .print(var1);
      }

      public String print(MessageOrBuilder var1) {
         try {
            StringBuilder var2 = new StringBuilder();
            this.appendTo(var1, var2);
            return var2.toString();
         } catch (InvalidProtocolBufferException var3) {
            throw var3;
         } catch (IOException var4) {
            throw new IllegalStateException(var4);
         }
      }
   }

   private static final class PrinterImpl {
      private final com.google.protobuf.TypeRegistry registry;
      private final JsonFormat.TypeRegistry oldRegistry;
      private final boolean alwaysOutputDefaultValueFields;
      private final Set<Descriptors.FieldDescriptor> includingDefaultValueFields;
      private final boolean preservingProtoFieldNames;
      private final boolean printingEnumsAsInts;
      private final boolean sortingMapKeys;
      private final JsonFormat.TextGenerator generator;
      private final Gson gson;
      private final CharSequence blankOrSpace;
      private final CharSequence blankOrNewLine;
      private static final Map<String, JsonFormat.PrinterImpl.WellKnownTypePrinter> wellKnownTypePrinters = buildWellKnownTypePrinters();

      PrinterImpl(
         com.google.protobuf.TypeRegistry var1,
         JsonFormat.TypeRegistry var2,
         boolean var3,
         Set<Descriptors.FieldDescriptor> var4,
         boolean var5,
         Appendable var6,
         boolean var7,
         boolean var8,
         boolean var9
      ) {
         this.registry = var1;
         this.oldRegistry = var2;
         this.alwaysOutputDefaultValueFields = var3;
         this.includingDefaultValueFields = var4;
         this.preservingProtoFieldNames = var5;
         this.printingEnumsAsInts = var8;
         this.sortingMapKeys = var9;
         this.gson = JsonFormat.PrinterImpl.GsonHolder.DEFAULT_GSON;
         if (var7) {
            this.generator = new JsonFormat.CompactTextGenerator(var6);
            this.blankOrSpace = "";
            this.blankOrNewLine = "";
         } else {
            this.generator = new JsonFormat.PrettyTextGenerator(var6);
            this.blankOrSpace = " ";
            this.blankOrNewLine = "\n";
         }
      }

      void print(MessageOrBuilder var1) {
         JsonFormat.PrinterImpl.WellKnownTypePrinter var2 = wellKnownTypePrinters.get(var1.getDescriptorForType().getFullName());
         if (var2 != null) {
            var2.print(this, var1);
         } else {
            this.print(var1, null);
         }
      }

      private static Map<String, JsonFormat.PrinterImpl.WellKnownTypePrinter> buildWellKnownTypePrinters() {
         HashMap var0 = new HashMap();
         var0.put(Any.getDescriptor().getFullName(), new JsonFormat.PrinterImpl.WellKnownTypePrinter() {
            @Override
            public void print(JsonFormat.PrinterImpl var1, MessageOrBuilder var2) {
               var1.printAny(var2);
            }
         });
         JsonFormat.PrinterImpl.WellKnownTypePrinter var1 = new JsonFormat.PrinterImpl.WellKnownTypePrinter() {
            @Override
            public void print(JsonFormat.PrinterImpl var1, MessageOrBuilder var2) {
               var1.printWrapper(var2);
            }
         };
         var0.put(BoolValue.getDescriptor().getFullName(), var1);
         var0.put(Int32Value.getDescriptor().getFullName(), var1);
         var0.put(UInt32Value.getDescriptor().getFullName(), var1);
         var0.put(Int64Value.getDescriptor().getFullName(), var1);
         var0.put(UInt64Value.getDescriptor().getFullName(), var1);
         var0.put(StringValue.getDescriptor().getFullName(), var1);
         var0.put(BytesValue.getDescriptor().getFullName(), var1);
         var0.put(FloatValue.getDescriptor().getFullName(), var1);
         var0.put(DoubleValue.getDescriptor().getFullName(), var1);
         var0.put(Timestamp.getDescriptor().getFullName(), new JsonFormat.PrinterImpl.WellKnownTypePrinter() {
            @Override
            public void print(JsonFormat.PrinterImpl var1, MessageOrBuilder var2) {
               var1.printTimestamp(var2);
            }
         });
         var0.put(Duration.getDescriptor().getFullName(), new JsonFormat.PrinterImpl.WellKnownTypePrinter() {
            @Override
            public void print(JsonFormat.PrinterImpl var1, MessageOrBuilder var2) {
               var1.printDuration(var2);
            }
         });
         var0.put(FieldMask.getDescriptor().getFullName(), new JsonFormat.PrinterImpl.WellKnownTypePrinter() {
            @Override
            public void print(JsonFormat.PrinterImpl var1, MessageOrBuilder var2) {
               var1.printFieldMask(var2);
            }
         });
         var0.put(Struct.getDescriptor().getFullName(), new JsonFormat.PrinterImpl.WellKnownTypePrinter() {
            @Override
            public void print(JsonFormat.PrinterImpl var1, MessageOrBuilder var2) {
               var1.printStruct(var2);
            }
         });
         var0.put(Value.getDescriptor().getFullName(), new JsonFormat.PrinterImpl.WellKnownTypePrinter() {
            @Override
            public void print(JsonFormat.PrinterImpl var1, MessageOrBuilder var2) {
               var1.printValue(var2);
            }
         });
         var0.put(ListValue.getDescriptor().getFullName(), new JsonFormat.PrinterImpl.WellKnownTypePrinter() {
            @Override
            public void print(JsonFormat.PrinterImpl var1, MessageOrBuilder var2) {
               var1.printListValue(var2);
            }
         });
         return var0;
      }

      private void printAny(MessageOrBuilder var1) {
         if (Any.getDefaultInstance().equals(var1)) {
            this.generator.print("{}");
         } else {
            Descriptors.Descriptor var2 = var1.getDescriptorForType();
            Descriptors.FieldDescriptor var3 = var2.findFieldByName("type_url");
            Descriptors.FieldDescriptor var4 = var2.findFieldByName("value");
            if (var3 != null
               && var4 != null
               && var3.getType() == Descriptors.FieldDescriptor.Type.STRING
               && var4.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
               String var5 = (String)var1.getField(var3);
               Descriptors.Descriptor var6 = this.registry.getDescriptorForTypeUrl(var5);
               if (var6 == null) {
                  var6 = this.oldRegistry.getDescriptorForTypeUrl(var5);
                  if (var6 == null) {
                     throw new InvalidProtocolBufferException("Cannot find type for url: " + var5);
                  }
               }

               ByteString var7 = (ByteString)var1.getField(var4);
               Message var8 = DynamicMessage.getDefaultInstance(var6).getParserForType().parseFrom(var7);
               JsonFormat.PrinterImpl.WellKnownTypePrinter var9 = wellKnownTypePrinters.get(JsonFormat.getTypeName(var5));
               if (var9 != null) {
                  this.generator.print("{" + this.blankOrNewLine);
                  this.generator.indent();
                  this.generator.print("\"@type\":" + this.blankOrSpace + this.gson.toJson(var5) + "," + this.blankOrNewLine);
                  this.generator.print("\"value\":" + this.blankOrSpace);
                  var9.print(this, var8);
                  this.generator.print(this.blankOrNewLine);
                  this.generator.outdent();
                  this.generator.print("}");
               } else {
                  this.print(var8, var5);
               }
            } else {
               throw new InvalidProtocolBufferException("Invalid Any type.");
            }
         }
      }

      private void printWrapper(MessageOrBuilder var1) {
         Descriptors.Descriptor var2 = var1.getDescriptorForType();
         Descriptors.FieldDescriptor var3 = var2.findFieldByName("value");
         if (var3 == null) {
            throw new InvalidProtocolBufferException("Invalid Wrapper type.");
         }

         this.printSingleFieldValue(var3, var1.getField(var3));
      }

      private ByteString toByteString(MessageOrBuilder var1) {
         return var1 instanceof Message ? ((Message)var1).toByteString() : ((Message.Builder)var1).build().toByteString();
      }

      private void printTimestamp(MessageOrBuilder var1) {
         Timestamp var2 = Timestamp.parseFrom(this.toByteString(var1));
         this.generator.print("\"" + Timestamps.toString(var2) + "\"");
      }

      private void printDuration(MessageOrBuilder var1) {
         Duration var2 = Duration.parseFrom(this.toByteString(var1));
         this.generator.print("\"" + Durations.toString(var2) + "\"");
      }

      private void printFieldMask(MessageOrBuilder var1) {
         FieldMask var2 = FieldMask.parseFrom(this.toByteString(var1));
         this.generator.print("\"" + FieldMaskUtil.toJsonString(var2) + "\"");
      }

      private void printStruct(MessageOrBuilder var1) {
         Descriptors.Descriptor var2 = var1.getDescriptorForType();
         Descriptors.FieldDescriptor var3 = var2.findFieldByName("fields");
         if (var3 == null) {
            throw new InvalidProtocolBufferException("Invalid Struct type.");
         }

         this.printMapFieldValue(var3, var1.getField(var3));
      }

      private void printValue(MessageOrBuilder var1) {
         Map var2 = var1.getAllFields();
         if (var2.isEmpty()) {
            this.generator.print("null");
         } else {
            if (var2.size() != 1) {
               throw new InvalidProtocolBufferException("Invalid Value type.");
            }

            for (Entry var4 : var2.entrySet()) {
               Descriptors.FieldDescriptor var5 = (Descriptors.FieldDescriptor)var4.getKey();
               if (var5.getType() == Descriptors.FieldDescriptor.Type.DOUBLE) {
                  Double var6 = (Double)var4.getValue();
                  if (var6.isNaN() || var6.isInfinite()) {
                     throw new IllegalArgumentException(
                        "google.protobuf.Value cannot encode double values for infinity or nan, because they would be parsed as a string."
                     );
                  }
               }

               this.printSingleFieldValue(var5, var4.getValue());
            }
         }
      }

      private void printListValue(MessageOrBuilder var1) {
         Descriptors.Descriptor var2 = var1.getDescriptorForType();
         Descriptors.FieldDescriptor var3 = var2.findFieldByName("values");
         if (var3 == null) {
            throw new InvalidProtocolBufferException("Invalid ListValue type.");
         }

         this.printRepeatedFieldValue(var3, var1.getField(var3));
      }

      private void print(MessageOrBuilder var1, @Nullable String var2) {
         this.generator.print("{" + this.blankOrNewLine);
         this.generator.indent();
         boolean var3 = false;
         if (var2 != null) {
            this.generator.print("\"@type\":" + this.blankOrSpace + this.gson.toJson(var2));
            var3 = true;
         }

         Map var4 = null;
         if (!this.alwaysOutputDefaultValueFields && this.includingDefaultValueFields.isEmpty()) {
            var4 = var1.getAllFields();
         } else {
            var4 = new TreeMap<>(var1.getAllFields());

            for (Descriptors.FieldDescriptor var6 : var1.getDescriptorForType().getFields()) {
               if (var6.isOptional()) {
                  if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && !var1.hasField(var6)) {
                     continue;
                  }

                  Descriptors.OneofDescriptor var7 = var6.getContainingOneof();
                  if (var7 != null && !var1.hasField(var6)) {
                     continue;
                  }
               }

               if (!var4.containsKey(var6) && (this.alwaysOutputDefaultValueFields || this.includingDefaultValueFields.contains(var6))) {
                  var4.put(var6, var1.getField(var6));
               }
            }
         }

         for (Entry var10 : var4.entrySet()) {
            if (var3) {
               this.generator.print("," + this.blankOrNewLine);
            } else {
               var3 = true;
            }

            this.printField((Descriptors.FieldDescriptor)var10.getKey(), var10.getValue());
         }

         if (var3) {
            this.generator.print(this.blankOrNewLine);
         }

         this.generator.outdent();
         this.generator.print("}");
      }

      private void printField(Descriptors.FieldDescriptor var1, Object var2) {
         if (this.preservingProtoFieldNames) {
            this.generator.print("\"" + var1.getName() + "\":" + this.blankOrSpace);
         } else {
            this.generator.print("\"" + var1.getJsonName() + "\":" + this.blankOrSpace);
         }

         if (var1.isMapField()) {
            this.printMapFieldValue(var1, var2);
         } else if (var1.isRepeated()) {
            this.printRepeatedFieldValue(var1, var2);
         } else {
            this.printSingleFieldValue(var1, var2);
         }
      }

      private void printRepeatedFieldValue(Descriptors.FieldDescriptor var1, Object var2) {
         this.generator.print("[");
         boolean var3 = false;

         for (Object var5 : (List)var2) {
            if (var3) {
               this.generator.print("," + this.blankOrSpace);
            } else {
               var3 = true;
            }

            this.printSingleFieldValue(var1, var5);
         }

         this.generator.print("]");
      }

      private void printMapFieldValue(Descriptors.FieldDescriptor var1, Object var2) {
         Descriptors.Descriptor var3 = var1.getMessageType();
         Descriptors.FieldDescriptor var4 = var3.findFieldByName("key");
         Descriptors.FieldDescriptor var5 = var3.findFieldByName("value");
         if (var4 != null && var5 != null) {
            this.generator.print("{" + this.blankOrNewLine);
            this.generator.indent();
            Collection var6 = (List)var2;
            if (this.sortingMapKeys && !var6.isEmpty()) {
               Comparator var7 = null;
               if (var4.getType() == Descriptors.FieldDescriptor.Type.STRING) {
                  var7 = new Comparator<Object>() {
                     @Override
                     public int compare(Object var1, Object var2x) {
                        ByteString var3x = ByteString.copyFromUtf8((String)var1);
                        ByteString var4x = ByteString.copyFromUtf8((String)var2x);
                        return ByteString.unsignedLexicographicalComparator().compare(var3x, var4x);
                     }
                  };
               }

               TreeMap var8 = new TreeMap(var7);

               for (Object var10 : var6) {
                  Message var11 = (Message)var10;
                  Object var12 = var11.getField(var4);
                  var8.put(var12, var10);
               }

               var6 = var8.values();
            }

            boolean var13 = false;

            for (Object var15 : var6) {
               Message var16 = (Message)var15;
               Object var17 = var16.getField(var4);
               Object var18 = var16.getField(var5);
               if (var13) {
                  this.generator.print("," + this.blankOrNewLine);
               } else {
                  var13 = true;
               }

               this.printSingleFieldValue(var4, var17, true);
               this.generator.print(":" + this.blankOrSpace);
               this.printSingleFieldValue(var5, var18);
            }

            if (var13) {
               this.generator.print(this.blankOrNewLine);
            }

            this.generator.outdent();
            this.generator.print("}");
         } else {
            throw new InvalidProtocolBufferException("Invalid map field.");
         }
      }

      private void printSingleFieldValue(Descriptors.FieldDescriptor var1, Object var2) {
         this.printSingleFieldValue(var1, var2, false);
      }

      private void printSingleFieldValue(Descriptors.FieldDescriptor var1, Object var2, boolean var3) {
         switch (var1.getType()) {
            case INT32:
            case SINT32:
            case SFIXED32:
               if (var3) {
                  this.generator.print("\"");
               }

               this.generator.print(((Integer)var2).toString());
               if (var3) {
                  this.generator.print("\"");
               }
               break;
            case INT64:
            case SINT64:
            case SFIXED64:
               this.generator.print("\"" + ((Long)var2).toString() + "\"");
               break;
            case BOOL:
               if (var3) {
                  this.generator.print("\"");
               }

               if ((Boolean)var2) {
                  this.generator.print("true");
               } else {
                  this.generator.print("false");
               }

               if (var3) {
                  this.generator.print("\"");
               }
               break;
            case FLOAT:
               Float var4 = (Float)var2;
               if (var4.isNaN()) {
                  this.generator.print("\"NaN\"");
               } else if (var4.isInfinite()) {
                  if (var4 < 0.0F) {
                     this.generator.print("\"-Infinity\"");
                  } else {
                     this.generator.print("\"Infinity\"");
                  }
               } else {
                  if (var3) {
                     this.generator.print("\"");
                  }

                  this.generator.print(var4.toString());
                  if (var3) {
                     this.generator.print("\"");
                  }
               }
               break;
            case DOUBLE:
               Double var5 = (Double)var2;
               if (var5.isNaN()) {
                  this.generator.print("\"NaN\"");
               } else if (var5.isInfinite()) {
                  if (var5 < 0.0) {
                     this.generator.print("\"-Infinity\"");
                  } else {
                     this.generator.print("\"Infinity\"");
                  }
               } else {
                  if (var3) {
                     this.generator.print("\"");
                  }

                  this.generator.print(var5.toString());
                  if (var3) {
                     this.generator.print("\"");
                  }
               }
               break;
            case UINT32:
            case FIXED32:
               if (var3) {
                  this.generator.print("\"");
               }

               this.generator.print(JsonFormat.unsignedToString((Integer)var2));
               if (var3) {
                  this.generator.print("\"");
               }
               break;
            case UINT64:
            case FIXED64:
               this.generator.print("\"" + JsonFormat.unsignedToString((Long)var2) + "\"");
               break;
            case STRING:
               this.generator.print(this.gson.toJson(var2));
               break;
            case BYTES:
               this.generator.print("\"");
               this.generator.print(BaseEncoding.base64().encode(((ByteString)var2).toByteArray()));
               this.generator.print("\"");
               break;
            case ENUM:
               if (var1.getEnumType().getFullName().equals("google.protobuf.NullValue")) {
                  if (var3) {
                     this.generator.print("\"");
                  }

                  this.generator.print("null");
                  if (var3) {
                     this.generator.print("\"");
                  }
               } else if (!this.printingEnumsAsInts && ((Descriptors.EnumValueDescriptor)var2).getIndex() != -1) {
                  this.generator.print("\"" + ((Descriptors.EnumValueDescriptor)var2).getName() + "\"");
               } else {
                  this.generator.print(String.valueOf(((Descriptors.EnumValueDescriptor)var2).getNumber()));
               }
               break;
            case MESSAGE:
            case GROUP:
               this.print((Message)var2);
         }
      }

      private static class GsonHolder {
         private static final Gson DEFAULT_GSON = new GsonBuilder().create();
      }

      private interface WellKnownTypePrinter {
         void print(JsonFormat.PrinterImpl var1, MessageOrBuilder var2);
      }
   }

   interface TextGenerator {
      void indent();

      void outdent();

      void print(CharSequence var1);
   }

   public static class TypeRegistry {
      private final Map<String, Descriptors.Descriptor> types;

      public static JsonFormat.TypeRegistry getEmptyTypeRegistry() {
         return JsonFormat.TypeRegistry.EmptyTypeRegistryHolder.EMPTY;
      }

      public static JsonFormat.TypeRegistry.Builder newBuilder() {
         return new JsonFormat.TypeRegistry.Builder();
      }

      @Nullable
      public Descriptors.Descriptor find(String var1) {
         return this.types.get(var1);
      }

      @Nullable
      Descriptors.Descriptor getDescriptorForTypeUrl(String var1) {
         return this.find(JsonFormat.getTypeName(var1));
      }

      private TypeRegistry(Map<String, Descriptors.Descriptor> var1) {
         this.types = var1;
      }

      public static class Builder {
         private final Set<String> files = new HashSet<>();
         private final Map<String, Descriptors.Descriptor> types = new HashMap<>();
         private boolean built = false;

         private Builder() {
         }

         @CanIgnoreReturnValue
         public JsonFormat.TypeRegistry.Builder add(Descriptors.Descriptor var1) {
            if (this.built) {
               throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
            }

            this.addFile(var1.getFile());
            return this;
         }

         @CanIgnoreReturnValue
         public JsonFormat.TypeRegistry.Builder add(Iterable<Descriptors.Descriptor> var1) {
            if (this.built) {
               throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
            }

            for (Descriptors.Descriptor var3 : var1) {
               this.addFile(var3.getFile());
            }

            return this;
         }

         public JsonFormat.TypeRegistry build() {
            this.built = true;
            return new JsonFormat.TypeRegistry(this.types);
         }

         private void addFile(Descriptors.FileDescriptor var1) {
            if (this.files.add(var1.getFullName())) {
               for (Descriptors.FileDescriptor var3 : var1.getDependencies()) {
                  this.addFile(var3);
               }

               for (Descriptors.Descriptor var5 : var1.getMessageTypes()) {
                  this.addMessage(var5);
               }
            }
         }

         private void addMessage(Descriptors.Descriptor var1) {
            for (Descriptors.Descriptor var3 : var1.getNestedTypes()) {
               this.addMessage(var3);
            }

            if (this.types.containsKey(var1.getFullName())) {
               JsonFormat.logger.warning("Type " + var1.getFullName() + " is added multiple times.");
            } else {
               this.types.put(var1.getFullName(), var1);
            }
         }
      }

      private static class EmptyTypeRegistryHolder {
         private static final JsonFormat.TypeRegistry EMPTY = new JsonFormat.TypeRegistry(Collections.emptyMap());
      }
   }
}
