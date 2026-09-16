package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;

public class AnnotationNode extends AnnotationVisitor {
   public String desc;
   public List<Object> values;

   public AnnotationNode(String var1) {
      this(589824, var1);
      if (this.getClass() != AnnotationNode.class) {
         throw new IllegalStateException();
      }
   }

   public AnnotationNode(int var1, String var2) {
      super(var1);
      this.desc = var2;
   }

   AnnotationNode(List<Object> var1) {
      super(589824);
      this.values = var1;
   }

   @Override
   public void visit(String var1, Object var2) {
      if (this.values == null) {
         this.values = new ArrayList<>(this.desc != null ? 2 : 1);
      }

      if (this.desc != null) {
         this.values.add(var1);
      }

      if (var2 instanceof byte[]) {
         this.values.add(Util.asArrayList((byte[])var2));
      } else if (var2 instanceof boolean[]) {
         this.values.add(Util.asArrayList((boolean[])var2));
      } else if (var2 instanceof short[]) {
         this.values.add(Util.asArrayList((short[])var2));
      } else if (var2 instanceof char[]) {
         this.values.add(Util.asArrayList((char[])var2));
      } else if (var2 instanceof int[]) {
         this.values.add(Util.asArrayList((int[])var2));
      } else if (var2 instanceof long[]) {
         this.values.add(Util.asArrayList((long[])var2));
      } else if (var2 instanceof float[]) {
         this.values.add(Util.asArrayList((float[])var2));
      } else if (var2 instanceof double[]) {
         this.values.add(Util.asArrayList((double[])var2));
      } else {
         this.values.add(var2);
      }
   }

   @Override
   public void visitEnum(String var1, String var2, String var3) {
      if (this.values == null) {
         this.values = new ArrayList<>(this.desc != null ? 2 : 1);
      }

      if (this.desc != null) {
         this.values.add(var1);
      }

      this.values.add(new String[]{var2, var3});
   }

   @Override
   public AnnotationVisitor visitAnnotation(String var1, String var2) {
      if (this.values == null) {
         this.values = new ArrayList<>(this.desc != null ? 2 : 1);
      }

      if (this.desc != null) {
         this.values.add(var1);
      }

      AnnotationNode var3 = new AnnotationNode(var2);
      this.values.add(var3);
      return var3;
   }

   @Override
   public AnnotationVisitor visitArray(String var1) {
      if (this.values == null) {
         this.values = new ArrayList<>(this.desc != null ? 2 : 1);
      }

      if (this.desc != null) {
         this.values.add(var1);
      }

      ArrayList var2 = new ArrayList();
      this.values.add(var2);
      return new AnnotationNode(var2);
   }

   @Override
   public void visitEnd() {
   }

   public void check(int var1) {
   }

   public void accept(AnnotationVisitor var1) {
      if (var1 != null) {
         if (this.values != null) {
            byte var2 = 0;

            for (int var3 = this.values.size(); var2 < var3; var2 += 2) {
               String var4 = (String)this.values.get(var2);
               Object var5 = this.values.get(var2 + 1);
               accept(var1, var4, var5);
            }
         }

         var1.visitEnd();
      }
   }

   static void accept(AnnotationVisitor var0, String var1, Object var2) {
      if (var0 != null) {
         if (var2 instanceof String[]) {
            String[] var3 = (String[])var2;
            var0.visitEnum(var1, var3[0], var3[1]);
         } else if (var2 instanceof AnnotationNode) {
            AnnotationNode var7 = (AnnotationNode)var2;
            var7.accept(var0.visitAnnotation(var1, var7.desc));
         } else if (var2 instanceof List) {
            AnnotationVisitor var8 = var0.visitArray(var1);
            if (var8 != null) {
               List var4 = (List)var2;
               int var5 = 0;

               for (int var6 = var4.size(); var5 < var6; var5++) {
                  accept(var8, null, var4.get(var5));
               }

               var8.visitEnd();
            }
         } else {
            var0.visit(var1, var2);
         }
      }
   }
}
