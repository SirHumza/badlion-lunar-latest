package org.spongepowered.asm.mixin.injection.modify;

import java.util.Collection;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.FabricUtil;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.IInsnListEx;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.code.InjectorTarget;
import org.spongepowered.asm.mixin.injection.code.InsnListEx;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InjectionError;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.SignaturePrinter;

public class ModifyVariableInjector extends Injector {
   private final LocalVariableDiscriminator discriminator;

   public ModifyVariableInjector(InjectionInfo var1, LocalVariableDiscriminator var2) {
      super(var1, "@ModifyVariable");
      this.discriminator = var2;
   }

   @Override
   protected boolean findTargetNodes(InjectorTarget var1, InjectionPoint var2, Collection<AbstractInsnNode> var3) {
      InsnListEx var4 = (InsnListEx)var1.getSlice(var2);
      var4.decorate("mv.target", var1.getTarget());
      var4.decorate("mv.info", this.info);
      boolean var5 = var2 instanceof ModifyVariableInjector.LocalVariableInjectionPoint
         ? ((ModifyVariableInjector.LocalVariableInjectionPoint)var2).find(this.info, var4, var3, var1.getTarget())
         : var2.find(var1.getDesc(), var4, var3);
      if (var4 instanceof InsnListEx) {
         var4.undecorate("mv.target");
         var4.undecorate("mv.info");
      }

      return var5;
   }

   @Override
   protected void sanityCheck(Target var1, List<InjectionPoint> var2) {
      super.sanityCheck(var1, var2);
      int var3 = this.discriminator.getOrdinal();
      if (var3 < -1) {
         throw new InvalidInjectionException(this.info, "Invalid ordinal " + var3 + " specified in " + this);
      }

      if (this.discriminator.getIndex() == 0 && !var1.isStatic) {
         throw new InvalidInjectionException(this.info, "Invalid index 0 specified in non-static variable modifier " + this);
      }
   }

   protected String getTargetNodeKey(Target var1, InjectionNodes.InjectionNode var2) {
      return String.format(
         "localcontext(%s,%s,#%s,%s)",
         this.returnType,
         this.discriminator.isArgsOnly() ? "argsOnly" : "fullFrame",
         var2.getId(),
         FabricUtil.getCompatibility(this.info)
      );
   }

   @Override
   protected void preInject(Target var1, InjectionNodes.InjectionNode var2) {
      String var3 = this.getTargetNodeKey(var1, var2);
      if (!var2.hasDecoration(var3)) {
         ModifyVariableInjector.Context var4 = new ModifyVariableInjector.Context(
            this.info, this.returnType, this.discriminator.isArgsOnly(), var1, var2.getCurrentTarget()
         );
         var2.decorate(var3, var4);
      }
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      if (var2.isReplaced()) {
         throw new InvalidInjectionException(this.info, "Variable modifier target for " + this + " was removed by another injector");
      }

      ModifyVariableInjector.Context var3 = var2.getDecoration(this.getTargetNodeKey(var1, var2));
      if (var3 == null) {
         throw new InjectionError(
            String.format(
               "%s injector target is missing CONTEXT decoration for %s. PreInjection failure or illegal internal state change", this.annotationType, this.info
            )
         );
      }

      if (var3.insns.size() > 0) {
         throw new InjectionError(
            String.format("%s injector target has contaminated CONTEXT decoration for %s. Check for previous errors.", this.annotationType, this.info)
         );
      }

      if (this.discriminator.printLVT()) {
         this.printLocals(var1, var3);
      }

      this.checkTargetForNode(var1, var2, InjectionPoint.RestrictTargetLevel.ALLOW_ALL);
      Injector.InjectorData var4 = new Injector.InjectorData(var1, "handler", false);
      if (this.returnType == Type.VOID_TYPE) {
         throw new InvalidInjectionException(
            this.info,
            String.format("%s %s method %s from %s has an invalid signature, cannot return a VOID type.", this.annotationType, var4, this, this.info.getMixin())
         );
      }

      this.validateParams(var4, this.returnType, this.returnType);
      Target.Extension var5 = var1.extendStack();

      try {
         int var6 = this.discriminator.findLocal(var3);
         if (var6 > -1) {
            this.inject(var3, var4, var5, var6);
         }
      } catch (InvalidImplicitDiscriminatorException var7) {
         if (this.discriminator.printLVT()) {
            this.info.addCallbackInvocation(this.methodNode);
            return;
         }

         throw new InvalidInjectionException(this.info, "Implicit variable modifier injection failed in " + this, var7);
      }

      var5.apply();
      var1.insns.insertBefore(var3.node, var3.insns);
   }

