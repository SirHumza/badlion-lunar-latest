package org.jgrapht.alg.similarity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;

public class ZhangShashaTreeEditDistance<V, E> {
   private Graph<V, E> tree1;
   private V root1;
   private Graph<V, E> tree2;
   private V root2;
   private ToDoubleFunction<V> insertCost;
   private ToDoubleFunction<V> removeCost;
   private ToDoubleBiFunction<V, V> changeCost;
   private double[][] treeDistances;
   private List<List<List<ZhangShashaTreeEditDistance.EditOperation<V>>>> editOperationLists;
   private boolean algorithmExecuted;

   public ZhangShashaTreeEditDistance(Graph<V, E> var1, V var2, Graph<V, E> var3, V var4) {
      this(var1, (V)var2, var3, (V)var4, var0 -> 1.0, var0 -> 1.0, (var0, var1x) -> var0.equals(var1x) ? 0.0 : 1.0);
   }

   public ZhangShashaTreeEditDistance(
      Graph<V, E> var1, V var2, Graph<V, E> var3, V var4, ToDoubleFunction<V> var5, ToDoubleFunction<V> var6, ToDoubleBiFunction<V, V> var7
   ) {
      this.tree1 = Objects.requireNonNull(var1, "graph1 cannot be null!");
      this.root1 = Objects.requireNonNull((V)var2, "root1 cannot be null!");
      this.tree2 = Objects.requireNonNull(var3, "graph2 cannot be null!");
      this.root2 = Objects.requireNonNull((V)var4, "root2 cannot be null!");
      this.insertCost = Objects.requireNonNull(var5, "insertCost cannot be null!");
      this.removeCost = Objects.requireNonNull(var6, "removeCost cannot be null!");
      this.changeCost = Objects.requireNonNull(var7, "changeCost cannot be null!");
      if (!GraphTests.isTree(var1)) {
         throw new IllegalArgumentException("graph1 must be a tree!");
      }

      if (!GraphTests.isTree(var3)) {
         throw new IllegalArgumentException("graph2 must be a tree!");
      }

      int var8 = var1.vertexSet().size();
      int var9 = var3.vertexSet().size();
      this.treeDistances = new double[var8][var9];
      this.editOperationLists = new ArrayList<>(var8);

      for (int var10 = 0; var10 < var8; var10++) {
         this.editOperationLists.add(new ArrayList<>(Collections.nCopies(var9, null)));
      }
   }

   public double getDistance() {
      this.lazyRunAlgorithm();
      int var1 = this.tree1.vertexSet().size();
      int var2 = this.tree2.vertexSet().size();
      return this.treeDistances[var1 - 1][var2 - 1];
   }

   public List<ZhangShashaTreeEditDistance.EditOperation<V>> getEditOperationLists() {
      this.lazyRunAlgorithm();
      int var1 = this.tree1.vertexSet().size();
      int var2 = this.tree2.vertexSet().size();
      return Collections.unmodifiableList(this.editOperationLists.get(var1 - 1).get(var2 - 1));
   }

   private void lazyRunAlgorithm() {
      if (!this.algorithmExecuted) {
         ZhangShashaTreeEditDistance.TreeOrdering var1 = new ZhangShashaTreeEditDistance.TreeOrdering(this.tree1, this.root1);
         ZhangShashaTreeEditDistance.TreeOrdering var2 = new ZhangShashaTreeEditDistance.TreeOrdering(this.tree2, this.root2);

         for (int var4 : var1.keyroots) {
            for (Integer var6 : var2.keyroots) {
               this.treeDistance(var4, var6, var1, var2);
            }
         }

         this.algorithmExecuted = true;
      }
   }

