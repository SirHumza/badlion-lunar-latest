package com.moonsworth.lunar.lib.adventure.util;

import com.moonsworth.lunar.lib.adventure.internal.properties.AdventureProperties;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public final class Services {
   private static final boolean SERVICE_LOAD_FAILURES_ARE_FATAL = Boolean.TRUE.equals(AdventureProperties.SERVICE_LOAD_FAILURES_ARE_FATAL.value());

   private Services() {
   }

   @NotNull
   public static <P> Optional<P> service(@NotNull Class<P> var0) {
      ServiceLoader var1 = Services0.loader(var0);
      Iterator var2 = var1.iterator();

      while (var2.hasNext()) {
         Object var3;
         try {
            var3 = var2.next();
         } catch (Throwable var5) {
            if (!SERVICE_LOAD_FAILURES_ARE_FATAL) {
               continue;
            }

            throw new IllegalStateException("Encountered an exception loading service " + var0, var5);
         }

         if (var2.hasNext()) {
            throw new IllegalStateException("Expected to find one service " + var0 + ", found multiple");
         }

         return Optional.of((P)var3);
      }

      return Optional.empty();
   }

   @NotNull
   public static <P> Optional<P> serviceWithFallback(@NotNull Class<P> var0) {
      ServiceLoader var1 = Services0.loader(var0);
      Iterator var2 = var1.iterator();
      Object var3 = null;

      while (var2.hasNext()) {
         Object var4;
         try {
            var4 = var2.next();
         } catch (Throwable var6) {
            if (!SERVICE_LOAD_FAILURES_ARE_FATAL) {
               continue;
            }

            throw new IllegalStateException("Encountered an exception loading service " + var0, var6);
         }

         if (!(var4 instanceof Services.Fallback)) {
            return Optional.of((P)var4);
         }

         if (var3 == null) {
            var3 = var4;
         }
      }

      return Optional.ofNullable((P)var3);
   }

   public static <P> Set<P> services(Class<? extends P> var0) {
      ServiceLoader var1 = Services0.loader(var0);
      HashSet var2 = new HashSet();

      for (Object var4 : var1) {
         try {
            ;
         } catch (ServiceConfigurationError var6) {
            if (!SERVICE_LOAD_FAILURES_ARE_FATAL) {
               continue;
            }

            throw new IllegalStateException("Encountered an exception loading a provider for " + var0 + ": ", var6);
         }

         var2.add(var4);
      }

      return Collections.unmodifiableSet(var2);
   }

   public interface Fallback {
   }
}
