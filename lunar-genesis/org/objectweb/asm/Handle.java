package org.objectweb.asm;

public final class Handle {
   private final int tag;
   private final String owner;
   private final String name;
   private final String descriptor;
   private final boolean isInterface;

   @Deprecated
   public Handle(int var1, String var2, String var3, String var4) {
      this(var1, var2, var3, var4, var1 == 9);
   }

   public Handle(int var1, String var2, String var3, String var4, boolean var5) {
      this.tag = var1;
      this.owner = var2;
      this.name = var3;
      this.descriptor = var4;
      this.isInterface = var5;
   }

   public int getTag() {
      return this.tag;
   }

   public String getOwner() {
      return this.owner;
   }

   public String getName() {
      return this.name;
   }

   public String getDesc() {
      return this.descriptor;
   }

   public boolean isInterface() {
      return this.isInterface;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Handle)) {
         return false;
      }

      Handle var2 = (Handle)var1;
      return this.tag == var2.tag
         && this.isInterface == var2.isInterface
         && this.owner.equals(var2.owner)
         && this.name.equals(var2.name)
         && this.descriptor.equals(var2.descriptor);
   }

   @Override
   public int hashCode() {
      return this.tag + (this.isInterface ? 64 : 0) + this.owner.hashCode() * this.name.hashCode() * this.descriptor.hashCode();
   }

   @Override
   public String toString() {
      return stringConcat$0(this.owner, this.name, this.descriptor, this.tag, this.isInterface ? " itf" : "");
   }
}
