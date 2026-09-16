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
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureReader;

public class Textifier extends Printer {
   private static final String USAGE = "Prints a disassembled view of the given class.\nUsage: Textifier [-nodebug] <fully qualified class name or class file name>";
   public static final int INTERNAL_NAME = 0;
   public static final int FIELD_DESCRIPTOR = 1;
   public static final int FIELD_SIGNATURE = 2;
   public static final int METHOD_DESCRIPTOR = 3;
   public static final int METHOD_SIGNATURE = 4;
   public static final int CLASS_SIGNATURE = 5;
   public static final int HANDLE_DESCRIPTOR = 9;
   private static final String CLASS_SUFFIX = ".class";
   private static final String DEPRECATED = "// DEPRECATED\n";
   private static final String RECORD = "// RECORD\n";
   private static final String INVISIBLE = " // invisible\n";
   private static final List<String> FRAME_TYPES = Collections.unmodifiableList(Arrays.asList("T", "I", "F", "D", "J", "N", "U"));
   protected String tab = "  ";
   protected String tab2 = "    ";
   protected String tab3 = "      ";
   protected String ltab = "   ";
   protected Map<Label, String> labelNames;
   private int access;
   private int numAnnotationValues;

   public Textifier() {
      this(589824);
      if (this.getClass() != Textifier.class) {
         throw new IllegalStateException();
      }
   }

   protected Textifier(int var1) {
      super(var1);
   }

   public static void main(String[] var0) {
      main(var0, new PrintWriter(System.out, true), new PrintWriter(System.err, true));
   }

   static void main(String[] var0, PrintWriter var1, PrintWriter var2) {
      main(
         var0,
         "Prints a disassembled view of the given class.\nUsage: Textifier [-nodebug] <fully qualified class name or class file name>",
         new Textifier(),
         var1,
         var2
      );
   }

