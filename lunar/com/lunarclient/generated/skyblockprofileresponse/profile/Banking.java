package com.lunarclient.generated.skyblockprofileresponse.profile;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.banking.Transaction;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Banking() {
   @NotNull
   private final BetterJson elm;

   public Banking(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> balance() {
      return this.elm.get("balance").asDouble();
   }

   public SafeList<Transaction> transactions() {
      return this.elm.get("transactions").asList(Transaction::new);
   }
}
