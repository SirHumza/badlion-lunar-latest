package org.spongepowered.asm.mixin.transformer;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InnerClassNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.transformer.ext.IClassGenerator;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.service.ISyntheticClassInfo;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.IConsumer;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.include.com.google.common.collect.BiMap;
import org.spongepowered.include.com.google.common.collect.HashBiMap;

final class InnerClassGenerator implements IClassGenerator {
   private static Class<? extends ClassVisitor> clRemapper;
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final IConsumer<ISyntheticClassInfo> registry;
   private final Map<String, String> innerClassNames = new HashMap<>();
   private final Map<String, InnerClassGenerator.InnerClassInfo> innerClasses = new HashMap<>();
   private final MixinCoprocessorNestHost nestHostCoprocessor;

   public InnerClassGenerator(IConsumer<ISyntheticClassInfo> var1, MixinCoprocessorNestHost var2) {
      this.registry = var1;
      this.nestHostCoprocessor = var2;
   }

   @Override
   public String getName() {
      return "inner";
   }

   void registerInnerClass(MixinInfo var1, ClassInfo var2, String var3) {
      String var4 = innerClassCoordinate(var1, var2, var3);
      String var5 = this.innerClassNames.get(var4);
      if (var5 == null) {
         var5 = getUniqueReference(var3, var2);
         ClassInfo var6 = var2.resolveNestHost();
         InnerClassGenerator.InnerClassInfo var7 = new InnerClassGenerator.InnerClassInfo(var1, var2, var6, var3, var5, var1);
         this.innerClassNames.put(var4, var5);
         this.innerClasses.put(var5, var7);
         this.registry.accept(var7);
         logger.debug("Inner class {} in {} on {} gets unique name {}", var3, var1.getClassRef(), var2, var5);
         this.nestHostCoprocessor.registerNestMember(var6.getClassName(), var5);
      }
   }

   BiMap<String, String> getInnerClasses(MixinInfo var1, String var2) {
      HashBiMap var3 = HashBiMap.create();

      for (InnerClassGenerator.InnerClassInfo var5 : this.innerClasses.values()) {
         if (var5.getMixin() == var1 && var2.equals(var5.getTargetName())) {
            var3.put(var5.getOriginalName(), var5.getName());
         }
      }

      return var3;
   }

   @Override
   public boolean generate(String var1, ClassNode var2) {
      String var3 = var1.replace('.', '/');
      InnerClassGenerator.InnerClassInfo var4 = this.innerClasses.get(var3);
      return var4 == null ? false : this.generate(var4, var2);
   }

   private boolean generate(InnerClassGenerator.InnerClassInfo var1, ClassNode var2) {
      try {
         logger.debug("Generating mapped inner class {} (originally {})", var1.getName(), var1.getOriginalName());
         var1.accept(new InnerClassGenerator.InnerClassAdapter(createRemappingAdapter(var2, var1), var1));
         return true;
      } catch (InvalidMixinException var4) {
         throw var4;
      } catch (Exception var5) {
         logger.catching(var5);
         return false;
      }
   }

   private static String getUniqueReference(String var0, ClassInfo var1) {
      String var2 = var0.substring(var0.lastIndexOf(36) + 1);
      if (var2.matches("^[0-9]+$")) {
         var2 = "Anonymous";
      }

      UUID var3 = UUID.nameUUIDFromBytes(var0.getBytes(StandardCharsets.UTF_8));
      return String.format("%s$%s$%s", var1, var2, var3.toString().replace("-", ""));
   }

   private static ClassVisitor createRemappingAdapter(ClassVisitor var0, Remapper var1) {
      if (clRemapper == null) {
         try {
            clRemapper = (Class<? extends ClassVisitor>)Class.forName("org.objectweb.asm.commons.ClassRemapper");
         } catch (ClassNotFoundException var4) {
         }

         if (clRemapper == null) {
            try {
               clRemapper = (Class<? extends ClassVisitor>)Class.forName("org.objectweb.asm.commons.RemappingClassAdapter");
            } catch (ClassNotFoundException var3) {
               throw new ClassNotFoundException("org.objectweb.asm.commons.ClassRemapper or org.objectweb.asm.commons.RemappingClassAdapter");
            }
         }
      }

      return clRemapper.getConstructor(ClassVisitor.class, Remapper.class).newInstance(var0, var1);
   }

