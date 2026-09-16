package com.google.protobuf.util;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;

public final class Structs {
   public static Struct of(String var0, Value var1) {
      return Struct.newBuilder().putFields(var0, var1).build();
   }

   public static Struct of(String var0, Value var1, String var2, Value var3) {
      return Struct.newBuilder().putFields(var0, var1).putFields(var2, var3).build();
   }

   public static Struct of(String var0, Value var1, String var2, Value var3, String var4, Value var5) {
      return Struct.newBuilder().putFields(var0, var1).putFields(var2, var3).putFields(var4, var5).build();
   }

   private Structs() {
   }
}
