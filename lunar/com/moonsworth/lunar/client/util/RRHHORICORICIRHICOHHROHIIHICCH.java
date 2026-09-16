package com.moonsworth.lunar.client.util;

import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import lombok.Generated;

public final class RRHHORICORICIRHICOHHROHIIHICCH {
   private static final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC ICRCRRCCOIORCCCHHOOCCCRCRRCHRI = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "lunar", "icons/back-folder-64x64.png"
   );
   private static final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC OICCCIHHHORRHOHOCCCRIICHOHIRCI = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "lunar", "icons/folder-64x64.png"
   );
   private static final FilenameFilter ORRRRRIROCRHIIIRICIOIIIOOCOCIH = (var0, var1) -> {
      File var2 = new File(var0, var1);
      return var2.isDirectory() && !new File(var2, "pack.mcmeta").isFile();
   };
   private static final FileFilter IIRRHRRRORHHCCHHHIICRRHHIIHCII = var0 -> {
      boolean var1 = var0.isFile() && var0.getName().endsWith(".zip");
      boolean var2 = var0.isDirectory() && new File(var0, "pack.mcmeta").isFile();
      return var1 || var2;
   };

   public static boolean ICRIOCOOICRIIIRIHIRIOIHCOHHIIC(String var0) {
      if (var0 != null && (var0.startsWith("assets/lunar/") || var0.startsWith("assets/lunar-jit/"))) {
         for (String var2 : IIRHCHHOICHRICOOCRORCCIOOIHOIR.CCOOHOOHHCOCHIHHCOIRCCHIRRIOCH()) {
            if (var0.startsWith(var2)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static File HRCHROOHRIHCRCRHRIIROCIRHOIRHH(File var0, String var1) {
      for (File var5 : Objects.requireNonNullElse(var0.listFiles(IIRRHRRRORHHCCHHHIICRRHHIIHCII), new File[0])) {
         if (var5.getName().equals(var1) || var1.equals("file/" + var5.getName())) {
            return var5;
         }
      }

      for (File var10 : Objects.requireNonNullElse(var0.listFiles(ORRRRRIROCRHIIIRICIOIIIOOCOCIH), new File[0])) {
         File var6 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var10, var1);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   public static List<File> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<File> var0, File var1) {
      if (var1 != null && var1.isDirectory()) {
         for (File var5 : Objects.requireNonNullElse(var1.listFiles(ORRRRRIROCRHIIIRICIOIIIOOCOCIH), new File[0])) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var5);
            var0.add(var5);
         }

         return var0;
      } else {
         return ImmutableList.of();
      }
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var0, Path var1) {
      try {
         Path var2 = var1.resolve("assets").resolve(var0);
         if (!Files.exists(var2)) {
            Files.createDirectories(var2);
         }
      } catch (Throwable var3) {
         throw var3;
      }
   }

   @Generated
   private RRHHORICORICIRHICOHHROHIIHICCH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   @Generated
   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC RHIHHRRRICCCCOHICIHROIRIIIIRHH() {
      return ICRCRRCCOIORCCCHHOOCCCRCRRCHRI;
   }

   @Generated
   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC HIHCCHHCOOROHCRCORRIOHOIRHHICR() {
      return OICCCIHHHORRHOHOCCCRIICHOHIRCI;
   }

   @Generated
   public static FilenameFilter IOHRORHRHCIOCOOCHHROOIHOCICRHI() {
      return ORRRRRIROCRHIIIRICIOIIIOOCOCIH;
   }

   @Generated
   public static FileFilter HORIIOOHCOHOIOOOIOCOIROOHIIOOC() {
      return IIRRHRRRORHHCCHHHIICRRHHIIHCII;
   }
}
