package org.jgrapht.alg.vertexcover.util;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jgrapht.util.TypeUtil;

public class RatioVertex<V> implements Comparable<RatioVertex<V>> {
   public final V v;
   public double weight;
   public final int ID;
   protected int degree = 0;
   public final Map<RatioVertex<V>, Integer> neighbors;

   public RatioVertex(int var1, V var2, double var3) {
      this.ID = var1;
      this.v = (V)var2;
      this.weight = var3;
      this.neighbors = new LinkedHashMap<>();
   }

   public void addNeighbor(RatioVertex<V> var1) {
      if (!this.neighbors.containsKey(var1)) {
         this.neighbors.put(var1, 1);
      } else {
         this.neighbors.put(var1, this.neighbors.get(var1) + 1);
      }

      this.degree++;
      assert this.neighbors.values().stream().mapToInt(Integer::intValue).sum() == this.degree;
   }

   public void removeNeighbor(RatioVertex<V> var1) {
      this.degree = this.degree - this.neighbors.get(var1);
      this.neighbors.remove(var1);
   }

   public int getDegree() {
      return this.degree;
   }

   public double getRatio() {
      return this.weight / this.degree;
   }

   public int compareTo(RatioVertex<V> var1) {
      if (this.ID == var1.ID) {
         return 0;
      }

      int var2 = Double.compare(this.getRatio(), var1.getRatio());
      return var2 == 0 ? Integer.compare(this.ID, var1.ID) : var2;
   }

   @Override
   public int hashCode() {
      return this.ID;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof RatioVertex)) {
         return false;
      }

      RatioVertex var2 = TypeUtil.uncheckedCast(var1);
      return this.ID == var2.ID;
   }

   @Override
   public String toString() {
      return "v" + this.ID + "(" + this.degree + ")";
   }
}
