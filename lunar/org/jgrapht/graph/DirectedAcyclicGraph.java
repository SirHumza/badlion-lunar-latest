package org.jgrapht.graph;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.util.SupplierUtil;

public class DirectedAcyclicGraph<V, E> extends AbstractBaseGraph<V, E> implements Iterable<V> {
   private static final long serialVersionUID = 4522128427004938150L;
   private static final String EDGE_WOULD_INDUCE_A_CYCLE = "Edge would induce a cycle";
   private final Comparator<V> topoComparator;
   private final DirectedAcyclicGraph.TopoOrderMap<V> topoOrderMap;
   private int maxTopoIndex = 0;
   private int minTopoIndex = 0;
   private transient long topoModCount = 0L;
   private final DirectedAcyclicGraph.VisitedStrategyFactory visitedStrategyFactory;

   public DirectedAcyclicGraph(Class<? extends E> var1) {
      this(null, SupplierUtil.createSupplier(var1), false, false);
   }

   public DirectedAcyclicGraph(Supplier<V> var1, Supplier<E> var2, boolean var3) {
      this(var1, var2, new DirectedAcyclicGraph.VisitedBitSetImpl(), new DirectedAcyclicGraph.TopoVertexBiMap<>(), var3, false);
   }

   public DirectedAcyclicGraph(Supplier<V> var1, Supplier<E> var2, boolean var3, boolean var4) {
      this(var1, var2, new DirectedAcyclicGraph.VisitedBitSetImpl(), new DirectedAcyclicGraph.TopoVertexBiMap<>(), var3, var4);
   }

   protected DirectedAcyclicGraph(
      Supplier<V> var1, Supplier<E> var2, DirectedAcyclicGraph.VisitedStrategyFactory var3, DirectedAcyclicGraph.TopoOrderMap<V> var4, boolean var5
   ) {
      this(var1, var2, var3, var4, var5, false);
   }

