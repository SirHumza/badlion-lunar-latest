package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   ADVENT("Advent", false),
   ANNIVERSARY_PARTICLES("anniversaryParticles", true, var0 -> {
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IHHIHCIHHHCORHHHOIOOOCHOOIIRRH();
      if (var1 != null) {
         var1.ICHROOHHHCHORIIOHIOHRIHIIHCIOO();
      }
   }),
   APRIL_FOOLS_ENTITIES("aprilFoolsEntities", true, var0 -> {
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IHHIHCIHHHCORHHHOIOOOCHOOIIRRH();
      if (var1 != null) {
         var1.ICHROOHHHCHORIIOHIOHRIHIIHCIOO();
      }
   }),
   APRIL_FOOLS_MAIN_MENU("aprilFoolsMainMenu", true),
   DEV_TOOLS("devTools", false),
   DISCORD_CTA("DiscordCTA", false),
   GAME_PROMOTION_CTA(
      "GamePromotionCTA",
      false,
      var0 -> {
         if (var0) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC()
               .ifPresent(com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::IOCICIROOCIOOCHRIHCHOHRHHRIRHH);
         }
      }
   ),
   IGNORE_EXTERNAL_THREAD_BETA("ignoreExternalThreadBeta", true),
   LIVE_EXPERIENCE("LiveExperience", true),
   MEMORY_SAVINGS_DISABLED("MemorySavings", false),
   MOD_METADATA("ModMetadata", false),
   PENDING_REWARDS("PendingRewards", false),
   SENTRY_ACCOUNT_LOGIN_TRACING("SentryAccountLoginTracing", false),
   SENTRY_OPTION_PARSING("SentryOptionParsing", false),
   SENTRY_TRACE_SAMPLING("SentryTraceSampling", false),
   SHOW_OPTIFINE_CAPES("showOptifineCapes", true),
   THROW_ON_WRONG_THREAD_BETA("throwOnWrongThreadBeta", true),
   THROW_ON_WRONG_THREAD_DEV("throwOnWrongThreadDev", false),
   TRAILER("Trailer", false),
   TURBO_ENGINE(
      "TurboEngine",
      false,
      var0 -> {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 8) {
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HRRCCIHOOORRIHCCRORRCRHRIICRRH();
            if (var1 != null) {
               var1.setEnabled(var0);
            }
         }
      }
   ),
   REWIND("Rewind", false),
   TURBO_ENTITIES(
      "TurboEntities",
      false,
      var0 -> {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 8) {
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HRRCCIHOOORRIHCCRORRCRHRIICRRH();
            if (var1 != null) {
               var1.IRHOOCHROIOHRROIOIIIHORCICOOCH(true);
            }
         }
      }
   ),
   TURBO_BLOCK_ENTITIES(
      "TurboBlockEntities",
      false,
      var0 -> {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 8) {
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HRRCCIHOOORRIHCCRORRCRHRIICRRH();
            if (var1 != null) {
               var1.RCIICICHIIRIIRHHROCOOOHRROOIIC(true);
            }
         }
      }
   ),
   WRAPPED("Wrapped", false),
   YOUTOOZ("YouTooz", false);

   private final String identifier;
   @Nullable
   private final BooleanConsumer dynamicReset;
   private boolean value;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, boolean var4) {
      this(var3, var4, null);
   }

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, boolean var4, @Nullable BooleanConsumer var5) {
      this.identifier = var3;
      this.dynamicReset = var5;
      this.value = var4;
   }

   public boolean isEnabled() {
      return this.value;
   }

   @Generated
   public String getIdentifier() {
      return this.identifier;
   }

   @Nullable
   @Generated
   public BooleanConsumer getDynamicReset() {
      return this.dynamicReset;
   }

   @Generated
   public void setValue(boolean var1) {
      this.value = var1;
   }
}
