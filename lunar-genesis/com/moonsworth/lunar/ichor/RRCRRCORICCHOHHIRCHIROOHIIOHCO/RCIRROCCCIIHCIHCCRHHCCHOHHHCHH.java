package com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.util.List;
import lombok.Generated;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.Handle;
import org.objectweb.asm.commons.ModuleHashesAttribute;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InnerClassNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ModuleExportNode;
import org.objectweb.asm.tree.ModuleNode;
import org.objectweb.asm.tree.ModuleOpenNode;
import org.objectweb.asm.tree.ModuleProvideNode;
import org.objectweb.asm.tree.ModuleRequireNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.RecordComponentNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final boolean RHCRIHIHCRCORHOCIRIOHOHCROHICC = false;
   protected final ClassNode OOIHORCORCHIRHCRRORCOIOIHRRICO;
   protected final Remapper OHHOIRORRIIHHHOIHOCOHHOCCHOORC;

   public static ClassNode RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0, ClassNode var1, Remapper var2) {
      long var3 = System.currentTimeMillis();
      new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2).run();
      long var5 = System.currentTimeMillis() - var3;
      if (com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
         var0.ICRRROORIRORIHIOHCRCIIIHOORCIO().CRIOIRIORRCIRHROOCIIIOOCROHHCC.compute(var1.name, (var2x, var3x) -> var3x == null ? var5 : var3x + var5);
      }

      return var1;
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var0, MethodNode var1, Remapper var2) {
      com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, var2
      );
      var3.new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1).run();
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var0, Remapper var1) {
      new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1).run();
   }

   public void run() {
      this.HHCROCCICIIICRRRCRIRHRRCHCCHRH();
      this.IHROCRICHICIOHOCRRCOIHRICCICHI();
      this.RIHOCRROROHROCRROOHICOCCCIHICO();
      this.OOOHIHRHIOHIOCIHHHRCCROOOCHHHI();
      this.RHOCHORHOIORHOCHOROOHHHRRHICHI();
      this.OHOIHOOIRCROOHCROOOOOIIHHRRROC();
      this.HHORIIHRRRIIRIRHOCCIHCCHHHHORH();
      this.RHIHCRIIHICHROIHOHHROCHCRRRCHI();
      this.OHRIICHOHRCICCCICHHHHRHCHIICIC();
      this.remap();
   }

   protected void remap() {
      this.OOIHORCORCHIRHCRRORCOIOIHRRICO.name = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.name);
      this.OOIHORCORCHIRHCRRORCOIOIHRRICO.signature = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapSignature(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.signature, false);
      this.OOIHORCORCHIRHCRRORCOIOIHRRICO.superName = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.superName);
      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.interfaces != null) {
         for (int var1 = 0; var1 < this.OOIHORCORCHIRHCRRORCOIOIHRRICO.interfaces.size(); var1++) {
            this.OOIHORCORCHIRHCRRORCOIOIHRRICO
               .interfaces
               .set(var1, this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.interfaces.get(var1)));
         }
      }

      this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.visibleAnnotations, this.OOIHORCORCHIRHCRRORCOIOIHRRICO.invisibleAnnotations);
      this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         this.OOIHORCORCHIRHCRRORCOIOIHRRICO.visibleTypeAnnotations, this.OOIHORCORCHIRHCRRORCOIOIHRRICO.invisibleTypeAnnotations
      );
   }

   protected void HHCROCCICIIICRRRCRIRHRRCHCCHRH() {
      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.module != null) {
         new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.module).run();
      }
   }

   protected void IHROCRICHICIOHOCRRCOIHRICCICHI() {
      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.attrs != null) {
         for (Attribute var2 : this.OOIHORCORCHIRHCRRORCOIOIHRRICO.attrs) {
            if (var2 instanceof ModuleHashesAttribute var3) {
               List var4 = var3.modules;

               for (int var5 = 0; var5 < var4.size(); var5++) {
                  var4.set(var5, this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapModuleName((String)var4.get(var5)));
               }
            }
         }
      }
   }

   protected void RIHOCRROROHROCRROOHICOCCCIHICO() {
      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.recordComponents != null) {
         for (RecordComponentNode var2 : this.OOIHORCORCHIRHCRRORCOIOIHRRICO.recordComponents) {
            new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2).run();
         }
      }
   }

   protected void OOOHIHRHIOHIOCIHHHRCCROOOCHHHI() {
      for (FieldNode var2 : this.OOIHORCORCHIRHCRRORCOIOIHRRICO.fields) {
         new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2).run();
      }
   }

   protected void RHOCHORHOIORHOCHOROOHHHRRHICHI() {
      for (MethodNode var2 : this.OOIHORCORCHIRHCRRORCOIOIHRRICO.methods) {
         new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2).run();
      }
   }

   protected void OHOIHOOIRCROOHCROOOOOIIHHRRROC() {
      for (int var1 = 0; var1 < this.OOIHORCORCHIRHCRRORCOIOIHRRICO.innerClasses.size(); var1++) {
         InnerClassNode var2 = this.OOIHORCORCHIRHCRRORCOIOIHRRICO.innerClasses.get(var1);
         String var3 = var2.name;
         String var4 = var2.outerName;
         String var5 = var2.innerName;
         var2.name = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var3);
         if (var4 != null) {
            var2.outerName = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var4);
         }

         if (var5 != null) {
            var2.innerName = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapInnerClassName(var3, var4, var5);
         }
      }
   }

   protected void HHORIIHRRRIIRIRHOCCIHCCHHHHORH() {
      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerClass != null) {
         this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerClass = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerClass);
      }

      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerMethod != null) {
         this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerMethod = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapMethodName(
               this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerClass,
               this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerMethod,
               this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerMethodDesc
            );
      }

      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerMethodDesc != null) {
         this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerMethodDesc = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapMethodDesc(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.outerMethodDesc);
      }
   }

   protected void RHIHCRIIHICHROIHOHHROCHCRRRCHI() {
      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.nestHostClass != null) {
         this.OOIHORCORCHIRHCRRORCOIOIHRRICO.nestHostClass = this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.nestHostClass);
      }

      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.nestMembers != null) {
         for (int var1 = 0; var1 < this.OOIHORCORCHIRHCRRORCOIOIHRRICO.nestMembers.size(); var1++) {
            this.OOIHORCORCHIRHCRRORCOIOIHRRICO
               .nestMembers
               .set(var1, this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.nestMembers.get(var1)));
         }
      }
   }

   protected void OHRIICHOHRCICCCICHHHHRHCHIICIC() {
      if (this.OOIHORCORCHIRHCRRORCOIOIHRRICO.permittedSubclasses != null) {
         for (int var1 = 0; var1 < this.OOIHORCORCHIRHCRRORCOIOIHRRICO.permittedSubclasses.size(); var1++) {
            this.OOIHORCORCHIRHCRRORCOIOIHRRICO
               .permittedSubclasses
               .set(var1, this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(this.OOIHORCORCHIRHCRRORCOIOIHRRICO.permittedSubclasses.get(var1)));
         }
      }
   }

   protected <T extends AnnotationNode> void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(List<T> var1, List<T> var2) {
      if (var1 != null) {
         for (AnnotationNode var4 : var1) {
            new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4).run();
         }
      }

      if (var2 != null) {
         for (AnnotationNode var6 : var2) {
            new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6).run();
         }
      }
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var1, Remapper var2) {
      this.OOIHORCORCHIRHCRRORCOIOIHRRICO = var1;
      this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC = var2;
   }

   public class CRRRICCRROCOHHOHIICIHORCOORRRH {
      protected final ModuleNode RIHCRCHCIROOHHHIRRCHOOIHICOIII;

      public void run() {
         this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.name = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapModuleName(this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.name);
         this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.mainClass = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapType(this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.mainClass);
         if (this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.packages != null) {
            for (int var1 = 0; var1 < this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.packages.size(); var1++) {
               this.RIHCRCHCIROOHHHIRRCHOOIHICOIII
                  .packages
                  .set(
                     var1,
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapPackageName(this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.packages.get(var1))
                  );
            }
         }

         if (this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.requires != null) {
            for (ModuleRequireNode var2 : this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.requires) {
               var2.module = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapModuleName(var2.module);
            }
         }

         if (this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.exports != null) {
            for (ModuleExportNode var9 : this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.exports) {
               var9.packaze = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapPackageName(var9.packaze);

               for (int var3 = 0; var3 < var9.modules.size(); var3++) {
                  var9.modules.set(var3, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapModuleName(var9.modules.get(var3)));
               }
            }
         }

         if (this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.opens != null) {
            for (ModuleOpenNode var10 : this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.opens) {
               var10.packaze = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapPackageName(var10.packaze);

               for (int var12 = 0; var12 < var10.modules.size(); var12++) {
                  var10.modules.set(var12, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapModuleName(var10.modules.get(var12)));
               }
            }
         }

         if (this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.uses != null) {
            for (int var7 = 0; var7 < this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.uses.size(); var7++) {
               this.RIHCRCHCIROOHHHIRRCHOOIHICOIII
                  .uses
                  .set(var7, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.uses.get(var7)));
            }
         }

         if (this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.provides != null) {
            for (ModuleProvideNode var11 : this.RIHCRCHCIROOHHHIRRCHOOIHICOIII.provides) {
               var11.service = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var11.service);

               for (int var13 = 0; var13 < var11.providers.size(); var13++) {
                  var11.providers.set(var13, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var11.providers.get(var13)));
               }
            }
         }
      }

      @Generated
      public CRRRICCRROCOHHOHIICIHORCOORRRH(ModuleNode var2) {
         this.RIHCRCHCIROOHHHIRRCHOOIHICOIII = var2;
      }
   }

   public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      protected final MethodNode IRHHROCIHIHICOHIIIIHOCOHRCIHIO;

      public void run() {
         this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.name = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapMethodName(
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OOIHORCORCHIRHCRRORCOIOIHRRICO.name,
               this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.name,
               this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.desc
            );
         this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.desc = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapMethodDesc(this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.desc);

         try {
            this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.signature = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
               .mapSignature(this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.signature, false);
         } catch (Exception var3) {
         }

         if (this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.exceptions != null) {
            for (int var1 = 0; var1 < this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.exceptions.size(); var1++) {
               this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO
                  .exceptions
                  .set(
                     var1, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.exceptions.get(var1))
                  );
            }
         }

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.visibleAnnotations, this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.invisibleAnnotations
         );
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.visibleTypeAnnotations, this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.invisibleTypeAnnotations
         );
         if (this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.visibleParameterAnnotations != null) {
            for (int var4 = 0; var4 < this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.visibleParameterAnnotations.length; var4++) {
               List var2 = this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.visibleParameterAnnotations[var4];
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2, null);
            }
         }

         if (this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.instructions != null) {
            AbstractInsnNode var5 = this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.instructions.getFirst();
            AbstractInsnNode var8 = this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.instructions.getLast();

            while (var5 != null) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
               if (var5 == var8) {
                  break;
               }

               var5 = var5.getNext();
            }
         }

         if (this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.tryCatchBlocks != null) {
            for (int var6 = 0; var6 < this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.tryCatchBlocks.size(); var6++) {
               TryCatchBlockNode var9 = this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.tryCatchBlocks.get(var6);
               var9.type = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var9.type);
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var9.visibleTypeAnnotations, var9.invisibleTypeAnnotations);
            }
         }

         if (this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.localVariables != null) {
            for (int var7 = 0; var7 < this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.localVariables.size(); var7++) {
               LocalVariableNode var10 = this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.localVariables.get(var7);
               var10.desc = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapDesc(var10.desc);
               var10.signature = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapSignature(var10.signature, true);
            }
         }

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.visibleLocalVariableAnnotations, this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO.invisibleLocalVariableAnnotations
         );
      }

      protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AbstractInsnNode var1) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1.visibleTypeAnnotations, var1.invisibleTypeAnnotations);
         if (var1 instanceof FrameNode var2) {
            if (var2.local != null) {
               for (int var9 = 0; var9 < var2.local.size(); var9++) {
                  if (var2.local.get(var9) instanceof String var11) {
                     var2.local.set(var9, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var11));
                  }
               }
            }

            if (var2.stack != null) {
               for (int var12 = 0; var12 < var2.stack.size(); var12++) {
                  if (var2.stack.get(var12) instanceof String var17) {
                     var2.stack.set(var12, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var17));
                  }
               }
            }
         } else if (var1 instanceof FieldInsnNode var3) {
            String var13 = var3.owner;
            var3.owner = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var13);
            var3.name = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapFieldName(var13, var3.name, var3.desc);
            var3.desc = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapDesc(var3.desc);
         } else if (var1 instanceof MethodInsnNode var4) {
            String var14 = var4.owner;
            var4.owner = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var14);
            var4.name = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapMethodName(var14, var4.name, var4.desc);
            var4.desc = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapDesc(var4.desc);
         } else if (var1 instanceof InvokeDynamicInsnNode var5) {
            var5.name = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
               .mapInvokeDynamicMethodName(var5.name, var5.desc, var5.bsm, var5.bsmArgs);
            var5.desc = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapDesc(var5.desc);
            var5.bsm = (Handle)RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapValue(var5.bsm);
            if (var5.bsmArgs != null) {
               for (int var15 = 0; var15 < var5.bsmArgs.length; var15++) {
                  var5.bsmArgs[var15] = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapValue(var5.bsmArgs[var15]);
               }
            }
         } else if (var1 instanceof TypeInsnNode var6) {
            var6.desc = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var6.desc);
         } else if (var1 instanceof LdcInsnNode var7) {
            var7.cst = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapValue(var7.cst);
         } else if (var1 instanceof MultiANewArrayInsnNode var8) {
            var8.desc = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapDesc(var8.desc);
         }
      }

      @Generated
      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(MethodNode var2) {
         this.IRHHROCIHIHICOHIIIIHOCOHRCIHIO = var2;
      }
   }

   public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      protected final FieldNode CHCRIIOORRRCRIOCCIHOIOCHRICRRO;

      public void run() {
         this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.name = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapFieldName(
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OOIHORCORCHIRHCRRORCOIOIHRRICO.name,
               this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.name,
               this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.desc
            );
         this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.desc = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapDesc(this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.desc);
         this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.signature = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapSignature(this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.signature, true);
         if (this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.value != null) {
            this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.value = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
               .mapValue(this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.value);
         }

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.visibleAnnotations, this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.invisibleAnnotations
         );
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.visibleTypeAnnotations, this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO.invisibleTypeAnnotations
         );
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(FieldNode var2) {
         this.CHCRIIOORRRCRIOCCIHOIOCHRICRRO = var2;
      }
   }

   public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final AnnotationNode OOOHHHCICHRRCOIICOHHHOCOOCOCHO;

      public void run() {
         this.OOOHHHCICHRRCOIICOHHHOCOOCOCHO.desc = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapDesc(this.OOOHHHCICHRRCOIICOHHHOCOOCOCHO.desc);
         boolean var1 = this.OOOHHHCICHRRCOIICOHHHOCOOCOCHO.desc.contains("kotlin/Metadata");
         if (this.OOOHHHCICHRRCOIICOHHHOCOOCOCHO.values != null) {
            for (int var2 = 0; var2 < this.OOOHHHCICHRRCOIICOHHHOCOOCOCHO.values.size(); var2++) {
               Object var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapValue(this.OOOHHHCICHRRCOIICOHHHOCOOCOCHO.values.get(var2));
               if (var1 && var3 instanceof List var4) {
                  for (int var5 = 0; var5 < var4.size(); var5++) {
                     if (var4.get(var5) instanceof String var7) {
                        String var8 = var7;

                        try {
                           if (var7.startsWith("(")) {
                              var8 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapMethodDesc(var7);
                           } else if (var7.startsWith("L") && var7.startsWith(";")) {
                              var8 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC.mapType(var7);
                           }
                        } catch (Exception var10) {
                        }

                        if (!var8.equals(var7)) {
                           var4.set(var5, var8);
                        }
                     }
                  }
               }

               this.OOOHHHCICHRRCOIICOHHHOCOOCOCHO.values.set(var2, var3);
            }
         }
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AnnotationNode var2) {
         this.OOOHHHCICHRRCOIICOHHHOCOOCOCHO = var2;
      }
   }

   public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
      protected final RecordComponentNode COCIHRROOHCOIHRHHCCHIIRRIRHHOR;

      public void run() {
         this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.name = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapRecordComponentName(
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OOIHORCORCHIRHCRRORCOIOIHRRICO.name,
               this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.name,
               this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.descriptor
            );
         this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.descriptor = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapDesc(this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.descriptor);
         this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.signature = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHHOIRORRIIHHHOIHOCOHHOCCHOORC
            .mapSignature(this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.signature, true);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.visibleAnnotations, this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.invisibleAnnotations
         );
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.visibleTypeAnnotations, this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR.invisibleTypeAnnotations
         );
      }

      @Generated
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO(RecordComponentNode var2) {
         this.COCIHRROOHCOIHRHHCCHIIRRIRHHOR = var2;
      }
   }
}
