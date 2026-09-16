package com.lunarclient.dfu.datafixers;

import com.google.common.collect.Lists;
import com.lunarclient.dfu.datafixers.functions.PointFreeRule;
import com.lunarclient.dfu.datafixers.schemas.Schema;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataFixerUpper implements DataFixer {
   public static boolean ERRORS_ARE_FATAL = false;
   private static final Logger LOGGER = LoggerFactory.getLogger(DataFixerUpper.class);
   protected static final PointFreeRule OPTIMIZATION_RULE = DataFixUtils.make(
      () -> PointFreeRule.everywhere(
         PointFreeRule.seq(
            PointFreeRule.CataFuseSame.INSTANCE,
            PointFreeRule.CataFuseDifferent.INSTANCE,
            PointFreeRule.CompRewrite.together(PointFreeRule.LensComp.INSTANCE, PointFreeRule.SortProj.INSTANCE, PointFreeRule.SortInj.INSTANCE)
         ),
         PointFreeRule.AppNest.INSTANCE
      )
   );
   private final Int2ObjectSortedMap<Schema> schemas;
   private final List<DataFix> globalList;
   private final IntSortedSet fixerVersions;
   private final Long2ObjectMap<TypeRewriteRule> rules = Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap());

   protected DataFixerUpper(Int2ObjectSortedMap<Schema> var1, List<DataFix> var2, IntSortedSet var3) {
      this.schemas = var1;
      this.globalList = var2;
      this.fixerVersions = var3;
   }

   @Override
   public <T> Dynamic<T> update(DSL.TypeReference var1, Dynamic<T> var2, int var3, int var4) {
      if (var3 < var4) {
         Type var5 = this.getType(var1, var3);
         DataResult var6 = var5.readAndWrite(var2.getOps(), this.getType(var1, var4), this.getRule(var3, var4), OPTIMIZATION_RULE, var2.getValue());
         Object var7 = var6.resultOrPartial(LOGGER::error).orElse(var2.getValue());
         return new Dynamic<>(var2.getOps(), (T)var7);
      } else {
         return var2;
      }
   }

   @Override
   public Schema getSchema(int var1) {
      return (Schema)this.schemas.get(getLowestSchemaSameVersion(this.schemas, var1));
   }

   protected Type<?> getType(DSL.TypeReference var1, int var2) {
      return this.getSchema(DataFixUtils.makeKey(var2)).getTypeRaw(var1);
   }

   protected static int getLowestSchemaSameVersion(Int2ObjectSortedMap<Schema> var0, int var1) {
      return var1 < var0.firstIntKey() ? var0.firstIntKey() : var0.subMap(0, var1 + 1).lastIntKey();
   }

   private int getLowestFixSameVersion(int var1) {
      return var1 < this.fixerVersions.firstInt() ? this.fixerVersions.firstInt() - 1 : this.fixerVersions.subSet(0, var1 + 1).lastInt();
   }

   protected TypeRewriteRule getRule(int var1, int var2) {
      if (var1 >= var2) {
         return TypeRewriteRule.nop();
      }

      long var3 = (long)var1 << 32 | var2;
      return (TypeRewriteRule)this.rules.computeIfAbsent(var3, var3x -> {
         int var5 = this.getLowestFixSameVersion(DataFixUtils.makeKey(var1));
         ArrayList var6 = Lists.newArrayList();

         for (DataFix var8 : this.globalList) {
            int var9 = var8.getVersionKey();
            int var10 = DataFixUtils.getVersion(var9);
            if (var9 > var5 && var10 <= var2) {
               TypeRewriteRule var11 = var8.getRule();
               if (var11 != TypeRewriteRule.nop()) {
                  var6.add(var11);
               }
            }
         }

         return TypeRewriteRule.seq(var6);
      });
   }

   protected IntSortedSet fixerVersions() {
      return this.fixerVersions;
   }
}
