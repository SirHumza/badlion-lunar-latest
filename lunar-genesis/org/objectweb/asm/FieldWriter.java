package org.objectweb.asm;

final class FieldWriter extends FieldVisitor {
   private final SymbolTable symbolTable;
   private final int accessFlags;
   private final int nameIndex;
   private final int descriptorIndex;
   private int signatureIndex;
   private int constantValueIndex;
   private AnnotationWriter lastRuntimeVisibleAnnotation;
   private AnnotationWriter lastRuntimeInvisibleAnnotation;
   private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
   private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
   private Attribute firstAttribute;

   FieldWriter(SymbolTable var1, int var2, String var3, String var4, String var5, Object var6) {
      super(589824);
      this.symbolTable = var1;
      this.accessFlags = var2;
      this.nameIndex = var1.addConstantUtf8(var3);
      this.descriptorIndex = var1.addConstantUtf8(var4);
      if (var5 != null) {
         this.signatureIndex = var1.addConstantUtf8(var5);
      }

      if (var6 != null) {
         this.constantValueIndex = var1.addConstant(var6).index;
      }
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      return var2
         ? (this.lastRuntimeVisibleAnnotation = AnnotationWriter.create(this.symbolTable, var1, this.lastRuntimeVisibleAnnotation))
         : (this.lastRuntimeInvisibleAnnotation = AnnotationWriter.create(this.symbolTable, var1, this.lastRuntimeInvisibleAnnotation));
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      return var4
         ? (this.lastRuntimeVisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, var1, var2, var3, this.lastRuntimeVisibleTypeAnnotation))
         : (this.lastRuntimeInvisibleTypeAnnotation = AnnotationWriter.create(this.symbolTable, var1, var2, var3, this.lastRuntimeInvisibleTypeAnnotation));
   }

   @Override
   public void visitAttribute(Attribute var1) {
      var1.nextAttribute = this.firstAttribute;
      this.firstAttribute = var1;
   }

   @Override
   public void visitEnd() {
   }

   int computeFieldInfoSize() {
      int var1 = 8;
      if (this.constantValueIndex != 0) {
         this.symbolTable.addConstantUtf8("ConstantValue");
         var1 += 8;
      }

      var1 += Attribute.computeAttributesSize(this.symbolTable, this.accessFlags, this.signatureIndex);
      var1 += AnnotationWriter.computeAnnotationsSize(
         this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation
      );
      if (this.firstAttribute != null) {
         var1 += this.firstAttribute.computeAttributesSize(this.symbolTable);
      }

      return var1;
   }

   void putFieldInfo(ByteVector var1) {
      boolean var2 = this.symbolTable.getMajorVersion() < 49;
      int var3 = var2 ? 4096 : 0;
      var1.putShort(this.accessFlags & ~var3).putShort(this.nameIndex).putShort(this.descriptorIndex);
      int var4 = 0;
      if (this.constantValueIndex != 0) {
         var4++;
      }

      if ((this.accessFlags & 4096) != 0 && var2) {
         var4++;
      }

      if (this.signatureIndex != 0) {
         var4++;
      }

      if ((this.accessFlags & 131072) != 0) {
         var4++;
      }

      if (this.lastRuntimeVisibleAnnotation != null) {
         var4++;
      }

      if (this.lastRuntimeInvisibleAnnotation != null) {
         var4++;
      }

      if (this.lastRuntimeVisibleTypeAnnotation != null) {
         var4++;
      }

      if (this.lastRuntimeInvisibleTypeAnnotation != null) {
         var4++;
      }

      if (this.firstAttribute != null) {
         var4 += this.firstAttribute.getAttributeCount();
      }

      var1.putShort(var4);
      if (this.constantValueIndex != 0) {
         var1.putShort(this.symbolTable.addConstantUtf8("ConstantValue")).putInt(2).putShort(this.constantValueIndex);
      }

      Attribute.putAttributes(this.symbolTable, this.accessFlags, this.signatureIndex, var1);
      AnnotationWriter.putAnnotations(
         this.symbolTable,
         this.lastRuntimeVisibleAnnotation,
         this.lastRuntimeInvisibleAnnotation,
         this.lastRuntimeVisibleTypeAnnotation,
         this.lastRuntimeInvisibleTypeAnnotation,
         var1
      );
      if (this.firstAttribute != null) {
         this.firstAttribute.putAttributes(this.symbolTable, var1);
      }
   }

   final void collectAttributePrototypes(Attribute.Set var1) {
      var1.addAttributes(this.firstAttribute);
   }
}
