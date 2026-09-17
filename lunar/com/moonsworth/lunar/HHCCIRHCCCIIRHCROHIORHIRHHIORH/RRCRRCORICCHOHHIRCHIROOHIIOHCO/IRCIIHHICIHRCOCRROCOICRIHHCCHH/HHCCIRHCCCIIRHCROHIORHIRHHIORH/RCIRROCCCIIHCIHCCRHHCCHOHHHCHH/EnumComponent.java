package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   PICKUP,
   QUICK_MOVE,
   SWAP,
   CLONE,
   THROW,
   QUICK_CRAFT,
   PICKUP_ALL;

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH fromId(int var0) {
      return values()[var0];
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH fromVanilla(Enum<?> var0) {
      return fromId(var0.ordinal());
   }

   public int toId() {
      return this.ordinal();
   }

   public <T extends Enum<T>> T toVanilla(T[] var1) {
      return (T)var1[this.ordinal()];
   }
}
