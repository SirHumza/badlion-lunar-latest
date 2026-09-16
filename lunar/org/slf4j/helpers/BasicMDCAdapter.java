package org.slf4j.helpers;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.spi.MDCAdapter;

public class BasicMDCAdapter implements MDCAdapter {
   private final ThreadLocalMapOfStacks threadLocalMapOfDeques = new ThreadLocalMapOfStacks();
   private final InheritableThreadLocal<Map<String, String>> inheritableThreadLocalMap = new InheritableThreadLocal<Map<String, String>>() {
      protected Map<String, String> childValue(Map<String, String> var1) {
         return var1 == null ? null : new HashMap<>(var1);
      }
   };

   @Override
   public void put(String var1, String var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("key cannot be null");
      }

      Map var3 = this.inheritableThreadLocalMap.get();
      if (var3 == null) {
         var3 = new HashMap();
         this.inheritableThreadLocalMap.set(var3);
      }

      var3.put(var1, var2);
   }

   @Override
   public String get(String var1) {
      Map var2 = this.inheritableThreadLocalMap.get();
      return var2 != null && var1 != null ? (String)var2.get(var1) : null;
   }

   @Override
   public void remove(String var1) {
      Map var2 = this.inheritableThreadLocalMap.get();
      if (var2 != null) {
         var2.remove(var1);
      }
   }

   @Override
   public void clear() {
      Map var1 = this.inheritableThreadLocalMap.get();
      if (var1 != null) {
         var1.clear();
         this.inheritableThreadLocalMap.remove();
      }
   }

   public Set<String> getKeys() {
      Map var1 = this.inheritableThreadLocalMap.get();
      return var1 != null ? var1.keySet() : null;
   }

   @Override
   public Map<String, String> getCopyOfContextMap() {
      Map var1 = this.inheritableThreadLocalMap.get();
      return var1 != null ? new HashMap<>(var1) : null;
   }

   @Override
   public void setContextMap(Map<String, String> var1) {
      HashMap var2 = null;
      if (var1 != null) {
         var2 = new HashMap(var1);
      }

      this.inheritableThreadLocalMap.set(var2);
   }

   @Override
   public void pushByKey(String var1, String var2) {
      this.threadLocalMapOfDeques.pushByKey(var1, var2);
   }

   @Override
   public String popByKey(String var1) {
      return this.threadLocalMapOfDeques.popByKey(var1);
   }

   @Override
   public Deque<String> getCopyOfDequeByKey(String var1) {
      return this.threadLocalMapOfDeques.getCopyOfDequeByKey(var1);
   }

   @Override
   public void clearDequeByKey(String var1) {
      this.threadLocalMapOfDeques.clearDequeByKey(var1);
   }
}
