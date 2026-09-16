package org.objectweb.asm.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.BasicVerifier;

public class CheckMethodAdapter extends MethodVisitor {
   private static final CheckMethodAdapter.Method[] OPCODE_METHODS = new CheckMethodAdapter.Method[]{
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INT_INSN,
      CheckMethodAdapter.Method.VISIT_INT_INSN,
      null,
      null,
      null,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      null,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_VAR_INSN,
      null,
      null,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_FIELD_INSN,
      CheckMethodAdapter.Method.VISIT_FIELD_INSN,
      CheckMethodAdapter.Method.VISIT_FIELD_INSN,
      CheckMethodAdapter.Method.VISIT_FIELD_INSN,
      CheckMethodAdapter.Method.VISIT_METHOD_INSN,
      CheckMethodAdapter.Method.VISIT_METHOD_INSN,
      CheckMethodAdapter.Method.VISIT_METHOD_INSN,
      CheckMethodAdapter.Method.VISIT_METHOD_INSN,
      null,
      CheckMethodAdapter.Method.VISIT_TYPE_INSN,
      CheckMethodAdapter.Method.VISIT_INT_INSN,
      CheckMethodAdapter.Method.VISIT_TYPE_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_TYPE_INSN,
      CheckMethodAdapter.Method.VISIT_TYPE_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      CheckMethodAdapter.Method.VISIT_INSN,
      null,
      null,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN,
      CheckMethodAdapter.Method.VISIT_JUMP_INSN
   };
   private static final String INVALID = "Invalid ";
   private static final String INVALID_DESCRIPTOR = "Invalid descriptor: ";
   private static final String INVALID_TYPE_REFERENCE = "Invalid type reference sort 0x";
   private static final String INVALID_LOCAL_VARIABLE_INDEX = "Invalid local variable index";
   private static final String MUST_NOT_BE_NULL_OR_EMPTY = " (must not be null or empty)";
   private static final String START_LABEL = "start label";
   private static final String END_LABEL = "end label";
   private static final String LABEL = "label";
   public int version;
   private int access;
   private int visibleAnnotableParameterCount;
   private int invisibleAnnotableParameterCount;
   private boolean visitCodeCalled;
   private boolean visitMaxCalled;
   private boolean visitEndCalled;
   private int insnCount;
   private final Map<Label, Integer> labelInsnIndices;
   private Set<Label> referencedLabels;
   private int lastFrameInsnIndex = -1;
   private int numExpandedFrames;
   private int numCompressedFrames;
   private List<Label> handlers;

   public CheckMethodAdapter(MethodVisitor var1) {
      this(var1, new HashMap<>());
   }

   public CheckMethodAdapter(MethodVisitor var1, Map<Label, Integer> var2) {
      this(589824, var1, var2);
      if (this.getClass() != CheckMethodAdapter.class) {
         throw new IllegalStateException();
      }
   }

   protected CheckMethodAdapter(int var1, MethodVisitor var2, Map<Label, Integer> var3) {
      super(var1, var2);
      this.labelInsnIndices = var3;
      this.referencedLabels = new HashSet<>();
      this.handlers = new ArrayList<>();
   }

   public CheckMethodAdapter(int var1, String var2, String var3, MethodVisitor var4, Map<Label, Integer> var5) {
      this(589824, var1, var2, var3, var4, var5);
      if (this.getClass() != CheckMethodAdapter.class) {
         throw new IllegalStateException();
      }
   }