   private void treeDistance(int var1, int var2, ZhangShashaTreeEditDistance<V, E>.TreeOrdering var3, ZhangShashaTreeEditDistance<V, E>.TreeOrdering var4) {
      int var5 = var3.indexToLValueList.get(var1);
      int var6 = var4.indexToLValueList.get(var2);
      int var7 = var1 - var5 + 2;
      int var8 = var2 - var6 + 2;
      double[][] var9 = new double[var7][var8];
      ArrayList var10 = new ArrayList(var7);

      for (int var11 = 0; var11 < var7; var11++) {
         var10.add(new ArrayList<>(Collections.nCopies(var8, null)));
      }

      int var32 = var5 - 1;
      int var12 = var6 - 1;

      for (int var13 = var5; var13 <= var1; var13++) {
         Object var14 = var3.indexToVertexList.get(var13);
         int var15 = var13 - var32;
         var9[var15][0] = var9[var15 - 1][0] + this.removeCost.applyAsDouble((V)var14);
         ZhangShashaTreeEditDistance.CacheEntry var16 = new ZhangShashaTreeEditDistance.CacheEntry(
            var15 - 1, 0, new ZhangShashaTreeEditDistance.EditOperation<>(ZhangShashaTreeEditDistance.OperationType.REMOVE, (V)var14, null)
         );
         ((List)var10.get(var15)).set(0, var16);
      }

      for (int var33 = var6; var33 <= var2; var33++) {
         Object var35 = var4.indexToVertexList.get(var33);
         int var37 = var33 - var12;
         var9[0][var37] = var9[0][var37 - 1] + this.removeCost.applyAsDouble((V)var35);
         ZhangShashaTreeEditDistance.CacheEntry var39 = new ZhangShashaTreeEditDistance.CacheEntry(
            0, var37 - 1, new ZhangShashaTreeEditDistance.EditOperation<>(ZhangShashaTreeEditDistance.OperationType.INSERT, (V)var35, null)
         );
         ((List)var10.get(0)).set(var37, var39);
      }

      for (int var34 = var5; var34 <= var1; var34++) {
         Object var36 = var3.indexToVertexList.get(var34);
         int var38 = var3.indexToLValueList.get(var34);

         for (int var40 = var6; var40 <= var2; var40++) {
            Object var17 = var4.indexToVertexList.get(var40);
            int var18 = var4.indexToLValueList.get(var40);
            int var19 = var34 - var32;
            int var20 = var40 - var12;
            if (var38 == var5 && var18 == var6) {
               double var41 = var9[var19 - 1][var20] + this.removeCost.applyAsDouble((V)var36);
               double var42 = var9[var19][var20 - 1] + this.insertCost.applyAsDouble((V)var17);
               double var43 = var9[var19 - 1][var20 - 1] + this.changeCost.applyAsDouble((V)var36, (V)var17);
               double var44 = Math.min(var41, Math.min(var42, var43));
               ZhangShashaTreeEditDistance.CacheEntry var45;
               if (var44 == var41) {
                  var45 = new ZhangShashaTreeEditDistance.CacheEntry(
                     var19 - 1, var20, new ZhangShashaTreeEditDistance.EditOperation<>(ZhangShashaTreeEditDistance.OperationType.REMOVE, (V)var36, null)
                  );
               } else if (var44 == var42) {
                  var45 = new ZhangShashaTreeEditDistance.CacheEntry(
                     var19, var20 - 1, new ZhangShashaTreeEditDistance.EditOperation<>(ZhangShashaTreeEditDistance.OperationType.INSERT, (V)var17, null)
                  );
               } else {
                  var45 = new ZhangShashaTreeEditDistance.CacheEntry(
                     var19 - 1,
                     var20 - 1,
                     new ZhangShashaTreeEditDistance.EditOperation<>(ZhangShashaTreeEditDistance.OperationType.CHANGE, (V)var36, (V)var17)
                  );
               }

               ((List)var10.get(var19)).set(var20, var45);
               var9[var19][var20] = var44;
               this.treeDistances[var34 - 1][var40 - 1] = var44;
               this.editOperationLists.get(var34 - 1).set(var40 - 1, this.restoreOperationsList(var10, var19, var20));
            } else {
               int var21 = var38 - 1 - var32;
               int var22 = var18 - 1 - var12;
               double var23 = var9[var19 - 1][var20] + this.removeCost.applyAsDouble((V)var36);
               double var25 = var9[var19][var20 - 1] + this.insertCost.applyAsDouble((V)var17);
               double var27 = var9[var21][var22] + this.treeDistances[var34 - 1][var40 - 1];
               double var29 = Math.min(var23, Math.min(var25, var27));
               var9[var19][var20] = var29;
               ZhangShashaTreeEditDistance.CacheEntry var31;
               if (var29 == var23) {
                  var31 = new ZhangShashaTreeEditDistance.CacheEntry(
                     var19 - 1, var20, new ZhangShashaTreeEditDistance.EditOperation<>(ZhangShashaTreeEditDistance.OperationType.REMOVE, (V)var36, null)
                  );
               } else if (var29 == var25) {
                  var31 = new ZhangShashaTreeEditDistance.CacheEntry(
                     var19, var20 - 1, new ZhangShashaTreeEditDistance.EditOperation<>(ZhangShashaTreeEditDistance.OperationType.INSERT, (V)var17, null)
                  );
               } else {
                  var31 = new ZhangShashaTreeEditDistance.CacheEntry(var21, var22, null);
                  var31.treeDistanceI = var34 - 1;
                  var31.treeDistanceJ = var40 - 1;
               }

               ((List)var10.get(var19)).set(var20, var31);
            }
         }
      }
   }

