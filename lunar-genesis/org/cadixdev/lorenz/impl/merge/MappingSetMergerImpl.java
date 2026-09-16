package org.cadixdev.lorenz.impl.merge;

import java.util.HashSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.merge.FieldMergeStrategy;
import org.cadixdev.lorenz.merge.MappingSetMerger;
import org.cadixdev.lorenz.merge.MappingSetMergerHandler;
import org.cadixdev.lorenz.merge.MergeConfig;
import org.cadixdev.lorenz.merge.MergeContext;
import org.cadixdev.lorenz.merge.MergeResult;
import org.cadixdev.lorenz.merge.MethodMergeStrategy;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.cadixdev.lorenz.model.MethodParameterMapping;
import org.cadixdev.lorenz.model.TopLevelClassMapping;

public class MappingSetMergerImpl implements MappingSetMerger {
   private final MappingSetMergerHandler handler;
   private final MethodMergeStrategy methodMergeStrategy;
   private final FieldMergeStrategy fieldMergeStrategy;
   private final MappingSet left;
   private final MappingSet right;
   private final MergeContext context;
   private final int parallelism;

   public MappingSetMergerImpl(MappingSet var1, MappingSet var2, MergeConfig var3) {
      this.left = var1;
      this.right = var2;
      this.handler = var3.getHandler();
      this.methodMergeStrategy = var3.getMethodMergeStrategy();
      this.fieldMergeStrategy = var3.getFieldMergeStrategy();
      this.parallelism = var3.getParallelism();
      this.context = new MergeContext(this.left, this.right);
   }

   @Override
   public MappingSet merge(MappingSet var1) {
      HashSet var2 = new HashSet();
      ExecutorService var3;
      if (this.parallelism == -1) {
         var3 = Executors.newWorkStealingPool();
      } else {
         var3 = Executors.newWorkStealingPool(this.parallelism);
      }

      try {
         CompletableFuture var4 = CompletableFuture.allOf(this.left.getTopLevelClassMappings().stream().peek(var1x -> {
            var2.add(var1x.getObfuscatedName());
            var2.add(var1x.getDeobfuscatedName());
         }).map(var3x -> CompletableFuture.runAsync(() -> {
            TopLevelClassMapping var3xx = this.right.getTopLevelClassMapping(var3x.getDeobfuscatedName()).orElse(null);
            TopLevelClassMapping var4x = this.right.getTopLevelClassMapping(var3x.getObfuscatedName()).orElse(null);
            this.mergeTopLevelClassInternal(var3x, var3xx, var4x, var1);
         }, var3)).toArray(CompletableFuture[]::new));
         CompletableFuture var5 = CompletableFuture.allOf(
            this.right
               .getTopLevelClassMappings()
               .stream()
               .filter(var1x -> !var2.contains(var1x.getObfuscatedName()))
               .map(var3x -> CompletableFuture.runAsync(() -> this.mergeTopLevelClassInternal(null, var3x, null, var1), var3))
               .toArray(CompletableFuture[]::new)
         );

         try {
            CompletableFuture.allOf(var4, var5).get();
         } catch (InterruptedException | ExecutionException var10) {
            throw new RuntimeException("Mapping operation failed", var10);
         }
      } finally {
         var3.shutdown();
      }

      return var1;
   }

   @Override
   public TopLevelClassMapping mergeTopLevelClass(TopLevelClassMapping var1, TopLevelClassMapping var2, MappingSet var3) {
      return var1 != null && var2 != null && var1.getObfuscatedName().equals(var2.getObfuscatedName())
         ? this.mergeTopLevelClassInternal(var1, null, var2, var3)
         : this.mergeTopLevelClassInternal(var1, var2, null, var3);
   }

