package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.lang.management.BufferPoolMXBean;
import java.lang.management.ManagementFactory;
import java.util.Optional;
import lombok.Generated;
import org.apache.commons.lang3.mutable.MutableInt;

public class IHCRORHRORIICHRHRCHRRIRRHHOCOO
   implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI,
   com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static final int RHROOOHCICRHIROORHRCOIROHHHHRR = 8;
   private static final int IHOIIIHRHOCHIIRRCICCHRIIRCOIHI = 300;
   private static final int IHOCCRRCCCRCHRICHCRCIHCCHRCCCH = 30;
   private static final int ROHCHCOICCHOCCCCIHCCCCORHIIOOH = Math.max(0, 270);
   private static final BufferPoolMXBean CROCIIOIICRIIIORRROOIHHHICHCCH = HHCICHIOIOORIIIRCOHCIRCHIRORCR();
   private final IntArrayList IHCCOHOHRHCIIOOIOOROOORCRCCRHR = new IntArrayList();
   private int OCHHIRIOOOIOCORIROOHRROICHIRRH;
   private int ROIRHOOIRRCHHROHIRRIRORHOOCCRI;
   private int COOCRCHRRIHCCICORHOOOCHOCCRIOC;
   private int ROHIRCOCOOIRCRHORIOOHRORORROOH = 0;

   public IHCRORHRORIICHRHRCHRRIRRHHOCOO() {
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         var1 -> this.CCOHHIIROIIRRIRHHICIIIRHCHCORC()
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
         var1 -> {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
            if (var2.bridge$getWorld() == null) {
               this.ROHIRCOCOOIRCRHORIOOHRORORROOH = 0;
            } else {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = var2.bridge$getCurrentScreen();
               if (!var2.bridge$isWindowFocused()
                  || var2.bridge$isGamePaused()
                  || var3 != null
                     && !(
                        var3 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI
                     )
                  || var2.bridge$isFpsLimited()) {
                  if (this.ROHIRCOCOOIRCRHORIOOHRORORROOH >= ROHCHCOICCHOCCCCIHCCCCORHIIOOH) {
                     this.ROHIRCOCOOIRCRHORIOOHRORORROOH = ROHCHCOICCHOCCCCIHCCCCORHIIOOH;
                  } else {
                     this.ROHIRCOCOOIRCRHORIOOHRORORROOH++;
                  }

                  this.IHCCOHOHRHCIIOOIOOROOORCRCCRHR.clear();
                  return;
               }

               if (this.ROHIRCOCOOIRCRHORIOOHRORORROOH == 299) {
                  var2.bridge$enableGpuProfiling();
               } else if (this.ROHIRCOCOOIRCRHORIOOHRORORROOH >= 300) {
                  this.ROHIRCOCOOIRCRHORIOOHRORORROOH = 0;
                  if (!this.IHCCOHOHRHCIIOOIOOROOORCRCCRHR.isEmpty()) {
                     this.CHRCIHIHRIRIOHORIROCORHIOCIIRI();
                  }

                  this.IHCCOHOHRHCIIOOIOOROOORCRCCRHR.clear();
                  var2.bridge$disableGpuProfiling();
                  return;
               }

               this.ROHIRCOCOOIRCRHORIOOHRORORROOH++;
               this.IHCCOHOHRHCIIOOIOOROOORCRCCRHR.add(var2.bridge$getDebugFPS());
            }
         }
      );
   }

   public void CCOHHIIROIIRRIRHHICIIIRHCHCORC() {
      this.OCHHIRIOOOIOCORIROOHRROICHIRRH = 0;
      this.ROIRHOOIRRCHHROHIRRIRORHOOCCRI = 0;
      this.COOCRCHRRIHCCICORHOOOCHOCCRIOC = 0;
   }

   public void IHOOOIHCCOOOOIIIOIORRCOCRHCHII() {
      this.OCHHIRIOOOIOCORIROOHRROICHIRRH++;
   }

   public void OCOICIIRROOCRICRCRRHROOICICRCO() {
      this.ROIRHOOIRRCHHROHIRRIRORHOOCCRI++;
   }

   public void RIIIHOOOOOOCHRHCHOCOCRRCRRIRIO() {
      this.COOCRCHRRIHCCICORHOOOCHOCCRIOC++;
   }

   public void CHRCIHIHRIRIOHORIROCORHIOCIIRI() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(var1 -> var1.HHHROIRRRRCHCHROHCORIIOHOIIOCC().recordPerfSnapshot(null, this.IRIIOIIRCHOCRIRRROCOOCICHIHRHH(), var0 -> {}));
   }

   private RecordPerfSnapshotRequest IRIIOIIRCHOCRIRRROCOOCICHIHRHH() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      double var2 = 0.0;
      int var4 = 0;
      int var5 = Integer.MAX_VALUE;
      IntListIterator var6 = this.IHCCOHOHRHCIIOOIOOROOORCRCCRHR.iterator();

      while (var6.hasNext()) {
         int var7 = (Integer)var6.next();
         var2 += var7;
         if (var7 < var5) {
            var5 = var7;
         }

         if (var7 > var4) {
            var4 = var7;
         }
      }

      var2 /= this.IHCCOHOHRHCIIOOIOOROOORCRCCRHR.size();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var13 = var1.bridge$getLevelRenderer();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = var1.bridge$getGameSettings();
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var8 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OCROCOHRIHRIRHRROHRRCHCORRCCHH();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var9 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      RecordPerfSnapshotRequest.Builder var10 = RecordPerfSnapshotRequest.newBuilder()
         .setFps(var1.bridge$getDebugFPS())
         .setRenderedChunkSections(var13.bridge$getUnculledRenderCount())
         .setLoadedChunks(var1.bridge$getWorld().bridge$getLoadedChunkCount())
         .setRenderedEntities(var13.bridge$getRenderedEntityCount())
         .setRenderedPlayers(var13.bridge$getRenderedPlayersCount())
         .setRenderedParticles(var1.bridge$getEffectRenderer().bridge$countParticles())
         .setRenderedBlockEntities(var13.bridge$getRenderedBlockEntityCount())
         .setFreeMemoryKb((int)(Runtime.getRuntime().freeMemory() / 1000L))
         .setTotalMemoryKb((int)(Runtime.getRuntime().totalMemory() / 1000L))
         .setMaxMemoryKb((int)(Runtime.getRuntime().maxMemory() / 1000L))
         .setDirectMemoryKb((int)(CROCIIOIICRIIIORRROOIHHHICHCCH.getMemoryUsed() / 1000L))
         .setOffHeapMemoryKb((int)(ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage().getUsed() / 1000L))
         .setLunarHuds(CIIIHRIOORHOIHOCICRCICIIHRHIOH())
         .setRenderedGeckolibCosmetics(this.OCHHIRIOOOIOCORIROOHRROICHIRRH)
         .setRenderedCosmetics(this.ROIRHOOIRRCHHROHIRRIRORHOOCCRI)
         .setRenderedEmotes(this.COOCRCHRRIHCCICORHOOOCHOCCRIOC)
         .setFrametime(var1.bridge$getFrametime())
         .setAverageFps(RecordPerfSnapshotRequest.AverageGroup.newBuilder().setAverage((float)var2).setHigh(var4).setLow(var5))
         .setUsingExternalShaders(RCRIIHHRCIIRIOCRHOOCOOICRROOHH())
         .setWidth(var1.bridge$displayWidth())
         .setHeight(var1.bridge$displayHeight())
         .setFullscreen(var1.bridge$isFullScreen())
         .setVsync(var14.bridge$getVSync())
         .setSmoothLighting(var14.bridge$getAmbientOcclusion())
         .setEntityShadows(var14.bridge$getEntityShadows() && var9.IIRIRHOOCOCCOOIRCRCCIHCOOCCOIC())
         .setMaxFramerate(var14.bridge$getFrameRateLimit())
         .setGraphicsStatus(
            var14.bridge$isFabulousGraphics()
               ? RecordPerfSnapshotRequest.GraphicsStatus.GRAPHICS_STATUS_FABULOUS
               : (
                  var14.bridge$isFancyGraphics()
                     ? RecordPerfSnapshotRequest.GraphicsStatus.GRAPHICS_STATUS_FANCY
                     : RecordPerfSnapshotRequest.GraphicsStatus.GRAPHICS_STATUS_FAST
               )
         )
         .setChunkBuilderValue(var14.bridge$getPrioritizeChunkUpdates().getProtoId())
         .setCloudsValue(var14.bridge$getCloudStatus().getProtoId())
         .setParticlesValue(var14.bridge$getParticleStatus().getProtoId())
         .setRenderDistance(var14.bridge$getRenderDistance())
         .setSimulatedDistance(var14.bridge$getSimulationDistance())
         .setEntityDistance((int)Math.round(var14.bridge$getEntityScaling() * 64.0))
         .setBiomeBlend(var14.bridge$getBiomeBlend())
         .setFov(var14.bridge$getFov())
         .setHudCaching(var8.CCCOHIIRHCHRCHCCICHORCIIICHHOC().get())
         .setParticlePhysics(var8.ORRHIRHIOCCCCOIROCRCORCRIIHOHH().get())
         .setLazyChunkLoadingValue(var8.IRCHIIRCIIORIOCOCIOIRCOCICRCCO().get().getProtoId())
         .setTurboEntities(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 8
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HRRCCIHOOORRIHCCRORRCRHRIICRRH().IROHHROORRIHROCOCHCRCHRORRHOOI()
         )
         .setGpuName(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
               .IIIORCCOIHHRCIRHOCIIICOHOOCHIH()
               .ORROCCOHRCROHICHCHIIOOIRRRRHHH
         )
         .setTextureFilteringValue(var14.bridge$getTextureFiltering().getProtoId());
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIRHORHIRCHOORHHOHIROROOCIHOR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10);
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCCIIOCRHCIOCICCHHIIRROCHHOHCH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 13) {
         var10.setGpuUsage(var1.bridge$getGpuUtilization());
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 8) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HRRCCIHOOORRIHCCRORRCRHRIICRRH();
         if (var11.IROHHROORRIHROCOCHCRCHRORRHOOI()) {
            var10.setRenderedTurboEntities(var11.IOOCOICIHOHOIOOCOIRRHCHOCRRORC().RRIRIOOIRIHIIICHOHHOHIIRRORHCI());
         }

         if (var11.ICOCORICICCROCIIHROCOHOORRCHHO()) {
            var10.setRenderedTurboBlockEntities(var11.HOHOIRRIOCRCOOROIIIICOHRRCCRHH().RRIRIOOIRIHIIICHOHHOHIIRRORHCI());
         }
      }

      return var10.build();
   }

   private static boolean RCRIIHHRCIIRIOCRHOOCOOICRROOHH() {
      Optional var0 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR();
      if (var0.isPresent()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR var3 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var0.get())
            .getShaders();
         String var4 = var3.getShaderPack();
         return !var3.getPackNone().equals(var4);
      } else {
         Optional var1 = com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         );
         if (var1.isPresent()) {
            String var2 = ((com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get())
               .lunar$getShaderPack();
            return !"(off)".equals(var2);
         } else {
            return false;
         }
      }
   }

   private static int CIIIHRIOORHOIHOCICRCICIIHRHIOH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$showDebugInfo()
         && !com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .OHHOCIHCICOOHHROHRICOOHOCORCCO()
            .get()) {
         return 0;
      }

      if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
               .HOCOHOIICRHCHHIROHCIICCHHCRCRH()
            == com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICIHHIHCHRICRIIHCRIHIROHCRCICC
         && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .CCHOHOCCCRCIRRCIIHCOORHRCOCIOC()
            .get()) {
         return 0;
      }

      Class var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RRHHORCCRCHCROOIOCOHOHCOOIOIOH();
      int var1 = 0;
      boolean var2 = var0
            == com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         || var0 == com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class;
      MutableInt var3 = new MutableInt(0);

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         if (var5.isEnabled()) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = var5.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
            );
            if (var6 != null) {
               var3.setValue(0);
               var6.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  var2x -> {
                     if (var2x.isEnabled()) {
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3x = var2x.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                           com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO
                        );
                        if (var3x != null && var3x.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var2x)) {
                           var3.increment();
                        }

                        return true;
                     } else {
                        return false;
                     }
                  }
               );
               var1 += var3.intValue();
            }

            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var7 = var5.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO
            );
            if (var7 != null && var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var5)) {
               var1++;
            }
         }
      }

      return var1;
   }

   @Override
   public void close() {
   }

   @Override
   public void init() {
   }

   public static BufferPoolMXBean HHCICHIOIOORIIIRCOHCIRCHIRORCR() {
      for (BufferPoolMXBean var1 : ManagementFactory.getPlatformMXBeans(BufferPoolMXBean.class)) {
         if (var1.getName().equalsIgnoreCase("direct")) {
            return var1;
         }
      }

      throw new IllegalStateException();
   }

   @Generated
   public int getRenderedGeckolibCosmetics() {
      return this.OCHHIRIOOOIOCORIROOHRROICHIRRH;
   }

   @Generated
   public int getRenderedCosmetics() {
      return this.ROIRHOOIRRCHHROHIRRIRORHOOCCRI;
   }

   @Generated
   public int getRenderedEmotes() {
      return this.COOCRCHRRIHCCICORHOOOCHOCCRIOC;
   }
}
