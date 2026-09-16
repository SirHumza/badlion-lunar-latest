package org.spongepowered.asm.mixin.transformer.debug;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Map;
import java.util.jar.Manifest;
import org.jetbrains.java.decompiler.main.Fernflower;
import org.jetbrains.java.decompiler.main.extern.IBytecodeProvider;
import org.jetbrains.java.decompiler.main.extern.IFernflowerLogger;
import org.jetbrains.java.decompiler.main.extern.IResultSaver;
import org.jetbrains.java.decompiler.main.extern.IFernflowerLogger.Severity;
import org.jetbrains.java.decompiler.util.InterpreterUtil;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.mixin.transformer.ext.IDecompiler;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Files;
import org.spongepowered.include.com.google.common.base.Charsets;
import org.spongepowered.include.com.google.common.collect.ImmutableMap;

public class RuntimeDecompiler extends IFernflowerLogger implements IResultSaver, IDecompiler {
   private static final Level[] SEVERITY_LEVELS = new Level[]{Level.TRACE, Level.INFO, Level.WARN, Level.ERROR};
   private final Map<String, Object> options = ImmutableMap.<String, Object>builder()
      .put("din", "0")
      .put("rbr", "0")
      .put("dgs", "1")
      .put("asc", "1")
      .put("den", "1")
      .put("hdc", "1")
      .put("ind", "    ")
      .build();
   private final File outputPath;
   protected final ILogger logger = MixinService.getService().getLogger("fernflower");

   public RuntimeDecompiler(File var1) {
      this.outputPath = var1;
      if (this.outputPath.exists()) {
         try {
            Files.deleteRecursively(this.outputPath);
         } catch (IOException var3) {
            this.logger.debug("Error cleaning output directory: {}", var3.getMessage());
         }
      }
   }

   @Override
   public String toString() {
      try {
         URL var1 = Fernflower.class.getProtectionDomain().getCodeSource().getLocation();
         File var2 = Files.toFile(var1);
         return var2.getName();
      } catch (Exception var3) {
         return "unknown source (classpath)";
      }
   }

   @Override
   public void decompile(File var1) {
      try {
         Fernflower var2 = new Fernflower(new IBytecodeProvider() {
            private byte[] byteCode;

            public byte[] getBytecode(String var1, String var2x) {
               if (this.byteCode == null) {
                  this.byteCode = InterpreterUtil.getBytes(new File(var1));
               }

               return this.byteCode;
            }
         }, this, this.options, this);

         try {
            Method var3 = var2.getClass().getDeclaredMethod("addSource", File.class);
            var3.invoke(var2, var1);
         } catch (ReflectiveOperationException var4) {
            var2.addSource(var1);
         }

         var2.decompileContext();
      } catch (Throwable var5) {
         this.logger.warn("Decompilation error while processing {}", var1.getName());
      }
   }

   public void saveFolder(String var1) {
   }

   public void saveClassFile(String var1, String var2, String var3, String var4, int[] var5) {
      File var6 = new File(this.outputPath, var2 + ".java");
      var6.getParentFile().mkdirs();

      try {
         this.logger.info("Writing {}", var6.getAbsolutePath());
         org.spongepowered.include.com.google.common.io.Files.write(var4, var6, Charsets.UTF_8);
      } catch (IOException var8) {
         this.writeMessage("Cannot write source file " + var6, var8);
      }
   }

   public void startReadingClass(String var1) {
      this.logger.info("Decompiling {}", var1);
   }

   public void writeMessage(String var1, Severity var2) {
      this.logger.log(SEVERITY_LEVELS[var2.ordinal()], var1);
   }

   public void writeMessage(String var1, Throwable var2) {
      this.logger.warn("{} {}: {}", var1, var2.getClass().getSimpleName(), var2.getMessage());
   }

   public void writeMessage(String var1, Severity var2, Throwable var3) {
      this.logger.log(SEVERITY_LEVELS[var2.ordinal()], var1, var2 == Severity.ERROR ? var3 : null);
   }

   public void copyFile(String var1, String var2, String var3) {
   }

   public void createArchive(String var1, String var2, Manifest var3) {
   }

   public void saveDirEntry(String var1, String var2, String var3) {
   }

   public void copyEntry(String var1, String var2, String var3, String var4) {
   }

   public void saveClassEntry(String var1, String var2, String var3, String var4, String var5) {
   }

   public void closeArchive(String var1, String var2) {
   }
}
