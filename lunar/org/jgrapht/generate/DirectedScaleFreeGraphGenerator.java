package org.jgrapht.generate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import org.jgrapht.Graph;

public class DirectedScaleFreeGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final Random rng;
   private final float alpha;
   private final float alphaPlusBeta;
   private final float deltaIn;
   private final float deltaOut;
   private final int targetEdges;
   private final int targetNodes;
   private int maxFailures = 1000;
   private boolean allowingMultipleEdges = true;
   private boolean allowingSelfLoops = true;

   public DirectedScaleFreeGraphGenerator(float var1, float var2, float var3, float var4, int var5, int var6) {
      this(var1, var2, var3, var4, var5, var6, new Random());
   }

   public DirectedScaleFreeGraphGenerator(float var1, float var2, float var3, float var4, int var5, int var6, long var7) {
      this(var1, var2, var3, var4, var5, var6, new Random(var7));
   }

   public DirectedScaleFreeGraphGenerator(float var1, float var2, float var3, float var4, int var5, int var6, long var7, boolean var9, boolean var10) {
      this(var1, var2, var3, var4, var5, var6, var7);
      this.allowingMultipleEdges = var9;
      this.allowingSelfLoops = var10;
   }

   public DirectedScaleFreeGraphGenerator(float var1, float var2, float var3, float var4, int var5, int var6, Random var7) {
      this.alpha = var1;
      this.alphaPlusBeta = 1.0F - var2;
      this.deltaIn = var3;
      this.deltaOut = var4;
      this.targetEdges = var5;
      this.targetNodes = var6;
      this.rng = Objects.requireNonNull(var7, "Random number generator cannot be null");
      if (var1 < 0.0F || var2 < 0.0F || var1 + var2 > 1.0F) {
         throw new IllegalArgumentException(String.format("alpha and gamma values of (%f, %f) are invalid", var1, var2));
      }

      if (var3 < 0.0F || var4 < 0.0F) {
         throw new IllegalArgumentException(String.format("deltaIn and deltaOut values of (%f, %f) are invalid", var3, var4));
      }

      if (var5 < 0 && var6 < 0) {
         throw new IllegalArgumentException("can not have both targetEdges and targetNodes not set.");
      }
   }

   public DirectedScaleFreeGraphGenerator(float var1, float var2, float var3, float var4, int var5, int var6, Random var7, boolean var8, boolean var9) {
      this(var1, var2, var3, var4, var5, var6, var7);
      this.allowingMultipleEdges = var8;
      this.allowingSelfLoops = var9;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.allowingMultipleEdges && !var1.getType().isAllowingMultipleEdges()) {
         throw new IllegalArgumentException(
            "Generator allows Multiple Edges while graph does not. Consider changing this generator parameters or the target graph type."
         );
      }

      if (this.allowingSelfLoops && !var1.getType().isAllowingSelfLoops()) {
         throw new IllegalArgumentException(
            "Generator allows Self loops while graph does not. Consider changing this generator parameters or the target graph type."
         );
      }

      HashSet var3 = new HashSet();
      HashSet var4 = new HashSet();
      if (this.targetEdges != 0 && (this.targetEdges >= 0 || this.targetNodes != 0)) {
         Object var5 = var1.addVertex();
         var3.add(var5);
         int var6 = 0;

         while (this.targetEdges >= 0 ? this.targetEdges > var4.size() : this.targetNodes >= var3.size()) {
            if (var6 >= this.maxFailures) {
               throw new TooManyFailuresException(var6 + " consecutive failures is more than maximum allowed number (" + this.maxFailures + ").");
            }

            Object var7 = null;
            Object var8 = null;
            boolean var9 = false;
            boolean var10 = false;
            float var12 = this.rng.nextFloat();
            if (var12 <= this.alpha) {
               if (this.targetEdges < 0 && var3.size() == this.targetNodes) {
                  break;
               }

               var9 = true;
               var8 = this.pickAVertex(var1, var3, var4, DirectedScaleFreeGraphGenerator.Direction.IN, this.deltaIn);
            } else if (var12 <= this.alphaPlusBeta) {
               var7 = this.pickAVertex(var1, var3, var4, DirectedScaleFreeGraphGenerator.Direction.OUT, this.deltaOut);
               var8 = this.pickAVertex(var1, var3, var4, DirectedScaleFreeGraphGenerator.Direction.IN, this.deltaIn);
            } else {
               if (this.targetEdges < 0 && var3.size() == this.targetNodes) {
                  break;
               }

               var7 = this.pickAVertex(var1, var3, var4, DirectedScaleFreeGraphGenerator.Direction.OUT, this.deltaOut);
               var10 = true;
            }

            if ((!var9 || var8 != null) && (!var10 || var7 != null)) {
               if (!this.allowingSelfLoops && var7 == var8) {
                  var6++;
               } else if (!this.allowingMultipleEdges && var1.containsEdge(var7, var8)) {
                  var6++;
               } else {
                  if (var9) {
                     var7 = var1.addVertex();
                  }

                  if (var10) {
                     var8 = var1.addVertex();
                  }

                  Object var11 = var1.addEdge(var7, var8);
                  var6 = 0;
                  var3.add(var7);
                  var3.add(var8);
                  var4.add(var11);
               }
            } else {
               var6++;
            }
         }
      }
   }

   private V pickAVertex(Graph<V, E> var1, Set<V> var2, Set<E> var3, DirectedScaleFreeGraphGenerator.Direction var4, float var5) {
      int var6 = var2.size();
      if (var6 == 0) {
         return null;
      }

      if (var6 == 1) {
         return (V)var2.iterator().next();
      }

      float var7 = 0.0F;
      float var9 = var3.size() + var6 * var5;
      float var11 = this.rng.nextFloat();
      var11 *= var9;
      Iterator var12 = var2.iterator();

      Object var8;
      do {
         var8 = var12.next();
         float var10 = var4 == DirectedScaleFreeGraphGenerator.Direction.IN ? var1.inDegreeOf(var8) + var5 : var1.outDegreeOf(var8) + var5;
         var7 += var10;
      } while (var12.hasNext() && var7 < var11);

      return (V)var8;
   }

   public int getMaxFailures() {
      return this.maxFailures;
   }

   public void setMaxFailures(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("value must be non negative");
      }

      this.maxFailures = var1;
   }

   public boolean isAllowingMultipleEdges() {
      return this.allowingMultipleEdges;
   }

   public void setAllowingMultipleEdges(boolean var1) {
      this.allowingMultipleEdges = var1;
   }

   public boolean isAllowingSelfLoops() {
      return this.allowingSelfLoops;
   }

   public void setAllowingSelfLoops(boolean var1) {
      this.allowingSelfLoops = var1;
   }

   private enum Direction {
      IN,
      OUT;
   }
}
