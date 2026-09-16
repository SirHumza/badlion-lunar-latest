package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeMap;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.abiphone.ContactData;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.abiphone.Games;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.abiphone.OperatorChip;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Abiphone() {
   @NotNull
   private final BetterJson elm;

   public Abiphone(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> activeContacts() {
      return this.elm.get("active_contacts").asListOpt(BetterJson::asString);
   }

   public SafeMap<ContactData> contactData() {
      return this.elm.get("contact_data").asMap(ContactData::new);
   }

   public Games games() {
      return new Games(this.elm.get("games"));
   }

   public Optional<Boolean> hasUsedSiriusPersonalPhoneNumberItem() {
      return this.elm.get("has_used_sirius_personal_phone_number_item").asBool();
   }

   public Optional<Double> lastDyeCalledYear() {
      return this.elm.get("last_dye_called_year").asDouble();
   }

   public OperatorChip operatorChip() {
      return new OperatorChip(this.elm.get("operator_chip"));
   }

   public Optional<String> selectedRingtone() {
      return this.elm.get("selected_ringtone").asString();
   }

   public Optional<String> selectedSort() {
      return this.elm.get("selected_sort").asString();
   }

   public Optional<String> speedDial() {
      return this.elm.get("speed_dial").asString();
   }

   public Optional<Double> trioContactAddons() {
      return this.elm.get("trio_contact_addons").asDouble();
   }
}
