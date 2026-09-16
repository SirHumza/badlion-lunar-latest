package org.jgrapht.alg.connectivity;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.jgrapht.util.AVLTree;
import org.jgrapht.util.DoublyLinkedList;

public class TreeDynamicConnectivity<T> {
   private Map<AVLTree.TreeNode<T>, AVLTree<T>> minToTreeMap = new HashMap<>();
   private Map<T, TreeDynamicConnectivity<T>.Node> nodeMap = new HashMap<>();
   private Map<TreeDynamicConnectivity<T>.Node, AVLTree<T>> singletonNodes = new HashMap<>();

   public boolean add(T var1) {
      if (this.contains((T)var1)) {
         return false;
      }

      AVLTree var2 = new AVLTree();
      TreeDynamicConnectivity.Node var3 = new TreeDynamicConnectivity.Node(var1);
      this.nodeMap.put((T)var1, var3);
      this.singletonNodes.put(var3, var2);
      return true;
   }

   public boolean remove(T var1) {
      if (!this.contains((T)var1)) {
         return false;
      }

      TreeDynamicConnectivity.Node var2 = this.getNode((T)var1);

      while (!var2.isSingleton()) {
         Object var3 = var2.arcs.getLast().target.value;
         this.cut((T)var1, (T)var3);
      }

      this.nodeMap.remove(var1);
      this.singletonNodes.remove(var2);
      return true;
   }

   public boolean contains(T var1) {
      return this.nodeMap.containsKey(var1);
   }

   public boolean link(T var1, T var2) {
      this.addIfAbsent((T)var1);
      this.addIfAbsent((T)var2);
      if (this.connected((T)var1, (T)var2)) {
         return false;
      }

      TreeDynamicConnectivity.Node var3 = this.getNode((T)var1);
      TreeDynamicConnectivity.Node var4 = this.getNode((T)var2);
      AVLTree var5 = this.getTree(var3);
      AVLTree var6 = this.getTree(var4);
      this.minToTreeMap.remove(var5.getMin());
      this.minToTreeMap.remove(var6.getMin());
      this.makeRoot(var5, var3);
      this.makeRoot(var6, var4);
      AVLTree.TreeNode var7 = var6.addMin(var1);
      TreeDynamicConnectivity.Arc var8 = new TreeDynamicConnectivity.Arc(var4, var7);
      if (var3.isSingleton()) {
         this.singletonNodes.remove(var3);
         var3.addArcLast(var8);
      } else {
         Object var9 = var5.getMax().getValue();
         TreeDynamicConnectivity.Node var10 = this.getNode((T)var9);
         TreeDynamicConnectivity.Arc var11 = var3.getArcTo(var10);
         var3.addArcAfter(var11, var8);
      }

      AVLTree.TreeNode var14 = var6.addMax(var2);
      TreeDynamicConnectivity.Arc var15 = new TreeDynamicConnectivity.Arc(var3, var14);
      if (var4.isSingleton()) {
         this.singletonNodes.remove(var4);
         var4.addArcLast(var15);
      } else {
         Object var16 = var6.getMax().getPredecessor().getValue();
         TreeDynamicConnectivity.Node var12 = this.getNode((T)var16);
         TreeDynamicConnectivity.Arc var13 = var4.getArcTo(var12);
         var4.addArcAfter(var13, var15);
      }

      var5.mergeAfter(var6);
      this.minToTreeMap.put(var5.getMin(), var5);
      return true;
   }

   public boolean connected(T var1, T var2) {
      if (this.contains((T)var1) && this.contains((T)var2)) {
         TreeDynamicConnectivity.Node var3 = this.getNode((T)var1);
         if (var3.isSingleton()) {
            return false;
         }

         TreeDynamicConnectivity.Node var4 = this.getNode((T)var2);
         return var4.isSingleton() ? false : this.getTree(var3) == this.getTree(var4);
      } else {
         return false;
      }
   }

