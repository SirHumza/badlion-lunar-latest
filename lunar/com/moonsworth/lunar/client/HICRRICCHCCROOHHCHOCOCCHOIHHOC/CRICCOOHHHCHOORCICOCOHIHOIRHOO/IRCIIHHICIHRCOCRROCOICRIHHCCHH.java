package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.common.v1.UserSocialPlatform;
import com.lunarclient.websocket.socials.v1.LinkedSocial;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import java.util.List;
import javax.annotation.Nullable;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final String IIHIRRIIHICCHIOIORRHOOCOCOOORO;
   private final String IHRHHCOHCOHCHOIRCHHCRORCRIOHHI;
   private final UserSocialPlatform RRIHHHRIIOICHOOICCCOOCIOCRIOCC;
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COHRIHIHHRIHCOOHOHIORIRCOICHRH;
   @Nullable
   private LinkedSocial ROOHCHROCCRRIRIOHICCIHCHOHHCOH;
   private final List<Integer> CCORRCRHICHRICORROHIHOIOCOOORR;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1, String var2, UserSocialPlatform var3, com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
   ) {
      this(var1, var2, var3, var4, null);
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("platform", this.RRIHHHRIIOICHOOICCCOOCIOCRIOCC.name());
      var1.addProperty("name", this.IHRHHCOHCOHCHOIRCHHCRORCRIOHHI);
      var1.addProperty("icon", this.COHRIHIHHRIHCOOHOHIORIRCOICHRH.ordinal());
      if (this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH != null) {
         JsonObject var2 = new JsonObject();
         String var3 = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR(
            CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH.getLinkedAt())
         );
         var2.addProperty("linkedAt", var3);
         JsonObject var4 = new JsonObject();
         var4.addProperty("username", this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH.getSocial().getUsername());
         var4.addProperty("avatar", this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH.getSocial().getAvatar());
         var2.add("userSocial", var4);
         JsonObject var5 = new JsonObject();
         var5.addProperty("isMember", this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH.getCommunity().getIsMember());
         if (this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH.getCommunity().hasJoinedAt()) {
            String var6 = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR(
               CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH.getCommunity().getJoinedAt())
            );
            var5.addProperty("joinedAt", var6);
         }

         if (this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH.getCommunity().hasLeftAt()) {
            String var8 = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR(
               CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH.getCommunity().getLeftAt())
            );
            var5.addProperty("leftAt", var8);
         }

         var5.addProperty("hasFlair", this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH.getCommunity().getHasFlair());
         var2.add("community", var5);
         var1.add("linkedSocial", var2);
      }

      if (this.CCORRCRHICHRICORROHIHOIOCOOORR != null) {
         JsonArray var7 = new JsonArray();
         this.CCORRCRHICHRICORROHIHOIOCOOORR.forEach(var7::add);
         var1.add("cosmeticRewards", var7);
      }

      return var1;
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1,
      String var2,
      UserSocialPlatform var3,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4,
      List<Integer> var5
   ) {
      this.IIHIRRIIHICCHIOIORRHOOCOCOOORO = var1;
      this.IHRHHCOHCOHCHOIRCHHCRORCRIOHHI = var2;
      this.RRIHHHRIIOICHOOICCCOOCIOCRIOCC = var3;
      this.COHRIHIHHRIHCOOHOHIORIRCOICHRH = var4;
      this.CCORRCRHICHRICORROHIHOIOCOOORR = var5;
   }

   @Generated
   public String getId() {
      return this.IIHIRRIIHICCHIOIORRHOOCOCOOORO;
   }

   @Generated
   public String getName() {
      return this.IHRHHCOHCOHCHOIRCHHCRORCRIOHHI;
   }

   @Generated
   public UserSocialPlatform getPlatform() {
      return this.RRIHHHRIIOICHOOICCCOOCIOCRIOCC;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable LinkedSocial var1) {
      this.ROOHCHROCCRRIRIOHICCIHCHOHHCOH = var1;
   }
}
