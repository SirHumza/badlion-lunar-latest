package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH {
   public static final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCHIHRCOCROICHHHHCCRIOICCHRROO = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   private static List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ICOHIHHHHIROOROCRHRHOIHOHICRII = List.of();
   private static long ROIHCOCOIOHCHICCRHCOOIIOCICRCO = 0L;
   private static long ORCIRHOCRRHICCROCHIOHCOIOCHRRI = -1L;
   private static long OCHHHRHIORHOHRHRICIRHOOHICICRC = 0L;

   public static void HICRRICCHCCROOHHCHOCOCCHOIHHOC(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      @Nullable HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      String var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().RIOHOIHIOORHIIICRCOCRCICORICRH();
      var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Minecraft ", var2);
      if (var1 == null || var1.ICHHOIRROHCRCHHOOCRCIHIICORHRR.get()) {
         String var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.getClientBrand();
         var0.IRIOOHCHIHIHRCOOHOCHOOOCIIICIO(var3);
      }
   }

   public static String IOCRCCRHRICRHHHRRRRCCCOIRHIHOI() {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      return var0.bridge$getDebugFPS() + "";
   }

   public static String HOROCROHROCCOCHIIHHCRIIIHCIROH() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> var0.RRIOHRHHRHORRROIIRHRHROICRHCRO().bridge$getBiomeName());
   }

   public static String HICRRHRORHOCHHIHOICHCCRHICRCIH() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> {
         double var1 = var0.bridge$getPosX();
         double var3 = var0.bridge$getPosY();
         double var5 = var0.bridge$getPosZ();
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 3) + "  " + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, 5) + "  " + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, 3);
      });
   }

   public static String COOICORRICCCHICRIRHRCCICIRHRHO() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> {
         int var1 = var0.bridge$getBlockX();
         int var2 = var0.bridge$getBlockY();
         int var3 = var0.bridge$getBlockZ();
         return var1 + " " + var2 + " " + var3;
      });
   }

   public static String RIIOCHOHCRIHICIROHHOCIIIHORCCH() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = var0.bridge$getBlockPos();
         return (var1.bridge$getX() >> 4) + " " + (var1.bridge$getY() >> 4) + " " + (var1.bridge$getZ() >> 4);
      });
   }

   public static String RIIIRCHHOORIIHIIOOHOOHOIIOCCHC() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = var0.bridge$getBlockPos();
         int var2 = var1.bridge$getX() >> 4;
         int var3 = var1.bridge$getZ() >> 4;
         int var4 = var2 & 31;
         int var5 = var3 & 31;
         int var6 = var2 >> 5;
         int var7 = var3 >> 5;
         return "[" + var4 + " " + var5 + " in r." + var6 + "." + var7 + ".mca]";
      });
   }

   public static String IOHCOHRCIHIRICCRCRIRRHOCOCOORI() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = var0.bridge$getBlockPos();
         return (var1.bridge$getX() & 15) + " " + (var1.bridge$getY() & 15) + " " + (var1.bridge$getZ() & 15);
      });
   }

   public static void RIROICHCRROROHCCROOCCCCOCHCCRI(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
      if (var2 != null && var2.bridge$getWorld() != null) {
         if (var0.IRICRORHCROOCHHCHRRRIIROHHRIIC()) {
            String var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 5 ? "Player" : "minecraft:player";
            var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Target Entity: ", var6);
         } else {
            Optional var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPointedEntity();
            if (!var3.isEmpty()) {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var3.get();
               String var5 = var4.bridge$getEntityString();
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 5
                  && var4 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
                  )
                {
                  var5 = "Player";
               }

               var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Target Entity: ", var5);
            }
         }
      }
   }

   public static String HHIOCRCRIORHHCCRCCOHHOCICHROCH() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> {
         float var1 = (float)var0.bridge$getRotationYaw();
         float var2 = (float)var0.bridge$getRotationPitch();
         String var3 = OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(var1);
         String var4 = RRORCOIRRIICOOICOIOCORHORCHCOC(var1);
         var1 = RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1);
         var2 = RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var2);
         return var3 + " " + var4 + " (" + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 1) + " / " + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, 1) + ")";
      });
   }

   public static String CORRCROHHHIHIHHHOHCRIROCCIOHRI() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> var0.bridge$getWorld().bridge$getDimensionKey());
   }

   public static String OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(float var0) {
      String[] var1 = new String[]{"North", "Northeast", "East", "Southeast", "South", "Southwest", "West", "Northwest"};
      double var2 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var0) + 180.0;
      var2 += 22.5;
      var2 %= 360.0;
      var2 /= 45.0;
      return var1[RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.IICCOOCHCHROORHHIIHROHCCRHRCOR(var2)];
   }

   public static String RRORCOIRRIICOOICOIOCORHORCHCOC(float var0) {
      String[] var1 = new String[]{"-Z", "+X -Z", "+X", "+X +Z", "+Z", "-X +Z", "-X", "-X -Z"};
      double var2 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var0) + 180.0;
      var2 += 22.5;
      var2 %= 360.0;
      var2 /= 45.0;
      return var1[RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.IICCOOCHCHROORHHIIHROHCCRHRCOR(var2)];
   }

   public static String RIRIOHROROCOHCCCOHIOIICIHCOCIO() {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      float var1 = var0.bridge$getGpuUtilization();
      return var1 > 100.0F ? "100%" : Math.round(var1) + "%";
   }

   public static void IHIRRIIORRHORHRORIHOROIRCORCOO(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      @Nullable HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      Runtime var2 = Runtime.getRuntime();
      long var3 = var2.totalMemory() - var2.freeMemory();
      long var5 = var2.maxMemory();
      String var7 = var3 / 1048576L + "/" + var5 / 1048576L + " MB";
      int var8 = (int)(100L * var3 / var5);
      var0.RIROICHCRROROHCCROOCCCCOCHCCRI("RAM Usage: ", var8 + "%");
      var0.IRIOOHCHIHIHRCOOHOCHOOOCIIICIO(var7);
      if (var1 == null || var1.ORHIIOOIIRIORRIHIRHHOOICHHHHOC.get()) {
         var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Allocation Rate: ", RIROICHCRROROHCCROOCCCCOCHCCRI(var3) / 1048576L + " MB/s");
      }
   }

   private static long RIROICHCRROROHCCROOCCCCOCHCCRI(long var0) {
      long var2 = System.currentTimeMillis();
      long var4 = var2 - ROIHCOCOIOHCHICCRHCOOIIOCICRCO;
      if (var4 >= 500L) {
         if (ORCIRHOCRRHICCROCHIOHCOIOCHRRI >= 0L && var0 > ORCIRHOCRRHICCROCHIOHCOIOCHRRI) {
            OCHHHRHIORHOHRHRICIRHOOHICICRC = (var0 - ORCIRHOCRRHICCROCHIOHCOIOCHRRI) * 1000L / var4;
         }

         ROIHCOCOIOHCHICCRHCOOIIOCICRCO = var2;
         ORCIRHOCRRHICCROCHIOHCOIOCHRRI = var0;
      }

      return OCHHHRHIORHOHRHRICIRHOOHICICRC;
   }

   public static void IOIICIRIICICIIOORHCIIIIRRIHRHI(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Java ", System.getProperty("java.version"));
      var0.RIROICHCRROROHCCROOCCCCOCHCCRI(
         "CPU: ",
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH().ROHHCOIHHRHOICCCRCCRRRHHHOIHCI()
      );
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 29) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
            .IIIORCCOIHHRCIRHOCIIICOHOOCHIH();
         String var4 = var2.bridge$displayWidth() + "x" + var2.bridge$displayHeight() + " (" + var3.HCRRCHCOCHRIIRIHOOIOCCOHHCORHR + ")";
         var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Display: ", var4);
         var0.IRIOOHCHIHIHRCOOHOCHOOOCIIICIO(var3.ORROCCOHRCROHICHCHIIOOIRRRRHHH);
         var0.IRIOOHCHIHIHRCOOHOCHOOOCIIICIO(var3.HHROIRCCROHOCROOHCIOOCIROOHRIH + " " + var3.version);
      } else {
         String var5 = var2.bridge$displayWidth() + "x" + var2.bridge$displayHeight();
         var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Display: ", var5);
      }
   }

   public static String COIOIHOIIHCOIRHOICHCOIHOHHCOII() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1 = var0.bridge$getWorld();
         int var2 = var1.bridge$getPackedLight(var0.bridge$getBlockPos());
         int var3 = var2 >> 4 & 15;
         int var4 = var2 >> 20 & 15;
         return Math.max(var3, var4) + " (" + var4 + " sky, " + var3 + " block)";
      });
   }

   public static String OIOCICCORROIHIHICCOHRRCOHOIHOC() {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0 -> var0.bridge$getWorld().bridge$getWorldTime() / 24000L + "");
   }

   public static String CHIHOIICRHOOHOCIHICIICHCCCRRRH() {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0 -> {
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getLevelRenderer();
         if (var1 == null) {
            return null;
         }

         int var2 = var1.bridge$getRenderedEntityCount();
         int var3 = var0.bridge$getEntities().size();
         return var2 + "/" + var3;
      });
   }

   public static String HRIHRORORRORRHCIOHIHCCROIRHHHO() {
      return HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0 -> var0.bridge$getUnculledRenderCount() + "");
   }

   public static String IIHHRCRCRIIRHHCCICHRHIRIHCCOIR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getEffectRenderer().bridge$countParticles() + "";
   }

   public static void HHRIICOIOORCHCOIICOOIHIRHHICRI(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      @Nullable HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getGameSettings();
      var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Render Distance: ", var2.bridge$getRenderDistance() + "");
      if (var1 == null || var1.OOIRRCHORHOOOOIOCORCIROHIOCHOH.get()) {
         var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Simulation Distance: ", var2.bridge$getSimulationDistance() + "");
      }
   }

   public static void ORHIOICIOCRRHOOCOHRORIHICHRCRR(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      @Nullable HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      String var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSoundHandler().bridge$getDebugString();
      var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Sounds: ", var2);
      if (var1 == null || var1.CROIHORRRHHIHHCCOIOCHCCRRHCCII.get()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
         if (var3 != null) {
            var0.RIROICHCRROROHCCROOCCCCOCHCCRI("Mood: ", Math.round(var3.bridge$getCurrentMood() * 100.0F) + "%");
         }
      }
   }

   public static String HCCIRHHCIHCIOCRIRCIHCRHCCIHOOH() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getClientPacketListener();
      if (var0 == null) {
         return null;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getIntegratedServer();
      if (var1 != null) {
         return "Integrated Server";
      }

      String var2 = var0.bridge$getServerBrand();
      return var2 != null && !var2.isEmpty() ? var2 : null;
   }

   public static String COICCCIRRCOOCIOOCOIROOCRCORHRR() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getGameRenderer()
         .bridge$getShaderGroup();
      return var0 == null ? null : var0.bridge$getShaderGroupName();
   }

   public static String HIHRIOHHCCRRIHHRIHIOOHCCRHIOII() {
      int var0 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.COIIOIIICCRIROCOIRRIOIROOOOIRR.OORHIRCHHHCCOIIOHOIRIHRHCHICIC();
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.COIIOIIICCRIROCOIRRIOIROOOOIRR.IHROCRRIRIROCCCRCRRROCRRCRIIHH(var0);
   }

   public static List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RROROIOROCOCRROOICHRRHHIOIIHRC() {
      List var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPieChartResults();
      if (var0 != null && !var0.isEmpty()) {
         ICOHIHHHHIROOROCRHRHOIHOHICRII = var0;
      }

      return ICOHIHHHHIROOROCRHRHOIHOHICRII;
   }

   public static void RCRHHIOCHCCRRIRIIIIIRIIHCOCCOR() {
      if (!ICOHIHHHHIROOROCRHRHOIHOHICRII.isEmpty()) {
         ICOHIHHHHIROOROCRHRHOIHOHICRII = List.of();
      }
   }

   private static String RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      Function<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH, String> var0
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
      return var1 == null ? null : (String)var0.apply(var1);
   }

   private static String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Function<HRCHROOHRIHCRCRHRIIROCIRHOIRHH, String> var0) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      return var1 == null ? null : (String)var0.apply(var1);
   }

   private static String HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Function<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI, String> var0) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() == null) {
         return null;
      }

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getLevelRenderer();
      return var1 == null ? null : (String)var0.apply(var1);
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var0, int var2) {
      if (var2 <= 0) {
         return Long.toString((long)var0);
      }

      boolean var3 = var0 < 0.0;
      if (var3) {
         var0 = -var0;
      }
      long var4 = switch (var2) {
         case 1 -> 10L;
         case 2 -> 100L;
         case 3 -> 1000L;
         case 4 -> 10000L;
         case 5 -> 100000L;
         default -> {
            long var6 = 1L;

            for (int var8 = 0; var8 < var2; var8++) {
               var6 *= 10L;
            }

            yield var6;
         }
      };
      long var15 = (long)(var0 * var4);
      long var16 = var15 / var4;
      long var10 = var15 % var4;
      StringBuilder var12 = new StringBuilder(32);
      if (var3 && (var16 != 0L || var10 != 0L)) {
         var12.append('-');
      }

      var12.append(var16).append(".");

      for (long var13 = var4 / 10L; var13 > 0L && var10 < var13; var13 /= 10L) {
         var12.append('0');
      }

      if (var10 > 0L) {
         var12.append(var10);
      }

      return var12.toString();
   }

   @Generated
   private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
