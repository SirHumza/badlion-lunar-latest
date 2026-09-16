package org.spongepowered.asm.mixin.injection.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.Constructor;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InjectionError;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.SignaturePrinter;
import org.spongepowered.include.com.google.common.collect.ObjectArrays;

public abstract class Injector {
   protected static final ILogger logger = MixinService.getService().getLogger("mixin");
   protected InjectionInfo info;
   protected final String annotationType;
   protected final ClassNode classNode;
   protected final MethodNode methodNode;
   protected final Type[] methodArgs;
   protected final Type returnType;
   protected final boolean isStatic;
   protected final boolean isInterface;

   public Injector(InjectionInfo var1, String var2) {
      this.info = var1;
      this.annotationType = var2;
      this.classNode = var1.getTargetClassNode();
      this.methodNode = var1.getMethod();
      this.methodArgs = Type.getArgumentTypes(this.methodNode.desc);
      this.returnType = Type.getReturnType(this.methodNode.desc);
      this.isStatic = Bytecode.isStatic(this.methodNode);
      this.isInterface = Bytecode.hasFlag(this.classNode, 512);
   }

   @Override
   public String toString() {
      return String.format("%s::%s", this.classNode.name, this.info.getMethodName());
   }

   public final List<InjectionNodes.InjectionNode> find(InjectorTarget var1, List<InjectionPoint> var2) {
      this.sanityCheck(var1.getTarget(), var2);
      ArrayList var3 = new ArrayList();

      for (Injector.TargetNode var5 : this.findTargetNodes(var1, var2)) {
         this.addTargetNode(var1, var3, var5.insn, var5.nominators);
      }

      return var3;
   }

   protected void addTargetNode(InjectorTarget var1, List<InjectionNodes.InjectionNode> var2, AbstractInsnNode var3, Set<InjectionPoint> var4) {
      var2.add(var1.addInjectionNode(var3));
   }

   public final void preInject(Target var1, List<InjectionNodes.InjectionNode> var2) {
      for (InjectionNodes.InjectionNode var4 : var2) {
         this.preInject(var1, var4);
      }
   }

   public final void inject(Target var1, List<InjectionNodes.InjectionNode> var2) {
      for (InjectionNodes.InjectionNode var4 : var2) {
         if (var4.isRemoved()) {
            if (this.info.getMixin().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
               logger.warn("Target node for {} was removed by a previous injector in {}", this.info, var1);
            }
         } else {
            this.inject(var1, var4);
         }
      }

      for (InjectionNodes.InjectionNode var6 : var2) {
         this.postInject(var1, var6);
      }
   }

   private Collection<Injector.TargetNode> findTargetNodes(InjectorTarget var1, List<InjectionPoint> var2) {
      MixinTargetContext var3 = this.info.getMixin();
      TreeMap var4 = new TreeMap();
      ArrayList var5 = new ArrayList(32);

      for (InjectionPoint var7 : var2) {
         var5.clear();
         if (var1.isMerged() && !var3.getClassName().equals(var1.getMergedBy()) && !var7.checkPriority(var1.getMergedPriority(), var3.getPriority())) {
            throw new InvalidInjectionException(
               this.info,
               String.format(
                  "%s on %s with priority %d cannot inject into %s merged by %s with priority %d",
                  var7,
                  this,
                  var3.getPriority(),
                  var1,
                  var1.getMergedBy(),
                  var1.getMergedPriority()
               )
            );
         }

         if (this.findTargetNodes(var1, var7, var5)) {
            InjectionPoint.Specifier var8 = var7.getSpecifier(InjectionPoint.Specifier.ALL);
            if (var8 == InjectionPoint.Specifier.ONE && var5.size() != 1) {
               throw new InvalidInjectionException(this.info, String.format("%s on %s has specifier :ONE but matched %d instructions", var7, this, var5.size()));
            }

            if (var8 != InjectionPoint.Specifier.ALL && var5.size() > 1) {
               AbstractInsnNode var11 = (AbstractInsnNode)var5.get(var8 == InjectionPoint.Specifier.FIRST ? 0 : var5.size() - 1);
               this.addTargetNode(var1, var4, var7, var11);
            } else {
               for (AbstractInsnNode var10 : var5) {
                  this.addTargetNode(var1, var4, var7, var10);
               }
            }
         }
      }

      return var4.values();
   }