   protected TopLevelClassMapping mergeTopLevelClassInternal(TopLevelClassMapping var1, TopLevelClassMapping var2, TopLevelClassMapping var3, MappingSet var4) {
      MergeResult var5;
      if (var1 != null && var3 != null) {
         var5 = this.handler.mergeDuplicateTopLevelClassMappings(var1, var3, var2, var4, this.context);
      } else if (var1 != null && var2 != null) {
         var5 = this.handler.mergeTopLevelClassMappings(var1, var2, var4, this.context);
      } else if (var2 == null && var1 != null) {
         var5 = this.handler.addLeftTopLevelClassMapping(var1, var4, this.context);
      } else {
         if (var2 == null) {
            throw new IllegalStateException("Cannot merge null mappings");
         }

         var5 = this.handler.addRightTopLevelClassMapping(var2, var4, this.context);
      }

      TopLevelClassMapping var6 = (TopLevelClassMapping)var5.getResult();
      if (var6 == null) {
         return null;
      }

      if (var5.getMappingsToMap().isEmpty()) {
         this.mergeClass(var1, null, var6);
      } else {
         for (TopLevelClassMapping var8 : var5.getMappingsToMap()) {
            this.mergeClass(var1, var8, var6);
         }
      }

      return var6;
   }

   @Override
   public InnerClassMapping mergeInnerClass(InnerClassMapping var1, InnerClassMapping var2, ClassMapping<?, ?> var3) {
      return var1 != null && var2 != null && var1.getObfuscatedName().equals(var2.getObfuscatedName())
         ? this.mergeInnerClassInternal(var1, null, var2, var3)
         : this.mergeInnerClassInternal(var1, var2, null, var3);
   }

   protected InnerClassMapping mergeInnerClassInternal(InnerClassMapping var1, InnerClassMapping var2, InnerClassMapping var3, ClassMapping<?, ?> var4) {
      MergeResult var5;
      if (var1 != null && var3 != null) {
         var5 = this.handler.mergeDuplicateInnerClassMappings(var1, var3, var2, var4, this.context);
      } else if (var1 != null && var2 != null) {
         var5 = this.handler.mergeInnerClassMappings(var1, var2, var4, this.context);
      } else if (var2 == null && var1 != null) {
         var5 = this.handler.addLeftInnerClassMapping(var1, var4, this.context);
      } else {
         if (var2 == null) {
            throw new IllegalStateException("Cannot merge null mappings");
         }

         var5 = this.handler.addRightInnerClassMapping(var2, var4, this.context);
      }

      InnerClassMapping var6 = (InnerClassMapping)var5.getResult();
      if (var6 == null) {
         return null;
      }

      if (var5.getMappingsToMap().isEmpty()) {
         this.mergeClass(var1, null, var6);
      } else {
         for (InnerClassMapping var8 : var5.getMappingsToMap()) {
            this.mergeClass(var1, var8, var6);
         }
      }

      return var6;
   }

   @Override
   public FieldMapping mergeField(FieldMapping var1, FieldMapping var2, ClassMapping<?, ?> var3) {
      return var1 != null && var2 != null && var1.getObfuscatedName().equals(var2.getObfuscatedName())
         ? this.mergeFieldInternal(var1, null, null, var2, null, var3)
         : this.mergeFieldInternal(var1, var2, null, null, null, var3);
   }

   protected FieldMapping mergeFieldInternal(
      FieldMapping var1, FieldMapping var2, FieldMapping var3, FieldMapping var4, FieldMapping var5, ClassMapping<?, ?> var6
   ) {
      if (var1 == null || var4 == null && var5 == null) {
         if (var1 == null || var2 == null && var3 == null) {
            if (var2 == null && var3 == null && var1 != null) {
               return this.handler.addLeftFieldMapping(var1, var6, this.context);
            } else if (var2 != null) {
               return this.handler.addRightFieldMapping(var2, var6, this.context);
            } else {
               throw new IllegalStateException("Cannot merge null mappings");
            }
         } else {
            return this.handler.mergeFieldMappings(var1, var2, var3, var6, this.context);
         }
      } else {
         return this.handler.mergeDuplicateFieldMappings(var1, var4, var5, var2, var3, var6, this.context);
      }
   }

