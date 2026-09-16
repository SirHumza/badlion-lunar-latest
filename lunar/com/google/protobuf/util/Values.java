package com.google.protobuf.util;

import com.google.protobuf.ListValue;
import com.google.protobuf.NullValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;

public final class Values {
   private static final Value NULL_VALUE = Value.newBuilder().setNullValue(NullValue.NULL_VALUE).build();

   public static Value ofNull() {
      return NULL_VALUE;
   }

   public static Value of(boolean var0) {
      return Value.newBuilder().setBoolValue(var0).build();
   }

   public static Value of(double var0) {
      return Value.newBuilder().setNumberValue(var0).build();
   }

   public static Value of(String var0) {
      return Value.newBuilder().setStringValue(var0).build();
   }

   public static Value of(Struct var0) {
      return Value.newBuilder().setStructValue(var0).build();
   }

   public static Value of(ListValue var0) {
      return Value.newBuilder().setListValue(var0).build();
   }

   public static Value of(Iterable<Value> var0) {
      return Value.newBuilder().setListValue(ListValue.newBuilder().addAllValues(var0)).build();
   }

   private Values() {
   }
}
