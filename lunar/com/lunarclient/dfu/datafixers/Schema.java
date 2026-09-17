package com.lunarclient.dfu.datafixers;

import com.lunarclient.dfu.datafixers.schemas.Schema;
import com.lunarclient.dfu.datafixers.types.Type;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntBidirectionalIterator;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataFixerBuilder {
   private static final Logger LOGGER = LoggerFactory.getLogger(DataFixerBuilder.class);
   private final int dataVersion;
   private final Int2ObjectSortedMap<Schema> schemas = new Int2ObjectAVLTreeMap();
   private final List<DataFix> globalList = new ArrayList<>();
   private final IntSortedSet fixerVersions = new IntAVLTreeSet();

   public DataFixerBuilder(int var1) {
      this.dataVersion = var1;
   }

   public Schema addSchema(int var1, BiFunction<Integer, Schema, Schema> var2) {
      return this.addSchema(var1, 0, var2);
   }

   public Schema addSchema(int var1, int var2, BiFunction<Integer, Schema, Schema> var3) {
      int var4 = DataFixUtils.makeKey(var1, var2);
      Schema var5 = this.schemas.isEmpty() ? null : (Schema)this.schemas.get(DataFixerUpper.getLowestSchemaSameVersion(this.schemas, var4 - 1));
      Schema var6 = (Schema)var3.apply(DataFixUtils.makeKey(var1, var2), var5);
      this.addSchema(var6);
      return var6;
   }

   public void addSchema(Schema var1) {
      this.schemas.put(var1.getVersionKey(), var1);
   }

   public void addFixer(DataFix var1) {
      int var2 = DataFixUtils.getVersion(var1.getVersionKey());
      if (var2 > this.dataVersion) {
         LOGGER.warn("Ignored fix registered for version: {} as the DataVersion of the game is: {}", var2, this.dataVersion);
      } else {
         this.globalList.add(var1);
         this.fixerVersions.add(var1.getVersionKey());
      }
   }

   public DataFixerBuilder.Result build() {
      DataFixerUpper var1 = new DataFixerUpper(new Int2ObjectAVLTreeMap(this.schemas), new ArrayList<>(this.globalList), new IntAVLTreeSet(this.fixerVersions));
      return new DataFixerBuilder.Result(var1);
   }

   public class Result {
      private final DataFixerUpper fixerUpper;

      public Result(DataFixerUpper var2) {
         this.fixerUpper = var2;
      }

      public DataFixer fixer() {
         return this.fixerUpper;
      }

      public CompletableFuture<?> optimize(Set<DSL.TypeReference> var1, Executor var2) {
         Instant var3 = Instant.now();
         ArrayList var4 = new ArrayList();
         ArrayList var5 = new ArrayList();
         Set var6 = var1.stream().map(DSL.TypeReference::typeName).collect(Collectors.toSet());
         IntBidirectionalIterator var7 = this.fixerUpper.fixerVersions().iterator();

         while (var7.hasNext()) {
            int var8 = var7.nextInt();
            Schema var9 = (Schema)DataFixerBuilder.this.schemas.get(var8);

            for (String var11 : var9.types()) {
               if (var6.contains(var11)) {
                  CompletableFuture var12 = CompletableFuture.runAsync(() -> {
                     Type var4x = var9.getType(() -> var11);
                     TypeRewriteRule var5x = this.fixerUpper.getRule(DataFixUtils.getVersion(var8), DataFixerBuilder.this.dataVersion);
                     var4x.rewrite(var5x, DataFixerUpper.OPTIMIZATION_RULE);
                  }, var2);
                  var4.add(var12);
                  CompletableFuture var13 = new CompletableFuture();
                  var12.exceptionally(var1x -> {
                     var13.completeExceptionally(var1x);
                     return null;
                  });
                  var5.add(var13);
               }
            }
         }

         CompletableFuture var14 = CompletableFuture.allOf(var4.toArray(CompletableFuture[]::new))
            .thenAccept(
               var2x -> DataFixerBuilder.LOGGER
                  .info("{} Datafixer optimizations took {} milliseconds", var4.size(), Duration.between(var3, Instant.now()).toMillis())
            );
         CompletableFuture var15 = CompletableFuture.anyOf(var5.toArray(CompletableFuture[]::new));
         return CompletableFuture.anyOf(var14, var15);
      }
   }
}
