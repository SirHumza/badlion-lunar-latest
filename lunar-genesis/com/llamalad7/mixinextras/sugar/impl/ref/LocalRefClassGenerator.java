package com.llamalad7.mixinextras.sugar.impl.ref;

import com.llamalad7.mixinextras.lib.apache.commons.StringUtils;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import com.llamalad7.mixinextras.service.MixinExtrasVersion;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.GeneratedImplDummy;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.ClassGenUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.InstructionAdapter;
import org.objectweb.asm.tree.ClassNode;

public class LocalRefClassGenerator {
   private static final String IMPL_PACKAGE = StringUtils.substringBeforeLast(LocalRefClassGenerator.class.getName(), ".").replace('.', '/') + "/generated";
   private static final Map<Class<?>, String> interfaceToImpl = new HashMap<>();

   public static String getForType(Type var0) {
      Class var1 = LocalRefUtils.getInterfaceFor(var0);
      String var2 = interfaceToImpl.get(var1);
      if (var2 != null) {
         return var2;
      }

      var2 = IMPL_PACKAGE + '/' + StringUtils.substringAfterLast(var1.getName(), ".") + "Impl";
      String var3 = var0.getDescriptor();
      String var4 = var3.length() == 1 ? var3 : Type.getDescriptor(Object.class);
      interfaceToImpl.put(var1, var2);
      ClassNode var5 = new ClassNode();
      var5.visit(52, 49, var2, null, Type.getInternalName(Object.class), null);
      generateClass(var5, var2, var4, var1.getName());
      ClassGenUtils.defineClass(var5, GeneratedImplDummy.getLookup());
      return var2;
   }

   private static void generateClass(ClassNode var0, String var1, String var2, String var3) {
      Type var4 = ASMUtils.OBJECT_TYPE;
      Type var5 = Type.getType(var2);

      for (String var7 : MixinExtrasService.getInstance().getAllClassNamesAtLeast(var3, MixinExtrasVersion.V0_2_0_BETA_5)) {
         var0.interfaces.add(var7.replace('.', '/'));
      }

      var0.visitField(2, "value", var2, null, null);
      var0.visitField(2, "state", "B", null, null);
      Consumer var8 = var2x -> {
         String var3x = Type.getInternalName(LocalRefRuntime.class);
         var2x.load(0, var4);
         var2x.getfield(var1, "state", "B");
         Label var4x = new Label();
         var2x.ifeq(var4x);
         var2x.load(0, var4);
         var2x.getfield(var1, "state", "B");
         var2x.invokestatic(var3x, "checkState", "(B)V", false);
         var2x.mark(var4x);
      };
      genMethod(var0, "<init>", "()V", var2x -> {
         var2x.load(0, var4);
         var2x.invokespecial(var4.getInternalName(), "<init>", "()V", false);
         var2x.load(0, var4);
         var2x.iconst(1);
         var2x.putfield(var1, "state", "B");
         var2x.areturn(Type.VOID_TYPE);
      });
      genMethod(var0, "get", "()" + var2, var5x -> {
         var8.accept(var5x);
         var5x.load(0, var4);
         var5x.getfield(var1, "value", var2);
         var5x.areturn(var5);
      });
      genMethod(var0, "set", "(" + var2 + ")V", var5x -> {
         var8.accept(var5x);
         var5x.load(0, var4);
         var5x.load(1, var5);
         var5x.putfield(var1, "value", var2);
         var5x.areturn(Type.VOID_TYPE);
      });
      genMethod(var0, "init", "(" + var2 + ")V", var4x -> {
         var4x.load(0, var4);
         var4x.load(1, var5);
         var4x.putfield(var1, "value", var2);
         var4x.load(0, var4);
         var4x.iconst(0);
         var4x.putfield(var1, "state", "B");
         var4x.areturn(Type.VOID_TYPE);
      });
      genMethod(var0, "dispose", "()" + var2, var5x -> {
         var8.accept(var5x);
         var5x.load(0, var4);
         var5x.iconst(2);
         var5x.putfield(var1, "state", "B");
         var5x.load(0, var4);
         var5x.getfield(var1, "value", var2);
         var5x.areturn(var5);
      });
      genMethod(var0, "toString", "()Ljava/lang/String;", var4x -> {
         String var5x = Type.getInternalName(LocalRefRuntime.class);
         var4x.aconst(var3.substring(var3.lastIndexOf(46) + 1));
         var4x.load(0, var4);
         var4x.getfield(var1, "value", var2);
         var4x.invokestatic("java/lang/String", "valueOf", "(" + getToStringArgument(var2) + ")Ljava/lang/String;", false);
         var4x.load(0, var4);
         var4x.getfield(var1, "state", "B");
         var4x.invokestatic(var5x, "localRefToString", "(Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;", false);
         var4x.areturn(Type.getType(String.class));
      });
   }

   private static String getToStringArgument(String var0) {
      return !"B".equals(var0) && !"S".equals(var0) ? var0 : "I";
   }

   private static void genMethod(ClassVisitor var0, String var1, String var2, Consumer<InstructionAdapter> var3) {
      var3.accept(new InstructionAdapter(var0.visitMethod(1, var1, var2, null, null)));
   }
}
