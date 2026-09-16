package org.jgrapht.alg.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionFind<T> {
   private final Map<T, T> parentMap = new LinkedHashMap<>();
   private final Map<T, Integer> rankMap = new HashMap<>();
   private int count;

   public UnionFind(Set<T> var1) {
      for (Object var3 : var1) {
         this.parentMap.put((T)var3, (T)var3);
         this.rankMap.put((T)var3, 0);
      }

      this.count = var1.size();
   }

   public void addElement(T var1) {
      if (this.parentMap.containsKey(var1)) {
         throw new IllegalArgumentException("element is already contained in UnionFind: " + var1);
      }

      this.parentMap.put((T)var1, (T)var1);
      this.rankMap.put((T)var1, 0);
      this.count++;
   }

   protected Map<T, T> getParentMap() {
      return this.parentMap;
   }

   protected Map<T, Integer> getRankMap() {
      return this.rankMap;
   }

   public T find(T var1) {
      if (!this.parentMap.containsKey(var1)) {
         throw new IllegalArgumentException("element is not contained in this UnionFind data structure: " + var1);
      }

      Object var2 = var1;

      while (true) {
         Object var3 = this.parentMap.get(var2);
         if (var3.equals(var2)) {
            var3 = var2;
            var2 = var1;

            while (!var2.equals(var3)) {
               Object var4 = this.parentMap.get(var2);
               this.parentMap.put((T)var2, (T)var3);
               var2 = var4;
            }

            return (T)var3;
         }

         var2 = var3;
      }
   }

   public void union(T var1, T var2) {
      if (this.parentMap.containsKey(var1) && this.parentMap.containsKey(var2)) {
         Object var3 = this.find((T)var1);
         Object var4 = this.find((T)var2);
         if (!var3.equals(var4)) {
            int var5 = this.rankMap.get(var3);
            int var6 = this.rankMap.get(var4);
            if (var5 > var6) {
               this.parentMap.put((T)var4, (T)var3);
            } else if (var5 < var6) {
               this.parentMap.put((T)var3, (T)var4);
            } else {
               this.parentMap.put((T)var4, (T)var3);
               this.rankMap.put((T)var3, var5 + 1);
            }

            this.count--;
         }
      } else {
         throw new IllegalArgumentException("elements must be contained in given set");
      }
   }

   public boolean inSameSet(T var1, T var2) {
      return this.find((T)var1).equals(this.find((T)var2));
   }

   public int numberOfSets() {
      assert this.count >= 1 && this.count <= this.parentMap.keySet().size();
      return this.count;
   }

   public int size() {
      return this.parentMap.size();
   }

   public void reset() {
      for (Object var2 : this.parentMap.keySet()) {
         this.parentMap.put((T)var2, (T)var2);
         this.rankMap.put((T)var2, 0);
      }

      this.count = this.parentMap.size();
   }

   @Override
   public String toString() {
      LinkedHashMap var1 = new LinkedHashMap();

      for (Object var3 : this.parentMap.keySet()) {
         Object var4 = this.find((T)var3);
         if (!var1.containsKey(var4)) {
            var1.put(var4, new LinkedHashSet());
         }

         ((Set)var1.get(var4)).add(var3);
      }

      return var1.keySet()
         .stream()
         .map(var1x -> "{" + var1x + ":" + ((Set)var1.get(var1x)).stream().map(Objects::toString).collect(Collectors.joining(",")) + "}")
         .collect(Collectors.joining(", ", "{", "}"));
   }
}
