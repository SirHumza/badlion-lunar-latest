package com.moonsworth.lunar.ichor.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import lombok.Generated;
import org.objectweb.asm.tree.ClassNode;

public final class IHHCHHHCRIHOOCOIOOCRIIICIOROIR {
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var0, Path var1, boolean var2, BiFunction<String, byte[], IRRCCOICORICIHCHRHIHIHROIRHOCR> var3) {
      Files.createDirectories(var1.getParent());
      ArrayDeque var4 = new ArrayDeque();
      var4.add(var0);

      try (JarOutputStream var5 = new JarOutputStream(new FileOutputStream(var1.toFile()))) {
         while (!var4.isEmpty()) {
            Path var6 = (Path)var4.poll();
            if (var6 != null) {
               try (JarFile var7 = new JarFile(var6.toFile())) {
                  OCOHORHCROHICRRIHCIHHRRCIHICRI.IRRCCOICORICIHCHRHIHIHROIRHOCR.info("Adding " + var6 + " to " + var1);
                  Enumeration var8 = var7.entries();

                  while (var8.hasMoreElements()) {
                     JarEntry var9 = (JarEntry)var8.nextElement();
                     String var10 = var9.getName();
                     if (!var10.equals("META-INF/MANIFEST.MF")
                        && (
                           !var10.startsWith("META-INF/")
                              || !var10.endsWith(".SF") && !var10.endsWith(".RSA") && !var10.endsWith(".DSA") && !var10.endsWith(".EC")
                        )
                        && !var10.endsWith(".dylib")
                        && !var10.endsWith(".so")
                        && !var10.endsWith(".dll")) {
                        InputStream var11 = var7.getInputStream(var9);
                        byte[] var12 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.toByteArray(
                           var11
                        );
                        var11.close();
                        boolean var13 = false;
                        if (var10.endsWith(".jar")) {
                           Path var21 = Files.createTempFile(var1.getParent(), "temp", ".jar");
                           Files.write(var21, var12);
                           var4.add(var21);
                           OCOHORHCROHICRRIHCIHHRRCIHICRI.IRRCCOICORICIHCHRHIHIHROIRHOCR.info("Added jar-in-jar " + var10 + " from " + var6 + " to " + var1);
                        } else {
                           if (var10.endsWith(".class")) {
                              var13 = true;
                              String var14 = var10.substring(0, var10.length() - ".class".length()).replace('/', '.');
                              IRRCCOICORICIHCHRHIHIHROIRHOCR var15 = (IRRCCOICORICIHCHRHIHIHROIRHOCR)var3.apply(var14, var12);
                              var12 = var15.RIHCHIRRIHRROCIHICHIORICCOOCHH();
                              var10 = var15.className().replace('.', '/') + ".class";
                           }

                           if ((var2 || var13) && var12 != null) {
                              try {
                                 var5.putNextEntry(new ZipEntry(var10));
                                 var5.write(var12);
                                 var5.closeEntry();
                              } catch (ZipException var18) {
                                 if (!var18.getMessage().contains("duplicate entry")) {
                                    throw var18;
                                 }
                              }
                           } else if (var13) {
                              throw new IllegalStateException("Class " + var10 + " became null?");
                           }
                        }
                     }
                  }
               }
            }
         }

         var5.flush();
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var0, Path var1, BiFunction<String, byte[], IRRCCOICORICIHCHRHIHIHROIRHOCR> var2) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, true, var2);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var0, Path var1, Consumer<ClassNode> var2, ClassLoader var3) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, true, (var2x, var3x) -> {
         ClassNode var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var3x, 0);
         var2.accept(var4);
         return new IRRCCOICORICIHCHRHIHIHROIRHOCR(var2x, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3, 0));
      });
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TreeMap<String, byte[]> var0, File var1) {
      JarOutputStream var2 = new JarOutputStream(new FileOutputStream(var1));
      FileTime var3 = FileTime.from(Instant.EPOCH);

      for (Entry var5 : var0.entrySet()) {
         String var6 = (String)var5.getKey();
         byte[] var7 = (byte[])var5.getValue();
         ZipEntry var8 = new ZipEntry(var6);
         var8.setCreationTime(var3);
         var8.setLastAccessTime(var3);
         var8.setLastModifiedTime(var3);
         var2.putNextEntry(var8);
         var2.write(var7);
         var2.closeEntry();
      }

      var2.close();
   }

   public static void RRCRRCORICCHOHHIRCHIROOHIIOHCO(File var0, File var1) {
      TreeMap var2 = new TreeMap();
      JarFile var3 = new JarFile(var0);
      Enumeration var4 = var3.entries();

      while (var4.hasMoreElements()) {
         JarEntry var5 = (JarEntry)var4.nextElement();
         String var6 = var5.getName();
         InputStream var7 = var3.getInputStream(var5);
         byte[] var8 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.toByteArray(
            var3.getInputStream(var5)
         );
         var2.put(var6, var8);
         var7.close();
      }

      var3.close();
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var0, Set<String> var1) {
      try {
         if (Files.exists(var0)) {
            try (ZipFile var2 = new ZipFile(var0.toFile())) {
               Enumeration var3 = var2.entries();

               while (var3.hasMoreElements()) {
                  ZipEntry var4 = (ZipEntry)var3.nextElement();
                  String var5 = var4.getName();
                  if (var5.endsWith(".class")) {
                     var5 = var5.substring(0, var5.length() - ".class".length());
                     if (var5.startsWith("notch/")) {
                        var5 = var5.substring("notch/".length());
                     }

                     var5 = var5.replace('/', '.');
                     var1.add(var5);
                  }
               }
            } catch (IOException var8) {
               throw new IOException("Error while collecting class names for " + var0, var8);
            }
         }
      } catch (Throwable var9) {
         throw var9;
      }
   }

   public static Map<String, byte[]> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var0, Predicate<String> var1) {
      try {
         HashMap var2 = new HashMap();
         if (Files.exists(var0)) {
            try (ZipFile var3 = new ZipFile(var0.toFile())) {
               Enumeration var4 = var3.entries();

               while (var4.hasMoreElements()) {
                  ZipEntry var5 = (ZipEntry)var4.nextElement();
                  String var6 = var5.getName();
                  if (var6.endsWith(".class")) {
                     var6 = var6.substring(0, var6.length() - ".class".length()).replace('/', '.');
                     if (var1.test(var6)) {
                        byte[] var7 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.toByteArray(
                           var3.getInputStream(var5)
                        );
                        var2.put(var6.intern(), var7);
                     }
                  }
               }
            } catch (IOException var10) {
               throw new IOException("Error while loading classes for " + var0, var10);
            }
         }

         return var2;
      } catch (Throwable var11) {
         throw var11;
      }
   }

   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Path var0, Consumer<Path> var1) {
      if (Files.isDirectory(var0)) {
         try (Stream var2 = Files.list(var0)) {
            var2.filter(var0x -> var0x.getFileName().toString().endsWith(".jar")).forEach(var1);
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }
   }

   public static boolean IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(Path var0) {
      try {
         if (Files.notExists(var0)) {
            return false;
         }

         String var1 = var0.toString();
         return !var1.endsWith(".zip") && !var1.endsWith(".jar") ? false : RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var0);
      } catch (Throwable var2) {
         throw var2;
      }
   }

   public static boolean RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(Path var0) {
      try {
         try (ZipFile var1 = new ZipFile(var0.toFile())) {
            return true;
         } catch (Exception var6) {
            Files.delete(var0);
            return false;
         }
      } catch (Throwable var7) {
         throw var7;
      }
   }

   @Generated
   private IHHCHHHCRIHOOCOIOOCRIIICIOROIR() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
