package com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.websocket.hostedworld.v1.Joinability;
import com.lunarclient.websocket.hostedworld.v1.ListHostedWorldsResponse;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC CCRRCRIRHRRIHRIHHOHOOOOCCOOOIH = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19
      ? RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("textures/gui/sprites/server_list/join.png")
      : RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("textures/gui/server_selection.png");
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC IHOOIIIOCCOOHIIIIHHROCRHHOOIOO = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "textures/gui/sprites/server_list/join_highlighted.png"
   );
   private static final Map<UUID, RCIROOOOICRHCCRRCIORHHIRCOIIIC> RIOICROOIRCROHRHHOHCOOCOIIRHRR = new HashMap<>();

   @NotNull
   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC RRRHHIRORHCHHCOOCIHOICORHHCHHO(UUID var0) {
      if (!RIOICROOIRCROHRHHOHCOOCOIIRHRR.containsKey(var0)) {
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var1 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "hostedworlds/" + var0 + ".png");
         IHIRRIIORRHORHRORIHOROIRCORCOO var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               null,
               RIROICHCRROROHCCROOCCCCOCHCCRI.IICOOHORRRRHICOCRHCRCHCOHRHRHC() + "/face/" + var0.toString(),
               var1,
               RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "steve-bust.png")
            );
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$loadTexture(var1, var2);
         RIOICROOIRCROHRHHOHCOOCOIIRHRR.put(var0, var1);
         return var1;
      } else {
         return RIOICROOIRCROHRHHOHCOOCOIIRHRR.get(var0);
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ListHostedWorldsResponse.HostedWorld var0,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      boolean var8
   ) {
      UUID var9 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getHost().getUuid());
      var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(),
         Component.text(var0.getHost().getUsername() + "'s world"),
         var2 + 32 + 3,
         var3 + 1,
         16777215,
         false
      );
      if (var0.getJoinability() == Joinability.JOINABILITY_ALLOWED) {
         TextComponent var10 = (TextComponent)((TextComponent)((TextComponent)((TextComponent)Component.text(var0.getOnlinePlayers())
                     .color(NamedTextColor.GRAY))
                  .append(Component.text("/").color(NamedTextColor.DARK_GRAY)))
               .append(Component.text(var0.getMaxPlayers())))
            .color(NamedTextColor.GRAY);
         float var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$getStringWidth(var10);
         var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(), var10, (int)(var2 + var4 - var11 - 6.0F), var3 + 1, 8421504, false
         );
      } else {
         TextComponent var20;
         if (var0.getJoinability() == Joinability.JOINABILITY_WORLD_FULL) {
            var20 = (TextComponent)Component.text(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "worldFull")
               )
               .color(NamedTextColor.DARK_RED);
         } else if (var0.getJoinability() == Joinability.JOINABILITY_INCOMPATIBLE_MINECRAFT_VERSION) {
            String var22 = var0.getMinecraftVersion().getEnum();
            String var12 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.get(var22)
               .<String>map(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH::getDisplayName)
               .orElse("unknown");
            var20 = (TextComponent)Component.text(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "worldRequiresVersionShort", var12)
               )
               .color(NamedTextColor.DARK_RED);
         } else {
            var20 = (TextComponent)Component.text(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "worldUnrecognizedError")
               )
               .color(NamedTextColor.DARK_RED);
         }

         var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(),
            var20,
            (int)(var2 + var4 - IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$getStringWidth(var20) - 6.0F),
            var3 + 1,
            8421504,
            false
         );
      }

      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRRHHIRORHCHHCOOCIHOICORHHCHHO(var9), var2, var3, 32, 32, -1);
      int var21 = var2 + 36;

      for (int var23 = 0; var23 < Math.min(5, var0.getSamplePlayersList().size()); var23++) {
         UuidAndUsername var26 = var0.getSamplePlayersList().get(var23);
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RRRHHIRORHCHHCOOCIHOICORHHCHHO(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var26.getUuid())), var21, var3 + 12, 10, 10, -1
         );
         var21 += 13;
      }

      if (var0.getOnlinePlayers() > 5) {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(), "+" + (var0.getOnlinePlayers() - 5), var21, var3 + 13, 8421504, false
         );
      }

      var1.push();
      int var24;
      if (var0.hasLogoColor()) {
         var24 = var0.getLogoColor().getColor() | 0xFF000000;
      } else {
         var24 = -1;
      }

      float var27 = var2 - 18;
      float var13 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IOCCCRIHOCHRCHRHCRHROIRIRHHHIR(var3 + var5 / 2.0F - 6.0F);
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1, CORCOCICIRIOHROHROIIOOHICCHCRR.IHRROOHRHCRCOCRIHIORCOCOORRROC, var27, var13, 12.0F, 12.0F, var24
      );
      if (var0.getLunarPlusBoost()) {
         if (var0.hasPlusColor() && var0.getPlusColor().getColor() > 0) {
            var24 = var0.getPlusColor().getColor() | 0xFF000000;
         } else {
            var24 = -1;
         }

         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var1, CORCOCICIRIOHROHROIIOOHICCHCRR.IIIOCOHOOIRRRROCCHORHHICCIIRIH, var27 + 7.5F, var13 + 2.0F, 4.5F, 4.5F, var24
         );
      }

      var1.pop();
      int var14 = var6 - var2;
      int var15 = var7 - var3;
      if (var0.getLunarPlusBoost() && var14 >= -20 && var14 <= -4 && var15 >= var5 / 2 - 8 && var15 <= var5 / 2 + 8) {
         String var16 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "hostedWorldLunarPlusBoost");
         float var17 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.RORHCRCHOHHIRCCCICIIHIHCIORCHR().IOOOHRRHCHICHHHCRIRHIICORRCIRO(var16) + 8.0F;
         float var18 = var6 - 8 - var17;
         float var19 = var7 - 2;
         if (var18 < 0.0F) {
            var18 = var6 + 8;
         }

         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            var1, var18, var19, var17, CIOHHCORHRCCRICCCORIHCRHCCCRRR.OCOHICCCCIROOROOOIRHRRHICOIORC().getHeight() * 2 + 8, 5.0F, -805306368
         );
         CIOHHCORHRCCRICCCORIHCRHCCCRRR.RORHCRCHOHHIRCCCICIIHIHCIORCHR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var16, var18 + 4.0F, var19 + 2.0F, -268435457, false);
      }

      if (var8
         && var0.getJoinability() == Joinability.JOINABILITY_ALLOWED
         && !com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion()
            .equals(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORIIROOCCCIHOHRIRIICCRHOICROOC)) {
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3, var2 + 32, var3 + 32, -1601138544);
         if (var14 > 10 && var14 < 26) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19) {
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHOOIIIOCCOOHIIIIHHROCRHHOOIOO, var2, var3, 32, 32, -1);
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 17) {
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCRRCRIRHRRIHRIHHOHOOOOCCOOOIH, var2, var3, 0.0F, 32.0F, 32.0F, 32.0F, 256.0F, 256.0F, -1);
            } else {
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  var1, CCRRCRIRHRRIHRIHHOHOOOOCCOOOIH, var2 - 6, var3, 0.0F, 32.0F, 32.0F, 32.0F, 256.0F, 256.0F, 16777215
               );
            }
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCRRCRIRHRRIHRIHHOHOOOOCCOOOIH, var2, var3, 32, 32, -1);
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 17) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCRRCRIRHRRIHRIHHOHOOOOCCOOOIH, var2, var3, 0.0F, 0.0F, 32.0F, 32.0F, 256.0F, 256.0F, -1);
         } else {
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH(
               var1, CCRRCRIRHRRIHRIHHOHOOOOCCOOOIH, var2 - 6, var3, 0.0F, 0.0F, 32.0F, 32.0F, 256.0F, 256.0F, 16777215
            );
         }
      }
   }
}
