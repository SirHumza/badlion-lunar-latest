package org.spongepowered.asm.util.asm;

import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public class MethodNodeEx extends MethodNode {
   private final IMixinInfo owner;
   private final String originalName;

   public MethodNodeEx(int var1, String var2, String var3, String var4, String[] var5, IMixinInfo var6) {
      super(ASM.API_VERSION, var1, var2, var3, var4, var5);
      this.originalName = var2;
      this.owner = var6;
   }

   @Override
   public String toString() {
      return String.format("%s%s", this.originalName, this.desc);
   }

   public String getQualifiedName() {
      return String.format("%s::%s", this.owner.getName(), this.originalName);
   }

   public String getOriginalName() {
      return this.originalName;
   }

   public IMixinInfo getOwner() {
      return this.owner;
   }

   public static String getName(MethodNode var0) {
      return var0 instanceof MethodNodeEx ? ((MethodNodeEx)var0).getOriginalName() : var0.name;
   }
}