   protected void addTargetNode(InjectorTarget var1, Map<Integer, Injector.TargetNode> var2, InjectionPoint var3, AbstractInsnNode var4) {
      Integer var5 = var1.getTarget().indexOf(var4);
      Injector.TargetNode var6 = (Injector.TargetNode)var2.get(var5);
      if (var6 == null) {
         var6 = new Injector.TargetNode(var4);
         var2.put(var5, var6);
      }

      var6.nominators.add(var3);
   }

   protected boolean findTargetNodes(InjectorTarget var1, InjectionPoint var2, Collection<AbstractInsnNode> var3) {
      return var2.find(var1.getDesc(), var1.getSlice(var2), var3);
   }

   protected void sanityCheck(Target var1, List<InjectionPoint> var2) {
      if (var1.classNode != this.classNode) {
         throw new InvalidInjectionException(this.info, "Target class does not match injector class in " + this);
      }
   }

   protected final void checkTargetModifiers(Target var1, boolean var2) {
      if (var2 && var1.isStatic != this.isStatic) {
         throw new InvalidInjectionException(this.info, String.format("'static' modifier of handler method does not match target in %s", this));
      }

      if (!var2 && !this.isStatic && var1.isStatic) {
         throw new InvalidInjectionException(this.info, String.format("non-static callback method %s targets a static method which is not supported", this));
      }
   }

   protected void checkTargetForNode(Target var1, InjectionNodes.InjectionNode var2, InjectionPoint.RestrictTargetLevel var3) {
      if (var1 instanceof Constructor) {
         Constructor var4 = (Constructor)var1;
         if (var3 == InjectionPoint.RestrictTargetLevel.METHODS_ONLY) {
            throw new InvalidInjectionException(this.info, String.format("Found %s targetting a constructor in injector %s", this.annotationType, this));
         }

         Bytecode.DelegateInitialiser var5 = var4.findDelegateInitNode();
         if (!var5.isPresent) {
            throw new InjectionError(String.format("Delegate constructor lookup failed for %s target on %s", this.annotationType, this.info));
         }

         int var6 = var4.indexOf(var5.insn);
         int var7 = var4.indexOf(var2.getCurrentTarget());
         if (var7 <= var6) {
            if (var3 == InjectionPoint.RestrictTargetLevel.CONSTRUCTORS_AFTER_DELEGATE) {
               throw new InvalidInjectionException(
                  this.info, String.format("Found %s targetting a constructor before %s() in injector %s", this.annotationType, var5, this)
               );
            }

            if (!this.isStatic) {
               throw new InvalidInjectionException(
                  this.info, String.format("%s handler before %s() invocation must be static in injector %s", this.annotationType, var5, this)
               );
            }

            return;
         }
      }

      this.checkTargetModifiers(var1, false);
   }

   protected void preInject(Target var1, InjectionNodes.InjectionNode var2) {
   }

   protected abstract void inject(Target var1, InjectionNodes.InjectionNode var2);

   protected void postInject(Target var1, InjectionNodes.InjectionNode var2) {
   }

   protected AbstractInsnNode invokeHandler(InsnList var1) {
      return this.invokeHandler(var1, this.methodNode);
   }

   protected AbstractInsnNode invokeHandler(InsnList var1, MethodNode var2) {
      MethodInsnNode var3 = Bytecode.invokeMethod(this.classNode, var2, this.info.getMixin());
      var1.add(var3);
      this.info.addCallbackInvocation(var2);
      return var3;
   }

   protected AbstractInsnNode invokeHandlerWithArgs(Type[] var1, InsnList var2, int[] var3) {
      return this.invokeHandlerWithArgs(var1, var2, var3, 0, var1.length);
   }

   protected AbstractInsnNode invokeHandlerWithArgs(Type[] var1, InsnList var2, int[] var3, int var4, int var5) {
      if (!this.isStatic) {
         var2.add(new VarInsnNode(25, 0));
      }

      this.pushArgs(var1, var2, var3, var4, var5);
      return this.invokeHandler(var2);
   }

