package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;

@Deprecated
public class CIOHHCORHRCCRICCCORIHCRHCCCRRR extends DateFormat {
   private static final long ICIHCICRHHIRORHHCCIHOCHORRHCHH = 1L;

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR() {
      this.numberFormat = new DecimalFormat();
      this.calendar = new GregorianCalendar();
   }

   @Override
   public StringBuffer format(Date var1, StringBuffer var2, FieldPosition var3) {
      var2.append(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.format(var1));
      return var2;
   }

   @Override
   public Date parse(String var1, ParsePosition var2) {
      try {
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.parse(var1, var2);
      } catch (ParseException var4) {
         return null;
      }
   }

   @Override
   public Date parse(String var1) {
      return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.parse(var1, new ParsePosition(0));
   }

   @Override
   public Object clone() {
      return this;
   }
}
