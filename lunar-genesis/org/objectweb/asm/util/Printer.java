package org.objectweb.asm.util;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.TypePath;

public abstract class Printer {
   public static final String[] OPCODES = new String[]{
      "NOP",
      "ACONST_NULL",
      "ICONST_M1",
      "ICONST_0",
      "ICONST_1",
      "ICONST_2",
      "ICONST_3",
      "ICONST_4",
      "ICONST_5",
      "LCONST_0",
      "LCONST_1",
      "FCONST_0",
      "FCONST_1",
      "FCONST_2",
      "DCONST_0",
      "DCONST_1",
      "BIPUSH",
      "SIPUSH",
      "LDC",
      "LDC_W",
      "LDC2_W",
      "ILOAD",
      "LLOAD",
      "FLOAD",
      "DLOAD",
      "ALOAD",
      "ILOAD_0",
      "ILOAD_1",
      "ILOAD_2",
      "ILOAD_3",
      "LLOAD_0",
      "LLOAD_1",
      "LLOAD_2",
      "LLOAD_3",
      "FLOAD_0",
      "FLOAD_1",
      "FLOAD_2",
      "FLOAD_3",
      "DLOAD_0",
      "DLOAD_1",
      "DLOAD_2",
      "DLOAD_3",
      "ALOAD_0",
      "ALOAD_1",
      "ALOAD_2",
      "ALOAD_3",
      "IALOAD",
      "LALOAD",
      "FALOAD",
      "DALOAD",
      "AALOAD",
      "BALOAD",
      "CALOAD",
      "SALOAD",
      "ISTORE",
      "LSTORE",
      "FSTORE",
      "DSTORE",
      "ASTORE",
      "ISTORE_0",
      "ISTORE_1",
      "ISTORE_2",
      "ISTORE_3",
      "LSTORE_0",
      "LSTORE_1",
      "LSTORE_2",
      "LSTORE_3",
      "FSTORE_0",
      "FSTORE_1",
      "FSTORE_2",
      "FSTORE_3",
      "DSTORE_0",
      "DSTORE_1",
      "DSTORE_2",
      "DSTORE_3",
      "ASTORE_0",
      "ASTORE_1",
      "ASTORE_2",
      "ASTORE_3",
      "IASTORE",
      "LASTORE",
      "FASTORE",
      "DASTORE",
      "AASTORE",
      "BASTORE",
      "CASTORE",
      "SASTORE",
      "POP",
      "POP2",
      "DUP",
      "DUP_X1",
      "DUP_X2",
      "DUP2",
      "DUP2_X1",
      "DUP2_X2",
      "SWAP",
      "IADD",
      "LADD",
      "FADD",
      "DADD",
      "ISUB",
      "LSUB",
      "FSUB",
      "DSUB",
      "IMUL",
      "LMUL",
      "FMUL",
      "DMUL",
      "IDIV",
      "LDIV",
      "FDIV",
      "DDIV",
      "IREM",
      "LREM",
      "FREM",
      "DREM",
      "INEG",
      "LNEG",
      "FNEG",
      "DNEG",
      "ISHL",
      "LSHL",
      "ISHR",
      "LSHR",
      "IUSHR",
      "LUSHR",
      "IAND",
      "LAND",
      "IOR",
      "LOR",
      "IXOR",
      "LXOR",
      "IINC",
      "I2L",
      "I2F",
      "I2D",
      "L2I",
      "L2F",
      "L2D",
      "F2I",
      "F2L",
      "F2D",
      "D2I",
      "D2L",
      "D2F",
      "I2B",
      "I2C",
      "I2S",
      "LCMP",
      "FCMPL",
      "FCMPG",
      "DCMPL",
      "DCMPG",
      "IFEQ",
      "IFNE",
      "IFLT",
      "IFGE",
      "IFGT",
      "IFLE",
      "IF_ICMPEQ",
      "IF_ICMPNE",
      "IF_ICMPLT",
      "IF_ICMPGE",
      "IF_ICMPGT",
      "IF_ICMPLE",
      "IF_ACMPEQ",
      "IF_ACMPNE",
      "GOTO",
      "JSR",
      "RET",
      "TABLESWITCH",
      "LOOKUPSWITCH",
      "IRETURN",
      "LRETURN",
      "FRETURN",
      "DRETURN",
      "ARETURN",
      "RETURN",
      "GETSTATIC",
      "PUTSTATIC",
      "GETFIELD",
      "PUTFIELD",
      "INVOKEVIRTUAL",
      "INVOKESPECIAL",
      "INVOKESTATIC",
      "INVOKEINTERFACE",
      "INVOKEDYNAMIC",
      "NEW",
      "NEWARRAY",
      "ANEWARRAY",
      "ARRAYLENGTH",
      "ATHROW",
      "CHECKCAST",
      "INSTANCEOF",
      "MONITORENTER",
      "MONITOREXIT",
      "WIDE",
      "MULTIANEWARRAY",
      "IFNULL",
      "IFNONNULL"
   };
   public static final String[] TYPES = new String[]{"", "", "", "", "T_BOOLEAN", "T_CHAR", "T_FLOAT", "T_DOUBLE", "T_BYTE", "T_SHORT", "T_INT", "T_LONG"};
   public static final String[] HANDLE_TAG = new String[]{
      "",
      "H_GETFIELD",
      "H_GETSTATIC",
      "H_PUTFIELD",
      "H_PUTSTATIC",
      "H_INVOKEVIRTUAL",
      "H_INVOKESTATIC",
      "H_INVOKESPECIAL",
      "H_NEWINVOKESPECIAL",
      "H_INVOKEINTERFACE"
   };
   private static final String UNSUPPORTED_OPERATION = "Must be overridden";
   protected final int api;
   protected final StringBuilder stringBuilder;
   public final List<Object> text;

