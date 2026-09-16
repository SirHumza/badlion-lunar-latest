package com.moonsworth.lunar.lib.adventure.internal.properties;

import com.moonsworth.lunar.lib.adventure.util.Services;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

final class AdventurePropertiesImpl {
   private static final String FILESYSTEM_DIRECTORY_NAME = "config";
   private static final String FILESYSTEM_FILE_NAME = "adventure.properties";
   private static final Properties PROPERTIES = new Properties();

   private static void print(Throwable var0) {
      var0.printStackTrace();
   }

   private AdventurePropertiesImpl() {
   }

   @VisibleForTesting
   @NotNull
   static String systemPropertyName(String var0) {
      return String.join(".", "net", "kyori", "adventure", var0);
   }

   static <T> AdventureProperties.@NotNull Property<T> property(@NotNull String var0, @NotNull Function<String, T> var1, @Nullable T var2, boolean var3) {
      return new AdventurePropertiesImpl.PropertyImpl<>(var0, var1, (T)var2, var3);
   }

   static {
      Path var0 = Optional.ofNullable(System.getProperty(systemPropertyName("config")))
         .map(var0x -> Paths.get(var0x))
         .orElseGet(() -> Paths.get("config", "adventure.properties"));
      if (Files.isRegularFile(var0)) {
         try {
            InputStream var1 = Files.newInputStream(var0);

            try {
               PROPERTIES.load(var1);
            } catch (Throwable var5) {
               if (var1 != null) {
                  try {
                     var1.close();
                  } catch (Throwable var4) {
                     var5.addSuppressed(var4);
                  }
               }

               throw var5;
            }

            if (var1 != null) {
               var1.close();
            }
         } catch (IOException var6) {
            print(var6);
         }
      }
   }

   private static final class PropertyImpl<T> implements AdventureProperties.Property<T> {
      private final String name;
      private final Function<String, T> parser;
      @Nullable
      private final T defaultValue;
      private final boolean allowProviderDefaultOverride;
      private boolean valueCalculated;
      @Nullable
      private T value;

      PropertyImpl(@NotNull String var1, @NotNull Function<String, T> var2, @Nullable T var3, boolean var4) {
         this.name = var1;
         this.parser = var2;
         this.defaultValue = (T)var3;
         this.allowProviderDefaultOverride = var4;
      }

      @Nullable
      @Override
      public T value() {
         if (!this.valueCalculated) {
            String var1 = AdventurePropertiesImpl.systemPropertyName(this.name);
            String var2 = System.getProperty(var1, AdventurePropertiesImpl.PROPERTIES.getProperty(this.name));
            if (var2 != null) {
               this.value = this.parser.apply(var2);
            }

            if (this.value == null) {
               if (this.allowProviderDefaultOverride) {
                  this.value = AdventurePropertiesImpl.Providers.DEFAULT_PROVIDER
                     .<T>map(var1x -> var1x.overrideDefault(this, this.defaultValue))
                     .orElse(this.defaultValue);
               } else {
                  this.value = this.defaultValue;
               }
            }

            this.valueCalculated = true;
         }

         return this.value;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         return this == var1;
      }

      @Override
      public int hashCode() {
         return this.name.hashCode();
      }
   }

   static final class Providers {
      @NotNull
      static final Optional<AdventureProperties.DefaultOverrideProvider> DEFAULT_PROVIDER = Services.service(AdventureProperties.DefaultOverrideProvider.class);
   }
}
