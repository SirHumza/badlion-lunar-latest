package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.util.Bytecode;

@InjectionPoint.AtCode("FIELD")
public class BeforeFieldAccess extends BeforeInvoke {
   public static final int ARRAY_SEARCH_FUZZ_DEFAULT = 8;
   private final int opcode;
   private final int arrOpcode;
   private final int fuzzFactor;

   public BeforeFieldAccess(InjectionPointData var1) {
      super(var1);
      this.opcode = var1.getOpcode(-1, 180, 181, 178, 179, -1);
      String var2 = var1.get("array", "");
      this.arrOpcode = "get".equalsIgnoreCase(var2) ? 46 : ("set".equalsIgnoreCase(var2) ? 79 : ("length".equalsIgnoreCase(var2) ? 190 : 0));
      this.fuzzFactor = Math.min(Math.max(var1.get("fuzz", 8), 1), 32);
   }

   public int getFuzzFactor() {
      return this.fuzzFactor;
   }

   public int getArrayOpcode() {
      return this.arrOpcode;
   }

   private int getArrayOpcode(String var1) {
      return this.arrOpcode != 190 ? Type.getType(var1).getElementType().getOpcode(this.arrOpcode) : this.arrOpcode;
   }

   @Override
   protected boolean matchesInsn(AbstractInsnNode var1) {
      if (var1 instanceof FieldInsnNode && (((FieldInsnNode)var1).getOpcode() == this.opcode || this.opcode == -1)) {
         if (this.arrOpcode == 0) {
            return true;
         } else {
            return var1.getOpcode() != 178 && var1.getOpcode() != 180 ? false : Type.getType(((FieldInsnNode)var1).desc).getSort() == 9;
         }
      } else {
         return false;
      }
   }

   @Override
   protected boolean addInsn(InsnList var1, Collection<AbstractInsnNode> var2, AbstractInsnNode var3) {
      if (this.arrOpcode > 0) {
         FieldInsnNode var4 = (FieldInsnNode)var3;
         int var5 = this.getArrayOpcode(var4.desc);
         this.log("{} > > > > searching for array access opcode {} fuzz={}", this.className, Bytecode.getOpcodeName(var5), this.fuzzFactor);
         if (findArrayNode(var1, var4, var5, this.fuzzFactor) == null) {
            this.log("{} > > > > > failed to locate matching insn", this.className);
            return false;
         }
      }

      this.log("{} > > > > > adding matching insn", this.className);
      return super.addInsn(var1, var2, var3);
   }

   public static AbstractInsnNode findArrayNode(InsnList var0, FieldInsnNode var1, int var2, int var3) {
      int var4 = 0;

      for (AbstractInsnNode var6 : var0) {
         if (var6.getOpcode() == var2) {
            return var6;
         }

         if (var6.getOpcode() == 190 && var4 == 0) {
            return null;
         }

         if (var6 instanceof FieldInsnNode) {
            FieldInsnNode var7 = (FieldInsnNode)var6;
            if (var7.desc.equals(var1.desc) && var7.name.equals(var1.name) && var7.owner.equals(var1.owner)) {
               return null;
            }
         }

         if (var4++ > var3) {
            return null;
         }
      }

      return null;
   }
}
