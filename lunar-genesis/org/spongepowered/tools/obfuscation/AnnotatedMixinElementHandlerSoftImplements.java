package org.spongepowered.tools.obfuscation;

import java.util.List;
import org.spongepowered.asm.mixin.Interface;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.MethodHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

class AnnotatedMixinElementHandlerSoftImplements extends AnnotatedMixinElementHandler {
   AnnotatedMixinElementHandlerSoftImplements(IMixinAnnotationProcessor var1, AnnotatedMixin var2) {
      super(var1, var2);
   }

   public void process(AnnotationHandle var1) {
      if (this.mixin.remap()) {
         List var2 = var1.getAnnotationList("value");
         if (var2.size() < 1) {
            this.ap.printMessage(IMessagerEx.MessageType.SOFT_IMPLEMENTS_EMPTY, "Empty @Implements annotation", this.mixin.getMixinElement(), var1.asMirror());
         } else {
            for (IAnnotationHandle var4 : var2) {
               Interface.Remap var5 = var4.getValue("remap", Interface.Remap.ALL);
               if (var5 != Interface.Remap.NONE) {
                  try {
                     TypeHandle var6 = this.ap.getTypeProvider().getTypeHandle(var4.getValue("iface"));
                     String var7 = var4.getValue("prefix");
                     this.processSoftImplements(var5, var6, var7);
                  } catch (Exception var8) {
                     this.ap
                        .printMessage(
                           IMessagerEx.MessageType.ERROR,
                           "Unexpected error: " + var8.getClass().getName() + ": " + var8.getMessage(),
                           this.mixin.getMixinElement(),
                           ((AnnotationHandle)var4).asMirror()
                        );
                  }
               }
            }
         }
      }
   }

   private void processSoftImplements(Interface.Remap var1, TypeHandle var2, String var3) {
      for (MethodHandle var5 : var2.getMethods()) {
         this.processMethod(var1, var2, var3, var5);
      }

      for (TypeHandle var7 : var2.getInterfaces()) {
         this.processSoftImplements(var1, var7, var3);
      }
   }

   private void processMethod(Interface.Remap var1, TypeHandle var2, String var3, MethodHandle var4) {
      String var5 = var4.getName();
      String var6 = var4.getJavaSignature();
      String var7 = var4.getDesc();
      if (var1 != Interface.Remap.ONLY_PREFIXED) {
         MethodHandle var8 = this.mixin.getHandle().findMethod(var5, var6);
         if (var8 != null) {
            this.addInterfaceMethodMapping(var1, var2, null, var8, var5, var7);
         }
      }

      if (var3 != null) {
         MethodHandle var9 = this.mixin.getHandle().findMethod(var3 + var5, var6);
         if (var9 != null) {
            this.addInterfaceMethodMapping(var1, var2, var3, var9, var5, var7);
         }
      }
   }

   private void addInterfaceMethodMapping(Interface.Remap var1, TypeHandle var2, String var3, MethodHandle var4, String var5, String var6) {
      MappingMethod var7 = new MappingMethod(var2.getName(), var5, var6);
      ObfuscationData var8 = this.obf.getDataProvider().getObfMethod(var7);
      if (var8.isEmpty()) {
         if (var1.forceRemap()) {
            this.ap
               .printMessage(IMessagerEx.MessageType.NO_OBFDATA_FOR_SOFT_IMPLEMENTS, "No obfuscation mapping for soft-implementing method", var4.getElement());
         }
      } else {
         this.addMethodMappings(var4.getName(), var6, this.applyPrefix(var8, var3));
      }
   }

   private ObfuscationData<MappingMethod> applyPrefix(ObfuscationData<MappingMethod> var1, String var2) {
      if (var2 == null) {
         return var1;
      }

      ObfuscationData var3 = new ObfuscationData();

      for (ObfuscationType var5 : var1) {
         MappingMethod var6 = (MappingMethod)var1.get(var5);
         var3.put(var5, var6.addPrefix(var2));
      }

      return var3;
   }
}
