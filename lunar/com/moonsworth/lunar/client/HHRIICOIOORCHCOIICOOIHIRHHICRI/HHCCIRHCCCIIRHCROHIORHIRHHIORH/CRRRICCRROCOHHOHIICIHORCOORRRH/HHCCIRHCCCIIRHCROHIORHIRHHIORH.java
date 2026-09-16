package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import java.util.function.BooleanSupplier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

public interface HHCCIRHCCCIIRHCROHIORHIRHHIORH<Self> extends IHHCHHHCRIHOOCOIOOCRIIICIOROIR<Self> {
   @Contract("_ -> this")
   Self OOROOCCIRCCRHOIOIORIHCHHOOCCOR(HCHRIROHHHCORIOCROOCHRCIOROOCI<?>... var1);

   @Contract("_ -> this")
   default Self RRCRRCORICCHOHHIRCHIROOHIIOHCO(CRRRICCRROCOHHOHIICIHORCOORRRH<?, ?>... var1) {
      return this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1));
   }

   @Contract("_ -> this")
   Self IIHRRHORCRCROCHHOHORCHCROCIHRO(@NotNull BooleanSupplier var1);

   @Contract("_ -> this")
   Self HICHRCOHCCRHOHCICOOCHOIHCCHIRI(@NotNull BooleanSupplier var1);

   @Contract("_ -> this")
   Self CCHHIOROOICROROOCOHHCRRICCOCRO(boolean var1);

   @TestOnly
   void HRHICOCCOOHROCCIHHOHORHIHHHHOO(boolean var1);
}
