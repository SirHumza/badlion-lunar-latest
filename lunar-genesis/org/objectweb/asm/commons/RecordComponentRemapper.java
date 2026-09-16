package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

public class RecordComponentRemapper extends RecordComponentVisitor {
   protected final Remapper remapper;

   public RecordComponentRemapper(RecordComponentVisitor var1, Remapper var2) {
      this(589824, var1, var2);
   }

   protected RecordComponentRemapper(int var1, RecordComponentVisitor var2, Remapper var3) {
      super(var1, var2);
      this.remapper = var3;
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      AnnotationVisitor var3 = super.visitAnnotation(this.remapper.mapDesc(var1), var2);
      return var3 == null ? null : this.createAnnotationRemapper(var1, var3);
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      AnnotationVisitor var5 = super.visitTypeAnnotation(var1, var2, this.remapper.mapDesc(var3), var4);
      return var5 == null ? null : this.createAnnotationRemapper(var3, var5);
   }

   @Deprecated
   protected AnnotationVisitor createAnnotationRemapper(AnnotationVisitor var1) {
      return new AnnotationRemapper(this.api, null, var1, this.remapper);
   }

   protected AnnotationVisitor createAnnotationRemapper(String var1, AnnotationVisitor var2) {
      return new AnnotationRemapper(this.api, var1, var2, this.remapper).orDeprecatedValue(this.createAnnotationRemapper(var2));
   }
}