   protected CheckMethodAdapter(int var1, int var2, String var3, String var4, final MethodVisitor var5, Map<Label, Integer> var6) {
      this(var1, new MethodNode(var1, var2, var3, var4, null, null) {
         @Override
         public void visitEnd() {
            int var1x = this.maxLocals;
            int var2x = this.maxStack;
            boolean var3x = false;
            boolean var4x = false;
            if (var5 instanceof CheckMethodAdapter.MethodWriterWrapper) {
               CheckMethodAdapter.MethodWriterWrapper var5x = (CheckMethodAdapter.MethodWriterWrapper)var5;
               var3x = !var5x.computesMaxs();
               var4x = var5x.requiresFrames() && !var5x.computesFrames();
            }

            Analyzer var8 = var4x ? new CheckFrameAnalyzer<>(new BasicVerifier()) : new Analyzer<>(new BasicVerifier());

            try {
               if (var3x) {
                  var8.analyze("dummy", this);
               } else {
                  var8.analyzeAndComputeMaxs("dummy", this);
               }
            } catch (IndexOutOfBoundsException | AnalyzerException var7) {
               this.throwError(var8, var7);
            }

            if (var5 != null) {
               this.maxLocals = var1x;
               this.maxStack = var2x;
               this.accept(var5);
            }
         }

         private void throwError(Analyzer<BasicValue> var1, Exception var2x) {
            StringWriter var3x = new StringWriter();
            PrintWriter var4x = new PrintWriter(var3x, true);
            CheckClassAdapter.printAnalyzerResult(this, var1, var4x);
            var4x.close();
            throw new IllegalArgumentException(stringConcat$0(var2x.getMessage(), var3x.toString()), var2x);
         }
      }, var6);
      this.access = var2;
   }

   @Override
   public void visitParameter(String var1, int var2) {
      if (var1 != null) {
         checkUnqualifiedName(this.version, var1, "name");
      }

      CheckClassAdapter.checkAccess(var2, 36880);
      super.visitParameter(var1, var2);
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      this.checkVisitEndNotCalled();
      checkDescriptor(this.version, var1, false);
      return new CheckAnnotationAdapter(super.visitAnnotation(var1, var2));
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      this.checkVisitEndNotCalled();
      int var5 = new TypeReference(var1).getSort();
      if (var5 != 1 && var5 != 18 && var5 != 20 && var5 != 21 && var5 != 22 && var5 != 23) {
         throw new IllegalArgumentException(stringConcat$0(Integer.toHexString(var5)));
      }

      CheckClassAdapter.checkTypeRef(var1);
      checkDescriptor(this.version, var3, false);
      return new CheckAnnotationAdapter(super.visitTypeAnnotation(var1, var2, var3, var4));
   }

   @Override
   public AnnotationVisitor visitAnnotationDefault() {
      this.checkVisitEndNotCalled();
      return new CheckAnnotationAdapter(super.visitAnnotationDefault(), false);
   }

   @Override
   public void visitAnnotableParameterCount(int var1, boolean var2) {
      this.checkVisitEndNotCalled();
      if (var2) {
         this.visibleAnnotableParameterCount = var1;
      } else {
         this.invisibleAnnotableParameterCount = var1;
      }

      super.visitAnnotableParameterCount(var1, var2);
   }

   @Override
   public AnnotationVisitor visitParameterAnnotation(int var1, String var2, boolean var3) {
      this.checkVisitEndNotCalled();
      if ((!var3 || this.visibleAnnotableParameterCount <= 0 || var1 < this.visibleAnnotableParameterCount)
         && (var3 || this.invisibleAnnotableParameterCount <= 0 || var1 < this.invisibleAnnotableParameterCount)) {
         checkDescriptor(this.version, var2, false);
         return new CheckAnnotationAdapter(super.visitParameterAnnotation(var1, var2, var3));
      } else {
         throw new IllegalArgumentException("Invalid parameter index");
      }
   }

   @Override
   public void visitAttribute(Attribute var1) {
      this.checkVisitEndNotCalled();
      if (var1 == null) {
         throw new IllegalArgumentException("Invalid attribute (must not be null)");
      }

      super.visitAttribute(var1);
   }

   @Override
   public void visitCode() {
      if ((this.access & 1024) != 0) {
         throw new UnsupportedOperationException("Abstract methods cannot have code");
      }

      this.visitCodeCalled = true;
      super.visitCode();
   }

