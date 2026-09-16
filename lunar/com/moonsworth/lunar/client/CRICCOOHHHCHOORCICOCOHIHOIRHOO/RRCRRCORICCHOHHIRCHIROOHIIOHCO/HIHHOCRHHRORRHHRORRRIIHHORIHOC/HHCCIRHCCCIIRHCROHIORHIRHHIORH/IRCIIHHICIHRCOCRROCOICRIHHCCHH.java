package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   SECONDS_30("thirtySixtySeconds", 30),
   MINUTE_1("oneTwoMinute", 60),
   MINUTES_2("twoFourMinutes", 120),
   MINUTES_5("fiveTenMinutes", 300);

   private final String id;
   private final long ms;

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, int var4) {
      this.id = var3;
      this.ms = var4 * 1000L;
   }

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public long getMs() {
      return this.ms;
   }
}
