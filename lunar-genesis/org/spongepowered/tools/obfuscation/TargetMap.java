package org.spongepowered.tools.obfuscation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import org.spongepowered.include.com.google.common.io.Files;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.JsonArray;
import org.spongepowered.include.com.google.gson.JsonElement;
import org.spongepowered.include.com.google.gson.JsonObject;
import org.spongepowered.include.com.google.gson.JsonPrimitive;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeReference;

public final class TargetMap extends HashMap<TypeReference, Set<TypeReference>> {
   private static final Gson GSON = new Gson();
   private final String sessionId;

   private TargetMap() {
      this(String.valueOf(System.currentTimeMillis()));
   }

   private TargetMap(String var1) {
      this.sessionId = var1;
   }

   public String getSessionId() {
      return this.sessionId;
   }

   void registerTargets(AnnotatedMixin var1) {
      this.registerTargets(var1.getTargets(), var1.getHandle());
   }

   void registerTargets(List<TypeHandle> var1, TypeHandle var2) {
      for (TypeHandle var4 : var1) {
         this.addMixin(var4, var2);
      }
   }

   void addMixin(TypeHandle var1, TypeHandle var2) {
      this.addMixin(var1.getReference(), var2.getReference());
   }

   void addMixin(String var1, String var2) {
      this.addMixin(new TypeReference(var1), new TypeReference(var2));
   }

   void addMixin(TypeReference var1, TypeReference var2) {
      Set var3 = this.getMixinsFor(var1);
      var3.add(var2);
   }

   Collection<TypeReference> getMixinsTargeting(TypeHandle var1) {
      return this.getMixinsTargeting(var1.getReference());
   }

   Collection<TypeReference> getMixinsTargeting(TypeReference var1) {
      return Collections.unmodifiableCollection(this.getMixinsFor(var1));
   }

   private Set<TypeReference> getMixinsFor(TypeReference var1) {
      Set var2 = this.get(var1);
      if (var2 == null) {
         var2 = new HashSet();
         this.put(var1, var2);
      }

      return var2;
   }

   public void readImports(File var1) {
      if (var1.isFile()) {
         for (String var3 : Files.readLines(var1, Charset.defaultCharset())) {
            String[] var4 = var3.split("\t");
            if (var4.length == 2) {
               this.addMixin(var4[1], var4[0]);
            }
         }
      }
   }

   public void write(boolean var1) {
      JsonObject var2 = new JsonObject();

      for (Entry var4 : this.entrySet()) {
         JsonArray var5 = new JsonArray();

         for (TypeReference var7 : (Set)var4.getValue()) {
            var5.add(new JsonPrimitive(var7.getName()));
         }

         var2.add(((TypeReference)var4.getKey()).getName(), var5);
      }

      String var11 = GSON.toJson(var2);
      File var12 = getSessionFile(this.sessionId);
      if (var1) {
         var12.deleteOnExit();
      }

      try {
         FileOutputStream var13 = new FileOutputStream(var12);

         try {
            var13.write(var11.getBytes(StandardCharsets.UTF_8));
         } catch (Throwable var9) {
            try {
               var13.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }

            throw var9;
         }

         var13.close();
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   private static TargetMap read(File var0) {
      try {
         BufferedReader var1 = new BufferedReader(new FileReader(var0));

         TargetMap var12;
         try {
            JsonObject var2 = GSON.fromJson(var1, JsonObject.class);
            TargetMap var3 = new TargetMap();

            for (Entry var5 : var2.entrySet()) {
               for (JsonElement var8 : ((JsonElement)var5.getValue()).getAsJsonArray()) {
                  var3.addMixin((String)var5.getKey(), var8.getAsString());
               }
            }

            var12 = var3;
         } catch (Throwable var10) {
            try {
               var1.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }

            throw var10;
         }

         var1.close();
         return var12;
      } catch (Exception var11) {
         var11.printStackTrace();
         return null;
      }
   }

   public static TargetMap create(String var0) {
      if (var0 != null) {
         File var1 = getSessionFile(var0);
         if (var1.exists()) {
            TargetMap var2 = read(var1);
            if (var2 != null) {
               return var2;
            }
         }
      }

      return new TargetMap();
   }

   private static File getSessionFile(String var0) {
      File var1 = new File(System.getProperty("java.io.tmpdir"));
      return new File(var1, String.format("mixin-targetdb-%s.tmp", var0));
   }
}
