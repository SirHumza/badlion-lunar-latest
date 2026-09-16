package org.cadixdev.atlas.jar;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.jar.Manifest;
import java.util.stream.Stream;
import org.cadixdev.atlas.util.NIOHelper;
import org.cadixdev.bombe.jar.AbstractJarEntry;
import org.cadixdev.bombe.jar.JarClassEntry;
import org.cadixdev.bombe.jar.JarEntryTransformer;
import org.cadixdev.bombe.jar.JarManifestEntry;
import org.cadixdev.bombe.jar.JarResourceEntry;
import org.cadixdev.bombe.jar.JarServiceProviderConfigurationEntry;
import org.cadixdev.bombe.jar.ServiceProviderConfiguration;
import org.cadixdev.bombe.provider.ClassProvider;

public class JarFile implements Closeable, ClassProvider {
   private final Path path;
   private final FileSystem fs;
   private final Map<JarPath, JarClassEntry> cache = new ConcurrentHashMap<>();

   public JarFile(Path var1) {
      this.path = var1;
      this.fs = NIOHelper.openZip(this.path, false);
   }

   public String getName() {
      return this.path.toString();
   }

   public AbstractJarEntry get(JarPath var1) {
      Path var2 = this.fs.getPath("/", var1.getName());
      if (Files.notExists(var2)) {
         return null;
      } else if ("META-INF/MANIFEST.MF".equals(var1.getName())) {
         return _readManifest(var2);
      } else if (var1.getName().startsWith("META-INF/services/")) {
         return _readServiceConfig(var2);
      } else {
         return var1.getName().endsWith(".class") ? this.getClass(var1) : _readResource(var2);
      }
   }

   public JarClassEntry getClass(JarPath var1) {
      return this.cache.computeIfAbsent(var1, var1x -> {
         Path var2 = this.fs.getPath("/", var1x.getName());
         if (Files.notExists(var2)) {
            return null;
         }

         try {
            return _readClass(var2);
         } catch (IOException var4) {
            return null;
         }
      });
   }

   public JarClassEntry getClass(String var1) {
      return this.getClass(new JarPath(var1));
   }

   public Stream<JarPath> walk(JarVisitOption... var1) {
      return Files.walk(this.fs.getPath("/")).filter(var0 -> !Files.isDirectory(var0)).map(var1x -> {
         String var2 = var1x.toString().substring(1);
         if ("META-INF/MANIFEST.MF".equals(var2)) {
            if (_contains(JarVisitOption.IGNORE_MANIFESTS, var1)) {
               return null;
            }
         } else if (var2.startsWith("META-INF/services/")) {
            if (_contains(JarVisitOption.IGNORE_SERVICE_PROVIDER_CONFIGURATIONS, var1)) {
               return null;
            }
         } else if (var2.endsWith(".class")) {
            if (_contains(JarVisitOption.IGNORE_CLASSES, var1)) {
               return null;
            }
         } else if (_contains(JarVisitOption.IGNORE_RESOURCES, var1)) {
            return null;
         }

         return new JarPath(var2);
      }).filter(Objects::nonNull);
   }

   public void transform(Path var1, JarEntryTransformer... var2) {
      ExecutorService var3 = Executors.newWorkStealingPool();

      try {
         this.transform(var1, var3, var2);
      } finally {
         var3.shutdown();
      }
   }

