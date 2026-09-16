package org.spongepowered.asm.mixin.injection.struct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.points.BeforeNew;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Counter;
import org.spongepowered.asm.util.Locals;

public class Target implements Comparable<Target>, Iterable<AbstractInsnNode> {
   public final ClassInfo classInfo;
   public final ClassNode classNode;
   public final MethodNode method;
   public final InsnList insns;
   public final boolean isStatic;
   public final Type[] arguments;
   public final Type returnType;
   private final int maxStack;
   private final int maxLocals;
   private final InjectionNodes injectionNodes = new InjectionNodes();
   private String callbackInfoClass;
   private String callbackDescriptor;
   private int[] argIndices;
   private List<Integer> argMapVars;
   private LabelNode start;
   private LabelNode end;

   Target(ClassInfo var1, ClassNode var2, MethodNode var3) {
      this.classInfo = var1;
      this.classNode = var2;
      this.method = var3;
      this.insns = var3.instructions;
      this.isStatic = Bytecode.isStatic(var3);
      this.arguments = Type.getArgumentTypes(var3.desc);
      this.returnType = Type.getReturnType(var3.desc);
      this.maxStack = var3.maxStack;
      this.maxLocals = var3.maxLocals;
   }

   public InjectionNodes.InjectionNode addInjectionNode(AbstractInsnNode var1) {
      return this.injectionNodes.add(var1);
   }

   public InjectionNodes.InjectionNode getInjectionNode(AbstractInsnNode var1) {
      return this.injectionNodes.get(var1);
   }

   public String getName() {
      return this.method.name;
   }

   public String getDesc() {
      return this.method.desc;
   }

   public String getSignature() {
      return this.method.signature;
   }

   public int getMaxLocals() {
      return this.maxLocals;
   }

   public int getMaxStack() {
      return this.maxStack;
   }

   public int getCurrentMaxLocals() {
      return this.method.maxLocals;
   }

   public int getCurrentMaxStack() {
      return this.method.maxStack;
   }

   public int allocateLocal() {
      return this.allocateLocals(1);
   }

   public int allocateLocals(int var1) {
      int var2 = this.method.maxLocals;
      this.method.maxLocals += var1;
      return var2;
   }

   public Target.Extension extendLocals() {
      return new Target.Extension(true);
   }

   public Target.Extension extendStack() {
      return new Target.Extension(false);
   }

   void extendLocalsBy(int var1) {
      this.setMaxLocals(this.maxLocals + var1);
   }

   private void setMaxLocals(int var1) {
      if (var1 > this.method.maxLocals) {
         this.method.maxLocals = var1;
      }
   }

   void extendStackBy(int var1) {
      this.setMaxStack(this.maxStack + var1);
   }

   private void setMaxStack(int var1) {
      if (var1 > this.method.maxStack) {
         this.method.maxStack = var1;
      }
   }

   public int[] generateArgMap(Type[] var1, int var2) {
      return this.generateArgMap(var1, var2, false);
   }

   public int[] generateArgMap(Type[] var1, int var2, boolean var3) {
      if (this.argMapVars == null) {
         this.argMapVars = new ArrayList<>();
      }

      int[] var4 = new int[var1.length];
      Counter var5 = new Counter();

      for (int var6 = var2; var6 < var1.length; var6++) {
         int var7 = var1[var6].getSize();
         if (var3) {
            var4[var6] = this.allocateLocals(var7);
            var5.value += var7;
         } else {
            var4[var6] = this.allocateArgMapLocal(var5, var7);
         }
      }

      return var4;
   }

