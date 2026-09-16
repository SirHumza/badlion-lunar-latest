package com.github.benmanes.caffeine.cache;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

interface NodeFactory<K, V> {
   Lookup LOOKUP = MethodHandles.lookup();
   MethodType FACTORY = MethodType.methodType(void.class);
   ConcurrentMap<String, NodeFactory<Object, Object>> FACTORIES = new ConcurrentHashMap<>();
   NodeFactory.RetiredStrongKey RETIRED_STRONG_KEY = new NodeFactory.RetiredStrongKey();
   NodeFactory.RetiredWeakKey RETIRED_WEAK_KEY = new NodeFactory.RetiredWeakKey();
   NodeFactory.DeadStrongKey DEAD_STRONG_KEY = new NodeFactory.DeadStrongKey();
   NodeFactory.DeadWeakKey DEAD_WEAK_KEY = new NodeFactory.DeadWeakKey();
   String ACCESS_TIME = "accessTime";
   String WRITE_TIME = "writeTime";
   String VALUE = "value";
   String KEY = "key";

   default boolean weakValues() {
      return false;
   }

   default boolean softValues() {
      return false;
   }

   Node<K, V> newNode(K var1, ReferenceQueue<K> var2, V var3, ReferenceQueue<V> var4, int var5, long var6);

   Node<K, V> newNode(Object var1, V var2, ReferenceQueue<V> var3, int var4, long var5);

   default Object newReferenceKey(K var1, ReferenceQueue<K> var2) {
      return var1;
   }

   default Object newLookupKey(Object var1) {
      return var1;
   }

   static <K, V> NodeFactory<K, V> newFactory(Caffeine<K, V> var0, boolean var1) {
      if (var0.interner) {
         return (NodeFactory<K, V>)Interned.FACTORY;
      }

      String var2 = getClassName(var0, var1);
      return loadFactory(var2);
   }

   static String getClassName(Caffeine<?, ?> var0, boolean var1) {
      StringBuilder var2 = new StringBuilder();
      if (var0.isStrongKeys()) {
         var2.append('P');
      } else {
         var2.append('F');
      }

      if (var0.isStrongValues()) {
         var2.append('S');
      } else if (var0.isWeakValues()) {
         var2.append('W');
      } else {
         var2.append('D');
      }

      if (var0.expiresVariable()) {
         if (var0.refreshAfterWrite()) {
            var2.append('A');
            if (var0.evicts()) {
               var2.append('W');
            }
         } else {
            var2.append('W');
         }
      } else {
         if (var0.expiresAfterAccess()) {
            var2.append('A');
         }

         if (var0.expiresAfterWrite()) {
            var2.append('W');
         }
      }

      if (var0.refreshAfterWrite()) {
         var2.append('R');
      }

      if (var0.evicts()) {
         var2.append('M');
         if (!var1 && (!var0.isWeighted() || var0.weigher == Weigher.singletonWeigher())) {
            var2.append('S');
         } else {
            var2.append('W');
         }
      }

      return var2.toString();
   }

   static <K, V> NodeFactory<K, V> loadFactory(String var0) {
      NodeFactory var1 = FACTORIES.get(var0);
      if (var1 == null) {
         var1 = FACTORIES.computeIfAbsent(var0, NodeFactory::newFactory);
      }

      return var1;
   }

   static NodeFactory<Object, Object> newFactory(String var0) {
      try {
         Class var1 = LOOKUP.findClass(Node.class.getPackageName() + "." + var0);
         MethodHandle var2 = LOOKUP.findConstructor(var1, FACTORY);
         return (NodeFactory)var2.invoke();
      } catch (RuntimeException | Error var3) {
         throw var3;
      } catch (Throwable var4) {
         throw new IllegalStateException(var0, var4);
      }
   }

   final class DeadStrongKey {
   }

   final class DeadWeakKey extends References.WeakKeyReference<Object> {
      DeadWeakKey() {
         super(null, null);
      }
   }

   final class RetiredStrongKey {
   }

   final class RetiredWeakKey extends References.WeakKeyReference<Object> {
      RetiredWeakKey() {
         super(null, null);
      }
   }
}
