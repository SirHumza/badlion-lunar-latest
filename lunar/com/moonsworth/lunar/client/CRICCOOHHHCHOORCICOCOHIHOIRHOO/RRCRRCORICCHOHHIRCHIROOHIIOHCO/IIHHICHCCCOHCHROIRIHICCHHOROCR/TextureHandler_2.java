package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR;

import com.lunarclient.common.v1.LunarClientVersion;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.websocket.screenshot.v1.ExtraScreenshotData;
import com.lunarclient.websocket.screenshot.v1.Perspective;
import com.lunarclient.websocket.screenshot.v1.PlayerState;
import com.lunarclient.websocket.screenshot.v1.ScreenshotMessage;
import com.lunarclient.websocket.screenshot.v1.ScreenshotPlayer;
import com.lunarclient.websocket.screenshot.v1.Weather;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHICORCROOROHCIHIHCOIHRRHICICO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.Map.Entry;
import mchorse.emoticons.capabilities.cosmetic.EmoteController;

public record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   private final UUID HICCOHOHROICIOHRHIOCHICCROCHRR;
   private final ScreenshotMessage OIICRIRHIRRROCIIRROHRIIRHRRRRR;
   private final ExtraScreenshotData OOORIHHHIORCRHCIORCRIIRHHCRHCO;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(UUID var1, ScreenshotMessage var2, ExtraScreenshotData var3) {
      this.HICCOHOHROICIOHRHIOCHICCROCHRR = var1;
      this.OIICRIRHIRRROCIIRROHRIIRHRRRRR = var2;
      this.OOORIHHHIORCRHCIORCRIIRHHCRHCO = var3;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH IOHIRRHCOICRCRROCCOOHIOICCCICO() {
      ExtraScreenshotData var0 = ExtraScreenshotData.newBuilder()
         .setMcVersion(
            MinecraftVersion.newBuilder()
               .setEnum(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().getId())
         )
         .setLunarVersion(
            LunarClientVersion.newBuilder()
               .setGitBranch(com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRIIICIRRIIRICRRORCCRCOHIHIO)
               .setGitCommit(com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCICHOOCICHRIIIHHROHCRHHROOHIO)
               .setSemver(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CROIHRIIRROCHORIIRIOCROOORRCCH())
         )
         .setLocation(com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HORCOHHRCCOICRCIOHHRRHHCRHCCOR())
         .build();
      UUID var1 = UUID.randomUUID();
      IHICORCROOROHCIHIHCOIHRRHICICO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession();
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .RROHIIOHORHICRHIHCCRRRHIHCHRCC();
      ScreenshotMessage.Builder var4 = ScreenshotMessage.newBuilder()
         .setAuthor(
            UuidAndUsername.newBuilder()
               .setUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var3 == null ? new UUID(0L, 0L) : var3.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI()))
               .setUsername(var2 == null ? "unknown" : var2.bridge$getUsername())
         )
         .setPerspective(
            RRCIRIHRCIOOICCCHOIHOCIRCHHIII(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$getThirdPersonView())
         )
         .setHasHud(!IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$isHideGui());
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
      if (var6 != null && var5 != null) {
         var4.addAllStates(IIHRRHORCRCROCHHOHORCHCROCIHRO(var6))
            .setLocalId(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1))
            .setYaw(var6.bridge$getRotationYawHead())
            .setPitch((float)var6.bridge$getRotationPitch())
            .setHealth(var6.bridge$getHealth())
            .setMaxHealth(var6.bridge$getMaxHealth())
            .setFoodLevel(var6.bridge$getFoodStats().bridge$getFoodLevel())
            .setSaturationLevel(var6.bridge$getFoodStats().bridge$getSaturationLevel());
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IIRIRICCICRCRHRIRHOOIIHOOHOCRH()
            .RCORHCHORIHRCIHHCHHOOHIHCRHORR()
            .get()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.fromBiomeBridgeOrNull(
               var6.RRIOHRHHRHORRROIIRHRHROICRHCRO()
            );
            if (var7 != null) {
               var4.setBiome("minecraft:" + var7.getResourceLocation());
            } else {
               var4.setBiome(var6.RRIOHRHHRHORRROIIRHRHROICRHCRO().bridge$getBiomeName());
            }

            ArrayList var8 = new ArrayList();

            for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var10 : var5.bridge$getPlayerEntities()) {
               if (var6 == var10) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$getThirdPersonView() != 0) {
                     var8.add(HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var10));
                  }
               } else if (var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10) <= 100.0
                  && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$getLevelRenderer()
                     .bridge$isVisible(var10.bridge$getBoundingBoxForCulling())) {
                  var8.add(HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var10));
               }
            }

            var4.addAllPlayers(var8)
               .setDimension(var5.bridge$getDimensionKey())
               .setPos(Vector3f.newBuilder().setX((float)var6.bridge$getPosX()).setY((float)var6.bridge$getPosY()).setZ((float)var6.bridge$getPosZ()))
               .setDayTime(var5.bridge$getDayTime())
               .setWeather(
                  var5.bridge$isThundering()
                     ? Weather.WEATHER_THUNDER
                     : (
                        var5.bridge$isRaining()
                           ? (var5.bridge$isSnowing(var6.bridge$getBlockPos()) ? Weather.WEATHER_SNOW : Weather.WEATHER_RAIN)
                           : Weather.WEATHER_CLEAR
                     )
               );
         }
      } else {
         var4.setBiome("unknown")
            .addAllPlayers(List.of())
            .setDimension("unknown")
            .setYaw(0.0F)
            .setPitch(0.0F)
            .setPos(Vector3f.newBuilder().build())
            .setDayTime(0L)
            .setWeather(Weather.WEATHER_UNSPECIFIED);
      }

      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var4.build(), var0);
   }

   private static Perspective RRCIRIHRCIOOICCCHOIHOCIRCHHIII(int var0) {
      return switch (var0) {
         case 0 -> Perspective.PERSPECTIVE_FIRST;
         case 1 -> Perspective.PERSPECTIVE_BACK;
         case 2 -> Perspective.PERSPECTIVE_FRONT;
         default -> Perspective.PERSPECTIVE_UNSPECIFIED;
      };
   }

   private static ScreenshotPlayer HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
   ) {
      ScreenshotPlayer.Builder var1 = ScreenshotPlayer.newBuilder()
         .setPlayer(
            UuidAndUsername.newBuilder()
               .setUsername(var0.bridge$getName())
               .setUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var0.bridge$getUniqueID()))
         )
         .addAllStates(IIHRRHORCRCROCHHOHORCHCROCIHRO(var0))
         .addAllCosmetics(OCOHORHCROHICRRIHCIHHRRCIHICRI(var0));
      CIOHHCORHRCCRICCCORIHCRHCCCRRR(var0).ifPresent(var1::setEmote);
      return var1.build();
   }

   private static List<PlayerState> IIHRRHORCRCROCHHOHORCHCROCIHRO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
   ) {
      if (var0.bridge$isSleeping()) {
         return List.of(PlayerState.PLAYER_STATE_SLEEPING);
      }

      if (var0.bridge$isElytraFlying()) {
         return List.of(PlayerState.PLAYER_STATE_ELYTRA_FLYING);
      }

      ArrayList var1 = new ArrayList();
      if (var0.bridge$isFlying()) {
         var1.add(PlayerState.PLAYER_STATE_FLYING);
      } else if (var0.bridge$isSprinting()) {
         var1.add(PlayerState.PLAYER_STATE_SPRINTING);
      } else if (var0.bridge$isVisiblyCrouching()) {
         var1.add(PlayerState.PLAYER_STATE_SNEAKING);
      } else if (var0.bridge$isSwimming()) {
         var1.add(PlayerState.PLAYER_STATE_SWIMMING);
      }

      if (var0.bridge$isRiding()) {
         var1.add(PlayerState.PLAYER_STATE_RIDING);
      }

      if (var0.bridge$isJumping()) {
         var1.add(PlayerState.PLAYER_STATE_JUMPING);
      } else if (var0.bridge$getFallDistance() > 1.0) {
         var1.add(PlayerState.PLAYER_STATE_FALLING);
      }

      if (var1.isEmpty()) {
         if (var0.COORRHHRIRHRHIHHICCHIORCHOOCOI() > 0.25) {
            var1.add(PlayerState.PLAYER_STATE_WALKING);
         } else {
            var1.add(PlayerState.PLAYER_STATE_STANDING);
         }
      }

      return var1;
   }

   private static IntArrayList OCOHORHCROHICRRIHCIHHRRCIHICRI(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
   ) {
      List var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HCCICHCRRIICICCHCIRCRRIIRROHHC()
         .HRHIHIRHRCHHRORRRCORHOCIRHRIOR(var0.bridge$getUniqueID());
      if (var1 == null) {
         return new IntArrayList(0);
      }

      IntArrayList var2 = new IntArrayList(var1.size());

      for (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 : var1) {
         var2.add((int)var4.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().RCOCIIHHOIHOOCCCIICCRHHRRCCCCH());
      }

      return var2;
   }

   private static OptionalInt CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
   ) {
      EmoteController var1 = (EmoteController)EmoteController.get(var0);
      if (var1 != null && var1.emote != null) {
         String var2 = var1.emote.name;

         for (Entry var4 : IIHRRHORCRCROCHHOHORCHCROCIHRO.IOCICHRIHOHOHRRHIRIHHCROCCOCIR.entrySet()) {
            if (((com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH)var4.getValue()).getId().equals(var2)) {
               return OptionalInt.of((Integer)var4.getKey());
            }
         }
      }

      return OptionalInt.empty();
   }

   public UUID OOOHCORCRRORIIROHOORRRHIIRIIRI() {
      return this.HICCOHOHROICIOHRHIOCHICCROCHRR;
   }

   public ScreenshotMessage RROOCOIRHRROCRORICROIHRRCCROOR() {
      return this.OIICRIRHIRRROCIIRROHRIIRHRRRRR;
   }

   public ExtraScreenshotData OORIRRRCROHOCIIHCIICRIROHHRHIO() {
      return this.OOORIHHHIORCRHCIORCRIIRHHCRHCO;
   }
}
