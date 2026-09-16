package org.jgrapht.alg.scoring;

import java.util.HashMap;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;

public final class HarmonicCentrality<V, E> extends ClosenessCentrality<V, E> {
   public HarmonicCentrality(Graph<V, E> var1) {
      this(var1, false, true);
   }

   public HarmonicCentrality(Graph<V, E> var1, boolean var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void compute() {
      this.scores = new HashMap<>();
      ShortestPathAlgorithm var1 = this.getShortestPathAlgorithm();
      int var2 = this.graph.vertexSet().size();

      for (Object var4 : this.graph.vertexSet()) {
         double var5 = 0.0;
         ShortestPathAlgorithm.SingleSourcePaths var7 = var1.getPaths(var4);

         for (Object var9 : this.graph.vertexSet()) {
            if (!var9.equals(var4)) {
               var5 += 1.0 / var7.getWeight(var9);
            }
         }

         if (this.normalize && var2 > 1) {
            this.scores.put((V)var4, var5 / (var2 - 1));
         } else {
            this.scores.put((V)var4, var5);
         }
      }
   }
}
