package org.objectweb.asm;

final class RecordComponentWriter extends RecordComponentVisitor {
   private final SymbolTable symbolTable;
   private final int nameIndex;
   private final int descriptorIndex;
   private int signatureIndex;
   private AnnotationWriter lastRuntimeVisibleAnnotation;
   private AnnotationWriter lastRuntimeInvisibleAnnotation;
   private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
   private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
   private Attribute firstAttribute;

   RecordComponentWriter(SymbolTable var1, String var2, String var3, String var4) {
      super(589824);
      this.symbolTable = var1;
      this.nameIndex = var1.addConstantUtf8(var2);
      this.descriptorIndex = var1.addConstantUtf8(var3);
      if (var4 != null) {
         this.signatureIndex = var1.addConstantUtf8(var4);
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

   int computeRecordComponentInfoSize() {
      int var1 = 6;
      var1 += Attribute.computeAttributesSize(this.symbolTable, 0, this.signatureIndex);
      var1 += AnnotationWriter.computeAnnotationsSize(
         this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation
      );
      if (this.firstAttribute != null) {
         var1 += this.firstAttribute.computeAttributesSize(this.symbolTable);
      }

      return var1;
   }

   void putRecordComponentInfo(ByteVector var1) {
      var1.putShort(this.nameIndex).putShort(this.descriptorIndex);
      int var2 = 0;
      if (this.signatureIndex != 0) {
         var2++;
      }

      if (this.lastRuntimeVisibleAnnotation != null) {
         var2++;
      }

      if (this.lastRuntimeInvisibleAnnotation != null) {
         var2++;
      }

      if (this.lastRuntimeVisibleTypeAnnotation != null) {
         var2++;
      }

      if (this.lastRuntimeInvisibleTypeAnnotation != null) {
         var2++;
      }

      if (this.firstAttribute != null) {
         var2 += this.firstAttribute.getAttributeCount();
      }

      var1.putShort(var2);
      Attribute.putAttributes(this.symbolTable, 0, this.signatureIndex, var1);
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
