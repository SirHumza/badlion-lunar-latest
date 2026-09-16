package org.spongepowered.asm.mixin.transformer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.FabricUtil;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Counter;
import org.spongepowered.asm.util.asm.MethodNodeEx;
import org.spongepowered.include.com.google.common.base.Strings;
import org.spongepowered.include.com.google.common.primitives.Chars;

class MethodMapper {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private static final List<String> classes = new ArrayList<>();
   private static final Map<String, Counter> methods = new HashMap<>();
   private final ClassInfo info;
   private int nextUniqueMethodIndex;
   private int nextUniqueFieldIndex;

   public MethodMapper(MixinEnvironment var1, ClassInfo var2) {
      this.info = var2;
   }

   public void reset() {
      this.nextUniqueMethodIndex = 0;
      this.nextUniqueFieldIndex = 0;
   }

   public void remapHandlerMethod(MixinInfo var1, MethodNode var2, ClassInfo.Method var3) {
      if (var2 instanceof MixinInfo.MixinMethodNode && ((MixinInfo.MixinMethodNode)var2).isInjector()) {
         if (var3.isUnique()) {
            logger.warn("Redundant @Unique on injector method {} in {}. Injectors are implicitly unique", var3, var1);
         }

         if (var3.isRenamed()) {
            var2.name = var3.getName();
         } else {
            String var4 = this.getHandlerName(var1, (MixinInfo.MixinMethodNode)var2);
            var2.name = var3.conform(var4);
         }
      }
   }

   public String getHandlerName(MixinInfo var1, MixinInfo.MixinMethodNode var2) {
      String var3 = InjectionInfo.getInjectorPrefix(var2.getInjectorAnnotation());
      String var4 = getClassUID(var2.getOwner().getClassRef());
      String var5 = getMixinSourceId(var1, "");
      String var6 = var2.name;
      if (!var5.isEmpty()) {
         if (var6.startsWith(var5) && var6.length() > var5.length() + 1 && Chars.contains(new char[]{'_', '$'}, var6.charAt(var5.length()))) {
            var6 = var6.substring(var5.length() + 1);
         }

         var5 = var5 + '$';
      }

      String var7 = getMethodUID(var6, var2.desc, !var2.isSurrogate());
      return String.format("%s$%s%s$%s%s", var3, var4, var7, var5, var6);
   }

   public String getUniqueName(MixinInfo var1, MethodNode var2, String var3, boolean var4) {
      String var5 = Integer.toHexString(this.nextUniqueMethodIndex++);
      String var6 = var2.name;
      if (var2 instanceof MethodNodeEx) {
         String var7 = getMixinSourceId(var1, "");
         if (!var7.isEmpty()) {
            if (var6.startsWith(var7) && var6.length() > var7.length() + 1 && Chars.contains(new char[]{'_', '$'}, var6.charAt(var7.length()))) {
               var6 = var6.substring(var7.length() + 1);
            }

            if (var4) {
               var6 = var6 + '$' + var7;
            } else {
               var6 = var7 + '$' + var6;
            }
         }
      }

      String var8 = var4 ? "%2$s_$md$%1$s$%3$s" : "md%s$%s$%s";
      return String.format(var8, var3.substring(30), var6, var5);
   }

   public String getUniqueName(MixinInfo var1, FieldNode var2, String var3) {
      String var4 = Integer.toHexString(this.nextUniqueFieldIndex++);
      return String.format("fd%s$%s%s$%s", var3.substring(30), getMixinSourceId(var1, "$"), var2.name, var4);
   }

   private static String getMixinSourceId(MixinInfo var0, String var1) {
      String var2 = var0.getConfig().getCleanSourceId();
      if (var2 == null) {
         String var3 = FabricUtil.getModId(var0.getConfig(), null);
         return var3 == null ? "" : var3 + var1;
      }

      if (var2.length() > 12) {
         var2 = var2.substring(0, 12);
      }

      return String.format("%s%s", var2, var1);
   }

   private static String getClassUID(String var0) {
      int var1 = classes.indexOf(var0);
      if (var1 < 0) {
         var1 = classes.size();
         classes.add(var0);
      }

      return finagle(var1);
   }

   private static String getMethodUID(String var0, String var1, boolean var2) {
      String var3 = String.format("%s%s", var0, var1);
      Counter var4 = methods.get(var3);
      if (var4 == null) {
         var4 = new Counter();
         methods.put(var3, var4);
      } else if (var2) {
         var4.value++;
      }

      return String.format("%03x", var4.value);
   }

   private static String finagle(int var0) {
      String var1 = Integer.toHexString(var0);
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         char var5;
         var2.append(var5 = (char)(var4 + (var4 < ':' ? 49 : 10)));
      }

      return Strings.padStart(var2.toString(), 3, 'z');
   }
}
