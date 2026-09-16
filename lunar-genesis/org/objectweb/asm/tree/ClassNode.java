package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.ModuleVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

public class ClassNode extends ClassVisitor {
   public int version;
   public int access;
   public String name;
   public String signature;
   public String superName;
   public List<String> interfaces = new ArrayList<>();
   public String sourceFile;
   public String sourceDebug;
   public ModuleNode module;
   public String outerClass;
   public String outerMethod;
   public String outerMethodDesc;
   public List<AnnotationNode> visibleAnnotations;
   public List<AnnotationNode> invisibleAnnotations;
   public List<TypeAnnotationNode> visibleTypeAnnotations;
   public List<TypeAnnotationNode> invisibleTypeAnnotations;
   public List<Attribute> attrs;
   public List<InnerClassNode> innerClasses = new ArrayList<>();
   public String nestHostClass;
   public List<String> nestMembers;
   public List<String> permittedSubclasses;
   public List<RecordComponentNode> recordComponents;
   public List<FieldNode> fields = new ArrayList<>();
   public List<MethodNode> methods = new ArrayList<>();

   public ClassNode() {
      this(589824);
      if (this.getClass() != ClassNode.class) {
         throw new IllegalStateException();
      }
   }

   public ClassNode(int var1) {
      super(var1);
   }

