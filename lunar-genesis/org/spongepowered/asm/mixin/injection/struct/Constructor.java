package org.spongepowered.asm.mixin.injection.struct;

import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.struct.Initialiser;
import org.spongepowered.asm.mixin.transformer.struct.InsnRange;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.asm.MarkerNode;

public class Constructor extends Target {
   private Bytecode.DelegateInitialiser delegateInitialiser;
   private MarkerNode initialiserInjectionPoint;
   private MarkerNode bodyStart;
   private final String targetName;
   private final String targetSuperName;
   private Set<String> mixinInitialisedFields = new HashSet<>();

   public Constructor(ClassInfo var1, ClassNode var2, MethodNode var3) {
      super(var1, var2, var3);
      this.targetName = this.classInfo.getName();
      this.targetSuperName = this.classInfo.getSuperName();
   }

   public Bytecode.DelegateInitialiser findDelegateInitNode() {
      if (this.delegateInitialiser == null) {
         this.delegateInitialiser = Bytecode.findDelegateInit(this.method, this.classInfo.getSuperName(), this.classNode.name);
      }

      return this.delegateInitialiser;
   }

   public boolean isInjectable() {
      Bytecode.DelegateInitialiser var1 = this.findDelegateInitNode();
      return !var1.isPresent || var1.isSuper;
   }

   public void inspect(Initialiser var1) {
      if (this.initialiserInjectionPoint != null) {
         throw new IllegalStateException("Attempted to inspect an incoming initialiser after the injection point was already determined");
      }

      for (AbstractInsnNode var3 : var1.getInsns()) {
         if (var3.getOpcode() == 181) {
            this.mixinInitialisedFields.add(fieldKey((FieldInsnNode)var3));
         }
      }
   }

   public AbstractInsnNode findInitialiserInjectionPoint(Initialiser.InjectionMode var1) {
      if (this.initialiserInjectionPoint != null) {
         return this.initialiserInjectionPoint;
      }

      AbstractInsnNode var2 = null;

      for (AbstractInsnNode var4 : this.insns) {
         if (var4.getOpcode() == 183 && "<init>".equals(((MethodInsnNode)var4).name)) {
            String var6 = ((MethodInsnNode)var4).owner;
            if (var6.equals(this.targetName) || var6.equals(this.targetSuperName)) {
               var2 = var4;
               if (var1 == Initialiser.InjectionMode.SAFE) {
                  break;
               }
            }
         } else if (var4.getOpcode() == 181 && var1 == Initialiser.InjectionMode.DEFAULT) {
            String var5 = fieldKey((FieldInsnNode)var4);
            if (this.mixinInitialisedFields.contains(var5)) {
               var2 = var4;
            }
         }
      }

      if (var2 == null) {
         return null;
      }

      this.initialiserInjectionPoint = new MarkerNode(1);
      this.insert(var2, this.initialiserInjectionPoint);
      return this.initialiserInjectionPoint;
   }

   public AbstractInsnNode findFirstBodyInsn() {
      if (this.bodyStart == null) {
         this.bodyStart = new MarkerNode(2);
         InsnRange var1 = getRange(this.method);
         if (var1.isValid()) {
            Deque var2 = var1.apply(this.insns, true);
            this.insertBefore((AbstractInsnNode)var2.pop(), this.bodyStart);
         } else if (var1.marker > -1) {
            this.insert(this.insns.get(var1.marker), this.bodyStart);
         } else {
            this.bodyStart = null;
         }
      }

      return this.bodyStart;
   }

   private static String fieldKey(FieldInsnNode var0) {
      return String.format("%s:%s", var0.desc, var0.name);
   }

   public static InsnRange getRange(MethodNode var0) {
      boolean var1 = false;
      AbstractInsnNode var2 = null;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = -1;

      for (AbstractInsnNode var8 : var0.instructions) {
         if (var8 instanceof LineNumberNode) {
            var3 = ((LineNumberNode)var8).line;
            var1 = true;
         } else if (var8 instanceof MethodInsnNode) {
            if (var8.getOpcode() == 183 && "<init>".equals(((MethodInsnNode)var8).name) && var6 == -1) {
               var6 = var0.instructions.indexOf(var8);
               var4 = var3;
            }
         } else if (var8.getOpcode() == 181) {
            var1 = false;
         } else if (var8.getOpcode() == 177) {
            if (var1) {
               var5 = var3;
            } else {
               var5 = var4;
               var2 = var8;
            }
         }
      }

      if (var2 != null) {
         LabelNode var9 = new LabelNode(new Label());
         var0.instructions.insertBefore(var2, var9);
         var0.instructions.insertBefore(var2, new LineNumberNode(var4, var9));
      }

      return new InsnRange(var4, var5, var6);
   }
}
