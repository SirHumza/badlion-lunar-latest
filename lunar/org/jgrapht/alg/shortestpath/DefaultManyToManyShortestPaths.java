package org.jgrapht.alg.shortestpath;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ManyToManyShortestPathsAlgorithm;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;

public class DefaultManyToManyShortestPaths<V, E> extends BaseManyToManyShortestPaths<V, E> {
   private final Function<Graph<V, E>, ShortestPathAlgorithm<V, E>> function;

   public DefaultManyToManyShortestPaths(Graph<V, E> var1) {
      this(var1, var0 -> new BidirectionalDijkstraShortestPath<>(var0));
   }

   public DefaultManyToManyShortestPaths(Graph<V, E> var1, Function<Graph<V, E>, ShortestPathAlgorithm<V, E>> var2) {
      super(var1);
      this.function = var2;
   }

   @Override
   public ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> getManyToManyPaths(Set<V> var1, Set<V> var2) {
      Objects.requireNonNull(var1, "sources cannot be null!");
      Objects.requireNonNull(var2, "targets cannot be null!");
      ShortestPathAlgorithm var3 = this.function.apply(this.graph);
      HashMap var4 = new HashMap();

      for (Object var6 : var1) {
         var4.put(var6, new HashMap());
      }

      for (Object var10 : var1) {
         for (Object var8 : var2) {
            ((Map)var4.get(var10)).put(var8, var3.getPath(var10, var8));
         }
      }

      return new DefaultManyToManyShortestPaths.DefaultManyToManyShortestPathsImpl<>(var1, var2, var4);
   }

   static class DefaultManyToManyShortestPathsImpl<V, E> extends ManyToManyShortestPathsAlgorithm.BaseManyToManyShortestPathsImpl<V, E> {
      private final Map<V, Map<V, GraphPath<V, E>>> pathsMap;

      DefaultManyToManyShortestPathsImpl(Set<V> var1, Set<V> var2, Map<V, Map<V, GraphPath<V, E>>> var3) {
         super(var1, var2);
         this.pathsMap = var3;
      }

      @Override
      public GraphPath<V, E> getPath(V var1, V var2) {
         this.assertCorrectSourceAndTarget((V)var1, (V)var2);
         return this.pathsMap.get(var1).get(var2);
      }

      @Override
      public double getWeight(V var1, V var2) {
         this.assertCorrectSourceAndTarget((V)var1, (V)var2);
         GraphPath var3 = this.pathsMap.get(var1).get(var2);
         return var3 == null ? Double.POSITIVE_INFINITY : var3.getWeight();
      }
   }
}
