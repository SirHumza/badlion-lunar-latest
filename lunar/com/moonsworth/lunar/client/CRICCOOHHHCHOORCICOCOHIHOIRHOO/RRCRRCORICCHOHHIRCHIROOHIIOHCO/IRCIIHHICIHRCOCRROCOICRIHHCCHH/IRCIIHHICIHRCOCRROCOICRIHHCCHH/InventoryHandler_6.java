package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   HELD_ITEM(-1),
   HELMET(3),
   CHESTPLATE(2),
   LEGGINGS(1),
   BOOTS(0),
   OFF_HAND_HELD_ITEM(-2);

   private final int slotId;

   public boolean isHeld() {
      return this == HELD_ITEM || this == OFF_HAND_HELD_ITEM;
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var3) {
      this.slotId = var3;
   }

   @Generated
   public int getSlotId() {
      return this.slotId;
   }
}