   public boolean cut(T var1, T var2) {
      if (!this.connected((T)var1, (T)var2)) {
         return false;
      }

      TreeDynamicConnectivity.Node var3 = this.getNode((T)var1);
      TreeDynamicConnectivity.Node var4 = this.getNode((T)var2);
      AVLTree var5 = this.getTree(var3);
      this.minToTreeMap.remove(var5.getMin());
      TreeDynamicConnectivity.Arc var6 = var3.getArcTo(var4);
      if (var6 == null) {
         throw new IllegalArgumentException(String.format("Elements {%s} and {%s} are not connected", var1, var2));
      }

      this.makeLastArc(var5, var3, var6);
      AVLTree var7 = var5.splitAfter(var6.arcTreeNode);
      var5.removeMax();
      var3.removeArc(var6);
      if (!var3.isSingleton()) {
         this.minToTreeMap.put(var5.getMin(), var5);
      } else {
         this.singletonNodes.put(var3, var5);
      }

      TreeDynamicConnectivity.Arc var8 = var4.getArcTo(var3);
      var7.removeMax();
      var4.removeArc(var8);
      if (!var4.isSingleton()) {
         this.minToTreeMap.put(var7.getMin(), var7);
      } else {
         this.singletonNodes.put(var4, var7);
      }

      return true;
   }

   private void makeRoot(AVLTree<T> var1, TreeDynamicConnectivity<T>.Node var2) {
      if (!var2.arcs.isEmpty()) {
         this.makeFirstArc(var1, var2.arcs.get(0));
      }
   }

   private void makeFirstArc(AVLTree<T> var1, TreeDynamicConnectivity<T>.Arc var2) {
      AVLTree var3 = var1.splitBefore(var2.arcTreeNode);
      var1.mergeBefore(var3);
   }

   private void makeLastArc(AVLTree<T> var1, TreeDynamicConnectivity<T>.Node var2, TreeDynamicConnectivity<T>.Arc var3) {
      if (var2.arcs.size() == 1) {
         this.makeRoot(var1, var2);
      } else {
         TreeDynamicConnectivity.Arc var4 = var2.getNextArc(var3);
         this.makeFirstArc(var1, var4);
      }
   }

   private TreeDynamicConnectivity<T>.Node getNode(T var1) {
      return this.nodeMap.get(var1);
   }

   private AVLTree<T> getTree(TreeDynamicConnectivity<T>.Node var1) {
      return var1.isSingleton() ? this.singletonNodes.get(var1) : this.minToTreeMap.get(var1.arcs.get(0).arcTreeNode.getTreeMin());
   }

   private void addIfAbsent(T var1) {
      if (!this.contains((T)var1)) {
         this.add((T)var1);
      }
   }

   private class Arc {
      TreeDynamicConnectivity<T>.Node target;
      DoublyLinkedList.ListNode<TreeDynamicConnectivity<T>.Arc> listNode;
      AVLTree.TreeNode<T> arcTreeNode;

      public Arc(TreeDynamicConnectivity<T>.Node var2, AVLTree.TreeNode<T> var3) {
         this.target = var2;
         this.arcTreeNode = var3;
      }

      @Override
      public String toString() {
         return String.format("{%s} -> {%s}", this.arcTreeNode.getValue(), this.target.value);
      }
   }

   private class Node {
      T value;
      DoublyLinkedList<TreeDynamicConnectivity<T>.Arc> arcs;
      Map<TreeDynamicConnectivity<T>.Node, TreeDynamicConnectivity<T>.Arc> targetMap;

      public Node(T var2) {
         this.value = (T)var2;
         this.arcs = new DoublyLinkedList<>();
         this.targetMap = new HashMap<>();
      }

      void removeArc(TreeDynamicConnectivity<T>.Arc var1) {
         this.arcs.removeNode(var1.listNode);
         var1.listNode = null;
         this.targetMap.remove(var1.target);
      }

      void addArcLast(TreeDynamicConnectivity<T>.Arc var1) {
         var1.listNode = this.arcs.addElementLast(var1);
         this.targetMap.put(var1.target, var1);
      }

      void addArcAfter(TreeDynamicConnectivity<T>.Arc var1, TreeDynamicConnectivity<T>.Arc var2) {
         var2.listNode = this.arcs.addElementBeforeNode(var1.listNode.getNext(), var2);
         this.targetMap.put(var2.target, var2);
      }

      TreeDynamicConnectivity<T>.Arc getArcTo(TreeDynamicConnectivity<T>.Node var1) {
         return this.targetMap.get(var1);
      }

      TreeDynamicConnectivity<T>.Arc getNextArc(TreeDynamicConnectivity<T>.Arc var1) {
         return var1.listNode.getNext().getValue();
      }

      public boolean isSingleton() {
         return this.arcs.isEmpty();
      }

      @Override
      public String toString() {
         return String.format("{%s} -> [%s]", this.value, this.arcs.stream().map(var0 -> var0.target.value.toString()).collect(Collectors.joining(",")));
      }
   }
}