   protected Printer(int var1) {
      this.api = var1;
      this.stringBuilder = new StringBuilder();
      this.text = new ArrayList<>();
   }

   public abstract void visit(int var1, int var2, String var3, String var4, String var5, String[] var6);

   public abstract void visitSource(String var1, String var2);

   public Printer visitModule(String var1, int var2, String var3) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitNestHost(String var1) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract void visitOuterClass(String var1, String var2, String var3);

   public abstract Printer visitClassAnnotation(String var1, boolean var2);

   public Printer visitClassTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract void visitClassAttribute(Attribute var1);

   public void visitNestMember(String var1) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitPermittedSubclass(String var1) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract void visitInnerClass(String var1, String var2, String var3, int var4);

   public Printer visitRecordComponent(String var1, String var2, String var3) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract Printer visitField(int var1, String var2, String var3, String var4, Object var5);

   public abstract Printer visitMethod(int var1, String var2, String var3, String var4, String[] var5);

   public abstract void visitClassEnd();

   public void visitMainClass(String var1) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitPackage(String var1) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitRequire(String var1, int var2, String var3) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitExport(String var1, int var2, String... var3) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitOpen(String var1, int var2, String... var3) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitUse(String var1) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitProvide(String var1, String... var2) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitModuleEnd() {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract void visit(String var1, Object var2);

   public abstract void visitEnum(String var1, String var2, String var3);

   public abstract Printer visitAnnotation(String var1, String var2);

   public abstract Printer visitArray(String var1);

   public abstract void visitAnnotationEnd();

   public Printer visitRecordComponentAnnotation(String var1, boolean var2) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public Printer visitRecordComponentTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitRecordComponentAttribute(Attribute var1) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public void visitRecordComponentEnd() {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract Printer visitFieldAnnotation(String var1, boolean var2);

   public Printer visitFieldTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract void visitFieldAttribute(Attribute var1);

   public abstract void visitFieldEnd();

   public void visitParameter(String var1, int var2) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract Printer visitAnnotationDefault();

   public abstract Printer visitMethodAnnotation(String var1, boolean var2);

   public Printer visitMethodTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public Printer visitAnnotableParameterCount(int var1, boolean var2) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract Printer visitParameterAnnotation(int var1, String var2, boolean var3);

   public abstract void visitMethodAttribute(Attribute var1);

   public abstract void visitCode();

   public abstract void visitFrame(int var1, int var2, Object[] var3, int var4, Object[] var5);

   public abstract void visitInsn(int var1);

   public abstract void visitIntInsn(int var1, int var2);

   public abstract void visitVarInsn(int var1, int var2);

   public abstract void visitTypeInsn(int var1, String var2);

   public abstract void visitFieldInsn(int var1, String var2, String var3, String var4);

   @Deprecated
   public void visitMethodInsn(int var1, String var2, String var3, String var4) {
      this.visitMethodInsn(var1, var2, var3, var4, var1 == 185);
   }

   public void visitMethodInsn(int var1, String var2, String var3, String var4, boolean var5) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract void visitInvokeDynamicInsn(String var1, String var2, Handle var3, Object... var4);

   public abstract void visitJumpInsn(int var1, Label var2);

   public abstract void visitLabel(Label var1);

   public abstract void visitLdcInsn(Object var1);

   public abstract void visitIincInsn(int var1, int var2);

   public abstract void visitTableSwitchInsn(int var1, int var2, Label var3, Label... var4);

   public abstract void visitLookupSwitchInsn(Label var1, int[] var2, Label[] var3);

   public abstract void visitMultiANewArrayInsn(String var1, int var2);

   public Printer visitInsnAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract void visitTryCatchBlock(Label var1, Label var2, Label var3, String var4);

   public Printer visitTryCatchAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract void visitLocalVariable(String var1, String var2, String var3, Label var4, Label var5, int var6);

   public Printer visitLocalVariableAnnotation(int var1, TypePath var2, Label[] var3, Label[] var4, int[] var5, String var6, boolean var7) {
      throw new UnsupportedOperationException("Must be overridden");
   }

   public abstract void visitLineNumber(int var1, Label var2);

   public abstract void visitMaxs(int var1, int var2);

   public abstract void visitMethodEnd();

   public List<Object> getText() {
      return this.text;
   }

   public void print(PrintWriter var1) {
      printList(var1, this.text);
   }

   static void printList(PrintWriter var0, List<?> var1) {
      for (Object var3 : var1) {
         if (var3 instanceof List) {
            printList(var0, (List<?>)var3);
         } else {
            var0.print(var3.toString());
         }
      }
   }

   public static void appendString(StringBuilder var0, String var1) {
      var0.append('"');

      for (int var2 = 0; var2 < var1.length(); var2++) {
         char var3 = var1.charAt(var2);
         if (var3 == '\n') {
            var0.append("\\n");
         } else if (var3 == '\r') {
            var0.append("\\r");
         } else if (var3 == '\\') {
            var0.append("\\\\");
         } else if (var3 == '"') {
            var0.append("\\\"");
         } else if (var3 >= ' ' && var3 <= 127) {
            var0.append(var3);
         } else {
            var0.append("\\u");
            if (var3 < 16) {
               var0.append("000");
            } else if (var3 < 256) {
               var0.append("00");
            } else if (var3 < 4096) {
               var0.append('0');
            }

            var0.append(Integer.toString(var3, 16));
         }
      }

      var0.append('"');
   }

   static void main(String[] var0, String var1, Printer var2, PrintWriter var3, PrintWriter var4) {
      if (var0.length >= 1 && var0.length <= 2 && (!var0[0].equals("-debug") && !var0[0].equals("-nodebug") || var0.length == 2)) {
         TraceClassVisitor var5 = new TraceClassVisitor(null, var2, var3);
         String var6;
         byte var7;
         if (var0[0].equals("-nodebug")) {
            var6 = var0[1];
            var7 = 2;
         } else {
            var6 = var0[0];
            var7 = 0;
         }

         if (!var6.endsWith(".class") && var6.indexOf(92) == -1 && var6.indexOf(47) == -1) {
            new ClassReader(var6).accept(var5, var7);
         } else {
            FileInputStream var8 = new FileInputStream(var6);

            try {
               new ClassReader(var8).accept(var5, var7);
            } catch (Throwable var12) {
               try {
                  var8.close();
               } catch (Throwable var11) {
               }

               throw var12;
            }

            var8.close();
         }
      } else {
         var4.println(var1);
      }
   }
}
