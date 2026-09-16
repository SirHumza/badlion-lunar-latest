package org.jgrapht.graph;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.util.TypeUtil;

public abstract class BaseIntrusiveEdgesSpecifics<V, E, IE extends IntrusiveEdge> implements Serializable {
   private static final long serialVersionUID = -7498268216742485L;
   protected Map<E, IE> edgeMap;
   protected transient Set<E> unmodifiableEdgeSet = null;

   public BaseIntrusiveEdgesSpecifics(Map<E, IE> var1) {
      this.edgeMap = Objects.requireNonNull(var1);
   }

   public boolean containsEdge(E var1) {
      return this.edgeMap.containsKey(var1);
   }

   public Set<E> getEdgeSet() {
      if (this.unmodifiableEdgeSet == null) {
         this.unmodifiableEdgeSet = Collections.unmodifiableSet(this.edgeMap.keySet());
      }

      return this.unmodifiableEdgeSet;
   }

   public void remove(E var1) {
      this.edgeMap.remove(var1);
   }

   public V getEdgeSource(E var1) {
      IntrusiveEdge var2 = this.getIntrusiveEdge((E)var1);
      if (var2 == null) {
         throw new IllegalArgumentException("no such edge in graph: " + var1.toString());
      } else {
         return TypeUtil.uncheckedCast(var2.source);
      }
   }

   public V getEdgeTarget(E var1) {
      IntrusiveEdge var2 = this.getIntrusiveEdge((E)var1);
      if (var2 == null) {
         throw new IllegalArgumentException("no such edge in graph: " + var1.toString());
      } else {
         return TypeUtil.uncheckedCast(var2.target);
      }
   }

   public double getEdgeWeight(E var1) {
      return 1.0;
   }

   public void setEdgeWeight(E var1, double var2) {
      throw new UnsupportedOperationException();
   }

   public abstract boolean add(E var1, V var2, V var3);

   protected boolean addIntrusiveEdge(E var1, V var2, V var3, IE var4) {
      if (var4.source == null && var4.target == null) {
         var4.source = var2;
         var4.target = var3;
      } else if (var4.source != var2 || var4.target != var3) {
         throw new IntrusiveEdgeException(var4.source, var4.target);
      }

      return this.edgeMap.putIfAbsent((E)var1, (IE)var4) == null;
   }

   protected abstract IE getIntrusiveEdge(E var1);
}
