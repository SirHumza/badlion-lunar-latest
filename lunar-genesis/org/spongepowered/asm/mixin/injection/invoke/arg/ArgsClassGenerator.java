package org.spongepowered.asm.mixin.injection.invoke.arg;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.util.CheckClassAdapter;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.transformer.SyntheticClassInfo;
import org.spongepowered.asm.mixin.transformer.ext.IClassGenerator;
import org.spongepowered.asm.service.ISyntheticClassInfo;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.IConsumer;
import org.spongepowered.asm.util.SignaturePrinter;
import org.spongepowered.asm.util.asm.MethodVisitorEx;

public final class ArgsClassGenerator implements IClassGenerator {
   public static final String ARGS_NAME = Args.class.getName();
   public static final String ARGS_REF = ARGS_NAME.replace('.', '/');
   public static final String GETTER_PREFIX = "$";
   public static final String SYNTHETIC_PACKAGE = "org.spongepowered.asm.synthetic.args";
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final IConsumer<ISyntheticClassInfo> registry;
   private int nextIndex = 1;
   private final Map<String, ArgsClassGenerator.ArgsClassInfo> descToClass = new HashMap<>();
   private final Map<String, ArgsClassGenerator.ArgsClassInfo> nameToClass = new HashMap<>();

   public ArgsClassGenerator(IConsumer<ISyntheticClassInfo> var1) {
      this.registry = var1;
   }

   @Override
   public String getName() {
      return "args";
   }

   public ISyntheticClassInfo getArgsClass(String var1, IMixinInfo var2) {
      String var3 = Bytecode.changeDescriptorReturnType(var1, "V");
      ArgsClassGenerator.ArgsClassInfo var4 = this.descToClass.get(var3);
      if (var4 == null) {
         String var5 = String.format("%s%d", "org.spongepowered.asm.synthetic.args.Args$", this.nextIndex++);
         logger.debug("ArgsClassGenerator assigning {} for descriptor {}", var5, var3);
         var4 = new ArgsClassGenerator.ArgsClassInfo(var2, var5, var3);
         this.descToClass.put(var3, var4);
         this.nameToClass.put(var5, var4);
         this.registry.accept(var4);
      }

      return var4;
   }

   @Override
   public boolean generate(String var1, ClassNode var2) {
      ArgsClassGenerator.ArgsClassInfo var3 = this.nameToClass.get(var1);
      if (var3 == null) {
         return false;
      }

      if (var3.loaded > 0) {
         logger.debug("ArgsClassGenerator is re-generating {}, already did this {} times!", var1, var3.loaded);
      }

      ClassVisitor var4 = var2;
      if (MixinEnvironment.getCurrentEnvironment().getOption(MixinEnvironment.Option.DEBUG_VERIFY)) {
         var4 = new CheckClassAdapter(var2);
      }

      var4.visit(50, 4129, var3.getName(), null, ARGS_REF, null);
      var4.visitSource(var1.substring(var1.lastIndexOf(46) + 1) + ".java", null);
      this.generateCtor(var3, var4);
      this.generateToString(var3, var4);
      this.generateFactory(var3, var4);
      this.generateSetters(var3, var4);
      this.generateGetters(var3, var4);
      var4.visitEnd();
      var3.loaded++;
      return true;
   }

   private void generateCtor(ArgsClassGenerator.ArgsClassInfo var1, ClassVisitor var2) {
      MethodVisitor var3 = var2.visitMethod(2, "<init>", "([Ljava/lang/Object;)V", null, null);
      var3.visitCode();
      var3.visitVarInsn(25, 0);
      var3.visitVarInsn(25, 1);
      var3.visitMethodInsn(183, ARGS_REF, "<init>", "([Ljava/lang/Object;)V", false);
      var3.visitInsn(177);
      var3.visitMaxs(2, 2);
      var3.visitEnd();
   }

   private void generateToString(ArgsClassGenerator.ArgsClassInfo var1, ClassVisitor var2) {
      MethodVisitor var3 = var2.visitMethod(1, "toString", "()Ljava/lang/String;", null, null);
      var3.visitCode();
      var3.visitLdcInsn("Args" + var1.getSignature());
      var3.visitInsn(176);
      var3.visitMaxs(1, 1);
      var3.visitEnd();
   }

