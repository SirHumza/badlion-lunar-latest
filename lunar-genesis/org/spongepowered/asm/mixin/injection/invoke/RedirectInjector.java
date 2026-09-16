package org.spongepowered.asm.mixin.injection.invoke;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.code.InjectorTarget;
import org.spongepowered.asm.mixin.injection.points.BeforeFieldAccess;
import org.spongepowered.asm.mixin.injection.points.BeforeNew;
import org.spongepowered.asm.mixin.injection.struct.ArgOffsets;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.SignaturePrinter;
import org.spongepowered.include.com.google.common.collect.ObjectArrays;
import org.spongepowered.include.com.google.common.primitives.Ints;

public class RedirectInjector extends InvokeInjector {
   protected RedirectInjector.Meta meta;
   private Map<BeforeNew, RedirectInjector.ConstructorRedirectData> ctorRedirectors = new HashMap<>();

   public RedirectInjector(InjectionInfo var1) {
      this(var1, "@Redirect");
   }

   protected RedirectInjector(InjectionInfo var1, String var2) {
      super(var1, var2);
      int var3 = var1.getMixin().getPriority();
      boolean var4 = Annotations.getVisible(this.methodNode, Final.class) != null;
      this.meta = new RedirectInjector.Meta(var3, var4, this.info.toString(), this.methodNode.desc);
   }

   @Override
   protected void checkTarget(Target var1) {
   }

   @Override
   protected void addTargetNode(InjectorTarget var1, List<InjectionNodes.InjectionNode> var2, AbstractInsnNode var3, Set<InjectionPoint> var4) {
      InjectionNodes.InjectionNode var5 = var1.getInjectionNode(var3);
      RedirectInjector.ConstructorRedirectData var6 = null;
      int var7 = 8;
      int var8 = 0;
      if (var3 instanceof MethodInsnNode && "<init>".equals(((MethodInsnNode)var3).name)) {
         throw new InvalidInjectionException(this.info, String.format("Illegal %s of constructor specified on %s", this.annotationType, this));
      }

      if (var5 != null) {
         RedirectInjector.Meta var9 = var5.getDecoration("redirector");
         if (var9 != null && var9.getOwner() != this) {
            if (var9.priority >= this.meta.priority) {
               Injector.logger
                  .warn(
                     "{} conflict. Skipping {} with priority {}, already redirected by {} with priority {}",
                     this.annotationType,
                     this.info,
                     this.meta.priority,
                     var9.name,
                     var9.priority
                  );
               return;
            }

            if (var9.isFinal) {
               throw new InvalidInjectionException(
                  this.info, String.format("%s conflict: %s failed because target was already remapped by %s", this.annotationType, this, var9.name)
               );
            }
         }
      }

      for (InjectionPoint var10 : var4) {
         if (var10 instanceof BeforeNew) {
            BeforeNew var11 = (BeforeNew)var10;
            var6 = this.getCtorRedirect(var11);
            var6.wildcard = !var11.hasDescriptor();
            var6.desc = var11.getDescriptor();
         } else if (var10 instanceof BeforeFieldAccess) {
            BeforeFieldAccess var14 = (BeforeFieldAccess)var10;
            var7 = var14.getFuzzFactor();
            var8 = var14.getArrayOpcode();
         }
      }

      InjectionNodes.InjectionNode var13 = var1.addInjectionNode(var3);
      var13.decorate("redirector", this.meta);
      var13.decorate("nominators", var4);
      if (var3 instanceof TypeInsnNode && var3.getOpcode() == 187) {
         var13.decorate("ctor", var6);
      } else {
         var13.decorate("fuzz", var7);
         var13.decorate("opcode", var8);
      }

      var2.add(var13);
   }

