package org.jgrapht.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class VertexToIntegerMapping<V> {
   private final Map<V, Integer> vertexMap;
   private final List<V> indexList;

   public VertexToIntegerMapping(List<V> var1) {
      Objects.requireNonNull(var1, "the input collection of vertices cannot be null");
      this.vertexMap = CollectionUtil.newHashMapWithExpectedSize(var1.size());
      this.indexList = var1;

      for (Object var3 : var1) {
         if (this.vertexMap.put((V)var3, this.vertexMap.size()) != null) {
            throw new IllegalArgumentException("vertices are not distinct");
         }
      }
   }

   public VertexToIntegerMapping(Collection<V> var1) {
      this(new ArrayList<>(Objects.requireNonNull(var1, "the input collection of vertices cannot be null")));
   }

   public Map<V, Integer> getVertexMap() {
      return this.vertexMap;
   }

   public List<V> getIndexList() {
      return this.indexList;
   }
}
