package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.util.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH<B extends HHCCIRHCCCIIRHCROHIORHIRHHIORH<B, O, T>, O extends HCHRIROHHHCORIOCROOCHRCIOROOCI<T>, T>
   extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B, O, T> {
   protected @Nullable T defaultValue = this.HOHOOOCHHOORIIRCIIRHIROOIICCRC();

   protected HHCCIRHCCCIIRHCROHIORHIRHHIORH(@ORRCOOOCHCIIRRRCORIIOOHHOHCOIH String var1) {
      super(var1);
   }

   protected @Nullable T HOHOOOCHHOORIIRCIIRHIROOIICCRC() {
      return null;
   }

   @Contract("_->this")
   public B ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(T var1) {
      this.defaultValue = (T)var1;
      return (B)this;
   }
}
