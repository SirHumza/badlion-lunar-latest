package com.moonsworth.lunar.ichor;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements Comparable<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> {
   private String id;

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var1) {
      this.id = var1;
   }

   public abstract List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> HHCCIRHCCCIIRHCROHIORHIRHHIORH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1);

   public Map<String, String> IRCIIHHICIHRCOCRROCOICRIHHCCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      return new HashMap<>();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2, BiConsumer<String, Supplier<byte[]>> var3) {
      Path var4 = var1.OHIROHHCCHRIIORCHRCOIICOHOOCOO(var2).orElseThrow();

      try (ZipFile var5 = new ZipFile(var4.toFile())) {
         Enumeration var6 = var5.entries();

         while (var6.hasMoreElements()) {
            ZipEntry var7 = (ZipEntry)var6.nextElement();
            String var8 = var7.getName();
            var3.accept(var8, () -> {
               try {
                  return var5.getInputStream(var7).readAllBytes();
               } catch (IOException var4x) {
                  throw new RuntimeException("couldn't read file " + var8, var4x);
               }
            });
         }
      } catch (Exception var11) {
         throw new IllegalStateException("Failed to open entries of " + var4, var11);
      }
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@NotNull HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH().compareTo(var1.HRCHROOHRIHCRCRHRIIROCIRHOIRHH());
   }

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
      return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NORMAL;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      PRE_INIT,
      INIT,
      NORMAL,
      LATE,
      LAST;
   }
}
