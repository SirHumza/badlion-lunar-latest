package org.spongepowered.tools.obfuscation;

import java.io.File;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.tools.Diagnostic.Kind;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorRemappable;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.util.ObfuscationUtil;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IObfuscationEnvironment;
import org.spongepowered.tools.obfuscation.mapping.IMappingConsumer;
import org.spongepowered.tools.obfuscation.mapping.IMappingProvider;
import org.spongepowered.tools.obfuscation.mapping.IMappingWriter;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

public abstract class ObfuscationEnvironment implements IObfuscationEnvironment {
   protected final ObfuscationType type;
   protected final IMappingProvider mappingProvider;
   protected final IMappingWriter mappingWriter;
   protected final ObfuscationEnvironment.RemapperProxy remapper = new ObfuscationEnvironment.RemapperProxy();
   protected final IMixinAnnotationProcessor ap;
   protected final String outFileName;
   protected final List<String> inFileNames;
   private boolean initDone;

   protected ObfuscationEnvironment(ObfuscationType var1) {
      this.type = var1;
      this.ap = var1.getAnnotationProcessor();
      this.inFileNames = var1.getInputFileNames();
      this.outFileName = var1.getOutputFileName();
      this.mappingProvider = this.getMappingProvider(this.ap, this.ap.getProcessingEnvironment().getFiler());
      this.mappingWriter = this.getMappingWriter(this.ap, this.ap.getProcessingEnvironment().getFiler());
   }

   @Override
   public String toString() {
      return this.type.toString();
   }

   protected abstract IMappingProvider getMappingProvider(Messager var1, Filer var2);

   protected abstract IMappingWriter getMappingWriter(Messager var1, Filer var2);

   private boolean initMappings() {
      if (!this.initDone) {
         this.initDone = true;
         if (this.inFileNames == null) {
            this.ap
               .printMessage(
                  Kind.ERROR, "The " + this.type.getConfig().getInputFileOption() + " argument was not supplied, obfuscation processing will not occur"
               );
            return false;
         }

         int var1 = 0;

         for (String var3 : this.inFileNames) {
            File var4 = new File(var3);

            try {
               if (var4.isFile()) {
                  this.ap.printMessage(IMessagerEx.MessageType.INFO, "Loading " + this.type + " mappings from " + var4.getAbsolutePath());
                  this.mappingProvider.read(var4);
                  var1++;
               }
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

         if (var1 < 1) {
            this.ap.printMessage(Kind.ERROR, "No valid input files for " + this.type + " could be read, processing may not be sucessful.");
            this.mappingProvider.clear();
         }
      }

      return !this.mappingProvider.isEmpty();
   }

   public ObfuscationType getType() {
      return this.type;
   }

   @Override
   public MappingMethod getObfMethod(ITargetSelectorRemappable var1) {
      MappingMethod var2 = this.getObfMethod(var1.asMethodMapping());
      if (var2 == null && var1.isFullyQualified()) {
         TypeHandle var3 = this.ap.getTypeProvider().getTypeHandle(var1.getOwner());
         if (var3 != null && !var3.isImaginary()) {
            TypeHandle var4 = var3.getSuperclass();
            if (var4 == null) {
               return null;
            }

            String var5 = var4.getSimpleName();
            return this.getObfMethod(var1.move(var5.replace('.', '/')));
         } else {
            return null;
         }
      } else {
         return var2;
      }
   }

   @Override
   public MappingMethod getObfMethod(MappingMethod var1) {
      return this.getObfMethod(var1, true);
   }

   @Override
   public MappingMethod getObfMethod(MappingMethod var1, boolean var2) {
      if (!this.initMappings()) {
         return null;
      }

      boolean var3 = true;
      boolean var4 = false;
      MappingMethod var5 = null;

      for (MappingMethod var6 = var1; var6 != null && var5 == null; var4 = true) {
         var5 = this.mappingProvider.getMethodMapping(var6);
         var6 = var6.getSuper();
      }

      if (var5 == null) {
         if (var2) {
            return null;
         }

         var5 = var1.copy();
         var3 = false;
      } else if (var4) {
         String var8 = this.getObfClass(var1.getOwner());
         var5 = var5.move(var8 != null ? var8 : var1.getOwner());
      }

      String var9 = this.getObfClass(var5.getOwner());
      if (var9 == null || var9.equals(var1.getOwner()) || var9.equals(var5.getOwner())) {
         return var3 ? var5 : null;
      }

      if (var3) {
         return var5.move(var9);
      }

      String var7 = ObfuscationUtil.mapDescriptor(var5.getDesc(), this.remapper);
      return new MappingMethod(var9, var5.getSimpleName(), var7 != null ? var7 : var5.getDesc());
   }

   @Override
   public ITargetSelectorRemappable remapDescriptor(ITargetSelectorRemappable var1) {
      boolean var2 = false;
      String var3 = var1.getOwner();
      if (var3 != null) {
         String var4 = this.remapper.map(var3);
         if (var4 != null) {
            var3 = var4;
            var2 = true;
         }
      }

      String var6 = var1.getDesc();
      if (var6 != null) {
         String var5 = ObfuscationUtil.mapDescriptor(var1.getDesc(), this.remapper);
         if (var5 != null) {
            var6 = var5;
            var2 = true;
         }
      }

      return var2 ? var1.move(var3).transform(var6) : null;
   }

   @Override
   public String remapDescriptor(String var1) {
      String var2 = ObfuscationUtil.mapDescriptor(var1, this.remapper);
      return var2 != null ? var2 : var1;
   }

   @Override
   public MappingField getObfField(ITargetSelectorRemappable var1) {
      return this.getObfField(var1.asFieldMapping(), true);
   }

   @Override
   public MappingField getObfField(MappingField var1) {
      return this.getObfField(var1, true);
   }

   @Override
   public MappingField getObfField(MappingField var1, boolean var2) {
      if (!this.initMappings()) {
         return null;
      }

      MappingField var3 = this.mappingProvider.getFieldMapping(var1);
      if (var3 == null) {
         if (var2) {
            return null;
         }

         var3 = var1;
      }

      String var4 = this.getObfClass(var3.getOwner());
      if (var4 != null && !var4.equals(var1.getOwner()) && !var4.equals(var3.getOwner())) {
         return var3.move(var4);
      } else {
         return var3 != var1 ? var3 : null;
      }
   }

   @Override
   public String getObfClass(String var1) {
      return !this.initMappings() ? null : this.mappingProvider.getClassMapping(var1);
   }

   @Override
   public void writeMappings(Collection<IMappingConsumer> var1) {
      IMappingConsumer.MappingSet var2 = new IMappingConsumer.MappingSet();
      IMappingConsumer.MappingSet var3 = new IMappingConsumer.MappingSet();

      for (IMappingConsumer var5 : var1) {
         var2.addAll(var5.getFieldMappings(this.type));
         var3.addAll(var5.getMethodMappings(this.type));
      }

      this.mappingWriter.write(this.outFileName, this.type, var2, var3);
   }

   final class RemapperProxy implements ObfuscationUtil.IClassRemapper {
      @Override
      public String map(String var1) {
         return ObfuscationEnvironment.this.mappingProvider == null ? null : ObfuscationEnvironment.this.mappingProvider.getClassMapping(var1);
      }

      @Override
      public String unmap(String var1) {
         return ObfuscationEnvironment.this.mappingProvider == null ? null : ObfuscationEnvironment.this.mappingProvider.getClassMapping(var1);
      }
   }
}
