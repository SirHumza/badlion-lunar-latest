package com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   FABRIC_MAVEN("https://maven.fabricmc.net/"),
   MOJANG_LIBRARIES("https://libraries.minecraft.net/"),
   MAVEN_CENTRAL("https://repo1.maven.org/maven2/"),
   LUNAR_FABRIC_MAVEN("https://maven-cache.lunarclientprod.com/maven.fabricmc.net/"),
   LUNAR_MOJANG_LIBRARIES("https://maven-cache.lunarclientprod.com/libraries.minecraft.net/"),
   LUNAR_MAVEN_CENTRAL("https://maven-cache.lunarclientprod.com/repo1.maven.org/maven2/");

   private final String url;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
      this.url = var3;
   }

   public static Path download(String var0, Path var1) {
      String[] var2 = var0.split(":");
      if (var2.length < 3) {
         return null;
      }

      String var3 = var2[0];
      String var4 = var2[1];
      String var5 = var2[2];
      String var6 = null;
      if (var2.length >= 4) {
         var6 = var2[3];
      }

      var3 = var3.replaceAll("\\.", "/");
      String var7 = var4 + "-" + var5 + ".jar";
      if (var6 != null) {
         var7 = var4 + "-" + var5 + "-" + var6 + ".jar";
      }

      Path var8 = Paths.get(var3, var4, var5, var7);
      String var9 = var8.toString().replaceAll("\\\\", "/");
      Path var10 = var1.resolve(var8);
      if (com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOHIHIIHCCCCCIHRORIOIOORCIOHII(
         var10
      )) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var11 = values();
         ArrayList var12 = new ArrayList(var11.length);

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var16 : var11) {
            var12.add(var16.url);
         }

         try {
            CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var12,
               var9,
               var1x -> {
                  try {
                     Files.createDirectories(var10.getParent());
                     Files.write(var10, var1x);
                     return !com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOHIHIIHCCCCCIHRORIOIOORCIOHII(
                        var10
                     );
                  } catch (Exception var3x) {
                     throw new IllegalStateException("Failed to write jar bytes " + var10, var3x);
                  }
               }
            );
         } catch (Exception var17) {
            throw new IllegalStateException("Failed to write jar bytes " + var10, var17);
         }

         if (Files.notExists(var10)) {
            throw new FileNotFoundException("Failed to download " + var10 + "!");
         }
      }

      return var10;
   }

   @Generated
   public String getUrl() {
      return this.url;
   }
}
