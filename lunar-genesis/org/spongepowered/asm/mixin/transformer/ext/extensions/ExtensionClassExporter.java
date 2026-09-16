package org.spongepowered.asm.mixin.transformer.ext.extensions;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.regex.Pattern;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ext.IDecompiler;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.transformers.MixinClassWriter;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.Files;
import org.spongepowered.asm.util.perf.Profiler;

public class ExtensionClassExporter implements IExtension {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final File classExportDir = new File(Constants.DEBUG_OUTPUT_DIR, "class");
   private final IDecompiler decompiler;

   public ExtensionClassExporter(MixinEnvironment var1) {
      this.decompiler = this.initDecompiler(var1, new File(Constants.DEBUG_OUTPUT_DIR, "java"));

      try {
         Files.deleteRecursively(this.classExportDir);
      } catch (IOException var3) {
         logger.debug("Error cleaning class output directory: {}", var3.getMessage());
      }
   }

   public boolean isDecompilerActive() {
      return this.decompiler != null;
   }

   private IDecompiler initDecompiler(MixinEnvironment var1, File var2) {
      if (!var1.getOption(MixinEnvironment.Option.DEBUG_EXPORT_DECOMPILE)) {
         return null;
      }

      try {
         boolean var3 = var1.getOption(MixinEnvironment.Option.DEBUG_EXPORT_DECOMPILE_THREADED);
         logger.info("Attempting to load Fernflower decompiler{}", var3 ? " (Threaded mode)" : "");
         String var4 = "org.spongepowered.asm.mixin.transformer.debug.RuntimeDecompiler" + (var3 ? "Async" : "");
         Class var5 = Class.forName(var4);
         Constructor var6 = var5.getDeclaredConstructor(File.class);
         IDecompiler var7 = (IDecompiler)var6.newInstance(var2);
         logger.info(
            "Fernflower decompiler was successfully initialised from {}, exported classes will be decompiled{}", var7, var3 ? " in a separate thread" : ""
         );
         return var7;
      } catch (Throwable var8) {
         logger.info("Fernflower could not be loaded, exported classes will not be decompiled. {}: {}", var8.getClass().getSimpleName(), var8.getMessage());
         return null;
      }
   }

   private String prepareFilter(String var1) {
      var1 = "^\\Q" + var1.replace("**", "\u0081").replace("*", "\u0082").replace("?", "\u0083") + "\\E$";
      return var1.replace("\u0081", "\\E.*\\Q").replace("\u0082", "\\E[^\\.]+\\Q").replace("\u0083", "\\E.\\Q").replace("\\Q\\E", "");
   }

   private boolean applyFilter(String var1, String var2) {
      return Pattern.compile(this.prepareFilter(var1), 2).matcher(var2).matches();
   }

   @Override
   public boolean checkActive(MixinEnvironment var1) {
      return true;
   }

   @Override
   public void preApply(ITargetClassContext var1) {
   }

   @Override
   public void postApply(ITargetClassContext var1) {
   }

   @Override
   public void export(MixinEnvironment var1, String var2, boolean var3, ClassNode var4) {
      if (var3 || var1.getOption(MixinEnvironment.Option.DEBUG_EXPORT)) {
         String var5 = var1.getOptionValue(MixinEnvironment.Option.DEBUG_EXPORT_FILTER);
         if (var3 || var5 == null || this.applyFilter(var5, var2)) {
            Profiler.Section var6 = Profiler.getProfiler("export").begin("debug.export");
            File var7 = this.dumpClass(var2.replace('.', '/'), var4);
            if (this.decompiler != null) {
               this.decompiler.decompile(var7);
            }

            var6.end();
         }
      }
   }

   public File dumpClass(String var1, ClassNode var2) {
      File var3 = new File(this.classExportDir, var1 + ".class");
      var3.getParentFile().mkdirs();

      try {
         byte[] var4 = getClassBytes(var2, true);
         if (var4 != null) {
            org.spongepowered.include.com.google.common.io.Files.write(var4, var3);
         }
      } catch (IOException var5) {
      }

      return var3;
   }

   private static byte[] getClassBytes(ClassNode var0, boolean var1) {
      byte[] var2 = null;

      try {
         MixinClassWriter var3 = new MixinClassWriter(var1 ? 2 : 0);
         var0.accept(var3);
         var2 = var3.toByteArray();
      } catch (NegativeArraySizeException var4) {
         if (var1) {
            logger.warn("Exporting class {} with COMPUTE_FRAMES failed! Trying a raw export.", var0.name);
            return getClassBytes(var0, false);
         }

         var4.printStackTrace();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      return var2;
   }
}
