package org.spongepowered.include.com.google.gson;

import java.util.Set;
import java.util.Map.Entry;
import org.spongepowered.include.com.google.gson.internal.LinkedTreeMap;

public final class JsonObject extends JsonElement {
   private final LinkedTreeMap<String, JsonElement> members = new LinkedTreeMap<>();

   public void add(String var1, JsonElement var2) {
      if (var2 == null) {
         var2 = JsonNull.INSTANCE;
      }

      this.members.put(var1, var2);
   }

   public Set<Entry<String, JsonElement>> entrySet() {
      return this.members.entrySet();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this || var1 instanceof JsonObject && ((JsonObject)var1).members.equals(this.members);
   }

   @Override
   public int hashCode() {
      return this.members.hashCode();
   }
}