   private void generateFactory(ArgsClassGenerator.ArgsClassInfo var1, ClassVisitor var2) {
      String var3 = var1.getName();
      String var4 = Bytecode.changeDescriptorReturnType(var1.desc, "L" + var3 + ";");
      MethodVisitorEx var5 = new MethodVisitorEx(var2.visitMethod(9, "of", var4, null, null));
      var5.visitCode();
      var5.visitTypeInsn(187, var3);
      var5.visitInsn(89);
      var5.visitConstant((byte)var1.args.length);
      var5.visitTypeInsn(189, "java/lang/Object");
      byte var6 = 0;
      byte var7 = 0;

      while (var6 < var1.args.length) {
         Type var8 = var1.args[var6];
         var5.visitInsn(89);
         var5.visitConstant(var6);
         var5.visitVarInsn(var8.getOpcode(21), var7);
         box(var5, var8);
         var5.visitInsn(83);
         var7 = (byte)(var7 + var8.getSize());
         var6++;
      }

      var5.visitMethodInsn(183, var3, "<init>", "([Ljava/lang/Object;)V", false);
      var5.visitInsn(176);
      var5.visitMaxs(6, Bytecode.getArgsSize(var1.args));
      var5.visitEnd();
   }

   private void generateGetters(ArgsClassGenerator.ArgsClassInfo var1, ClassVisitor var2) {
      byte var3 = 0;

      for (Type var7 : var1.args) {
         String var8 = "$" + var3;
         String var9 = "()" + var7.getDescriptor();
         MethodVisitorEx var10 = new MethodVisitorEx(var2.visitMethod(1, var8, var9, null, null));
         var10.visitCode();
         var10.visitVarInsn(25, 0);
         var10.visitFieldInsn(180, var1.getName(), "values", "[Ljava/lang/Object;");
         var10.visitConstant(var3);
         var10.visitInsn(50);
         unbox(var10, var7);
         var10.visitInsn(var7.getOpcode(172));
         var10.visitMaxs(2, 1);
         var10.visitEnd();
         var3++;
      }
   }

   private void generateSetters(ArgsClassGenerator.ArgsClassInfo var1, ClassVisitor var2) {
      this.generateIndexedSetter(var1, var2);
      this.generateMultiSetter(var1, var2);
   }

   private void generateIndexedSetter(ArgsClassGenerator.ArgsClassInfo var1, ClassVisitor var2) {
      MethodVisitorEx var3 = new MethodVisitorEx(var2.visitMethod(1, "set", "(ILjava/lang/Object;)V", null, null));
      var3.visitCode();
      Label var4 = new Label();
      Label var5 = new Label();
      Label[] var6 = new Label[var1.args.length];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = new Label();
      }

      var3.visitVarInsn(25, 0);
      var3.visitFieldInsn(180, var1.getName(), "values", "[Ljava/lang/Object;");

      for (byte var9 = 0; var9 < var1.args.length; var9++) {
         var3.visitVarInsn(21, 1);
         var3.visitConstant(var9);
         var3.visitJumpInsn(159, var6[var9]);
      }

      throwAIOOBE(var3, 1);

      for (int var10 = 0; var10 < var1.args.length; var10++) {
         String var8 = Bytecode.getBoxingType(var1.args[var10]);
         var3.visitLabel(var6[var10]);
         var3.visitVarInsn(21, 1);
         var3.visitVarInsn(25, 2);
         var3.visitTypeInsn(192, var8 != null ? var8 : var1.args[var10].getInternalName());
         var3.visitJumpInsn(167, var8 != null ? var5 : var4);
      }