   @Override
   public void visitFrame(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      if (this.insnCount == this.lastFrameInsnIndex) {
         throw new IllegalStateException("At most one frame can be visited at a given code location.");
      }

      this.lastFrameInsnIndex = this.insnCount;
      int var6;
      int var7;
      switch (var1) {
         case -1:
         case 0:
            var6 = Integer.MAX_VALUE;
            var7 = Integer.MAX_VALUE;
            break;
         case 1:
         case 2:
            var6 = 3;
            var7 = 0;
            break;
         case 3:
            var6 = 0;
            var7 = 0;
            break;
         case 4:
            var6 = 0;
            var7 = 1;
            break;
         default:
            throw new IllegalArgumentException(stringConcat$1(var1));
      }

      if (var2 > var6) {
         throw new IllegalArgumentException(stringConcat$2(var2, var1));
      }

      if (var4 > var7) {
         throw new IllegalArgumentException(stringConcat$3(var4, var1));
      }

      if (var1 != 2) {
         if (var2 > 0 && (var3 == null || var3.length < var2)) {
            throw new IllegalArgumentException("Array local[] is shorter than numLocal");
         }

         for (int var8 = 0; var8 < var2; var8++) {
            this.checkFrameValue(var3[var8]);
         }
      }

      if (var4 <= 0 || var5 != null && var5.length >= var4) {
         for (int var9 = 0; var9 < var4; var9++) {
            this.checkFrameValue(var5[var9]);
         }

         if (var1 == -1) {
            this.numExpandedFrames++;
         } else {
            this.numCompressedFrames++;
         }

         if (this.numExpandedFrames > 0 && this.numCompressedFrames > 0) {
            throw new IllegalArgumentException("Expanded and compressed frames must not be mixed.");
         }

         super.visitFrame(var1, var2, var3, var4, var5);
      } else {
         throw new IllegalArgumentException("Array stack[] is shorter than numStack");
      }
   }

