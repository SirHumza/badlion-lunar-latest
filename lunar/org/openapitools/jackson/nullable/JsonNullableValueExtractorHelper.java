package org.openapitools.jackson.nullable;

abstract class JsonNullableValueExtractorHelper {
   public static void extractValues(JsonNullable<?> var0, JsonNullableValueExtractorHelper.ValueSetter var1) {
      if (var0.isPresent()) {
         var1.apply(null, var0.get());
      }
   }

   @FunctionalInterface
   interface ValueSetter {
      void apply(String var1, Object var2);
   }
}
