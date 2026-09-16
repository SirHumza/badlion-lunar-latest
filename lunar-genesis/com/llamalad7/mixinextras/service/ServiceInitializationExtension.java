package com.llamalad7.mixinextras.service;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;

class ServiceInitializationExtension implements IExtension {
   private final MixinExtrasService service;
   private boolean initialized;

   public ServiceInitializationExtension(MixinExtrasService var1) {
      this.service = var1;
   }

   @Override
   public boolean checkActive(MixinEnvironment var1) {
      return true;
   }

   @Override
   public void preApply(ITargetClassContext var1) {
      if (!this.initialized) {
         this.service.initialize();
         this.initialized = true;
      }
   }

   @Override
   public void postApply(ITargetClassContext var1) {
   }

   @Override
   public void export(MixinEnvironment var1, String var2, boolean var3, ClassNode var4) {
   }
}
