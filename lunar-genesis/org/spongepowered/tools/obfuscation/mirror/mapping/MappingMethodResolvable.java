package org.spongepowered.tools.obfuscation.mirror.mapping;

import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeUtils;

public final class MappingMethodResolvable extends MappingMethod {
   private final TypeHandle ownerHandle;

   public MappingMethodResolvable(TypeHandle var1, String var2, String var3) {
      super(var1.getName(), var2, var3);
      this.ownerHandle = var1;
   }

   @Override
   public MappingMethod getSuper() {
      if (this.ownerHandle == null) {
         return super.getSuper();
      }

      String var1 = this.getSimpleName();
      String var2 = this.getDesc();
      String var3 = TypeUtils.getJavaSignature(var2);
      TypeHandle var4 = this.ownerHandle.getSuperclass();
      if (var4 != null && var4.findMethod(var1, var3) != null) {
         return var4.getMappingMethod(var1, var2);
      }

      for (TypeHandle var6 : this.ownerHandle.getInterfaces()) {
         if (var6.findMethod(var1, var3) != null) {
            return var6.getMappingMethod(var1, var2);
         }
      }

      return var4 != null ? var4.getMappingMethod(var1, var2).getSuper() : super.getSuper();
   }

   public MappingMethod move(TypeHandle var1) {
      return new MappingMethodResolvable(var1, this.getSimpleName(), this.getDesc());
   }

   @Override
   public MappingMethod remap(String var1) {
      return new MappingMethodResolvable(this.ownerHandle, var1, this.getDesc());
   }

   @Override
   public MappingMethod transform(String var1) {
      return new MappingMethodResolvable(this.ownerHandle, this.getSimpleName(), var1);
   }

   @Override
   public MappingMethod copy() {
      return new MappingMethodResolvable(this.ownerHandle, this.getSimpleName(), this.getDesc());
   }
}