   private RedirectInjector.ConstructorRedirectData getCtorRedirect(BeforeNew var1) {
      RedirectInjector.ConstructorRedirectData var2 = this.ctorRedirectors.get(var1);
      if (var2 == null) {
         var2 = new RedirectInjector.ConstructorRedirectData();
         this.ctorRedirectors.put(var1, var2);
      }

      return var2;
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      if (this.preInject(var2)) {
         if (var2.isReplaced()) {
            throw new UnsupportedOperationException("Redirector target failure for " + this.info);
         }

         if (var2.getCurrentTarget() instanceof MethodInsnNode) {
            this.checkTargetForNode(var1, var2, InjectionPoint.RestrictTargetLevel.ALLOW_ALL);
            this.injectAtInvoke(var1, var2);
         } else if (var2.getCurrentTarget() instanceof FieldInsnNode) {
            this.checkTargetForNode(var1, var2, InjectionPoint.RestrictTargetLevel.ALLOW_ALL);
            this.injectAtFieldAccess(var1, var2);
         } else {
            if (var2.getCurrentTarget() instanceof TypeInsnNode) {
               int var3 = var2.getCurrentTarget().getOpcode();
               if (var3 == 187) {
                  if (!this.isStatic && var1.isStatic) {
                     throw new InvalidInjectionException(
                        this.info, String.format("non-static callback method %s has a static target which is not supported", this)
                     );
                  }

                  this.injectAtConstructor(var1, var2);
                  return;
               }

               if (var3 == 193) {
                  this.checkTargetModifiers(var1, false);
                  this.injectAtInstanceOf(var1, var2);
                  return;
               }
            }

            throw new InvalidInjectionException(
               this.info, String.format("%s annotation on is targetting an invalid insn in %s in %s", this.annotationType, var1, this)
            );
         }
      }
   }

   protected boolean preInject(InjectionNodes.InjectionNode var1) {
      RedirectInjector.Meta var2 = var1.getDecoration("redirector");
      if (var2.getOwner() != this) {
         Injector.logger
            .warn(
               "{} conflict. Skipping {} with priority {}, already redirected by {} with priority {}",
               this.annotationType,
               this.info,
               this.meta.priority,
               var2.name,
               var2.priority
            );
         return false;
      } else {
         return true;
      }
   }

   @Override
   protected void postInject(Target var1, InjectionNodes.InjectionNode var2) {
      super.postInject(var1, var2);
      if (var2.getOriginalTarget() instanceof TypeInsnNode && var2.getOriginalTarget().getOpcode() == 187) {
         RedirectInjector.ConstructorRedirectData var3 = var2.getDecoration("ctor");
         if (var3.wildcard && var3.injected == 0) {
            throw new InvalidInjectionException(
               this.info, String.format("%s ctor invocation was not found in %s", this.annotationType, var1), var3.lastException
            );
         }
      }
   }

   @Override
   protected void injectAtInvoke(Target var1, InjectionNodes.InjectionNode var2) {
      RedirectInjector.RedirectedInvokeData var3 = new RedirectInjector.RedirectedInvokeData(var1, (MethodInsnNode)var2.getCurrentTarget());
      this.validateParams(var3, var3.returnType, var3.handlerArgs);
      InsnList var4 = new InsnList();
      Target.Extension var5 = var1.extendLocals().add(var3.handlerArgs).add(1);
      Target.Extension var6 = var1.extendStack().add(1);
      int[] var7 = this.storeArgs(var1, var3.handlerArgs, var4, 0);
      ArgOffsets var8 = new ArgOffsets(var3.isStatic ? 0 : 1, var3.targetArgs.length);
      if (var3.captureTargetArgs > 0) {
         int var9 = Bytecode.getArgsSize(var1.arguments, 0, var3.captureTargetArgs);
         var5.add(var9);
         var6.add(var9);
         var7 = Ints.concat(var7, var1.getArgIndices());
      }

      AbstractInsnNode var10 = this.invokeHandlerWithArgs(this.methodArgs, var4, var7);
      if (var3.coerceReturnType && var3.returnType.getSort() >= 9) {
         var4.add(new TypeInsnNode(192, var3.returnType.getInternalName()));
      }

      var1.replaceNode(var3.node, var10, var4);
      var2.decorate("argOffsets", var8);
      var5.apply();
      var6.apply();
   }

   private void injectAtFieldAccess(Target var1, InjectionNodes.InjectionNode var2) {
      RedirectInjector.RedirectedFieldData var3 = new RedirectInjector.RedirectedFieldData(var1, (FieldInsnNode)var2.getCurrentTarget());
      int var4 = this.returnType.getSort() == 9 ? this.returnType.getDimensions() : 0;
      if (var4 > var3.dimensions) {
         throw new InvalidInjectionException(this.info, "Dimensionality of handler method is greater than target array on " + this);
      }

      if (var4 == 0 && var3.dimensions > 0) {
         int var5 = var2.<Integer>getDecoration("fuzz");
         int var6 = var2.<Integer>getDecoration("opcode");
         this.injectAtArrayField(var3, var5, var6);
      } else {
         this.injectAtScalarField(var3);
      }
   }

