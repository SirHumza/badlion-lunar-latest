package com.llamalad7.mixinextras.service;

import com.llamalad7.mixinextras.utils.Blackboard;
import com.llamalad7.mixinextras.utils.ProxyUtils;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;

public interface MixinExtrasService {
   int getVersion();

   boolean shouldReplace(Object var1);

   void takeControlFrom(Object var1);

   void concedeTo(Object var1, boolean var2);

   void offerPackage(int var1, String var2);

   void offerExtension(int var1, IExtension var2);

   void offerInjector(int var1, Class<? extends InjectionInfo> var2);

   void offerInjectionPoint(int var1, Class<? extends InjectionPoint> var2);

   void initialize();

   static void setup() {
      Object var0 = Blackboard.get("MixinExtrasServiceInstance");
      if (var0 == null) {
         MixinExtrasServiceImpl var2 = new MixinExtrasServiceImpl();
         Blackboard.put("MixinExtrasServiceInstance", var2);
         var2.takeControlFrom(null);
      } else {
         MixinExtrasServiceImpl var1 = new MixinExtrasServiceImpl();
         if (var1.shouldReplace(var0)) {
            getFrom(var0).concedeTo(var1, true);
            Blackboard.put("MixinExtrasServiceInstance", var1);
            var1.takeControlFrom(var0);
         } else {
            var1.concedeTo(var0, false);
         }
      }
   }

   static MixinExtrasService getFrom(Object var0) {
      return ProxyUtils.getProxy(var0, MixinExtrasService.class);
   }

   static MixinExtrasServiceImpl getInstance() {
      Object var0 = Blackboard.get("MixinExtrasServiceInstance");
      if (var0 instanceof MixinExtrasServiceImpl) {
         MixinExtrasServiceImpl var1 = (MixinExtrasServiceImpl)var0;
         if (var1.initialized) {
            return var1;
         } else {
            throw new IllegalStateException("Cannot use service because it is not initialized!");
         }
      } else {
         throw new IllegalStateException("Cannot use service because another service is active: " + var0);
      }
   }
}
