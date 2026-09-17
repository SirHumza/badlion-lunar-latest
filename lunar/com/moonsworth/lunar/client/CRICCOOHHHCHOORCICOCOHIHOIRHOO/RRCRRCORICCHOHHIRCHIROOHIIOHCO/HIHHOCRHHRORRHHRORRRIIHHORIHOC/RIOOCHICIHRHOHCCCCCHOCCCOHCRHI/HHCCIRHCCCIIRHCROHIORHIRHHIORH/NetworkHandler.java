package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final String CCOHIRORRHOHOIIOOOCRRRIHIIHCIC = "https://ffmpeg.lunarclientcdn.com/%s/ffmpeg-%s-%s.zip";
   private static final String RICOOHRHRIOROCHHORCCHROCHIRCCC = "7.1.1";
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH IIICHHRIIRHRRRRIHHOROROOORROCH;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.IIICHHRIIRHRRRRIHHOROROOORROCH = var1;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Path var2
   ) {
      if (this.IIICHHRIIRHRRRRIHHOROROOORROCH != null) {
         this.IIICHHRIIRHRRRRIHHOROROOORROCH.onStart();
      }

      Path var3 = null;
      HttpURLConnection var4 = null;

      label242: {
         try {
            String var5 = this.ICRIHROOORCCRCROOHORHIHCRRROII();
            String var6 = this.IICOCROCOCIOOIOIIRHIIOCOICIOHO();
            if ("unknown".equals(var5) || "unknown".equals(var6)) {
               this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Unsupported OS or architecture: " + System.getProperty("os.name") + "/" + System.getProperty("os.arch"), null
               );
               return;
            }

            String var7 = String.format("https://ffmpeg.lunarclientcdn.com/%s/ffmpeg-%s-%s.zip", "7.1.1", var5, var6);
            URL var8 = new URL(var7);
            var4 = (HttpURLConnection)var8.openConnection();
            var4.setRequestMethod("GET");
            var4.setConnectTimeout(15000);
            var4.setReadTimeout(300000);
            int var9 = var4.getResponseCode();
            if (var9 == 200) {
               long var10 = var4.getContentLengthLong();
               var3 = Files.createTempFile("ffmpeg-download-", ".zip");
               BufferedInputStream var12 = new BufferedInputStream(var4.getInputStream());

               try (OutputStream var13 = Files.newOutputStream(var3)) {
                  byte[] var14 = new byte[8192];
                  long var16 = 0L;

                  int var15;
                  while ((var15 = var12.read(var14)) != -1) {
                     var13.write(var14, 0, var15);
                     var16 += var15;
                     if (this.IIICHHRIIRHRRRRIHHOROROOORROCH != null) {
                        float var18 = var10 > 0L ? (float)(var16 * 100L) / (float)var10 : -1.0F;
                        this.IIICHHRIIRHRRRRIHHOROROOORROCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var16, var10, var18);
                     }
                  }
               } catch (Throwable var36) {
                  try {
                     var12.close();
                  } catch (Throwable var33) {
                     var36.addSuppressed(var33);
                  }

                  throw var36;
               }

               var12.close();
               this.CCHHIOROOICROROOCOHHCRRICCOCRO("Extracting...");
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2);
               if (!RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isWindows()) {
                  this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var2);
               }
               break label242;
            }

            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("Server returned HTTP " + var9 + " " + var4.getResponseMessage() + " for URL: " + var7, null);
         } catch (Exception var37) {
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("Error during download/extraction: " + var37.getMessage(), var37);
            break label242;
         } finally {
            if (var4 != null) {
               var4.disconnect();
            }

            if (var3 != null) {
               try {
                  Files.deleteIfExists(var3);
               } catch (IOException var32) {
                  com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var32, "FFmpegDownloader"
                  );
               }
            }

            if (this.IIICHHRIIRHRRRRIHHOROROOORROCH != null) {
               this.IIICHHRIIRHRRRRIHHOROROOORROCH.OHCIHHRCCROIHRCRCIIHCROOHRORHC();
            }
         }

         return;
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var39 = var1.OIRIRIIORHRCHRCHROORRROIRROIRI();
      var39.ICOIRORIHIRHCIRRIOOOCRIIOCIHRO().IRICHHCHHCCROCCCHRHOCCCOHCOICH().OCIRRCHORHIHICORIRCCICIRIOCOCI();
   }

   private String ICRIHROOORCCRCROOHORHIHCRRROII() {
      if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isMacos()) {
         return "macos";
      } else if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isWindows()) {
         return "windows";
      } else {
         return RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isLinux() ? "linux" : "unknown";
      }
   }

   private String IICOCROCOCIOOIOIIRHIIOCOICIOHO() {
      String var1 = System.getProperty("os.arch", "generic").toLowerCase(Locale.ENGLISH);
      if (var1.contains("amd64") || var1.contains("x86_64")) {
         return "x64";
      } else if (var1.contains("aarch64") || var1.contains("arm64")) {
         return "arm64";
      } else {
         return var1.contains("x86") ? "x86" : "unknown";
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var1, Path var2) {
      Files.createDirectories(var2);

      ZipEntry var6;
      try (
         InputStream var3 = Files.newInputStream(var1);
         BufferedInputStream var4 = new BufferedInputStream(var3);
         ZipInputStream var5 = new ZipInputStream(var4);
      ) {
         for (; (var6 = var5.getNextEntry()) != null; var5.closeEntry()) {
            Path var7 = var2.resolve(var6.getName());
            if (!var7.normalize().startsWith(var2.normalize())) {
               throw new IOException("Bad zip entry: " + var6.getName() + " (Path traversal attempt)");
            }

            if (var6.isDirectory()) {
               Files.createDirectories(var7);
            } else {
               if (var7.getParent() != null) {
                  Files.createDirectories(var7.getParent());
               }

               Files.copy(var5, var7, StandardCopyOption.REPLACE_EXISTING);
            }
         }
      }
   }

   private void IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Path var1) {
      String var2 = "ffmpeg";
      byte var3 = 5;

      try (Stream var4 = Files.walk(var1, var3)) {
         var4.filter(var0 -> Files.isRegularFile(var0))
            .forEach(
               var2x -> {
                  if (var2x.getFileName().toString().equals(var2)) {
                     if (!Files.isExecutable(var2x)) {
                        try {
                           if (!var2x.toFile().setExecutable(true)) {
                              this.CCHHIOROOICROROOCOHHCRRICCOCRO(
                                 "Warning: Failed to set executable permission for " + var2x + ". It might already be set or permissions are insufficient."
                              );
                           }
                        } catch (SecurityException var4x) {
                           this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                              "Warning: Could not set executable permission for " + var2x + " due to security manager: " + var4x.getMessage(), var4x
                           );
                        }
                     }
                  }
               }
            );
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, Exception var2) {
      if (this.IIICHHRIIRHRRRRIHHOROROOORROCH != null) {
         this.IIICHHRIIRHRRRRIHHOROROOORROCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
      } else {
         System.err.println("Error: " + var1);
         if (var2 != null) {
            com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "FFmpegDownloader");
         }
      }
   }

   private void CCHHIOROOICROROOCOHHCRRICCOCRO(String var1) {
      if (this.IIICHHRIIRHRRRRIHHOROROOORROCH != null) {
         this.IIICHHRIIRHRRRRIHHOROROOORROCH.onMessage(var1);
      } else {
         System.out.println("Info: " + var1);
      }
   }
}
