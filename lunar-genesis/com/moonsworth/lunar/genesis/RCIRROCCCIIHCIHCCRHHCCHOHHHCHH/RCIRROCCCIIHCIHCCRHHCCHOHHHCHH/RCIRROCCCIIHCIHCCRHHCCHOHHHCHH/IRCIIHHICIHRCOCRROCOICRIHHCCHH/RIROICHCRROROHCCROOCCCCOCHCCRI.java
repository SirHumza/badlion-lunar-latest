package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
final class RIROICHCRROROHCCROOCCCCOCHCCRI extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements Serializable {
   private final Pattern OHCRHOOOCIIRORHIRICRICIIRCRICI;
   private static final long HICCIRCIHOIOCOIRHHRHHRRCHIHHII = 0L;

   RIROICHCRROROHCCROOCCCCOCHCCRI(Pattern var1) {
      this.OHCRHOOOCIIRORHIRICRICIIRCRICI = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
   }

   @Override
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH RRCRRCORICCHOHHIRCHIROOHIIOHCO(CharSequence var1) {
      return new RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OHCRHOOOCIIRORHIRICRICIIRCRICI.matcher(var1));
   }

   @Override
   public String pattern() {
      return this.OHCRHOOOCIIRORHIRICRICIIRCRICI.pattern();
   }

   @Override
   public int flags() {
      return this.OHCRHOOOCIIRORHIRICRICIIRCRICI.flags();
   }

   @Override
   public String toString() {
      return this.OHCRHOOOCIIRORHIRICRICIIRCRICI.toString();
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
      final Matcher RHRRRHORCRHHICHICRROROICRHRICO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Matcher var1) {
         this.RHRRRHORCRHHICHICRROROICRHRICO = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      @Override
      public boolean matches() {
         return this.RHRRRHORCRHHICHICRROROICRHRICO.matches();
      }

      @Override
      public boolean find() {
         return this.RHRRRHORCRHHICHICRROROICRHRICO.find();
      }

      @Override
      public boolean find(int var1) {
         return this.RHRRRHORCRHHICHICRROROICRHRICO.find(var1);
      }

      @Override
      public String replaceAll(String var1) {
         return this.RHRRRHORCRHHICHICRROROICRHRICO.replaceAll(var1);
      }

      @Override
      public int end() {
         return this.RHRRRHORCRHHICHICRROROICRHRICO.end();
      }

      @Override
      public int start() {
         return this.RHRRRHORCRHHICHICRROROICRHRICO.start();
      }
   }
}
