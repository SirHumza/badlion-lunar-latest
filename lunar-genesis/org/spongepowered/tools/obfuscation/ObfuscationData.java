package org.spongepowered.tools.obfuscation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ObfuscationData<T> implements Iterable<ObfuscationType> {
   private final Map<ObfuscationType, T> data = new HashMap<>();
   private final T defaultValue;

   public ObfuscationData() {
      this(null);
   }

   public ObfuscationData(T var1) {
      this.defaultValue = (T)var1;
   }

   @Deprecated
   public void add(ObfuscationType var1, T var2) {
      this.put(var1, (T)var2);
   }

   public void put(ObfuscationType var1, T var2) {
      this.data.put(var1, (T)var2);
   }

   public boolean isEmpty() {
      return this.data.isEmpty();
   }

   public T get(ObfuscationType var1) {
      Object var2 = this.data.get(var1);
      return (T)(var2 != null ? var2 : this.defaultValue);
   }

   @Override
   public Iterator<ObfuscationType> iterator() {
      return this.data.keySet().iterator();
   }

   @Override
   public String toString() {
      return String.format("ObfuscationData[%s,DEFAULT=%s]", this.listValues(), this.defaultValue);
   }

   public String values() {
      return "[" + this.listValues() + "]";
   }

   private String listValues() {
      StringBuilder var1 = new StringBuilder();
      boolean var2 = false;

      for (ObfuscationType var4 : this.data.keySet()) {
         if (var2) {
            var1.append(',');
         }

         var1.append(var4.getKey()).append('=').append(this.data.get(var4));
         var2 = true;
      }

      return var1.toString();
   }
}
