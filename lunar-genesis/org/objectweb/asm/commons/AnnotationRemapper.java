package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;

public class AnnotationRemapper extends AnnotationVisitor {
   protected final String descriptor;
   protected final Remapper remapper;

   @Deprecated
   public AnnotationRemapper(AnnotationVisitor var1, Remapper var2) {
      this(null, var1, var2);
   }

   public AnnotationRemapper(String var1, AnnotationVisitor var2, Remapper var3) {
      this(589824, var1, var2, var3);
   }

   @Deprecated
   protected AnnotationRemapper(int var1, AnnotationVisitor var2, Remapper var3) {
      this(var1, null, var2, var3);
   }

   protected AnnotationRemapper(int var1, String var2, AnnotationVisitor var3, Remapper var4) {
      super(var1, var3);
      this.descriptor = var2;
      this.remapper = var4;
   }

   @Override
   public void visit(String var1, Object var2) {
      super.visit(this.mapAnnotationAttributeName(var1), this.remapper.mapValue(var2));
   }

   @Override
   public void visitEnum(String var1, String var2, String var3) {
      super.visitEnum(this.mapAnnotationAttributeName(var1), this.remapper.mapDesc(var2), var3);
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, String var2) {
      AnnotationVisitor var3 = super.visitAnnotation(this.mapAnnotationAttributeName(var1), this.remapper.mapDesc(var2));
      if (var3 == null) {
         return null;
      } else {
         return var3 == this.av ? this : this.createAnnotationRemapper(var2, var3);
      }
   }

   @Override
   public AnnotationVisitor visitArray(String var1) {
      AnnotationVisitor var2 = super.visitArray(this.mapAnnotationAttributeName(var1));
      if (var2 == null) {
         return null;
      } else {
         return var2 == this.av ? this : this.createAnnotationRemapper(null, var2);
      }
   }

   @Deprecated
   protected AnnotationVisitor createAnnotationRemapper(AnnotationVisitor var1) {
      return new AnnotationRemapper(this.api, null, var1, this.remapper);
   }

   protected AnnotationVisitor createAnnotationRemapper(String var1, AnnotationVisitor var2) {
      return new AnnotationRemapper(this.api, var1, var2, this.remapper).orDeprecatedValue(this.createAnnotationRemapper(var2));
   }

   final AnnotationVisitor orDeprecatedValue(AnnotationVisitor var1) {
      if (var1.getClass() == this.getClass()) {
         AnnotationRemapper var2 = (AnnotationRemapper)var1;
         if (var2.api == this.api && var2.av == this.av && var2.remapper == this.remapper) {
            return this;
         }
      }

      return var1;
   }

   private String mapAnnotationAttributeName(String var1) {
      return this.descriptor == null ? var1 : this.remapper.mapAnnotationAttributeName(this.descriptor, var1);
   }
}
