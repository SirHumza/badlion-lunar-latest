package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHRRHOHCRCHCCRRHOHHIRCCHOCICHC;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import java.text.DecimalFormat;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   NEAREST("nearest", new DecimalFormat("#")),
   DECIMAL_1("1Decimal", new DecimalFormat("#.#")),
   DECIMAL_2("2Decimal", new DecimalFormat("#.##")),
   DECIMAL_3("3Decimal", new DecimalFormat("#.###"));

   private final String id;
   private final DecimalFormat format;

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, DecimalFormat var4) {
      this.id = var3;
      this.format = var4;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   @Override
   public String id() {
      return this.id;
   }

   public String format(double var1) {
      return this.format.format(var1);
   }
}
