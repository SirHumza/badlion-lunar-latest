package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class RCIROOOOICRHCCRRCIORHHIRCOIIIC {
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO RRIOIOOIHOCCICHHIOIROICIOOCIII;
   private final boolean RCRCOIHOOIRHCHOIOCROHOIHOHRRIO;
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH RRRICHCIRHOICICIRCCIRROHRRRICI;
   private final int IRHIHHROOOCOOCHROCHIRHHHOHOHHH;

   private RCIROOOOICRHCCRRCIORHHIRCOIIIC(RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this(var1, false, RRCRRCORICCHOHHIRCHIROOHIIOHCO.CHCCOROOOIICHHRIIOIIIOCRCICRHO(), Integer.MAX_VALUE);
   }

   private RCIROOOOICRHCCRRCIORHHIRCOIIIC(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, boolean var2, RRCRRCORICCHOHHIRCHIROOHIIOHCO var3, int var4
   ) {
      this.RRRICHCIRHOICICIRCCIRROHRRRICI = var1;
      this.RCRCOIHOOIRHCHOIOCROHOIHOHRRIO = var2;
      this.RRIOIOOIHOCCICHHIOIROICIOOCIII = var3;
      this.IRHIHHROOOCOOCHROCHIRHHHOHOHHH = var4;
   }

   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC IRRCCOICORICIHCHRHIHIHROIRHOCR(char var0) {
      return CRRRICCRROCOHHOHIICIHORCOORRRH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var0));
   }

   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC CRRRICCRROCOHHOHIICIHORCOORRRH(final RRCRRCORICCHOHHIRCHIROOHIIOHCO var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC(
         new RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
            public RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, CharSequence var2
            ) {
               return new RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2) {
                  @Override
                  int separatorStart(int var1) {
                     return var0.indexIn(this.CCHIHORCOCHROIHIORRICHIIROROHI, var1);
                  }

                  @Override
                  int separatorEnd(int var1) {
                     return var1 + 1;
                  }
               };
            }
         }
      );
   }

   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC HHHIOIOICHIIHICIHRRRRCROIOOCCI(final String var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length() != 0, "The separator may not be the empty string.");
      return var0.length() == 1
         ? IRRCCOICORICIHCHRHIHIHROIRHOCR(var0.charAt(0))
         : new RCIROOOOICRHCCRRCIORHHIRCOIIIC(
            new RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
               public RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, CharSequence var2
               ) {
                  return new RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2) {
                     @Override
                     public int separatorStart(int var1) {
                        int var2x = var0.length();
                        int var3 = var1;

                        label24:
                        for (int var4 = this.CCHIHORCOCHROIHIORRICHIIROROHI.length() - var2x; var3 <= var4; var3++) {
                           for (int var5 = 0; var5 < var2x; var5++) {
                              if (this.CCHIHORCOCHROIHIORRICHIIROROHI.charAt(var5 + var3) != var0.charAt(var5)) {
                                 continue label24;
                              }
                           }

                           return var3;
                        }

                        return -1;
                     }

                     @Override
                     public int separatorEnd(int var1) {
                        return var1 + var0.length();
                     }
                  };
               }
            }
         );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC IRCIIHHICIHRCOCRROCOICRIHHCCHH(Pattern var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new RIROICHCRROROHCCROOCCCCOCHCCRI(var0));
   }

   private static RCIROOOOICRHCCRRCIORHHIRCOIIIC RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(!var0.RRCRRCORICCHOHHIRCHIROOHIIOHCO("").matches(), "The pattern may not match the empty string: %s", var0);
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC(
         new RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
            public RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, CharSequence var2
            ) {
               final HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = var0.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2);
               return new RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2) {
                  @Override
                  public int separatorStart(int var1) {
                     return var3.find(var1) ? var3.start() : -1;
                  }

                  @Override
                  public int separatorEnd(int var1) {
                     return var3.end();
                  }
               };
            }
         }
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC IRHICRIRRHCRCCOOORCHHORCRRCIRO(String var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IIHCOICHRCCCCOHHRHHIRIOICHCHHO(var0));
   }

   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC CIOCRIHIRCCIHIHRCCCOOORRCOOIII(final int var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0 > 0, "The length may not be less than 1");
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC(
         new RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
            public RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, CharSequence var2
            ) {
               return new RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2) {
                  @Override
                  public int separatorStart(int var1) {
                     int var2x = var1 + var0;
                     return var2x < this.CCHIHORCOCHROIHIORRICHIIROROHI.length() ? var2x : -1;
                  }

                  @Override
                  public int separatorEnd(int var1) {
                     return var1;
                  }
               };
            }
         }
      );
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC CIHCCCIOCCICCHIHHROOHCIIIHROOI() {
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC(
         this.RRRICHCIRHOICICIRCCIRROHRRRICI, true, this.RRIOIOOIHOCCICHHIOIROICIOOCIII, this.IRHIHHROOOCOOCHROCHIRHHHOHOHHH
      );
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC ROICOCHCIHIRICHOOCHHCRHCHOORIR(int var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 > 0, "must be greater than zero: %s", var1);
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC(
         this.RRRICHCIRHOICICIRCCIRROHRRRICI, this.RCRCOIHOOIRHCHOIOCROHOIHOHRRIO, this.RRIOIOOIHOCCICHHIOIROICIOOCIII, var1
      );
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC RICCCCCCIHRRIRRROCOOCHHCHRCCRH() {
      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(RRCRRCORICCHOHHIRCHIROOHIIOHCO.OHCIROOOCCIOOORIIICOHOIHHCCICR());
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC RRCRRCORICCHOHHIRCHIROOHIIOHCO(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC(
         this.RRRICHCIRHOICICIRCCIRROHRRRICI, this.RCRCOIHOOIRHCHOIOCROHOIHOHRRIO, var1, this.IRHIHHROOOCOOCHROCHIRHHHOHOHHH
      );
   }

   public Iterable<String> split(final CharSequence var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      return new Iterable<String>() {
         @Override
         public Iterator<String> iterator() {
            return RCIROOOOICRHCCRRCIORHHIRCOIIIC.this.splittingIterator(var1);
         }

         @Override
         public String toString() {
            return IHIRRIIORRHORHRORIHOROIRCORCOO.COOOROIICHHICCCHCCIOIRRRRIIORO(", ")
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new StringBuilder().append('['), this)
               .append(']')
               .toString();
         }
      };
   }

   private Iterator<String> splittingIterator(CharSequence var1) {
      return this.RRRICHCIRHOICICIRCCIRROHRRRICI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this, var1);
   }

   public List<String> splitToList(CharSequence var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      Iterator var2 = this.splittingIterator(var1);
      ArrayList var3 = new ArrayList();

      while (var2.hasNext()) {
         var3.add(var2.next());
      }

      return Collections.unmodifiableList(var3);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public Stream<String> splitToStream(CharSequence var1) {
      return StreamSupport.stream(this.split(var1).spliterator(), false);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IORCIIIOOOOICRIIHICHHCHHIOROHC(String var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHHIOIOICHIIHICIHRRRRCROIOOCCI(var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RICRIRRCOHRCOCRRHHCRHRROOIOHHR(char var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR(var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   private interface HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      Iterator<String> HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, CharSequence var2);
   }

   private abstract static class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<String> {
      final CharSequence CCHIHORCOCHROIHIORRICHIIROROHI;
      final RRCRRCORICCHOHHIRCHIROOHIIOHCO OHIIHCRIIIRCIICHRHHRRCHOOIRRRO;
      final boolean HORHCRRRIIHRCCORCCCIOCHICCCRRI;
      int offset = 0;
      int limit;

      abstract int separatorStart(int var1);

      abstract int separatorEnd(int var1);

      protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, CharSequence var2) {
         this.OHIIHCRIIIRCIICHRHHRRCHOOIRRRO = var1.RRIOIOOIHOCCICHHIOIROICIOOCIII;
         this.HORHCRRRIIHRCCORCCCIOCHICCCRRI = var1.RCRCOIHOOIRHCHOIOCROHOIHOHRRIO;
         this.limit = var1.IRHIHHROOOCOOCHROCHIRHHHOHOHHH;
         this.CCHIHORCOCHROIHIORRICHIIROROHI = var2;
      }

      protected String computeNext() {
         int var1 = this.offset;

         while (this.offset != -1) {
            int var2 = var1;
            int var4 = this.separatorStart(this.offset);
            int var3;
            if (var4 == -1) {
               var3 = this.CCHIHORCOCHROIHIORRICHIIROROHI.length();
               this.offset = -1;
            } else {
               var3 = var4;
               this.offset = this.separatorEnd(var4);
            }

            if (this.offset != var1) {
               while (var2 < var3 && this.OHIIHCRIIIRCIICHRHHRRCHOOIRRRO.matches(this.CCHIHORCOCHROIHIORRICHIIROROHI.charAt(var2))) {
                  var2++;
               }

               while (var3 > var2 && this.OHIIHCRIIIRCIICHRHHRRCHOOIRRRO.matches(this.CCHIHORCOCHROIHIORRICHIIROROHI.charAt(var3 - 1))) {
                  var3--;
               }

               if (!this.HORHCRRRIIHRCCORCCCIOCHICCCRRI || var2 != var3) {
                  if (this.limit == 1) {
                     var3 = this.CCHIHORCOCHROIHIORRICHIIROROHI.length();
                     this.offset = -1;

                     while (var3 > var2 && this.OHIIHCRIIIRCIICHRHHRRCHOOIRRRO.matches(this.CCHIHORCOCHROIHIORRICHIIROROHI.charAt(var3 - 1))) {
                        var3--;
                     }
                  } else {
                     this.limit--;
                  }

                  return this.CCHIHORCOCHROIHIORRICHIIROROHI.subSequence(var2, var3).toString();
               }

               var1 = this.offset;
            } else {
               this.offset++;
               if (this.offset > this.CCHIHORCOCHROIHIORRICHIIROROHI.length()) {
                  this.offset = -1;
               }
            }
         }

         return this.CHICCRIOOROHRIHIRHHHCHICHCHIIH();
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private static final String IOIIRHROORIHHRRHIHHIIIIOIOORII = "Chunk [%s] is not a valid entry";
      private final RCIROOOOICRHCCRRCIORHHIRCOIIIC IIIOIHRCCIICHHCCHOROCCCIHRCRCH;
      private final RCIROOOOICRHCCRRCIORHHIRCOIIIC OOCHIIHHCIOIOHICICCRCHOCHHIOCC;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, RCIROOOOICRHCCRRCIORHHIRCOIIIC var2) {
         this.IIIOIHRCCIICHHCCHOROCCCIHRCRCH = var1;
         this.OOCHIIHHCIOIOHICICCRCHOCHHIOCC = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      }

      public Map<String, String> split(CharSequence var1) {
         LinkedHashMap var2 = new LinkedHashMap();

         for (String var4 : this.IIIOIHRCCIICHHCCHOROCCCIHRCRCH.split(var1)) {
            Iterator var5 = this.OOCHIIHHCIOIOHICICCRCHOCHHIOCC.splittingIterator(var4);
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var5.hasNext(), "Chunk [%s] is not a valid entry", var4);
            String var6 = (String)var5.next();
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(!var2.containsKey(var6), "Duplicate key [%s] found.", var6);
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var5.hasNext(), "Chunk [%s] is not a valid entry", var4);
            String var7 = (String)var5.next();
            var2.put(var6, var7);
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(!var5.hasNext(), "Chunk [%s] is not a valid entry", var4);
         }

         return Collections.unmodifiableMap(var2);
      }
   }
}
