package org.jgrapht.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.util.TypeUtil;

public abstract class AbstractGraph<V, E> implements Graph<V, E> {
   protected AbstractGraph() {
   }

   @Override
   public boolean containsEdge(V var1, V var2) {
      return this.getEdge((V)var1, (V)var2) != null;
   }

   @Override
   public boolean removeAllEdges(Collection<? extends E> var1) {
      boolean var2 = false;

      for (Object var4 : var1) {
         var2 |= this.removeEdge((E)var4);
      }

      return var2;
   }

   @Override
   public Set<E> removeAllEdges(V var1, V var2) {
      Set var3 = this.getAllEdges((V)var1, (V)var2);
      if (var3 == null) {
         return null;
      }

      this.removeAllEdges(var3);
      return var3;
   }

   @Override
   public boolean removeAllVertices(Collection<? extends V> var1) {
      boolean var2 = false;

      for (Object var4 : var1) {
         var2 |= this.removeVertex((V)var4);
      }

      return var2;
   }

   @Override
   public String toString() {
      return this.toStringFromSets(this.vertexSet(), this.edgeSet(), this.getType().isDirected());
   }

   protected boolean assertVertexExist(V var1) {
      if (this.containsVertex((V)var1)) {
         return true;
      } else if (var1 == null) {
         throw new NullPointerException();
      } else {
         throw new IllegalArgumentException("no such vertex in graph: " + var1.toString());
      }
   }

   protected boolean removeAllEdges(E[] var1) {
      boolean var2 = false;

      for (Object var6 : var1) {
         var2 |= this.removeEdge((E)var6);
      }

      return var2;
   }

   protected String toStringFromSets(Collection<? extends V> var1, Collection<? extends E> var2, boolean var3) {
      ArrayList var4 = new ArrayList();
      StringBuilder var5 = new StringBuilder();

      for (Object var7 : var2) {
         if (var7.getClass() != DefaultEdge.class && var7.getClass() != DefaultWeightedEdge.class) {
            var5.append(var7.toString());
            var5.append("=");
         }

         if (var3) {
            var5.append("(");
         } else {
            var5.append("{");
         }

         var5.append(this.getEdgeSource((E)var7));
         var5.append(",");
         var5.append(this.getEdgeTarget((E)var7));
         if (var3) {
            var5.append(")");
         } else {
            var5.append("}");
         }

         var4.add(var5.toString());
         var5.setLength(0);
      }

      return "(" + var1 + ", " + var4 + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.vertexSet().hashCode();
      boolean var2 = this.getType().isDirected();

      for (Object var4 : this.edgeSet()) {
         int var5 = var4.hashCode();
         int var6 = this.getEdgeSource((E)var4).hashCode();
         int var7 = this.getEdgeTarget((E)var4).hashCode();
         int var8 = var6 + var7;
         if (var2) {
            var8 = var8 * (var8 + 1) / 2 + var7;
         }

         var5 = 31 * var5 + var8;
         var5 = 31 * var5 + Double.hashCode(this.getEdgeWeight((E)var4));
         var1 += var5;
      }

      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 != null && this.getClass() == var1.getClass()) {
         Graph var2 = TypeUtil.uncheckedCast(var1);
         if (!this.vertexSet().equals(var2.vertexSet())) {
            return false;
         }

         if (this.edgeSet().size() != var2.edgeSet().size()) {
            return false;
         }

         boolean var3 = this.getType().isDirected();

         for (Object var5 : this.edgeSet()) {
            Object var6 = this.getEdgeSource((E)var5);
            Object var7 = this.getEdgeTarget((E)var5);
            if (!var2.containsEdge(var5)) {
               return false;
            }

            Object var8 = var2.getEdgeSource(var5);
            Object var9 = var2.getEdgeTarget(var5);
            if (var3) {
               if (!var8.equals(var6) || !var9.equals(var7)) {
                  return false;
               }
            } else if ((!var8.equals(var6) || !var9.equals(var7)) && (!var8.equals(var7) || !var9.equals(var6))) {
               return false;
            }

            if (Double.compare(this.getEdgeWeight((E)var5), var2.getEdgeWeight(var5)) != 0) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
