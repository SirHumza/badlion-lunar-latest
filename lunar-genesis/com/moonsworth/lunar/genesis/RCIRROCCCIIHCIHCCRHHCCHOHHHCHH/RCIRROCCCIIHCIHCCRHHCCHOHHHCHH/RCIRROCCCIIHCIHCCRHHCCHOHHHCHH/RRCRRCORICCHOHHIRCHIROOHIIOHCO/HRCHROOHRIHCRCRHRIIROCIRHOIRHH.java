package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI HOHIICOCROCRHHHOOCROOHHOORHORI = new CRRRICCRROCOHHOHIICIHORCOORRRH() {
      @Override
      public String escape(String var1) {
         return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      @Override
      protected char[] escape(char var1) {
         return null;
      }
   };

   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
   }

   public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RHCHCHOHHCICRHCCRIORHHHIOIROHR() {
      return HOHIICOCROCRHHHOOCROOHHOORHORI;
   }

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIRIRHRHRIRRIIICHIIHCOCOHOICRC() {
      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   static CORCOCICIRIOHROHROIIOOHICCHCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var0 instanceof CORCOCICIRIOHROHROIIOOHICCHCRR) {
         return (CORCOCICIRIOHROHROIIOOHICCHCRR)var0;
      } else if (var0 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH) {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((CRRRICCRROCOHHOHIICIHORCOORRRH)var0);
      } else {
         throw new IllegalArgumentException("Cannot create a UnicodeEscaper from: " + var0.getClass().getName());
      }
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var0, char var1) {
      return stringOrNull(var0.escape(var1));
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var0, int var1) {
      return stringOrNull(var0.escape(var1));
   }

   private static String stringOrNull(char[] var0) {
      return var0 == null ? null : new String(var0);
   }

   private static CORCOCICIRIOHROHROIIOOHICCHCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final CRRRICCRROCOHHOHIICIHORCOORRRH var0) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR() {
         @Override
         protected char[] escape(int var1) {
            if (var1 < 65536) {
               return var0.escape((char)var1);
            }

            char[] var2 = new char[2];
            Character.toChars(var1, var2, 0);
            char[] var3 = var0.escape(var2[0]);
            char[] var4 = var0.escape(var2[1]);
            if (var3 == null && var4 == null) {
               return null;
            }

            int var5 = var3 != null ? var3.length : 1;
            int var6 = var4 != null ? var4.length : 1;
            char[] var7 = new char[var5 + var6];
            if (var3 != null) {
               for (int var8 = 0; var8 < var3.length; var8++) {
                  var7[var8] = var3[var8];
               }
            } else {
               var7[0] = var2[0];
            }

            if (var4 != null) {
               for (int var9 = 0; var9 < var4.length; var9++) {
                  var7[var5 + var9] = var4[var9];
               }
            } else {
               var7[var5] = var2[1];
            }

            return var7;
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Map<Character, String> HCHHCIRRHRRIRRHOHHCIIRHCORRCHR = new HashMap<>();
      private char safeMin = 0;
      private char safeMax = '\uffff';
      private String unsafeReplacement = null;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @CanIgnoreReturnValue
      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(char var1, char var2) {
         this.safeMin = var1;
         this.safeMax = var2;
         return this;
      }

      @CanIgnoreReturnValue
      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOHHCOCROHCRHHOHIOHICRCHIIRHCC(@Nullable String var1) {
         this.unsafeReplacement = var1;
         return this;
      }

      @CanIgnoreReturnValue
      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(char var1, String var2) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         this.HCHHCIRRHRRIRRHOHHCIIRHCORRCHR.put(var1, var2);
         return this;
      }

      public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI IIIRHHIHCCCIHHROICHRHOHCHHHHHO() {
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.HCHHCIRRHRRIRRHOHHCIIRHCORRCHR, this.safeMin, this.safeMax
         ) {
            private final char[] HRRCIROICIOIIIHHHOIIOIROCHIROR = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.unsafeReplacement != null
               ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.unsafeReplacement.toCharArray()
               : null;

            @Override
            protected char[] escapeUnsafe(char var1) {
               return this.HRRCIROICIOIIIHHHOIIOIROCHIROR;
            }
         };
      }
   }
}
