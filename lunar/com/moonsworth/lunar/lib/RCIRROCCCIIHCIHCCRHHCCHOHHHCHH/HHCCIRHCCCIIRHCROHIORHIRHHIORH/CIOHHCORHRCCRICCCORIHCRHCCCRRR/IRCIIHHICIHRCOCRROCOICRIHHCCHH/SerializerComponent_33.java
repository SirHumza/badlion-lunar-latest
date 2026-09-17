package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class IIHRRHORCRCROCHHOHORCHCROCIHRO<T>
   extends IHICORCROOROHCIHIHCOIHRRHICICO<T>
   implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   protected final Boolean RRCCORHHROCOHIIRHRICCHHCHCHHOO;
   protected final DateFormat ROCIHOHRHRRCOIHOHROCIOIRRIHIHO;
   protected final AtomicReference<DateFormat> ROCOOCRIOIHRRIIIIIOOOOOROCOHIH;

   protected IIHRRHORCRCROCHHOHORCHCROCIHRO(Class<T> var1, Boolean var2, DateFormat var3) {
      super(var1);
      this.RRCCORHHROCOHIIRHRICCHHCHCHHOO = var2;
      this.ROCIHOHRHRRCOIHOHROCIOIRRIHIHO = var3;
      this.ROCOOCRIOIHRRIIIIIOOOOOROCOHIH = var3 == null ? null : new AtomicReference<>();
   }

   public abstract IIHRRHORCRCROCHHOHORCHCROCIHRO<T> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Boolean var1, DateFormat var2);

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?> createContextual(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = this.findFormatOverrides(
         var1, var2, this.handledType()
      );
      if (var3 == null) {
         return this;
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = var3.HIHRRCOCICCHICROIHIOCRIRCCHHCI();
      if (var4.isNumeric()) {
         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(Boolean.TRUE, null);
      }

      if (var3.IOHHCIROOCCCHCHHHCHOHIORHIRRCC()) {
         Locale var12 = var3.RIHIRHHOIHCIRRRIRCIIIRHOHCCORI() ? var3.IRHRHRRHRIOICORHHHIROIRCCHOHCO() : var1.IRHRHRRHRIOICORHHHIROIRCCHOHCO();
         SimpleDateFormat var13 = new SimpleDateFormat(var3.getPattern(), var12);
         TimeZone var14 = var3.RRCIORCRCORHCOHOIHRIORHHHORRRI() ? var3.getTimeZone() : var1.getTimeZone();
         var13.setTimeZone(var14);
         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(Boolean.FALSE, var13);
      }

      boolean var5 = var3.RIHIRHHOIHCIRRRIRCIIIRHOHCCORI();
      boolean var6 = var3.RRCIORCRCORHCOHOIHRIORHHHORRRI();
      boolean var7 = var4
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.STRING;
      if (!var5 && !var6 && !var7) {
         return this;
      }

      DateFormat var8 = var1.RROOOCRCORCHCRRIRCRIIHHHHROOHO().IHCHORROOOOROHOHCRHROCROCORRRR();
      if (var8 instanceof com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
         )
       {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var16 = (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)var8;
         if (var3.RIHIRHHOIHCIRRRIRCIIIRHOHCCORI()) {
            var16 = var16.CORCOCICIRIOHROHROIIOOHICCHCRR(var3.IRHRHRRHRIOICORHHHIROIRCCHOHCO());
         }

         if (var3.RRCIORCRCORHCOHOIHRIORHHHORRRI()) {
            var16 = var16.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var3.getTimeZone());
         }

         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(Boolean.FALSE, var16);
      } else {
         if (!(var8 instanceof SimpleDateFormat)) {
            var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               this.handledType(),
               String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", var8.getClass().getName())
            );
         }

         SimpleDateFormat var9 = (SimpleDateFormat)var8;
         if (var5) {
            var9 = new SimpleDateFormat(var9.toPattern(), var3.IRHRHRRHRIOICORHHHIROIRCCHOHCO());
         } else {
            var9 = (SimpleDateFormat)var9.clone();
         }

         TimeZone var10 = var3.getTimeZone();
         boolean var11 = var10 != null && !var10.equals(var9.getTimeZone());
         if (var11) {
            var9.setTimeZone(var10);
         }

         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(Boolean.FALSE, var9);
      }
   }

   @Override
   public boolean isEmpty(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, T var2) {
      return false;
   }

   protected abstract long HIRRICOIICIHRRICIOCOOOCOCHHORR(T var1);

   @Deprecated
   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR getSchema(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, Type var2
   ) {
      return this.createSchemaNode(this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1) ? "number" : "string", true);
   }

   @Override
   public void acceptJsonFormatVisitor(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1.COCCOCCOIHOCRICOHOIHHORHROHRHO()));
   }

   @Override
   public abstract void serialize(
      T var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   );

   protected boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var1
   ) {
      if (this.RRCCORHHROCOHIIRHRICCHHCHCHHOO != null) {
         return this.RRCCORHHROCOHIIRHRICCHHCHCHHOO;
      }

      if (this.ROCIHOHRHRRCOIHOHROCIOIRRIHIHO == null) {
         if (var1 != null) {
            return var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHIHIIHCCCCCIHRORIOIOORCIOHII.WRITE_DATES_AS_TIMESTAMPS
            );
         } else {
            throw new IllegalArgumentException("Null SerializerProvider passed for " + this.handledType().getName());
         }
      } else {
         return false;
      }
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      boolean var3
   ) {
      if (var3) {
         this.visitIntFormat(
            var1,
            var2,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.LONG,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.UTC_MILLISEC
         );
      } else {
         this.visitStringFormat(
            var1,
            var2,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.DATE_TIME
         );
      }
   }

   protected void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Date var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   ) {
      if (this.ROCIHOHRHRRCOIHOHROCIOIRRIHIHO == null) {
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      } else {
         DateFormat var4 = this.ROCOOCRIOIHRRIIIIIOOOOOROCOHIH.getAndSet(null);
         if (var4 == null) {
            var4 = (DateFormat)this.ROCIHOHRHRRCOIHOHROCIOIRRIHIHO.clone();
         }

         var2.writeString(var4.format(var1));
         this.ROCOOCRIOIHRRIIIIIOOOOOROCOHIH.compareAndSet(null, var4);
      }
   }
}
