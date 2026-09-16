package com.google.gson;

public enum LongSerializationPolicy {
   DEFAULT {
      @Override
      public JsonElement serialize(Long var1) {
         return var1 == null ? JsonNull.INSTANCE : new JsonPrimitive(var1);
      }
   },
   STRING {
      @Override
      public JsonElement serialize(Long var1) {
         return var1 == null ? JsonNull.INSTANCE : new JsonPrimitive(var1.toString());
      }
   };

   LongSerializationPolicy() {
   }

   public abstract JsonElement serialize(Long var1);
}