   @Override
   public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      this.version = var1;
      this.access = var2;
      this.name = var3;
      this.signature = var4;
      this.superName = var5;
      this.interfaces = Util.asArrayList(var6);
   }

   @Override
   public void visitSource(String var1, String var2) {
      this.sourceFile = var1;
      this.sourceDebug = var2;
   }

   @Override
   public ModuleVisitor visitModule(String var1, int var2, String var3) {
      this.module = new ModuleNode(var1, var2, var3);
      return this.module;
   }

   @Override
   public void visitNestHost(String var1) {
      this.nestHostClass = var1;
   }

   @Override
   public void visitOuterClass(String var1, String var2, String var3) {
      this.outerClass = var1;
      this.outerMethod = var2;
      this.outerMethodDesc = var3;
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
   public void visitNestMember(String var1) {
      this.nestMembers = Util.add(this.nestMembers, var1);
   }

   @Override
   public void visitPermittedSubclass(String var1) {
      this.permittedSubclasses = Util.add(this.permittedSubclasses, var1);
   }

   @Override
   public void visitInnerClass(String var1, String var2, String var3, int var4) {
      InnerClassNode var5 = new InnerClassNode(var1, var2, var3, var4);
      this.innerClasses.add(var5);
   }

   @Override
   public RecordComponentVisitor visitRecordComponent(String var1, String var2, String var3) {
      RecordComponentNode var4 = new RecordComponentNode(var1, var2, var3);
      this.recordComponents = Util.add(this.recordComponents, var4);
      return var4;
   }

   @Override
   public FieldVisitor visitField(int var1, String var2, String var3, String var4, Object var5) {
      FieldNode var6 = new FieldNode(var1, var2, var3, var4, var5);
      this.fields.add(var6);
      return var6;
   }

   @Override
   public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
      MethodNode var6 = new MethodNode(var1, var2, var3, var4, var5);
      this.methods.add(var6);
      return var6;
   }

   @Override
   public void visitEnd() {
   }

   public void check(int var1) {
      if (var1 < 589824 && this.permittedSubclasses != null) {
         throw new UnsupportedClassVersionException();
      }

      if (var1 >= 524288 || (this.access & 65536) == 0 && this.recordComponents == null) {
         if (var1 >= 458752 || this.nestHostClass == null && this.nestMembers == null) {
            if (var1 < 393216 && this.module != null) {
               throw new UnsupportedClassVersionException();
            }

            if (var1 < 327680) {
               if (this.visibleTypeAnnotations != null && !this.visibleTypeAnnotations.isEmpty()) {
                  throw new UnsupportedClassVersionException();
               }

               if (this.invisibleTypeAnnotations != null && !this.invisibleTypeAnnotations.isEmpty()) {
                  throw new UnsupportedClassVersionException();
               }
            }

            if (this.visibleAnnotations != null) {
               for (int var2 = this.visibleAnnotations.size() - 1; var2 >= 0; var2--) {
                  this.visibleAnnotations.get(var2).check(var1);
               }
            }

            if (this.invisibleAnnotations != null) {
               for (int var3 = this.invisibleAnnotations.size() - 1; var3 >= 0; var3--) {
                  this.invisibleAnnotations.get(var3).check(var1);
               }
            }

            if (this.visibleTypeAnnotations != null) {
               for (int var4 = this.visibleTypeAnnotations.size() - 1; var4 >= 0; var4--) {
                  this.visibleTypeAnnotations.get(var4).check(var1);
               }
            }

            if (this.invisibleTypeAnnotations != null) {
               for (int var5 = this.invisibleTypeAnnotations.size() - 1; var5 >= 0; var5--) {
                  this.invisibleTypeAnnotations.get(var5).check(var1);
               }
            }

            if (this.recordComponents != null) {
               for (int var6 = this.recordComponents.size() - 1; var6 >= 0; var6--) {
                  this.recordComponents.get(var6).check(var1);
               }
            }

            for (int var7 = this.fields.size() - 1; var7 >= 0; var7--) {
               this.fields.get(var7).check(var1);
            }

            for (int var8 = this.methods.size() - 1; var8 >= 0; var8--) {
               this.methods.get(var8).check(var1);
            }
         } else {
            throw new UnsupportedClassVersionException();
         }
      } else {
         throw new UnsupportedClassVersionException();
      }
   }

   public void accept(ClassVisitor var1) {
      String[] var2 = new String[this.interfaces.size()];
      this.interfaces.toArray(var2);
      var1.visit(this.version, this.access, this.name, this.signature, this.superName, var2);
      if (this.sourceFile != null || this.sourceDebug != null) {
         var1.visitSource(this.sourceFile, this.sourceDebug);
      }

      if (this.module != null) {
         this.module.accept(var1);
      }

      if (this.nestHostClass != null) {
         var1.visitNestHost(this.nestHostClass);
      }

      if (this.outerClass != null) {
         var1.visitOuterClass(this.outerClass, this.outerMethod, this.outerMethodDesc);
      }

      if (this.visibleAnnotations != null) {
         int var3 = 0;

         for (int var4 = this.visibleAnnotations.size(); var3 < var4; var3++) {
            AnnotationNode var5 = this.visibleAnnotations.get(var3);
            var5.accept(var1.visitAnnotation(var5.desc, true));
         }
      }

      if (this.invisibleAnnotations != null) {
         int var6 = 0;

         for (int var16 = this.invisibleAnnotations.size(); var6 < var16; var6++) {
            AnnotationNode var26 = this.invisibleAnnotations.get(var6);
            var26.accept(var1.visitAnnotation(var26.desc, false));
         }
      }

      if (this.visibleTypeAnnotations != null) {
         int var7 = 0;

         for (int var17 = this.visibleTypeAnnotations.size(); var7 < var17; var7++) {
            TypeAnnotationNode var27 = this.visibleTypeAnnotations.get(var7);
            var27.accept(var1.visitTypeAnnotation(var27.typeRef, var27.typePath, var27.desc, true));
         }
      }

      if (this.invisibleTypeAnnotations != null) {
         int var8 = 0;

         for (int var18 = this.invisibleTypeAnnotations.size(); var8 < var18; var8++) {
            TypeAnnotationNode var28 = this.invisibleTypeAnnotations.get(var8);
            var28.accept(var1.visitTypeAnnotation(var28.typeRef, var28.typePath, var28.desc, false));
         }
      }

      if (this.attrs != null) {
         int var9 = 0;

         for (int var19 = this.attrs.size(); var9 < var19; var9++) {
            var1.visitAttribute(this.attrs.get(var9));
         }
      }

      if (this.nestMembers != null) {
         int var10 = 0;

         for (int var20 = this.nestMembers.size(); var10 < var20; var10++) {
            var1.visitNestMember(this.nestMembers.get(var10));
         }
      }

      if (this.permittedSubclasses != null) {
         int var11 = 0;

         for (int var21 = this.permittedSubclasses.size(); var11 < var21; var11++) {
            var1.visitPermittedSubclass(this.permittedSubclasses.get(var11));
         }
      }

      int var12 = 0;

      for (int var22 = this.innerClasses.size(); var12 < var22; var12++) {
         this.innerClasses.get(var12).accept(var1);
      }

      if (this.recordComponents != null) {
         var12 = 0;

         for (int var23 = this.recordComponents.size(); var12 < var23; var12++) {
            this.recordComponents.get(var12).accept(var1);
         }
      }

      var12 = 0;

      for (int var24 = this.fields.size(); var12 < var24; var12++) {
         this.fields.get(var12).accept(var1);
      }

      var12 = 0;

      for (int var25 = this.methods.size(); var12 < var25; var12++) {
         this.methods.get(var12).accept(var1);
      }

      var1.visitEnd();
   }
}
