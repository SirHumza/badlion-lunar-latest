package org.openapitools.jackson.nullable;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

public class JsonNullableBeanPropertyWriter extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final long serialVersionUID = 1L;

   protected JsonNullableBeanPropertyWriter(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      super(var1);
   }

   protected JsonNullableBeanPropertyWriter(CRRRICCRROCOHHOHIICIHORCOORRRH var1, IHCRORHRORIICHRHRCHRRIRRHHOCOO var2) {
      super(var1, var2);
   }

   @Override
   protected CRRRICCRROCOHHOHIICIHORCOORRRH _new(IHCRORHRORIICHRHRCHRRIRRHHOCOO var1) {
      return new JsonNullableBeanPropertyWriter(this, var1);
   }

   @Override
   public CRRRICCRROCOHHOHIICIHORCOORRRH unwrappingWriter(RIROICHCRROROHCCROOCCCCOCHCCRI var1) {
      return new UnwrappingJsonNullableBeanPropertyWriter(this, var1);
   }

   @Override
   public void serializeAsField(Object var1, CRICCOOHHHCHOORCICOCOHIHOIRHOO var2, RCIROOOOICRHCCRRCIORHHIRCOIIIC var3) {
      Object var4 = this.get(var1);
      if (!JsonNullable.undefined().equals(var4) && (this._nullSerializer != null || var4 != null)) {
         super.serializeAsField(var1, var2, var3);
      }
   }
}
