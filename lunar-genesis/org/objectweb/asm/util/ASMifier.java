package org.objectweb.asm.util;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

public class ASMifier extends Printer {
   private static final String USAGE = "Prints the ASM code to generate the given class.\nUsage: ASMifier [-nodebug] <fully qualified class name or class file name>";
   private static final int ACCESS_CLASS = 262144;
   private static final int ACCESS_FIELD = 524288;
   private static final int ACCESS_INNER = 1048576;
   private static final int ACCESS_MODULE = 2097152;
   private static final String ANNOTATION_VISITOR = "annotationVisitor";
   private static final String ANNOTATION_VISITOR0 = "annotationVisitor0 = ";
   private static final String COMMA = "\", \"";
   private static final String END_ARRAY = " });\n";
   private static final String END_PARAMETERS = ");\n\n";
   private static final String NEW_OBJECT_ARRAY = ", new Object[] {";
   private static final String VISIT_END = ".visitEnd();\n";
   private static final List<String> FRAME_TYPES = Collections.unmodifiableList(
      Arrays.asList("Opcodes.TOP", "Opcodes.INTEGER", "Opcodes.FLOAT", "Opcodes.DOUBLE", "Opcodes.LONG", "Opcodes.NULL", "Opcodes.UNINITIALIZED_THIS")
   );
   private static final Map<Integer, String> CLASS_VERSIONS;
   protected final String name;
   protected final int id;
   protected Map<Label, String> labelNames;

   public ASMifier() {
      this(589824, "classWriter", 0);
      if (this.getClass() != ASMifier.class) {
         throw new IllegalStateException();
      }
   }

   protected ASMifier(int var1, String var2, int var3) {
      super(var1);
      this.name = var2;
      this.id = var3;
   }

   public static void main(String[] var0) {
      main(var0, new PrintWriter(System.out, true), new PrintWriter(System.err, true));
   }

   static void main(String[] var0, PrintWriter var1, PrintWriter var2) {
      main(
         var0,
         "Prints the ASM code to generate the given class.\nUsage: ASMifier [-nodebug] <fully qualified class name or class file name>",
         new ASMifier(),
         var1,
         var2
      );
   }

   @Override
   public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      String var7;
      if (var3 == null) {
         var7 = "module-info";
      } else {
         int var8 = var3.lastIndexOf(47);
         if (var8 == -1) {
            var7 = var3;
         } else {
            this.text.add(stringConcat$0(var3.substring(0, var8).replace('/', '.')));
            var7 = var3.substring(var8 + 1).replaceAll("[-\\(\\)]", "_");
         }
      }

      this.text.add("import org.objectweb.asm.AnnotationVisitor;\n");
      this.text.add("import org.objectweb.asm.Attribute;\n");
      this.text.add("import org.objectweb.asm.ClassReader;\n");
      this.text.add("import org.objectweb.asm.ClassWriter;\n");
      this.text.add("import org.objectweb.asm.ConstantDynamic;\n");
      this.text.add("import org.objectweb.asm.FieldVisitor;\n");
      this.text.add("import org.objectweb.asm.Handle;\n");
      this.text.add("import org.objectweb.asm.Label;\n");
      this.text.add("import org.objectweb.asm.MethodVisitor;\n");
      this.text.add("import org.objectweb.asm.Opcodes;\n");
      this.text.add("import org.objectweb.asm.RecordComponentVisitor;\n");
      this.text.add("import org.objectweb.asm.Type;\n");
      this.text.add("import org.objectweb.asm.TypePath;\n");
      this.text.add(stringConcat$1(var7));
      this.text.add("public static byte[] dump () throws Exception {\n\n");
      this.text.add("ClassWriter classWriter = new ClassWriter(0);\n");
      this.text.add("FieldVisitor fieldVisitor;\n");
      this.text.add("RecordComponentVisitor recordComponentVisitor;\n");
      this.text.add("MethodVisitor methodVisitor;\n");
      this.text.add("AnnotationVisitor annotationVisitor0;\n\n");
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("classWriter.visit(");
      String var10 = CLASS_VERSIONS.get(var1);
      if (var10 != null) {
         this.stringBuilder.append(var10);
      } else {
         this.stringBuilder.append(var1);
      }