   protected int[] storeArgs(Target var1, Type[] var2, InsnList var3, int var4) {
      return this.storeArgs(var1, var2, var3, var4, null, null);
   }

   protected int[] storeArgs(Target var1, Type[] var2, InsnList var3, int var4, LabelNode var5, LabelNode var6) {
      int[] var7 = var1.generateArgMap(var2, var4);
      this.storeArgs(var1, var2, var3, var7, var4, var2.length, var5, var6);
      return var7;
   }

   protected void storeArgs(Target var1, Type[] var2, InsnList var3, int[] var4, int var5, int var6) {
      this.storeArgs(var1, var2, var3, var4, var5, var6, null, null);
   }

   protected void storeArgs(Target var1, Type[] var2, InsnList var3, int[] var4, int var5, int var6, LabelNode var7, LabelNode var8) {
      for (int var9 = var6 - 1; var9 >= var5; var9--) {
         var3.add(new VarInsnNode(var2[var9].getOpcode(54), var4[var9]));
         var1.addLocalVariable(var4[var9], String.format("injectorAllocatedLocal%d", var4[var9]), var2[var9].getDescriptor(), var7, var8);
      }
   }

   protected void pushArgs(Type[] var1, InsnList var2, int[] var3, int var4, int var5) {
      this.pushArgs(var1, var2, var3, var4, var5, null);
   }

   protected void pushArgs(Type[] var1, InsnList var2, int[] var3, int var4, int var5, Target.Extension var6) {
      for (int var7 = var4; var7 < var5 && var7 < var1.length; var7++) {
         var2.add(new VarInsnNode(var1[var7].getOpcode(21), var3[var7]));
         if (var6 != null) {
            var6.add(var1[var7].getSize());
         }
      }
   }

   protected final void validateParams(Injector.InjectorData var1, Type var2, Type... var3) {
      String var4 = String.format("%s %s method %s from %s", this.annotationType, var1, this, this.info.getMixin());
      int var5 = 0;

      try {
         var1.coerceReturnType = this.checkCoerce(-1, var2, var4, var1.allowCoerceArgs);

         for (Type var9 : var3) {
            if (var9 != null) {
               this.checkCoerce(var5, var9, var4, var1.allowCoerceArgs);
               var5++;
            }
         }

         if (var5 == this.methodArgs.length) {
            return;
         }

         for (int var11 = 0; var11 < var1.target.arguments.length && var5 < this.methodArgs.length; var5++) {
            this.checkCoerce(var5, var1.target.arguments[var11], var4, true);
            var1.captureTargetArgs++;
            var11++;
         }
      } catch (InvalidInjectionException var10) {
         String var7 = this.methodArgs.length > var3.length
            ? Bytecode.generateDescriptor(var2, ObjectArrays.concat(var3, var1.target.arguments, Type.class))
            : Bytecode.generateDescriptor(var2, var3);
         throw new InvalidInjectionException(
            this.info, String.format("%s. Handler signature: %s Expected signature: %s", var10.getMessage(), this.methodNode.desc, var7)
         );
      }

      if (var5 < this.methodArgs.length) {
         Type[] var12 = Arrays.copyOfRange(this.methodArgs, var5, this.methodArgs.length);
         throw new InvalidInjectionException(
            this.info,
            String.format(
               "%s has an invalid signature. Found %d unexpected additional method arguments: %s",
               var4,
               this.methodArgs.length - var5,
               new SignaturePrinter(var12).getFormattedArgs()
            )
         );
      }
   }

