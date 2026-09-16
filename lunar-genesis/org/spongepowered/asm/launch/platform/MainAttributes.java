package org.spongepowered.asm.launch.platform;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.jar.Attributes.Name;
import org.spongepowered.asm.util.Files;
import org.spongepowered.asm.util.JavaVersion;
import org.spongepowered.include.com.google.common.io.ByteSource;

public final class MainAttributes {
   private static final Map<URI, MainAttributes> instances = new HashMap<>();
   protected final Attributes attributes;

   private MainAttributes() {
      this.attributes = new Attributes();
   }

   private MainAttributes(URI var1) {
      this.attributes = getAttributes(var1);
   }

   public final String get(String var1) {
      return this.attributes != null ? this.attributes.getValue(var1) : null;
   }

   public final String get(Name var1) {
      return this.attributes != null ? this.attributes.getValue(var1) : null;
   }

   private static Attributes getAttributes(URI var0) {
      if (var0 == null) {
         return null;
      }

      if ("file".equals(var0.getScheme())) {
         File var1 = Files.toFile(var0);
         if (var1.isFile()) {
            Attributes var2 = getJarAttributes(var1);
            if (var2 != null) {
               return var2;
            }
         } else if (var1.isDirectory()) {
            Attributes var4 = getDirAttributes(var1);
            if (var4 != null) {
               return var4;
            }
         }
      } else if (JavaVersion.current() >= 1.7) {
         Attributes var3 = getNioAttributes(var0);
         if (var3 != null) {
            return var3;
         }
      }

      return new Attributes();
   }

   private static Attributes getJarAttributes(File var0) {
      JarFile var1 = null;

      try {
         var1 = new JarFile(var0);
         Manifest var2 = var1.getManifest();
         if (var2 != null) {
            return var2.getMainAttributes();
         }
      } catch (IOException var14) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (IOException var13) {
         }
      }

      return null;
   }

   private static Attributes getDirAttributes(File var0) {
      File var1 = new File(var0, "META-INF/MANIFEST.MF");
      if (var1.isFile()) {
         ByteSource var2 = org.spongepowered.include.com.google.common.io.Files.asByteSource(var1);
         InputStream var3 = null;

         try {
            var3 = var2.openBufferedStream();
            Manifest var4 = new Manifest(var3);
            return var4.getMainAttributes();
         } catch (IOException var15) {
         } finally {
            try {
               if (var3 != null) {
                  var3.close();
               }
            } catch (IOException var14) {
            }
         }
      }

      return null;
   }

   private static Attributes getNioAttributes(URI var0) {
      try {
         Path var1 = Paths.get(var0).resolve("META-INF/MANIFEST.MF");
         BufferedInputStream var2 = null;

         try {
            var2 = new BufferedInputStream(java.nio.file.Files.newInputStream(var1));
            Manifest var3 = new Manifest(var2);
            return var3.getMainAttributes();
         } catch (IOException var16) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (IOException var15) {
            }
         }
      } catch (FileSystemNotFoundException var18) {
         var18.printStackTrace();
      } catch (InvalidPathException var19) {
         var19.printStackTrace();
      }

      return null;
   }

   public static MainAttributes of(File var0) {
      return of(var0.toURI());
   }

   public static MainAttributes of(URI var0) {
      MainAttributes var1 = instances.get(var0);
      if (var1 == null) {
         var1 = new MainAttributes(var0);
         instances.put(var0, var1);
      }

      return var1;
   }
}
