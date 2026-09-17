package com.moonsworth.lunar.client.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.ichor.util.FatalIchorError;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.cadixdev.bombe.provider.ClassProvider;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.MappingFormats;
import org.cadixdev.lorenz.io.MappingsReader;
import org.objectweb.asm.tree.ClassNode;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH RIRORROHOIIOIHIIRCCCORHOCRHRCI;
   private static com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHCIOOOOROIROHHRICOCIOIICCCCCH;

   public void loadIchor(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      try {
         com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = var1.IHIRRIIORRHORHRORIHOROIRCORCOO();
         if (var2.IOICIHIIHIOIROHCHROROHRIRHIHIH().contains(com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INIT)) {
            com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
               var2.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
            );
            IHCIOOOOROIROHHRICOCIOIICCCCCH = var3;
            String var4 = new String(
               com.moonsworth.lunar.ichor.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.toByteArray(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class.getClassLoader().getResourceAsStream("bridge/bridgeConfig.json")
               )
            );
            boolean var5 = var2.hasModule("fabric");
            boolean var6 = var5
               && (
                  !com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HIOHOHOIRICOOCHHCRCRRHRHIHRRIR
                     || com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICOHIRRHOOCHOOHHHHOIHHIRCROOOO
               );
            MappingSet var7 = null;
            if (var6 && !var3.HHORRRCRRROHHRCCOCOOCIOHCCCCCR()) {
               var7 = var2.hasModule("fabric")
                  ? (MappingSet)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRHOHRRRHOOHHIHCIIIHICORROOHOR
                     )
                     .orElseThrow(() -> new FatalIchorError("Can't find Lunar to Intermediary mappings"))
                  : null;
               RIRORROHOIIOIHIIRCCCORHOCRHRCI = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var4, var7
               );
            } else {
               RIRORROHOIIOIHIIRCCCORHOCRHRCI = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var4
               );
            }

            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new HHCCIRHCCCIIRHCROHIORHIRHHIORH());
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new com.moonsworth.lunar.client.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH());
            var1.CCOICROHIIHCCRRRRCCICIRCCHCHRO().add(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3));
            if (var2.OHIROHHCCHRIIORCHRCOIICOHOOCOO("tinyvk").isPresent()) {
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new HICHRCOHCCRHOHCICOOCHOIHCCHIRI());
            }

            String var8 = var3.getType();
            List var9 = List.of(
               "com/moonsworth/lunar/" + var8 + "/optifine/",
               "com/moonsworth/lunar/" + var8 + "/forge/",
               "com/moonsworth/lunar/" + var8 + "/optiforge/",
               "com/moonsworth/lunar/sodium/",
               "com/moonsworth/lunar/fabric/",
               "com/moonsworth/lunar/bridge/v1_",
               "com/moonsworth/lunar/replaymod/",
               "com/moonsworth/lunar/compat/",
               "com/moonsworth/lunar/ferrite/",
               "com/moonsworth/lunar/noxesium/"
            );

            for (com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var12 : var3.HHRIICOIOORCHCOIICOOIHIRHHICRI(
                  com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCROOCCIOCCCHIRCOHHHCHRCCOOIRC
               )
               ? List.of(
                  new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO("vanilla", null),
                  new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                     "optifine", "com/moonsworth/lunar/" + var8 + "/optifine/"
                  )
               )
               : List.of(
                  new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO("vanilla", null),
                  new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                     "optifine", "com/moonsworth/lunar/" + var8 + "/optifine/"
                  ),
                  new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                     "forge", "com/moonsworth/lunar/" + var8 + "/forge/"
                  ),
                  new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                     "optiforge", "com/moonsworth/lunar/" + var8 + "/optiforge/"
                  )
               )) {
               String var13 = (String)var12.OHICIOOICHICOIOCOROIIOCCHRRCIC;
               String var14 = (String)var12.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC;
               String var15 = var3.getId() + "_inflight_" + var13 + ".kin";
               MappingSet var16 = null;

               try (InputStream var17 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class.getClassLoader().getResourceAsStream(var15)) {
                  if (var17 != null) {
                     MappingsReader var18 = com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRORROHOCCHCICCCRIRCHRHROCIIC
                        .createReader(var17);

                     try {
                        var16 = var18.read();
                        if (com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.DEBUG) {
                           MappingFormats.XSRG.write(var16, Paths.get(".ichor/" + var3.getId() + "_inflight_" + var13 + ".xsrg"));
                        }
                     } catch (Throwable var24) {
                        if (var18 != null) {
                           try {
                              var18.close();
                           } catch (Throwable var22) {
                              var24.addSuppressed(var22);
                           }
                        }

                        throw var24;
                     }

                     if (var18 != null) {
                        var18.close();
                     }

                     if (var16.getTopLevelClassMappings().isEmpty()) {
                        throw new IllegalStateException("Inflight mappings were empty?");
                     }
                  } else if ("vanilla".equals(var13)
                        && !com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
                     || "optifine".equals(var13) && var2.hasModule("optifine")) {
                     throw new IllegalStateException("Failed to find " + var15 + " on the classpath");
                  }
               }

               if (var16 != null) {
                  var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new CRICCOOHHHCHOORCICOCOHIHOIRHOO(var3, var16, var7, var14, var14 == null ? var9 : List.of()));
                  if ("true".equals(var2.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH().get("ichor.testing"))) {
                     var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new CORCOCICIRIOHROHROIIOOHICCHCRR(var3, var14, var14 == null ? var9 : List.of()));
                  }
               }
            }

            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new IRCIIHHICIHRCOCRROCOICRIHHCCHH());

            try {
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  (com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)Class.forName("com.moonsworth.lunar.magnify.ichor.LineNumberIchor")
                     .getConstructor()
                     .newInstance()
               );
            } catch (ClassNotFoundException var23) {
            }

            if (var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCROOCCIOCCCHIRCOHHHCHRCCOOIRC
            )) {
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new CRRRICCRROCOHHOHIICIHORCOORRRH());
            }
         }
      } catch (Throwable var26) {
         throw var26;
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var0, ClassProvider var1) {
      RIRORROHOIIOIHIIRCCCORHOCRHRCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, IHCIOOOOROIROHHRICOCIOIICCCCCH, var1);
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         super(var1);
      }

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR var1,
         com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
         com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
      ) {
         if (var1 == com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MIXIN) {
            boolean var4 = Boolean.parseBoolean(
               var3.IHIRRIIORRHORHRORIHOROIRCORCOO()
                  .ICRROHROHHOHRRRIIHORIRICHRCOIC()
                  .OIIOOOICRROIHRIROICHOCOHIHHRHH()
                  .getOrDefault("ichor.testing", "false")
                  .toString()
            );
            ArrayList var5 = new ArrayList<>(
               List.of(
                  this.IHOOIIIOCCOOHIIIIHHROCRHHOOIOO(),
                  this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI("lunar"),
                  this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI("bridge_combined"),
                  this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI("bridge_" + this.HRCOOCHHOHCCCRRCRHIHHICIORIRCH.getId()),
                  this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI("lunar_combined"),
                  this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI("lunar_" + this.HRCOOCHHOHCCCRRCRHIHHICIORIRCH.getId())
               )
            );
            if (var4) {
               var5.addAll(
                  List.of(
                     this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI("test"),
                     this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI("integrationTest"),
                     this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI("integrationTest_combined"),
                     this.HRRIHICRHIHCCOIRIOROIHOHRHCOHI("integrationTest_" + this.HRCOOCHHOHCCCRRCRHIHHICIORIRCH.getId())
                  )
               );
            }

            var2.registerMixins(var5);
         }
      }
   }
}
