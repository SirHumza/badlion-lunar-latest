package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.luciad.imageio.webp.WebP;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.OOCHRIIIRIHRRCRIORHCROIIHCRRIC;
import com.moonsworth.webosr.handler.FileSystem;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.apache.commons.io.FilenameUtils;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements FileSystem {
   private static final Set<String> HRCIOORIIRCRIROHRCCOIHHHHIOHII = Set.of("lunar", "minecraft");
   private final boolean CHIIOICCRHORRCHOOHCIICRRCIHRIH;
   private final Set<File> RHOHCOHOIICIRRCICIRCRRHIRRORCO = new HashSet<>();

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(boolean var1) {
      this.CHIIOICCRHORRCHOOHCIICRRCIHRIH = var1;
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HORHRIOCOOOORHCRIHHORCRIRCOOCI().ifPresent(this.RHOHCOHOIICIRRCICIRCRRHIRRORCO::add);
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIIHRIHORROOHHHIHROHCOIROIIIOO().ifPresent(this.RHOHCOHOIICIRRCICIRCRRHIRRORCO::add);
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHICIOCICHCOIOCHCIOOHHRHRHIRC()
         .ifPresent(var1x -> this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(new File(var1x, "/assets/lunar")));
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCHCHCCROOCOHHOIOHRRHCROICOOHI()
         .ifPresent(var1x -> this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(new File(var1x, "/assets/lunar-jit")));
      this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRHIIROORHCIHCHRIHHROOHRRIOHIH.toFile());
      this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(IIRHCHHOICHRICOOCRORCCIOOIHOIR.RHOIRIICHCIRHHOORORIIRCRCRRIHH.toFile());
      this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RHROIROROOHRHROIOCRROOIHCCOIRI);
      this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(CRICCOOHHHCHOORCICOCOHIHOIRHOO.HOCCOIIIHRROIHOHIOHRCIOHOOCORI);
      this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(IIRHCHHOICHRICOOCRORCCIOOIHOIR.HRICRRROHOHIOHHHORHORCOOCHIRIO.toFile());
      this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(IIRHCHHOICHRICOOCRORCCIOOIHOIR.CORRIIHRCIROOICRIOCCHCHIIHOHRC.toFile());
      this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(new File(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), "resourcepacks"));
      this.RHOHCOHOIICIRRCICIRCRRHIRRORCO.add(new File(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), "assets"));
   }

   @Override
   public FileSystem.Payload onRequest(String var1) {
      try {
         if (var1.endsWith(".imgsrc")) {
            return this.IOCIRIRHOHROHOCOROIRHCHIRHIHRO(var1);
         }

         File var2 = this.ICHIIOOHCICHRIIORICRROOICOIRRO(var1);
         if (var2 != null && var2.isFile() && !var1.toLowerCase().endsWith(var2.getName().toLowerCase())) {
            int var3 = var1.toLowerCase().replace("\\", "/").indexOf(var2.getName().toLowerCase()) + var2.getName().length() + 1;
            String var4 = var1.substring(var3);

            try (ZipFile var5 = new ZipFile(var2)) {
               ZipEntry var6 = var5.getEntry(var4);
               if (var6 != null) {
                  return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var5.getInputStream(var6));
               }
            }
         }

         if (var2 != null && var2.exists()) {
            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, new FileInputStream(var2));
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var11 = this.CRHOORCOCOIOHCRCOCHIRCHORCHHRR(
            var1
         );
         if (var11 != null) {
            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var11.bridge$getInputStream());
         }
      } catch (IOException var10) {
         var10.printStackTrace();
         throw new RuntimeException(var10);
      }

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         "WebOSR-REQ", "Attempted to load URL that does not exist: " + var1
      );
      return new FileSystem.Payload(null, 0, "application/octet-stream", 404);
   }

   private FileSystem.Payload IOCIRIRHOHROHOCOROIRHCHIRHIHRO(String var1) {
      String var2 = var1.replace("file:///", "").replace(".imgsrc", "");
      String var3 = "IMGSRC-V1\n" + var2;
      ByteBuffer var4 = ByteBuffer.allocateDirect(var3.length()).order(ByteOrder.nativeOrder()).put(var3.getBytes());
      return new FileSystem.Payload(var4, var3.length(), "text/plain", 200);
   }

   public FileSystem.Payload RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, InputStream var2) {
      try (BufferedInputStream var3 = new BufferedInputStream(var2)) {
         String var4 = URLConnection.guessContentTypeFromStream(var3);
         if (var4 == null) {
            var4 = this.IOHOCRRIOIRRORHOCHIROCRRHRIOHH(var1);
         }

         byte[] var5 = var3.readAllBytes();
         if (this.CHIIOICCRHORRCHOOHCIICRRCIHRIH && Objects.equals(var4, "image/webp")) {
            var4 = "image/png";
            ImageReader var25 = WebP.IMAGE_READER.createReaderInstance("webp");
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();

            BufferedImage var24;
            try (ImageInputStream var9 = ImageIO.createImageInputStream(new ByteArrayInputStream(var5))) {
               var25.setInput(var9, true, true);
               var24 = var25.read(0);
            } finally {
               var25.dispose();
            }

            if (var24 == null) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "WebOSR-REQ", "Could not load image from " + var1
               );
               return new FileSystem.Payload(null, 0, "application/octet-stream", 500);
            } else {
               ImageIO.write(var24, "PNG", var8);
               ByteBuffer var26 = ByteBuffer.allocateDirect(var8.size()).order(ByteOrder.nativeOrder()).put(var8.toByteArray());
               return new FileSystem.Payload(var26, var8.size(), var4, 200);
            }
         } else {
            ByteBuffer var6 = ByteBuffer.allocateDirect(var5.length).order(ByteOrder.nativeOrder()).put(var5);
            return new FileSystem.Payload(var6, var5.length, var4, 200);
         }
      }
   }

   private String IOHOCRRIOIRRORHOCHIROCRRHRIOHH(String var1) {
      return OOCHRIIIRIHRRCRIORHCROIIHCRRIC.HIIHRIHORROOHHHIHROHCOIROIIIOO(var1);
   }

   @Override
   public boolean doesResourceExist(String var1) {
      try {
         return var1.endsWith(".imgsrc") ? true : this.ICHIIOOHCICHRIIORICRROOICOIRRO(var1) != null || this.CRHOORCOCOIOHCRCOCHIRCHORCHHRR(var1) != null;
      } catch (IOException var3) {
         var3.printStackTrace();
         throw new RuntimeException(var3);
      }
   }

   private File ICHIIOOHCICHRIIORICRROOICOIRRO(String var1) {
      var1 = this.HHRHHIOOOCOHHHHHRROHCHCROCRROC(new URL(var1).getPath());
      File var2 = new File(var1);
      if (var2.isAbsolute() && var2.exists()) {
         return var2;
      }

      for (File var4 : this.RHOHCOHOIICIRRCICIRCRRHIRRORCO) {
         try {
            String var5 = var1.startsWith("/") ? var1.substring(1) : var1;
            File var6 = Files.exists(Path.of(var5)) ? new File(var5) : new File(var4, var1);
            if (var6.exists()) {
               String var7 = FilenameUtils.normalize(var6.getAbsolutePath());
               if (var7.startsWith(var4.getAbsolutePath())) {
                  return var6;
               }
            }

            if (var6.getParentFile().isFile()) {
               int var11 = var5.toLowerCase().indexOf(var6.getParentFile().getName().toLowerCase()) + var6.getParentFile().getName().length();
               File var8 = new File(var4, var5.substring(0, var11));
               if (var8.exists() && var8.isFile()) {
                  return var8;
               }
            }
         } catch (Exception var9) {
            var9.printStackTrace();
         }
      }

      return null;
   }

   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO CRHOORCOCOIOHCRCOCHIRCHORCHHRR(
      String var1
   ) {
      String var2 = var1.replace("file:///", "");

      for (String var4 : HRCIOORIIRCRIROHRCCOIHHHHIOHII) {
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var5 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var4, var2);
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getResourceManager()
            .bridge$getResource(var5);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   private String HHRHHIOOOCOHHHHHRROHCHCROCRROC(String var1) {
      String var2 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getUrl()
            .replaceFirst("file:///", "")
         + "/";
      return var1.equals(var2) ? var1 : var1.replaceFirst(var2, "");
   }
}
