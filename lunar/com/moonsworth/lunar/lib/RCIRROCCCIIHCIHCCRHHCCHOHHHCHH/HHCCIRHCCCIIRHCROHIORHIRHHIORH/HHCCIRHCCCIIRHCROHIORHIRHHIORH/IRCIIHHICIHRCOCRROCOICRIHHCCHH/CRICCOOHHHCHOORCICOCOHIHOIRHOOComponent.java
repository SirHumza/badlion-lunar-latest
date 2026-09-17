package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   private static final HashSet<String> RRIORRIOHCHRHCRHCRHHIICOIHCCRH = new HashSet<>();

   public static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      Class<?> var0, String var1
   ) {
      if (RRIORRIOHCHRHCRHCRHHIICOIHCCRH.contains(var1)) {
         if (var0 == Calendar.class) {
            return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
         }

         if (var0 == Date.class) {
            return CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCROHRHCRIHHOHHCORHCHIIHROCCHI;
         }

         if (var0 == GregorianCalendar.class) {
            return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(GregorianCalendar.class);
         }
      }

      return null;
   }

   public static boolean IOROHHOIORHORCOHRHCCHCRHOCHCCI(Class<?> var0) {
      return RRIORRIOHCHRHCRHCRHHIICOIHCCRH.contains(var0.getName());
   }

   static {
      RRIORRIOHCHRHCRHCRHHIICOIHCCRH.add("java.util.Calendar");
      RRIORRIOHCHRHCRHCRHHIICOIHCCRH.add("java.util.GregorianCalendar");
      RRIORRIOHCHRHCRHCRHHIICOIHCCRH.add("java.util.Date");
   }

   public static class CRRRICCRROCOHHOHIICIHORCOORRRH extends CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH<java.sql.Date> {
      public CRRRICCRROCOHHOHIICIHORCOORRRH() {
         super(java.sql.Date.class);
      }

      public CRRRICCRROCOHHOHIICIHORCOORRRH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH var1, DateFormat var2, String var3) {
         super(var1, var2, var3);
      }

      protected CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH CRRRICCRROCOHHOHIICIHORCOORRRH(DateFormat var1, String var2) {
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH(this, var1, var2);
      }

      @Override
      public Object getEmptyValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
         return new java.sql.Date(0L);
      }

      public java.sql.Date OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         Date var3 = this._parseDate(var1, var2);
         return var3 == null ? null : new java.sql.Date(var3.getTime());
      }
   }

   @com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   public static class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Date> {
      public static final CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH CCROHRHCRIHHOHHCORHCHIIHROCCHI = new CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH();

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
         super(Date.class);
      }

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, DateFormat var2, String var3) {
         super(var1, var2, var3);
      }

      protected CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH HHCCIRHCCCIIRHCROHIORHIRHHIORH(DateFormat var1, String var2) {
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this, var1, var2);
      }

      @Override
      public Object getEmptyValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
         return new Date(0L);
      }

      public Date RCCCROCHCICCROHCOCCRRROCIIHCCH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         return this._parseDate(var1, var2);
      }
   }

   protected abstract static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T>
      extends ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<T>
      implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR {
      protected final DateFormat IHRCCHIRCRHCOIORIRCIIROCIHCIOC;
      protected final String IHRRICCHHRRCRCIHOHIHOCHIIHHRCI;

      protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(Class<?> var1) {
         super(var1);
         this.IHRCCHIRCRHCOIORIRCIIROCIHCIOC = null;
         this.IHRRICCHHRRCRCIHOHIHOCHIIHHRCI = null;
      }

      protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> var1, DateFormat var2, String var3) {
         super(var1._valueClass);
         this.IHRCCHIRCRHCOIORIRCIIROCIHCIOC = var2;
         this.IHRRICCHHRRCRCIHOHIHOCHIIHHRCI = var3;
      }

      protected abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> IRCIIHHICIHRCOCRROCOICRIHHCCHH(DateFormat var1, String var2);

      @Override
      public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH logicalType() {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.DateTime;
      }

      @Override
      public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> createContextual(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
      ) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = this.findFormatOverrides(
            var1, var2, this.handledType()
         );
         if (var3 != null) {
            TimeZone var4 = var3.getTimeZone();
            Boolean var5 = var3.HIRRHCIIROICOIOIHOHICOCOHIHHCI();
            if (var3.IOHHCIROOCCCHCHHHCHOHIORHIRRCC()) {
               String var12 = var3.getPattern();
               Locale var14 = var3.RIHIRHHOIHCIRRRIRCIIIRHOHCCORI() ? var3.IRHRHRRHRIOICORHHHIROIRCCHOHCO() : var1.IRHRHRRHRIOICORHHHIROIRCCHOHCO();
               SimpleDateFormat var19 = new SimpleDateFormat(var12, var14);
               if (var4 == null) {
                  var4 = var1.getTimeZone();
               }

               var19.setTimeZone(var4);
               if (var5 != null) {
                  var19.setLenient(var5);
               }

               return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var19, var12);
            }

            if (var4 != null) {
               DateFormat var10 = var1.IIICIOIHIHICHHIHRICHCIRHHIIRII().IHCHORROOOOROHOHCRHROCROCORRRR();
               if (var10.getClass()
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.class
                  )
                {
                  Locale var13 = var3.RIHIRHHOIHCIRRRIRCIIIRHOHCCORI() ? var3.IRHRHRRHRIOICORHHHIROIRCCHOHCO() : var1.IRHRHRRHRIOICORHHHIROIRCCHOHCO();
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var16 = (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)var10;
                  var16 = var16.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var4);
                  var16 = var16.CORCOCICIRIOHROHROIIOOHICCHCRR(var13);
                  if (var5 != null) {
                     var16 = var16.ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(var5);
                  }

                  var10 = var16;
               } else {
                  var10 = (DateFormat)var10.clone();
                  var10.setTimeZone(var4);
                  if (var5 != null) {
                     var10.setLenient(var5);
                  }
               }

               return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var10, this.IHRRICCHHRRCRCIHOHIHOCHIIHHRCI);
            }

            if (var5 != null) {
               DateFormat var6 = var1.IIICIOIHIHICHHIHRICHCIRHHIIRII().IHCHORROOOOROHOHCRHROCROCORRRR();
               String var7 = this.IHRRICCHHRRCRCIHOHIHOCHIIHHRCI;
               if (var6.getClass()
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.class
                  )
                {
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var8 = (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)var6;
                  var8 = var8.ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(var5);
                  var6 = var8;
                  var7 = var8.OICHCCHRCOHCCRCCOCIHIRCHOHHHOO();
               } else {
                  var6 = (DateFormat)var6.clone();
                  var6.setLenient(var5);
                  if (var6 instanceof SimpleDateFormat) {
                     ((SimpleDateFormat)var6).toPattern();
                  }
               }

               if (var7 == null) {
                  var7 = "[unknown]";
               }

               return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, var7);
            }
         }

         return this;
      }

      @Override
      protected Date _parseDate(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         if (this.IHRCCHIRCRHCOIORIRCIIROCIHCIOC != null
            && var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING
            )) {
            String var3 = var1.getText().trim();
            if (var3.isEmpty()) {
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = this._checkFromStringCoercion(
                  var2, var3
               );
               switch (var9) {
                  case AsEmpty:
                     return new Date(0L);
                  case AsNull:
                  case TryConvert:
                  default:
                     return null;
               }
            } else {
               synchronized (this.IHRCCHIRCRHCOIORIRCIIROCIHCIOC) {
                  Date var10000;
                  try {
                     var10000 = this.IHRCCHIRCRHCOIORIRCIIROCIHCIOC.parse(var3);
                  } catch (ParseException var7) {
                     return (Date)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.handledType(), var3, "expected format \"%s\"", this.IHRRICCHHRRCRCIHOHIHOCHIIHHRCI);
                  }

                  return var10000;
               }
            }
         } else {
            return super._parseDate(var1, var2);
         }
      }
   }

   @com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Calendar> {
      protected final Constructor<Calendar> IOROHCCCIOIORCOICHCOHICOOHOOIH;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(Calendar.class);
         this.IOROHCCCIOIORCOICHCOHICOOHOOIH = null;
      }

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<? extends Calendar> var1) {
         super(var1);
         this.IOROHCCCIOIORCOICHCOHICOOHOOIH = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH(
            var1, false
         );
      }

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, DateFormat var2, String var3) {
         super(var1, var2, var3);
         this.IOROHCCCIOIORCOICHCOHICOOHOOIH = var1.IOROHCCCIOIORCOICHCOHICOOHOOIH;
      }

      protected CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DateFormat var1, String var2) {
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1, var2);
      }

      @Override
      public Object getEmptyValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
         GregorianCalendar var2 = new GregorianCalendar();
         var2.setTimeInMillis(0L);
         return var2;
      }

      public Calendar RHCHRCOCCOIIIHCHRHIRCORHRHRICR(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         Date var3 = this._parseDate(var1, var2);
         if (var3 == null) {
            return null;
         }

         if (this.IOROHCCCIOIORCOICHCOHICOOHOOIH == null) {
            return var2.CRRRICCRROCOHHOHIICIHORCOORRRH(var3);
         }

         try {
            Calendar var4 = this.IOROHCCCIOIORCOICHCOHICOOHOOIH.newInstance();
            var4.setTimeInMillis(var3.getTime());
            TimeZone var5 = var2.getTimeZone();
            if (var5 != null) {
               var4.setTimeZone(var5);
            }

            return var4;
         } catch (Exception var6) {
            return (Calendar)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.handledType(), var3, var6);
         }
      }
   }

   public static class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Timestamp> {
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
         super(Timestamp.class);
      }

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, DateFormat var2, String var3) {
         super(var1, var2, var3);
      }

      protected CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO RRCRRCORICCHOHHIRCHIROOHIIOHCO(DateFormat var1, String var2) {
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this, var1, var2);
      }

      @Override
      public Object getEmptyValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
         return new Timestamp(0L);
      }

      public Timestamp RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         Date var3 = this._parseDate(var1, var2);
         return var3 == null ? null : new Timestamp(var3.getTime());
      }
   }
}
