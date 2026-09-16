package org.cadixdev.bombe.jar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceProviderConfiguration {
   private final String service;
   private final List<String> providers;

   public ServiceProviderConfiguration(String var1, List<String> var2) {
      this.service = var1;
      this.providers = var2;
   }

   public ServiceProviderConfiguration(String var1) {
      this(var1, new ArrayList<>());
   }

   public final String getService() {
      return this.service;
   }

   public final List<String> getProviders() {
      return Collections.unmodifiableList(this.providers);
   }

   public final void addProvider(String var1) {
      this.providers.add(var1);
   }

   public void read(InputStream var1) {
      BufferedReader var2 = new BufferedReader(new InputStreamReader(var1));

      try {
         var2.lines().map(var0 -> {
            int var1x = var0.indexOf(35);
            return (String)(var1x == -1 ? var0 : var0.substring(0, var1x));
         }).map(String::trim).filter(var0 -> !var0.isEmpty()).forEach(this.providers::add);
      } catch (Throwable var6) {
         try {
            var2.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      var2.close();
   }

   public void write(OutputStream var1) {
      BufferedWriter var2 = new BufferedWriter(new OutputStreamWriter(var1));

      try {
         for (String var4 : this.providers) {
            var2.write(var4);
            var2.newLine();
         }
      } catch (Throwable var6) {
         try {
            var2.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      var2.close();
   }
}