   protected final boolean checkCoerce(int var1, Type var2, String var3, boolean var4) {
      if (var1 >= this.methodArgs.length) {
         throw new InvalidInjectionException(
            this.info,
            String.format(
               "%s has an invalid signature. Not enough arguments: expected argument type %s at index %d", var3, SignaturePrinter.getTypeName(var2), var1
            )
         );
      }

      Type var5 = var1 < 0 ? this.returnType : this.methodArgs[var1];
      AnnotationNode var6 = Annotations.getInvisibleParameter(this.methodNode, Coerce.class, var1);
      boolean var7 = var1 < 0;
      String var8 = var7 ? "return" : "argument";
      String var9 = var7 ? "" : " at index " + var1;
      if (var5.equals(var2)) {
         if (var6 != null && this.info.getMixin().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
            logger.info(
               "Possibly-redundant @Coerce on {} {} type{}, {} is identical to {}",
               var3,
               var8,
               var9,
               SignaturePrinter.getTypeName(var2),
               SignaturePrinter.getTypeName(var5)
            );
         }

         return false;
      } else if (var6 != null && var4) {
         boolean var11 = canCoerce(var5, var2);
         if (!var11) {
            throw new InvalidInjectionException(
               this.info,
               String.format(
                  "%s has an invalid signature. Cannot @Coerce %s type %s%s to %s",
                  var3,
                  var8,
                  SignaturePrinter.getTypeName(var2),
                  var9,
                  SignaturePrinter.getTypeName(var5)
               )
            );
         } else {
            return true;
         }
      } else {
         String var10 = var6 != null ? ". @Coerce not allowed here" : "";
         throw new InvalidInjectionException(
            this.info,
            String.format(
               "%s has an invalid signature. Found unexpected %s type %s%s, expected %s%s",
               var3,
               var8,
               SignaturePrinter.getTypeName(var5),
               var9,
               SignaturePrinter.getTypeName(var2),
               var10
            )
         );
      }
   }

   protected void throwException(InsnList var1, Target.Extension var2, String var3, String var4) {
      var1.add(new TypeInsnNode(187, var3));
      var1.add(new InsnNode(89));
      var1.add(new LdcInsnNode(var4));
      var1.add(new MethodInsnNode(183, var3, "<init>", "(Ljava/lang/String;)V", false));
      var1.add(new InsnNode(191));
      var2.add(3);
   }

   public static boolean canCoerce(Type var0, Type var1) {
      int var2 = var0.getSort();
      int var3 = var1.getSort();
      if (var2 >= 9 && var3 >= 9 && var2 == var3) {
         return var2 == 9 && var0.getDimensions() != var1.getDimensions()
            ? false
            : canCoerce(ClassInfo.forType(var0, ClassInfo.TypeLookup.ELEMENT_TYPE), ClassInfo.forType(var1, ClassInfo.TypeLookup.ELEMENT_TYPE));
      } else {
         return canCoerce(var0.getDescriptor(), var1.getDescriptor());
      }
   }

   public static boolean canCoerce(String var0, String var1) {
      return var0.length() <= 1 && var1.length() <= 1 ? canCoerce(var0.charAt(0), var1.charAt(0)) : false;
   }

   public static boolean canCoerce(char var0, char var1) {
      return var1 == 'I' && "IBSCZ".indexOf(var0) > -1;
   }

   private static boolean canCoerce(ClassInfo var0, ClassInfo var1) {
      return var0 != null && var1 != null && (var1 == var0 || var1.hasSuperClass(var0, ClassInfo.Traversal.ALL, true));
   }

   public static class InjectorData {
      public final Target target;
      public String description;
      public boolean allowCoerceArgs;
      public int captureTargetArgs = 0;
      public boolean coerceReturnType = false;

      public InjectorData(Target var1) {
         this(var1, "handler");
      }

      public InjectorData(Target var1, String var2) {
         this(var1, var2, true);
      }

      public InjectorData(Target var1, String var2, boolean var3) {
         this.target = var1;
         this.description = var2;
         this.allowCoerceArgs = var3;
      }

      @Override
      public String toString() {
         return this.description;
      }
   }

   public static final class TargetNode {
      final AbstractInsnNode insn;
      final Set<InjectionPoint> nominators = new HashSet<>();

      TargetNode(AbstractInsnNode var1) {
         this.insn = var1;
      }

      public AbstractInsnNode getNode() {
         return this.insn;
      }

      public Set<InjectionPoint> getNominators() {
         return Collections.unmodifiableSet(this.nominators);
      }

      @Override
      public boolean equals(Object var1) {
         return var1 != null && var1.getClass() == Injector.TargetNode.class ? ((Injector.TargetNode)var1).insn == this.insn : false;
      }

      @Override
      public int hashCode() {
         return this.insn.hashCode();
      }
   }
}