      this.stringBuilder.append(", ");
      this.appendAccessFlags(var2 | 262144);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(", ");
      this.appendConstant(var4);
      this.stringBuilder.append(", ");
      this.appendConstant(var5);
      this.stringBuilder.append(", ");
      if (var6 != null && var6.length > 0) {
         this.stringBuilder.append("new String[] {");

         for (int var9 = 0; var9 < var6.length; var9++) {
            this.stringBuilder.append(var9 == 0 ? " " : ", ");
            this.appendConstant(var6[var9]);
         }

         this.stringBuilder.append(" }");
      } else {
         this.stringBuilder.append("null");
      }

      this.stringBuilder.append(");\n\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitSource(String var1, String var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("classWriter.visitSource(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(");\n\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public Printer visitModule(String var1, int var2, String var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("{\nModuleVisitor moduleVisitor = classWriter.visitModule(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendAccessFlags(var2 | 2097152);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(");\n\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var4 = this.createASMifier("moduleVisitor", 0);
      this.text.add(var4.getText());
      this.text.add("}\n");
      return var4;
   }

   @Override
   public void visitNestHost(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("classWriter.visitNestHost(");
      this.appendConstant(var1);
      this.stringBuilder.append(");\n\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitOuterClass(String var1, String var2, String var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("classWriter.visitOuterClass(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(");\n\n");
      this.text.add(this.stringBuilder.toString());
   }

   public ASMifier visitClassAnnotation(String var1, boolean var2) {
      return this.visitAnnotation(var1, var2);
   }

   public ASMifier visitClassTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation(var1, var2, var3, var4);
   }

   @Override
   public void visitClassAttribute(Attribute var1) {
      this.visitAttribute(var1);
   }

   @Override
   public void visitNestMember(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("classWriter.visitNestMember(");
      this.appendConstant(var1);
      this.stringBuilder.append(");\n\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitPermittedSubclass(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("classWriter.visitPermittedSubclass(");
      this.appendConstant(var1);
      this.stringBuilder.append(");\n\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitInnerClass(String var1, String var2, String var3, int var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("classWriter.visitInnerClass(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(", ");
      this.appendAccessFlags(var4 | 1048576);
      this.stringBuilder.append(");\n\n");
      this.text.add(this.stringBuilder.toString());
   }

   public ASMifier visitRecordComponent(String var1, String var2, String var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("{\nrecordComponentVisitor = classWriter.visitRecordComponent(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var4 = this.createASMifier("recordComponentVisitor", 0);
      this.text.add(var4.getText());
      this.text.add("}\n");
      return var4;
   }

   public ASMifier visitField(int var1, String var2, String var3, String var4, Object var5) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("{\nfieldVisitor = classWriter.visitField(");
      this.appendAccessFlags(var1 | 524288);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(", ");
      this.appendConstant(var4);
      this.stringBuilder.append(", ");
      this.appendConstant(var5);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var6 = this.createASMifier("fieldVisitor", 0);
      this.text.add(var6.getText());
      this.text.add("}\n");
      return var6;
   }

   public ASMifier visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("{\nmethodVisitor = classWriter.visitMethod(");
      this.appendAccessFlags(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(", ");
      this.appendConstant(var4);
      this.stringBuilder.append(", ");
      if (var5 != null && var5.length > 0) {
         this.stringBuilder.append("new String[] {");

         for (int var6 = 0; var6 < var5.length; var6++) {
            this.stringBuilder.append(var6 == 0 ? " " : ", ");
            this.appendConstant(var5[var6]);
         }

         this.stringBuilder.append(" }");
      } else {
         this.stringBuilder.append("null");
      }

      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var7 = this.createASMifier("methodVisitor", 0);
      this.text.add(var7.getText());
      this.text.add("}\n");
      return var7;
   }

   @Override
   public void visitClassEnd() {
      this.text.add("classWriter.visitEnd();\n\n");
      this.text.add("return classWriter.toByteArray();\n");
      this.text.add("}\n");
      this.text.add("}\n");
   }

   @Override
   public void visitMainClass(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("moduleVisitor.visitMainClass(");
      this.appendConstant(var1);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitPackage(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("moduleVisitor.visitPackage(");
      this.appendConstant(var1);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitRequire(String var1, int var2, String var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("moduleVisitor.visitRequire(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendAccessFlags(var2 | 2097152);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitExport(String var1, int var2, String... var3) {
      this.visitExportOrOpen("moduleVisitor.visitExport(", var1, var2, var3);
   }

   @Override
   public void visitOpen(String var1, int var2, String... var3) {
      this.visitExportOrOpen("moduleVisitor.visitOpen(", var1, var2, var3);
   }

   private void visitExportOrOpen(String var1, String var2, int var3, String... var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(var1);
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendAccessFlags(var3 | 2097152);
      if (var4 != null && var4.length > 0) {
         this.stringBuilder.append(", new String[] {");

         for (int var5 = 0; var5 < var4.length; var5++) {
            this.stringBuilder.append(var5 == 0 ? " " : ", ");
            this.appendConstant(var4[var5]);
         }

         this.stringBuilder.append(" }");
      }

      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitUse(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("moduleVisitor.visitUse(");
      this.appendConstant(var1);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitProvide(String var1, String... var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("moduleVisitor.visitProvide(");
      this.appendConstant(var1);
      this.stringBuilder.append(",  new String[] {");

      for (int var3 = 0; var3 < var2.length; var3++) {
         this.stringBuilder.append(var3 == 0 ? " " : ", ");
         this.appendConstant(var2[var3]);
      }

      this.stringBuilder.append(" });\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitModuleEnd() {
      this.text.add("moduleVisitor.visitEnd();\n");
   }

   @Override
   public void visit(String var1, Object var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("annotationVisitor").append(this.id).append(".visit(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitEnum(String var1, String var2, String var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("annotationVisitor").append(this.id).append(".visitEnum(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   public ASMifier visitAnnotation(String var1, String var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder
         .append("{\nAnnotationVisitor annotationVisitor")
         .append(this.id + 1)
         .append(" = annotationVisitor")
         .append(this.id)
         .append(".visitAnnotation(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var3 = this.createASMifier("annotationVisitor", this.id + 1);
      this.text.add(var3.getText());
      this.text.add("}\n");
      return var3;
   }

   public ASMifier visitArray(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder
         .append("{\nAnnotationVisitor annotationVisitor")
         .append(this.id + 1)
         .append(" = annotationVisitor")
         .append(this.id)
         .append(".visitArray(");
      this.appendConstant(var1);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var2 = this.createASMifier("annotationVisitor", this.id + 1);
      this.text.add(var2.getText());
      this.text.add("}\n");
      return var2;
   }

   @Override
   public void visitAnnotationEnd() {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("annotationVisitor").append(this.id).append(".visitEnd();\n");
      this.text.add(this.stringBuilder.toString());
   }

   public ASMifier visitRecordComponentAnnotation(String var1, boolean var2) {
      return this.visitAnnotation(var1, var2);
   }

   public ASMifier visitRecordComponentTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation(var1, var2, var3, var4);
   }

   @Override
   public void visitRecordComponentAttribute(Attribute var1) {
      this.visitAttribute(var1);
   }

   @Override
   public void visitRecordComponentEnd() {
      this.visitMemberEnd();
   }

   public ASMifier visitFieldAnnotation(String var1, boolean var2) {
      return this.visitAnnotation(var1, var2);
   }

   public ASMifier visitFieldTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation(var1, var2, var3, var4);
   }

   @Override
   public void visitFieldAttribute(Attribute var1) {
      this.visitAttribute(var1);
   }

   @Override
   public void visitFieldEnd() {
      this.visitMemberEnd();
   }

   @Override
   public void visitParameter(String var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitParameter(");
      if (var1 == null) {
         this.stringBuilder.append("null");
      } else {
         appendString(this.stringBuilder, var1);
      }

      this.stringBuilder.append(", ");
      this.appendAccessFlags(var2);
      this.text.add(this.stringBuilder.append(");\n").toString());
   }

   public ASMifier visitAnnotationDefault() {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("{\n").append("annotationVisitor0 = ").append(this.name).append(".visitAnnotationDefault();\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var1 = this.createASMifier("annotationVisitor", 0);
      this.text.add(var1.getText());
      this.text.add("}\n");
      return var1;
   }

   public ASMifier visitMethodAnnotation(String var1, boolean var2) {
      return this.visitAnnotation(var1, var2);
   }

   public ASMifier visitMethodTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation(var1, var2, var3, var4);
   }

   public ASMifier visitAnnotableParameterCount(int var1, boolean var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitAnnotableParameterCount(").append(var1).append(", ").append(var2).append(");\n");
      this.text.add(this.stringBuilder.toString());
      return this;
   }

   public ASMifier visitParameterAnnotation(int var1, String var2, boolean var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("{\n").append("annotationVisitor0 = ").append(this.name).append(".visitParameterAnnotation(").append(var1).append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ").append(var3).append(");\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var4 = this.createASMifier("annotationVisitor", 0);
      this.text.add(var4.getText());
      this.text.add("}\n");
      return var4;
   }

   @Override
   public void visitMethodAttribute(Attribute var1) {
      this.visitAttribute(var1);
   }

   @Override
   public void visitCode() {
      this.text.add(stringConcat$2(this.name));
   }

   @Override
   public void visitFrame(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      this.stringBuilder.setLength(0);
      switch (var1) {
         case -1:
         case 0:
            this.declareFrameTypes(var2, var3);
            this.declareFrameTypes(var4, var5);
            if (var1 == -1) {
               this.stringBuilder.append(this.name).append(".visitFrame(Opcodes.F_NEW, ");
            } else {
               this.stringBuilder.append(this.name).append(".visitFrame(Opcodes.F_FULL, ");
            }

            this.stringBuilder.append(var2).append(", new Object[] {");
            this.appendFrameTypes(var2, var3);
            this.stringBuilder.append("}, ").append(var4).append(", new Object[] {");
            this.appendFrameTypes(var4, var5);
            this.stringBuilder.append('}');
            break;
         case 1:
            this.declareFrameTypes(var2, var3);
            this.stringBuilder.append(this.name).append(".visitFrame(Opcodes.F_APPEND,").append(var2).append(", new Object[] {");
            this.appendFrameTypes(var2, var3);
            this.stringBuilder.append("}, 0, null");
            break;
         case 2:
            this.stringBuilder.append(this.name).append(".visitFrame(Opcodes.F_CHOP,").append(var2).append(", null, 0, null");
            break;
         case 3:
            this.stringBuilder.append(this.name).append(".visitFrame(Opcodes.F_SAME, 0, null, 0, null");
            break;
         case 4:
            this.declareFrameTypes(1, var5);
            this.stringBuilder.append(this.name).append(".visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {");
            this.appendFrameTypes(1, var5);
            this.stringBuilder.append('}');
            break;
         default:
            throw new IllegalArgumentException();
      }

      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitInsn(int var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitInsn(").append(OPCODES[var1]).append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitIntInsn(int var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder
         .append(this.name)
         .append(".visitIntInsn(")
         .append(OPCODES[var1])
         .append(", ")
         .append(var1 == 188 ? TYPES[var2] : Integer.toString(var2))
         .append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitVarInsn(int var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitVarInsn(").append(OPCODES[var1]).append(", ").append(var2).append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitTypeInsn(int var1, String var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitTypeInsn(").append(OPCODES[var1]).append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitFieldInsn(int var1, String var2, String var3, String var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitFieldInsn(").append(OPCODES[var1]).append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(", ");
      this.appendConstant(var4);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitMethodInsn(int var1, String var2, String var3, String var4, boolean var5) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitMethodInsn(").append(OPCODES[var1]).append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(", ");
      this.appendConstant(var4);
      this.stringBuilder.append(", ").append(var5 ? "true" : "false").append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitInvokeDynamicInsn(String var1, String var2, Handle var3, Object... var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitInvokeDynamicInsn(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(", new Object[]{");

      for (int var5 = 0; var5 < var4.length; var5++) {
         this.appendConstant(var4[var5]);
         if (var5 != var4.length - 1) {
            this.stringBuilder.append(", ");
         }
      }

      this.stringBuilder.append("});\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitJumpInsn(int var1, Label var2) {
      this.stringBuilder.setLength(0);
      this.declareLabel(var2);
      this.stringBuilder.append(this.name).append(".visitJumpInsn(").append(OPCODES[var1]).append(", ");
      this.appendLabel(var2);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitLabel(Label var1) {
      this.stringBuilder.setLength(0);
      this.declareLabel(var1);
      this.stringBuilder.append(this.name).append(".visitLabel(");
      this.appendLabel(var1);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitLdcInsn(Object var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitLdcInsn(");
      this.appendConstant(var1);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitIincInsn(int var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitIincInsn(").append(var1).append(", ").append(var2).append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitTableSwitchInsn(int var1, int var2, Label var3, Label... var4) {
      this.stringBuilder.setLength(0);

      for (Label var8 : var4) {
         this.declareLabel(var8);
      }

      this.declareLabel(var3);
      this.stringBuilder.append(this.name).append(".visitTableSwitchInsn(").append(var1).append(", ").append(var2).append(", ");
      this.appendLabel(var3);
      this.stringBuilder.append(", new Label[] {");

      for (int var9 = 0; var9 < var4.length; var9++) {
         this.stringBuilder.append(var9 == 0 ? " " : ", ");
         this.appendLabel(var4[var9]);
      }

      this.stringBuilder.append(" });\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitLookupSwitchInsn(Label var1, int[] var2, Label[] var3) {
      this.stringBuilder.setLength(0);

      for (Label var7 : var3) {
         this.declareLabel(var7);
      }

      this.declareLabel(var1);
      this.stringBuilder.append(this.name).append(".visitLookupSwitchInsn(");
      this.appendLabel(var1);
      this.stringBuilder.append(", new int[] {");

      for (int var8 = 0; var8 < var2.length; var8++) {
         this.stringBuilder.append(var8 == 0 ? " " : ", ").append(var2[var8]);
      }

      this.stringBuilder.append(" }, new Label[] {");

      for (int var9 = 0; var9 < var3.length; var9++) {
         this.stringBuilder.append(var9 == 0 ? " " : ", ");
         this.appendLabel(var3[var9]);
      }

      this.stringBuilder.append(" });\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitMultiANewArrayInsn(String var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitMultiANewArrayInsn(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ").append(var2).append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   public ASMifier visitInsnAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation("visitInsnAnnotation", var1, var2, var3, var4);
   }

   @Override
   public void visitTryCatchBlock(Label var1, Label var2, Label var3, String var4) {
      this.stringBuilder.setLength(0);
      this.declareLabel(var1);
      this.declareLabel(var2);
      this.declareLabel(var3);
      this.stringBuilder.append(this.name).append(".visitTryCatchBlock(");
      this.appendLabel(var1);
      this.stringBuilder.append(", ");
      this.appendLabel(var2);
      this.stringBuilder.append(", ");
      this.appendLabel(var3);
      this.stringBuilder.append(", ");
      this.appendConstant(var4);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   public ASMifier visitTryCatchAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation("visitTryCatchAnnotation", var1, var2, var3, var4);
   }

   @Override
   public void visitLocalVariable(String var1, String var2, String var3, Label var4, Label var5, int var6) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitLocalVariable(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ");
      this.appendConstant(var2);
      this.stringBuilder.append(", ");
      this.appendConstant(var3);
      this.stringBuilder.append(", ");
      this.appendLabel(var4);
      this.stringBuilder.append(", ");
      this.appendLabel(var5);
      this.stringBuilder.append(", ").append(var6).append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public Printer visitLocalVariableAnnotation(int var1, TypePath var2, Label[] var3, Label[] var4, int[] var5, String var6, boolean var7) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("{\n").append("annotationVisitor0 = ").append(this.name).append(".visitLocalVariableAnnotation(").append(var1);
      if (var2 == null) {
         this.stringBuilder.append(", null, ");
      } else {
         this.stringBuilder.append(", TypePath.fromString(\"").append(var2).append("\"), ");
      }

      this.stringBuilder.append("new Label[] {");

      for (int var8 = 0; var8 < var3.length; var8++) {
         this.stringBuilder.append(var8 == 0 ? " " : ", ");
         this.appendLabel(var3[var8]);
      }

      this.stringBuilder.append(" }, new Label[] {");

      for (int var9 = 0; var9 < var4.length; var9++) {
         this.stringBuilder.append(var9 == 0 ? " " : ", ");
         this.appendLabel(var4[var9]);
      }

      this.stringBuilder.append(" }, new int[] {");

      for (int var10 = 0; var10 < var5.length; var10++) {
         this.stringBuilder.append(var10 == 0 ? " " : ", ").append(var5[var10]);
      }

      this.stringBuilder.append(" }, ");
      this.appendConstant(var6);
      this.stringBuilder.append(", ").append(var7).append(");\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var11 = this.createASMifier("annotationVisitor", 0);
      this.text.add(var11.getText());
      this.text.add("}\n");
      return var11;
   }

   @Override
   public void visitLineNumber(int var1, Label var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitLineNumber(").append(var1).append(", ");
      this.appendLabel(var2);
      this.stringBuilder.append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitMaxs(int var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitMaxs(").append(var1).append(", ").append(var2).append(");\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitMethodEnd() {
      this.visitMemberEnd();
   }

   public ASMifier visitAnnotation(String var1, boolean var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("{\n").append("annotationVisitor0 = ").append(this.name).append(".visitAnnotation(");
      this.appendConstant(var1);
      this.stringBuilder.append(", ").append(var2).append(");\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var3 = this.createASMifier("annotationVisitor", 0);
      this.text.add(var3.getText());
      this.text.add("}\n");
      return var3;
   }

   public ASMifier visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation("visitTypeAnnotation", var1, var2, var3, var4);
   }

   public ASMifier visitTypeAnnotation(String var1, int var2, TypePath var3, String var4, boolean var5) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("{\n").append("annotationVisitor0 = ").append(this.name).append('.').append(var1).append('(').append(var2);
      if (var3 == null) {
         this.stringBuilder.append(", null, ");
      } else {
         this.stringBuilder.append(", TypePath.fromString(\"").append(var3).append("\"), ");
      }

      this.appendConstant(var4);
      this.stringBuilder.append(", ").append(var5).append(");\n");
      this.text.add(this.stringBuilder.toString());
      ASMifier var6 = this.createASMifier("annotationVisitor", 0);
      this.text.add(var6.getText());
      this.text.add("}\n");
      return var6;
   }

   public void visitAttribute(Attribute var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("// ATTRIBUTE ").append(var1.type).append('\n');
      if (var1 instanceof ASMifierSupport) {
         if (this.labelNames == null) {
            this.labelNames = new HashMap<>();
         }

         this.stringBuilder.append("{\n");
         ((ASMifierSupport)var1).asmify(this.stringBuilder, "attribute", this.labelNames);
         this.stringBuilder.append(this.name).append(".visitAttribute(attribute);\n}\n");
      }

      this.text.add(this.stringBuilder.toString());
   }

   private void visitMemberEnd() {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.name).append(".visitEnd();\n");
      this.text.add(this.stringBuilder.toString());
   }

   protected ASMifier createASMifier(String var1, int var2) {
      return new ASMifier(this.api, var1, var2);
   }

   private void appendAccessFlags(int var1) {
      boolean var2 = true;
      if ((var1 & 1) != 0) {
         this.stringBuilder.append("ACC_PUBLIC");
         var2 = false;
      }

      if ((var1 & 2) != 0) {
         this.stringBuilder.append("ACC_PRIVATE");
         var2 = false;
      }

      if ((var1 & 4) != 0) {
         this.stringBuilder.append("ACC_PROTECTED");
         var2 = false;
      }

      if ((var1 & 16) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_FINAL");
         var2 = false;
      }

      if ((var1 & 8) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_STATIC");
         var2 = false;
      }

      if ((var1 & 32) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         if ((var1 & 262144) == 0) {
            if ((var1 & 2097152) == 0) {
               this.stringBuilder.append("ACC_SYNCHRONIZED");
            } else {
               this.stringBuilder.append("ACC_TRANSITIVE");
            }
         } else {
            this.stringBuilder.append("ACC_SUPER");
         }

         var2 = false;
      }

      if ((var1 & 64) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         if ((var1 & 524288) == 0) {
            if ((var1 & 2097152) == 0) {
               this.stringBuilder.append("ACC_BRIDGE");
            } else {
               this.stringBuilder.append("ACC_STATIC_PHASE");
            }
         } else {
            this.stringBuilder.append("ACC_VOLATILE");
         }

         var2 = false;
      }

      if ((var1 & 128) != 0 && (var1 & 786432) == 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_VARARGS");
         var2 = false;
      }

      if ((var1 & 128) != 0 && (var1 & 524288) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_TRANSIENT");
         var2 = false;
      }

      if ((var1 & 256) != 0 && (var1 & 786432) == 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_NATIVE");
         var2 = false;
      }

      if ((var1 & 16384) != 0 && (var1 & 1835008) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_ENUM");
         var2 = false;
      }

      if ((var1 & 8192) != 0 && (var1 & 1310720) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_ANNOTATION");
         var2 = false;
      }

      if ((var1 & 1024) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_ABSTRACT");
         var2 = false;
      }

      if ((var1 & 512) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_INTERFACE");
         var2 = false;
      }

      if ((var1 & 2048) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_STRICT");
         var2 = false;
      }

      if ((var1 & 4096) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_SYNTHETIC");
         var2 = false;
      }

      if ((var1 & 131072) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_DEPRECATED");
         var2 = false;
      }

      if ((var1 & 65536) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         this.stringBuilder.append("ACC_RECORD");
         var2 = false;
      }

      if ((var1 & 32768) != 0) {
         if (!var2) {
            this.stringBuilder.append(" | ");
         }

         if ((var1 & 262144) == 0) {
            this.stringBuilder.append("ACC_MANDATED");
         } else {
            this.stringBuilder.append("ACC_MODULE");
         }

         var2 = false;
      }

      if (var2) {
         this.stringBuilder.append('0');
      }
   }

   protected void appendConstant(Object var1) {
      if (var1 == null) {
         this.stringBuilder.append("null");
      } else if (var1 instanceof String) {
         appendString(this.stringBuilder, (String)var1);
      } else if (var1 instanceof Type) {
         this.stringBuilder.append("Type.getType(\"").append(((Type)var1).getDescriptor()).append("\")");
      } else if (var1 instanceof Handle) {
         this.stringBuilder.append("new Handle(");
         Handle var2 = (Handle)var1;
         this.stringBuilder
            .append("Opcodes.")
            .append(HANDLE_TAG[var2.getTag()])
            .append(", \"")
            .append(var2.getOwner())
            .append("\", \"")
            .append(var2.getName())
            .append("\", \"")
            .append(var2.getDesc())
            .append("\", ")
            .append(var2.isInterface())
            .append(')');
      } else if (var1 instanceof ConstantDynamic) {
         this.stringBuilder.append("new ConstantDynamic(\"");
         ConstantDynamic var5 = (ConstantDynamic)var1;
         this.stringBuilder.append(var5.getName()).append("\", \"").append(var5.getDescriptor()).append("\", ");
         this.appendConstant(var5.getBootstrapMethod());
         this.stringBuilder.append(", new Object[] {");
         int var3 = var5.getBootstrapMethodArgumentCount();

         for (int var4 = 0; var4 < var3; var4++) {
            this.appendConstant(var5.getBootstrapMethodArgument(var4));
            if (var4 != var3 - 1) {
               this.stringBuilder.append(", ");
            }
         }

         this.stringBuilder.append("})");
      } else if (var1 instanceof Byte) {
         this.stringBuilder.append("Byte.valueOf((byte)").append(var1).append(')');
      } else if (var1 instanceof Boolean) {
         this.stringBuilder.append((Boolean)var1 ? "Boolean.TRUE" : "Boolean.FALSE");
      } else if (var1 instanceof Short) {
         this.stringBuilder.append("Short.valueOf((short)").append(var1).append(')');
      } else if (var1 instanceof Character) {
         this.stringBuilder.append("Character.valueOf((char)").append((int)((Character)var1).charValue()).append(')');
      } else if (var1 instanceof Integer) {
         this.stringBuilder.append("Integer.valueOf(").append(var1).append(')');
      } else if (var1 instanceof Float) {
         this.stringBuilder.append("Float.valueOf(\"").append(var1).append("\")");
      } else if (var1 instanceof Long) {
         this.stringBuilder.append("Long.valueOf(").append(var1).append("L)");
      } else if (var1 instanceof Double) {
         this.stringBuilder.append("Double.valueOf(\"").append(var1).append("\")");
      } else if (var1 instanceof byte[]) {
         byte[] var6 = (byte[])var1;
         this.stringBuilder.append("new byte[] {");

         for (int var14 = 0; var14 < var6.length; var14++) {
            this.stringBuilder.append(var14 == 0 ? "" : ",").append(var6[var14]);
         }

         this.stringBuilder.append('}');
      } else if (var1 instanceof boolean[]) {
         boolean[] var7 = (boolean[])var1;
         this.stringBuilder.append("new boolean[] {");

         for (int var15 = 0; var15 < var7.length; var15++) {
            this.stringBuilder.append(var15 == 0 ? "" : ",").append(var7[var15]);
         }

         this.stringBuilder.append('}');
      } else if (var1 instanceof short[]) {
         short[] var8 = (short[])var1;
         this.stringBuilder.append("new short[] {");

         for (int var16 = 0; var16 < var8.length; var16++) {
            this.stringBuilder.append(var16 == 0 ? "" : ",").append("(short)").append(var8[var16]);
         }

         this.stringBuilder.append('}');
      } else if (var1 instanceof char[]) {
         char[] var9 = (char[])var1;
         this.stringBuilder.append("new char[] {");

         for (int var17 = 0; var17 < var9.length; var17++) {
            this.stringBuilder.append(var17 == 0 ? "" : ",").append("(char)").append((int)var9[var17]);
         }

         this.stringBuilder.append('}');
      } else if (var1 instanceof int[]) {
         int[] var10 = (int[])var1;
         this.stringBuilder.append("new int[] {");

         for (int var18 = 0; var18 < var10.length; var18++) {
            this.stringBuilder.append(var18 == 0 ? "" : ",").append(var10[var18]);
         }

         this.stringBuilder.append('}');
      } else if (var1 instanceof long[]) {
         long[] var11 = (long[])var1;
         this.stringBuilder.append("new long[] {");

         for (int var19 = 0; var19 < var11.length; var19++) {
            this.stringBuilder.append(var19 == 0 ? "" : ",").append(var11[var19]).append('L');
         }

         this.stringBuilder.append('}');
      } else if (var1 instanceof float[]) {
         float[] var12 = (float[])var1;
         this.stringBuilder.append("new float[] {");

         for (int var20 = 0; var20 < var12.length; var20++) {
            this.stringBuilder.append(var20 == 0 ? "" : ",").append(var12[var20]).append('f');
         }

         this.stringBuilder.append('}');
      } else if (var1 instanceof double[]) {
         double[] var13 = (double[])var1;
         this.stringBuilder.append("new double[] {");

         for (int var21 = 0; var21 < var13.length; var21++) {
            this.stringBuilder.append(var21 == 0 ? "" : ",").append(var13[var21]).append('d');
         }

         this.stringBuilder.append('}');
      }
   }

   private void declareFrameTypes(int var1, Object[] var2) {
      for (int var3 = 0; var3 < var1; var3++) {
         if (var2[var3] instanceof Label) {
            this.declareLabel((Label)var2[var3]);
         }
      }
   }

   private void appendFrameTypes(int var1, Object[] var2) {
      for (int var3 = 0; var3 < var1; var3++) {
         if (var3 > 0) {
            this.stringBuilder.append(", ");
         }

         if (var2[var3] instanceof String) {
            this.appendConstant(var2[var3]);
         } else if (var2[var3] instanceof Integer) {
            this.stringBuilder.append(FRAME_TYPES.get((Integer)var2[var3]));
         } else {
            this.appendLabel((Label)var2[var3]);
         }
      }
   }

   protected void declareLabel(Label var1) {
      if (this.labelNames == null) {
         this.labelNames = new HashMap<>();
      }

      String var2 = this.labelNames.get(var1);
      if (var2 == null) {
         var2 = stringConcat$3(this.labelNames.size());
         this.labelNames.put(var1, var2);
         this.stringBuilder.append("Label ").append(var2).append(" = new Label();\n");
      }
   }

   protected void appendLabel(Label var1) {
      this.stringBuilder.append(this.labelNames.get(var1));
   }

   static {
      HashMap var0 = new HashMap();
      var0.put(196653, "V1_1");
      var0.put(46, "V1_2");
      var0.put(47, "V1_3");
      var0.put(48, "V1_4");
      var0.put(49, "V1_5");
      var0.put(50, "V1_6");
      var0.put(51, "V1_7");
      var0.put(52, "V1_8");
      var0.put(53, "V9");
      var0.put(54, "V10");
      var0.put(55, "V11");
      var0.put(56, "V12");
      var0.put(57, "V13");
      var0.put(58, "V14");
      var0.put(59, "V15");
      var0.put(60, "V16");
      var0.put(61, "V17");
      var0.put(62, "V18");
      var0.put(63, "V19");
      var0.put(64, "V20");
      var0.put(65, "V21");
      var0.put(66, "V22");
      var0.put(67, "V23");
      var0.put(68, "V24");
      var0.put(69, "V25");
      var0.put(70, "V26");
      var0.put(71, "V27");
      CLASS_VERSIONS = Collections.unmodifiableMap(var0);
   }
}
