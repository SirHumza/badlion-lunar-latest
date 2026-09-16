package com.moonsworth.lunar.client.util;

import com.google.common.primitives.Ints;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lunarclient.gameipc.auth.v1.AddAccountRequest;
import com.lunarclient.gameipc.auth.v1.RefreshAccountRequest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import lombok.Generated;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH {
   public static void RCOCRROHHROHHOCRCCCHCIROIIOORC(
      Consumer<com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var0
   ) {
      Integer var1 = Ints.tryParse(IRRCHICCRHCHRRCHIOHIIRIORIRHRI.ORCCHCHHORORRHCHRRCCHICHIHCCCO.replace(".", ""));
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Microsoft Auth", "Launcher version (as int): " + var1
      );
      Optional var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC();
      if (!var2.isEmpty()
         && ((com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get()).ROORROCCCRCRCOHHOROROIRHCIROHR()
            == com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.READY) {
         ((com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get())
            .ICROIHIIIRHHHOHIOHOOOROHIORHIR()
            .addAccount(
               null,
               AddAccountRequest.newBuilder().build(),
               var1x -> {
                  if (var1x.getSuccess()) {
                     var0.accept(new com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(true));
                  } else {
                     com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2x = switch (var1x.getError()) {
                        case ACCOUNT_ERROR_NOT_PURCHASED_MINECRAFT -> com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NOT_PURCHASED_MINECRAFT;
                        case ACCOUNT_ERROR_UNSPECIFIED, UNRECOGNIZED -> com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.UNKNOWN;
                     };
                     var0.accept(new com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(false, var2x));
                  }
               }
            );
      } else {
         var0.accept(
            new com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               false, com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LAUNCHER_NOT_OPEN
            )
         );
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Microsoft Auth", "No launcher open"
         );
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      Consumer<com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH> var1
   ) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         "Refreshing account: %s", var0.getUsername()
      );
      Optional var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC();
      if (!var2.isEmpty()
         && ((com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get()).ROORROCCCRCRCOHHOROROIRHCIROHR()
            == com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.READY) {
         ((com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get())
            .ICROIHIIIRHHHOHIOHOOOROHIORHIR()
            .refreshAccount(
               null,
               RefreshAccountRequest.newBuilder()
                  .setUuid(
                     CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(
                        UUID.fromString(OCIOROHIHRROROOIRRHRRCCHHRRRHI.CCHHHHCICRCCCIOOIOICOOCRCRHCCR(var0.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getId()))
                     )
                  )
                  .build(),
               var1x -> {
                  if (var1x.getSuccess()) {
                     var1.accept(new com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(true));
                  } else {
                     com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2x = switch (var1x.getError()) {
                        case ACCOUNT_ERROR_MISSING_REFRESH_TOKEN -> com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.MISSING_REFRESH_TOKEN;
                        case ACCOUNT_ERROR_NOT_PURCHASED_MINECRAFT -> com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.NOT_PURCHASED_MINECRAFT;
                        case ACCOUNT_ERROR_ACCOUNTS_FILE_EMPTY -> com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ACCOUNTS_FILE_EMPTY;
                        default -> com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.UNKNOWN;
                     };
                     var1.accept(new com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(false, var2x));
                  }
               }
            );
      } else {
         var1.accept(
            new com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               false, com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.LAUNCHER_NOT_OPEN
            )
         );
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Microsoft Auth", "No launcher open"
         );
      }
   }

   public static JsonObject HCHCHOORHHOHHOCICRHICIRRIOHICR(String var0) {
      JsonObject var1 = new JsonObject();
      if (var0 == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Auth", "Invalid JWT in AuthUtil..."
         );
         return var1;
      }

      if (var0.contains(".") && var0.split("\\.").length >= 2) {
         String var2 = new String(Base64.getDecoder().decode(var0.split("\\.")[1]), StandardCharsets.UTF_8);
         JsonParser var3 = new JsonParser();

         try {
            JsonElement var4 = var3.parse(var2);
            if (var4.isJsonObject()) {
               var1 = (JsonObject)var4;
            }
         } catch (Exception var5) {
            return var1;
         }
      }

      return var1;
   }

   @Generated
   private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static class CRRRICCRROCOHHOHIICIHORCOORRRH {
      private final boolean CROCIRIRHRCOHIROHCCIHRRHORRORI;
      private com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH CIOHOHCHHRRHHOOCOOIROHOHHOOICH;

      @Generated
      public CRRRICCRROCOHHOHIICIHORCOORRRH(boolean var1) {
         this.CROCIRIRHRCOHIROHCCIHRRHORRORI = var1;
      }

      @Generated
      public CRRRICCRROCOHHOHIICIHORCOORRRH(boolean var1, com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2) {
         this.CROCIRIRHRCOHIROHCCIHRRHORRORI = var1;
         this.CIOHOHCHHRRHHOOCOOIROHOHHOOICH = var2;
      }

      @Generated
      public boolean isSuccessful() {
         return this.CROCIRIRHRCOHIROHCCIHRRHORRORI;
      }

      @Generated
      public com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH OHOIHCIIHRIHICCRCRIHIORCCHHORI() {
         return this.CIOHOHCHHRRHHOOCOOIROHOHHOOICH;
      }
   }

   public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
      UNKNOWN("unknown"),
      ACCOUNTS_FILE_EMPTY("accounts_file_empty"),
      LAUNCHER_NOT_OPEN("launcher_not_open"),
      NOT_PURCHASED_MINECRAFT("not_purchased_minecraft"),
      MISSING_REFRESH_TOKEN("missing_refresh_token");

      private final String id;

      public static Optional<com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> getFromId(String var0) {
         for (com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : values()) {
            if (var4.getId().equals(var0)) {
               return Optional.of(var4);
            }
         }

         return Optional.empty();
      }

      @Override
      public String getLanguagePath() {
         return "popups.refresh_auth";
      }

      @Override
      public String toString() {
         return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
      }

      @Generated
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var3) {
         this.id = var3;
      }

      @Generated
      public String getId() {
         return this.id;
      }
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private final boolean IOCOORORHCOIHCICCCICOROIICCRCI;
      private com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCCHOCORORCCCHCIRCOHRICOROCCCO;

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var1) {
         this.IOCOORORHCOIHCICCCICOROIICCRCI = var1;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var1, com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
         this.IOCOORORHCOIHCICCCICOROIICCRCI = var1;
         this.CCCHOCORORCCCHCIRCOHRICOROCCCO = var2;
      }

      @Generated
      public boolean isSuccessful() {
         return this.IOCOORORHCOIHCICCCICOROIICCRCI;
      }

      @Generated
      public com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHHCOHRIOCORIRIICRHHICRHRIIRHC() {
         return this.CCCHOCORORCCCHCIRCOHRICOROCCCO;
      }
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
      UNKNOWN("unknown"),
      LAUNCHER_NOT_OPEN("launcher_not_open"),
      NOT_PURCHASED_MINECRAFT("not_purchased_minecraft");

      private final String id;

      public static Optional<com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> getFromId(String var0) {
         for (com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
            if (var4.getId().equals(var0)) {
               return Optional.of(var4);
            }
         }

         return Optional.empty();
      }

      @Override
      public String getLanguagePath() {
         return "popups.add_account";
      }

      @Override
      public String toString() {
         return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
      }

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
         this.id = var3;
      }

      @Generated
      public String getId() {
         return this.id;
      }
   }
}
