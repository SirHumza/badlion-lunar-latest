package org.jgrapht.alg.interfaces;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public interface ClusteringAlgorithm<V> {
   ClusteringAlgorithm.Clustering<V> getClustering();

   interface Clustering<V> extends Iterable<Set<V>> {
      int getNumberClusters();

      List<Set<V>> getClusters();
   }

   class ClusteringImpl<V> implements Serializable, ClusteringAlgorithm.Clustering<V> {
      private static final long serialVersionUID = -5718903410443848101L;
      private final List<Set<V>> clusters;

      public ClusteringImpl(List<Set<V>> var1) {
         this.clusters = var1;
      }

      @Override
      public int getNumberClusters() {
         return this.clusters.size();
      }

      @Override
      public List<Set<V>> getClusters() {
         return this.clusters;
      }

      @Override
      public String toString() {
         return "Clustering [k=" + this.clusters.size() + ", clusters=" + this.clusters + "]";
      }

      @Override
      public Iterator<Set<V>> iterator() {
         return this.clusters.iterator();
      }
   }
}
