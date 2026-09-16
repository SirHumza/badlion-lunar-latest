package org.spongepowered.asm.mixin.struct;

import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.throwables.MixinTransformerError;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Handles;

public abstract class MemberRef {
   public abstract boolean isField();

   public abstract int getOpcode();

   public abstract void setOpcode(int var1);

   public abstract String getOwner();

   public abstract void setOwner(String var1);

   public abstract String getName();

   public abstract void setName(String var1);

   public abstract String getDesc();

   public abstract void setDesc(String var1);

   public boolean ownerIsMixin() {
      String var1 = this.getOwner();
      return !var1.startsWith("[") && ClassInfo.isMixin(var1);
   }

   @Override
   public String toString() {
      return String.format(
         "%s for %s.%s%s%s", Bytecode.getOpcodeName(this.getOpcode()), this.getOwner(), this.getName(), this.isField() ? ":" : "", this.getDesc()
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof MemberRef)) {
         return false;
      }

      MemberRef var2 = (MemberRef)var1;
      return this.getOpcode() == var2.getOpcode()
         && this.getOwner().equals(var2.getOwner())
         && this.getName().equals(var2.getName())
         && this.getDesc().equals(var2.getDesc());
   }

   @Override
   public int hashCode() {
      return this.toString().hashCode();
   }

   public static final class Field extends MemberRef {
      public final FieldInsnNode insn;

      public Field(FieldInsnNode var1) {
         this.insn = var1;
      }

      @Override
      public boolean isField() {
         return true;
      }

      @Override
      public int getOpcode() {
         return this.insn.getOpcode();
      }

      @Override
      public void setOpcode(int var1) {
         if ((var1 & 183) == 0) {
            throw new IllegalArgumentException("Invalid opcode for field instruction: 0x" + Integer.toHexString(var1));
         }

         this.insn.setOpcode(var1);
      }

      @Override
      public String getOwner() {
         return this.insn.owner;
      }

      @Override
      public void setOwner(String var1) {
         this.insn.owner = var1;
      }

      @Override
      public String getName() {
         return this.insn.name;
      }

      @Override
      public void setName(String var1) {
         this.insn.name = var1;
      }

      @Override
      public String getDesc() {
         return this.insn.desc;
      }

      @Override
      public void setDesc(String var1) {
         this.insn.desc = var1;
      }
   }

   public static final class Handle extends MemberRef {
      private org.objectweb.asm.Handle handle;

      public Handle(org.objectweb.asm.Handle var1) {
         this.handle = var1;
      }

      public org.objectweb.asm.Handle getMethodHandle() {
         return this.handle;
      }

      @Override
      public boolean isField() {
         return Handles.isField(this.handle);
      }

      @Override
      public int getOpcode() {
         int var1 = Handles.opcodeFromTag(this.handle.getTag());
         if (var1 == 0) {
            throw new MixinTransformerError("Invalid tag " + this.handle.getTag() + " for method handle " + this.handle + ".");
         } else {
            return var1;
         }
      }

      @Override
      public void setOpcode(int var1) {
         int var2 = Handles.tagFromOpcode(var1);
         if (var2 == 0) {
            throw new MixinTransformerError("Invalid opcode " + Bytecode.getOpcodeName(var1) + " for method handle " + this.handle + ".");
         }

         this.setHandle(var2, this.handle.getOwner(), this.handle.getName(), this.handle.getDesc(), this.handle.isInterface());
      }

      @Override
      public String getOwner() {
         return this.handle.getOwner();
      }

      @Override
      public void setOwner(String var1) {
         this.setHandle(this.handle.getTag(), var1, this.handle.getName(), this.handle.getDesc(), this.handle.isInterface());
      }

      @Override
      public String getName() {
         return this.handle.getName();
      }

      @Override
      public void setName(String var1) {
         this.setHandle(this.handle.getTag(), this.handle.getOwner(), var1, this.handle.getDesc(), this.handle.isInterface());
      }

      @Override
      public String getDesc() {
         return this.handle.getDesc();
      }

      @Override
      public void setDesc(String var1) {
         this.setHandle(this.handle.getTag(), this.handle.getOwner(), this.handle.getName(), var1, this.handle.isInterface());
      }

      public void setHandle(int var1, String var2, String var3, String var4, boolean var5) {
         this.handle = new org.objectweb.asm.Handle(var1, var2, var3, var4, var5);
      }
   }

   public static final class Method extends MemberRef {
      public final MethodInsnNode insn;

      public Method(MethodInsnNode var1) {
         this.insn = var1;
      }

      @Override
      public boolean isField() {
         return false;
      }

      @Override
      public int getOpcode() {
         return this.insn.getOpcode();
      }

      @Override
      public void setOpcode(int var1) {
         if ((var1 & 191) == 0) {
            throw new IllegalArgumentException("Invalid opcode for method instruction: 0x" + Integer.toHexString(var1));
         }

         this.insn.setOpcode(var1);
      }

      @Override
      public String getOwner() {
         return this.insn.owner;
      }

      @Override
      public void setOwner(String var1) {
         this.insn.owner = var1;
      }

      @Override
      public String getName() {
         return this.insn.name;
      }

      @Override
      public void setName(String var1) {
         this.insn.name = var1;
      }

      @Override
      public String getDesc() {
         return this.insn.desc;
      }

      @Override
      public void setDesc(String var1) {
         this.insn.desc = var1;
      }
   }
}
