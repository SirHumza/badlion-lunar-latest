package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

public class RecordComponentNode extends RecordComponentVisitor {
   public String name;
   public String descriptor;
   public String signature;
   public List<AnnotationNode> visibleAnnotations;
   public List<AnnotationNode> invisibleAnnotations;
   public List<TypeAnnotationNode> visibleTypeAnnotations;
   public List<TypeAnnotationNode> invisibleTypeAnnotations;
   public List<Attribute> attrs;

   public RecordComponentNode(String var1, String var2, String var3) {
      this(589824, var1, var2, var3);
      if (this.getClass() != RecordComponentNode.class) {
         throw new IllegalStateException();
      }
   }

   public RecordComponentNode(int var1, String var2, String var3, String var4) {
      super(var1);
      this.name = var2;
      this.descriptor = var3;
      this.signature = var4;
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, boolean var2) {
      AnnotationNode var3 = new AnnotationNode(var1);
      if (var2) {
         this.visibleAnnotations = Util.add(this.visibleAnnotations, var3);
      } else {
         this.invisibleAnnotations = Util.add(this.invisibleAnnotations, var3);
      }

      return var3;
   }

   @Override
   public AnnotationVisitor visitTypeAnnotation(int var1, TypePath var2, String var3, boolean var4) {
      TypeAnnotationNode var5 = new TypeAnnotationNode(var1, var2, var3);
      if (var4) {
         this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, var5);
      } else {
         this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, var5);
      }

      return var5;
   }

   @Override
   public void visitAttribute(Attribute var1) {
      this.attrs = Util.add(this.attrs, var1);
   }

   @Override
   public void visitEnd() {
   }

   public void check(int var1) {
      if (var1 < 524288) {
         throw new UnsupportedClassVersionException();
      }
   }

   public void accept(ClassVisitor var1) {
      RecordComponentVisitor var2 = var1.visitRecordComponent(this.name, this.descriptor, this.signature);
      if (var2 != null) {
         if (this.visibleAnnotations != null) {
            int var3 = 0;

            for (int var4 = this.visibleAnnotations.size(); var3 < var4; var3++) {
               AnnotationNode var5 = this.visibleAnnotations.get(var3);
               var5.accept(var2.visitAnnotation(var5.desc, true));
            }
         }

         if (this.invisibleAnnotations != null) {
            int var6 = 0;

            for (int var10 = this.invisibleAnnotations.size(); var6 < var10; var6++) {
               AnnotationNode var14 = this.invisibleAnnotations.get(var6);
               var14.accept(var2.visitAnnotation(var14.desc, false));
            }
         }

         if (this.visibleTypeAnnotations != null) {
            int var7 = 0;

            for (int var11 = this.visibleTypeAnnotations.size(); var7 < var11; var7++) {
               TypeAnnotationNode var15 = this.visibleTypeAnnotations.get(var7);
               var15.accept(var2.visitTypeAnnotation(var15.typeRef, var15.typePath, var15.desc, true));
            }
         }

         if (this.invisibleTypeAnnotations != null) {
            int var8 = 0;

            for (int var12 = this.invisibleTypeAnnotations.size(); var8 < var12; var8++) {
               TypeAnnotationNode var16 = this.invisibleTypeAnnotations.get(var8);
               var16.accept(var2.visitTypeAnnotation(var16.typeRef, var16.typePath, var16.desc, false));
            }
         }

         if (this.attrs != null) {
            int var9 = 0;

            for (int var13 = this.attrs.size(); var9 < var13; var9++) {
               var2.visitAttribute(this.attrs.get(var9));
            }
         }

         var2.visitEnd();
      }
   }
}
