package com.moonsworth.lunar.legacy.wrapper.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOIRIRROOCICRHIRIHCIRCOHCIHHHO(
      String var1
   ) {
      try {
         return (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? JsonToNBT.getTagFromJson$v1_8(var1) : JsonToNBT.func_150315_a$v1_7(var1)) instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
            ? var3
            : null;
      } catch (NBTException var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
