package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.MethodVisitor;

public class TryCatchBlockNode {
   public LabelNode start;
   public LabelNode end;
   public LabelNode handler;
   public String type;
   public List<TypeAnnotationNode> visibleTypeAnnotations;
   public List<TypeAnnotationNode> invisibleTypeAnnotations;

   public TryCatchBlockNode(LabelNode var1, LabelNode var2, LabelNode var3, String var4) {
      this.start = var1;
      this.end = var2;
      this.handler = var3;
      this.type = var4;
   }

   public void updateIndex(int var1) {
      int var2 = 1107296256 | var1 << 8;
      if (this.visibleTypeAnnotations != null) {
         int var3 = 0;

         for (int var4 = this.visibleTypeAnnotations.size(); var3 < var4; var3++) {
            this.visibleTypeAnnotations.get(var3).typeRef = var2;
         }
      }

      if (this.invisibleTypeAnnotations != null) {
         int var5 = 0;

         for (int var6 = this.invisibleTypeAnnotations.size(); var5 < var6; var5++) {
            this.invisibleTypeAnnotations.get(var5).typeRef = var2;
         }
      }
   }

   public void accept(MethodVisitor var1) {
      var1.visitTryCatchBlock(this.start.getLabel(), this.end.getLabel(), this.handler == null ? null : this.handler.getLabel(), this.type);
      if (this.visibleTypeAnnotations != null) {
         int var2 = 0;

         for (int var3 = this.visibleTypeAnnotations.size(); var2 < var3; var2++) {
            TypeAnnotationNode var4 = this.visibleTypeAnnotations.get(var2);
            var4.accept(var1.visitTryCatchAnnotation(var4.typeRef, var4.typePath, var4.desc, true));
         }
      }

      if (this.invisibleTypeAnnotations != null) {
         int var5 = 0;

         for (int var6 = this.invisibleTypeAnnotations.size(); var5 < var6; var5++) {
            TypeAnnotationNode var7 = this.invisibleTypeAnnotations.get(var5);
            var7.accept(var1.visitTryCatchAnnotation(var7.typeRef, var7.typePath, var7.desc, false));
         }
      }
   }
}
