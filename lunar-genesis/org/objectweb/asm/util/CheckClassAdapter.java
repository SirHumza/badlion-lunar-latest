package org.objectweb.asm.util;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.ModuleVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.tree.analysis.SimpleVerifier;

public class CheckClassAdapter extends ClassVisitor {
   private static final String USAGE = "Verifies the given class.\nUsage: CheckClassAdapter <fully qualified class name or class file name>";
   private static final String ERROR_AT = ": error at index ";
   private boolean checkDataFlow;
   private int version;
   private boolean visitCalled;
   private boolean visitModuleCalled;
   private boolean visitSourceCalled;
   private boolean visitOuterClassCalled;
   private boolean visitNestHostCalled;
   private String nestMemberPackageName;
   private boolean visitEndCalled;
   private Map<Label, Integer> labelInsnIndices = new HashMap<>();

   public CheckClassAdapter(ClassVisitor var1) {
      this(var1, true);
   }

   public CheckClassAdapter(ClassVisitor var1, boolean var2) {
      this(589824, var1, var2);
      if (this.getClass() != CheckClassAdapter.class) {
         throw new IllegalStateException();
      }
   }

   protected CheckClassAdapter(int var1, ClassVisitor var2, boolean var3) {
      super(var1, var2);
      this.checkDataFlow = var3;
   }

   @Override
   public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      if (this.visitCalled) {
         throw new IllegalStateException("visit must be called only once");
      }

      this.visitCalled = true;
      this.checkState();
      checkAccess(var2, 259633);
      if (var3 == null) {
         throw new IllegalArgumentException("Illegal class name (null)");
      }

      if (!var3.endsWith("package-info") && !var3.endsWith("module-info")) {
         CheckMethodAdapter.checkInternalName(var1, var3, "class name");
      }

      if ("java/lang/Object".equals(var3)) {
         if (var5 != null) {
            throw new IllegalArgumentException("The super class name of the Object class must be 'null'");
         }
      } else if (var3.endsWith("module-info")) {
         if (var5 != null) {
            throw new IllegalArgumentException("The super class name of a module-info class must be 'null'");
         }
      } else {
         CheckMethodAdapter.checkInternalName(var1, var5, "super class name");
      }

      if (var4 != null) {
         checkClassSignature(var4);
      }

      if ((var2 & 512) != 0 && !"java/lang/Object".equals(var5)) {
         throw new IllegalArgumentException("The super class name of interfaces must be 'java/lang/Object'");
      }

      if (var6 != null) {
         for (int var7 = 0; var7 < var6.length; var7++) {
            CheckMethodAdapter.checkInternalName(var1, var6[var7], stringConcat$0(var7));
         }
      }

