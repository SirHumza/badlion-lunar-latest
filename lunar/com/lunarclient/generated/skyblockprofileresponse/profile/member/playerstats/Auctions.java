package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.auctions.AuctionStats;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Auctions() {
   @NotNull
   private final BetterJson elm;

   public Auctions(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> bids() {
      return this.elm.get("bids").asDouble();
   }

   public Optional<Double> completed() {
      return this.elm.get("completed").asDouble();
   }

   public Optional<Double> created() {
      return this.elm.get("created").asDouble();
   }

   public Optional<Double> fees() {
      return this.elm.get("fees").asDouble();
   }

   public Optional<Double> goldEarned() {
      return this.elm.get("gold_earned").asDouble();
   }

   public Optional<Double> goldSpent() {
      return this.elm.get("gold_spent").asDouble();
   }

   public Optional<Double> highestBid() {
      return this.elm.get("highest_bid").asDouble();
   }

   public Optional<Double> noBids() {
      return this.elm.get("no_bids").asDouble();
   }

   public AuctionStats totalBought() {
      return new AuctionStats(this.elm.get("total_bought"));
   }

   public AuctionStats totalSold() {
      return new AuctionStats(this.elm.get("total_sold"));
   }

   public Optional<Double> won() {
      return this.elm.get("won").asDouble();
   }
}