   private void printLocals(Target var1, ModifyVariableInjector.Context var2) {
      String var3 = "EXPLICIT (match by criteria)";
      if (this.discriminator.isImplicit(var2)) {
         int var4 = var2.getCandidateCount();
         var3 = "IMPLICIT (match single) - " + (var4 == 1 ? "VALID (exactly 1 match)" : "INVALID (" + var4 + " matches)");
      }

      new PrettyPrinter()
         .kvWidth(20)
         .kv("Target Class", this.classNode.name.replace('/', '.'))
         .kv("Target Method", var2.target.method.name)
         .kv("Callback Name", this.info.getMethodName())
         .kv("Capture Type", SignaturePrinter.getTypeName(this.returnType, false))
         .kv("Instruction", "[%d] %s %s", var1.insns.indexOf(var2.node), var2.node.getClass().getSimpleName(), Bytecode.getOpcodeName(var2.node.getOpcode()))
         .hr()
         .kv("Match mode", var3)
         .kv("Match ordinal", this.discriminator.getOrdinal() < 0 ? "any" : this.discriminator.getOrdinal())
         .kv("Match index", this.discriminator.getIndex() < var2.baseArgIndex ? "any" : this.discriminator.getIndex())
         .kv("Match name(s)", this.discriminator.hasNames() ? this.discriminator.getNames() : "any")
         .kv("Args only", this.discriminator.isArgsOnly())
         .hr()
         .add(var2)
         .print(System.err);
   }

   private void inject(ModifyVariableInjector.Context var1, Injector.InjectorData var2, Target.Extension var3, int var4) {
      if (!this.isStatic) {
         var1.insns.add(new VarInsnNode(25, 0));
         var3.add();
      }

      var1.insns.add(new VarInsnNode(this.returnType.getOpcode(21), var4));
      var3.add();
      if (var2.captureTargetArgs > 0) {
         this.pushArgs(var2.target.arguments, var1.insns, var2.target.getArgIndices(), 0, var2.captureTargetArgs, var3);
      }

      this.invokeHandler(var1.insns);
      var1.insns.add(new VarInsnNode(this.returnType.getOpcode(54), var4));
   }

   static class Context extends LocalVariableDiscriminator.Context {
      final InsnList insns = new InsnList();

      public Context(InjectionInfo var1, Type var2, boolean var3, Target var4, AbstractInsnNode var5) {
         super(var1, var2, var3, var4, var5);
      }
   }

   abstract static class LocalVariableInjectionPoint extends InjectionPoint {
      protected final IMixinContext mixin;

      LocalVariableInjectionPoint(InjectionPointData var1) {
         super(var1);
         this.mixin = var1.getMixin();
      }

      @Override
      public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
         if (var2 instanceof IInsnListEx) {
            IInsnListEx var4 = (IInsnListEx)var2;
            Target var5 = var4.getDecoration("mv.target");
            if (var5 != null) {
               return this.find(var4.getDecoration("mv.info"), var2, var3, var5);
            }
         }

         throw new InvalidInjectionException(this.mixin, this.getAtCode() + " injection point must be used in conjunction with @ModifyVariable");
      }

      abstract boolean find(InjectionInfo var1, InsnList var2, Collection<AbstractInsnNode> var3, Target var4);
   }
}
