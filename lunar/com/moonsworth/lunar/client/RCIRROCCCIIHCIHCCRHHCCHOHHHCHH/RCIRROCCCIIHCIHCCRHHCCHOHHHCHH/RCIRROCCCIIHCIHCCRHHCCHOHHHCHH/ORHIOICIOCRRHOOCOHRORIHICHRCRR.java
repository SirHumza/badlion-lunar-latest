package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.stopwatch.v1.AddStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.AddTimerMessage;
import com.lunarclient.apollo.stopwatch.v1.RemoveStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.RemoveTimerMessage;
import com.lunarclient.apollo.stopwatch.v1.ResetStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.ResetStopwatchesMessage;
import com.lunarclient.apollo.stopwatch.v1.ResetTimerMessage;
import com.lunarclient.apollo.stopwatch.v1.ResetTimersMessage;
import com.lunarclient.apollo.stopwatch.v1.StartStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.StartTimerMessage;
import com.lunarclient.apollo.stopwatch.v1.StopStopwatchMessage;
import com.lunarclient.apollo.stopwatch.v1.StopTimerMessage;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ORHIOICIOCRRHOOCOHRORIHICHRCRR
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final String CIROHCOOIHHCCRHCOOHOIIOIHHOROI = "STOPWATCH_APOLLO";
   private final Map<String, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RHIORRCOCIORHOIRCOIRCIOOHHIRII = new LinkedHashMap<>();
   private final Map<String, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> OCHRCOIICROHCHIROCOCORROHOIROC = new LinkedHashMap<>();

   public ORHIOICIOCRRHOOCOHRORIHICHRCRR() {
      super("stopwatch", "Stopwatch");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(
         AddStopwatchMessage.class,
         RemoveStopwatchMessage.class,
         StartStopwatchMessage.class,
         StopStopwatchMessage.class,
         ResetStopwatchMessage.class,
         ResetStopwatchesMessage.class,
         AddTimerMessage.class,
         RemoveTimerMessage.class,
         StartTimerMessage.class,
         StopTimerMessage.class,
         ResetTimerMessage.class,
         ResetTimersMessage.class
      );
   }

   @Override
   protected void onEnable() {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OCIOOHOOHICIIHOOHCHOIHHIOHIHOC()
         .IHIRRIIORRHORHRORIHOROIRCORCOO(this::CHRORHRHOOCCHHCCCOROHHORRIRHRO);
   }

   @Override
   protected void onDisable() {
      this.CHRIRIHHIOIHHIOHRCOCCIICICCIIC();
      this.CIHOHCROHHHORHHCHRORHHCHRHOOCH();
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OCIOOHOOHICIIHOOHCHOIHHIOHIHOC()
         .IHIRRIIORRHORHRORIHOROIRCORCOO(null);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         AddStopwatchMessage.class,
         var1x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1x.getId(),
            var1x.getName(),
            var1x.getResetOnStart(),
            var1x.getDisplayFormat().isEmpty() ? null : var1x.getDisplayFormat(),
            var1x.hasTextColor() ? var1x.getTextColor().getColor() : null,
            var1x.getPreventModification(),
            var1x.getHideWhenStopped(),
            var1x.hasHudPosition() ? var1x.getHudPosition().getX() : null,
            var1x.hasHudPosition() ? var1x.getHudPosition().getY() : null
         )
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RemoveStopwatchMessage.class, var1x -> this.COOOIIOHIRCRCHIHRHHICOOHIOORRR(var1x.getId()));
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StartStopwatchMessage.class, var1x -> {
         String var2 = var1x.getId();
         if (var2.isEmpty()) {
            this.HOHOICCIHCHHOCRCIRRHRROCRCCRCH();
         } else {
            this.ROIHROCROORRCCOIRRIHHORCROOORO(var2);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StopStopwatchMessage.class, var1x -> {
         String var2 = var1x.getId();
         if (var2.isEmpty()) {
            this.RRIHOCROCOOIIIOIRRHOICICHRHHRC();
         } else {
            this.OHHHIRCIIIRRCORHHRICIRCOORORCH(var2);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetStopwatchMessage.class, var1x -> {
         String var2 = var1x.getId();
         if (var2.isEmpty()) {
            this.IIOIIRRHOIHRRORHCROICRRRHIHOCO();
         } else {
            this.RHCICHRICRIIIHRRCICHOOOIOOOICH(var2);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetStopwatchesMessage.class, var1x -> this.CHRIRIHHIOIHHIOHRCOCCIICICCIIC());
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         AddTimerMessage.class,
         var1x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1x.getId(),
            var1x.getName(),
            NetworkTypes.fromProtobuf(var1x.getDuration()),
            var1x.getLoop(),
            var1x.getDisplayFormat().isEmpty() ? null : var1x.getDisplayFormat(),
            this.CIHHIHOORIIHCOORRRICHHCCRRRCHO(var1x.getTitleTextAdventureJsonLines()),
            var1x.getInGameNotification(),
            var1x.hasTextColor() ? var1x.getTextColor().getColor() : null,
            var1x.getPreventModification(),
            var1x.getHideWhenStopped(),
            var1x.hasHudPosition() ? var1x.getHudPosition().getX() : null,
            var1x.hasHudPosition() ? var1x.getHudPosition().getY() : null
         )
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RemoveTimerMessage.class, var1x -> this.HIORIIIIOCCCRCHCOROROCCOIOOIIR(var1x.getId()));
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StartTimerMessage.class, var1x -> this.RHCHHROCORIHCIORRRIIOHIRHCRIOH(var1x.getId()));
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StopTimerMessage.class, var1x -> this.OOOOCHIHOOCHCCIHHRRICIRIOHOCRO(var1x.getId()));
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetTimerMessage.class, var1x -> this.RCCICOCCCHROHOCCHIHORIHHCOHOHH(var1x.getId()));
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetTimersMessage.class, var1x -> this.CIHOHCROHHHORHHCHRORHHCHRHOOCH());
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @NotNull String var1,
      @NotNull String var2,
      boolean var3,
      @Nullable String var4,
      @Nullable Integer var5,
      boolean var6,
      boolean var7,
      @Nullable Float var8,
      @Nullable Float var9
   ) {
      if (!this.RHIORRCOCIORHOIRCOIRCIOOHHIRII.containsKey(var1)) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OCIOOHOOHICIIHOOHCHOIHHIOHIHOC();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var11 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var10, true, false, true, "APOLLO_STOPWATCH_" + var1
         );
         var11.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var4, var6, var7);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var5);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var8, var9);
         this.RHIORRCOCIORHOIRCOIRCIOOHHIRII.put(var1, var11);
         var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11);
      }
   }

   private void COOOIIOHIRCRCHIHRHHICOOHIOORRR(String var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.RHIORRCOCIORHOIRCOIRCIOOHHIRII
         .remove(var1);
      if (var2 != null) {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OCIOOHOOHICIIHOOHCHOIHHIOHIHOC()
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
      }
   }

   private void CHRIRIHHIOIHHIOHRCOCCIICICCIIC() {
      new ArrayList<>(this.RHIORRCOCIORHOIRCOIRCIOOHHIRII.keySet()).forEach(this::COOOIIOHIRCRCHIHRHHICOOHIOORRR);
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1,
      Consumer<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var2
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.RHIORRCOCIORHOIRCOIRCIOOHHIRII
         .get(var1);
      if (var3 != null) {
         var2.accept(var3);
      }
   }

   private void ROIHROCROORRCCOIRRIHHORCROOORO(String var1) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::CCOCCCCOIHIIRICCHORCCOCRRRRHCR
      );
   }

   private void OHHHIRCIIIRRCORHHRICIRCOORORCH(String var1) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::RCIOOOCIROHHHCIIIIIOICIRHRHCHO
      );
   }

   private void RHCICHRICRIIIHRRCICHOOOIOOOICH(String var1) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::IRIROOCHROICIRCRHHCOOIHCOIRCRH
      );
   }

   private void HOHOICCIHCHHOCRCIRRHRROCRCCRCH() {
      this.COOOROIICHHICCCHCCIOIRRRRIIORO();
      this.ROIHROCROORRCCOIRRIHHORCROOORO("STOPWATCH_APOLLO");
   }

   private void RRIHOCROCOOIIIOIRRHOICICHRHHRC() {
      this.COOOROIICHHICCCHCCIOIRRRRIIORO();
      this.OHHHIRCIIIRRCORHHRICIRCOORORCH("STOPWATCH_APOLLO");
   }

   private void IIOIIRRHOIHRRORHCROICRRRHIHOCO() {
      this.COOOROIICHHICCCHCCIOIRRRRIIORO();
      this.RHCICHRICRIIIHRRCICHOOOIOOOICH("STOPWATCH_APOLLO");
   }

   private void COOOROIICHHICCCHCCIOIRRRRIIORO() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("STOPWATCH_APOLLO", "Server Stopwatch", true, null, null, false, false, null, null);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull Duration var3,
      boolean var4,
      @Nullable String var5,
      @Nullable String var6,
      boolean var7,
      @Nullable Integer var8,
      boolean var9,
      boolean var10,
      @Nullable Float var11,
      @Nullable Float var12
   ) {
      if (!this.OCHRCOIICROHCHIROCOCORROHOIROC.containsKey(var1)) {
         long var13 = var3.getSeconds();
         int var15 = (int)Math.min(var13 / 3600L, 23L);
         int var16 = (int)Math.min(var13 % 3600L / 60L, 59L);
         int var17 = (int)(var13 % 60L);
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var18 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OCIOOHOOHICIIHOOHCHOIHHIOHIHOC();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var19 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var18, true, false, true, "APOLLO_TIMER_" + var1
         );
         var19.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var15, var16, var17, var4, var5, var6, var7, var9, var10);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var19, var8);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var19, var11, var12);
         this.OCHRCOIICROHCHIROCOCORROHOIROC.put(var1, var19);
         var18.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var19);
      }
   }

   private void HIORIIIIOCCCRCHCOROROCCOIOOIIR(String var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.OCHRCOIICROHCHIROCOCORROHOIROC
         .remove(var1);
      if (var2 != null) {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OCIOOHOOHICIIHOOHCHOIHHIOHIHOC()
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
      }
   }

   private void CIHOHCROHHHORHHCHRORHHCHRHOOCH() {
      new ArrayList<>(this.OCHRCOIICROHCHIROCOCORROHOIROC.keySet()).forEach(this::HIORIIIIOCCCRCHCOROROCCOIOOIIR);
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      String var1,
      Consumer<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var2
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.OCHRCOIICROHCHIROCOCORROHOIROC
         .get(var1);
      if (var3 != null) {
         var2.accept(var3);
      }
   }

   private void RHCHHROCORIHCIORRRIIOHIRHCRIOH(String var1) {
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var1,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH::HCIRHIORRHORHIHHORCICRROORHIHO
      );
   }

   private void OOOOCHIHOOCHCCIHHRRICIRIOHOCRO(String var1) {
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var1,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH::COORHORCHORIOCOOCCIRICHRRIHCCR
      );
   }

   private void RCCICOCCCHROHOCCHIHORIHHCOHOHH(String var1) {
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var1,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH::ICHIHCCCOICHRHIORROCCORRRIHCRH
      );
   }

   private void CHRORHRHOOCCHHCCCOROHHORRIRHRO() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCRHOICIRORRHOOOCIHHHHCHCICHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OCIOOHOOHICIIHOOHCHOIHHIOHIHOC();
      this.RHIORRCOCIORHOIRCOIRCIOOHHIRII.values().forEach(var1::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.OCHRCOIICROHCHIROCOCORROHOIROC.values().forEach(var1::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
   }

   @Nullable
   private String CIHHIHOORIIHCOORRRICHHCCRRRCHO(String var1) {
      if (var1.isEmpty()) {
         return null;
      }

      Component var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(
         var1
      );
      return var2 == null
         ? null
         : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(var2);
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, @Nullable Integer var1
   ) {
      if (var1 != null) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = var0.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO
         );
         if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var3) {
            var3.RRHRHHRRROOHIHRCOHOOOIROROHIOO().OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1);
         }
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, @Nullable Float var1, @Nullable Float var2
   ) {
      if (var1 != null || var2 != null) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3 = var0.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO
         );
         if (var3 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4) {
            var4.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1 != null ? var1 : var4.getX(), var2 != null ? var2 : var4.getY());
         }
      }
   }
}
