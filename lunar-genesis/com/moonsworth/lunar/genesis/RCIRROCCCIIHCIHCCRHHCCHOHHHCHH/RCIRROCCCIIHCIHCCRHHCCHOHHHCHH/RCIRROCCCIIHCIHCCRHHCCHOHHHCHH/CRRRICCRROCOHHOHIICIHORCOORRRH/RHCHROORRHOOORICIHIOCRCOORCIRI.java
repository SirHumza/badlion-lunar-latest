package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Spliterator;
import java.util.function.Consumer;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
abstract class RHCHROORRHOOORICIHIOCRCOORCIRI<E> extends CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> {
   abstract E get(int var1);

   @Override
   public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
      return this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
   }

   @Override
   public Spliterator<E> spliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.indexed(this.size(), 1297, this::get);
   }

   @Override
   public void forEach(Consumer<? super E> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      int var2 = this.size();

      for (int var3 = 0; var3 < var2; var3++) {
         var1.accept(this.get(var3));
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   @Override
   int copyIntoArray(Object[] var1, int var2) {
      return this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().copyIntoArray(var1, var2);
   }

   @Override
   COIRRRCIORROCHIROCHROCHICCICIC<E> RHRRCOIHRICOCRRIHRRRCHRHOCICCC() {
      return new ICCIIIRHHOOIHCCHIRRCRHICHIHRIH<E>() {
         @Override
         public E get(int var1) {
            return (E)RHCHROORRHOOORICIHIOCRCOORCIRI.this.get(var1);
         }

         @Override
         boolean isPartialView() {
            return RHCHROORRHOOORICIHIOCRCOORCIRI.this.isPartialView();
         }

         @Override
         public int size() {
            return RHCHROORRHOOORICIHIOCRCOORCIRI.this.size();
         }

         @Override
         OIICIRRCOOCIHRHOIOIOOROCRHCHIC<E> RRRCRHCROCCIHOOCCRORHIIIHHCOHO() {
            return RHCHROORRHOOORICIHIOCRCOORCIRI.this;
         }
      };
   }
}
