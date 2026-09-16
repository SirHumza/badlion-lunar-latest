package org.spongepowered.include.com.google.gson;

public final class JsonNull extends JsonElement {
   public static final JsonNull INSTANCE = new JsonNull();

   @Override
   public int hashCode() {
      return JsonNull.class.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof JsonNull;
   }
}