   protected DirectedAcyclicGraph(
      Supplier<V> var1,
      Supplier<E> var2,
      DirectedAcyclicGraph.VisitedStrategyFactory var3,
      DirectedAcyclicGraph.TopoOrderMap<V> var4,
      boolean var5,
      boolean var6
   ) {
      super(var1, var2, new DefaultGraphType.Builder().directed().allowMultipleEdges(var6).allowSelfLoops(false).weighted(var5).allowCycles(false).build());
      this.visitedStrategyFactory = Objects.requireNonNull(var3, "Visited factory cannot be null");
      this.topoOrderMap = Objects.requireNonNull(var4, "Topological order map cannot be null");
      this.topoComparator = new DirectedAcyclicGraph.TopoComparator();
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedAcyclicGraph<V, E>> createBuilder(Class<? extends E> var0) {
      return new GraphBuilder<>(new DirectedAcyclicGraph<>(var0));
   }

   public static <V, E> GraphBuilder<V, E, ? extends DirectedAcyclicGraph<V, E>> createBuilder(Supplier<E> var0) {
      return new GraphBuilder<>(new DirectedAcyclicGraph<>(null, var0, false));
   }

   @Override
   public V addVertex() {
      Object var1 = super.addVertex();
      if (var1 != null) {
         this.maxTopoIndex++;
         this.topoOrderMap.putVertex(this.maxTopoIndex, (V)var1);
         this.topoModCount++;
      }

      return (V)var1;
   }

   @Override
   public boolean addVertex(V var1) {
      boolean var2 = super.addVertex((V)var1);
      if (var2) {
         this.maxTopoIndex++;
         this.topoOrderMap.putVertex(this.maxTopoIndex, (V)var1);
         this.topoModCount++;
      }

      return var2;
   }

   @Override
   public boolean removeVertex(V var1) {
      boolean var2 = super.removeVertex((V)var1);
      if (var2) {
         Integer var3 = this.topoOrderMap.removeVertex((V)var1);
         if (var3 == this.minTopoIndex) {
            while (this.minTopoIndex < 0 && this.topoOrderMap.getVertex(this.minTopoIndex) == null) {
               this.minTopoIndex++;
            }
         }

         if (var3 == this.maxTopoIndex) {
            while (this.maxTopoIndex > 0 && this.topoOrderMap.getVertex(this.maxTopoIndex) == null) {
               this.maxTopoIndex--;
            }
         }

         this.topoModCount++;
      }

      return var2;
   }

   @Override
   public E addEdge(V var1, V var2) {
      this.assertVertexExist((V)var1);
      this.assertVertexExist((V)var2);

      try {
         this.updateDag((V)var1, (V)var2);
         return super.addEdge((V)var1, (V)var2);
      } catch (DirectedAcyclicGraph.CycleFoundException var5) {
         throw new IllegalArgumentException("Edge would induce a cycle");
      }
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      if (var3 == null) {
         throw new NullPointerException();
      }

      if (this.containsEdge((E)var3)) {
         return false;
      }

      this.assertVertexExist((V)var1);
      this.assertVertexExist((V)var2);

      try {
         this.updateDag((V)var1, (V)var2);
         return super.addEdge((V)var1, (V)var2, (E)var3);
      } catch (DirectedAcyclicGraph.CycleFoundException var6) {
         throw new IllegalArgumentException("Edge would induce a cycle");
      }
   }

   public Set<V> getAncestors(V var1) {
      EdgeReversedGraph var2 = new EdgeReversedGraph<>(this);
      DepthFirstIterator var3 = new DepthFirstIterator<>(var2, (V)var1);
      HashSet var4 = new HashSet();
      if (var3.hasNext()) {
         var3.next();
      }

      var3.forEachRemaining(var4::add);
      return var4;
   }

   public Set<V> getDescendants(V var1) {
      DepthFirstIterator var2 = new DepthFirstIterator<>(this, (V)var1);
      HashSet var3 = new HashSet();
      if (var2.hasNext()) {
         var2.next();
      }

      var2.forEachRemaining(var3::add);
      return var3;
   }

   @Override
   public Iterator<V> iterator() {
      return new DirectedAcyclicGraph.TopoIterator();
   }

   private void updateDag(V var1, V var2) {
      Integer var3 = this.topoOrderMap.getTopologicalIndex((V)var2);
      Integer var4 = this.topoOrderMap.getTopologicalIndex((V)var1);
      if (var3 < var4) {
         HashSet var5 = new HashSet();
         HashSet var6 = new HashSet();
         DirectedAcyclicGraph.Region var7 = new DirectedAcyclicGraph.Region(var3, var4);
         DirectedAcyclicGraph.VisitedStrategy var8 = this.visitedStrategyFactory.getVisitedStrategy(var7);
         this.dfsF((V)var2, var5, var8, var7);
         this.dfsB((V)var1, var6, var8, var7);
         this.reorder(var5, var6, var8);
         this.topoModCount++;
      }
   }

   private void dfsF(V var1, Set<V> var2, DirectedAcyclicGraph.VisitedStrategy var3, DirectedAcyclicGraph.Region var4) {
      ArrayDeque var5 = new ArrayDeque();
      var5.push(var1);

      while (!var5.isEmpty()) {
         Object var6 = var5.pop();
         int var7 = this.topoOrderMap.getTopologicalIndex((V)var6);
         if (!var3.getVisited(var7)) {
            var3.setVisited(var7);
            var2.add(var6);

            for (Object var9 : this.outgoingEdgesOf((V)var6)) {
               Object var10 = this.getEdgeTarget((E)var9);
               Integer var11 = this.topoOrderMap.getTopologicalIndex((V)var10);
               if (var11 == var4.finish) {
                  try {
                     for (Object var13 : var2) {
                        var3.clearVisited(this.topoOrderMap.getTopologicalIndex((V)var13));
                     }
                  } catch (UnsupportedOperationException var14) {
                  }

                  throw new DirectedAcyclicGraph.CycleFoundException();
               }

               if (var4.isIn(var11) && !var3.getVisited(var11)) {
                  var5.push(var10);
               }
            }
         }
      }
   }

   private void dfsB(V var1, Set<V> var2, DirectedAcyclicGraph.VisitedStrategy var3, DirectedAcyclicGraph.Region var4) {
      ArrayDeque var5 = new ArrayDeque();
      var5.push(var1);

      while (!var5.isEmpty()) {
         Object var6 = var5.pop();
         int var7 = this.topoOrderMap.getTopologicalIndex((V)var6);
         if (!var3.getVisited(var7)) {
            var3.setVisited(var7);
            var2.add(var6);

            for (Object var9 : this.incomingEdgesOf((V)var6)) {
               Object var10 = this.getEdgeSource((E)var9);
               Integer var11 = this.topoOrderMap.getTopologicalIndex((V)var10);
               if (var4.isIn(var11) && !var3.getVisited(var11)) {
                  var5.push(var10);
               }
            }
         }
      }
   }

   private void reorder(Set<V> var1, Set<V> var2, DirectedAcyclicGraph.VisitedStrategy var3) {
      ArrayList var4 = new ArrayList<>(var1);
      ArrayList var5 = new ArrayList<>(var2);
      var4.sort(this.topoComparator);
      var5.sort(this.topoComparator);
      TreeSet var6 = new TreeSet();
      Object[] var7 = new Object[var1.size() + var2.size()];
      int var8 = 0;
      boolean var9 = true;

      for (Object var11 : var5) {
         Integer var12 = this.topoOrderMap.getTopologicalIndex((V)var11);
         var6.add(var12);
         var7[var8++] = var11;
         if (var9) {
            try {
               var3.clearVisited(var12);
            } catch (UnsupportedOperationException var15) {
               var9 = false;
            }
         }
      }

      for (Object var19 : var4) {
         Integer var21 = this.topoOrderMap.getTopologicalIndex((V)var19);
         var6.add(var21);
         var7[var8++] = var19;
         if (var9) {
            try {
               var3.clearVisited(var21);
            } catch (UnsupportedOperationException var14) {
               var9 = false;
            }
         }
      }

      var8 = 0;

      for (Integer var20 : var6) {
         Object var22 = var7[var8++];
         this.topoOrderMap.putVertex(var20, (V)var22);
      }
   }

   private static class CycleFoundException extends Exception {
      private static final long serialVersionUID = 5583471522212552754L;
   }

   protected static class Region implements Serializable {
      private static final long serialVersionUID = 1L;
      private final int start;
      private final int finish;

      public Region(int var1, int var2) {
         if (var1 > var2) {
            throw new IllegalArgumentException("(start > finish): invariant broken");
         }

         this.start = var1;
         this.finish = var2;
      }

      public int getSize() {
         return this.finish - this.start + 1;
      }

      public boolean isIn(int var1) {
         return var1 >= this.start && var1 <= this.finish;
      }

      public int getStart() {
         return this.start;
      }

      public int getFinish() {
         return this.finish;
      }
   }

   private class TopoComparator implements Serializable, Comparator<V> {
      private static final long serialVersionUID = 8144905376266340066L;

      @Override
      public int compare(V var1, V var2) {
         return DirectedAcyclicGraph.this.topoOrderMap
            .getTopologicalIndex((V)var1)
            .compareTo(DirectedAcyclicGraph.this.topoOrderMap.getTopologicalIndex((V)var2));
      }
   }

   private class TopoIterator implements Iterator<V> {
      private int currentTopoIndex;
      private final long expectedTopoModCount = DirectedAcyclicGraph.this.topoModCount;
      private Integer nextIndex = null;

      public TopoIterator() {
         this.currentTopoIndex = DirectedAcyclicGraph.this.minTopoIndex - 1;
      }

      @Override
      public boolean hasNext() {
         if (this.expectedTopoModCount != DirectedAcyclicGraph.this.topoModCount) {
            throw new ConcurrentModificationException();
         }

         this.nextIndex = this.getNextIndex();
         return this.nextIndex != null;
      }

      @Override
      public V next() {
         if (this.expectedTopoModCount != DirectedAcyclicGraph.this.topoModCount) {
            throw new ConcurrentModificationException();
         }

         if (this.nextIndex == null) {
            this.nextIndex = this.getNextIndex();
         }

         if (this.nextIndex == null) {
            throw new NoSuchElementException();
         }

         this.currentTopoIndex = this.nextIndex;
         this.nextIndex = null;
         return DirectedAcyclicGraph.this.topoOrderMap.getVertex(this.currentTopoIndex);
      }

      @Override
      public void remove() {
         if (this.expectedTopoModCount != DirectedAcyclicGraph.this.topoModCount) {
            throw new ConcurrentModificationException();
         }

         Object var1;
         if ((var1 = DirectedAcyclicGraph.this.topoOrderMap.getVertex(this.currentTopoIndex)) != null) {
            DirectedAcyclicGraph.this.topoOrderMap.removeVertex((V)var1);
         } else {
            throw new IllegalStateException();
         }
      }

      private Integer getNextIndex() {
         for (int var1 = this.currentTopoIndex + 1; var1 <= DirectedAcyclicGraph.this.maxTopoIndex; var1++) {
            if (DirectedAcyclicGraph.this.topoOrderMap.getVertex(var1) != null) {
               return var1;
            }
         }

         return null;
      }
   }

   protected interface TopoOrderMap<V> extends Serializable {
      void putVertex(Integer var1, V var2);

      V getVertex(Integer var1);

      Integer getTopologicalIndex(V var1);

      Integer removeVertex(V var1);

      void removeAllVertices();
   }

   protected static class TopoVertexBiMap<V> implements DirectedAcyclicGraph.TopoOrderMap<V> {
      private static final long serialVersionUID = 1L;
      private final Map<Integer, V> topoToVertex = new HashMap<>();
      private final Map<V, Integer> vertexToTopo = new HashMap<>();

      public TopoVertexBiMap() {
      }

      @Override
      public void putVertex(Integer var1, V var2) {
         this.topoToVertex.put(var1, (V)var2);
         this.vertexToTopo.put((V)var2, var1);
      }

      @Override
      public V getVertex(Integer var1) {
         return this.topoToVertex.get(var1);
      }

      @Override
      public Integer getTopologicalIndex(V var1) {
         return this.vertexToTopo.get(var1);
      }

      @Override
      public Integer removeVertex(V var1) {
         Integer var2 = this.vertexToTopo.remove(var1);
         if (var2 != null) {
            this.topoToVertex.remove(var2);
         }

         return var2;
      }

      @Override
      public void removeAllVertices() {
         this.vertexToTopo.clear();
         this.topoToVertex.clear();
      }
   }

   protected class TopoVertexMap implements DirectedAcyclicGraph.TopoOrderMap<V> {
      private static final long serialVersionUID = 1L;
      private final List<V> topoToVertex = new ArrayList();
      private final Map<V, Integer> vertexToTopo = new HashMap<>();

      public TopoVertexMap() {
      }

      @Override
      public void putVertex(Integer var1, V var2) {
         int var3 = this.translateIndex(var1);

         while (var3 + 1 > this.topoToVertex.size()) {
            this.topoToVertex.add(null);
         }

         this.topoToVertex.set(var3, (V)var2);
         this.vertexToTopo.put((V)var2, var1);
      }

      @Override
      public V getVertex(Integer var1) {
         return this.topoToVertex.get(this.translateIndex(var1));
      }

      @Override
      public Integer getTopologicalIndex(V var1) {
         return this.vertexToTopo.get(var1);
      }

      @Override
      public Integer removeVertex(V var1) {
         Integer var2 = this.vertexToTopo.remove(var1);
         if (var2 != null) {
            this.topoToVertex.set(this.translateIndex(var2), null);
         }

         return var2;
      }

      @Override
      public void removeAllVertices() {
         this.vertexToTopo.clear();
         this.topoToVertex.clear();
      }

      private int translateIndex(int var1) {
         return var1 >= 0 ? 2 * var1 : -1 * (var1 * 2 - 1);
      }
   }

   protected static class VisitedArrayImpl implements DirectedAcyclicGraph.VisitedStrategy, DirectedAcyclicGraph.VisitedStrategyFactory {
      private static final long serialVersionUID = 1L;
      private final boolean[] visited;
      private final DirectedAcyclicGraph.Region region;

      public VisitedArrayImpl() {
         this(null);
      }

      public VisitedArrayImpl(DirectedAcyclicGraph.Region var1) {
         if (var1 == null) {
            this.visited = null;
            this.region = null;
         } else {
            this.region = var1;
            this.visited = new boolean[var1.getSize()];
         }
      }

      @Override
      public DirectedAcyclicGraph.VisitedStrategy getVisitedStrategy(DirectedAcyclicGraph.Region var1) {
         return new DirectedAcyclicGraph.VisitedArrayImpl(var1);
      }

      @Override
      public void setVisited(int var1) {
         this.visited[var1 - this.region.start] = true;
      }

      @Override
      public boolean getVisited(int var1) {
         return this.visited[var1 - this.region.start];
      }

      @Override
      public void clearVisited(int var1) {
         throw new UnsupportedOperationException();
      }
   }

   protected static class VisitedArrayListImpl implements DirectedAcyclicGraph.VisitedStrategy, DirectedAcyclicGraph.VisitedStrategyFactory {
      private static final long serialVersionUID = 1L;
      private final List<Boolean> visited = new ArrayList<>();
      private DirectedAcyclicGraph.Region affectedRegion;

      public VisitedArrayListImpl() {
      }

      @Override
      public DirectedAcyclicGraph.VisitedStrategy getVisitedStrategy(DirectedAcyclicGraph.Region var1) {
         int var2 = var1.finish - var1.start + 1;

         while (this.visited.size() < var2) {
            this.visited.add(Boolean.FALSE);
         }

         this.affectedRegion = var1;
         return this;
      }

      @Override
      public void setVisited(int var1) {
         this.visited.set(this.translateIndex(var1), Boolean.TRUE);
      }

      @Override
      public boolean getVisited(int var1) {
         return this.visited.get(this.translateIndex(var1));
      }

      @Override
      public void clearVisited(int var1) {
         this.visited.set(this.translateIndex(var1), Boolean.FALSE);
      }

      private int translateIndex(int var1) {
         return var1 - this.affectedRegion.start;
      }
   }

   protected static class VisitedBitSetImpl implements DirectedAcyclicGraph.VisitedStrategy, DirectedAcyclicGraph.VisitedStrategyFactory {
      private static final long serialVersionUID = 1L;
      private final BitSet visited = new BitSet();
      private DirectedAcyclicGraph.Region affectedRegion;

      public VisitedBitSetImpl() {
      }

      @Override
      public DirectedAcyclicGraph.VisitedStrategy getVisitedStrategy(DirectedAcyclicGraph.Region var1) {
         this.affectedRegion = var1;
         return this;
      }

      @Override
      public void setVisited(int var1) {
         this.visited.set(this.translateIndex(var1), true);
      }

      @Override
      public boolean getVisited(int var1) {
         return this.visited.get(this.translateIndex(var1));
      }

      @Override
      public void clearVisited(int var1) {
         this.visited.clear(this.translateIndex(var1));
      }

      private int translateIndex(int var1) {
         return var1 - this.affectedRegion.start;
      }
   }

   protected static class VisitedHashSetImpl implements DirectedAcyclicGraph.VisitedStrategy, DirectedAcyclicGraph.VisitedStrategyFactory {
      private static final long serialVersionUID = 1L;
      private final Set<Integer> visited = new HashSet<>();

      public VisitedHashSetImpl() {
      }

      @Override
      public DirectedAcyclicGraph.VisitedStrategy getVisitedStrategy(DirectedAcyclicGraph.Region var1) {
         this.visited.clear();
         return this;
      }

      @Override
      public void setVisited(int var1) {
         this.visited.add(var1);
      }

      @Override
      public boolean getVisited(int var1) {
         return this.visited.contains(var1);
      }

      @Override
      public void clearVisited(int var1) {
         throw new UnsupportedOperationException();
      }
   }

   protected interface VisitedStrategy {
      void setVisited(int var1);

      boolean getVisited(int var1);

      void clearVisited(int var1);
   }

   protected interface VisitedStrategyFactory extends Serializable {
      DirectedAcyclicGraph.VisitedStrategy getVisitedStrategy(DirectedAcyclicGraph.Region var1);
   }
}
