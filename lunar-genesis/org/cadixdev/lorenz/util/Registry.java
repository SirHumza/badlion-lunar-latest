package org.cadixdev.lorenz.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class Registry<T> {
   private final Map<String, T> map = new HashMap<>();

   public Registry<T> register(String var1, T var2) {
      this.map.put(var1.toLowerCase(), (T)var2);
      return this;
   }

   public T byId(String var1) {
      return this.map.get(var1.toLowerCase());
   }

   public Set<String> keys() {
      return Collections.unmodifiableSet(this.map.keySet());
   }

   public Collection<T> values() {
      return Collections.unmodifiableCollection(this.map.values());
   }

   public Set<Entry<String, T>> entries() {
      return Collections.unmodifiableSet(this.map.entrySet());
   }

   public void forEach(BiConsumer<String, T> var1) {
      this.map.forEach(var1);
   }
}
