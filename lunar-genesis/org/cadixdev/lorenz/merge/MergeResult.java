package org.cadixdev.lorenz.merge;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MergeResult<T> {
   private final T result;
   private final List<T> mappingsToMap;

   public MergeResult(T var1) {
      this.result = (T)var1;
      this.mappingsToMap = Collections.emptyList();
   }

   public MergeResult(T var1, T var2) {
      this.result = Objects.requireNonNull((T)var1, "Merge action result must not be null");
      this.mappingsToMap = Collections.singletonList(Objects.requireNonNull((T)var2, "Merge action mapping must not be null"));
   }

   public MergeResult(T var1, List<T> var2) {
      this.result = Objects.requireNonNull((T)var1, "Merge action result must not be null");
      this.mappingsToMap = Objects.requireNonNull(var2, "Merge action mappings must not be null");
   }

   public T getResult() {
      return this.result;
   }

   public List<T> getMappingsToMap() {
      return this.mappingsToMap;
   }

   @Override
   public String toString() {
      return "MergeResult{result=" + this.result + ", mappingsToMap=" + this.mappingsToMap + '}';
   }
}
