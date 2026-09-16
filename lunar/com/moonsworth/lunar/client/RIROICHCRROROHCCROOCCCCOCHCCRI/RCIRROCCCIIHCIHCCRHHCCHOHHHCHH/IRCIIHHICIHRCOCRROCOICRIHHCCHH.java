package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.websocket.conversation.v1.ConversationParticipant;
import com.lunarclient.websocket.conversation.v1.ConversationSender;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final UUID HCCCOCCRCRHOIHHCICIHOHIIIIRCCO;
   private final String CHRCOOIHHIICHOHHICCCCCCCHHOHIR;
   private int HIIRCCHHCIHROHCRICCOCIHRRHCRIH;
   private int CICHIHIRRIRIICHCOCHIIOIIHRHROR;
   private String IIOOCIORCRORROIICOCIHIICOICOHI = "";
   private boolean HIOORICOCCIORRCCOHCHOHCHROHRCR;
   @Nullable
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIROCOHOCRHOHCCRIHIRHOICHRIRIR = null;

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationParticipant var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getPlayer().getUuid()),
         var0.getPlayer().getUsername(),
         var0.getLogoColor().getColor(),
         var0.getPlusColor().getColor(),
         var0.getRankName(),
         var0.getIsRadioPremium(),
         var0.getBadgeId() > 0
            ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCOHROCRRIIHOORRCCROCROICRICIC()
               .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
               .get(var0.getBadgeId())
            : null
      );
   }

   @Nullable
   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationSender var0) {
      return var0.getSenderCase() != ConversationSender.SenderCase.PLAYER
         ? null
         : new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getPlayer().getUuid()), var0.getPlayer().getUsername()
         );
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UuidAndUsername var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getUuid()), var0.getUsername());
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("uuid", this.HCCCOCCRCRHOIHHCICIHOHIIIIRCCO.toString());
      var1.addProperty("username", this.CHRCOOIHHIICHOHHICCCCCCCHHOHIR);
      JsonObject var2 = new JsonObject();
      var2.addProperty("isLunarPlus", this.CICHIHIRRIRIICHCOCHIIOIIHRHROR != 0);
      var2.addProperty("plusColor", String.format("#%06X", 16777215 & this.CICHIHIRRIRIICHCOCHIIOIIHRHROR));
      var2.addProperty("logoColor", String.format("#%06X", 16777215 & this.HIIRCCHHCIHROHCRICCOCIHRRHCRIH));
      var1.add("lunarPlus", var2);
      var1.addProperty("rankName", this.IIOOCIORCRORROIICOCIHIICOICOHI);
      var1.addProperty("radioPremium", this.HIOORICOCCIORRCCOHCHOHCHROHRCR);
      if (this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR != null) {
         var1.add("badge", this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR.provide());
      }

      return var1;
   }

   @Generated
   public UUID HRIOHCCIOOIORHRHCIRCRRIIOHCHHI() {
      return this.HCCCOCCRCRHOIHHCICIHOHIIIIRCCO;
   }

   @Generated
   public String getUsername() {
      return this.CHRCOOIHHIICHOHHICCCCCCCHHOHIR;
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
   public String getRankName() {
      return this.IIOOCIORCRORROIICOCIHIICOICOHI;
   }

   @Generated
   public boolean COHCRRCHRHHHOCCCIOCHORRHRHRIOR() {
      return this.HIOORICOCCIORRCCOHCHOHCHROHRCR;
   }

   @Nullable
   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RROOHCOHROIIROCRCRICHOHHCCOOCR() {
      return this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR;
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(UUID var1, String var2) {
      this.HCCCOCCRCRHOIHHCICIHOHIIIIRCCO = var1;
      this.CHRCOOIHHIICHOHHICCCCCCCHHOHIR = var2;
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(UUID var1, String var2, int var3, int var4, String var5, boolean var6, @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7) {
      this.HCCCOCCRCRHOIHHCICIHOHIIIIRCCO = var1;
      this.CHRCOOIHHIICHOHHICCCCCCCHHOHIR = var2;
      this.HIIRCCHHCIHROHCRICCOCIHRRHCRIH = var3;
      this.CICHIHIRRIRIICHCOCHIIOIIHRHROR = var4;
      this.IIOOCIORCRORROIICOCIHIICOICOHI = var5;
      this.HIOORICOCCIORRCCOHCHOHCHROHRCR = var6;
      this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR = var7;
   }
}
