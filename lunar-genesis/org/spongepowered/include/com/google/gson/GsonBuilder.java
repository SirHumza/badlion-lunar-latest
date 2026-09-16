package org.spongepowered.include.com.google.gson;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spongepowered.include.com.google.gson.internal.Excluder;
import org.spongepowered.include.com.google.gson.reflect.TypeToken;

public final class GsonBuilder {
   private Excluder excluder = Excluder.DEFAULT;
   private LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
   private FieldNamingStrategy fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
   private final Map<Type, InstanceCreator<?>> instanceCreators = new HashMap<>();
   private final List<TypeAdapterFactory> factories = new ArrayList<>();
   private final List<TypeAdapterFactory> hierarchyFactories = new ArrayList<>();
   private boolean serializeNulls;
   private String datePattern;
   private int dateStyle = 2;
   private int timeStyle = 2;
   private boolean complexMapKeySerialization;
   private boolean serializeSpecialFloatingPointValues;
   private boolean escapeHtmlChars = true;
   private boolean prettyPrinting;
   private boolean generateNonExecutableJson;

   public GsonBuilder setPrettyPrinting() {
      this.prettyPrinting = true;
      return this;
   }

   public GsonBuilder disableHtmlEscaping() {
      this.escapeHtmlChars = false;
      return this;
   }

   public Gson create() {
      ArrayList var1 = new ArrayList();
      var1.addAll(this.factories);
      Collections.reverse(var1);
      var1.addAll(this.hierarchyFactories);
      this.addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, var1);
      return new Gson(
         this.excluder,
         this.fieldNamingPolicy,
         this.instanceCreators,
         this.serializeNulls,
         this.complexMapKeySerialization,
         this.generateNonExecutableJson,
         this.escapeHtmlChars,
         this.prettyPrinting,
         this.serializeSpecialFloatingPointValues,
         this.longSerializationPolicy,
         var1
      );
   }

   private void addTypeAdaptersForDate(String var1, int var2, int var3, List<TypeAdapterFactory> var4) {
      DefaultDateTypeAdapter var5;
      if (var1 != null && !"".equals(var1.trim())) {
         var5 = new DefaultDateTypeAdapter(var1);
      } else {
         if (var2 == 2 || var3 == 2) {
            return;
         }

         var5 = new DefaultDateTypeAdapter(var2, var3);
      }

      var4.add(TreeTypeAdapter.newFactory(TypeToken.get(Date.class), var5));
      var4.add(TreeTypeAdapter.newFactory(TypeToken.get(Timestamp.class), var5));
      var4.add(TreeTypeAdapter.newFactory(TypeToken.get(java.sql.Date.class), var5));
   }
}
