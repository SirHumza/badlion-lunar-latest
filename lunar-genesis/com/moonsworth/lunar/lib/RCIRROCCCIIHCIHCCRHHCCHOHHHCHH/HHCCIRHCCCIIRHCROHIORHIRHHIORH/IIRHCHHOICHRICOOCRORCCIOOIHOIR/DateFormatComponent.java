package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH extends DateFormat {
   protected static final String IIOIICIIRHRIRIRIRHOHIRICCCOICR = "\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d";
   protected static final Pattern OCOCHOIRRIHCHCRHOIIRHCHCHCHHIR = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
   protected static final Pattern ORIROCROOICICRHHRRIORRCOHIOCOR;
   public static final String CIORRCIOCOHCRRORHIHIRCHCCICCCR = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
   protected static final String IOIIROHROORORCHOICIRCHRHIHOHOH = "yyyy-MM-dd";
   protected static final String OHOIOORRRICHHIHICCHIORRHOICHRR = "EEE, dd MMM yyyy HH:mm:ss zzz";
   protected static final String[] OHOIHROHIROIRHOORCCIROICIRIHCI;
   protected static final TimeZone HHRROIRRIHOROIHCORORIIOOCROHRR;
   protected static final Locale IIROOHOIIHIOHRHHICCROHOHHOCHOO;
   protected static final DateFormat CROORRHICCHOROROHRHOCHOCORCOOO;
   public static final RIRHOCHIORCCIIOIIRHOCCCRHHCHHH IOIRCHHOOHCRHHCCCHHCRROOCCORCC;
   protected static final Calendar OHIHCOOIHCORICOCICIOIROCCOIRHI;
   protected transient TimeZone IIOORIOHOOCOHORHIIORHCOCHIORIR;
   protected final Locale HCCOCCHHIOIHOCRRRHHOICRCOCICHO;
   protected Boolean OHCRRHIHCCOICCRIROROIHOCHHCCCR;
   private transient Calendar RCHRCIIHHIHHHOCORHRRHOOOCOROHO;
   private transient DateFormat RHCOHOIOCOOICOIHHOROOCHCRRRICR;
   private boolean CIIROCCRCOHOCRIROOIOOOIHCHCRRR = true;

   public RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO = IIROOHOIIHIOHRHHICCROHOHHOCHOO;
   }

   @Deprecated
   public RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(TimeZone var1, Locale var2) {
      this.IIOORIOHOOCOHORHIIORHCOCHIORIR = var1;
      this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO = var2;
   }

   protected RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(TimeZone var1, Locale var2, Boolean var3) {
      this(var1, var2, var3, false);
   }

   protected RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(TimeZone var1, Locale var2, Boolean var3, boolean var4) {
      this.IIOORIOHOOCOHORHIIORHCOCHIORIR = var1;
      this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO = var2;
      this.OHCRRHIHCCOICCRIROROIHOCHHCCCR = var3;
      this.CIIROCCRCOHOCRIROOIOOOIHCHCRRR = var4;
   }

   public static TimeZone COIORHCHRORCORCHCORHOHOOOORRCH() {
      return HHRROIRRIHOROIHCORORIIOOCROHRR;
   }

   public RIRHOCHIORCCIIOIIRHOCCCRHHCHHH OOROOCCIRCCRHOIOIORIHCHHOOCCOR(TimeZone var1) {
      if (var1 == null) {
         var1 = HHRROIRRIHOROIHCORORIIOOCROHRR;
      }

      return var1 != this.IIOORIOHOOCOHORHIIORHCOCHIORIR && !var1.equals(this.IIOORIOHOOCOHORHIIORHCOCHIORIR)
         ? new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
            var1, this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO, this.OHCRRHIHCCOICCRIROROIHOCHHCCCR, this.CIIROCCRCOHOCRIROOIOOOIHCHCRRR
         )
         : this;
   }

   public RIRHOCHIORCCIIOIIRHOCCCRHHCHHH CORCOCICIRIOHROHROIIOOHICCHCRR(Locale var1) {
      return var1.equals(this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO)
         ? this
         : new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
            this.IIOORIOHOOCOHORHIIORHCOCHIORIR, var1, this.OHCRRHIHCCOICCRIROROIHOCHHCCCR, this.CIIROCCRCOHOCRIROOIOOOIHCHCRRR
         );
   }

   public RIRHOCHIORCCIIOIIRHOCCCRHHCHHH ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(Boolean var1) {
      return RCOCRROHHROHHOCRCCCHCIROIIOORC(var1, this.OHCRRHIHCCOICCRIROROIHOCHHCCCR)
         ? this
         : new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
            this.IIOORIOHOOCOHORHIIORHCOCHIORIR, this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO, var1, this.CIIROCCRCOHOCRIROOIOOOIHCHCRRR
         );
   }

   public RIRHOCHIORCCIIOIIRHOCCCRHHCHHH RCIIIHHICHOROIIROORCOCIRRCROIR(boolean var1) {
      return this.CIIROCCRCOHOCRIROOIOOOIHCHCRRR == var1
         ? this
         : new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
            this.IIOORIOHOOCOHORHIIORHCOCHIORIR, this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO, this.OHCRRHIHCCOICCRIROROIHOCHHCCCR, var1
         );
   }

   public RIRHOCHIORCCIIOIIRHOCCCRHHCHHH HIIHRHOHOORHHCCRCIIRIORCCIRHCC() {
      return new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
         this.IIOORIOHOOCOHORHIIORHCOCHIORIR, this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO, this.OHCRRHIHCCOICCRIROROIHOCHHCCCR, this.CIIROCCRCOHOCRIROOIOOOIHCHCRRR
      );
   }

   @Deprecated
   public static DateFormat RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TimeZone var0, Locale var1) {
      SimpleDateFormat var2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", var1);
      var2.setTimeZone(HHRROIRRIHOROIHCORORIIOOCROHRR);
      return var2;
   }

   @Deprecated
   public static DateFormat IRCIIHHICIHRCOCRROCOICRIHHCCHH(TimeZone var0, Locale var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CROORRHICCHOROROHRHOCHOCORCOOO, "EEE, dd MMM yyyy HH:mm:ss zzz", var0, var1, null);
   }

   @Override
   public TimeZone getTimeZone() {
      return this.IIOORIOHOOCOHORHIIORHCOCHIORIR;
   }

   @Override
   public void setTimeZone(TimeZone var1) {
      if (!var1.equals(this.IIOORIOHOOCOHORHIIORHCOCHIORIR)) {
         this.ICHOOIIHORCHHRRIHHHOIIHOHIOIOH();
         this.IIOORIOHOOCOHORHIIORHCOCHIORIR = var1;
      }
   }

   @Override
   public void setLenient(boolean var1) {
      Boolean var2 = var1;
      if (!RCOCRROHHROHHOCRCCCHCIROIIOORC(var2, this.OHCRRHIHCCOICCRIROROIHOCHHCCCR)) {
         this.OHCRRHIHCCOICCRIROROIHOCHHCCCR = var2;
         this.ICHOOIIHORCHHRRIHHHOIIHOHIOIOH();
      }
   }

   @Override
   public boolean isLenient() {
      return this.OHCRRHIHCCOICCRIROROIHOCHHCCCR == null || this.OHCRRHIHCCOICCRIROROIHOCHHCCCR;
   }

   public boolean HIRHCHIIIOCIHOHCRRCRIRORHCHIRI() {
      return this.CIIROCCRCOHOCRIROOIOOOIHCHCRRR;
   }

   @Override
   public Date parse(String var1) {
      var1 = var1.trim();
      ParsePosition var2 = new ParsePosition(0);
      Date var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      if (var3 != null) {
         return var3;
      }

      StringBuilder var4 = new StringBuilder();

      for (String var8 : OHOIHROHIROIRHOORCCIROICIRIHCI) {
         if (var4.length() > 0) {
            var4.append("\", \"");
         } else {
            var4.append('"');
         }

         var4.append(var8);
      }

      var4.append('"');
      throw new ParseException(
         String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", var1, var4.toString()), var2.getErrorIndex()
      );
   }

   @Override
   public Date parse(String var1, ParsePosition var2) {
      try {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      } catch (ParseException var4) {
         return null;
      }
   }

   protected Date RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, ParsePosition var2) {
      if (this.CIRRHIRCICHCCRCIICOIORROOCHOIC(var1)) {
         return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
      }

      int var3 = var1.length();

      while (--var3 >= 0) {
         char var4 = var1.charAt(var3);
         if ((var4 < '0' || var4 > '9') && (var3 > 0 || var4 != '-')) {
            break;
         }
      }

      return var3 >= 0
            || var1.charAt(0) != '-'
               && !com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.IOHHOIIOCRHCHHCRORICCOHOHROOIH(
                  var1, false
               )
         ? this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2)
         : this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
   }

   @Override
   public StringBuffer format(Date var1, StringBuffer var2, FieldPosition var3) {
      TimeZone var4 = this.IIOORIOHOOCOHORHIIORHCOCHIORIR;
      if (var4 == null) {
         var4 = HHRROIRRIHOROIHCORORIIOOCROHRR;
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO, var1, var2);
      return var2;
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TimeZone var1, Locale var2, Date var3, StringBuffer var4) {
      Calendar var5 = this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
      var5.setTime(var3);
      int var6 = var5.get(1);
      if (var5.get(0) == 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var6);
      } else {
         if (var6 > 9999) {
            var4.append('+');
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH(var4, var6);
      }

      var4.append('-');
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var5.get(2) + 1);
      var4.append('-');
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var5.get(5));
      var4.append('T');
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var5.get(11));
      var4.append(':');
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var5.get(12));
      var4.append(':');
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var5.get(13));
      var4.append('.');
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4, var5.get(14));
      int var7 = var1.getOffset(var5.getTimeInMillis());
      if (var7 != 0) {
         int var8 = Math.abs(var7 / 60000 / 60);
         int var9 = Math.abs(var7 / 60000 % 60);
         var4.append((char)(var7 < 0 ? '-' : '+'));
         IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var8);
         if (this.CIIROCCRCOHOCRIROOIOOOIHCHCRRR) {
            var4.append(':');
         }

         IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var9);
      } else if (this.CIIROCCRCOHOCRIROOIOOOIHCHCRRR) {
         var4.append("+00:00");
      } else {
         var4.append("+0000");
      }
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StringBuffer var1, int var2) {
      if (var2 == 1) {
         var1.append("+0000");
      } else {
         int var3 = var2 - 1;
         var1.append('-');
         CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var3);
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(StringBuffer var0, int var1) {
      int var2 = var1 / 10;
      if (var2 == 0) {
         var0.append('0');
      } else {
         var0.append((char)(48 + var2));
         var1 -= 10 * var2;
      }

      var0.append((char)(48 + var1));
   }

   private static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(StringBuffer var0, int var1) {
      int var2 = var1 / 100;
      if (var2 == 0) {
         var0.append('0');
      } else {
         var0.append((char)(48 + var2));
         var1 -= var2 * 100;
      }

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
   }

   private static void CRRRICCRROCOHHOHIICIHORCOORRRH(StringBuffer var0, int var1) {
      int var2 = var1 / 100;
      if (var2 == 0) {
         var0.append('0').append('0');
      } else {
         if (var2 > 99) {
            var0.append(var2);
         } else {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var2);
         }

         var1 -= 100 * var2;
      }

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
   }

   @Override
   public String toString() {
      return String.format(
         "DateFormat %s: (timezone: %s, locale: %s, lenient: %s)",
         this.getClass().getName(),
         this.IIOORIOHOOCOHORHIIORHCOCHIORIR,
         this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO,
         this.OHCRRHIHCCOICCRIROROIHOCHHCCCR
      );
   }

   public String OICHCCHRCOHCCRCCOCIHIRCHOHHHOO() {
      StringBuilder var1 = new StringBuilder(100);
      var1.append("[one of: '").append("yyyy-MM-dd'T'HH:mm:ss.SSSX").append("', '").append("EEE, dd MMM yyyy HH:mm:ss zzz").append("' (");
      var1.append(Boolean.FALSE.equals(this.OHCRRHIHCCOICCRIROROIHOCHHCCCR) ? "strict" : "lenient").append(")]");
      return var1.toString();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this;
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this);
   }

   protected boolean CIRRHIRCICHCCRCIICOIORROOCHOIC(String var1) {
      return var1.length() >= 7
         && Character.isDigit(var1.charAt(0))
         && Character.isDigit(var1.charAt(3))
         && var1.charAt(4) == '-'
         && Character.isDigit(var1.charAt(5));
   }

   private Date IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, ParsePosition var2) {
      long var3;
      try {
         var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOCIIHHOHROOROHHCCRCIIHOICCIHC(
            var1
         );
      } catch (NumberFormatException var6) {
         throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", var1), var2.getErrorIndex());
      }

      return new Date(var3);
   }

   protected Date HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, ParsePosition var2) {
      try {
         return this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2);
      } catch (IllegalArgumentException var4) {
         throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", var1, var4.getMessage()), var2.getErrorIndex());
      }
   }

   protected Date CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, ParsePosition var2) {
      int var3 = var1.length();
      TimeZone var4 = HHRROIRRIHOROIHCORORIIOOCROHRR;
      if (this.IIOORIOHOOCOHORHIIORHCOCHIORIR != null && 'Z' != var1.charAt(var3 - 1)) {
         var4 = this.IIOORIOHOOCOHORHIIORHCOCHIORIR;
      }

      Calendar var5 = this.CORCOCICIRIOHROHROIIOOHICCHCRR(var4);
      var5.clear();
      String var6;
      if (var3 <= 10) {
         Matcher var7 = OCOCHOIRRIHCHCRHOIIRHCHCHCHHIR.matcher(var1);
         if (var7.matches()) {
            int var8 = RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(var1, 0);
            int var9 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1, 5) - 1;
            int var10 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1, 8);
            var5.set(var8, var9, var10, 0, 0, 0);
            var5.set(14, 0);
            return var5.getTime();
         }

         var6 = "yyyy-MM-dd";
      } else {
         Matcher var19 = ORIROCROOICICRHHRRIORRCOHIOCOR.matcher(var1);
         if (var19.matches()) {
            int var20 = var19.start(2);
            int var22 = var19.end(2);
            int var24 = var22 - var20;
            if (var24 > 1) {
               int var11 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1, var20 + 1) * 3600;
               if (var24 >= 5) {
                  var11 += IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1, var22 - 2) * 60;
               }

               if (var1.charAt(var20) == '-') {
                  var11 *= -1000;
               } else {
                  var11 *= 1000;
               }

               var5.set(15, var11);
               var5.set(16, 0);
            }

            int var26 = RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(var1, 0);
            int var12 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1, 5) - 1;
            int var13 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1, 8);
            int var14 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1, 11);
            int var15 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1, 14);
            int var16;
            if (var3 > 16 && var1.charAt(16) == ':') {
               var16 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1, 17);
            } else {
               var16 = 0;
            }

            var5.set(var26, var12, var13, var14, var15, var16);
            var20 = var19.start(1) + 1;
            var22 = var19.end(1);
            int var17 = 0;
            if (var20 >= var22) {
               var5.set(14, 0);
            } else {
               var17 = 0;
               int var18 = var22 - var20;
               switch (var18) {
                  default:
                     if (var18 > 9) {
                        throw new ParseException(
                           String.format(
                              "Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", var1, var19.group(1).substring(1)
                           ),
                           var20
                        );
                     }
                  case 3:
                     var17 += var1.charAt(var20 + 2) - '0';
                  case 2:
                     var17 += 10 * (var1.charAt(var20 + 1) - '0');
                  case 1:
                     var17 += 100 * (var1.charAt(var20) - '0');
                  case 0:
                     var5.set(14, var17);
               }
            }

            return var5.getTime();
         }

         var6 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
      }

      throw new ParseException(
         String.format(
            "Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", var1, var6, this.OHCRRHIHCCOICCRIROROIHOCHHCCCR
         ),
         0
      );
   }

   private static int RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(String var0, int var1) {
      return 1000 * (var0.charAt(var1) - 48) + 100 * (var0.charAt(var1 + 1) - 48) + 10 * (var0.charAt(var1 + 2) - 48) + (var0.charAt(var1 + 3) - 48);
   }

   private static int IIOIROIHIHHCCRICRCOOCHIICHRCOI(String var0, int var1) {
      return 10 * (var0.charAt(var1) - 48) + (var0.charAt(var1 + 1) - 48);
   }

   protected Date RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, ParsePosition var2) {
      if (this.RHCOHOIOCOOICOIHHOROOCHCRRRICR == null) {
         this.RHCOHOIOCOOICOIHHOROOCHCRRRICR = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            CROORRHICCHOROROHRHOCHOCORCOOO,
            "EEE, dd MMM yyyy HH:mm:ss zzz",
            this.IIOORIOHOOCOHORHIIORHCOCHIORIR,
            this.HCCOCCHHIOIHOCRRRHHOICRCOCICHO,
            this.OHCRRHIHCCOICCRIROROIHOCHHCCCR
         );
      }

      return this.RHCOHOIOCOOICOIHHOROOCHCRRRICR.parse(var1, var2);
   }

   private static final DateFormat RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DateFormat var0, String var1, TimeZone var2, Locale var3, Boolean var4) {
      if (!var3.equals(IIROOHOIIHIOHRHHICCROHOHHOCHOO)) {
         var0 = new SimpleDateFormat(var1, var3);
         var0.setTimeZone(var2 == null ? HHRROIRRIHOROIHCORORIIOOCROHRR : var2);
      } else {
         var0 = (DateFormat)var0.clone();
         if (var2 != null) {
            var0.setTimeZone(var2);
         }
      }

      if (var4 != null) {
         var0.setLenient(var4);
      }

      return var0;
   }

   protected void ICHOOIIHORCHHRRIHHHOIIHOHIOIOH() {
      this.RHCOHOIOCOOICOIHHOROOCHCRRRICR = null;
   }

   protected Calendar CORCOCICIRIOHROHROIIOOHICCHCRR(TimeZone var1) {
      Calendar var2 = this.RCHRCIIHHIHHHOCORHRRHOOOCOROHO;
      if (var2 == null) {
         this.RCHRCIIHHIHHHOCORHRRHOOOCOROHO = var2 = (Calendar)OHIHCOOIHCORICOCICIOIROCCOIRHI.clone();
      }

      if (!var2.getTimeZone().equals(var1)) {
         var2.setTimeZone(var1);
      }

      var2.setLenient(this.isLenient());
      return var2;
   }

   protected static <T> boolean RCOCRROHHROHHOCRCCCHCIROIIOORC(T var0, T var1) {
      return var0 == var1 ? true : var0 != null && var0.equals(var1);
   }

   static {
      Object var0 = null;

      try {
         var0 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }

      ORIROCROOICICRHHRRIORRCOHIOCOR = (Pattern)var0;
      OHOIHROHIROIRHOORCCIROICIRIHCI = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
      HHRROIRRIHOROIHCORORIIOOCROHRR = TimeZone.getTimeZone("UTC");
      IIROOHOIIHIOHRHHICCROHOHHOCHOO = Locale.US;
      CROORRHICCHOROROHRHOCHOCORCOOO = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", IIROOHOIIHIOHRHHICCROHOHHOCHOO);
      CROORRHICCHOROROHRHOCHOCORCOOO.setTimeZone(HHRROIRRIHOROIHCORORIIOOCROHRR);
      IOIRCHHOOHCRHHCCCHHCRROOCCORCC = new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH();
      OHIHCOOIHCORICOCICIOIROCCOIRHI = new GregorianCalendar(HHRROIRRIHOROIHCORORIIOOCROHRR, IIROOHOIIHIOHRHHICCROHOHHOCHOO);
   }
}
