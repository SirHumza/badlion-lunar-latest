package com.lunarclient.generated.skyblockprofileresponse.profile.member.accessorybagstorage;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.accessorybagstorage.tuning.Slot0;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.accessorybagstorage.tuning.Slot1;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.accessorybagstorage.tuning.Slot2;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.accessorybagstorage.tuning.Slot3;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.accessorybagstorage.tuning.Slot4;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Tuning() {
   @NotNull
   private final BetterJson elm;

   public Tuning(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> highestUnlockedSlot() {
      return this.elm.get("highest_unlocked_slot").asDouble();
   }

   public Optional<Boolean> refund1() {
      return this.elm.get("refund_1").asBool();
   }

   public Slot0 slot0() {
      return new Slot0(this.elm.get("slot_0"));
   }

   public Slot1 slot1() {
      return new Slot1(this.elm.get("slot_1"));
   }

   public Slot2 slot2() {
      return new Slot2(this.elm.get("slot_2"));
   }

   public Slot3 slot3() {
      return new Slot3(this.elm.get("slot_3"));
   }

   public Slot4 slot4() {
      return new Slot4(this.elm.get("slot_4"));
   }
}
