package org.cadixdev.lorenz.merge;

import java.util.Objects;

public final class MergeConfig {
   private final MappingSetMergerHandler handler;
   private final MethodMergeStrategy methodMergeStrategy;
   private final FieldMergeStrategy fieldMergeStrategy;
   private final int parallelism;

   MergeConfig(MappingSetMergerHandler var1, MethodMergeStrategy var2, FieldMergeStrategy var3, int var4) {
      this.handler = Objects.requireNonNull(var1, "handler must not be null");
      this.methodMergeStrategy = Objects.requireNonNull(var2, "methodMergeStrategy must not be null");
      this.fieldMergeStrategy = Objects.requireNonNull(var3, "fieldMergeStrategy must not be null");
      if (var4 != -1 && var4 <= 0) {
         throw new IllegalArgumentException("Illegal parallelism value: " + var4);
      }

      this.parallelism = var4;
   }

   public MappingSetMergerHandler getHandler() {
      return this.handler;
   }

   public MethodMergeStrategy getMethodMergeStrategy() {
      return this.methodMergeStrategy;
   }

   public FieldMergeStrategy getFieldMergeStrategy() {
      return this.fieldMergeStrategy;
   }

   public int getParallelism() {
      return this.parallelism;
   }

   public static MergeConfig.Builder builder() {
      return new MergeConfig.Builder();
   }

   @Override
   public String toString() {
      return "MergeConfig{handler="
         + this.handler
         + ", methodMergeStrategy="
         + this.methodMergeStrategy
         + ", fieldMergeStrategy="
         + this.fieldMergeStrategy
         + ", parallelism="
         + this.parallelism
         + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         MergeConfig var2 = (MergeConfig)var1;
         return this.parallelism == var2.parallelism
            && this.handler.equals(var2.handler)
            && this.methodMergeStrategy == var2.methodMergeStrategy
            && this.fieldMergeStrategy == var2.fieldMergeStrategy;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.handler, this.methodMergeStrategy, this.fieldMergeStrategy, this.parallelism);
   }

   public static final class Builder {
      private MappingSetMergerHandler handler = new MappingSetMergerHandler() {};
      private MethodMergeStrategy methodMergeStrategy = MethodMergeStrategy.STRICT;
      private FieldMergeStrategy fieldMergeStrategy = FieldMergeStrategy.LOOSE;
      private int parallelism = -1;

      Builder() {
      }

      public MergeConfig.Builder withMergeHandler(MappingSetMergerHandler var1) {
         this.handler = Objects.requireNonNull(var1);
         return this;
      }

      public MergeConfig.Builder withMethodMergeStrategy(MethodMergeStrategy var1) {
         this.methodMergeStrategy = Objects.requireNonNull(var1);
         return this;
      }

      public MergeConfig.Builder withFieldMergeStrategy(FieldMergeStrategy var1) {
         this.fieldMergeStrategy = Objects.requireNonNull(var1);
         return this;
      }

      public MergeConfig.Builder withParallelism(int var1) {
         if (var1 <= 0) {
            this.parallelism = -1;
         } else {
            this.parallelism = var1;
         }

         return this;
      }

      public MergeConfig build() {
         return new MergeConfig(this.handler, this.methodMergeStrategy, this.fieldMergeStrategy, this.parallelism);
      }
   }
}