      this.version = var1;
      super.visit(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void visitSource(String var1, String var2) {
      this.checkState();
      if (this.visitSourceCalled) {
         throw new IllegalStateException("visitSource can be called only once.");
      }

      this.visitSourceCalled = true;
      super.visitSource(var1, var2);
   }

   @Override
   public ModuleVisitor visitModule(String var1, int var2, String var3) {
      this.checkState();
      if (this.visitModuleCalled) {
         throw new IllegalStateException("visitModule can be called only once.");
      }

      this.visitModuleCalled = true;
      checkFullyQualifiedName(this.version, var1, "module name");
      checkAccess(var2, 36896);
      CheckModuleAdapter var4 = new CheckModuleAdapter(this.api, super.visitModule(var1, var2, var3), (var2 & 32) != 0);
      var4.classVersion = this.version;
      return var4;
   }

   @Override
   public void visitNestHost(String var1) {
      this.checkState();
      CheckMethodAdapter.checkInternalName(this.version, var1, "nestHost");
      if (this.visitNestHostCalled) {
         throw new IllegalStateException("visitNestHost can be called only once.");
      }

      if (this.nestMemberPackageName != null) {
         throw new IllegalStateException("visitNestHost and visitNestMember are mutually exclusive.");
      }

      this.visitNestHostCalled = true;
      super.visitNestHost(var1);
   }

   @Override
   public void visitNestMember(String var1) {
      this.checkState();
      CheckMethodAdapter.checkInternalName(this.version, var1, "nestMember");
      if (this.visitNestHostCalled) {
         throw new IllegalStateException("visitMemberOfNest and visitNestHost are mutually exclusive.");
      }

      String var2 = packageName(var1);
      if (this.nestMemberPackageName == null) {
         this.nestMemberPackageName = var2;
      } else if (!this.nestMemberPackageName.equals(var2)) {
         throw new IllegalStateException(stringConcat$1(var1, this.nestMemberPackageName));
      }

      super.visitNestMember(var1);
   }

   @Override
   public void visitPermittedSubclass(String var1) {
      this.checkState();
      CheckMethodAdapter.checkInternalName(this.version, var1, "permittedSubclass");
      super.visitPermittedSubclass(var1);
   }

   @Override
   public void visitOuterClass(String var1, String var2, String var3) {
      this.checkState();
      if (this.visitOuterClassCalled) {
         throw new IllegalStateException("visitOuterClass can be called only once.");
      }

      this.visitOuterClassCalled = true;
      if (var1 == null) {
         throw new IllegalArgumentException("Illegal outer class owner");
      }

      if (var3 != null) {
         CheckMethodAdapter.checkMethodDescriptor(this.version, var3);
      }

      super.visitOuterClass(var1, var2, var3);
   }

   @Override
   public void visitInnerClass(String var1, String var2, String var3, int var4) {
      this.checkState();
      CheckMethodAdapter.checkInternalName(this.version, var1, "class name");
      if (var2 != null) {
         CheckMethodAdapter.checkInternalName(this.version, var2, "outer class name");
      }

      if (var3 != null) {
         int var5 = 0;

         while (var5 < var3.length() && Character.isDigit(var3.charAt(var5))) {
            var5++;
         }

         if (var5 == 0 || var5 < var3.length()) {
            CheckMethodAdapter.checkIdentifier(this.version, var3, var5, -1, "inner class name");
         }
      }

      checkAccess(var4, 30239);
      super.visitInnerClass(var1, var2, var3, var4);
   }

   @Override
   public RecordComponentVisitor visitRecordComponent(String var1, String var2, String var3) {
      this.checkState();
      CheckMethodAdapter.checkUnqualifiedName(this.version, var1, "record component name");
      CheckMethodAdapter.checkDescriptor(this.version, var2, false);
      if (var3 != null) {
         checkFieldSignature(var3);
      }

      return new CheckRecordComponentAdapter(this.api, super.visitRecordComponent(var1, var2, var3));
   }

   @Override
   public FieldVisitor visitField(int var1, String var2, String var3, String var4, Object var5) {
      this.checkState();
      checkAccess(var1, 184543);
      CheckMethodAdapter.checkUnqualifiedName(this.version, var2, "field name");
      CheckMethodAdapter.checkDescriptor(this.version, var3, false);
      if (var4 != null) {
         checkFieldSignature(var4);
      }

      if (var5 != null) {
         CheckMethodAdapter.checkConstant(var5);
      }

      return new CheckFieldAdapter(this.api, super.visitField(var1, var2, var3, var4, var5));
   }

   @Override
   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      this.checkState();
      checkMethodAccess(this.version, var1, 171519);
      if (!"<init>".equals(var2) && !"<clinit>".equals(var2)) {
         CheckMethodAdapter.checkMethodIdentifier(this.version, var2, "method name");
      }

      CheckMethodAdapter.checkMethodDescriptor(this.version, var3);
      if (var4 != null) {
         checkMethodSignature(var4);
      }

      if (var5 != null) {
         for (int var6 = 0; var6 < var5.length; var6++) {
            CheckMethodAdapter.checkInternalName(this.version, var5[var6], stringConcat$2(var6));
         }
      }

      MethodVisitor var7 = super.visitMethod(var1, var2, var3, var4, var5);
      CheckMethodAdapter var8;
      if (this.checkDataFlow) {
         if (this.cv instanceof ClassWriter) {
            var7 = new CheckMethodAdapter.MethodWriterWrapper(this.api, this.version, (ClassWriter)this.cv, var7);
         }

         var8 = new CheckMethodAdapter(this.api, var1, var2, var3, var7, this.labelInsnIndices);
      } else {
         var8 = new CheckMethodAdapter(this.api, var7, this.labelInsnIndices);
      }

      var8.version = this.version;
      return var8;
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      this.checkState();
      CheckMethodAdapter.checkDescriptor(this.version, var1, false);
      return new CheckAnnotationAdapter(super.visitAnnotation(var1, var2));
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      this.checkState();
      int var5 = new TypeReference(var1).getSort();
      if (var5 != 0 && var5 != 17 && var5 != 16) {
         throw new IllegalArgumentException(stringConcat$3(Integer.toHexString(var5)));
      }

      checkTypeRef(var1);
      CheckMethodAdapter.checkDescriptor(this.version, var3, false);
      return new CheckAnnotationAdapter(super.visitTypeAnnotation(var1, var2, var3, var4));
   }

