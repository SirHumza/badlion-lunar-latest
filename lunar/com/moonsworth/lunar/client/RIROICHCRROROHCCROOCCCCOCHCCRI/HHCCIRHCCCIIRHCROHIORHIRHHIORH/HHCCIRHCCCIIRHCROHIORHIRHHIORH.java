package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Objects;

public record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   private final int IIIIRHRIHIIIRCHHIOHHIROIHHRHCH;
   private final long RCOHOHROICOIRIICIIHCOCRIHORHOI;
   private final Instant OIRRROCCCIOCRRCHOOHIHOIIIRHORH;
   private final List<Integer> RRCCRRCRCRIIIICICRIHRCRCHCRCOI;
   private final com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH CHIOCRRHIICCIOROCIHHCOIRCIHICO;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      int var1,
      long var2,
      Instant var4,
      List<Integer> var5,
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var6
   ) {
      this.IIIIRHRIHIIIRCHHIOHHIROIHHRHCH = var1;
      this.RCOHOHROICOIRIICIIHCOCRIHORHOI = var2;
      this.OIRRROCCCIOCRRCHOOHIHOIIIRHORH = var4;
      this.RRCCRRCRCRIIIICICRIHRCRCHCRCOI = var5;
      this.CHIOCRRHIICCIOROCIHHCOIRCIHICO = var6;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = (HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
         return this.IIIIRHRIHIIIRCHHIOHHIROIHHRHCH == var2.IIIIRHRIHIIIRCHHIOHHIROIHHRHCH;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.IIIIRHRIHIIIRCHHIOHHIROIHHRHCH);
   }

   public Instant IOOIIROIIOOICHOCICCICHHIHICIOO() {
      return this.OIRRROCCCIOCRRCHOOHIHOIIIRHORH;
   }

   public com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH HORHCRHORHCORCOCHOORHHIRORRIRO() {
      return this.CHIOCRRHIICCIOROCIHHCOIRCIHICO;
   }

   public String RIHOCCRCOCHHIRRIICCCHHROIHIHHR() {
      LocalDateTime var1 = LocalDateTime.ofInstant(this.OIRRROCCCIOCRRCHOOHIHOIIIRHORH, ZoneId.systemDefault());
      return var1.format(RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRHCIHHCCRCRCICIHHRORCCHROCORH);
   }

   public List<Integer> COIRCOHORRHROIIIHIOIHHHOOCIHHH() {
      return this.RRCCRRCRCRIIIICICRIHRCRCHCRCOI;
   }

   public long IORCRHOCIHOCOROCROIICIRHRCOIRR() {
      return this.RCOHOHROICOIRIICIIHCOCRIHORHOI;
   }

   public int id() {
      return this.IIIIRHRIHIIIRCHHIOHHIROIHHRHCH;
   }

   public List<Integer> OIHIOCIOIHHHICCRHCRIHIRHRHCHCC() {
      return this.RRCCRRCRCRIIIICICRIHRCRCHCRCOI;
   }
}