   @Override
   public MethodMapping mergeMethod(MethodMapping var1, MethodMapping var2, ClassMapping<?, ?> var3) {
      return var1 != null && var2 != null && var1.getSignature().equals(var2.getDeobfuscatedSignature())
         ? this.mergeMethodInternal(var1, null, null, var2, null, var3)
         : this.mergeMethodInternal(var1, var2, null, null, null, var3);
   }

   protected MethodMapping mergeMethodInternal(
      MethodMapping var1, MethodMapping var2, MethodMapping var3, MethodMapping var4, MethodMapping var5, ClassMapping<?, ?> var6
   ) {
      MergeResult var7;
      if (var1 == null || var4 == null && var5 == null) {
         if (var1 == null || var2 == null && var3 == null) {
            if (var2 == null && var3 == null && var1 != null) {
               var7 = this.handler.addLeftMethodMapping(var1, var6, this.context);
            } else {
               if (var2 == null) {
                  throw new IllegalStateException("Cannot merge null mappings");
               }

               var7 = this.handler.addRightMethodMapping(var2, var6, this.context);
            }
         } else {
            var7 = this.handler.mergeMethodMappings(var1, var2, var3, var6, this.context);
         }
      } else {
         var7 = this.handler.mergeDuplicateMethodMappings(var1, var4, var5, var2, var3, var6, this.context);
      }

      MethodMapping var8 = (MethodMapping)var7.getResult();
      if (var8 == null) {
         return null;
      }

      if (var7.getMappingsToMap().isEmpty()) {
         this.mergeMethodInto(var1, null, var8);
      } else {
         for (MethodMapping var10 : var7.getMappingsToMap()) {
            this.mergeMethodInto(var1, var10, var8);
         }
      }

      return var8;
   }

   protected void mergeMethodInto(MethodMapping var1, MethodMapping var2, MethodMapping var3) {
      HashSet var4 = new HashSet();
      if (var1 != null) {
         for (MethodParameterMapping var6 : var1.getParameterMappings()) {
            MethodParameterMapping var7;
            if (var2 != null) {
               var7 = var2.getParameterMapping(var6.getIndex()).orElse(null);
            } else {
               var7 = null;
            }

            this.mergeMethodParameter(var6, var7, var3);
            var4.add(var6.getIndex());
         }
      }

      if (var2 != null) {
         for (MethodParameterMapping var9 : var2.getParameterMappings()) {
            if (!var4.contains(var9.getIndex())) {
               this.mergeMethodParameter(null, var9, var3);
            }
         }
      }
   }

   @Override
   public MethodParameterMapping mergeMethodParameter(MethodParameterMapping var1, MethodParameterMapping var2, MethodMapping var3) {
      if (var1 != null && var2 != null) {
         return this.handler.mergeParameterMappings(var1, var2, var3, this.context);
      } else if (var2 == null && var1 != null) {
         return this.handler.addLeftParameterMapping(var1, var3, this.context);
      } else if (var2 != null) {
         return this.handler.addRightParameterMapping(var2, var3, this.context);
      } else {
         throw new IllegalStateException("Cannot merge 2 null mappings");
      }
   }

