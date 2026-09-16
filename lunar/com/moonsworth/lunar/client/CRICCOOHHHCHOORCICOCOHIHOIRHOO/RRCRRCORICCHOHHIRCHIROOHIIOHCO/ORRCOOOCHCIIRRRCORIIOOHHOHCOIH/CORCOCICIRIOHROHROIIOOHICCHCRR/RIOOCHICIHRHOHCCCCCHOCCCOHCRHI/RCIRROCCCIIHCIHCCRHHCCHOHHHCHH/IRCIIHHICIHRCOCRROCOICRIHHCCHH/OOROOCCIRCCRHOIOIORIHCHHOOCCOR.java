package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   private final File CCCIROHORHHCRCCOIRHRRCOIROOCRH = IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHIRHHICRHCCHRHIIIOIRRROCRHRIH
      .resolve("hypixel" + File.separator + "skyblock" + File.separator + "dungeon" + File.separator + "routes.json")
      .toFile();

   public Map<String, List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> OIRCCOCRRHHCCOOCRCRRCIHRIRRHIH() {
      return this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(this.CCCIROHORHHCRCCOIRHRRCOIROOCRH);
   }

   public Map<String, List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> OOIOIOOOOCIOIRORCHCIIRICCCCCHH() {
      return this.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRHCHHIIOIIRROOHOHCCRHOIHOCOCC);
   }

   private Map<String, List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> RICRIRRCOHRCOCRRHHCRHRROOIOHHR(File var1) {
      HashMap var2 = new HashMap();
      String[] var3 = var1.list();
      if (var3 == null) {
         return var2;
      }

      for (String var7 : var3) {
         File var8 = new File(var1, var7);
         String[] var9 = var8.list();
         if (var9 != null) {
            ArrayList var10 = new ArrayList();

            for (String var14 : var9) {
               File var15 = new File(var8, var14);
               String var16 = var14.replaceFirst("\\.lcroute$", "");

               try (FileInputStream var17 = new FileInputStream(var15)) {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var18 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var16);
                  if (var18 != null) {
                     var10.add(var18);
                  }
               } catch (Exception var22) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "An error occurred while trying to load the route file: {}", var16, var22
                  );
               }
            }

            var2.put(var7, var10);
         }
      }

      return var2;
   }

   private Map<String, List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> HICRRICCHCCROOHHCHOCOCCHOIHHOC(File var1) {
      HashMap var2 = new HashMap();

      try (FileSystem var3 = FileSystems.newFileSystem(var1.toPath(), Collections.emptyMap())) {
         for (Path var5 : var3.getRootDirectories()) {
            try (Stream var6 = Files.walk(var5, 1)) {
               for (Path var8 : var6.toList()) {
                  if (!var5.equals(var8)) {
                     String var9 = var8.getFileName().toString();

                     try (Stream var10 = Files.walk(var8, 1)) {
                        for (Path var12 : var10.toList()) {
                           if (!var8.equals(var12) && var12.getFileName().toString().endsWith(".lcroute")) {
                              List var13 = var2.computeIfAbsent(var9, var0 -> new ArrayList());
                              var13.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Files.newInputStream(var12), var12.getFileName().toString().split("\\.")[0]));
                           }
                        }
                     }
                  }
               }
            }
         }

         return var2;
      } catch (IOException var20) {
         throw new RuntimeException(var20);
      }
   }

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InputStream var1, String var2) {
      try (BufferedReader var3 = new BufferedReader(new InputStreamReader(var1))) {
         CORCOCICIRIOHROHROIIOOHICCHCRR var4 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
            .fromJson(var3, CORCOCICIRIOHROHROIIOOHICCHCRR.class);
         return var4.toRoute(var2);
      } catch (Exception var8) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error(
            "An error occurred while trying to load the route file: " + var2, var8
         );
         return null;
      }
   }
}
