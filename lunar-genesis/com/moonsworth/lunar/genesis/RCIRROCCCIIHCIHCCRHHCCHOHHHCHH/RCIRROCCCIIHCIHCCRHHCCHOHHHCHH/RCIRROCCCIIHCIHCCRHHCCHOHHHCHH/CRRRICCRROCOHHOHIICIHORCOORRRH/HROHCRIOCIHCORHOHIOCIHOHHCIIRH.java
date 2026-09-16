package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Spliterator;
import java.util.Spliterators;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
final class HROHCRIOCIHCORHOHIOCIHOHHCIIRH<E> extends CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> {
   static final HROHCRIOCIHCORHOHIOCIHOHHCIIRH<Object> COIHHIIIOIROIRHIHCCRHIHIIRRIHI = new HROHCRIOCIHCORHOHIOCIHOHHCIIRH<>(new Object[0], 0, null, 0);
   private final transient Object[] OHHCRRHOROHHRROHICOOROORHIIHOI;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   final transient Object[] HOHCHIHHHHHHROCRIHHOORCRROCCHH;
   private final transient int CORHICICHCRIHIHHICCICRHOHHIIRR;
   private final transient int OCHCHIRCIIOORHHHOOICCHIHROHHOI;

   HROHCRIOCIHCORHOHIOCIHOHHCIIRH(Object[] var1, int var2, Object[] var3, int var4) {
      this.OHHCRRHOROHHRROHICOOROORHIIHOI = var1;
      this.HOHCHIHHHHHHROCRIHHOORCRROCCHH = var3;
      this.CORHICICHCRIHIHHICCICRHOHHIIRR = var4;
      this.OCHCHIRCIIOORHHHOOICCHIHROHHOI = var2;
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      Object[] var2 = this.HOHCHIHHHHHHROCRIHHOORCRROCCHH;
      if (var1 != null && var2 != null) {
         int var5 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smearedHash(var1);

         while (true) {
            var5 &= this.CORHICICHCRIHIHHICCICRHOHHIIRR;
            Object var4 = var2[var5];
            if (var4 == null) {
               return false;
            }

            if (var4.equals(var1)) {
               return true;
            }

            var5++;
         }
      } else {
         return false;
      }
   }

   @Override
   public int size() {
      return this.OHHCRRHOROHHRROHICOOROORHIIHOI.length;
   }

   @Override
   public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.OIHCOHRCICCCRHRCROOCIOIRRHHHIH((E[])this.OHHCRRHOROHHRROHICOOROORHIIHOI);
   }

   @Override
   public Spliterator<E> spliterator() {
      return Spliterators.spliterator(this.OHHCRRHOROHHRROHICOOROORHIIHOI, 1297);
   }

   @Override
   Object[] internalArray() {
      return this.OHHCRRHOROHHRROHICOOROORHIIHOI;
   }

   @Override
   int internalArrayStart() {
      return 0;
   }

   @Override
   int internalArrayEnd() {
      return this.OHHCRRHOROHHRROHICOOROORHIIHOI.length;
   }

   @Override
   int copyIntoArray(Object[] var1, int var2) {
      System.arraycopy(this.OHHCRRHOROHHRROHICOOROORHIIHOI, 0, var1, var2, this.OHHCRRHOROHHRROHICOOROORHIIHOI.length);
      return var2 + this.OHHCRRHOROHHRROHICOOROORHIIHOI.length;
   }

   @Override
   COIRRRCIORROCHIROCHROCHICCICIC<E> RHRRCOIHRICOCRRIHRRRCHRHOCICCC() {
      return this.HOHCHIHHHHHHROCRIHHOORCRROCCHH == null
         ? COIRRRCIORROCHIROCHROCHICCICIC.HHOIROIHOHHRHIRRRHRIRHOOIRCIOH()
         : new RRCIRIHRCIOOICCCHOIHOCIRCHHIII<>(this, this.OHHCRRHOROHHRROHICOOROORHIIHOI);
   }

   @Override
   boolean isPartialView() {
      return false;
   }

   @Override
   public int hashCode() {
      return this.OCHCHIRCIIOORHHHOOICCHIHROHHOI;
   }

   @Override
   boolean isHashCodeFast() {
      return true;
   }
}
