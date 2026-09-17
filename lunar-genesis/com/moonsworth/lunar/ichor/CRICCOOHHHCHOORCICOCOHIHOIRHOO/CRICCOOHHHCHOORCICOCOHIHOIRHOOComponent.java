package com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import lombok.Generated;

class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   protected CRRRICCRROCOHHOHIICIHORCOORRRH HRRHHCHCOHRIHHIICOOOHHIHOIRHOI;

   @Override
   public String getDescriptor() {
      return "[".repeat(this.HRRHHCHCOHRIHHIICOOOHHIHOIRHOI.depth)
         + this.HRRHHCHCOHRIHHIICOOOHHIHOIRHOI.HRIICHCROOORCICCHIHRCCOHRCHHRC.IICRHRIOIROIOHRICHHHHHIHIOOICI().getDescriptor();
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH var3 = this.HRRHHCHCOHRIHHIICOOOHHIHOIRHOI;
         CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var2.HRRHHCHCOHRIHHIICOOOHHIHOIRHOI;
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      CRRRICCRROCOHHOHIICIHORCOORRRH var3 = this.HRRHHCHCOHRIHHIICOOOHHIHOIRHOI;
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }
}
