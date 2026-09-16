package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

@com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public class IOIICIRIICICIIOORHCIIIIRRIHRHI
   extends IHICORCROOROHCIHIHCOIHRRHICICO<Number>
   implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   public static final IOIICIRIICICIIOORHCIIIIRRIHRHI RRHRCICHOHCHOHCHRORIHCHRROICRR = new IOIICIRIICICIIOORHCIIIIRRIHRHI(Number.class);
   protected static final int RRIOOCCHCRORCCHIHIHHORIIHHOOHI = 9999;
   protected final boolean HHIRCIIIRHCHRORCOORHIRIIHRCOHI;

   public IOIICIRIICICIIOORHCIIIIRRIHRHI(Class<? extends Number> var1) {
      super(var1, false);
      this.HHIRCIIIRHCHRORCOORHIRIIHRCOHI = var1 == BigInteger.class;
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?> createContextual(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = this.findFormatOverrides(
         var1, var2, this.handledType()
      );
      if (var3 != null) {
         switch (var3.HIHRRCOCICCHICROIHIOCRIRCCHHCI()) {
            case STRING:
               if (this.handledType() == BigDecimal.class) {
                  return IOOOROCIROHORCORIICIOOIOIROIOH();
               }

               return IOHHOIIOCRHCHHCRORICCOHOHROOIH.HIIRRCHCCOHROOOHIICORHIHIIHROO;
         }
      }

      return this;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Number var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   ) {
      if (var1 instanceof BigDecimal) {
         var2.OHHRIOHROOIHOROCIRHCHORIHRRRRI((BigDecimal)var1);
      } else if (var1 instanceof BigInteger) {
         var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH((BigInteger)var1);
      } else if (var1 instanceof Long) {
         var2.IOHCRRIIHCIHORROOCHCCORIHRHCII(var1.longValue());
      } else if (var1 instanceof Double) {
         var2.OCIOROHIHRROROOIRRHRRCCHHRRRHI(var1.doubleValue());
      } else if (var1 instanceof Float) {
         var2.IRIRICIHHCOICHHCHCOCCHHOROOCHH(var1.floatValue());
      } else if (!(var1 instanceof Integer) && !(var1 instanceof Byte) && !(var1 instanceof Short)) {
         var2.HIRHRCRHCHCIICCIOOCROHOOIOIRHH(var1.toString());
      } else {
         var2.CORHHROICCOCRHRCCOOHCRCRHICHOI(var1.intValue());
      }
   }

   @Deprecated
   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR getSchema(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, Type var2
   ) {
      return this.createSchemaNode(this.HHIRCIIIRHCHRORCOORHIRIIHRCOHI ? "integer" : "number", true);
   }

   @Override
   public void acceptJsonFormatVisitor(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      if (this.HHIRCIIIRHCHRORCOORHIRIIHRCOHI) {
         this.visitIntFormat(
            var1,
            var2,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BIG_INTEGER
         );
      } else if (this.handledType() == BigDecimal.class) {
         this.visitFloatFormat(
            var1,
            var2,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BIG_DECIMAL
         );
      } else {
         var1.IOHHOIIOCRHCHHCRORICCOHOHROOIH(var2);
      }
   }

   public static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?> IOOOROCIROHORCORIICIOOIOIROIOH() {
      return IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHHIRCHIHRCIHCIORCICIRIOIHICH;
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IIHRHCCOOHOOOOCHRRCOROOIOHCOOO {
      static final IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIHHIRCHIHRCIHCIORCICIRIOIHICH = new IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(BigDecimal.class);
      }

      @Override
      public boolean isEmpty(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, Object var2
      ) {
         return false;
      }

      @Override
      public void serialize(
         Object var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
      ) {
         String var4;
         if (var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WRITE_BIGDECIMAL_AS_PLAIN
         )) {
            BigDecimal var5 = (BigDecimal)var1;
            if (!this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var5)) {
               String var6 = String.format(
                  "Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]",
                  var5.scale(),
                  9999,
                  9999
               );
               var3.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var6);
            }

            var4 = var5.toPlainString();
         } else {
            var4 = var1.toString();
         }

         var2.writeString(var4);
      }

      @Override
      public String valueToString(Object var1) {
         throw new IllegalStateException();
      }

      protected boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var1, BigDecimal var2
      ) {
         int var3 = var2.scale();
         return var3 >= -9999 && var3 <= 9999;
      }
   }
}
