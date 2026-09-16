package org.jgrapht.graph;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class DefaultEdgeFunction<E, T> implements Serializable, Function<E, T> {
   private static final long serialVersionUID = -4247429315268336855L;
   protected final Map<E, T> map;
   protected final T defaultValue;

   public DefaultEdgeFunction(T var1) {
      this((T)var1, new HashMap<>());
   }

   public DefaultEdgeFunction(T var1, Map<E, T> var2) {
      this.defaultValue = Objects.requireNonNull((T)var1, "Default value cannot be null");
      this.map = Objects.requireNonNull(var2, "Map cannot be null");
   }

   @Override
   public T apply(E var1) {
      return this.map.getOrDefault(var1, this.defaultValue);
   }

   public T get(E var1) {
      return this.map.getOrDefault(var1, this.defaultValue);
   }

   public void set(E var1, T var2) {
      this.map.put((E)var1, (T)var2);
   }
}
