package com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.websocket.friend.v1.FriendRequest;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import java.time.Instant;
import java.util.UUID;
import lombok.Generated;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final UUID uuid;
   private final String HOHHIHRHOHIIHRHCHHIRORRRCOIHCC;
   private Instant CHOIOCOIICHHRRIIRROOOHHHCHOCOR;
   private int HIIRCCHHCIHROHCRICCOCIHRRHCRIH;
   private int CICHIHIRRIRIICHCOCHIIOIIHRHROR;
   private com.moonsworth.lunar.client.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIROCOHOCRHOHCCRIHIRHOICHRIRIR;
   private String rank;

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("uuid", this.uuid.toString());
      var1.addProperty("username", this.HOHHIHRHOHIIHRHCHHIRORRRCOIHCC);
      if (this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR != null) {
         var1.add("badge", this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR.RHRRROIHCRIICHOORRIHCOCHCHCHCR());
      }

      if (this.rank != null) {
         var1.addProperty("rank", this.rank);
      }

      var1.addProperty("timeSent", RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR(this.CHOIOCOIICHHRRIIRROOOHHHCHOCOR));
      var1.addProperty("timeSentMs", this.CHOIOCOIICHHRRIIRROOOHHHCHOCOR.getEpochSecond() * 1000L);
      JsonObject var2 = new JsonObject();
      var2.addProperty("isLunarPlus", this.CICHIHIRRIRIICHCOCHIIOIIHRHROR != 0);
      var2.addProperty("plusColor", String.format("#%06X", 16777215 & this.CICHIHIRRIRIICHCOCHIIOIIHRHROR));
      var2.addProperty("logoColor", String.format("#%06X", 16777215 & this.HIIRCCHHCIHROHCRICCOCIHRRHCRIH));
      var1.add("lunarPlus", var2);
      return var1;
   }

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FriendRequest var0) {
      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
         CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getPlayer().getUuid()),
         var0.getPlayer().getUsername(),
         CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getSentAt()),
         var0.getPlayerLogoColor().getColor(),
         var0.getPlayerPlusColor().getColor(),
         var0.getPlayerBadgeId() > 0
            ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCOHROCRRIIHOORRCCROCROICRICIC()
               .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
               .get(var0.getPlayerBadgeId())
            : null,
         var0.getPlayerRankName()
      );
   }

   @Generated
   public UUID HRIOHCCIOOIORHRHCIRCRRIIOHCHHI() {
      return this.uuid;
   }

   @Generated
   public String getUsername() {
      return this.HOHHIHRHOHIIHRHCHHIRORRRCOIHCC;
   }

   @Generated
   public Instant HIRHRCRHCHCIICCIOOCROHOOIOIRHH() {
      return this.CHOIOCOIICHHRRIIRROOOHHHCHOCOR;
   }

   @Generated
   public int IIRORHHOIHCICOROIIIRRIHHRHIHOC() {
      return this.HIIRCCHHCIHROHCRICCOCIHRRHCRIH;
   }

   @Generated
   public int CIHCCOCICROCOOCOCCOCRHOCIHRCRO() {
      return this.CICHIHIRRIRIICHCOCHIIOIIHRHROR;
   }

   @Generated
   public com.moonsworth.lunar.client.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RROOHCOHROIIROCRCRICHOHHCCOOCR() {
      return this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR;
   }

   @Generated
   public String HOOOHCROCOIRIIRCIIICOCOHRRCOCR() {
      return this.rank;
   }

   @Generated
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      UUID var1,
      String var2,
      Instant var3,
      int var4,
      int var5,
      com.moonsworth.lunar.client.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6,
      String var7
   ) {
      this.uuid = var1;
      this.HOHHIHRHOHIIHRHCHHIRORRRCOIHCC = var2;
      this.CHOIOCOIICHHRRIIRROOOHHHCHOCOR = var3;
      this.HIIRCCHHCIHROHCRICCOCIHRRHCRIH = var4;
      this.CICHIHIRRIRIICHCOCHIIOIIHRHROR = var5;
      this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR = var6;
      this.rank = var7;
   }
}