   private static String innerClassCoordinate(MixinInfo var0, ClassInfo var1, String var2) {
      return String.format("%s:%s:%s", var0.getClassRef(), var2, var1.getName());
   }

   static class InnerClassAdapter extends ClassVisitor {
      private final InnerClassGenerator.InnerClassInfo info;

      InnerClassAdapter(ClassVisitor var1, InnerClassGenerator.InnerClassInfo var2) {
         super(ASM.API_VERSION, var1);
         this.info = var2;
      }

      @Override
      public void visitNestHost(String var1) {
         this.cv.visitNestHost(this.info.getNestHostName());
      }

      @Override
      public void visitSource(String var1, String var2) {
         super.visitSource(var1, var2);
         AnnotationVisitor var3 = this.cv.visitAnnotation("Lorg/spongepowered/asm/mixin/transformer/meta/MixinInner;", false);
         var3.visit("mixin", this.info.getOwner().toString());
         var3.visit("name", this.info.getOriginalName().substring(this.info.getOriginalName().lastIndexOf(47) + 1));
         var3.visitEnd();
      }
   }

   class InnerClassInfo extends Remapper implements ISyntheticClassInfo {
      private final MixinInfo mixin;
      private final ClassInfo targetClassInfo;
      private final String originalName;
      private final String name;
      private final MixinInfo owner;
      private final String ownerName;
      private final String nestHostName;
      private int loadCounter;

      InnerClassInfo(MixinInfo var2, ClassInfo var3, ClassInfo var4, String var5, String var6, MixinInfo var7) {
         this.mixin = var2;
         this.targetClassInfo = var3;
         this.originalName = var5;
         this.name = var6;
         this.owner = var7;
         this.ownerName = var7.getClassRef();
         this.nestHostName = var4.getName();
      }

      @Override
      public IMixinInfo getMixin() {
         return this.mixin;
      }

      @Override
      public boolean isLoaded() {
         return this.loadCounter > 0;
      }

      @Override
      public String getName() {
         return this.name;
      }

      @Override
      public String getClassName() {
         return this.name.replace('/', '.');
      }

      String getOriginalName() {
         return this.originalName;
      }

      MixinInfo getOwner() {
         return this.owner;
      }

      String getTargetName() {
         return this.targetClassInfo.getName();
      }

      String getNestHostName() {
         return this.nestHostName;
      }

      void accept(ClassVisitor var1) {
         ClassNode var2 = MixinService.getService().getBytecodeProvider().getClassNode(this.originalName);
         if (this.loadCounter == 0) {
            this.mixin.validateInnerClass(var2);
         }

         this.readInnerClasses(var2);
         var2.accept(var1);
         this.loadCounter++;
      }

      private void readInnerClasses(ClassNode var1) {
         for (InnerClassNode var3 : var1.innerClasses) {
            if (var3.outerName != null && this.findRemappedName(var3.outerName) != null || var3.name.startsWith(this.mixin.getClassRef() + "$")) {
               InnerClassGenerator.this.registerInnerClass(this.owner, this.targetClassInfo, var3.name);
            }
         }
      }

      @Override
      public String mapFieldName(String var1, String var2, String var3) {
         if (this.ownerName.equals(var1)) {
            ClassInfo.Field var4 = this.owner.getClassInfo().findField(var2, var3, 10);
            if (var4 != null) {
               return var4.getName();
            }
         }

         return super.mapFieldName(var1, var2, var3);
      }

      @Override
      public String mapMethodName(String var1, String var2, String var3) {
         if (this.ownerName.equals(var1)) {
            ClassInfo.Method var4 = this.owner.getClassInfo().findMethod(var2, var3, 10);
            if (var4 != null) {
               return var4.getName();
            }
         }

         return super.mapMethodName(var1, var2, var3);
      }

      @Override
      public String map(String var1) {
         String var2 = this.findRemappedName(var1);
         return var2 != null ? var2 : var1;
      }

      @Override
      public String toString() {
         return this.name;
      }

      private String findRemappedName(String var1) {
         return this.ownerName.equals(var1)
            ? this.targetClassInfo.getName()
            : InnerClassGenerator.this.innerClassNames.get(InnerClassGenerator.innerClassCoordinate(this.owner, this.targetClassInfo, var1));
      }
   }
}
