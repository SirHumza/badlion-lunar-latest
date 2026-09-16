package org.jgrapht.alg.color;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexColoringAlgorithm;
import org.jgrapht.util.CollectionUtil;

public class ColorRefinementAlgorithm<V, E> implements VertexColoringAlgorithm<V> {
   private final Graph<V, E> graph;
   private final VertexColoringAlgorithm.Coloring<V> alpha;

   public ColorRefinementAlgorithm(Graph<V, E> var1, VertexColoringAlgorithm.Coloring<V> var2) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      this.alpha = Objects.requireNonNull(var2, "alpha cannot be null");
      if (!this.isAlphaConsistent(var2, var1)) {
         throw new IllegalArgumentException("alpha is not a valid surjective l-coloring for the given graph.");
      }
   }

   public ColorRefinementAlgorithm(Graph<V, E> var1) {
      this(var1, getDefaultAlpha(var1.vertexSet()));
   }

   @Override
   public VertexColoringAlgorithm.Coloring<V> getColoring() {
      ColorRefinementAlgorithm.ColoringRepresentation var1 = new ColorRefinementAlgorithm.ColoringRepresentation(this.graph, this.alpha);
      Deque var2 = this.getSortedStack(this.alpha);

      while (!var2.isEmpty()) {
         Integer var3 = (Integer)var2.pop();
         Set var4 = this.calculateColorDegrees(var3, var1);
         var4.stream()
            .filter(var1x -> var1.minColorDegree[var1x] < var1.maxColorDegree[var1x])
            .sorted(Comparator.comparingInt(var0 -> var0))
            .forEach(var3x -> this.splitUpColor(var3x, var2, var1));
         this.cleanupColorDegrees(var4, var1);
      }

      return new VertexColoringAlgorithm.ColoringImpl<>(var1.coloring, var1.coloring.size());
   }

   private Set<Integer> calculateColorDegrees(int var1, ColorRefinementAlgorithm<V, E>.ColoringRepresentation var2) {
      int var3 = this.graph.vertexSet().size();
      LinkedHashSet var4 = CollectionUtil.newLinkedHashSetWithExpectedSize(var3);

      for (Object var6 : var2.colorClasses.get(var1)) {
         for (Object var9 : (Set)this.graph
            .incomingEdgesOf((V)var6)
            .stream()
            .map(var2x -> Graphs.getOppositeVertex(this.graph, (E)var2x, (V)var6))
            .collect(Collectors.toSet())) {
            var2.colorDegree.put((V)var9, var2.colorDegree.get(var9) + 1);
            if (var2.colorDegree.get(var9) == 1) {
               var2.positiveDegreeColorClasses.get(var2.coloring.get(var9)).add((V)var9);
            }

            var4.add(var2.coloring.get(var9));
            if (var2.colorDegree.get(var9) > var2.maxColorDegree[var2.coloring.get(var9)]) {
               var2.maxColorDegree[var2.coloring.get(var9)] = var2.colorDegree.get(var9);
            }
         }
      }

      for (Integer var11 : var4) {
         if (var2.colorClasses.get(var11).size() != var2.positiveDegreeColorClasses.get(var11).size()) {
            var2.minColorDegree[var11] = 0;
         } else {
            var2.minColorDegree[var11] = var2.maxColorDegree[var11];

            for (Object var13 : var2.positiveDegreeColorClasses.get(var11)) {
               if (var2.colorDegree.get(var13) < var2.minColorDegree[var11]) {
                  var2.minColorDegree[var11] = var2.colorDegree.get(var13);
               }
            }
         }
      }

      return var4;
   }

   private void cleanupColorDegrees(Set<Integer> var1, ColorRefinementAlgorithm<V, E>.ColoringRepresentation var2) {
      for (int var4 : var1) {
         for (Object var6 : var2.positiveDegreeColorClasses.get(var4)) {
            var2.colorDegree.put((V)var6, 0);
         }

         var2.maxColorDegree[var4] = 0;
         var2.positiveDegreeColorClasses.set(var4, new ArrayList());
      }
   }

   private void splitUpColor(Integer var1, Deque<Integer> var2, ColorRefinementAlgorithm<V, E>.ColoringRepresentation var3) {
      List var4 = var3.positiveDegreeColorClasses.get(var1);
      int var5 = var3.maxColorDegree[var1];
      int[] var6 = new int[var5 + 1];
      var6[0] = var3.colorClasses.get(var1).size() - var4.size();

      for (Object var8 : var4) {
         int var9 = var3.colorDegree.get(var8);
         var6[var9]++;
      }

      int var13 = 0;

      for (int var14 = 1; var14 <= var5; var14++) {
         if (var6[var14] > var6[var13]) {
            var13 = var14;
         }
      }

      int[] var15 = new int[var5 + 1];
      boolean var16 = var2.contains(var1);

      for (int var10 = 0; var10 <= var5; var10++) {
         if (var6[var10] >= 1) {
            if (var10 == var3.minColorDegree[var1]) {
               var15[var10] = var1;
               if (!var16 && var13 != var10) {
                  var2.push(var15[var10]);
               }
            } else {
               var15[var10] = ++var3.lastUsedColor;
               if (var16 || var10 != var13) {
                  var2.push(var15[var10]);
               }
            }
         }
      }

      for (Object var11 : var4) {
         int var12 = var15[var3.colorDegree.get(var11)];
         if (var12 != var1) {
            var3.colorClasses.get(var1).remove(var11);
            var3.colorClasses.get(var12).add((V)var11);
            var3.coloring.replace((V)var11, var12);
         }
      }
   }

   private boolean isAlphaConsistent(VertexColoringAlgorithm.Coloring<V> var1, Graph<V, E> var2) {
      if (var1.getColors().size() != var2.vertexSet().size()) {
         return false;
      }

      if (var1.getColorClasses().size() != var1.getNumberColors()) {
         return false;
      }

      for (Object var4 : var2.vertexSet()) {
         if (!var1.getColors().containsKey(var4)) {
            return false;
         }

         Integer var5 = (Integer)var1.getColors().get(var4);
         if (var5 + 1 > var1.getNumberColors() || var5 < 0) {
            return false;
         }
      }

      return true;
   }

   private static <V> VertexColoringAlgorithm.Coloring<V> getDefaultAlpha(Set<V> var0) {
      HashMap var1 = new HashMap();

      for (Object var3 : var0) {
         var1.put(var3, 0);
      }

      return new VertexColoringAlgorithm.ColoringImpl<>(var1, 1);
   }

   private Deque<Integer> getSortedStack(VertexColoringAlgorithm.Coloring<V> var1) {
      int var2 = var1.getNumberColors();
      ArrayDeque var3 = new ArrayDeque(this.graph.vertexSet().size());

      for (int var4 = var2 - 1; var4 >= 0; var4--) {
         var3.push(var4);
      }

      return var3;
   }

   private class ColoringRepresentation {
      List<List<V>> colorClasses;
      List<List<V>> positiveDegreeColorClasses;
      int[] maxColorDegree;
      int[] minColorDegree;
      Map<V, Integer> colorDegree;
      Map<V, Integer> coloring;
      int lastUsedColor;

      public ColoringRepresentation(Graph<V, E> var2, VertexColoringAlgorithm.Coloring<V> var3) {
         int var4 = var2.vertexSet().size();
         this.colorClasses = new ArrayList<>(var4);
         this.positiveDegreeColorClasses = new ArrayList<>(var4);
         this.maxColorDegree = new int[var4];
         this.minColorDegree = new int[var4];
         this.colorDegree = new HashMap<>();
         this.coloring = new HashMap<>();

         for (int var5 = 0; var5 < var4; var5++) {
            this.colorClasses.add(new ArrayList());
            this.positiveDegreeColorClasses.add(new ArrayList());
         }

         for (Object var6 : var2.vertexSet()) {
            this.colorClasses.get((Integer)var3.getColors().get(var6)).add((V)var6);
            this.colorDegree.put((V)var6, 0);
            this.coloring.put((V)var6, (Integer)var3.getColors().get(var6));
         }

         this.lastUsedColor = var3.getNumberColors() - 1;
      }
   }
}
