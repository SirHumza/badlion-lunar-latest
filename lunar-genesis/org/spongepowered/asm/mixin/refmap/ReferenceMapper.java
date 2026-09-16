package org.spongepowered.asm.mixin.refmap;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import javax.tools.Diagnostic.Kind;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.logging.MessageRouter;
import org.spongepowered.include.com.google.common.collect.Maps;
import org.spongepowered.include.com.google.common.io.Closeables;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.GsonBuilder;
import org.spongepowered.include.com.google.gson.JsonParseException;

public final class ReferenceMapper implements Serializable, IReferenceMapper {
   public static final String DEFAULT_RESOURCE = "mixin.refmap.json";
   public static final ReferenceMapper DEFAULT_MAPPER = new ReferenceMapper(true, "invalid");
   private final Map<String, Map<String, String>> mappings = Maps.newTreeMap();
   private final Map<String, Map<String, Map<String, String>>> data = Maps.newTreeMap();
   private final transient boolean readOnly;
   private transient String context = null;
   private transient String resource;

   public ReferenceMapper() {
      this(false, "mixin.refmap.json");
   }

   private ReferenceMapper(boolean var1, String var2) {
      this.readOnly = var1;
      this.resource = var2;
   }

   @Override
   public boolean isDefault() {
      return this.readOnly;
   }

   private void setResourceName(String var1) {
      if (!this.readOnly) {
         this.resource = var1 != null ? var1 : "<unknown resource>";
      }
   }

   @Override
   public String getResourceName() {
      return this.resource;
   }

   @Override
   public String getStatus() {
      return this.isDefault() ? "No refMap loaded." : "Using refmap " + this.getResourceName();
   }

   @Override
   public String getContext() {
      return this.context;
   }

   @Override
   public void setContext(String var1) {
      this.context = var1;
   }

   @Override
   public String remap(String var1, String var2) {
      return this.remapWithContext(this.context, var1, var2);
   }

   @Override
   public String remapWithContext(String var1, String var2, String var3) {
      Map var4 = this.mappings;
      if (var1 != null) {
         var4 = this.data.get(var1);
         if (var4 == null) {
            var4 = this.mappings;
         }
      }

      return this.remap(var4, var2, var3);
   }

   private String remap(Map<String, Map<String, String>> var1, String var2, String var3) {
      if (var2 == null) {
         for (Map var5 : var1.values()) {
            if (var5.containsKey(var3)) {
               return (String)var5.get(var3);
            }
         }
      }

      Map var6 = (Map)var1.get(var2);
      if (var6 == null) {
         return var3;
      }

      String var7 = (String)var6.get(var3);
      return var7 != null ? var7 : var3;
   }

   public String addMapping(String var1, String var2, String var3, String var4) {
      if (!this.readOnly && var3 != null && var4 != null) {
         String var5 = var3.replaceAll("\\s", "");
         Map var6 = this.mappings;
         if (var1 != null) {
            var6 = this.data.get(var1);
            if (var6 == null) {
               var6 = Maps.newTreeMap();
               this.data.put(var1, var6);
            }
         }

         Map var7 = (Map)var6.get(var2);
         if (var7 == null) {
            var7 = new TreeMap();
            var6.put(var2, var7);
         }

         return var7.put(var5, var4);
      } else {
         return null;
      }
   }

   public void write(Appendable var1) {
      new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create().toJson(this, var1);
   }

   public static ReferenceMapper read(String var0) {
      InputStreamReader var1 = null;

      try {
         IMixinService var2 = MixinService.getService();
         InputStream var3 = var2.getResourceAsStream(var0);
         if (var3 != null) {
            var1 = new InputStreamReader(var3);
            ReferenceMapper var4 = readJson(var1);
            var4.setResourceName(var0);
            return var4;
         }
      } catch (JsonParseException var10) {
         MessageRouter.getMessager()
            .printMessage(Kind.ERROR, String.format("Invalid REFMAP JSON in %s: %s %s", var0, var10.getClass().getName(), var10.getMessage()));
      } catch (Exception var11) {
         MessageRouter.getMessager()
            .printMessage(Kind.ERROR, String.format("Failed reading REFMAP JSON from %s: %s %s", var0, var11.getClass().getName(), var11.getMessage()));
      } finally {
         Closeables.closeQuietly(var1);
      }

      return DEFAULT_MAPPER;
   }

   public static ReferenceMapper read(Reader var0, String var1) {
      try {
         ReferenceMapper var2 = readJson(var0);
         var2.setResourceName(var1);
         return var2;
      } catch (Exception var3) {
         return DEFAULT_MAPPER;
      }
   }

   private static ReferenceMapper readJson(Reader var0) {
      return new Gson().fromJson(var0, ReferenceMapper.class);
   }
}