   private int allocateArgMapLocal(Counter var1, int var2) {
      boolean var3 = var1.value < this.argMapVars.size();

      while (var1.value < this.argMapVars.size()) {
         int var4 = this.argMapVars.get(var1.value);
         if (var2 == 1) {
            var1.value++;
            return var4;
         }

         int var5 = var1.value + 1;
         if (var5 < this.argMapVars.size() && var4 + 1 == this.argMapVars.get(var5)) {
            var1.value += 2;
            return var4;
         }

         var1.value++;
      }

      int var6 = this.allocateLocal();
      this.argMapVars.add(var6);
      var1.value++;
      if (var2 == 1) {
         return var6;
      }

      if (var3 && var6 == this.argMapVars.get(this.argMapVars.size() - 2) + 1) {
         return var6 - 1;
      }

      this.argMapVars.add(this.allocateLocal());
      var1.value++;
      return var6;
   }

   public int[] getArgIndices() {
      if (this.argIndices == null) {
         this.argIndices = this.calcArgIndices(this.isStatic ? 0 : 1);
      }

      return this.argIndices;
   }

   private int[] calcArgIndices(int var1) {
      int[] var2 = new int[this.arguments.length];

      for (int var3 = 0; var3 < this.arguments.length; var3++) {
         var2[var3] = var1;
         var1 += this.arguments[var3].getSize();
      }

      return var2;
   }

   public String getCallbackInfoClass() {
      if (this.callbackInfoClass == null) {
         this.callbackInfoClass = CallbackInfo.getCallInfoClassName(this.returnType);
      }

      return this.callbackInfoClass;
   }

   public String getSimpleCallbackDescriptor() {
      return String.format("(L%s;)V", this.getCallbackInfoClass());
   }

   public String getCallbackDescriptor(Type[] var1, Type[] var2) {
      return this.getCallbackDescriptor(false, var1, var2, 0, 32767);
   }

   public String getCallbackDescriptor(boolean var1, Type[] var2, Type[] var3, int var4, int var5) {
      if (this.callbackDescriptor == null) {
         this.callbackDescriptor = String.format("(%sL%s;)V", this.getDesc().substring(1, this.getDesc().indexOf(41)), this.getCallbackInfoClass());
      }

      if (var1 && var2 != null) {
         StringBuilder var6 = new StringBuilder(this.callbackDescriptor.substring(0, this.callbackDescriptor.indexOf(41)));

         for (int var7 = var4; var7 < var2.length && var5 > 0; var7++) {
            if (var2[var7] != null) {
               var6.append(var2[var7].getDescriptor());
               var5--;
            }
         }

         return var6.append(")V").toString();
      } else {
         return this.callbackDescriptor;
      }
   }

   @Override
   public String toString() {
      return String.format("%s::%s%s", this.classNode.name, this.getName(), this.getDesc());
   }

   public int compareTo(Target var1) {
      return var1 == null ? Integer.MAX_VALUE : this.toString().compareTo(var1.toString());
   }

   public int indexOf(InjectionNodes.InjectionNode var1) {
      return this.insns.indexOf(var1.getCurrentTarget());
   }

   public int indexOf(AbstractInsnNode var1) {
      return this.insns.indexOf(var1);
   }

   public AbstractInsnNode get(int var1) {
      return this.insns.get(var1);
   }

   @Override
   public Iterator<AbstractInsnNode> iterator() {
      return this.insns.iterator();
   }

   public MethodInsnNode findInitNodeFor(TypeInsnNode var1) {
      return this.findInitNodeFor(var1, null);
   }

   public MethodInsnNode findInitNodeFor(TypeInsnNode var1, String var2) {
      return BeforeNew.findInitNodeFor(this.insns, var1, var2);
   }

   public void insert(InjectionNodes.InjectionNode var1, InsnList var2) {
      this.insns.insert(var1.getCurrentTarget(), var2);
   }

   public void insert(InjectionNodes.InjectionNode var1, AbstractInsnNode var2) {
      this.insns.insert(var1.getCurrentTarget(), var2);
   }

   public void insert(AbstractInsnNode var1, InsnList var2) {
      this.insns.insert(var1, var2);
   }

