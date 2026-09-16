package org.spongepowered.tools.obfuscation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.List;
import javax.annotation.processing.Filer;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorRemappable;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.refmap.ReferenceMapper;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IReferenceManager;

public class ReferenceManager implements IReferenceManager {
   private final IMixinAnnotationProcessor ap;
   private final String outRefMapFileName;
   private final List<ObfuscationEnvironment> environments;
   private final ReferenceMapper refMapper = new ReferenceMapper();
   private boolean allowConflicts;

   public ReferenceManager(IMixinAnnotationProcessor var1, List<ObfuscationEnvironment> var2) {
      this.ap = var1;
      this.environments = var2;
      this.outRefMapFileName = this.ap.getOption("outRefMapFile");
   }

   @Override
   public boolean getAllowConflicts() {
      return this.allowConflicts;
   }

   @Override
   public void setAllowConflicts(boolean var1) {
      this.allowConflicts = var1;
   }

   @Override
   public void write() {
      if (this.outRefMapFileName != null) {
         PrintWriter var1 = null;

         try {
            var1 = this.newWriter(this.outRefMapFileName, "refmap");
            if (var1 != null) {
               this.refMapper.write(var1);
            }
         } catch (IOException var11) {
            var11.printStackTrace();
         } finally {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Exception var10) {
               }
            }
         }
      }
   }

   private PrintWriter newWriter(String var1, String var2) {
      if (var1.matches("^.*[\\\\/:].*$")) {
         File var10 = new File(var1);
         var10.getParentFile().mkdirs();
         this.ap.printMessage(IMessagerEx.MessageType.INFO, "Writing " + var2 + " to " + var10.getAbsolutePath());
         return new PrintWriter(var10);
      }

      try {
         Filer var3 = this.ap.getProcessingEnvironment().getFiler();
         FileObject var4 = null;

         try {
            var4 = var3.createResource(StandardLocation.CLASS_OUTPUT, "", var1);
         } catch (Exception var8) {
            var4 = var3.createResource(StandardLocation.CLASS_OUTPUT, "", new File(var1).getName());
         }

         URI var5 = var4.toUri();
         String var6 = "file".equals(var5.getScheme()) ? new File(var5).getAbsolutePath() : var5.toString();
         PrintWriter var7 = new PrintWriter(var4.openWriter());
         this.ap.printMessage(IMessagerEx.MessageType.INFO, "Writing " + var2 + " to (" + var5.getScheme() + ") " + var6);
         return var7;
      } catch (Exception var9) {
         this.ap
            .printMessage(IMessagerEx.MessageType.ERROR, "Cannot write " + var2 + " to (" + var1 + "): " + var9.getClass().getName() + ": " + var9.getMessage());
         return null;
      }
   }

   @Override
   public ReferenceMapper getMapper() {
      return this.refMapper;
   }

   @Override
   public void addMethodMapping(String var1, String var2, ObfuscationData<MappingMethod> var3) {
      for (ObfuscationEnvironment var5 : this.environments) {
         MappingMethod var6 = (MappingMethod)var3.get(var5.getType());
         if (var6 != null) {
            MemberInfo var7 = new MemberInfo(var6);
            this.addMapping(var5.getType(), var1, var2, var7.toString());
         }
      }
   }

   @Override
   public void addMethodMapping(String var1, String var2, ITargetSelectorRemappable var3, ObfuscationData<MappingMethod> var4) {
      for (ObfuscationEnvironment var6 : this.environments) {
         MappingMethod var7 = (MappingMethod)var4.get(var6.getType());
         if (var7 != null) {
            ITargetSelectorRemappable var8 = var3.remapUsing(var7, true);
            this.addMapping(var6.getType(), var1, var2, var8.toString());
         }
      }
   }

   @Override
   public void addFieldMapping(String var1, String var2, ITargetSelectorRemappable var3, ObfuscationData<MappingField> var4) {
      for (ObfuscationEnvironment var6 : this.environments) {
         MappingField var7 = (MappingField)var4.get(var6.getType());
         if (var7 != null) {
            MemberInfo var8 = MemberInfo.fromMapping(var7.transform(var6.remapDescriptor(var3.getDesc())));
            this.addMapping(var6.getType(), var1, var2, var8.toString());
         }
      }
   }

   @Override
   public void addClassMapping(String var1, String var2, ObfuscationData<String> var3) {
      for (ObfuscationEnvironment var5 : this.environments) {
         String var6 = (String)var3.get(var5.getType());
         if (var6 != null) {
            this.addMapping(var5.getType(), var1, var2, var6);
         }
      }
   }

   protected void addMapping(ObfuscationType var1, String var2, String var3, String var4) {
      String var5 = this.refMapper.addMapping(var1.getKey(), var2, var3, var4);
      if (var1.isDefault()) {
         this.refMapper.addMapping(null, var2, var3, var4);
      }

      if (!this.allowConflicts && var5 != null && !var5.equals(var4)) {
         throw new ReferenceManager.ReferenceConflictException(var5, var4);
      }
   }

   public static class ReferenceConflictException extends RuntimeException {
      private final String oldReference;
      private final String newReference;

      public ReferenceConflictException(String var1, String var2) {
         this.oldReference = var1;
         this.newReference = var2;
      }

      public String getOld() {
         return this.oldReference;
      }

      public String getNew() {
         return this.newReference;
      }
   }
}
