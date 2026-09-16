package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import javax.annotation.Nullable;
import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Nullable
   private final Set<String> ORORCHRHIIHHCCORCRRIRCCOHIHHOO;
   @Nullable
   private final Set<String> IOCCICOCCIHCOCRHHOCICHCRHHIRIC;
   @Nullable
   private final Set<String> RHRRCOIORCRHHIRIORICRCOHIRHCHH;
   @Nullable
   private final String HOHHIROHICCICIHIOHHHCHOCCCRIHI;

   public String HROCROICOIHCCHOHCORORCIORCCOCC(String var1) {
      if (this.HOHHIROHICCICIHIOHHHCHOCCCRIHI != null && !this.HOHHIROHICCICIHIOHHHCHOCCCRIHI.isEmpty()) {
         return this.HOHHIROHICCICIHIOHHHCHOCCCRIHI.contains("%s")
            ? String.format(this.HOHHIROHICCICIHIOHHHCHOCCCRIHI, var1)
            : this.HOHHIROHICCICIHIOHHHCHOCCCRIHI;
      } else {
         return "features." + var1;
      }
   }

   public ImmutableSet<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH> RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
      Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1
   ) {
      if (this.IOCCICOCCIHCOCRHHOCICHCRHHIRIC != null && !this.IOCCICOCCIHCOCRHHOCICHCRHHIRIC.isEmpty()) {
         for (String var3 : this.IOCCICOCCIHCOCRHHOCICHCRHHIRIC) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var3, false
            );
            if (var1.contains(var4)) {
               var1.remove(var4);
            } else {
               var1.add(var4);
            }
         }
      }

      return ImmutableSet.copyOf(var1);
   }

   public ImmutableSet<String> IRRCCOICORICIHCHRHIHIHROIRHOCR(@Nullable Set<String> var1) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.ORORCHRHIIHHCCORCRRIRCCOHIHHOO);
   }

   public ImmutableSet<String> RICRIRRCOHRCOCRRHHCRHRROOIOHHR(@Nullable Set<String> var1) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.RHRRCOIORCRHHIRIORICRCOHIRHCHH);
   }

   private static <T> ImmutableSet<T> IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable Set<T> var0, @Nullable Set<T> var1) {
      if (var1 != null && !var1.isEmpty()) {
         Set var2 = var0 == null ? Set.of() : var0;
         if (var2.isEmpty()) {
            return ImmutableSet.copyOf(var1);
         }

         for (Object var4 : var1) {
            if (var2.contains(var4)) {
               var2.remove(var4);
            } else {
               var2.add(var4);
            }
         }

         return ImmutableSet.copyOf(var2);
      } else {
         return var0 == null ? ImmutableSet.of() : ImmutableSet.copyOf(var0);
      }
   }

   @Nullable
   @Generated
   public Set<String> HRROOHIHRHIOIOIRHHRIROOOHRORRH() {
      return this.ORORCHRHIIHHCCORCRRIRCCOHIHHOO;
   }

   @Nullable
   @Generated
   public Set<String> CCCCRRHICIRRIIRCIRROOROHRCRIRI() {
      return this.IOCCICOCCIHCOCRHHOCICHCRHHIRIC;
   }

   @Nullable
   @Generated
   public Set<String> OROIRHIOOCCCHRCICICCHRRHIIRRCR() {
      return this.RHRRCOIORCRHHIRIORICRCOHIRHCHH;
   }

   @Nullable
   @Generated
   public String getLanguagePath() {
      return this.HOHHIROHICCICIHIOHHHCHOCCCRIHI;
   }

   @Generated
   public CRRRICCRROCOHHOHIICIHORCOORRRH(@Nullable Set<String> var1, @Nullable Set<String> var2, @Nullable Set<String> var3, @Nullable String var4) {
      this.ORORCHRHIIHHCCORCRRIRCCOHIHHOO = var1;
      this.IOCCICOCCIHCOCRHHOCICHCRHHIRIC = var2;
      this.RHRRCOIORCRHHIRIORICRCOHIRHCHH = var3;
      this.HOHHIROHICCICIHIOHHHCHOCCCRIHI = var4;
   }
}