   private void injectAtArrayField(RedirectInjector.RedirectedFieldData var1, int var2, int var3) {
      Type var4 = var1.type.getElementType();
      if (var1.opcode != 178 && var1.opcode != 180) {
         throw new InvalidInjectionException(
            this.info, String.format("Unspported opcode %s for array access %s", Bytecode.getOpcodeName(var1.opcode), this.info)
         );
      }

      if (this.returnType.getSort() != 0) {
         if (var3 != 190) {
            var3 = var4.getOpcode(46);
         }

         AbstractInsnNode var5 = BeforeFieldAccess.findArrayNode(var1.target.insns, var1.node, var3, var2);
         this.injectAtGetArray(var1, var5);
      } else {
         AbstractInsnNode var6 = BeforeFieldAccess.findArrayNode(var1.target.insns, var1.node, var4.getOpcode(79), var2);
         this.injectAtSetArray(var1, var6);
      }
   }

   private void injectAtGetArray(RedirectInjector.RedirectedFieldData var1, AbstractInsnNode var2) {
      var1.description = "array getter";
      var1.elementType = var1.type.getElementType();
      if (var2 != null && var2.getOpcode() == 190) {
         var1.elementType = Type.INT_TYPE;
         var1.extraDimensions = 0;
      }

      this.validateParams(var1, var1.elementType, var1.getArrayArgs());
      this.injectArrayRedirect(var1, var2, "array getter");
   }

   private void injectAtSetArray(RedirectInjector.RedirectedFieldData var1, AbstractInsnNode var2) {
      var1.description = "array setter";
      Type var3 = var1.type.getElementType();
      int var4 = var1.getTotalDimensions();
      if (this.checkCoerce(var4, var3, String.format("%s array setter method %s from %s", this.annotationType, this, this.info.getMixin()), true)) {
         var3 = this.methodArgs[var4];
      }

      this.validateParams(var1, Type.VOID_TYPE, var1.getArrayArgs(var3));
      this.injectArrayRedirect(var1, var2, "array setter");
   }

   private void injectArrayRedirect(RedirectInjector.RedirectedFieldData var1, AbstractInsnNode var2, String var3) {
      if (var2 == null) {
         String var7 = "";
         throw new InvalidInjectionException(
            this.info,
            String.format("Array element %s on %s could not locate a matching %s instruction in %s. %s", this.annotationType, this, var3, var1.target, var7)
         );
      }

      Target.Extension var4 = var1.target.extendStack();
      if (!this.isStatic) {
         VarInsnNode var5 = new VarInsnNode(25, 0);
         var1.target.insns.insert(var1.node, var5);
         var1.target.insns.insert(var5, new InsnNode(95));
         var4.add();
      }

      InsnList var8 = new InsnList();
      if (var1.captureTargetArgs > 0) {
         this.pushArgs(var1.target.arguments, var8, var1.target.getArgIndices(), 0, var1.captureTargetArgs, var4);
      }

      var4.apply();
      AbstractInsnNode var6 = this.invokeHandler(var8);
      if (var1.coerceReturnType && var1.type.getSort() >= 9) {
         var8.add(new TypeInsnNode(192, var1.elementType.getInternalName()));
      }

      var1.target.replaceNode(var2, var6, var8);
   }

   private void injectAtScalarField(RedirectInjector.RedirectedFieldData var1) {
      AbstractInsnNode var2 = null;
      InsnList var3 = new InsnList();
      if (var1.isGetter) {
         var2 = this.injectAtGetField(var1, var3);
      } else {
         if (!var1.isSetter) {
            throw new InvalidInjectionException(this.info, String.format("Unspported opcode %s for %s", Bytecode.getOpcodeName(var1.opcode), this.info));
         }

         var2 = this.injectAtPutField(var1, var3);
      }

      var1.target.replaceNode(var1.node, var2, var3);
   }

   private AbstractInsnNode injectAtGetField(RedirectInjector.RedirectedFieldData var1, InsnList var2) {
      this.validateParams(var1, var1.type, var1.isStatic ? null : var1.owner);
      Target.Extension var3 = var1.target.extendStack();
      if (!this.isStatic) {
         var3.add();
         var2.add(new VarInsnNode(25, 0));
         if (!var1.isStatic) {
            var2.add(new InsnNode(95));
         }
      }

      if (var1.captureTargetArgs > 0) {
         this.pushArgs(var1.target.arguments, var2, var1.target.getArgIndices(), 0, var1.captureTargetArgs, var3);
      }

      var3.apply();
      AbstractInsnNode var4 = this.invokeHandler(var2);
      if (var1.coerceReturnType && var1.type.getSort() >= 9) {
         var2.add(new TypeInsnNode(192, var1.type.getInternalName()));
      }

      return var4;
   }

