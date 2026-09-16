package org.spongepowered.asm.obfuscation.mapping.common;

import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.include.com.google.common.base.Objects;
import org.spongepowered.include.com.google.common.base.Strings;

public class MappingField implements IMapping<MappingField> {
   private final String owner;
   private final String name;
   private final String desc;

   public MappingField(String var1, String var2) {
      this(var1, var2, null);
   }

   public MappingField(String var1, String var2, String var3) {
      this.owner = var1;
      this.name = var2;
      this.desc = var3;
   }

   @Override
   public IMapping.Type getType() {
      return IMapping.Type.FIELD;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public final String getSimpleName() {
      return this.name;
   }

   @Override
   public final String getOwner() {
      return this.owner;
   }

   @Override
   public final String getDesc() {
      return this.desc;
   }

   public MappingField getSuper() {
      return null;
   }

   public MappingField move(String var1) {
      return new MappingField(var1, this.getName(), this.getDesc());
   }

   public MappingField remap(String var1) {
      return new MappingField(this.getOwner(), var1, this.getDesc());
   }

   public MappingField transform(String var1) {
      return new MappingField(this.getOwner(), this.getName(), var1);
   }

   public MappingField copy() {
      return new MappingField(this.getOwner(), this.getName(), this.getDesc());
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.toString());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof MappingField ? Objects.equal(this.toString(), ((MappingField)var1).toString()) : false;
      }
   }

   @Override
   public String serialise() {
      return this.toString();
   }

   @Override
   public String toString() {
      return String.format("L%s;%s:%s", this.getOwner(), this.getName(), Strings.nullToEmpty(this.getDesc()));
   }
}