   @Override
   public void visitInsn(int var1) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkOpcodeMethod(var1, CheckMethodAdapter.Method.VISIT_INSN);
      super.visitInsn(var1);
      this.insnCount++;
   }

   @Override
   public void visitIntInsn(int var1, int var2) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkOpcodeMethod(var1, CheckMethodAdapter.Method.VISIT_INT_INSN);
      switch (var1) {
         case 16:
            checkSignedByte(var2, "Invalid operand");
            break;
         case 17:
            checkSignedShort(var2, "Invalid operand");
            break;
         case 188:
            if (var2 < 4 || var2 > 11) {
               throw new IllegalArgumentException(stringConcat$4(var2));
            }
            break;
         default:
            throw new AssertionError();
      }

      super.visitIntInsn(var1, var2);
      this.insnCount++;
   }

   @Override
   public void visitVarInsn(int var1, int var2) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkOpcodeMethod(var1, CheckMethodAdapter.Method.VISIT_VAR_INSN);
      checkUnsignedShort(var2, "Invalid local variable index");
      super.visitVarInsn(var1, var2);
      this.insnCount++;
   }

   @Override
   public void visitTypeInsn(int var1, String var2) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkOpcodeMethod(var1, CheckMethodAdapter.Method.VISIT_TYPE_INSN);
      checkInternalName(this.version, var2, "type");
      if (var1 == 187 && var2.charAt(0) == '[') {
         throw new IllegalArgumentException(stringConcat$5(var2));
      }

      super.visitTypeInsn(var1, var2);
      this.insnCount++;
   }

   @Override
   public void visitFieldInsn(int var1, String var2, String var3, String var4) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkOpcodeMethod(var1, CheckMethodAdapter.Method.VISIT_FIELD_INSN);
      checkInternalName(this.version, var2, "owner");
      checkUnqualifiedName(this.version, var3, "name");
      checkDescriptor(this.version, var4, false);
      super.visitFieldInsn(var1, var2, var3, var4);
      this.insnCount++;
   }

   @Override
   public void visitMethodInsn(int var1, String var2, String var3, String var4, boolean var5) {
      if (this.api < 327680 && (var1 & 256) == 0) {
         super.visitMethodInsn(var1, var2, var3, var4, var5);
      } else {
         int var6 = var1 & -257;
         this.checkVisitCodeCalled();
         this.checkVisitMaxsNotCalled();
         checkOpcodeMethod(var6, CheckMethodAdapter.Method.VISIT_METHOD_INSN);
         if (var6 != 183 || !"<init>".equals(var3)) {
            checkMethodIdentifier(this.version, var3, "name");
         }

         checkInternalName(this.version, var2, "owner");
         checkMethodDescriptor(this.version, var4);
         if (var6 == 182 && var5) {
            throw new IllegalArgumentException("INVOKEVIRTUAL can't be used with interfaces");
         }

         if (var6 == 185 && !var5) {
            throw new IllegalArgumentException("INVOKEINTERFACE can't be used with classes");
         }

         if (var6 == 183 && var5 && (this.version & 65535) < 52) {
            throw new IllegalArgumentException("INVOKESPECIAL can't be used with interfaces prior to Java 8");
         }

         super.visitMethodInsn(var1, var2, var3, var4, var5);
         this.insnCount++;
      }
   }

   @Override
   public void visitInvokeDynamicInsn(String var1, String var2, Handle var3, Object... var4) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkMethodIdentifier(this.version, var1, "name");
      checkMethodDescriptor(this.version, var2);
      if (var3.getTag() != 6 && var3.getTag() != 8) {
         throw new IllegalArgumentException(stringConcat$6(var3.getTag()));
      }

      for (Object var8 : var4) {
         this.checkLdcConstant(var8);
      }

      super.visitInvokeDynamicInsn(var1, var2, var3, var4);
      this.insnCount++;
   }

   @Override
   public void visitJumpInsn(int var1, Label var2) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkOpcodeMethod(var1, CheckMethodAdapter.Method.VISIT_JUMP_INSN);
      this.checkLabel(var2, false, "label");
      super.visitJumpInsn(var1, var2);
      this.insnCount++;
   }

   @Override
   public void visitLabel(Label var1) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      this.checkLabel(var1, false, "label");
      if (this.labelInsnIndices.get(var1) != null) {
         throw new IllegalStateException("Already visited label");
      }

      this.labelInsnIndices.put(var1, this.insnCount);
      super.visitLabel(var1);
   }

   @Override
   public void visitLdcInsn(Object var1) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      this.checkLdcConstant(var1);
      super.visitLdcInsn(var1);
      this.insnCount++;
   }

   @Override
   public void visitIincInsn(int var1, int var2) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkUnsignedShort(var1, "Invalid local variable index");
      checkSignedShort(var2, "Invalid increment");
      super.visitIincInsn(var1, var2);
      this.insnCount++;
   }

   @Override
   public void visitTableSwitchInsn(int var1, int var2, Label var3, Label... var4) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      if (var2 < var1) {
         throw new IllegalArgumentException(stringConcat$7(var2, var1));
      }

      this.checkLabel(var3, false, "default label");
      if (var4 != null && var4.length == var2 - var1 + 1) {
         for (int var5 = 0; var5 < var4.length; var5++) {
            this.checkLabel(var4[var5], false, stringConcat$8(var5));
         }

         super.visitTableSwitchInsn(var1, var2, var3, var4);
         this.insnCount++;
      } else {
         throw new IllegalArgumentException("There must be max - min + 1 labels");
      }
   }

   @Override
   public void visitLookupSwitchInsn(Label var1, int[] var2, Label[] var3) {
      this.checkVisitMaxsNotCalled();
      this.checkVisitCodeCalled();
      this.checkLabel(var1, false, "default label");
      if (var2 != null && var3 != null && var2.length == var3.length) {
         for (int var4 = 1; var4 < var2.length; var4++) {
            if (var2[var4] < var2[var4 - 1]) {
               throw new IllegalArgumentException("The keys must be sorted in increasing order");
            }
         }

         for (int var5 = 0; var5 < var3.length; var5++) {
            this.checkLabel(var3[var5], false, stringConcat$9(var5));
         }

         super.visitLookupSwitchInsn(var1, var2, var3);
         this.insnCount++;
      } else {
         throw new IllegalArgumentException("There must be the same number of keys and labels");
      }
   }

   @Override
   public void visitMultiANewArrayInsn(String var1, int var2) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkDescriptor(this.version, var1, false);
      if (var1.charAt(0) != '[') {
         throw new IllegalArgumentException(stringConcat$10(var1));
      }

      if (var2 < 1) {
         throw new IllegalArgumentException(stringConcat$11(var2));
      }

      if (var2 > var1.lastIndexOf(91) + 1) {
         throw new IllegalArgumentException(stringConcat$12(var2));
      }

      super.visitMultiANewArrayInsn(var1, var2);
      this.insnCount++;
   }

   @Override
   public AnnotationVisitor visitInsnAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      int var5 = new TypeReference(var1).getSort();
      if (var5 != 67 && var5 != 68 && var5 != 69 && var5 != 70 && var5 != 71 && var5 != 72 && var5 != 73 && var5 != 74 && var5 != 75) {
         throw new IllegalArgumentException(stringConcat$13(Integer.toHexString(var5)));
      }

      CheckClassAdapter.checkTypeRef(var1);
      checkDescriptor(this.version, var3, false);
      return new CheckAnnotationAdapter(super.visitInsnAnnotation(var1, var2, var3, var4));
   }

   @Override
   public void visitTryCatchBlock(Label var1, Label var2, Label var3, String var4) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      this.checkLabel(var1, false, "start label");
      this.checkLabel(var2, false, "end label");
      this.checkLabel(var3, false, "handler label");
      if (this.labelInsnIndices.get(var1) == null && this.labelInsnIndices.get(var2) == null && this.labelInsnIndices.get(var3) == null) {
         if (var4 != null) {
            checkInternalName(this.version, var4, "type");
         }

         super.visitTryCatchBlock(var1, var2, var3, var4);
         this.handlers.add(var1);
         this.handlers.add(var2);
      } else {
         throw new IllegalStateException("Try catch blocks must be visited before their labels");
      }
   }

   @Override
   public AnnotationVisitor visitTryCatchAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      int var5 = new TypeReference(var1).getSort();
      if (var5 != 66) {
         throw new IllegalArgumentException(stringConcat$14(Integer.toHexString(var5)));
      }

      CheckClassAdapter.checkTypeRef(var1);
      checkDescriptor(this.version, var3, false);
      return new CheckAnnotationAdapter(super.visitTryCatchAnnotation(var1, var2, var3, var4));
   }

   @Override
   public void visitLocalVariable(String var1, String var2, String var3, Label var4, Label var5, int var6) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkUnqualifiedName(this.version, var1, "name");
      checkDescriptor(this.version, var2, false);
      if (var3 != null) {
         CheckClassAdapter.checkFieldSignature(var3);
      }

      this.checkLabel(var4, true, "start label");
      this.checkLabel(var5, true, "end label");
      checkUnsignedShort(var6, "Invalid local variable index");
      int var7 = this.labelInsnIndices.get(var4);
      int var8 = this.labelInsnIndices.get(var5);
      if (var8 < var7) {
         throw new IllegalArgumentException("Invalid start and end labels (end must be greater than start)");
      }

      super.visitLocalVariable(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public AnnotationVisitor visitLocalVariableAnnotation(int var1, TypePath var2, Label[] var3, Label[] var4, int[] var5, String var6, boolean var7) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      int var8 = new TypeReference(var1).getSort();
      if (var8 != 64 && var8 != 65) {
         throw new IllegalArgumentException(stringConcat$15(Integer.toHexString(var8)));
      }

      CheckClassAdapter.checkTypeRef(var1);
      checkDescriptor(this.version, var6, false);
      if (var3 != null && var4 != null && var5 != null && var4.length == var3.length && var5.length == var3.length) {
         for (int var9 = 0; var9 < var3.length; var9++) {
            this.checkLabel(var3[var9], true, "start label");
            this.checkLabel(var4[var9], true, "end label");
            checkUnsignedShort(var5[var9], "Invalid local variable index");
            int var10 = this.labelInsnIndices.get(var3[var9]);
            int var11 = this.labelInsnIndices.get(var4[var9]);
            if (var11 < var10) {
               throw new IllegalArgumentException("Invalid start and end labels (end must be greater than start)");
            }
         }

         return super.visitLocalVariableAnnotation(var1, var2, var3, var4, var5, var6, var7);
      } else {
         throw new IllegalArgumentException("Invalid start, end and index arrays (must be non null and of identical length");
      }
   }

   @Override
   public void visitLineNumber(int var1, Label var2) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      checkUnsignedShort(var1, "Invalid line number");
      this.checkLabel(var2, true, "start label");
      super.visitLineNumber(var1, var2);
   }

   @Override
   public void visitMaxs(int var1, int var2) {
      this.checkVisitCodeCalled();
      this.checkVisitMaxsNotCalled();
      this.visitMaxCalled = true;

      for (Label var4 : this.referencedLabels) {
         if (this.labelInsnIndices.get(var4) == null) {
            throw new IllegalStateException("Undefined label used");
         }
      }

      for (byte var6 = 0; var6 < this.handlers.size(); var6 += 2) {
         Integer var7 = this.labelInsnIndices.get(this.handlers.get(var6));
         Integer var5 = this.labelInsnIndices.get(this.handlers.get(var6 + 1));
         if (var5 <= var7) {
            throw new IllegalStateException("Empty try catch block handler range");
         }
      }

      checkUnsignedShort(var1, "Invalid max stack");
      checkUnsignedShort(var2, "Invalid max locals");
      super.visitMaxs(var1, var2);
   }

   @Override
   public void visitEnd() {
      this.checkVisitEndNotCalled();
      this.visitEndCalled = true;
      super.visitEnd();
   }

   private void checkVisitCodeCalled() {
      if (!this.visitCodeCalled) {
         throw new IllegalStateException("Cannot visit instructions before visitCode has been called.");
      }
   }

   private void checkVisitMaxsNotCalled() {
      if (this.visitMaxCalled) {
         throw new IllegalStateException("Cannot visit instructions after visitMaxs has been called.");
      }
   }

   private void checkVisitEndNotCalled() {
      if (this.visitEndCalled) {
         throw new IllegalStateException("Cannot visit elements after visitEnd has been called.");
      }
   }

   private void checkFrameValue(Object var1) {
      if (var1 != Opcodes.TOP
         && var1 != Opcodes.INTEGER
         && var1 != Opcodes.FLOAT
         && var1 != Opcodes.LONG
         && var1 != Opcodes.DOUBLE
         && var1 != Opcodes.NULL
         && var1 != Opcodes.UNINITIALIZED_THIS) {
         if (var1 instanceof String) {
            checkInternalName(this.version, (String)var1, "Invalid stack frame value");
         } else {
            if (!(var1 instanceof Label)) {
               throw new IllegalArgumentException(stringConcat$16(String.valueOf(var1)));
            }

            this.checkLabel((Label)var1, false, "label");
         }
      }
   }

   private static void checkOpcodeMethod(int var0, CheckMethodAdapter.Method var1) {
      if (var0 >= 0 && var0 <= 199) {
         if (OPCODE_METHODS[var0] != var1) {
            throw new IllegalArgumentException(stringConcat$18(var0, String.valueOf(var1)));
         }
      } else {
         throw new IllegalArgumentException(stringConcat$17(var0));
      }
   }

   private static void checkSignedByte(int var0, String var1) {
      if (var0 < -128 || var0 > 127) {
         throw new IllegalArgumentException(stringConcat$19(var1, var0));
      }
   }

   private static void checkSignedShort(int var0, String var1) {
      if (var0 < -32768 || var0 > 32767) {
         throw new IllegalArgumentException(stringConcat$20(var1, var0));
      }
   }

   private static void checkUnsignedShort(int var0, String var1) {
      if (var0 < 0 || var0 > 65535) {
         throw new IllegalArgumentException(stringConcat$21(var1, var0));
      }
   }

   static void checkConstant(Object var0) {
      if (!(var0 instanceof Integer) && !(var0 instanceof Float) && !(var0 instanceof Long) && !(var0 instanceof Double) && !(var0 instanceof String)) {
         throw new IllegalArgumentException(stringConcat$22(String.valueOf(var0)));
      }
   }

   private void checkLdcConstant(Object var1) {
      if (var1 instanceof Type) {
         int var2 = ((Type)var1).getSort();
         if (var2 != 10 && var2 != 9 && var2 != 11) {
            throw new IllegalArgumentException("Illegal LDC constant value");
         }

         if (var2 != 11 && (this.version & 65535) < 49) {
            throw new IllegalArgumentException("ldc of a constant class requires at least version 1.5");
         }

         if (var2 == 11 && (this.version & 65535) < 51) {
            throw new IllegalArgumentException("ldc of a method type requires at least version 1.7");
         }
      } else if (var1 instanceof Handle) {
         if ((this.version & 65535) < 51) {
            throw new IllegalArgumentException("ldc of a Handle requires at least version 1.7");
         }

         Handle var5 = (Handle)var1;
         int var3 = var5.getTag();
         if (var3 < 1 || var3 > 9) {
            throw new IllegalArgumentException(stringConcat$23(var3));
         }

         checkInternalName(this.version, var5.getOwner(), "handle owner");
         if (var3 <= 4) {
            checkDescriptor(this.version, var5.getDesc(), false);
         } else {
            checkMethodDescriptor(this.version, var5.getDesc());
         }

         String var4 = var5.getName();
         if (!"<init>".equals(var4) || var3 != 8) {
            checkMethodIdentifier(this.version, var4, "handle name");
         }
      } else if (var1 instanceof ConstantDynamic) {
         if ((this.version & 65535) < 55) {
            throw new IllegalArgumentException("ldc of a ConstantDynamic requires at least version 11");
         }

         ConstantDynamic var6 = (ConstantDynamic)var1;
         checkMethodIdentifier(this.version, var6.getName(), "constant dynamic name");
         checkDescriptor(this.version, var6.getDescriptor(), false);
         this.checkLdcConstant(var6.getBootstrapMethod());
         int var7 = var6.getBootstrapMethodArgumentCount();

         for (int var8 = 0; var8 < var7; var8++) {
            this.checkLdcConstant(var6.getBootstrapMethodArgument(var8));
         }
      } else {
         checkConstant(var1);
      }
   }

   static void checkUnqualifiedName(int var0, String var1, String var2) {
      checkIdentifier(var0, var1, 0, -1, var2);
   }

   static void checkIdentifier(int var0, String var1, int var2, int var3, String var4) {
      if (var1 != null && (var3 == -1 ? var1.length() > var2 : var3 > var2)) {
         int var5 = var3 == -1 ? var1.length() : var3;
         if ((var0 & 65535) >= 49) {
            for (int var7 = var2; var7 < var5; var7 = var1.offsetByCodePoints(var7, 1)) {
               if (".;[/".indexOf(var1.codePointAt(var7)) != -1) {
                  throw new IllegalArgumentException(stringConcat$25(var4, var1));
               }
            }
         } else {
            for (int var6 = var2; var6 < var5; var6 = var1.offsetByCodePoints(var6, 1)) {
               if (var6 == var2 ? !Character.isJavaIdentifierStart(var1.codePointAt(var6)) : !Character.isJavaIdentifierPart(var1.codePointAt(var6))) {
                  throw new IllegalArgumentException(stringConcat$26(var4, var1));
               }
            }
         }
      } else {
         throw new IllegalArgumentException(stringConcat$24(var4));
      }
   }

   static void checkMethodIdentifier(int var0, String var1, String var2) {
      if (var1 != null && var1.length() != 0) {
         if ((var0 & 65535) >= 49) {
            for (int var4 = 0; var4 < var1.length(); var4 = var1.offsetByCodePoints(var4, 1)) {
               if (".;[/<>".indexOf(var1.codePointAt(var4)) != -1) {
                  throw new IllegalArgumentException(stringConcat$28(var2, var1));
               }
            }
         } else {
            for (int var3 = 0; var3 < var1.length(); var3 = var1.offsetByCodePoints(var3, 1)) {
               if (var3 == 0 ? !Character.isJavaIdentifierStart(var1.codePointAt(var3)) : !Character.isJavaIdentifierPart(var1.codePointAt(var3))) {
                  throw new IllegalArgumentException(stringConcat$29(var2, var1));
               }
            }
         }
      } else {
         throw new IllegalArgumentException(stringConcat$27(var2));
      }
   }

   static void checkInternalName(int var0, String var1, String var2) {
      if (var1 != null && var1.length() != 0) {
         if (var1.charAt(0) == '[') {
            checkDescriptor(var0, var1, false);
         } else {
            checkInternalClassName(var0, var1, var2);
         }
      } else {
         throw new IllegalArgumentException(stringConcat$30(var2));
      }
   }

   private static void checkInternalClassName(int var0, String var1, String var2) {
      try {
         int var3 = 0;

         int var4;
         while ((var4 = var1.indexOf(47, var3 + 1)) != -1) {
            checkIdentifier(var0, var1, var3, var4, null);
            var3 = var4 + 1;
         }

         checkIdentifier(var0, var1, var3, var1.length(), null);
      } catch (IllegalArgumentException var5) {
         throw new IllegalArgumentException(stringConcat$31(var2, var1), var5);
      }
   }

   static void checkDescriptor(int var0, String var1, boolean var2) {
      int var3 = checkDescriptor(var0, var1, 0, var2);
      if (var3 != var1.length()) {
         throw new IllegalArgumentException(stringConcat$32(var1));
      }
   }

   private static int checkDescriptor(int var0, String var1, int var2, boolean var3) {
      if (var1 != null && var2 < var1.length()) {
         switch (var1.charAt(var2)) {
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
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            default:
               throw new IllegalArgumentException(stringConcat$37(var1));
            case 'L':
               int var5 = var1.indexOf(59, var2);
               if (var2 != -1 && var5 - var2 >= 2) {
                  try {
                     checkInternalClassName(var0, var1.substring(var2 + 1, var5), null);
                  } catch (IllegalArgumentException var7) {
                     throw new IllegalArgumentException(stringConcat$36(var1), var7);
                  }

                  return var5 + 1;
               }

               throw new IllegalArgumentException(stringConcat$35(var1));
            case 'V':
               if (var3) {
                  return var2 + 1;
               }

               throw new IllegalArgumentException(stringConcat$33(var1));
            case '[':
               int var4 = var2 + 1;

               while (var4 < var1.length() && var1.charAt(var4) == '[') {
                  var4++;
               }

               if (var4 < var1.length()) {
                  return checkDescriptor(var0, var1, var4, false);
               } else {
                  throw new IllegalArgumentException(stringConcat$34(var1));
               }
         }
      } else {
         throw new IllegalArgumentException("Invalid type descriptor (must not be null or empty)");
      }
   }

   static void checkMethodDescriptor(int var0, String var1) {
      if (var1 != null && var1.length() != 0) {
         if (var1.charAt(0) == '(' && var1.length() >= 3) {
            int var2 = 1;
            if (var1.charAt(var2) != ')') {
               do {
                  if (var1.charAt(var2) == 'V') {
                     throw new IllegalArgumentException(stringConcat$39(var1));
                  }

                  var2 = checkDescriptor(var0, var1, var2, false);
               } while (var2 < var1.length() && var1.charAt(var2) != ')');
            }

            var2 = checkDescriptor(var0, var1, var2 + 1, true);
            if (var2 != var1.length()) {
               throw new IllegalArgumentException(stringConcat$40(var1));
            }
         } else {
            throw new IllegalArgumentException(stringConcat$38(var1));
         }
      } else {
         throw new IllegalArgumentException("Invalid method descriptor (must not be null or empty)");
      }
   }

   private void checkLabel(Label var1, boolean var2, String var3) {
      if (var1 == null) {
         throw new IllegalArgumentException(stringConcat$41(var3));
      }

      if (var2 && this.labelInsnIndices.get(var1) == null) {
         throw new IllegalArgumentException(stringConcat$42(var3));
      }

      this.referencedLabels.add(var1);
   }

   private enum Method {
      VISIT_INSN,
      VISIT_INT_INSN,
      VISIT_VAR_INSN,
      VISIT_TYPE_INSN,
      VISIT_FIELD_INSN,
      VISIT_METHOD_INSN,
      VISIT_JUMP_INSN;
   }

   static class MethodWriterWrapper extends MethodVisitor {
      private final int version;
      private final ClassWriter owner;

      MethodWriterWrapper(int var1, int var2, ClassWriter var3, MethodVisitor var4) {
         super(var1, var4);
         this.version = var2;
         this.owner = var3;
      }

      boolean computesMaxs() {
         return this.owner.hasFlags(1) || this.owner.hasFlags(2);
      }

      boolean computesFrames() {
         return this.owner.hasFlags(2);
      }

      boolean requiresFrames() {
         return (this.version & 65535) >= 51;
      }
   }
}