   private AbstractInsnNode injectAtPutField(RedirectInjector.RedirectedFieldData var1, InsnList var2) {
      this.validateParams(var1, Type.VOID_TYPE, var1.isStatic ? null : var1.owner, var1.type);
      Target.Extension var3 = var1.target.extendStack();
      if (!this.isStatic) {
         if (var1.isStatic) {
            var2.add(new VarInsnNode(25, 0));
            var2.add(new InsnNode(95));
         } else {
            var3.add();
            int var4 = var1.target.allocateLocals(var1.type.getSize());
            var2.add(new VarInsnNode(var1.type.getOpcode(54), var4));
            var2.add(new VarInsnNode(25, 0));
            var2.add(new InsnNode(95));
            var2.add(new VarInsnNode(var1.type.getOpcode(21), var4));
         }
      }

      if (var1.captureTargetArgs > 0) {
         this.pushArgs(var1.target.arguments, var2, var1.target.getArgIndices(), 0, var1.captureTargetArgs, var3);
      }

      var3.apply();
      return this.invokeHandler(var2);
   }

   protected void injectAtConstructor(Target var1, InjectionNodes.InjectionNode var2) {
      RedirectInjector.ConstructorRedirectData var3 = var2.getDecoration("ctor");
      if (var3 == null) {
         throw new InvalidInjectionException(
            this.info, String.format("%s ctor redirector has no metadata, the injector failed a preprocessing phase", this.annotationType)
         );
      }

      TypeInsnNode var4 = (TypeInsnNode)var2.getCurrentTarget();
      AbstractInsnNode var5 = var1.get(var1.indexOf(var4) + 1);
      MethodInsnNode var6 = var1.findInitNodeFor(var4, var3.desc);
      if (var6 == null) {
         var3.throwOrCollect(new InvalidInjectionException(this.info, String.format("%s ctor invocation was not found in %s", this.annotationType, var1)));
      } else {
         boolean var7 = var5.getOpcode() == 89;
         RedirectInjector.RedirectedInvokeData var8 = new RedirectInjector.RedirectedInvokeData(var1, var6);
         var8.description = "factory";

         try {
            this.validateParams(var8, Type.getObjectType(var4.desc), var8.targetArgs);
         } catch (InvalidInjectionException var11) {
            var3.throwOrCollect(var11);
            return;
         }

         if (var7) {
            var1.removeNode(var5);
         }

         if (this.isStatic) {
            var1.removeNode(var4);
         } else {
            var1.replaceNode(var4, new VarInsnNode(25, 0));
         }

         Target.Extension var9 = var1.extendStack();
         InsnList var10 = new InsnList();
         if (var8.captureTargetArgs > 0) {
            this.pushArgs(var1.arguments, var10, var1.getArgIndices(), 0, var8.captureTargetArgs, var9);
         }

         this.invokeHandler(var10);
         if (var8.coerceReturnType) {
            var10.add(new TypeInsnNode(192, var4.desc));
         }

         var9.apply();
         if (var7) {
            this.doNullCheck(var10, var9, "constructor handler", var4.desc.replace('/', '.'));
         } else {
            var10.add(new InsnNode(87));
         }

         var9.apply();
         var1.replaceNode(var6, var10);
         var3.injected++;
      }
   }

   protected void injectAtInstanceOf(Target var1, InjectionNodes.InjectionNode var2) {
      this.injectAtInstanceOf(var1, (TypeInsnNode)var2.getCurrentTarget());
   }

   protected void injectAtInstanceOf(Target var1, TypeInsnNode var2) {
      if (this.returnType.getSort() == 1) {
         this.redirectInstanceOf(var1, var2, false);
      } else if (this.returnType.equals(Type.getType("Ljava/lang/Class;"))) {
         this.redirectInstanceOf(var1, var2, true);
      } else {
         throw new InvalidInjectionException(
            this.info,
            String.format(
               "%s on %s has an invalid signature. Found unexpected return type %s. INSTANCEOF handler expects (Ljava/lang/Object;Ljava/lang/Class;)Z or (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Class;",
               this.annotationType,
               this,
               SignaturePrinter.getTypeName(this.returnType)
            )
         );
      }
   }