   public void transform(Path var1, ExecutorService var2, JarEntryTransformer... var3) {
      Files.deleteIfExists(var1);

      try {
         try (FileSystem var31 = NIOHelper.openZip(var1, true)) {
            CompletableFuture var6 = CompletableFuture.allOf(this.walk().map(var4x -> CompletableFuture.runAsync(() -> {
               try {
                  AbstractJarEntry var4xx = this.get(var4x);
                  if (var4xx != null) {
                     for (JarEntryTransformer var8 : var3) {
                        var4xx = var4xx.accept(var8);
                        if (var4xx == null) {
                           return;
                        }
                     }

                     Path var10x = var31.getPath("/", var4xx.getName());
                     Files.createDirectories(var10x.getParent());
                     Files.write(var10x, var4xx.getContents());
                     Files.setLastModifiedTime(var10x, FileTime.fromMillis(var4xx.getTime()));
                  }
               } catch (IOException var9) {
                  throw new CompletionException(var9);
               }
            }, var2)).toArray(CompletableFuture[]::new));
            var6.get();

            for (JarEntryTransformer var10 : var3) {
               for (AbstractJarEntry var12 : var10.additions()) {
                  Path var13 = var31.getPath("/", var12.getName());
                  Files.createDirectories(var13.getParent());
                  Files.write(var13, var12.getContents());
                  Files.setLastModifiedTime(var13, FileTime.fromMillis(var12.getTime()));
               }
            }
         }
      } catch (InterruptedException var29) {
         throw new RuntimeException(var29);
      } catch (ExecutionException var30) {
         ExecutionException var4 = var30;

         try {
            throw var4.getCause();
         } catch (IOException var24) {
            throw var24;
         } catch (Throwable var25) {
            throw new RuntimeException(var25);
         }
      }
   }

   public void process(JarEntryTransformer... var1) {
      ExecutorService var2 = Executors.newWorkStealingPool();

      try {
         this.process(var2, var1);
      } finally {
         var2.shutdown();
      }
   }

   public void process(ExecutorService var1, JarEntryTransformer... var2) {
      CompletableFuture var3 = CompletableFuture.allOf(this.walk().map(var3x -> CompletableFuture.runAsync(() -> {
         try {
            AbstractJarEntry var3xx = this.get(var3x);
            if (var3xx != null) {
               for (JarEntryTransformer var7x : var2) {
                  var3xx = var3xx.accept(var7x);
                  if (var3xx == null) {
                     return;
                  }
               }
            }
         } catch (IOException var8x) {
            throw new CompletionException(var8x);
         }
      }, var1)).toArray(CompletableFuture[]::new));

      try {
         var3.get();
      } catch (InterruptedException var8) {
         throw new RuntimeException(var8);
      } catch (ExecutionException var9) {
         ExecutionException var4 = var9;

         try {
            throw var4.getCause();
         } catch (IOException var6) {
            throw var6;
         } catch (Throwable var7) {
            throw new RuntimeException(var7);
         }
      }
   }

   @Override
   public byte[] get(String var1) {
      JarClassEntry var2 = this.getClass(var1 + ".class");
      return var2 == null ? null : var2.getContents();
   }

   @Override
   public void close() {
      this.fs.close();
   }

   private static JarManifestEntry _readManifest(Path var0) {
      long var1 = Files.getLastModifiedTime(var0).toMillis();

      try (InputStream var3 = Files.newInputStream(var0)) {
         return new JarManifestEntry(var1, new Manifest(var3));
      }
   }

   private static JarServiceProviderConfigurationEntry _readServiceConfig(Path var0) {
      String var1 = var0.toString().substring(1);
      long var2 = Files.getLastModifiedTime(var0).toMillis();

      try (InputStream var4 = Files.newInputStream(var0)) {
         String var6 = var1.substring("META-INF/services/".length());
         ServiceProviderConfiguration var7 = new ServiceProviderConfiguration(var6);
         var7.read(var4);
         return new JarServiceProviderConfigurationEntry(var2, var7);
      }
   }

   private static JarClassEntry _readClass(Path var0) {
      String var1 = var0.toString().substring(1);
      long var2 = Files.getLastModifiedTime(var0).toMillis();
      return new JarClassEntry(var1, var2, Files.readAllBytes(var0));
   }

   private static JarResourceEntry _readResource(Path var0) {
      String var1 = var0.toString().substring(1);
      long var2 = Files.getLastModifiedTime(var0).toMillis();
      return new JarResourceEntry(var1, var2, Files.readAllBytes(var0));
   }

   private static <T> boolean _contains(T var0, T[] var1) {
      for (Object var5 : var1) {
         if (var5 == var0) {
            return true;
         }
      }

      return false;
   }
}
