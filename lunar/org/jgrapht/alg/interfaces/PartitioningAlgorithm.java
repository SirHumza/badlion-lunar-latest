package org.jgrapht.alg.interfaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public interface PartitioningAlgorithm<V> {
   PartitioningAlgorithm.Partitioning<V> getPartitioning();

   boolean isValidPartitioning(PartitioningAlgorithm.Partitioning<V> var1);

   interface Partitioning<V> extends Iterable<Set<V>> {
      int getNumberPartitions();

      Set<V> getPartition(int var1);

      default List<Set<V>> getPartitions() {
         int var1 = this.getNumberPartitions();
         ArrayList var2 = new ArrayList(var1);

         for (int var3 = 0; var3 < var1; var3++) {
            var2.add(this.getPartition(var3));
         }

         return var2;
      }
   }

   class PartitioningImpl<V> implements Serializable, PartitioningAlgorithm.Partitioning<V> {
      private static final long serialVersionUID = 3702471090706836080L;
      private final List<Set<V>> classes;

      public PartitioningImpl(List<Set<V>> var1) {
         this.classes = Collections.unmodifiableList(Objects.requireNonNull(var1).stream().map(Collections::unmodifiableSet).collect(Collectors.toList()));
      }

      public PartitioningImpl(Map<V, Integer> var1) {
         Objects.requireNonNull(var1);
         HashMap var2 = new HashMap();

         for (Entry var4 : var1.entrySet()) {
            var2.computeIfAbsent((Integer)var4.getValue(), var0 -> new HashSet<>()).add(var4.getKey());
         }

         this.classes = Collections.unmodifiableList(var2.values().stream().map(Collections::unmodifiableSet).collect(Collectors.toList()));
      }

      @Override
      public int getNumberPartitions() {
         return this.classes.size();
      }

      @Override
      public Set<V> getPartition(int var1) {
         if (var1 >= 0 && var1 < this.classes.size()) {
            return this.classes.get(var1);
         } else {
            throw new IndexOutOfBoundsException(var1 + " is not valid");
         }
      }

      @Override
      public String toString() {
         return "Partition [number-of-partitions=" + this.getNumberPartitions() + ", partitions=" + this.classes + "]";
      }

      @Override
      public Iterator<Set<V>> iterator() {
         return this.classes.iterator();
      }
   }
}
