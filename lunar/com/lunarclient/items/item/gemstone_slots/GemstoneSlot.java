package com.lunarclient.items.item.gemstone_slots;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.items.item.gemstone_slots.costs.GemstoneSlotCost;

public record GemstoneSlot() {
   @SerializedName("slot_type")
   private final String slotType;
   @SerializedName("costs")
   private final GemstoneSlotCost[] costs;

   public GemstoneSlot(String var1, GemstoneSlotCost[] var2) {
      this.slotType = var1;
      this.costs = var2;
   }
}
