package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHIHIIHCCCCCIHRORIOIOORCIOHII;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.IOIICIRIICICIIOORHCIIIIRRIHRHI;

public class RHOCHHIRRCHHHOHOIRROIROHHHIHIO extends RORCHCIIICOHIRROOORHOCCCCIOCCI {
   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO() {
      super(Object.class);
   }

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO(Class<?> var1) {
      super(var1);
   }

   @Override
   public void serialize(
      Object var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   ) {
      if (var3.CRICCOOHHHCHOORCICOCOHIHOIRHOO(IOHIHIIHCCCCCIHRORIOIOORCIOHII.FAIL_ON_EMPTY_BEANS)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1);
      }

      super.serialize(var1, var2, var3);
   }

   @Override
   public void serializeWithType(
      Object var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR var4
   ) {
      if (var3.CRICCOOHHHCHOORCICOCOHIHOIRHOO(IOHIHIIHCCCCCIHRORIOIOORCIOHII.FAIL_ON_EMPTY_BEANS)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1);
      }

      super.serializeWithType(var1, var2, var3, var4);
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, Object var2) {
      Class var3 = var2.getClass();
      if (IOIICIRIICICIIOORHCIIIIRRIHRHI.CROCIHOHROHRCOHRHOCHICOCRIIIHO(var3)) {
         var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.handledType(),
            String.format(
               "No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized",
               var3.getName()
            )
         );
      } else {
         var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            this.handledType(),
            String.format(
               "No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)",
               var3.getName()
            )
         );
      }
   }
}
