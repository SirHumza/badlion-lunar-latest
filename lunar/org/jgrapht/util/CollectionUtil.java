package org.jgrapht.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class CollectionUtil {
   private CollectionUtil() {
   }

   public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int var0) {
      return new HashMap<>(capacityForSize(var0));
   }

   public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int var0) {
      return new LinkedHashMap<>(capacityForSize(var0));
   }

   public static <E> HashSet<E> newHashSetWithExpectedSize(int var0) {
      return new HashSet<>(capacityForSize(var0));
   }

   public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int var0) {
      return new LinkedHashSet<>(capacityForSize(var0));
   }

   private static int capacityForSize(int var0) {
      return (int)(var0 / 0.75F + 1.0F);
   }

   public static <E> E getElement(Iterable<E> var0, int var1) {
      if (var0 instanceof List) {
         return (E)((List)var0).get(var1);
      }

      Iterator var2 = var0.iterator();

      for (int var3 = 0; var3 < var1 && var2.hasNext(); var3++) {
         var2.next();
      }

      if (var2.hasNext()) {
         return (E)var2.next();
      } else {
         throw new IndexOutOfBoundsException(var1);
      }
   }
}
