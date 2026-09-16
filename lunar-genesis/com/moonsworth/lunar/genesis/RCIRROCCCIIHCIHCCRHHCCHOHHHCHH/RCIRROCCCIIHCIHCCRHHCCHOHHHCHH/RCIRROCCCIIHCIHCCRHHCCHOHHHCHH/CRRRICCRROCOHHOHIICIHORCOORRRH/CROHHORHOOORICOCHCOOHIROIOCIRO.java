package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.Iterator;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
final class CROHHORHOOORICOCHCOOHIROIOCIRO extends IOIHHIORCICCHIIHOIOIOHHRICRHIO<Comparable> implements Serializable {
   static final CROHHORHOOORICOCHCOOHIROIOCIRO OIOICOCOHOHICCHHOCOHCORHOOIOOC = new CROHHORHOOORICOCHCOOHIROIOCIRO();
   private static final long CRHRIOHOHOHOHRICRCOHIORHCHCCRI = 0L;

   public int compare(Comparable var1, Comparable var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return var1 == var2 ? 0 : var2.compareTo(var1);
   }

   @Override
   public <S extends Comparable> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> HCHORRRCIORCRHCRIIHROIRRRHCCOR() {
      return IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC();
   }

   public <E extends Comparable> E min(E var1, E var2) {
      return RRCRRIIRHHRCCICHOCOIHROROCICHC.CHCIICCROHORCCRIOOICROHCRCORRC.max((E)var1, (E)var2);
   }

   public <E extends Comparable> E min(E var1, E var2, E var3, E... var4) {
      return RRCRRIIRHHRCCICHOCOIHROROCICHC.CHCIICCROHORCCRIOOICROHCRCORRC.max((E)var1, (E)var2, (E)var3, (E[])var4);
   }

   public <E extends Comparable> E min(Iterator<E> var1) {
      return RRCRRIIRHHRCCICHOCOIHROROCICHC.CHCIICCROHORCCRIOOICROHCRCORRC.max(var1);
   }

   public <E extends Comparable> E min(Iterable<E> var1) {
      return RRCRRIIRHHRCCICHOCOIHROROCICHC.CHCIICCROHORCCRIOOICROHCRCORRC.max(var1);
   }

   public <E extends Comparable> E max(E var1, E var2) {
      return RRCRRIIRHHRCCICHOCOIHROROCICHC.CHCIICCROHORCCRIOOICROHCRCORRC.min((E)var1, (E)var2);
   }

   public <E extends Comparable> E max(E var1, E var2, E var3, E... var4) {
      return RRCRRIIRHHRCCICHOCOIHROROCICHC.CHCIICCROHORCCRIOOICROHCRCORRC.min((E)var1, (E)var2, (E)var3, (E[])var4);
   }

   public <E extends Comparable> E max(Iterator<E> var1) {
      return RRCRRIIRHHRCCICHOCOIHROROCICHC.CHCIICCROHORCCRIOOICROHCRCORRC.min(var1);
   }

   public <E extends Comparable> E max(Iterable<E> var1) {
      return RRCRRIIRHHRCCICHOCOIHROROCICHC.CHCIICCROHORCCRIOOICROHCRCORRC.min(var1);
   }

   private Object readResolve() {
      return OIOICOCOHOHICCHHOCOHCORHOOIOOC;
   }

   @Override
   public String toString() {
      return "Ordering.natural().reverse()";
   }

   private CROHHORHOOORICOCHCOOHIROIOCIRO() {
   }
}
