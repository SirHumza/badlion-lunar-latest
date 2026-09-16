package org.jgrapht.alg.isomorphism;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphMapping;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.util.CollectionUtil;
import org.jgrapht.util.RadixSort;

public class AHURootedTreeIsomorphismInspector<V, E> implements IsomorphismInspector<V, E> {
   private final Graph<V, E> tree1;
   private final Graph<V, E> tree2;
   private V root1;
   private V root2;
   private Map<V, V> forwardMapping;
   private Map<V, V> backwardMapping;

   public AHURootedTreeIsomorphismInspector(Graph<V, E> var1, V var2, Graph<V, E> var3, V var4) {
      this.validateTree(var1, (V)var2);
      this.tree1 = var1;
      this.root1 = (V)var2;
      this.validateTree(var3, (V)var4);
      this.tree2 = var3;
      this.root2 = (V)var4;
   }

   private void validateTree(Graph<V, E> var1, V var2) {
      assert GraphTests.isSimple(var1);
      Objects.requireNonNull(var1, "input forest cannot be null");
      Objects.requireNonNull(var2, "root cannot be null");
      if (var1.vertexSet().isEmpty()) {
         throw new IllegalArgumentException("tree cannot be empty");
      }

      if (!var1.containsVertex(var2)) {
         throw new IllegalArgumentException("root not contained in forest");
      }
   }

   private void bfs(Graph<V, E> var1, V var2, List<List<V>> var3) {
      BreadthFirstIterator var4 = new BreadthFirstIterator<>(var1, var2);

      while (var4.hasNext()) {
         Object var5 = var4.next();
         if (var3.size() < var4.getDepth(var5) + 1) {
            var3.add(new ArrayList());
         }

         ((List)var3.get(var4.getDepth(var5))).add(var5);
      }
   }

   private List<List<V>> computeLevels(Graph<V, E> var1, V var2) {
      ArrayList var3 = new ArrayList();
      this.bfs(var1, (V)var2, var3);
      return var3;
   }

   private void matchVerticesWithSameLabel(V var1, V var2, Map<V, Integer>[] var3) {
      ArrayDeque var4 = new ArrayDeque();
      var4.add(Pair.of(var1, var2));

      while (!var4.isEmpty()) {
         Pair var5 = (Pair)var4.poll();
         Object var6 = var5.getFirst();
         Object var7 = var5.getSecond();
         this.forwardMapping.put((V)var6, (V)var7);
         this.backwardMapping.put((V)var7, (V)var6);
         HashMap var8 = CollectionUtil.newHashMapWithExpectedSize(this.tree1.degreeOf((V)var6));

         for (Object var10 : this.tree1.outgoingEdgesOf((V)var6)) {
            Object var11 = Graphs.getOppositeVertex(this.tree1, (E)var10, (V)var6);
            if (!this.forwardMapping.containsKey(var11)) {
               var8.computeIfAbsent((Integer)var3[0].get(var11), var0 -> new ArrayList<>()).add(var11);
            }
         }

         for (Object var15 : this.tree2.outgoingEdgesOf((V)var7)) {
            Object var16 = Graphs.getOppositeVertex(this.tree2, (E)var15, (V)var7);
            if (!this.backwardMapping.containsKey(var16)) {
               List var12 = (List)var8.get(var3[1].get(var16));
               if (var12 == null || var12.isEmpty()) {
                  this.forwardMapping.clear();
                  this.backwardMapping.clear();
                  return;
               }

               Object var13 = var12.remove(var12.size() - 1);
               var4.add(Pair.of(var13, var16));
            }
         }
      }
   }

   private boolean isomorphismExists(V var1, V var2) {
      if (this.forwardMapping != null) {
         return !this.forwardMapping.isEmpty();
      }

      this.forwardMapping = new HashMap<>();
      this.backwardMapping = new HashMap<>();
      Map[] var3 = (Map[])Array.newInstance(Map.class, 2);
      var3[0] = CollectionUtil.newHashMapWithExpectedSize(this.tree1.vertexSet().size());
      var3[1] = CollectionUtil.newHashMapWithExpectedSize(this.tree2.vertexSet().size());
      List var4 = this.computeLevels(this.tree1, (V)var1);
      List var5 = this.computeLevels(this.tree2, (V)var2);
      if (var4.size() != var5.size()) {
         return false;
      }

      int var6 = var4.size() - 1;
      HashMap var7 = new HashMap();
      int var8 = 0;

      for (int var9 = var6; var9 >= 0; var9--) {
         List[] var10 = (List[])Array.newInstance(List.class, 2);
         var10[0] = (List)var4.get(var9);
         var10[1] = (List)var5.get(var9);
         if (var10[0].size() != var10[1].size()) {
            return false;
         }

         int var11 = var10[0].size();

         for (int var12 = 0; var12 < 2; var12++) {
            Graph var13 = var12 == 0 ? this.tree1 : this.tree2;

            for (int var14 = 0; var14 < var11; var14++) {
               Object var15 = var10[var12].get(var14);
               ArrayList var16 = new ArrayList();

               for (Object var18 : var13.outgoingEdgesOf(var15)) {
                  Object var19 = Graphs.getOppositeVertex(var13, var18, var15);
                  int var20 = var3[var12].getOrDefault(var19, -1);
                  if (var20 != -1) {
                     var16.add(var20);
                  }
               }

               RadixSort.sort(var16);
               Integer var21 = (Integer)var7.get(var16);
               if (var21 == null) {
                  var7.put(var16, var8);
                  var21 = var8;
                  var8++;
               }

               var3[var12].put(var15, var21);
            }
         }
      }

      this.matchVerticesWithSameLabel((V)var1, (V)var2, var3);
      if (this.forwardMapping.size() != this.tree1.vertexSet().size()) {
         this.forwardMapping.clear();
         this.backwardMapping.clear();
         return false;
      } else {
         return true;
      }
   }

   @Override
   public Iterator<GraphMapping<V, E>> getMappings() {
      IsomorphicGraphMapping var1 = this.getMapping();
      return var1 == null ? Collections.emptyIterator() : Collections.singletonList(var1).iterator();
   }

   @Override
   public boolean isomorphismExists() {
      return this.isomorphismExists(this.root1, this.root2);
   }

   public IsomorphicGraphMapping<V, E> getMapping() {
      return this.isomorphismExists() ? new IsomorphicGraphMapping<>(this.forwardMapping, this.backwardMapping, this.tree1, this.tree2) : null;
   }
}
