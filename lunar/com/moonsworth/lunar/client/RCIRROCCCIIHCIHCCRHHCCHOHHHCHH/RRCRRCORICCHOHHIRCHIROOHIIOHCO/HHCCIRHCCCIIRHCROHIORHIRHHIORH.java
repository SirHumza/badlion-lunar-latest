package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonParseException;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.common.icon.CustomModelData;
import com.lunarclient.apollo.common.icon.ItemStackIcon;
import com.lunarclient.apollo.common.profile.Profile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.CCHHCIRHICHHHHRRIHIORCCORCCIHR;
import com.moonsworth.lunar.client.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final int OHIHRIIIOOHHHROCRCHIOIHHHRRIHC = 256;

   public static void IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Object var0) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Apollo", "Received invalid item stack from the server."
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("Apollo", "Item: " + var0);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            CORCOCICIRIOHROHROIIOOHICCHCRR.WARNING, "Apollo Item Stack Icon Error", "Received an unknown item. Check logs for more info."
         );
   }

   @Nullable
   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ItemStackIcon var0) {
      String var1 = var0.getItemName();
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 = var1 != null && !var1.isEmpty()
         ? CCHHCIRHICHHHHRRIHIORCCORCCIHR.IIHICIOCICHCOIOCHCIOOHHRHRHIRC(var1.toLowerCase())
         : CCHHCIRHICHHHHRRIHIORCCORCCIHR.HOCOORHIRORIRRICCRCIRCCRRHIORH(var0.getItemId());
      if (var2 != null) {
         int var3 = var0.getCustomModelData();
         CustomModelData var4 = var0.getCustomModelDataObject();
         if (var4 != null) {
            var2.bridge$setCustomModelData(var4.getFloats(), var4.getFlags(), var4.getStrings(), var4.getColors());
         } else if (var3 != 0) {
            var2.bridge$setCustomModelData(List.of(), List.of(), List.of(), List.of(var3));
         }

         Profile var5 = var0.getProfile();
         if (var5 != null && var2.bridge$getItem().bridge$isItemSkull()) {
            var2.bridge$setProfile(var5.getId(), var5.getTexture(), var5.getSignature());
         }

         String var6 = var0.getPotion();
         if (var6 != null && !var6.isEmpty()) {
            try {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCICHHOCCHOROIORCOHOHIRRHCIIOR()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var6);
            } catch (Exception var8) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "Apollo", "Ignored invalid potion '" + var6 + "': " + var8.getMessage()
               );
            }
         }

         return var2;
      } else {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1 != null && !var1.isEmpty() ? var1.toLowerCase(Locale.ENGLISH) : var0.getItemId());
         return null;
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Exception var0, String var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Apollo", "Received invalid resource location path from the server."
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("Apollo", "Location: " + var1);
      if (var0 != null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Apollo", "Parser error message: " + var0.getMessage()
         );
         var0.printStackTrace();
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            CORCOCICIRIOHROHROIIOOHICCHCRR.WARNING, "Apollo Resource Path Error", "Received an invalid resource location path. Check logs for more info."
         );
   }

   public static Component IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(String var0) {
      try {
         return ApolloComponent.fromJson(var0);
      } catch (JsonParseException var2) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var0);
         return null;
      }
   }

   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Exception var0, String var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Apollo", "Received invalid component packet from the server."
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("Apollo", "Payload: " + var1);
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Apollo", "Parser error message: " + var0.getMessage()
      );
      var0.printStackTrace();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            CORCOCICIRIOHROHROIIOOHICCHCRR.WARNING, "Apollo Component Error", "Received an invalid Component. Check logs for more info."
         );
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Exception var0, String var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Apollo", "Received invalid Apollo packet from the server."
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("Apollo", "Payload: " + var1);
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Apollo", "Parser error message: " + var0.getMessage()
      );
      var0.printStackTrace();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.WARNING, "Apollo Error", "Received an invalid Apollo packet. Check logs for more info.");
   }

   public static String RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC(String var0) {
      StringBuilder var1 = new StringBuilder(Math.min(var0.length(), 256));

      for (int var2 = 0; var2 < var0.length() && var1.length() < 256; var2++) {
         char var3 = var0.charAt(var2);
         if (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var3)) {
            var1.append(var3);
         }
      }

      return var1.toString();
   }

   public static URI ORICICIICROCRICRHRHHRCHHRCRHOR(String var0) {
      try {
         return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROCIHHOOOHCROIRIRCHRICCICOHRIR(var0);
      } catch (URISyntaxException var2) {
         CRRRICCRROCOHHOHIICIHORCOORRRH(var2, var0);
         return null;
      }
   }

   public static void CRRRICCRROCOHHOHIICIHORCOORRRH(Exception var0, String var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Apollo", "Received invalid url from the server."
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("Apollo", "URL: " + var1);
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Apollo", "Parser error message: " + var0.getMessage()
      );
      var0.printStackTrace();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.WARNING, "Apollo URL Error", "Received an invalid URL. Check logs for more info.");
   }

   @Generated
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
