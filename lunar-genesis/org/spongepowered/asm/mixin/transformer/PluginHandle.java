package org.spongepowered.asm.mixin.transformer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.throwables.CompanionPluginError;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.include.com.google.common.base.Strings;

class PluginHandle {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final MixinConfig parent;
   private final IMixinConfigPlugin plugin;
   private boolean hasFailedLegacyApply = false;
   private final Method mdPreApply;
   private final Method mdPostApply;

   PluginHandle(MixinConfig var1, IMixinService var2, String var3) {
      IMixinConfigPlugin var4 = null;
      Method var5 = null;
      Method var6 = null;
      if (!Strings.isNullOrEmpty(var3)) {
         try {
            Class var7 = var2.getClassProvider().findClass(var3, true);
            var4 = (IMixinConfigPlugin)var7.getDeclaredConstructor().newInstance();
            var5 = findLegacyApply(var7, "preApply");
            var6 = findLegacyApply(var7, "postApply");
         } catch (Throwable var8) {
            logger.error(
               "Error loading companion plugin class [{}] for mixin config [{}]. The plugin may be out of date: {}:{}",
               var3,
               var1,
               var8.getClass().getSimpleName(),
               var8.getMessage(),
               var8
            );
            var4 = null;
            var5 = null;
            var6 = null;
         }
      }

      this.parent = var1;
      this.plugin = var4;
      this.mdPreApply = var5;
      this.mdPostApply = var6;
   }

   private static Method findLegacyApply(Class<?> var0, String var1) {
      Method var2 = null;

      try {
         Method var3 = var0.getMethod(var1, String.class, ClassNode.class, String.class, IMixinInfo.class);
         if (var3.getDeclaringClass() == IMixinConfigPlugin.class) {
            try {
               var2 = var0.getMethod(var1, String.class, org.spongepowered.asm.lib.tree.ClassNode.class, String.class, IMixinInfo.class);
            } catch (NoSuchMethodException var5) {
            }
         }

         return var2;
      } catch (Exception var6) {
         throw new CompanionPluginError("Encountered an unexpected error when trying to resolve method " + var1 + "or its legacy fallback.", var6);
      }
   }

   IMixinConfigPlugin get() {
      return this.plugin;
   }

   boolean isAvailable() {
      return this.plugin != null;
   }

   void onLoad(String var1) {
      if (this.plugin != null) {
         this.plugin.onLoad(var1);
      }
   }

   String getRefMapperConfig() {
      return this.plugin != null ? this.plugin.getRefMapperConfig() : null;
   }

   List<String> getMixins() {
      return this.plugin != null ? this.plugin.getMixins() : null;
   }

   boolean shouldApplyMixin(String var1, String var2) {
      return this.plugin == null || this.plugin.shouldApplyMixin(var1, var2);
   }

   public void preApply(String var1, ClassNode var2, String var3, MixinInfo var4) {
      if (this.plugin != null) {
         if (this.hasFailedLegacyApply) {
            throw new IllegalStateException("Companion plugin failure for [" + this.parent + "] plugin [" + this.plugin.getClass() + "]");
         }

         if (this.mdPreApply != null) {
            try {
               this.applyLegacy(this.mdPreApply, var1, var2, var3, var4);
            } catch (Exception var6) {
               this.hasFailedLegacyApply = true;
               throw var6;
            }
         } else {
            this.plugin.preApply(var1, var2, var3, var4);
         }
      }
   }

   public void postApply(String var1, ClassNode var2, String var3, MixinInfo var4) {
      if (this.plugin != null) {
         if (this.hasFailedLegacyApply) {
            throw new IllegalStateException("Companion plugin failure for [" + this.parent + "] plugin [" + this.plugin.getClass() + "]");
         }

         if (this.mdPostApply != null) {
            try {
               this.applyLegacy(this.mdPostApply, var1, var2, var3, var4);
            } catch (Exception var6) {
               this.hasFailedLegacyApply = true;
               throw var6;
            }
         } else {
            this.plugin.postApply(var1, var2, var3, var4);
         }
      }
   }

   private void applyLegacy(Method var1, String var2, ClassNode var3, String var4, IMixinInfo var5) {
      try {
         var1.invoke(this.plugin, var2, new org.spongepowered.asm.lib.tree.ClassNode(var3), var4, var5);
      } catch (LinkageError var8) {
         throw new CompanionPluginError(this.apiError("Accessing [" + var8.getMessage() + "]"), var8);
      } catch (IllegalAccessException var9) {
         throw new CompanionPluginError(this.apiError("Fallback failed [" + var9.getMessage() + "]"), var9);
      } catch (IllegalArgumentException var10) {
         throw new CompanionPluginError(this.apiError("Fallback failed [" + var10.getMessage() + "]"), var10);
      } catch (InvocationTargetException var11) {
         Throwable var7 = var11.getCause() != null ? var11.getCause() : var11;
         throw new CompanionPluginError(this.apiError("Fallback failed [" + var7.getMessage() + "]"), var7);
      }
   }

   private String apiError(String var1) {
      return String.format("Companion plugin attempted to use a deprected API in [%s] plugin [%s]: %s", this.parent, this.plugin.getClass().getName(), var1);
   }
}
