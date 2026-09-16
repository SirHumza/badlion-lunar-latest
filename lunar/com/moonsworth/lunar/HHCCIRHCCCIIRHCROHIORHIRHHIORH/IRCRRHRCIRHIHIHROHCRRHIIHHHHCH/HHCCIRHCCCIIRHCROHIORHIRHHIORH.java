package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;

import org.jetbrains.annotations.Contract;
import org.joml.Vector3i;
import org.joml.Vector3ic;

public interface HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RORCHCIIICOHIRROOORHOCCCCIOCCI {
   @Contract("_,_,_ -> new")
   default HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$offset(int var1, int var2, int var3) {
      return this.bridge$add(new Vector3i(var1, var2, var3));
   }

   @Contract("_ -> new")
   HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$add(Vector3ic var1);

   @Contract("-> new")
   default HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$above() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY() + 1, this.bridge$getZ());
   }

   @Contract("-> new")
   default HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$below() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY() - 1, this.bridge$getZ());
   }

   long bridge$asLong();
}