   @Override
   public void visitAttribute(Attribute var1) {
      this.checkState();
      if (var1 == null) {
         throw new IllegalArgumentException("Invalid attribute (must not be null)");
      }

      super.visitAttribute(var1);
   }

   @Override
   public void visitEnd() {
      this.checkState();
      this.visitEndCalled = true;
      super.visitEnd();
   }

   private void checkState() {
      if (!this.visitCalled) {
         throw new IllegalStateException("Cannot visit member before visit has been called.");
      }

      if (this.visitEndCalled) {
         throw new IllegalStateException("Cannot visit member after visitEnd has been called.");
      }
   }

   static void checkAccess(int var0, int var1) {
      if ((var0 & ~var1) != 0) {
         throw new IllegalArgumentException(stringConcat$4(var0));
      }

      byte var2 = 7;
      if (Integer.bitCount(var0 & var2) > 1) {
         throw new IllegalArgumentException(stringConcat$5(var0));
      }

      if (Integer.bitCount(var0 & 1040) > 1) {
         throw new IllegalArgumentException(stringConcat$6(var0));
      }
   }

   private static void checkMethodAccess(int var0, int var1, int var2) {
      checkAccess(var1, var2);
      if ((var0 & 65535) < 61 && Integer.bitCount(var1 & 3072) > 1) {
         throw new IllegalArgumentException(stringConcat$7(var1));
      }
   }

   static void checkFullyQualifiedName(int var0, String var1, String var2) {
      try {
         int var3 = 0;

         int var4;
         while ((var4 = var1.indexOf(46, var3 + 1)) != -1) {
            CheckMethodAdapter.checkIdentifier(var0, var1, var3, var4, null);
            var3 = var4 + 1;
         }

         CheckMethodAdapter.checkIdentifier(var0, var1, var3, var1.length(), null);
      } catch (IllegalArgumentException var5) {
         throw new IllegalArgumentException(stringConcat$8(var2, var1), var5);
      }
   }

   public static void checkClassSignature(String var0) {
      int var1 = 0;
      if (getChar(var0, 0) == '<') {
         var1 = checkTypeParameters(var0, var1);
      }

      var1 = checkClassTypeSignature(var0, var1);

      while (getChar(var0, var1) == 'L') {
         var1 = checkClassTypeSignature(var0, var1);
      }

      if (var1 != var0.length()) {
         throw new IllegalArgumentException(stringConcat$9(var0, var1));
      }
   }

   public static void checkMethodSignature(String var0) {
      int var1 = 0;
      if (getChar(var0, 0) == '<') {
         var1 = checkTypeParameters(var0, var1);
      }

      var1 = checkChar('(', var0, var1);

      while ("ZCBSIFJDL[T".indexOf(getChar(var0, var1)) != -1) {
         var1 = checkJavaTypeSignature(var0, var1);
      }

      var1 = checkChar(')', var0, var1);
      if (getChar(var0, var1) == 'V') {
         var1++;
      } else {
         var1 = checkJavaTypeSignature(var0, var1);
      }

      while (getChar(var0, var1) == '^') {
         if (getChar(var0, ++var1) == 'L') {
            var1 = checkClassTypeSignature(var0, var1);
         } else {
            var1 = checkTypeVariableSignature(var0, var1);
         }
      }

      if (var1 != var0.length()) {
         throw new IllegalArgumentException(stringConcat$10(var0, var1));
      }
   }

   public static void checkFieldSignature(String var0) {
      int var1 = checkReferenceTypeSignature(var0, 0);
      if (var1 != var0.length()) {
         throw new IllegalArgumentException(stringConcat$11(var0, var1));
      }
   }

   private static int checkTypeParameters(String var0, int var1) {
      int var2 = var1;
      var2 = checkChar('<', var0, var2);
      var2 = checkTypeParameter(var0, var2);

      while (getChar(var0, var2) != '>') {
         var2 = checkTypeParameter(var0, var2);
      }

      return var2 + 1;
   }

