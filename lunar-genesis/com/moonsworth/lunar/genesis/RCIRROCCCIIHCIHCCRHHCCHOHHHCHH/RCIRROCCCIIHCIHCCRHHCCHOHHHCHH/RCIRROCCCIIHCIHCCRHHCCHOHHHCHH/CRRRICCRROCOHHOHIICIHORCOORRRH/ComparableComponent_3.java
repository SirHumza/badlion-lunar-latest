package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class HICRCHHRCHOIRCOHROCIHHORHIOOCH<T> {
   private final int CRHHRCRRRICICRICICIRHOROHHRHCC;
   private final Comparator<? super T> HRCIOIRIIHIRCOCHCHOOOIIIRRIRHR;
   private final T[] IICCCROOIORIOCOHHRROOOICOCHCRI;
   private int bufferSize;
   private @Nullable T threshold;

   public static <T extends Comparable<? super T>> HICRCHHRCHOIRCOHROCIHHORHIOOCH<T> ICOIRCCIRRCHHOHHOOOICOCCIRROCC(int var0) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC());
   }

   public static <T> HICRCHHRCHOIRCOHROCIHHORHIOOCH<T> IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var0, Comparator<? super T> var1) {
      return new HICRCHHRCHOIRCOHROCIHHORHIOOCH<>(var1, var0);
   }

   public static <T extends Comparable<? super T>> HICRCHHRCHOIRCOHROCIHHORHIOOCH<T> CRCHIROOIROHOICHCICHIIHORIOOCC(int var0) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC());
   }

   public static <T> HICRCHHRCHOIRCOHROCIHHORHIOOCH<T> HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var0, Comparator<? super T> var1) {
      return new HICRCHHRCHOIRCOHROCIHHORHIOOCH<>(IOIHHIORCICCHIIHOIOIOHHRICRHIO.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var1).HCHORRRCIORCRHCRIIHROIRRRHCCOR(), var0);
   }

   private HICRCHHRCHOIRCOHROCIHHORHIOOCH(Comparator<? super T> var1, int var2) {
      this.HRCIOIRIIHIRCOCHCHOOOIIIRRIRHR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "comparator"
      );
      this.CRHHRCRRRICICRICICIRHOROHHRHCC = var2;
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2 >= 0, "k (%s) must be >= 0", var2
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", var2
      );
      this.IICCCROOIORIOCOHHRROOOICOCHCRI = (T[])(new Object[com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.checkedMultiply(
         var2, 2
      )]);
      this.bufferSize = 0;
      this.threshold = null;
   }

   public void offer(@Nullable T var1) {
      if (this.CRHHRCRRRICICRICICIRHOROHHRHCC != 0) {
         if (this.bufferSize == 0) {
            this.IICCCROOIORIOCOHHRROOOICOCHCRI[0] = (T)var1;
            this.threshold = (T)var1;
            this.bufferSize = 1;
         } else if (this.bufferSize < this.CRHHRCRRRICICRICICIRHOROHHRHCC) {
            this.IICCCROOIORIOCOHHRROOOICOCHCRI[this.bufferSize++] = (T)var1;
            if (this.HRCIOIRIIHIRCOCHCHOOOIIIRRIRHR.compare((T)var1, this.threshold) > 0) {
               this.threshold = (T)var1;
            }
         } else if (this.HRCIOIRIIHIRCOCHCHOOOIIIRRIRHR.compare((T)var1, this.threshold) < 0) {
            this.IICCCROOIORIOCOHHRROOOICOCHCRI[this.bufferSize++] = (T)var1;
            if (this.bufferSize == 2 * this.CRHHRCRRRICICRICICIRHOROHHRHCC) {
               this.trim();
            }
         }
      }
   }

   private void trim() {
      int var1 = 0;
      int var2 = 2 * this.CRHHRCRRRICICRICICIRHOROHHRHCC - 1;
      int var3 = 0;
      int var4 = 0;
      int var5 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.log2(
            var2 - var1, RoundingMode.CEILING
         )
         * 3;

      while (var1 < var2) {
         int var6 = var1 + var2 + 1 >>> 1;
         int var7 = this.partition(var1, var2, var6);
         if (var7 > this.CRHHRCRRRICICRICICIRHOROHHRHCC) {
            var2 = var7 - 1;
         } else {
            if (var7 >= this.CRHHRCRRRICICRICICIRHOROHHRHCC) {
               break;
            }

            var1 = Math.max(var7, var1 + 1);
            var3 = var7;
         }

         if (++var4 >= var5) {
            Arrays.sort(this.IICCCROOIORIOCOHHRROOOICOCHCRI, var1, var2, this.HRCIOIRIIHIRCOCHCHOOOIIIRRIRHR);
            break;
         }
      }

      this.bufferSize = this.CRHHRCRRRICICRICICIRHOROHHRHCC;
      this.threshold = this.IICCCROOIORIOCOHHRROOOICOCHCRI[var3];

      for (int var8 = var3 + 1; var8 < this.CRHHRCRRRICICRICICIRHOROHHRHCC; var8++) {
         if (this.HRCIOIRIIHIRCOCHCHOOOIIIRRIRHR.compare(this.IICCCROOIORIOCOHHRROOOICOCHCRI[var8], this.threshold) > 0) {
            this.threshold = this.IICCCROOIORIOCOHHRROOOICOCHCRI[var8];
         }
      }
   }

   private int partition(int var1, int var2, int var3) {
      Object var4 = this.IICCCROOIORIOCOHHRROOOICOCHCRI[var3];
      this.IICCCROOIORIOCOHHRROOOICOCHCRI[var3] = this.IICCCROOIORIOCOHHRROOOICOCHCRI[var2];
      int var5 = var1;

      for (int var6 = var1; var6 < var2; var6++) {
         if (this.HRCIOIRIIHIRCOCHCHOOOIIIRRIRHR.compare(this.IICCCROOIORIOCOHHRROOOICOCHCRI[var6], (T)var4) < 0) {
            this.swap(var5, var6);
            var5++;
         }
      }

      this.IICCCROOIORIOCOHHRROOOICOCHCRI[var2] = this.IICCCROOIORIOCOHHRROOOICOCHCRI[var5];
      this.IICCCROOIORIOCOHHRROOOICOCHCRI[var5] = (T)var4;
      return var5;
   }

   private void swap(int var1, int var2) {
      Object var3 = this.IICCCROOIORIOCOHHRROOOICOCHCRI[var1];
      this.IICCCROOIORIOCOHHRROOOICOCHCRI[var1] = this.IICCCROOIORIOCOHHRROOOICOCHCRI[var2];
      this.IICCCROOIORIOCOHHRROOOICOCHCRI[var2] = (T)var3;
   }

   HICRCHHRCHOIRCOHROCIHHORHIOOCH<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICRCHHRCHOIRCOHROCIHHORHIOOCH<T> var1) {
      for (int var2 = 0; var2 < var1.bufferSize; var2++) {
         this.offer(var1.IICCCROOIORIOCOHHRROOOICOCHCRI[var2]);
      }

      return this;
   }

   public void offerAll(Iterable<? extends T> var1) {
      this.offerAll(var1.iterator());
   }

   public void offerAll(Iterator<? extends T> var1) {
      while (var1.hasNext()) {
         this.offer((T)var1.next());
      }
   }

   public List<T> topK() {
      Arrays.sort(this.IICCCROOIORIOCOHHRROOOICOCHCRI, 0, this.bufferSize, this.HRCIOIRIIHIRCOCHCHOOOIIIRRIRHR);
      if (this.bufferSize > this.CRHHRCRRRICICRICICIRHOROHHRHCC) {
         Arrays.fill(this.IICCCROOIORIOCOHHRROOOICOCHCRI, this.CRHHRCRRRICICRICICIRHOROHHRHCC, this.IICCCROOIORIOCOHHRROOOICOCHCRI.length, null);
         this.bufferSize = this.CRHHRCRRRICICRICICIRHOROHHRHCC;
         this.threshold = this.IICCCROOIORIOCOHHRROOOICOCHCRI[this.CRHHRCRRRICICRICICIRHOROHHRHCC - 1];
      }

      return Collections.unmodifiableList(Arrays.asList((T[])Arrays.copyOf(this.IICCCROOIORIOCOHHRROOOICOCHCRI, this.bufferSize)));
   }
}
