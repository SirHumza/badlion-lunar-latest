package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.gson.JsonArray;
import com.lunarclient.common.v1.UserSocialPlatform;
import com.lunarclient.websocket.socials.v1.LinkedSocial;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends HHCCIRHCCCIIRHCROHIORHIRHHIORH<UserSocialPlatform, IRCIIHHICIHRCOCRROCOICRIHHCCHH>
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH IRROIIIIIOIHCHOIOHHORRCCIOIIIC = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      this.RRIIRIHICIRHHCCRCHIHICOCRRORHI(false);
   }

   public void CCHHRHRHCRHIHIHRIOICROHCHIIIHI(List<LinkedSocial> var1) {
      for (LinkedSocial var3 : var1) {
         UserSocialPlatform var4 = var3.getSocial().getPlatform();
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().get(var4);
         if (var5 != null) {
            var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
         }
      }

      this.RRIIRIHICIRHHCCRCHIHICOCRRORHI(true);
   }

   public void RRCRHRRIRRORCOOCORCRRHOCHROIIH() {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().values()) {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null);
      }

      this.RRIIRIHICIRHHCCRCHIHICOCRRORHI(false);
   }

   @Override
   protected Map<UserSocialPlatform, IRCIIHHICIHRCOCRROCOICRIHHCCHH> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      LinkedHashMap var1 = new LinkedHashMap();
      var1.put(
         UserSocialPlatform.USER_SOCIAL_PLATFORM_TWITTER,
         new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "twitter",
            "X (Twitter)",
            UserSocialPlatform.USER_SOCIAL_PLATFORM_TWITTER,
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PI_XCOM_STROKE
         )
      );
      var1.put(
         UserSocialPlatform.USER_SOCIAL_PLATFORM_DISCORD,
         new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "discord",
            "Discord",
            UserSocialPlatform.USER_SOCIAL_PLATFORM_DISCORD,
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PI_DISCORD_STROKE,
            List.of(5596, 5594, 5650)
         )
      );
      var1.put(
         UserSocialPlatform.USER_SOCIAL_PLATFORM_TWITCH,
         new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "twitch",
            "Twitch",
            UserSocialPlatform.USER_SOCIAL_PLATFORM_TWITCH,
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PI_TWITCH_STROKE
         )
      );
      var1.put(
         UserSocialPlatform.USER_SOCIAL_PLATFORM_YOUTUBE,
         new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "youtube",
            "YouTube",
            UserSocialPlatform.USER_SOCIAL_PLATFORM_YOUTUBE,
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PI_YOUTUBE_STROKE
         )
      );
      return var1;
   }

   public JsonArray ORIICOHIHIOCRORCOCCIHIHCOIOCHH() {
      JsonArray var1 = new JsonArray();
      ArrayList var2 = new ArrayList<>(this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().values());
      var2.sort(Comparator.comparing(IRCIIHHICIHRCOCRROCOICRIHHCCHH::getName));

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : var2) {
         var1.add(var4.provide());
      }

      return var1;
   }

   public void RRIIRIHICIRHHCCRCHIHICOCRRORHI(boolean var1) {
      this.IRROIIIIIOIHCHOIOHHORRCCIOIIIC.IIHRRHORCRCROCHHOHORCHCROCIHRO("socials", this.ORIICOHIHIOCRORCOCCIHIHCOIOCHH());
      this.IRROIIIIIOIHCHOIOHHORRCCIOIIIC.IIHRRHORCRCROCHHOHORCHCROCIHRO("connected", var1);
   }

   @Generated
   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.IRROIIIIIOIHCHOIOHHORRCCIOIIIC;
   }
}
