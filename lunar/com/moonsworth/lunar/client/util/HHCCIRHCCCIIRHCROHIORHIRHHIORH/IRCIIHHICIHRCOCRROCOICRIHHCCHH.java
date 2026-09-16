package com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final String CCCIHCCRRIOROOOCHCHORRROOHCOCI = "    ";
   private final Path HHCORIOHRHROHOCHCIOHHRHIOHHRHH;
   private final List<CRRRICCRROCOHHOHIICIHORCOORRRH> HHOORORCHHORCICORICIHCCCORRIOI = new ArrayList<>();

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Path var1) {
      this.HHCORIOHRHROHOCHCIOHHRHIOHHRHH = var1;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.HHOORORCHHORCICORICIHCCCORRIOI.add(var1);
      return this;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH... var1) {
      this.HHOORORCHHORCICORICIHCCCORRIOI.addAll(List.of(var1));
      return this;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.HHOORORCHHORCICORICIHCCCORRIOI.add(var1.OHCICORRICRIHIOHRRIIORIOOHCHRH());
      return this;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH... var1) {
      for (CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : var1) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
      }

      return this;
   }

   public void OHCOCICIRIHRCOORIOIHRCRHRIRRHI() {
      for (CRRRICCRROCOHHOHIICIHORCOORRRH var2 : this.HHOORORCHHORCICORICIHCCCORRIOI) {
         try {
            this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var2.getPackageName(), var2.getClassName(), var2.RRRHRIRCHOIHCORHIIOCICCCRHCHHO(0));
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }
      }
   }

   private void IIRHCHHOICHRICOOCRORCCIOOIHOIR(String var1, String var2, String var3) {
      Path var4 = this.HHCORIOHRHROHOCHCIOHHRHIOHHRHH;

      for (String var8 : var1.split("\\.")) {
         var4 = var4.resolve(var8);
      }

      var4 = var4.resolve(var2 + ".java");
      File var10 = new File(var4.toUri());
      var10.getParentFile().mkdirs();
      FileWriter var11 = new FileWriter(var10, false);
      var11.write(var3);
      var11.close();
   }

   public static String CRHRHOOHRRICOHRHHOCRCCHHRIIIHR(int var0) {
      return "    ".repeat(var0);
   }

   public static String IHIRRIIORRHORHRORIHOROIRCORCOO(String var0, int var1) {
      return "    ".repeat(var1) + var0;
   }
}
