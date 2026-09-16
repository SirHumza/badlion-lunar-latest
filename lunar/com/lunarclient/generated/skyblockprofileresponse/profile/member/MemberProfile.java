package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.memberprofile.CoopInvitation;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.memberprofile.DeletionNotice;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record MemberProfile() {
   @NotNull
   private final BetterJson elm;

   public MemberProfile(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> bankAccount() {
      return this.elm.get("bank_account").asDouble();
   }

   public Optional<Boolean> cookieBuffActive() {
      return this.elm.get("cookie_buff_active").asBool();
   }

   public CoopInvitation coopInvitation() {
      return new CoopInvitation(this.elm.get("coop_invitation"));
   }

   public DeletionNotice deletionNotice() {
      return new DeletionNotice(this.elm.get("deletion_notice"));
   }

   public Optional<Double> firstJoin() {
      return this.elm.get("first_join").asDouble();
   }

   public Optional<Double> personalBankUpgrade() {
      return this.elm.get("personal_bank_upgrade").asDouble();
   }
}