      var3.visitLabel(var5);
      var3.visitInsn(89);
      var3.visitJumpInsn(199, var4);
      throwNPE(var3, "Argument with primitive type cannot be set to NULL");
      var3.visitLabel(var4);
      var3.visitInsn(83);
      var3.visitInsn(177);
      var3.visitMaxs(6, 3);
      var3.visitEnd();
   }

   private void generateMultiSetter(ArgsClassGenerator.ArgsClassInfo var1, ClassVisitor var2) {
      MethodVisitorEx var3 = new MethodVisitorEx(var2.visitMethod(1, "setAll", "([Ljava/lang/Object;)V", null, null));
      var3.visitCode();
      Label var4 = new Label();
      Label var5 = new Label();
      byte var6 = 6;
      var3.visitVarInsn(25, 1);
      var3.visitInsn(190);
      var3.visitInsn(89);
      var3.visitConstant((byte)var1.args.length);
      var3.visitJumpInsn(159, var4);
      var3.visitTypeInsn(187, "org/spongepowered/asm/mixin/injection/invoke/arg/ArgumentCountException");
      var3.visitInsn(89);
      var3.visitInsn(93);
      var3.visitInsn(88);
      var3.visitConstant((byte)var1.args.length);
      var3.visitLdcInsn(var1.getSignature());
      var3.visitMethodInsn(183, "org/spongepowered/asm/mixin/injection/invoke/arg/ArgumentCountException", "<init>", "(IILjava/lang/String;)V", false);
      var3.visitInsn(191);
      var3.visitLabel(var4);
      var3.visitInsn(87);
      var3.visitVarInsn(25, 0);
      var3.visitFieldInsn(180, var1.getName(), "values", "[Ljava/lang/Object;");

      for (byte var7 = 0; var7 < var1.args.length; var7++) {
         var3.visitInsn(89);
         var3.visitConstant(var7);
         var3.visitVarInsn(25, 1);
         var3.visitConstant(var7);
         var3.visitInsn(50);
         String var8 = Bytecode.getBoxingType(var1.args[var7]);
         var3.visitTypeInsn(192, var8 != null ? var8 : var1.args[var7].getInternalName());
         if (var8 != null) {
            var3.visitInsn(89);
            var3.visitJumpInsn(198, var5);
            var6 = 7;
         }

         var3.visitInsn(83);
      }

      var3.visitInsn(177);
      var3.visitLabel(var5);
      throwNPE(var3, "Argument with primitive type cannot be set to NULL");
      var3.visitInsn(177);
      var3.visitMaxs(var6, 2);
      var3.visitEnd();
   }

   private static void throwNPE(MethodVisitorEx var0, String var1) {
      var0.visitTypeInsn(187, "java/lang/NullPointerException");
      var0.visitInsn(89);
      var0.visitLdcInsn(var1);
      var0.visitMethodInsn(183, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
      var0.visitInsn(191);
   }

   private static void throwAIOOBE(MethodVisitorEx var0, int var1) {
      var0.visitTypeInsn(187, "org/spongepowered/asm/mixin/injection/invoke/arg/ArgumentIndexOutOfBoundsException");
      var0.visitInsn(89);
      var0.visitVarInsn(21, var1);
      var0.visitMethodInsn(183, "org/spongepowered/asm/mixin/injection/invoke/arg/ArgumentIndexOutOfBoundsException", "<init>", "(I)V", false);
      var0.visitInsn(191);
   }

   private static void box(MethodVisitor var0, Type var1) {
      String var2 = Bytecode.getBoxingType(var1);
      if (var2 != null) {
         String var3 = String.format("(%s)L%s;", var1.getDescriptor(), var2);
         var0.visitMethodInsn(184, var2, "valueOf", var3, false);
      }
   }

   private static void unbox(MethodVisitor var0, Type var1) {
      String var2 = Bytecode.getBoxingType(var1);
      if (var2 != null) {
         String var3 = Bytecode.getUnboxingMethod(var1);
         String var4 = "()" + var1.getDescriptor();
         var0.visitTypeInsn(192, var2);
         var0.visitMethodInsn(182, var2, var3, var4, false);
      } else {
         var0.visitTypeInsn(192, var1.getInternalName());
      }
   }

   class ArgsClassInfo extends SyntheticClassInfo {
      final String desc;
      final Type[] args;
      int loaded = 0;

      ArgsClassInfo(IMixinInfo var2, String var3, String var4) {
         super(var2, var3);
         this.desc = var4;
         this.args = Type.getArgumentTypes(var4);
      }

      @Override
      public boolean isLoaded() {
         return this.loaded > 0;
      }

      String getSignature() {
         return new SignaturePrinter("", null, this.args).setFullyQualified(true).getFormattedArgs();
      }
   }
}
