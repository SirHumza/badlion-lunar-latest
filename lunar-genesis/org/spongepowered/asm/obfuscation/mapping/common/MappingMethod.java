package org.spongepowered.asm.obfuscation.mapping.common;

import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.include.com.google.common.base.Objects;

public class MappingMethod implements IMapping<MappingMethod> {
   private final String owner;
   private final String name;
   private final String desc;

   public MappingMethod(String var1, String var2) {
      this(getOwnerFromName(var1), getBaseName(var1), var2);
   }

   public MappingMethod(String var1, String var2, String var3) {
      this.owner = var1;
      this.name = var2;
      this.desc = var3;
   }

   @Override
   public IMapping.Type getType() {
      return IMapping.Type.METHOD;
   }

   @Override
   public String getName() {
      return this.name == null ? null : (this.owner != null ? this.owner + "/" : "") + this.name;
   }

   @Override
   public String getSimpleName() {
      return this.name;
   }

   @Override
   public String getOwner() {
      return this.owner;
   }

   @Override
   public String getDesc() {
      return this.desc;
   }

   public MappingMethod getSuper() {
      return null;
   }

   public boolean isConstructor() {
      return "<init>".equals(this.name);
   }

   public MappingMethod move(String var1) {
      return new MappingMethod(var1, this.getSimpleName(), this.getDesc());
   }

   public MappingMethod remap(String var1) {
      return new MappingMethod(this.getOwner(), var1, this.getDesc());
   }

   public MappingMethod transform(String var1) {
      return new MappingMethod(this.getOwner(), this.getSimpleName(), var1);
   }

   public MappingMethod copy() {
      return new MappingMethod(this.getOwner(), this.getSimpleName(), this.getDesc());
   }

   public MappingMethod addPrefix(String var1) {
      String var2 = this.getSimpleName();
      return var2 != null && !var2.startsWith(var1) ? new MappingMethod(this.getOwner(), var1 + var2, this.getDesc()) : this;
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.getName(), this.desc);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof MappingMethod)
            ? false
            : Objects.equal(this.name, ((MappingMethod)var1).name) && Objects.equal(this.desc, ((MappingMethod)var1).desc);
      }
   }

   @Override
   public String serialise() {
      return this.toString();
   }

   @Override
   public String toString() {
      String var1 = this.desc;
      return String.format("%s%s%s", this.getName(), var1 != null ? " " : "", var1 != null ? var1 : "");
   }

   private static String getBaseName(String var0) {
      if (var0 == null) {
         return null;
      }

      int var1 = var0.lastIndexOf(47);
      return var1 > -1 ? var0.substring(var1 + 1) : var0;
   }

   private static String getOwnerFromName(String var0) {
      if (var0 == null) {
         return null;
      }

      int var1 = var0.lastIndexOf(47);
      return var1 > -1 ? var0.substring(0, var1) : null;
   }
}
