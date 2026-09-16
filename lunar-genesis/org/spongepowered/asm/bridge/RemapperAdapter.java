package org.spongepowered.asm.bridge;

import org.objectweb.asm.commons.Remapper;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.extensibility.IRemapper;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.ObfuscationUtil;

public abstract class RemapperAdapter implements IRemapper, ObfuscationUtil.IClassRemapper {
   protected final ILogger logger = MixinService.getService().getLogger("mixin");
   protected final Remapper remapper;

   public RemapperAdapter(Remapper var1) {
      this.remapper = var1;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String mapMethodName(String var1, String var2, String var3) {
      this.logger.debug("{} is remapping method {}{} for {}", this, var2, var3, var1);
      String var4 = this.remapper.mapMethodName(var1, var2, var3);
      if (!var4.equals(var2)) {
         return var4;
      }

      String var5 = this.unmap(var1);
      String var6 = this.unmapDesc(var3);
      this.logger.debug("{} is remapping obfuscated method {}{} for {}", this, var2, var6, var5);
      return this.remapper.mapMethodName(var5, var2, var6);
   }

   @Override
   public String mapFieldName(String var1, String var2, String var3) {
      this.logger.debug("{} is remapping field {}{} for {}", this, var2, var3, var1);
      String var4 = this.remapper.mapFieldName(var1, var2, var3);
      if (!var4.equals(var2)) {
         return var4;
      }

      String var5 = this.unmap(var1);
      String var6 = this.unmapDesc(var3);
      this.logger.debug("{} is remapping obfuscated field {}{} for {}", this, var2, var6, var5);
      return this.remapper.mapFieldName(var5, var2, var6);
   }

   @Override
   public String map(String var1) {
      this.logger.debug("{} is remapping class {}", this, var1);
      return this.remapper.map(var1);
   }

   @Override
   public String unmap(String var1) {
      return var1;
   }

   @Override
   public String mapDesc(String var1) {
      return this.remapper.mapDesc(var1);
   }

   @Override
   public String unmapDesc(String var1) {
      String var2 = ObfuscationUtil.unmapDescriptor(var1, this);
      return var2 != null ? var2 : var1;
   }
}