   private static int checkTypeParameter(String var0, int var1) {
      int var2 = var1;
      var2 = checkSignatureIdentifier(var0, var2);
      var2 = checkChar(':', var0, var2);
      if ("L[T".indexOf(getChar(var0, var2)) != -1) {
         var2 = checkReferenceTypeSignature(var0, var2);
      }

      while (getChar(var0, var2) == ':') {
         var2 = checkReferenceTypeSignature(var0, var2 + 1);
      }

      return var2;
   }

   private static int checkReferenceTypeSignature(String var0, int var1) {
      switch (getChar(var0, var1)) {
         case 'L':
            return checkClassTypeSignature(var0, var1);
         case '[':
            return checkJavaTypeSignature(var0, var1 + 1);
         default:
            return checkTypeVariableSignature(var0, var1);
      }
   }

   private static int checkClassTypeSignature(String var0, int var1) {
      int var2 = var1;
      var2 = checkChar('L', var0, var2);
      var2 = checkSignatureIdentifier(var0, var2);

      while (getChar(var0, var2) == '/') {
         var2 = checkSignatureIdentifier(var0, var2 + 1);
      }

      if (getChar(var0, var2) == '<') {
         var2 = checkTypeArguments(var0, var2);
      }

      while (getChar(var0, var2) == '.') {
         var2 = checkSignatureIdentifier(var0, var2 + 1);
         if (getChar(var0, var2) == '<') {
            var2 = checkTypeArguments(var0, var2);
         }
      }

      return checkChar((char)59, var0, var2);
   }

   private static int checkTypeArguments(String var0, int var1) {
      int var2 = var1;
      var2 = checkChar('<', var0, var2);
      var2 = checkTypeArgument(var0, var2);

      while (getChar(var0, var2) != '>') {
         var2 = checkTypeArgument(var0, var2);
      }

      return var2 + 1;
   }

   private static int checkTypeArgument(String var0, int var1) {
      int var2 = var1;
      char var3 = getChar(var0, var2);
      if (var3 == '*') {
         return var2 + 1;
      }

      if (var3 == '+' || var3 == '-') {
         var2++;
      }

      return checkReferenceTypeSignature(var0, var2);
   }

   private static int checkTypeVariableSignature(String var0, int var1) {
      int var2 = var1;
      var2 = checkChar('T', var0, var2);
      var2 = checkSignatureIdentifier(var0, var2);
      return checkChar((char)59, var0, var2);
   }

   private static int checkJavaTypeSignature(String var0, int var1) {
      int var2 = var1;
      switch (getChar(var0, var2)) {
         case 'B':
         case 'C':
         case 'D':
         case 'F':
         case 'I':
         case 'J':
         case 'S':
         case 'Z':
            return var2 + 1;
         case 'E':
         case 'G':
         case 'H':
         case 'K':
         case 'L':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'T':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         default:
            return checkReferenceTypeSignature(var0, var2);
      }
   }

   private static int checkSignatureIdentifier(String var0, int var1) {
      int var2 = var1;

      while (var2 < var0.length() && ".;[/<>:".indexOf(var0.codePointAt(var2)) == -1) {
         var2 = var0.offsetByCodePoints(var2, 1);
      }

      if (var2 == var1) {
         throw new IllegalArgumentException(stringConcat$12(var0, var1));
      } else {
         return var2;
      }
   }

   private static int checkChar(char var0, String var1, int var2) {
      if (getChar(var1, var2) == var0) {
         return var2 + 1;
      } else {
         throw new IllegalArgumentException(stringConcat$13(var1, var0, var2));
      }
   }

   private static char getChar(String var0, int var1) {
      return var1 < var0.length() ? var0.charAt(var1) : '\u0000';
   }

   static void checkTypeRef(int var0) {
      int var1 = 0;
      switch (var0 >>> 24) {
         case 0:
         case 1:
         case 22:
            var1 = -65536;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         default:
            break;
         case 16:
         case 17:
         case 18:
         case 23:
         case 66:
            var1 = -256;
            break;
         case 19:
         case 20:
         case 21:
         case 64:
         case 65:
         case 67:
         case 68:
         case 69:
         case 70:
            var1 = -16777216;
            break;
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            var1 = -16776961;
      }

      if (var1 == 0 || (var0 & ~var1) != 0) {
         throw new IllegalArgumentException(stringConcat$14(Integer.toHexString(var0)));
      }
   }