   @Override
   public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      if ((var2 & 32768) == 0) {
         this.access = var2;
         int var7 = var1 & 65535;
         int var8 = var1 >>> 16;
         this.stringBuilder.setLength(0);
         this.stringBuilder.append("// class version ").append(var7).append('.').append(var8).append(" (").append(var1).append(")\n");
         if ((var2 & 131072) != 0) {
            this.stringBuilder.append("// DEPRECATED\n");
         }

         if ((var2 & 65536) != 0) {
            this.stringBuilder.append("// RECORD\n");
         }

         this.appendRawAccess(var2);
         this.appendDescriptor(5, var4);
         if (var4 != null) {
            this.appendJavaDeclaration(var3, var4);
         }

         this.appendAccess(var2 & -32801);
         if ((var2 & 8192) != 0) {
            this.stringBuilder.append("@interface ");
         } else if ((var2 & 512) != 0) {
            this.stringBuilder.append("interface ");
         } else if ((var2 & 16384) == 0) {
            this.stringBuilder.append("class ");
         }

         this.appendDescriptor(0, var3);
         if (var5 != null && !"java/lang/Object".equals(var5)) {
            this.stringBuilder.append(" extends ");
            this.appendDescriptor(0, var5);
         }

         if (var6 != null && var6.length > 0) {
            this.stringBuilder.append(" implements ");

            for (int var9 = 0; var9 < var6.length; var9++) {
               this.appendDescriptor(0, var6[var9]);
               if (var9 != var6.length - 1) {
                  this.stringBuilder.append(' ');
               }
            }
         }

         this.stringBuilder.append(" {\n\n");
         this.text.add(this.stringBuilder.toString());
      }
   }

   @Override
   public void visitSource(String var1, String var2) {
      this.stringBuilder.setLength(0);
      if (var1 != null) {
         this.stringBuilder.append(this.tab).append("// compiled from: ").append(var1).append('\n');
      }

      if (var2 != null) {
         this.stringBuilder.append(this.tab).append("// debug info: ").append(var2).append('\n');
      }

      if (this.stringBuilder.length() > 0) {
         this.text.add(this.stringBuilder.toString());
      }
   }

   @Override
   public Printer visitModule(String var1, int var2, String var3) {
      this.stringBuilder.setLength(0);
      if ((var2 & 32) != 0) {
         this.stringBuilder.append("open ");
      }

      this.stringBuilder.append("module ").append(var1).append(" { ").append(var3 == null ? "" : stringConcat$0(var3)).append("\n\n");
      this.text.add(this.stringBuilder.toString());
      return this.addNewTextifier(null);
   }

   @Override
   public void visitNestHost(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append("NESTHOST ");
      this.appendDescriptor(0, var1);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitOuterClass(String var1, String var2, String var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append("OUTERCLASS ");
      this.appendDescriptor(0, var1);
      this.stringBuilder.append(' ');
      if (var2 != null) {
         this.stringBuilder.append(var2).append(' ');
      }

      this.appendDescriptor(3, var3);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   public Textifier visitClassAnnotation(String var1, boolean var2) {
      this.text.add("\n");
      return this.visitAnnotation(var1, var2);
   }

   @Override
   public Printer visitClassTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      this.text.add("\n");
      return this.visitTypeAnnotation(var1, var2, var3, var4);
   }

   @Override
   public void visitClassAttribute(Attribute var1) {
      this.text.add("\n");
      this.visitAttribute(var1);
   }

   @Override
   public void visitNestMember(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append("NESTMEMBER ");
      this.appendDescriptor(0, var1);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitPermittedSubclass(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append("PERMITTEDSUBCLASS ");
      this.appendDescriptor(0, var1);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitInnerClass(String var1, String var2, String var3, int var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab);
      this.appendRawAccess(var4);
      this.stringBuilder.append(this.tab);
      this.appendAccess(var4);
      this.stringBuilder.append("INNERCLASS ");
      this.appendDescriptor(0, var1);
      this.stringBuilder.append(' ');
      this.appendDescriptor(0, var2);
      this.stringBuilder.append(' ');
      this.appendDescriptor(0, var3);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public Printer visitRecordComponent(String var1, String var2, String var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append("RECORDCOMPONENT ");
      if (var3 != null) {
         this.stringBuilder.append(this.tab);
         this.appendDescriptor(2, var3);
         this.stringBuilder.append(this.tab);
         this.appendJavaDeclaration(var1, var3);
      }

      this.stringBuilder.append(this.tab);
      this.appendDescriptor(1, var2);
      this.stringBuilder.append(' ').append(var1).append('\n');
      this.text.add(this.stringBuilder.toString());
      return this.addNewTextifier(null);
   }

   public Textifier visitField(int var1, String var2, String var3, String var4, Object var5) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append('\n');
      if ((var1 & 131072) != 0) {
         this.stringBuilder.append(this.tab).append("// DEPRECATED\n");
      }

      this.stringBuilder.append(this.tab);
      this.appendRawAccess(var1);
      if (var4 != null) {
         this.stringBuilder.append(this.tab);
         this.appendDescriptor(2, var4);
         this.stringBuilder.append(this.tab);
         this.appendJavaDeclaration(var2, var4);
      }

      this.stringBuilder.append(this.tab);
      this.appendAccess(var1);
      this.appendDescriptor(1, var3);
      this.stringBuilder.append(' ').append(var2);
      if (var5 != null) {
         this.stringBuilder.append(" = ");
         this.appendConstant(var5);
      }

      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
      return this.addNewTextifier(null);
   }

   public Textifier visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append('\n');
      if ((var1 & 131072) != 0) {
         this.stringBuilder.append(this.tab).append("// DEPRECATED\n");
      }

      this.stringBuilder.append(this.tab);
      this.appendRawAccess(var1);
      if (var4 != null) {
         this.stringBuilder.append(this.tab);
         this.appendDescriptor(4, var4);
         this.stringBuilder.append(this.tab);
         this.appendJavaDeclaration(var2, var4);
      }

      this.stringBuilder.append(this.tab);
      this.appendAccess(var1 & -193);
      if ((var1 & 256) != 0) {
         this.stringBuilder.append("native ");
      }

      if ((var1 & 128) != 0) {
         this.stringBuilder.append("varargs ");
      }

      if ((var1 & 64) != 0) {
         this.stringBuilder.append("bridge ");
      }

      if ((this.access & 512) != 0 && (var1 & 1032) == 0) {
         this.stringBuilder.append("default ");
      }

      this.stringBuilder.append(var2);
      this.appendDescriptor(3, var3);
      if (var5 != null && var5.length > 0) {
         this.stringBuilder.append(" throws");

         for (String var9 : var5) {
            this.stringBuilder.append(' ');
            this.appendDescriptor(0, var9);
         }
      }

      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
      return this.addNewTextifier(null);
   }

   @Override
   public void visitClassEnd() {
      this.text.add("}\n");
   }

   @Override
   public void visitMainClass(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("  // main class ").append(var1).append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitPackage(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append("  // package ").append(var1).append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitRequire(String var1, int var2, String var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append("requires ");
      if ((var2 & 32) != 0) {
         this.stringBuilder.append("transitive ");
      }

      if ((var2 & 64) != 0) {
         this.stringBuilder.append("static ");
      }

      this.stringBuilder.append(var1).append(';');
      this.appendRawAccess(var2);
      if (var3 != null) {
         this.stringBuilder.append("  // version ").append(var3).append('\n');
      }

      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitExport(String var1, int var2, String... var3) {
      this.visitExportOrOpen("exports ", var1, var2, var3);
   }

   @Override
   public void visitOpen(String var1, int var2, String... var3) {
      this.visitExportOrOpen("opens ", var1, var2, var3);
   }

   private void visitExportOrOpen(String var1, String var2, int var3, String... var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append(var1).append(var2);
      if (var4 != null && var4.length > 0) {
         this.stringBuilder.append(" to");
      } else {
         this.stringBuilder.append(';');
      }

      this.appendRawAccess(var3);
      if (var4 != null && var4.length > 0) {
         for (int var5 = 0; var5 < var4.length; var5++) {
            this.stringBuilder.append(this.tab2).append(var4[var5]).append(var5 != var4.length - 1 ? ",\n" : ";\n");
         }
      }

      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitUse(String var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append("uses ");
      this.appendDescriptor(0, var1);
      this.stringBuilder.append(";\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitProvide(String var1, String... var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append("provides ");
      this.appendDescriptor(0, var1);
      this.stringBuilder.append(" with\n");

      for (int var3 = 0; var3 < var2.length; var3++) {
         this.stringBuilder.append(this.tab2);
         this.appendDescriptor(0, var2[var3]);
         this.stringBuilder.append(var3 != var2.length - 1 ? ",\n" : ";\n");
      }

      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitModuleEnd() {
   }

   @Override
   public void visit(String var1, Object var2) {
      this.visitAnnotationValue(var1);
      if (var2 instanceof String) {
         this.visitString((String)var2);
      } else if (var2 instanceof Type) {
         this.visitType((Type)var2);
      } else if (var2 instanceof Byte) {
         this.visitByte((Byte)var2);
      } else if (var2 instanceof Boolean) {
         this.visitBoolean((Boolean)var2);
      } else if (var2 instanceof Short) {
         this.visitShort((Short)var2);
      } else if (var2 instanceof Character) {
         this.visitChar((Character)var2);
      } else if (var2 instanceof Integer) {
         this.visitInt((Integer)var2);
      } else if (var2 instanceof Float) {
         this.visitFloat((Float)var2);
      } else if (var2 instanceof Long) {
         this.visitLong((Long)var2);
      } else if (var2 instanceof Double) {
         this.visitDouble((Double)var2);
      } else if (var2.getClass().isArray()) {
         this.stringBuilder.append('{');
         if (var2 instanceof byte[]) {
            byte[] var11 = (byte[])var2;

            for (int var18 = 0; var18 < var11.length; var18++) {
               this.maybeAppendComma(var18);
               this.visitByte(var11[var18]);
            }
         } else if (var2 instanceof boolean[]) {
            boolean[] var10 = (boolean[])var2;

            for (int var17 = 0; var17 < var10.length; var17++) {
               this.maybeAppendComma(var17);
               this.visitBoolean(var10[var17]);
            }
         } else if (var2 instanceof short[]) {
            short[] var9 = (short[])var2;

            for (int var16 = 0; var16 < var9.length; var16++) {
               this.maybeAppendComma(var16);
               this.visitShort(var9[var16]);
            }
         } else if (var2 instanceof char[]) {
            char[] var8 = (char[])var2;

            for (int var15 = 0; var15 < var8.length; var15++) {
               this.maybeAppendComma(var15);
               this.visitChar(var8[var15]);
            }
         } else if (var2 instanceof int[]) {
            int[] var7 = (int[])var2;

            for (int var14 = 0; var14 < var7.length; var14++) {
               this.maybeAppendComma(var14);
               this.visitInt(var7[var14]);
            }
         } else if (var2 instanceof long[]) {
            long[] var6 = (long[])var2;

            for (int var13 = 0; var13 < var6.length; var13++) {
               this.maybeAppendComma(var13);
               this.visitLong(var6[var13]);
            }
         } else if (var2 instanceof float[]) {
            float[] var5 = (float[])var2;

            for (int var12 = 0; var12 < var5.length; var12++) {
               this.maybeAppendComma(var12);
               this.visitFloat(var5[var12]);
            }
         } else if (var2 instanceof double[]) {
            double[] var3 = (double[])var2;

            for (int var4 = 0; var4 < var3.length; var4++) {
               this.maybeAppendComma(var4);
               this.visitDouble(var3[var4]);
            }
         }

         this.stringBuilder.append('}');
      }

      this.text.add(this.stringBuilder.toString());
   }

   private void visitInt(int var1) {
      this.stringBuilder.append(var1);
   }

   private void visitLong(long var1) {
      this.stringBuilder.append(var1).append('L');
   }

   private void visitFloat(float var1) {
      this.stringBuilder.append(var1).append('F');
   }

   private void visitDouble(double var1) {
      this.stringBuilder.append(var1).append('D');
   }

   private void visitChar(char var1) {
      this.stringBuilder.append("(char)").append((int)var1);
   }

   private void visitShort(short var1) {
      this.stringBuilder.append("(short)").append(var1);
   }

   private void visitByte(byte var1) {
      this.stringBuilder.append("(byte)").append(var1);
   }

   private void visitBoolean(boolean var1) {
      this.stringBuilder.append(var1);
   }

   private void visitString(String var1) {
      appendString(this.stringBuilder, var1);
   }

   private void visitType(Type var1) {
      this.stringBuilder.append(var1.getClassName()).append(".class");
   }

   @Override
   public void visitEnum(String var1, String var2, String var3) {
      this.visitAnnotationValue(var1);
      this.appendDescriptor(1, var2);
      this.stringBuilder.append('.').append(var3);
      this.text.add(this.stringBuilder.toString());
   }

   public Textifier visitAnnotation(String var1, String var2) {
      this.visitAnnotationValue(var1);
      this.stringBuilder.append('@');
      this.appendDescriptor(1, var2);
      this.stringBuilder.append('(');
      this.text.add(this.stringBuilder.toString());
      return this.addNewTextifier(")");
   }

   public Textifier visitArray(String var1) {
      this.visitAnnotationValue(var1);
      this.stringBuilder.append('{');
      this.text.add(this.stringBuilder.toString());
      return this.addNewTextifier("}");
   }

   @Override
   public void visitAnnotationEnd() {
   }

   private void visitAnnotationValue(String var1) {
      this.stringBuilder.setLength(0);
      this.maybeAppendComma(this.numAnnotationValues++);
      if (var1 != null) {
         this.stringBuilder.append(var1).append('=');
      }
   }

   public Textifier visitRecordComponentAnnotation(String var1, boolean var2) {
      return this.visitAnnotation(var1, var2);
   }

   @Override
   public Printer visitRecordComponentTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation(var1, var2, var3, var4);
   }

   @Override
   public void visitRecordComponentAttribute(Attribute var1) {
      this.visitAttribute(var1);
   }

   @Override
   public void visitRecordComponentEnd() {
   }

   public Textifier visitFieldAnnotation(String var1, boolean var2) {
      return this.visitAnnotation(var1, var2);
   }

   @Override
   public Printer visitFieldTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation(var1, var2, var3, var4);
   }

   @Override
   public void visitFieldAttribute(Attribute var1) {
      this.visitAttribute(var1);
   }

   @Override
   public void visitFieldEnd() {
   }

   @Override
   public void visitParameter(String var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("// parameter ");
      this.appendAccess(var2);
      this.stringBuilder.append(' ').append(var1 == null ? "<no name>" : var1).append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   public Textifier visitAnnotationDefault() {
      this.text.add(stringConcat$1(this.tab2));
      return this.addNewTextifier("\n");
   }

   public Textifier visitMethodAnnotation(String var1, boolean var2) {
      return this.visitAnnotation(var1, var2);
   }

   @Override
   public Printer visitMethodTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation(var1, var2, var3, var4);
   }

   public Textifier visitAnnotableParameterCount(int var1, boolean var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("// annotable parameter count: ").append(var1).append(var2 ? " (visible)\n" : " (invisible)\n");
      this.text.add(this.stringBuilder.toString());
      return this;
   }

   public Textifier visitParameterAnnotation(int var1, String var2, boolean var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append('@');
      this.appendDescriptor(1, var2);
      this.stringBuilder.append('(');
      this.text.add(this.stringBuilder.toString());
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(var3 ? ") // parameter " : ") // invisible, parameter ").append(var1).append('\n');
      return this.addNewTextifier(this.stringBuilder.toString());
   }

   @Override
   public void visitMethodAttribute(Attribute var1) {
      this.visitAttribute(var1);
   }

   @Override
   public void visitCode() {
   }

   @Override
   public void visitFrame(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.ltab).append("FRAME ");
      switch (var1) {
         case -1:
         case 0:
            this.stringBuilder.append("FULL [");
            this.appendFrameTypes(var2, var3);
            this.stringBuilder.append("] [");
            this.appendFrameTypes(var4, var5);
            this.stringBuilder.append(']');
            break;
         case 1:
            this.stringBuilder.append("APPEND [");
            this.appendFrameTypes(var2, var3);
            this.stringBuilder.append(']');
            break;
         case 2:
            this.stringBuilder.append("CHOP ").append(var2);
            break;
         case 3:
            this.stringBuilder.append("SAME");
            break;
         case 4:
            this.stringBuilder.append("SAME1 ");
            this.appendFrameTypes(1, var5);
            break;
         default:
            throw new IllegalArgumentException();
      }

      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitInsn(int var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append(OPCODES[var1]).append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitIntInsn(int var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append(OPCODES[var1]).append(' ').append(var1 == 188 ? TYPES[var2] : Integer.toString(var2)).append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitVarInsn(int var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append(OPCODES[var1]).append(' ').append(var2).append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitTypeInsn(int var1, String var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append(OPCODES[var1]).append(' ');
      this.appendDescriptor(0, var2);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitFieldInsn(int var1, String var2, String var3, String var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append(OPCODES[var1]).append(' ');
      this.appendDescriptor(0, var2);
      this.stringBuilder.append('.').append(var3).append(" : ");
      this.appendDescriptor(1, var4);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitMethodInsn(int var1, String var2, String var3, String var4, boolean var5) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append(OPCODES[var1]).append(' ');
      this.appendDescriptor(0, var2);
      this.stringBuilder.append('.').append(var3).append(' ');
      this.appendDescriptor(3, var4);
      if (var5) {
         this.stringBuilder.append(" (itf)");
      }

      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitInvokeDynamicInsn(String var1, String var2, Handle var3, Object... var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("INVOKEDYNAMIC").append(' ').append(var1);
      this.appendDescriptor(3, var2);
      this.stringBuilder.append(" [").append('\n').append(this.tab3);
      this.appendHandle(var3, this.tab3);
      this.stringBuilder.append('\n').append(this.tab3);
      this.appendBoostrapMethodArgs(var4, this.tab3);
      this.stringBuilder.append('\n').append(this.tab2).append("]\n");
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitJumpInsn(int var1, Label var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append(OPCODES[var1]).append(' ');
      this.appendLabel(var2);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitLabel(Label var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.ltab);
      this.appendLabel(var1);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitLdcInsn(Object var1) {
      this.stringBuilder.setLength(0);
      if (var1 instanceof ConstantDynamic) {
         this.stringBuilder.append(this.tab2).append("LDC ");
         this.appendConstantDynamic((ConstantDynamic)var1, this.tab2);
      } else if (var1 instanceof Handle) {
         this.stringBuilder.append(this.tab2);
         this.appendHandle((Handle)var1, stringConcat$2(this.tab2));
      } else {
         this.stringBuilder.append(this.tab2).append("LDC ");
         this.appendConstant(var1);
      }

      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitIincInsn(int var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("IINC ").append(var1).append(' ').append(var2).append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitTableSwitchInsn(int var1, int var2, Label var3, Label... var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("TABLESWITCH\n");

      for (int var5 = 0; var5 < var4.length; var5++) {
         this.stringBuilder.append(this.tab3).append(var1 + var5).append(": ");
         this.appendLabel(var4[var5]);
         this.stringBuilder.append('\n');
      }

      this.stringBuilder.append(this.tab3).append("default: ");
      this.appendLabel(var3);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitLookupSwitchInsn(Label var1, int[] var2, Label[] var3) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("LOOKUPSWITCH\n");

      for (int var4 = 0; var4 < var3.length; var4++) {
         this.stringBuilder.append(this.tab3).append(var2[var4]).append(": ");
         this.appendLabel(var3[var4]);
         this.stringBuilder.append('\n');
      }

      this.stringBuilder.append(this.tab3).append("default: ");
      this.appendLabel(var1);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitMultiANewArrayInsn(String var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("MULTIANEWARRAY ");
      this.appendDescriptor(1, var1);
      this.stringBuilder.append(' ').append(var2).append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public Printer visitInsnAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return this.visitTypeAnnotation(var1, var2, var3, var4);
   }

   @Override
   public void visitTryCatchBlock(Label var1, Label var2, Label var3, String var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("TRYCATCHBLOCK ");
      this.appendLabel(var1);
      this.stringBuilder.append(' ');
      this.appendLabel(var2);
      this.stringBuilder.append(' ');
      this.appendLabel(var3);
      this.stringBuilder.append(' ');
      this.appendDescriptor(0, var4);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public Printer visitTryCatchAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("TRYCATCHBLOCK @");
      this.appendDescriptor(1, var3);
      this.stringBuilder.append('(');
      this.text.add(this.stringBuilder.toString());
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(") : ");
      this.appendTypeReference(var1);
      this.stringBuilder.append(", ").append(var2).append(var4 ? "\n" : " // invisible\n");
      return this.addNewTextifier(this.stringBuilder.toString());
   }

   @Override
   public void visitLocalVariable(String var1, String var2, String var3, Label var4, Label var5, int var6) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("LOCALVARIABLE ").append(var1).append(' ');
      this.appendDescriptor(1, var2);
      this.stringBuilder.append(' ');
      this.appendLabel(var4);
      this.stringBuilder.append(' ');
      this.appendLabel(var5);
      this.stringBuilder.append(' ').append(var6).append('\n');
      if (var3 != null) {
         this.stringBuilder.append(this.tab2);
         this.appendDescriptor(2, var3);
         this.stringBuilder.append(this.tab2);
         this.appendJavaDeclaration(var1, var3);
      }

      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public Printer visitLocalVariableAnnotation(int var1, TypePath var2, Label[] var3, Label[] var4, int[] var5, String var6, boolean var7) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("LOCALVARIABLE @");
      this.appendDescriptor(1, var6);
      this.stringBuilder.append('(');
      this.text.add(this.stringBuilder.toString());
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(") : ");
      this.appendTypeReference(var1);
      this.stringBuilder.append(", ").append(var2);

      for (int var8 = 0; var8 < var3.length; var8++) {
         this.stringBuilder.append(" [ ");
         this.appendLabel(var3[var8]);
         this.stringBuilder.append(" - ");
         this.appendLabel(var4[var8]);
         this.stringBuilder.append(" - ").append(var5[var8]).append(" ]");
      }

      this.stringBuilder.append(var7 ? "\n" : " // invisible\n");
      return this.addNewTextifier(this.stringBuilder.toString());
   }

   @Override
   public void visitLineNumber(int var1, Label var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("LINENUMBER ").append(var1).append(' ');
      this.appendLabel(var2);
      this.stringBuilder.append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitMaxs(int var1, int var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("MAXSTACK = ").append(var1).append('\n');
      this.text.add(this.stringBuilder.toString());
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab2).append("MAXLOCALS = ").append(var2).append('\n');
      this.text.add(this.stringBuilder.toString());
   }

   @Override
   public void visitMethodEnd() {
   }

   public Textifier visitAnnotation(String var1, boolean var2) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append('@');
      this.appendDescriptor(1, var1);
      this.stringBuilder.append('(');
      this.text.add(this.stringBuilder.toString());
      return this.addNewTextifier(var2 ? ")\n" : ") // invisible\n");
   }

   public Textifier visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append('@');
      this.appendDescriptor(1, var3);
      this.stringBuilder.append('(');
      this.text.add(this.stringBuilder.toString());
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(") : ");
      this.appendTypeReference(var1);
      this.stringBuilder.append(", ").append(var2).append(var4 ? "\n" : " // invisible\n");
      return this.addNewTextifier(this.stringBuilder.toString());
   }

   public void visitAttribute(Attribute var1) {
      this.stringBuilder.setLength(0);
      this.stringBuilder.append(this.tab).append("ATTRIBUTE ");
      this.appendDescriptor(-1, var1.type);
      if (var1 instanceof TextifierSupport) {
         if (this.labelNames == null) {
            this.labelNames = new HashMap<>();
         }

         ((TextifierSupport)var1).textify(this.stringBuilder, this.labelNames);
      } else {
         this.stringBuilder.append(" : unknown\n");
      }

      this.text.add(this.stringBuilder.toString());
   }

   private void appendAccess(int var1) {
      if ((var1 & 1) != 0) {
         this.stringBuilder.append("public ");
      }

      if ((var1 & 2) != 0) {
         this.stringBuilder.append("private ");
      }

      if ((var1 & 4) != 0) {
         this.stringBuilder.append("protected ");
      }

      if ((var1 & 16) != 0) {
         this.stringBuilder.append("final ");
      }

      if ((var1 & 8) != 0) {
         this.stringBuilder.append("static ");
      }

      if ((var1 & 32) != 0) {
         this.stringBuilder.append("synchronized ");
      }

      if ((var1 & 64) != 0) {
         this.stringBuilder.append("volatile ");
      }

      if ((var1 & 128) != 0) {
         this.stringBuilder.append("transient ");
      }

      if ((var1 & 1024) != 0) {
         this.stringBuilder.append("abstract ");
      }

      if ((var1 & 2048) != 0) {
         this.stringBuilder.append("strictfp ");
      }

      if ((var1 & 4096) != 0) {
         this.stringBuilder.append("synthetic ");
      }

      if ((var1 & 32768) != 0) {
         this.stringBuilder.append("mandated ");
      }

      if ((var1 & 16384) != 0) {
         this.stringBuilder.append("enum ");
      }
   }

   private void appendConstant(Object var1) {
      if (var1 instanceof Number) {
         if (var1 instanceof Double) {
            this.stringBuilder.append(var1).append('D');
         } else if (var1 instanceof Float) {
            this.stringBuilder.append(var1).append('F');
         } else if (var1 instanceof Long) {
            this.stringBuilder.append(var1).append('L');
         } else {
            this.stringBuilder.append(var1);
         }
      } else if (var1 instanceof Type) {
         this.stringBuilder.append(((Type)var1).getDescriptor()).append(".class");
      } else if (var1 instanceof String) {
         Printer.appendString(this.stringBuilder, var1.toString());
      } else {
         this.stringBuilder.append(var1);
      }
   }

   private void appendConstantDynamic(ConstantDynamic var1, String var2) {
      this.stringBuilder.append(var1.getName()).append(" : ").append(var1.getDescriptor()).append(" [\n").append(var2).append(this.tab);
      this.appendHandle(var1.getBootstrapMethod(), stringConcat$3(var2, this.tab));
      this.stringBuilder.append('\n').append(var2).append(this.tab);
      Object[] var3 = new Object[var1.getBootstrapMethodArgumentCount()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var1.getBootstrapMethodArgument(var4);
      }

      this.appendBoostrapMethodArgs(var3, stringConcat$4(var2, this.tab));
      this.stringBuilder.append('\n').append(var2).append(']');
   }

   private void appendBoostrapMethodArgs(Object[] var1, String var2) {
      this.stringBuilder.append("// arguments:");
      if (var1.length == 0) {
         this.stringBuilder.append(" none");
      } else {
         for (int var3 = 0; var3 < var1.length; var3++) {
            Object var4 = var1[var3];
            if (var3 != 0) {
               this.stringBuilder.append(", ");
            }

            this.stringBuilder.append('\n').append(var2);
            if (var4 instanceof Type) {
               Type var5 = (Type)var4;
               if (var5.getSort() == 11) {
                  this.appendDescriptor(3, var5.getDescriptor());
               } else {
                  this.visitType(var5);
               }
            } else if (var4 instanceof Handle) {
               this.appendHandle((Handle)var4, var2);
            } else if (var4 instanceof ConstantDynamic) {
               this.stringBuilder.append("// constant dynamic: ").append('\n').append(var2);
               this.appendConstantDynamic((ConstantDynamic)var4, var2);
            } else {
               this.appendConstant(var4);
            }
         }
      }
   }

   private void appendRawAccess(int var1) {
      this.stringBuilder.append("// access flags 0x").append(Integer.toHexString(var1).toUpperCase()).append('\n');
   }

   protected void appendDescriptor(int var1, String var2) {
      if (var1 != 5 && var1 != 2 && var1 != 4) {
         this.stringBuilder.append(var2);
      } else if (var2 != null) {
         this.stringBuilder.append("// signature ").append(var2).append('\n');
      }
   }

   private void appendJavaDeclaration(String var1, String var2) {
      TraceSignatureVisitor var3 = new TraceSignatureVisitor(this.access);
      new SignatureReader(var2).accept(var3);
      this.stringBuilder.append("// declaration: ");
      if (var3.getReturnType() != null) {
         this.stringBuilder.append(var3.getReturnType()).append(' ');
      }

      this.stringBuilder.append(var1).append(var3.getDeclaration());
      if (var3.getExceptions() != null) {
         this.stringBuilder.append(" throws ").append(var3.getExceptions());
      }

      this.stringBuilder.append('\n');
   }

   protected void appendLabel(Label var1) {
      if (this.labelNames == null) {
         this.labelNames = new HashMap<>();
      }

      String var2 = this.labelNames.get(var1);
      if (var2 == null) {
         var2 = stringConcat$5(this.labelNames.size());
         this.labelNames.put(var1, var2);
      }

      this.stringBuilder.append(var2);
   }

   @Deprecated
   protected void appendHandle(Handle var1) {
      this.appendHandle(var1, this.tab3);
   }

   protected void appendHandle(Handle var1, String var2) {
      int var3 = var1.getTag();
      this.stringBuilder.append("// handle kind 0x").append(Integer.toHexString(var3)).append(" : ");
      boolean var4 = false;
      switch (var3) {
         case 1:
            this.stringBuilder.append("GETFIELD");
            break;
         case 2:
            this.stringBuilder.append("GETSTATIC");
            break;
         case 3:
            this.stringBuilder.append("PUTFIELD");
            break;
         case 4:
            this.stringBuilder.append("PUTSTATIC");
            break;
         case 5:
            this.stringBuilder.append("INVOKEVIRTUAL");
            var4 = true;
            break;
         case 6:
            this.stringBuilder.append("INVOKESTATIC");
            var4 = true;
            break;
         case 7:
            this.stringBuilder.append("INVOKESPECIAL");
            var4 = true;
            break;
         case 8:
            this.stringBuilder.append("NEWINVOKESPECIAL");
            var4 = true;
            break;
         case 9:
            this.stringBuilder.append("INVOKEINTERFACE");
            var4 = true;
            break;
         default:
            throw new IllegalArgumentException();
      }

      this.stringBuilder.append('\n').append(var2);
      this.appendDescriptor(0, var1.getOwner());
      this.stringBuilder.append('.').append(var1.getName());
      if (!var4) {
         this.stringBuilder.append('(');
      }

      this.appendDescriptor(9, var1.getDesc());
      if (!var4) {
         this.stringBuilder.append(')');
      }

      if (var1.isInterface()) {
         this.stringBuilder.append(" itf");
      }
   }

   private void maybeAppendComma(int var1) {
      if (var1 > 0) {
         this.stringBuilder.append(", ");
      }
   }

   private void appendTypeReference(int var1) {
      TypeReference var2 = new TypeReference(var1);
      switch (var2.getSort()) {
         case 0:
            this.stringBuilder.append("CLASS_TYPE_PARAMETER ").append(var2.getTypeParameterIndex());
            break;
         case 1:
            this.stringBuilder.append("METHOD_TYPE_PARAMETER ").append(var2.getTypeParameterIndex());
            break;
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
            throw new IllegalArgumentException();
         case 16:
            this.stringBuilder.append("CLASS_EXTENDS ").append(var2.getSuperTypeIndex());
            break;
         case 17:
            this.stringBuilder
               .append("CLASS_TYPE_PARAMETER_BOUND ")
               .append(var2.getTypeParameterIndex())
               .append(", ")
               .append(var2.getTypeParameterBoundIndex());
            break;
         case 18:
            this.stringBuilder
               .append("METHOD_TYPE_PARAMETER_BOUND ")
               .append(var2.getTypeParameterIndex())
               .append(", ")
               .append(var2.getTypeParameterBoundIndex());
            break;
         case 19:
            this.stringBuilder.append("FIELD");
            break;
         case 20:
            this.stringBuilder.append("METHOD_RETURN");
            break;
         case 21:
            this.stringBuilder.append("METHOD_RECEIVER");
            break;
         case 22:
            this.stringBuilder.append("METHOD_FORMAL_PARAMETER ").append(var2.getFormalParameterIndex());
            break;
         case 23:
            this.stringBuilder.append("THROWS ").append(var2.getExceptionIndex());
            break;
         case 64:
            this.stringBuilder.append("LOCAL_VARIABLE");
            break;
         case 65:
            this.stringBuilder.append("RESOURCE_VARIABLE");
            break;
         case 66:
            this.stringBuilder.append("EXCEPTION_PARAMETER ").append(var2.getTryCatchBlockIndex());
            break;
         case 67:
            this.stringBuilder.append("INSTANCEOF");
            break;
         case 68:
            this.stringBuilder.append("NEW");
            break;
         case 69:
            this.stringBuilder.append("CONSTRUCTOR_REFERENCE");
            break;
         case 70:
            this.stringBuilder.append("METHOD_REFERENCE");
            break;
         case 71:
            this.stringBuilder.append("CAST ").append(var2.getTypeArgumentIndex());
            break;
         case 72:
            this.stringBuilder.append("CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT ").append(var2.getTypeArgumentIndex());
            break;
         case 73:
            this.stringBuilder.append("METHOD_INVOCATION_TYPE_ARGUMENT ").append(var2.getTypeArgumentIndex());
            break;
         case 74:
            this.stringBuilder.append("CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT ").append(var2.getTypeArgumentIndex());
            break;
         case 75:
            this.stringBuilder.append("METHOD_REFERENCE_TYPE_ARGUMENT ").append(var2.getTypeArgumentIndex());
      }
   }

   private void appendFrameTypes(int var1, Object[] var2) {
      for (int var3 = 0; var3 < var1; var3++) {
         if (var3 > 0) {
            this.stringBuilder.append(' ');
         }

         if (var2[var3] instanceof String) {
            String var4 = (String)var2[var3];
            if (var4.charAt(0) == '[') {
               this.appendDescriptor(1, var4);
            } else {
               this.appendDescriptor(0, var4);
            }
         } else if (var2[var3] instanceof Integer) {
            this.stringBuilder.append(FRAME_TYPES.get((Integer)var2[var3]));
         } else {
            this.appendLabel((Label)var2[var3]);
         }
      }
   }

   private Textifier addNewTextifier(String var1) {
      Textifier var2 = this.createTextifier();
      this.text.add(var2.getText());
      if (var1 != null) {
         this.text.add(var1);
      }

      return var2;
   }

   protected Textifier createTextifier() {
      return new Textifier(this.api);
   }
}