   public void insert(AbstractInsnNode var1, AbstractInsnNode var2) {
      this.insns.insert(var1, var2);
   }

   public void insertBefore(InjectionNodes.InjectionNode var1, InsnList var2) {
      this.insns.insertBefore(var1.getCurrentTarget(), var2);
   }

   public void insertBefore(InjectionNodes.InjectionNode var1, AbstractInsnNode var2) {
      this.insns.insertBefore(var1.getCurrentTarget(), var2);
   }

   public void insertBefore(AbstractInsnNode var1, InsnList var2) {
      this.insns.insertBefore(var1, var2);
   }

   public void insertBefore(AbstractInsnNode var1, AbstractInsnNode var2) {
      this.insns.insertBefore(var1, var2);
   }

   public void replaceNode(AbstractInsnNode var1, AbstractInsnNode var2) {
      this.insns.insertBefore(var1, var2);
      this.insns.remove(var1);
      this.injectionNodes.replace(var1, var2);
   }

   public void replaceNode(AbstractInsnNode var1, AbstractInsnNode var2, InsnList var3) {
      this.insns.insertBefore(var1, var3);
      this.insns.remove(var1);
      this.injectionNodes.replace(var1, var2);
   }

   public void wrapNode(AbstractInsnNode var1, AbstractInsnNode var2, InsnList var3, InsnList var4) {
      this.insns.insertBefore(var1, var3);
      this.insns.insert(var1, var4);
      this.injectionNodes.replace(var1, var2);
   }

   public void replaceNode(AbstractInsnNode var1, InsnList var2) {
      this.insns.insertBefore(var1, var2);
      this.removeNode(var1);
   }

   public void removeNode(AbstractInsnNode var1) {
      this.insns.remove(var1);
      this.injectionNodes.remove(var1);
   }

   public void addLocalVariable(int var1, String var2, String var3) {
      this.addLocalVariable(var1, var2, var3, null, null);
   }

   public void addLocalVariable(int var1, String var2, String var3, LabelNode var4, LabelNode var5) {
      if (var4 == null) {
         var4 = this.getStartLabel();
      }

      if (var5 == null) {
         var5 = this.getEndLabel();
      }

      if (this.method.localVariables == null) {
         this.method.localVariables = new ArrayList<>();
      }

      Iterator var6 = this.method.localVariables.iterator();

      while (var6.hasNext()) {
         LocalVariableNode var7 = (LocalVariableNode)var6.next();
         if (var7 != null && var7.index == var1 && var4 == var7.start && var5 == var7.end) {
            var6.remove();
         }
      }

      this.method.localVariables.add(new Locals.SyntheticLocalVariableNode(var2, var3, null, var4, var5, var1));
   }

   private LabelNode getStartLabel() {
      if (this.start == null) {
         this.insns.insert(this.start = new LabelNode());
      }

      return this.start;
   }

   private LabelNode getEndLabel() {
      if (this.end == null) {
         this.insns.add(this.end = new LabelNode());
      }

      return this.end;
   }

   public static Target of(ClassInfo var0, ClassNode var1, MethodNode var2) {
      return var2.name.equals("<init>") ? new Constructor(var0, var1, var2) : new Target(var0, var1, var2);
   }

   public class Extension {
      private final boolean locals;
      private int size;

      Extension(boolean var2) {
         this.locals = var2;
      }

      public Target.Extension add() {
         this.size++;
         return this;
      }

      public Target.Extension add(int var1) {
         this.size += var1;
         return this;
      }

      public Target.Extension add(Type[] var1) {
         return this.add(Bytecode.getArgsSize(var1));
      }

      public Target.Extension set(int var1) {
         this.size = var1;
         return this;
      }

      public int get() {
         return this.size;
      }

      public void apply() {
         if (this.locals) {
            Target.this.extendLocalsBy(this.size);
         } else {
            Target.this.extendStackBy(this.size);
         }

         this.size = 0;
      }
   }
}
