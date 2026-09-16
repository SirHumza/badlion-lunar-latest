package org.objectweb.asm;

final class AnnotationWriter extends AnnotationVisitor {
   private final SymbolTable symbolTable;
   private final boolean useNamedValues;
   private final ByteVector annotation;
   private final int numElementValuePairsOffset;
   private int numElementValuePairs;
   private final AnnotationWriter previousAnnotation;
   private AnnotationWriter nextAnnotation;

   AnnotationWriter(SymbolTable var1, boolean var2, ByteVector var3, AnnotationWriter var4) {
      super(589824);
      this.symbolTable = var1;
      this.useNamedValues = var2;
      this.annotation = var3;
      this.numElementValuePairsOffset = var3.length == 0 ? -1 : var3.length - 2;
      this.previousAnnotation = var4;
      if (var4 != null) {
         var4.nextAnnotation = this;
      }
   }

   static AnnotationWriter create(SymbolTable var0, String var1, AnnotationWriter var2) {
      ByteVector var3 = new ByteVector();
      var3.putShort(var0.addConstantUtf8(var1)).putShort(0);
      return new AnnotationWriter(var0, true, var3, var2);
   }

   static AnnotationWriter create(SymbolTable var0, int var1, TypePath var2, String var3, AnnotationWriter var4) {
      ByteVector var5 = new ByteVector();
      TypeReference.putTarget(var1, var5);
      TypePath.put(var2, var5);
      var5.putShort(var0.addConstantUtf8(var3)).putShort(0);
      return new AnnotationWriter(var0, true, var5, var4);
   }

   @Override
   public void visit(String var1, Object var2) {
      this.numElementValuePairs++;
      if (this.useNamedValues) {
         this.annotation.putShort(this.symbolTable.addConstantUtf8(var1));
      }

      if (var2 instanceof String) {
         this.annotation.put12(115, this.symbolTable.addConstantUtf8((String)var2));
      } else if (var2 instanceof Byte) {
         this.annotation.put12(66, this.symbolTable.addConstantInteger((Byte)var2).index);
      } else if (var2 instanceof Boolean) {
         int var3 = (Boolean)var2 ? 1 : 0;
         this.annotation.put12(90, this.symbolTable.addConstantInteger(var3).index);
      } else if (var2 instanceof Character) {
         this.annotation.put12(67, this.symbolTable.addConstantInteger((Character)var2).index);
      } else if (var2 instanceof Short) {
         this.annotation.put12(83, this.symbolTable.addConstantInteger((Short)var2).index);
      } else if (var2 instanceof Type) {
         this.annotation.put12(99, this.symbolTable.addConstantUtf8(((Type)var2).getDescriptor()));
      } else if (var2 instanceof byte[]) {
         byte[] var9 = (byte[])var2;
         this.annotation.put12(91, var9.length);

         for (byte var7 : var9) {
            this.annotation.put12(66, this.symbolTable.addConstantInteger(var7).index);
         }
      } else if (var2 instanceof boolean[]) {
         boolean[] var10 = (boolean[])var2;
         this.annotation.put12(91, var10.length);

         for (boolean var39 : var10) {
            this.annotation.put12(90, this.symbolTable.addConstantInteger(var39 ? 1 : 0).index);
         }
      } else if (var2 instanceof short[]) {
         short[] var11 = (short[])var2;
         this.annotation.put12(91, var11.length);

         for (short var40 : var11) {
            this.annotation.put12(83, this.symbolTable.addConstantInteger(var40).index);
         }
      } else if (var2 instanceof char[]) {
         char[] var12 = (char[])var2;
         this.annotation.put12(91, var12.length);

         for (char var41 : var12) {
            this.annotation.put12(67, this.symbolTable.addConstantInteger(var41).index);
         }
      } else if (var2 instanceof int[]) {
         int[] var13 = (int[])var2;
         this.annotation.put12(91, var13.length);

         for (int var42 : var13) {
            this.annotation.put12(73, this.symbolTable.addConstantInteger(var42).index);
         }
      } else if (var2 instanceof long[]) {
         long[] var14 = (long[])var2;
         this.annotation.put12(91, var14.length);

         for (long var43 : var14) {
            this.annotation.put12(74, this.symbolTable.addConstantLong(var43).index);
         }
      } else if (var2 instanceof float[]) {
         float[] var15 = (float[])var2;
         this.annotation.put12(91, var15.length);

         for (float var44 : var15) {
            this.annotation.put12(70, this.symbolTable.addConstantFloat(var44).index);
         }
      } else if (var2 instanceof double[]) {
         double[] var16 = (double[])var2;
         this.annotation.put12(91, var16.length);

         for (double var45 : var16) {
            this.annotation.put12(68, this.symbolTable.addConstantDouble(var45).index);
         }
      } else {
         Symbol var17 = this.symbolTable.addConstant(var2);
         this.annotation.put12(".s.IFJDCS".charAt(var17.tag), var17.index);
      }
   }

