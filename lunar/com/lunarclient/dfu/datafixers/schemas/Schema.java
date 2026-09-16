package com.lunarclient.dfu.datafixers.schemas;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.DataFixUtils;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.templates.RecursivePoint;
import com.lunarclient.dfu.datafixers.types.templates.TaggedChoice;
import com.lunarclient.dfu.datafixers.types.templates.TypeTemplate;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public class Schema {
   private final Object2IntMap<String> recursiveTypes = new Object2IntOpenHashMap();
   private final Map<String, Supplier<TypeTemplate>> typeTemplates = Maps.newHashMap();
   private final Map<String, Type<?>> types;
   private final int versionKey;
   private final String name;
   private final Schema parent;

   public Schema(int var1, Schema var2) {
      this.versionKey = var1;
      int var3 = DataFixUtils.getSubVersion(var1);
      this.name = "V" + DataFixUtils.getVersion(var1) + (var3 == 0 ? "" : "." + var3);
      this.parent = var2;
      this.registerTypes(this, this.registerEntities(this), this.registerBlockEntities(this));
      this.types = this.buildTypes();
   }

   protected Map<String, Type<?>> buildTypes() {
      HashMap var1 = Maps.newHashMap();
      ArrayList var2 = Lists.newArrayList();
      ObjectIterator var3 = this.recursiveTypes.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var2.add(DSL.check((String)var4.getKey(), var4.getIntValue(), this.getTemplate((String)var4.getKey())));
      }

      TypeTemplate var9 = (TypeTemplate)var2.stream().reduce(DSL::or).get();
      RecursiveTypeFamily var10 = new RecursiveTypeFamily(this.name, var9);

      for (String var6 : this.typeTemplates.keySet()) {
         int var8 = this.recursiveTypes.getOrDefault(var6, -1);
         Type var7;
         if (var8 != -1) {
            var7 = var10.apply(var8);
         } else {
            var7 = this.getTemplate(var6).apply(var10).apply(-1);
         }

         var1.put(var6, var7);
      }

      return var1;
   }

   public Set<String> types() {
      return this.types.keySet();
   }

   public Type<?> getTypeRaw(DSL.TypeReference var1) {
      String var2 = var1.typeName();
      return this.types.computeIfAbsent(var2, var1x -> {
         throw new IllegalArgumentException("Unknown type: " + var2);
      });
   }

   public Type<?> getType(DSL.TypeReference var1) {
      String var2 = var1.typeName();
      Type var3 = this.types.computeIfAbsent(var2, var1x -> {
         throw new IllegalArgumentException("Unknown type: " + var2);
      });
      return var3 instanceof RecursivePoint.RecursivePointType
         ? var3.findCheckedType(-1).orElseThrow(() -> new IllegalStateException("Could not find choice type in the recursive type"))
         : var3;
   }

   public TypeTemplate resolveTemplate(String var1) {
      return this.typeTemplates.getOrDefault(var1, () -> {
         throw new IllegalArgumentException("Unknown type: " + var1);
      }).get();
   }

   public TypeTemplate id(String var1) {
      int var2 = this.recursiveTypes.getOrDefault(var1, -1);
      return var2 != -1 ? DSL.id(var2) : this.getTemplate(var1);
   }

   protected TypeTemplate getTemplate(String var1) {
      return DSL.named(var1, this.resolveTemplate(var1));
   }

   public Type<?> getChoiceType(DSL.TypeReference var1, String var2) {
      TaggedChoice.TaggedChoiceType var3 = this.findChoiceType(var1);
      if (!var3.types().containsKey(var2)) {
         throw new IllegalArgumentException("Data fixer not registered for: " + var2 + " in " + var1.typeName());
      } else {
         return (Type<?>)var3.types().get(var2);
      }
   }

   public TaggedChoice.TaggedChoiceType<?> findChoiceType(DSL.TypeReference var1) {
      return this.getType(var1).findChoiceType("id", -1).orElseThrow(() -> new IllegalArgumentException("Not a choice type"));
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      this.parent.registerTypes(var1, var2, var3);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      return this.parent.registerEntities(var1);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      return this.parent.registerBlockEntities(var1);
   }

   public void registerSimple(Map<String, Supplier<TypeTemplate>> var1, String var2) {
      this.register(var1, var2, DSL::remainder);
   }

   public void register(Map<String, Supplier<TypeTemplate>> var1, String var2, Function<String, TypeTemplate> var3) {
      this.register(var1, var2, () -> (TypeTemplate)var3.apply(var2));
   }

   public void register(Map<String, Supplier<TypeTemplate>> var1, String var2, Supplier<TypeTemplate> var3) {
      var1.put(var2, var3);
   }

   public void registerType(boolean var1, DSL.TypeReference var2, Supplier<TypeTemplate> var3) {
      this.typeTemplates.put(var2.typeName(), var3);
      if (var1 && !this.recursiveTypes.containsKey(var2.typeName())) {
         this.recursiveTypes.put(var2.typeName(), this.recursiveTypes.size());
      }
   }

   public int getVersionKey() {
      return this.versionKey;
   }

   public Schema getParent() {
      return this.parent;
   }
}
