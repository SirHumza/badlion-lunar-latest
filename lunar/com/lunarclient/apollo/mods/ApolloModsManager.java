package com.lunarclient.apollo.mods;

import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.StatusOptionsImpl;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;

public final class ApolloModsManager {
   private final ApolloModsManager.Container container = loadModOptions();
   private final StatusOptionsImpl playerOptions = new StatusOptionsImpl(this.container.getModStatusOptions().values());

   public static ApolloModsManager.Container loadModOptions() {
      LinkedHashMap var0 = new LinkedHashMap();
      ArrayList var1 = new ArrayList();

      try {
         Field var2 = Option.class.getDeclaredField("defaultValue");
         var2.setAccessible(true);

         for (Class var4 : Mods.ALL_MODS) {
            Field[] var5 = var4.getDeclaredFields();

            for (Field var9 : var5) {
               var9.setAccessible(true);
               Option var10 = (Option)var9.get(null);
               if (var10 != null) {
                  var0.put(var10.getKey(), var10);
                  Option var11 = var10.clone();
                  var2.set(var11, null);
                  var1.add(var11);
               }
            }
         }
      } catch (Exception var12) {
         var12.printStackTrace();
      }

      return new ApolloModsManager.Container(var0, var1);
   }

   @Generated
   public ApolloModsManager.Container getContainer() {
      return this.container;
   }

   @Generated
   public StatusOptionsImpl getPlayerOptions() {
      return this.playerOptions;
   }

   public static class Container {
      private final Map<String, Option<?, ?, ?>> modStatusOptions;
      private final List<Option<?, ?, ?>> modSettingsOptions;

      @Generated
      public Map<String, Option<?, ?, ?>> getModStatusOptions() {
         return this.modStatusOptions;
      }

      @Generated
      public List<Option<?, ?, ?>> getModSettingsOptions() {
         return this.modSettingsOptions;
      }

      @Generated
      public Container(Map<String, Option<?, ?, ?>> var1, List<Option<?, ?, ?>> var2) {
         this.modStatusOptions = var1;
         this.modSettingsOptions = var2;
      }
   }
}