   private List<ZhangShashaTreeEditDistance.EditOperation<V>> restoreOperationsList(
      List<List<ZhangShashaTreeEditDistance<V, E>.CacheEntry>> var1, int var2, int var3
   ) {
      ArrayList var4 = new ArrayList();

      for (ZhangShashaTreeEditDistance.CacheEntry var5 = (ZhangShashaTreeEditDistance.CacheEntry)((List)var1.get(var2)).get(var3);
         var5 != null;
         var5 = (ZhangShashaTreeEditDistance.CacheEntry)((List)var1.get(var5.cachePreviousPosI)).get(var5.cachePreviousPosJ)
      ) {
         if (var5.editOperation == null) {
            var4.addAll(this.editOperationLists.get(var5.treeDistanceI).get(var5.treeDistanceJ));
         } else {
            var4.add(var5.editOperation);
         }
      }

      return var4;
   }

   private class CacheEntry {
      int cachePreviousPosI;
      int cachePreviousPosJ;
      ZhangShashaTreeEditDistance.EditOperation<V> editOperation;
      int treeDistanceI;
      int treeDistanceJ;

      public CacheEntry(int var2, int var3, ZhangShashaTreeEditDistance.EditOperation<V> var4) {
         this.cachePreviousPosI = var2;
         this.cachePreviousPosJ = var3;
         this.editOperation = var4;
      }
   }

   public static class EditOperation<V> {
      private final ZhangShashaTreeEditDistance.OperationType type;
      private final V firstOperand;
      private final V secondOperand;

      public ZhangShashaTreeEditDistance.OperationType getType() {
         return this.type;
      }

      public V getFirstOperand() {
         return this.firstOperand;
      }

      public V getSecondOperand() {
         return this.secondOperand;
      }

      public EditOperation(ZhangShashaTreeEditDistance.OperationType var1, V var2, V var3) {
         this.type = var1;
         this.firstOperand = (V)var2;
         this.secondOperand = (V)var3;
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         if (var1 != null && this.getClass() == var1.getClass()) {
            ZhangShashaTreeEditDistance.EditOperation var2 = (ZhangShashaTreeEditDistance.EditOperation)var1;
            if (this.type != var2.type) {
               return false;
            } else if (!this.firstOperand.equals(var2.firstOperand)) {
               return false;
            } else {
               return this.secondOperand != null ? this.secondOperand.equals(var2.secondOperand) : var2.secondOperand == null;
            }
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.type.hashCode();
         var1 = 31 * var1 + this.firstOperand.hashCode();
         return 31 * var1 + (this.secondOperand != null ? this.secondOperand.hashCode() : 0);
      }

      @Override
      public String toString() {
         return !this.type.equals(ZhangShashaTreeEditDistance.OperationType.INSERT) && !this.type.equals(ZhangShashaTreeEditDistance.OperationType.REMOVE)
            ? this.type + " " + this.firstOperand + " -> " + this.secondOperand
            : this.type + " " + this.firstOperand;
      }
   }

