package com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.autopet;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.autopet.rule.Data;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.autopet.rule.Exception;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Rule() {
   @NotNull
   private final BetterJson elm;

   public Rule(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Data data() {
      return new Data(this.elm.get("data"));
   }

   public Optional<Boolean> disabled() {
      return this.elm.get("disabled").asBool();
   }

   public SafeList<Exception> exceptions() {
      return this.elm.get("exceptions").asList(Exception::new);
   }

   public Optional<String> id() {
      return this.elm.get("id").asString();
   }

   public Optional<String> name() {
      return this.elm.get("name").asString();
   }

   public Optional<String> pet() {
      return this.elm.get("pet").asString();
   }

   public Optional<String> uniqueId() {
      return this.elm.get("uniqueId").asString();
   }

   public Optional<String> uuid() {
      return this.elm.get("uuid").asString();
   }
}