   protected <T extends ClassMapping<T, ?>> void mergeClass(T var1, T var2, T var3) {
      HashSet var4 = new HashSet();
      HashSet var5 = new HashSet();
      HashSet var6 = new HashSet();
      HashSet var7 = new HashSet();
      if (var1 != null) {
         for (InnerClassMapping var9 : var1.getInnerClassMappings()) {
            InnerClassMapping var10;
            InnerClassMapping var11;
            if (var2 != null) {
               var10 = var2.getInnerClassMapping(var9.getDeobfuscatedName()).orElse(null);
               var11 = var2.getInnerClassMapping(var9.getObfuscatedName()).orElse(null);
            } else {
               var10 = null;
               var11 = null;
            }

            this.mergeInnerClassInternal(var9, var10, var11, var3);
            var4.add(var9.getObfuscatedName());
            var4.add(var9.getDeobfuscatedName());
         }
      }

      if (var2 != null) {
         for (InnerClassMapping var21 : var2.getInnerClassMappings()) {
            if (!var4.contains(var21.getObfuscatedName())) {
               this.mergeInnerClassInternal(null, var21, null, var3);
            }
         }
      }

      if (var1 != null) {
         for (FieldMapping var22 : var1.getFieldMappings()) {
            FieldMapping var12;
            FieldMapping var13;
            FieldMapping var26;
            FieldMapping var28;
            if (var2 != null) {
               var26 = var2.getFieldMapping(var22.getDeobfuscatedSignature()).orElse(null);
               var28 = var2.getFieldMapping(var22.getSignature()).orElse(null);
               if (this.fieldMergeStrategy == FieldMergeStrategy.LOOSE) {
                  var12 = var2.getFieldMapping(var22.getDeobfuscatedName()).filter(var1x -> !var1x.equals(var26)).orElse(null);
                  var13 = var2.getFieldMapping(var22.getObfuscatedName()).filter(var1x -> !var1x.equals(var28)).orElse(null);
               } else {
                  var12 = null;
                  var13 = null;
               }
            } else {
               var26 = null;
               var28 = null;
               var12 = null;
               var13 = null;
            }

            this.mergeFieldInternal(var22, var26, var12, var28, var13, var3);
            var5.add(var22.getSignature());
            var5.add(var22.getDeobfuscatedSignature());
            if (this.fieldMergeStrategy == FieldMergeStrategy.LOOSE) {
               var6.add(var22.getObfuscatedName());
               var6.add(var22.getDeobfuscatedName());
            }
         }
      }

      if (var2 != null) {
         for (FieldMapping var23 : var2.getFieldMappings()) {
            if (!var6.contains(var23.getObfuscatedName()) && !var5.contains(var23.getSignature())) {
               this.mergeFieldInternal(null, var23, null, null, null, var3);
            }
         }
      }

      if (var1 != null) {
         for (MethodMapping var24 : var1.getMethodMappings()) {
            MethodSignature var14 = new MethodSignature(var24.getDeobfuscatedName(), var24.getDescriptor());
            MethodSignature var15 = new MethodSignature(var24.getObfuscatedName(), var24.getDeobfuscatedSignature().getDescriptor());
            MethodMapping var27;
            MethodMapping var29;
            MethodMapping var30;
            MethodMapping var31;
            if (var2 != null) {
               var27 = var2.getMethodMapping(var24.getDeobfuscatedSignature()).orElse(null);
               var29 = var2.getMethodMapping(var24.getSignature()).orElse(null);
               if (this.methodMergeStrategy == MethodMergeStrategy.LOOSE) {
                  var30 = var2.getMethodMapping(var14).orElse(null);
                  var31 = var2.getMethodMapping(var15).orElse(null);
               } else {
                  var30 = null;
                  var31 = null;
               }
            } else {
               var27 = null;
               var30 = null;
               var29 = null;
               var31 = null;
            }

            this.mergeMethodInternal(var24, var27, var30, var29, var31, var3);
            var7.add(var24.getSignature());
            var7.add(var24.getDeobfuscatedSignature());
            if (this.methodMergeStrategy == MethodMergeStrategy.LOOSE) {
               var7.add(var14);
               var7.add(var15);
            }
         }
      }

      if (var2 != null) {
         for (MethodMapping var25 : var2.getMethodMappings()) {
            if (!var7.contains(var25.getSignature())) {
               this.mergeMethodInternal(null, var25, null, null, null, var3);
            }
         }
      }
   }
}
