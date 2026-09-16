package org.spongepowered.asm.mixin.transformer.struct;

import java.util.Deque;
import java.util.Locale;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.struct.Constructor;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Bytecode;

public class Initialiser {
   static final ILogger logger = MixinService.getService().getLogger("mixin");
   protected static final int[] OPCODE_BLACKLIST = new int[]{177, 21, 22, 23, 24, 54, 55, 56, 57, 58};
   private final MixinTargetContext mixin;
   private final MethodNode ctor;
   private Deque<AbstractInsnNode> insns;

   public Initialiser(MixinTargetContext var1, MethodNode var2, InsnRange var3) {
      this.mixin = var1;
      this.ctor = var2;
      this.initInstructions(var3);
   }

   private void initInstructions(InsnRange var1) {
      this.insns = var1.apply(this.ctor.instructions, false);

      for (AbstractInsnNode var3 : this.insns) {
         int var4 = var3.getOpcode();

         for (int var8 : OPCODE_BLACKLIST) {
            if (var4 == var8) {
               throw new InvalidMixinException(
                  this.mixin,
                  "Cannot handle "
                     + Bytecode.getOpcodeName(var4)
                     + " opcode (0x"
                     + Integer.toHexString(var4).toUpperCase(Locale.ROOT)
                     + ") in class initialiser"
               );
            }
         }
      }

      AbstractInsnNode var9 = this.insns.peekLast();
      if (var9 != null && var9.getOpcode() != 181) {
         throw new InvalidMixinException(
            this.mixin, "Could not parse initialiser, expected 0xB5, found 0x" + Integer.toHexString(var9.getOpcode()) + " in " + this
         );
      }
   }

   public int size() {
      return this.insns.size();
   }

   public int getMaxStack() {
      return this.ctor.maxStack;
   }

   public MethodNode getCtor() {
      return this.ctor;
   }

   public Deque<AbstractInsnNode> getInsns() {
      return this.insns;
   }

   public void injectInto(Constructor var1) {
      AbstractInsnNode var2 = var1.findInitialiserInjectionPoint(Initialiser.InjectionMode.ofEnvironment(this.mixin.getEnvironment()));
      if (var2 == null) {
         logger.warn("Failed to locate initialiser injection point in <init>{}, initialiser was not mixed in.", var1.getDesc());
      } else {
         Map var3 = Bytecode.cloneLabels(var1.insns);

         for (AbstractInsnNode var5 : this.insns) {
            if (var5 instanceof LabelNode) {
               var3.put((LabelNode)var5, new LabelNode());
            }
         }

         for (AbstractInsnNode var7 : this.insns) {
            if (var7 instanceof LabelNode) {
            }

            if (var7 instanceof JumpInsnNode) {
            }

            var1.insertBefore(var2, var7.clone(var3));
         }
      }
   }

   public enum InjectionMode {
      DEFAULT,
      SAFE;

      public static Initialiser.InjectionMode ofEnvironment(MixinEnvironment var0) {
         String var1 = var0.getOptionValue(MixinEnvironment.Option.INITIALISER_INJECTION_MODE);
         if (var1 == null) {
            return DEFAULT;
         }

         try {
            return valueOf(var1.toUpperCase(Locale.ROOT));
         } catch (Exception var3) {
            Initialiser.logger.warn("Could not parse unexpected value \"{}\" for mixin.initialiserInjectionMode, reverting to DEFAULT", var1);
            return DEFAULT;
         }
      }
   }
}