   public enum OperationType {
      INSERT,
      REMOVE,
      CHANGE;
   }

   private class TreeOrdering {
      final Graph<V, E> tree;
      final V treeRoot;
      List<Integer> keyroots;
      List<V> indexToVertexList;
      List<Integer> indexToLValueList;
      int currentIndex;

      public TreeOrdering(Graph<V, E> var2, V var3) {
         this.tree = var2;
         this.treeRoot = (V)var3;
         int var4 = var2.vertexSet().size();
         this.keyroots = new ArrayList<>();
         this.indexToVertexList = (List<V>)(new ArrayList<>(Collections.nCopies(var4 + 1, null)));
         this.indexToLValueList = new ArrayList<>(Collections.nCopies(var4 + 1, null));
         this.currentIndex = 1;
         this.computeKeyrootsAndMapping((V)var3);
      }

      private void computeKeyrootsAndMapping(V var1) {
         ArrayList var2 = new ArrayList();
         var2.add(new ZhangShashaTreeEditDistance.TreeOrdering.StackEntry(var1, true));

         while (!var2.isEmpty()) {
            ZhangShashaTreeEditDistance.TreeOrdering.StackEntry var3 = (ZhangShashaTreeEditDistance.TreeOrdering.StackEntry)var2.get(var2.size() - 1);
            if (var3.state == 0) {
               if (var2.size() > 1) {
                  var3.vParent = ((ZhangShashaTreeEditDistance.TreeOrdering.StackEntry)var2.get(var2.size() - 2)).v;
               }

               var3.vChildIterator = Graphs.successorListOf(this.tree, var3.v).iterator();
               var3.state = 1;
            } else if (var3.state == 1) {
               if (var3.vChildIterator.hasNext()) {
                  var3.vChild = var3.vChildIterator.next();
                  if (var3.vParent == null || !var3.vChild.equals(var3.vParent)) {
                     var2.add(new ZhangShashaTreeEditDistance.TreeOrdering.StackEntry(var3.vChild, var3.isKeyrootArg));
                     var3.state = 2;
                  }
               } else {
                  var3.state = 3;
               }
            } else if (var3.state == 2) {
               var3.isKeyrootArg = true;
               if (var3.lValue == -1) {
                  var3.lValue = var3.lVChild;
               }

               var3.state = 1;
            } else if (var3.state == 3) {
               if (var3.lValue == -1) {
                  var3.lValue = this.currentIndex;
               }

               if (var3.isKeyroot) {
                  this.keyroots.add(this.currentIndex);
               }

               this.indexToVertexList.set(this.currentIndex, var3.v);
               this.indexToLValueList.set(this.currentIndex, var3.lValue);
               this.currentIndex++;
               if (var2.size() > 1) {
                  ((ZhangShashaTreeEditDistance.TreeOrdering.StackEntry)var2.get(var2.size() - 2)).lVChild = var3.lValue;
               }

               var2.remove(var2.size() - 1);
            }
         }
      }

      private class StackEntry {
         V v;
         boolean isKeyroot;
         V vParent;
         boolean isKeyrootArg;
         int lValue;
         Iterator<V> vChildIterator;
         V vChild;
         int lVChild;
         int state;

         public StackEntry(V var2, boolean var3) {
            this.v = (V)var2;
            this.isKeyroot = var3;
            this.lValue = -1;
         }
      }
   }
}
