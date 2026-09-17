package com.moonsworth.lunar.client.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.websocket.badge.v1.OwnedBadge;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @NotNull
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHOOCHICROHOCOCCHHOOCOHCRCCCIC;
   private final Instant IIRHRCICOCHOROCCIOOCOCIOCCOOOI;
   private final Instant HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH;
   private final OwnedBadge.ExpirationReason CCHICRCORHHCRCICRRHHIRCOHRRRHO;
   private final boolean RHCIIRIROCOICHHIOHCCCIOIOOOORC;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      @NotNull RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Instant var2, Instant var3, OwnedBadge.ExpirationReason var4, boolean var5
   ) {
      this.IHOOCHICROHOCOCCHHOOCOHCRCCCIC = var1;
      this.IIRHRCICOCHOROCCIOOCOCIOCCOOOI = var2;
      this.HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH = var3;
      this.CCHICRCORHHCRCICRRHHIRCOHRRRHO = var4;
      this.RHCIIRIROCOICHHIOHCCCIOIOOOORC = var5;
   }

   private String OIOHRIHCIHHCOIRCCOIRIOOHOIOIOI() {
      IRRCCOICORICIHCHRHIHIHROIRHOCR var1 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CCHHHHCICRCCCIOOIOICOOCRCRHCCR();
      String var2;
      if (this.HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH.isBefore(Instant.now())) {
         int var3 = (int)((Instant.now().toEpochMilli() - this.HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH.toEpochMilli()) / 86400000L);
         var2 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.emotes", var3 > 1 ? "expired_plural" : "expired_singular", var3);
      } else {
         int var4 = (int)((this.HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH.toEpochMilli() - Instant.now().toEpochMilli()) / 86400000L);
         var2 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.emotes", var4 > 1 ? "expired_plural" : "expires_in_singular", var4);
      }

      return var2;
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.add("badge", this.IHOOCHICROHOCOCCHHOOCOHCRCCCIC.provide());
      if (this.HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH != null && this.HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH.toEpochMilli() > 0L) {
         var1.addProperty("expiresAt", this.HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH.toEpochMilli());
         var1.addProperty("expiresIn", this.OIOHRIHCIHHCOIRCCOIRIOOHOIOIOI());
      }

      if (this.IIRHRCICOCHOROCCIOOCOCIOCCOOOI != null) {
         LocalDateTime var2 = LocalDateTime.ofInstant(this.IIRHRCICOCHOROCCIOOCOCIOCCOOOI, ZoneId.systemDefault());
         var1.addProperty("grantedAt", this.IIRHRCICOCHOROCCIOOCOCIOCCOOOI.getEpochSecond());
         var1.addProperty("grantedAtReadable", var2.format(RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRHCIHHCCRCRCICIHHRORCCHROCORH));
      } else {
         var1.addProperty("grantedAt", 0);
         var1.addProperty("grantedAtReadable", "Unknown");
      }

      if (this.CCHICRCORHHCRCICRRHHIRCOHRRRHO != null) {
         var1.addProperty("expirationReason", this.CCHICRCORHHCRCICRRHHIRCOHRRRHO.name());
      }

      var1.addProperty("isLunarPlus", this.RHCIIRIROCOICHHIOHCCCIOIOOOORC);
      return var1;
   }

   public static Optional<IRCIIHHICIHRCOCRROCOICRIHHCCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OwnedBadge var0) {
      com.moonsworth.lunar.client.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HCOHROCRRIIHOORRCCROCROICRICIC()
         .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .get(var0.getBadgeId());
      return var1 == null
         ? Optional.empty()
         : Optional.of(
            new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1,
               CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getGrantedAt()),
               CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getExpiresAt()),
               var0.getExpirationReason(),
               var0.getIsLunarPlus()
            )
         );
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0
   ) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, null, null, null, false);
   }

   @NotNull
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOOHRRHORIORHRROHHROIRIOOCCOCH() {
      return this.IHOOCHICROHOCOCCHHOOCOHCRCCCIC;
   }

   public Instant IOOIIROIIOOICHOCICCICHHIHICIOO() {
      return this.IIRHRCICOCHOROCCIOOCOCIOCCOOOI;
   }

   public Instant ROIHICOCOIRORRORIHRIHRIOHRRHHC() {
      return this.HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH;
   }

   public OwnedBadge.ExpirationReason HROOCOCCRIOCRCCCROOOCHCHIIHHOR() {
      return this.CCHICRCORHHCRCICRRHHIRCOHRRRHO;
   }

   public boolean HIRROCORCHCHRORRHRIHCIHIHCCHIC() {
      return this.RHCIIRIROCOICHHIOHCCCIOIOOOORC;
   }
}