   @Override
   public void visitEnum(String var1, String var2, String var3) {
      this.numElementValuePairs++;
      if (this.useNamedValues) {
         this.annotation.putShort(this.symbolTable.addConstantUtf8(var1));
      }

      this.annotation.put12(101, this.symbolTable.addConstantUtf8(var2)).putShort(this.symbolTable.addConstantUtf8(var3));
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, String var2) {
      this.numElementValuePairs++;
      if (this.useNamedValues) {
         this.annotation.putShort(this.symbolTable.addConstantUtf8(var1));
      }

      this.annotation.put12(64, this.symbolTable.addConstantUtf8(var2)).putShort(0);
      return new AnnotationWriter(this.symbolTable, true, this.annotation, null);
   }

   @Override
   public AnnotationVisitor visitArray(String var1) {
      this.numElementValuePairs++;
      if (this.useNamedValues) {
         this.annotation.putShort(this.symbolTable.addConstantUtf8(var1));
      }

      this.annotation.put12(91, 0);
      return new AnnotationWriter(this.symbolTable, false, this.annotation, null);
   }

   @Override
   public void visitEnd() {
      if (this.numElementValuePairsOffset != -1) {
         byte[] var1 = this.annotation.data;
         var1[this.numElementValuePairsOffset] = (byte)(this.numElementValuePairs >>> 8);
         var1[this.numElementValuePairsOffset + 1] = (byte)this.numElementValuePairs;
      }
   }

   int computeAnnotationsSize(String var1) {
      if (var1 != null) {
         this.symbolTable.addConstantUtf8(var1);
      }

      int var2 = 8;

      for (AnnotationWriter var3 = this; var3 != null; var3 = var3.previousAnnotation) {
         var2 += var3.annotation.length;
      }

      return var2;
   }

   static int computeAnnotationsSize(AnnotationWriter var0, AnnotationWriter var1, AnnotationWriter var2, AnnotationWriter var3) {
      int var4 = 0;
      if (var0 != null) {
         var4 += var0.computeAnnotationsSize("RuntimeVisibleAnnotations");
      }

      if (var1 != null) {
         var4 += var1.computeAnnotationsSize("RuntimeInvisibleAnnotations");
      }

      if (var2 != null) {
         var4 += var2.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
      }

      if (var3 != null) {
         var4 += var3.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
      }

      return var4;
   }

   void putAnnotations(int var1, ByteVector var2) {
      int var3 = 2;
      int var4 = 0;
      AnnotationWriter var5 = this;
      AnnotationWriter var6 = null;

      while (var5 != null) {
         var5.visitEnd();
         var3 += var5.annotation.length;
         var4++;
         var6 = var5;
         var5 = var5.previousAnnotation;
      }

      var2.putShort(var1);
      var2.putInt(var3);
      var2.putShort(var4);

      for (AnnotationWriter var7 = var6; var7 != null; var7 = var7.nextAnnotation) {
         var2.putByteArray(var7.annotation.data, 0, var7.annotation.length);
      }
   }

   static void putAnnotations(SymbolTable var0, AnnotationWriter var1, AnnotationWriter var2, AnnotationWriter var3, AnnotationWriter var4, ByteVector var5) {
      if (var1 != null) {
         var1.putAnnotations(var0.addConstantUtf8("RuntimeVisibleAnnotations"), var5);
      }

      if (var2 != null) {
         var2.putAnnotations(var0.addConstantUtf8("RuntimeInvisibleAnnotations"), var5);
      }

      if (var3 != null) {
         var3.putAnnotations(var0.addConstantUtf8("RuntimeVisibleTypeAnnotations"), var5);
      }

      if (var4 != null) {
         var4.putAnnotations(var0.addConstantUtf8("RuntimeInvisibleTypeAnnotations"), var5);
      }
   }

   static int computeParameterAnnotationsSize(String var0, AnnotationWriter[] var1, int var2) {
      int var3 = 7 + 2 * var2;

      for (int var4 = 0; var4 < var2; var4++) {
         AnnotationWriter var5 = var1[var4];
         var3 += var5 == null ? 0 : var5.computeAnnotationsSize(var0) - 8;
      }

      return var3;
   }

   static void putParameterAnnotations(int var0, AnnotationWriter[] var1, int var2, ByteVector var3) {
      int var4 = 1 + 2 * var2;

      for (int var5 = 0; var5 < var2; var5++) {
         AnnotationWriter var6 = var1[var5];
         var4 += var6 == null ? 0 : var6.computeAnnotationsSize(null) - 8;
      }

      var3.putShort(var0);
      var3.putInt(var4);
      var3.putByte(var2);

      for (int var9 = 0; var9 < var2; var9++) {
         AnnotationWriter var10 = var1[var9];
         AnnotationWriter var7 = null;
         int var8 = 0;

         while (var10 != null) {
            var10.visitEnd();
            var8++;
            var7 = var10;
            var10 = var10.previousAnnotation;
         }

         var3.putShort(var8);

         for (AnnotationWriter var11 = var7; var11 != null; var11 = var11.nextAnnotation) {
            var3.putByteArray(var11.annotation.data, 0, var11.annotation.length);
         }
      }
   }
}
