package org.spongepowered.asm.mixin.injection.modify;

import java.util.Collection;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.FabricUtil;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.struct.Target;

@InjectionPoint.AtCode("LOAD")
public class BeforeLoadLocal extends ModifyVariableInjector.LocalVariableInjectionPoint {
   protected final Type returnType;
   protected final LocalVariableDiscriminator discriminator;
   protected final int opcode;
   protected final int ordinal;
   private boolean opcodeAfter;

   protected BeforeLoadLocal(InjectionPointData var1) {
      this(var1, 21, false);
   }

   protected BeforeLoadLocal(InjectionPointData var1, int var2, boolean var3) {
      super(var1);
      this.returnType = var1.getMethodReturnType();
      this.discriminator = var1.getLocalVariableDiscriminator();
      this.opcode = var1.getOpcode(this.returnType.getOpcode(var2));
      this.ordinal = var1.getOrdinal();
      this.opcodeAfter = var3;
   }

   @Override
   boolean find(InjectionInfo var1, InsnList var2, Collection<AbstractInsnNode> var3, Target var4) {
      BeforeLoadLocal.SearchState var5 = new BeforeLoadLocal.SearchState();

      for (AbstractInsnNode var7 : FabricUtil.getCompatibility(var1) >= 10000 ? var2 : var4.method.instructions) {
         if (var5.isPendingCheck()) {
            var5.check(var1, var4, var3, var7);
         } else if (var7 instanceof VarInsnNode && var7.getOpcode() == this.opcode && (this.ordinal == -1 || !var5.success())) {
            var5.register((VarInsnNode)var7);
            if (this.opcodeAfter) {
               var5.setPendingCheck();
            } else {
               var5.check(var1, var4, var3, var7);
            }
         }
      }

      return var5.success();
   }

   @Override
   protected void addMessage(String var1, Object... var2) {
      super.addMessage(var1, var2);
   }

   @Override
   public String toString() {
      return String.format("@At(\"%s\" %s)", this.getAtCode(), this.discriminator.toString());
   }

   public String toString(LocalVariableDiscriminator.Context var1) {
      return String.format("@At(\"%s\" %s)", this.getAtCode(), this.discriminator.toString(var1));
   }

   class SearchState {
      private final boolean print;
      private int currentOrdinal = 0;
      private boolean pendingCheck = false;
      private boolean found = false;
      private VarInsnNode varNode;

      SearchState() {
         this.print = BeforeLoadLocal.this.discriminator.printLVT();
      }

      boolean success() {
         return this.found;
      }

      boolean isPendingCheck() {
         return this.pendingCheck;
      }

      void setPendingCheck() {
         this.pendingCheck = true;
      }

      void register(VarInsnNode var1) {
         this.varNode = var1;
      }

      void check(InjectionInfo var1, Target var2, Collection<AbstractInsnNode> var3, AbstractInsnNode var4) {
         LocalVariableDiscriminator.Context var5 = new LocalVariableDiscriminator.Context(
            var1, BeforeLoadLocal.this.returnType, BeforeLoadLocal.this.discriminator.isArgsOnly(), var2, var4
         );
         int var6 = -2;

         try {
            var6 = BeforeLoadLocal.this.discriminator.findLocal(var5);
         } catch (InvalidImplicitDiscriminatorException var8) {
            BeforeLoadLocal.this.addMessage(
               "%s has invalid IMPLICIT discriminator for opcode %d in %s: %s",
               BeforeLoadLocal.this.toString(var5),
               var2.indexOf(var4),
               var2,
               var8.getMessage()
            );
         }

         this.pendingCheck = false;
         if (var6 == this.varNode.var || var6 <= -2 && this.print) {
            if (BeforeLoadLocal.this.ordinal == -1 || BeforeLoadLocal.this.ordinal == this.currentOrdinal) {
               var3.add(var4);
               this.found = true;
            }

            this.currentOrdinal++;
            this.varNode = null;
         } else {
            this.varNode = null;
         }
      }
   }
}
