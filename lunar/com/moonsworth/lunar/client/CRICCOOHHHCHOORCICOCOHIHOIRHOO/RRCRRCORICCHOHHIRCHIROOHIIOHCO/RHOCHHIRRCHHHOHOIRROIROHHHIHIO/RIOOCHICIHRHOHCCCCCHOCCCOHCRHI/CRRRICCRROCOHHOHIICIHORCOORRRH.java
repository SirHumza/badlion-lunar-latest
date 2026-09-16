package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.imageio.ImageIO;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, boolean var1) {
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = null;
      if (var1) {
         var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OHOHOOHHHICIHIORCHIIOHRRRCHRHI()
            .HOCIRCIHOOOOHCROHRCIROCIHCHRRH();
      }

      if (var2 != null) {
         var2.RCCCROCHCICCROHCOCCRRROCIIHCCH(var2x -> {
            File var3x = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2x);
            RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3x);
         });
      } else {
         File var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, null);
         RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3);
      }
   }

   private static void RRCRRCORICCHOHHIRCHIROOHIIOHCO(File var0) {
      if (var0 == null) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, "Unable to export shader cloak!");
      }
   }

   private static File RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, boolean var1, BufferedImage var2) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
      if (var3 == null) {
         return null;
      }

      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HCCICHCRRIICICCHCIRCRRIIRROHHC()
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var3.bridge$getUniqueID(),
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK
         );
      if (var4 == null) {
         return null;
      }

      RCIROOOOICRHCCRRCIORHHIRCOIIIC var5 = var0.getLocation();
      String var6 = var4.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().getName().toLowerCase().replace(" ", "_");
      ArrayList var7 = new ArrayList();
      Path var8 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.HRCOCOHCHRIOIHIIROORORHORCCICR;
      Path var9 = var8.resolve("cloaks");
      boolean var10 = false;

      for (OOROOCCIRCCRHOIOIORIHCHHOOCCOR var12 : var0.IHIIOCICOCIROHOICIHIIIOIICIIOR()) {
         if (!com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(
            var12.CCOIRHCRHHHORRRIICCHRCORIHRCOO()
         )) {
            if (!var10) {
               var9 = var9.resolve(var6);
               var10 = true;
            }

            Path var13 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var12.CCOIRHCRHHHORRRIICCHRCORIHRCOO().bridge$getPath());
            Path var14 = var1 ? var9.resolve(var13.getFileName()) : var13;
            var7.add(
               com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
                  var13, var14
               )
            );
         }
      }

      Path var27 = var8.resolve("shaders").resolve(var6);
      if (var0.RHOCCICCCRCHORRIIICCIICORRHRRR()) {
         Path var28 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var0.IHIOHRIHOROROHRHCCRRICHOOCRCOI());
         Path var32 = var1 ? var27.resolve(var6 + ".vsh") : var28;
         var7.add(
            com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
               var28, var32
            )
         );
      }

      if (var0.CIOHOHIRHCOHIOIOIORICOOHRCRHOI()) {
         Path var29 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var0.HIICOICOOOHRCCHHHCRHOHHIOOCCOO());
         Path var33 = var1 ? var27.resolve(var6 + ".fsh") : var29;
         var7.add(
            com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
               var29, var33
            )
         );
      }

      if (!var1) {
         Path var30 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var5.bridge$getPath());
         var7.add(
            com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
               var30, var30
            )
         );
      }

      int var31 = 0;

      do {
         String var35 = (var31 == 0 ? "" : "_" + var31) + ".zip";
         String var15 = var1 ? "export_" : "dev_";
         Path var34 = var8.resolve(var15 + var6 + var35);
         if (!Files.exists(var34)) {
            File var36 = var34.toFile();

            try (ZipOutputStream var37 = new ZipOutputStream(new FileOutputStream(var36))) {
               for (com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var17 : var7) {
                  Path var18 = (Path)var17.OHICIOOICHICOIOCOROIIOCCHRRCIC;
                  if (!Files.exists(var18) || !Files.isRegularFile(var18)) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                        "Shader Cloaks", "Unable to export shader cloak! File %s is invalid!", var18
                     );
                     return null;
                  }

                  String var19;
                  if (var17.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC instanceof Path var21) {
                     var19 = var8.relativize(var21).toString().replace("\\", "/");
                  } else {
                     if (!(var17.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC instanceof String var20)) {
                        return null;
                     }

                     var19 = var20;
                  }

                  var37.putNextEntry(new ZipEntry(var19));
                  String var48 = var18.getFileName().toString();
                  if (var1 && (var48.endsWith(".vsh") || var48.endsWith(".fsh"))) {
                     String var51 = Files.readString(var18);
                     int var23 = var51.indexOf("LUNAR-SHADER-DEFINITION-MARKER");
                     if (var23 >= 0) {
                        var51 = var51.substring(var23);
                     }

                     var37.write(var51.getBytes(StandardCharsets.UTF_8));
                  } else {
                     Files.copy(var18, var37);
                  }

                  var37.closeEntry();
               }

               ZipEntry var38 = new ZipEntry("shader_textures_EXPORT.json");
               var37.putNextEntry(var38);
               JsonObject var41 = new JsonObject();
               String var42 = var1 ? "cosmetics/cloaks/" + var6 + "/" + var6 + ".webp" : var5.toString();
               var41.add(var42, var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var6));
               String var44 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRCCROROOHROIRIHCICROOIHHOOICI.toJson(var41);
               var37.write(var44.getBytes(StandardCharsets.UTF_8));
               var37.closeEntry();
               if (!var1) {
                  JsonArray var46 = new JsonArray();
                  JsonObject var49 = new JsonObject();
                  var49.addProperty("name", var4.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().getName());
                  var49.addProperty("file", var4.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().IIIHOCORRHCCRORIOOHRHIIICROHHH().toString());
                  var49.addProperty("category", "cloak");
                  var46.add(var49);
                  var38 = new ZipEntry("dev_cosmetics_EXPORT.json");
                  var37.putNextEntry(var38);
                  var44 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRCCROROOHROIRIHCICROOIHHOOICI.toJson(var46);
                  var37.write(var44.getBytes(StandardCharsets.UTF_8));
                  var37.closeEntry();
               }

               if (var1) {
                  if (var2 == null) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                        "Shader Cloaks", "Unable to take a screenshot of the cloak!"
                     );
                     return null;
                  }

                  var38 = new ZipEntry("cloaks/" + var6 + "/" + var6 + ".png");
                  var37.putNextEntry(var38);
                  ImageIO.write(var2, "PNG", var37);
                  var37.closeEntry();
               }
            } catch (IOException var26) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Shader Cloaks", "Unable to export shader cloak! %s", var26.getMessage()
               );
               var26.printStackTrace();
               return null;
            }

            CRICCOOHHHCHOORCICOCOHIHOIRHOO(var34);
            return var36;
         }
      } while (++var31 < 1000);

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
         "Shader Cloaks", "Reached max export file limit! Please delete some exports!"
      );
      return null;
   }

   public static void CRICCOOHHHCHOORCICOCOHIHOIRHOO(Path var0) {
      try {
         if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isWindows()) {
            new ProcessBuilder("explorer.exe", "/select,", var0.toString()).start();
         } else if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isMacos()) {
            new ProcessBuilder("open", "-R", var0.toString()).start();
         } else if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isLinux()) {
            new ProcessBuilder("xdg-open", var0.getParent().toString()).start();
         }
      } catch (Exception var2) {
      }
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var0, boolean var1) {
      String var2 = var0.bridge$getPath();
      var2 = var2.replaceFirst("dev_cosmetics", "cosmetics");
      return var1 ? "lunar-jit:" + var2 : var2;
   }

   public static Path RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var0, String var1) {
      Path var2 = var0;
      if (var1.contains(":")) {
         var1 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var1).bridge$getPath();
      }

      var1 = var1.replaceFirst("dev_cosmetics/", "");

      for (String var6 : var1.split("/")) {
         var2 = var2.resolve(var6);
      }

      return var2;
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var0, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2) {
      if (var0
         && !com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(
            var1.CCOIRHCRHHHORRRIICCHRCORIHRCOO()
         )) {
         String[] var3 = var1.CCOIRHCRHHHORRRIICCHRCORIHRCOO().bridge$getPath().split("/");
         String var4 = var3[var3.length - 1];
         int var5 = var4.lastIndexOf(".");
         if (var5 >= 0) {
            var4 = var4.substring(0, var5) + ".webp";
         }

         return "lunar-jit:cosmetics/cloaks/" + var2 + "/" + var4;
      } else {
         return var1.CCOIRHCRHHHORRRIICCHRCORIHRCOO().toString();
      }
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var0, boolean var1, boolean var2, String var3, String var4) {
      return var1 && var0 ? "lunar-jit:cosmetics/cloaks/" + var4 + "/" + var4 + (var2 ? ".vsh" : ".fsh") : var3;
   }
}