   private static String packageName(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 == -1 ? "" : var0.substring(0, var1);
   }

   public static void main(String[] var0) {
      main(var0, new PrintWriter(System.err, true));
   }

   static void main(String[] var0, PrintWriter var1) {
      if (var0.length != 1) {
         var1.println("Verifies the given class.\nUsage: CheckClassAdapter <fully qualified class name or class file name>");
      } else {
         ClassReader var2;
         if (var0[0].endsWith(".class")) {
            FileInputStream var3 = new FileInputStream(var0[0]);

            try {
               var2 = new ClassReader(var3);
            } catch (Throwable var7) {
               try {
                  var3.close();
               } catch (Throwable var6) {
               }

               throw var7;
            }

            var3.close();
         } else {
            var2 = new ClassReader(var0[0]);
         }

         verify(var2, false, var1);
      }
   }

   public static void verify(ClassReader var0, boolean var1, PrintWriter var2) {
      verify(var0, null, var1, var2);
   }

   public static void verify(ClassReader var0, ClassLoader var1, boolean var2, PrintWriter var3) {
      ClassNode var4 = new ClassNode();
      var0.accept(new CheckClassAdapter(589824, var4, false) {}, 2);
      Type var5 = var4.superName == null ? null : Type.getObjectType(var4.superName);
      List var6 = var4.methods;
      ArrayList var7 = new ArrayList();

      for (String var9 : var4.interfaces) {
         var7.add(Type.getObjectType(var9));
      }

      for (MethodNode var15 : var6) {
         SimpleVerifier var10 = new SimpleVerifier(Type.getObjectType(var4.name), var5, var7, (var4.access & 512) != 0);
         Analyzer var11 = new Analyzer<>(var10);
         if (var1 != null) {
            var10.setClassLoader(var1);
         }

         try {
            var11.analyze(var4.name, var15);
         } catch (AnalyzerException var13) {
            var13.printStackTrace(var3);
         }

         if (var2) {
            printAnalyzerResult(var15, var11, var3);
         }
      }

      var3.flush();
   }

   static void printAnalyzerResult(MethodNode var0, Analyzer<BasicValue> var1, PrintWriter var2) {
      Textifier var3 = new Textifier();
      TraceMethodVisitor var4 = new TraceMethodVisitor(var3);
      var2.println(stringConcat$15(var0.name, var0.desc));

      for (int var5 = 0; var5 < var0.instructions.size(); var5++) {
         var0.instructions.get(var5).accept(var4);
         StringBuilder var6 = new StringBuilder();
         Frame var7 = var1.getFrames()[var5];
         if (var7 == null) {
            var6.append('?');
         } else {
            for (int var8 = 0; var8 < var7.getLocals(); var8++) {
               var6.append(getUnqualifiedName(((BasicValue)var7.getLocal(var8)).toString())).append(' ');
            }

            var6.append(" : ");

            for (int var11 = 0; var11 < var7.getStackSize(); var11++) {
               var6.append(getUnqualifiedName(((BasicValue)var7.getStack(var11)).toString())).append(' ');
            }
         }

         while (var6.length() < var0.maxStack + var0.maxLocals + 1) {
            var6.append(' ');
         }

         var2.print(Integer.toString(var5 + 100000).substring(1));
         var2.print(stringConcat$16(String.valueOf(var6), String.valueOf(var3.text.get(var3.text.size() - 1))));
      }

      for (TryCatchBlockNode var10 : var0.tryCatchBlocks) {
         var10.accept(var4);
         var2.print(stringConcat$17(String.valueOf(var3.text.get(var3.text.size() - 1))));
      }

      var2.println();
   }

   private static String getUnqualifiedName(String var0) {
      int var1 = var0.lastIndexOf(47);
      if (var1 == -1) {
         return var0;
      }

      int var2 = var0.length();
      if (var0.charAt(var2 - 1) == ';') {
         var2--;
      }

      int var3 = var0.lastIndexOf(91);
      return var3 == -1 ? var0.substring(var1 + 1, var2) : stringConcat$18(var0.substring(0, var3 + 1), var0.substring(var1 + 1, var2));
   }
}