   private void redirectInstanceOf(Target var1, TypeInsnNode var2, boolean var3) {
      Target.Extension var4 = var1.extendStack();
      InsnList var5 = new InsnList();
      Injector.InjectorData var6 = new Injector.InjectorData(var1, "instanceof handler", false);
      this.validateParams(var6, this.returnType, Type.getType("Ljava/lang/Object;"), Type.getType("Ljava/lang/Class;"));
      if (var3) {
         var5.add(new InsnNode(89));
         var4.add();
      }

      if (!this.isStatic) {
         var5.add(new VarInsnNode(25, 0));
         var5.add(new InsnNode(95));
         var4.add();
      }

      var5.add(new LdcInsnNode(Type.getObjectType(var2.desc)));
      var4.add();
      if (var6.captureTargetArgs > 0) {
         this.pushArgs(var1.arguments, var5, var1.getArgIndices(), 0, var6.captureTargetArgs, var4);
      }

      AbstractInsnNode var7 = this.invokeHandler(var5);
      if (var3) {
         this.doNullCheck(var5, var4, "instanceof handler", "class type");
         this.checkIsAssignableFrom(var5, var4);
      }

      var1.replaceNode(var2, var7, var5);
      var4.apply();
   }

   private void checkIsAssignableFrom(InsnList var1, Target.Extension var2) {
      LabelNode var3 = new LabelNode();
      LabelNode var4 = new LabelNode();
      var1.add(new InsnNode(95));
      var1.add(new InsnNode(89));
      var2.add();
      var1.add(new JumpInsnNode(198, var3));
      var1.add(new MethodInsnNode(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false));
      var1.add(new MethodInsnNode(182, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false));
      var1.add(new JumpInsnNode(167, var4));
      var1.add(var3);
      var1.add(new InsnNode(87));
      var1.add(new InsnNode(87));
      var1.add(new InsnNode(3));
      var1.add(var4);
      var2.add();
   }

   private void doNullCheck(InsnList var1, Target.Extension var2, String var3, String var4) {
      LabelNode var5 = new LabelNode();
      var1.add(new InsnNode(89));
      var1.add(new JumpInsnNode(199, var5));
      this.throwException(var1, var2, "java/lang/NullPointerException", String.format("%s %s %s returned null for %s", this.annotationType, var3, this, var4));
      var1.add(var5);
      var2.add();
   }

   static class ConstructorRedirectData {
      String desc = null;
      boolean wildcard = false;
      int injected = 0;
      InvalidInjectionException lastException;

      public void throwOrCollect(InvalidInjectionException var1) {
         if (!this.wildcard) {
            throw var1;
         }

         this.lastException = var1;
      }
   }

   class Meta {
      final int priority;
      final boolean isFinal;
      final String name;
      final String desc;

      public Meta(int var2, boolean var3, String var4, String var5) {
         this.priority = var2;
         this.isFinal = var3;
         this.name = var4;
         this.desc = var5;
      }

      RedirectInjector getOwner() {
         return RedirectInjector.this;
      }
   }

   static class RedirectedFieldData extends Injector.InjectorData {
      final FieldInsnNode node;
      final int opcode;
      final Type owner;
      final Type type;
      final int dimensions;
      final boolean isStatic;
      final boolean isGetter;
      final boolean isSetter;
      Type elementType;
      int extraDimensions = 1;

      RedirectedFieldData(Target var1, FieldInsnNode var2) {
         super(var1);
         this.node = var2;
         this.opcode = var2.getOpcode();
         this.owner = Type.getObjectType(var2.owner);
         this.type = Type.getType(var2.desc);
         this.dimensions = this.type.getSort() == 9 ? this.type.getDimensions() : 0;
         this.isStatic = this.opcode == 178 || this.opcode == 179;
         this.isGetter = this.opcode == 178 || this.opcode == 180;
         this.isSetter = this.opcode == 179 || this.opcode == 181;
         this.description = this.isGetter ? "field getter" : (this.isSetter ? "field setter" : "handler");
      }

      int getTotalDimensions() {
         return this.dimensions + this.extraDimensions;
      }

      Type[] getArrayArgs(Type... var1) {
         int var2 = this.getTotalDimensions();
         Type[] var3 = new Type[var2 + var1.length];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = var4 == 0 ? this.type : (var4 < var2 ? Type.INT_TYPE : var1[var2 - var4]);
         }

         return var3;
      }
   }

   static class RedirectedInvokeData extends Injector.InjectorData {
      final MethodInsnNode node;
      final boolean isStatic;
      final Type returnType;
      final Type[] targetArgs;
      final Type[] handlerArgs;

      RedirectedInvokeData(Target var1, MethodInsnNode var2) {
         super(var1);
         this.node = var2;
         this.isStatic = var2.getOpcode() == 184;
         this.returnType = Type.getReturnType(var2.desc);
         this.targetArgs = Type.getArgumentTypes(var2.desc);
         this.handlerArgs = this.isStatic ? this.targetArgs : ObjectArrays.concat(Type.getObjectType(var2.owner), this.targetArgs);
      }
   }
}
