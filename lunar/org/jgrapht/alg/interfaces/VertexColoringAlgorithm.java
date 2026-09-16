package org.jgrapht.alg.interfaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface VertexColoringAlgorithm<V> {
   VertexColoringAlgorithm.Coloring<V> getColoring();

   interface Coloring<V> {
      int getNumberColors();

      Map<V, Integer> getColors();

      List<Set<V>> getColorClasses();
   }

   class ColoringImpl<V> implements Serializable, VertexColoringAlgorithm.Coloring<V> {
      private static final long serialVersionUID = -8456580091672353150L;
      private final int numberColors;
      private final Map<V, Integer> colors;

      public ColoringImpl(Map<V, Integer> var1, int var2) {
         this.numberColors = var2;
         this.colors = var1;
      }

      @Override
      public int getNumberColors() {
         return this.numberColors;
      }

      @Override
      public Map<V, Integer> getColors() {
         return this.colors;
      }

      @Override
      public List<Set<V>> getColorClasses() {
         HashMap var1 = new HashMap();
         this.colors.forEach((var1x, var2x) -> {
            Set var3 = var1.computeIfAbsent(var2x, var0x -> new HashSet());
            var3.add(var1x);
         });
         ArrayList var2 = new ArrayList(this.numberColors);
         var2.addAll(var1.values());
         return var2;
      }

      @Override
      public String toString() {
         return "Coloring [number-of-colors=" + this.numberColors + ", colors=" + this.colors + "]";
      }
   }
}
