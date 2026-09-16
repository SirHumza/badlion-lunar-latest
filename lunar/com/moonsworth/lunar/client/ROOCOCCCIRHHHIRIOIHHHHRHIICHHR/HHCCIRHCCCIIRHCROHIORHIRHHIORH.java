package com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Queues;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.Sentry;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.protocol.App;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SentryId;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final boolean RHRHCCOIHRROCIHCIOHIRRHCOIOOIO = Boolean.parseBoolean(System.getProperty("lunar.sentryDebug", "false"));
   private static final boolean OOICHHRCRHICOIOHRICCRIHORRRHOO = Boolean.parseBoolean(
      System.getProperty(
         "lunar.sentrySendErrors",
         Boolean.toString(com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR)
      )
   );
   private static final String OHIHCIOICRRIRHOCICCHIHRHICIICO = "https://49db0029d2304d69bd80986185f7fafd@o923049.ingest.sentry.io/6029559";
   private static final String ICCRRHOOORIRCORRHOHCOHRIHCIICO = "https://49c0ccff7276e28e55e9e82de4addd1d@o923049.ingest.sentry.io/6029559";
   private static final int CIHRHHHIOIHORICRHOHICCCOICCHRR = 100;
   private static long CCHRIROCIHIOCCRICHCORIIIRCCCHI = 0L;
   private static int IRHOIIRHCHOOIRRCORICCHHIRHIRCR = 0;
   private static volatile boolean IIRHOHRIHCRIRHRHIRRIIIIOOCRIOO = false;
   @NotNull
   private static final Queue<Breadcrumb> HHCCHCHOHCOOIIHCOHICIOIORHRHOR = createBreadcrumbsList(50);

   public static void init() {
      Sentry.init(
         var0 -> {
            var0.setMaxBreadcrumbs(100);
            var0.setBeforeSend(HHCCIRHCCCIIRHCROHIORHIRHHIORH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
            var0.setAttachServerName(false);
            var0.setDsn(
               IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIOIHOIOIIHRRHIOIHHOICRHIRCHCO
                  ? "https://49db0029d2304d69bd80986185f7fafd@o923049.ingest.sentry.io/6029559"
                  : "https://49c0ccff7276e28e55e9e82de4addd1d@o923049.ingest.sentry.io/6029559"
            );
            var0.setEnvironment(
               com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRIIICIRRIIRICRRORCCRCOHIHIO.replaceAll("/", "_")
            );
            var0.setDebug(
               !com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
                  && RHRHCCOIHRROCIHCIOHIRRHCOIOOIO
            );
            var0.setProguardUuid(com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.COCRROCCIRHOIOHIOHRCRIIHRHRHOO);
            String var1 = com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRIIICIRRIIRICRRORCCRCOHIHIO
               + "@"
               + com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCICHOOCICHRIIIHHROHCRHHROOHIO;
            var0.setRelease(var1.replace('/', '_'));
            var0.setEnableUncaughtExceptionHandler(false);
            String var2 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CCHHHCROHRCOCHHORCORROCIIOOHOC;
            if (!Set.of("?", "not supplied").contains(var2)) {
               var0.addTracingOrigin(var2);
            }

            if (IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIOIHOIOIIHRRHIOIHHOICRHIRCHCO) {
               var0.setTracesSampler(
                  var0x -> com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SENTRY_TRACE_SAMPLING
                        .isEnabled()
                     ? 0.05
                     : 0.0
               );
            } else {
               var0.setTracesSampleRate(1.0);
            }
         },
         true
      );
      IchorAPI.getPipeline(HHCCIRHCCCIIRHCROHIORHIRHHIORH.class)
         .ifPresent(
            var0 -> var0.CCHORCOOOCRRRHHCRCRRCIHIICICCH()
               .RRHOOOORORHHOOIHRCCHIIHHIIIIOH(
                  var0x -> {
                     var0x.printStackTrace();
                     String var1 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SentryLevel.FATAL, "LCCR", "IchorPipeline Error Handler", var0x, null);
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        "IchorPipeline Error Handler", "Submitting Sentry event with ID " + var1
                     );
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        Breadcrumb.error(var0x.getClass().getName() + ": " + CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0x).getMessage())
                     );
                  }
               )
         );
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Breadcrumb var0) {
      HHCCHCHOHCOOIIHCOHICIOIORHRHOR.add(var0);
      Sentry.addBreadcrumb(var0);
   }

   private static SentryEvent RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@NotNull SentryEvent var0, @Nullable Object var1) {
      if (!OOICHHRCRHICOIOHRICCRIHORRRHOO) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Report Handler", "Dropping Sentry event as error sending is disabled."
         );
         return null;
      }

      Throwable var2 = var0.getThrowable();
      if (var2 != null && !CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var2)) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Report Handler", "Dropping Sentry event as error is not useful."
         );
         return null;
      }

      if (var0.getLevel() != SentryLevel.FATAL) {
         if (CCHRIROCIHIOCCRICHCORIIIRCCCHI == 0L) {
            CCHRIROCIHIOCCRICHCORIIIRCCCHI = IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI();
         }

         if (IRHOIIRHCHOOIRRCORICCHHIRHIRCR >= 5) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI() - CCHRIROCIHIOCCRICHCORIIIRCCCHI < 60000L) {
               CCHRIROCIHIOCCRICHCORIIIRCCCHI = IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI();
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Report Handler", "Dropping Sentry event due to rate limit."
               );
               return null;
            }

            CCHRIROCIHIOCCRICHCORIIIRCCCHI = IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI();
            IRHOIIRHCHOOIRRCORICCHHIRHIRCR = 0;
         }
      }

      boolean var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null
         && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null;
      Optional var4 = IchorAPI.getPipeline(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getClassLoader());
      List var5 = var4.isEmpty()
         ? List.of()
         : ((OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var4.get())
            .OICHHOCICHCIIOCHRIIRRHRHRIIIIR()
            .map(var0x -> var0x.getId() + "=" + var0x.getVersion())
            .sorted()
            .toList();
      var0.setTag(
         "minecraft_version",
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().RIOHOIHIOORHIIICRCOCRCICORICRH()
      );
      var0.setTag("launcher_version", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.ORCCHCHHORORRHCHRRCCHICHIHCCCO);
      var0.setTag("canary_token", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.RCIROCRHCOHOCCCCIIIHCORRRRCORI);
      if (IRRCHICCRHCHRRCHIOHIIRIORIRHRI.HOOHROHCIHOICOCOIICCOCOICROIRR != null) {
         var0.setTag("modrinth_modpack_project_id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.HOOHROHCIHOICOCOIICCOCOICROIRR);
      }

      if (IRRCHICCRHCHRRCHIOHIIRIORIRHRI.IOHHIIICRCIOHCHHORCHRCRHCHCRIO != null) {
         var0.setTag("modrinth_modpack_version_id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.IOHHIIICRCIOHCHHORCHRCRHCHCRIO);
      }

      if (IRRCHICCRHCHRRCHIOHIIRIORIRHRI.RHHRRICCIHHIHRHIORRRRRROCHIHHH != null) {
         var0.setTag("curseforge_modpack_mod_id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.RHHRRICCIHHIHRHIORRRRRROCHIHHH);
      }

      if (IRRCHICCRHCHRRCHIOHIIRIORIRHRI.IRHCRHIORHIRHOCRROCRICRIIRCIOR != null) {
         var0.setTag("curseforge_modpack_file_id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.IRHCRHIORHIRHOCRROCRICRIIRCIOR);
      }

      var0.setTag("lunar_version", com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CROIHRIIRROCHORIIRIOCROOORRCCH());
      var0.setTag("ichor_modules", String.join(",", OIORCIOOOOHIOCCCHIIHHOHIIOROOO()));
      var0.setTag("external_mods", var5.isEmpty() ? "unknown" : OCCORIIORHORROHHROHHOORHIHRIOO(var5));
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().ICCIRICOHOCCCICROHCRCIOHOIRIIC()) {
         var0.setTag(
            "gpu_vendor",
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
               .IIIORCCOIHHRCIRHOCIIICOHOOCHIH()
               .HCRRCHCOCHRIIRIHOOIOCCOHHCORHR
         );
      }

      if (var1 instanceof Hint var6) {
         Object var7 = var6.get("geckolib_cosmetic");
         if (var7 != null) {
            var0.setTag("geckolib_cosmetic", (String)var7);
         }
      }

      Contexts var14 = var0.getContexts();
      OperatingSystem var15 = new OperatingSystem();
      var15.setName(IIRHCHHOICHRICOOCRORCCIOOIHOIR.HIOCHICRIOCICHRCOOCOROIHIIHCHO);
      var15.setVersion(System.getProperty("os.version"));
      var14.setOperatingSystem(var15);
      Device var8 = new Device();
      var8.setCpuDescription(
         var3
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
               .ROHHCOIHHRHOICCCRCCRRRHHHOIHCI()
            : "unknown"
      );
      var8.setArchs(new String[]{IIRHCHHOICHRICOOCRORCCIOOIHOIR.OCOIIIHIRRCCCCCHCHRIOCHHRHIICI});
      if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null
         && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().CCHHHHCICRCCCIOOIOICOOCRCRHCCR() != null) {
         var8.setLanguage(
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .HOHIHORCRRHIHHRIOOIOCRCCHRCROH()
               .getBase()
         );
      } else {
         var8.setLanguage(IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OORHIHHCIRRIRCOHICHCICHIHOOHCO.split("_")[0]);
      }

      var14.setDevice(var8);
      App var9 = new App();
      HashMap var10 = new HashMap();
      Runtime var11 = Runtime.getRuntime();
      String var12 = var3
         ? (
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentServerData() == null
               ? "None"
               : IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentServerData().bridge$serverIP()
         )
         : "unknown";
      var10.put("connected_server", var12);
      var10.put("total_memory_mb", (int)(var11.totalMemory() / 1048576.0));
      var10.put("free_memory_mb", (int)(var11.freeMemory() / 1048576.0));
      var10.put("max_memory_mb", (int)(var11.maxMemory() / 1048576.0));
      var10.put("fps", var3 ? IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getDebugFPS() : -1);
      var10.put("installation_id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CIIRORRIRORRRHCROCICCCHIHOHRCR);
      var10.put("overwolf_muid", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOROIOCCRCOROORRIOOOICRHHRIHHC);
      var10.put("resource_pack", IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSelectedResourcePack().bridge$getPackName());
      var10.put("external_mods", var5.isEmpty() ? "unknown" : String.join(",", var5));
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().ICCIRICOHOCCCICROHCRCIOHOIRIIC()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var13 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
            .IIIORCCOIHHRCIRHOCIIICOHOOCHIH();
         var10.put("gpu_renderer", var13.ORROCCOHRCROHICHCHIIOOIRRRRHHH);
         var10.put("gpu_vendor", var13.HCRRCHCOCHRIIRIHOOIOCCOHHCORHR);
      }

      var9.setUnknown(var10);
      var14.setApp(var9);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
      IRHOIIRHCHOOIRRCORICCHHIRHIRCR++;
      return var0;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SentryEvent var0) {
      if (!HHCCHCHOHCOOIIHCOHICIOIORHRHOR.isEmpty()) {
         List var1 = var0.getBreadcrumbs();
         if (var1 != null) {
            ArrayList var2 = new ArrayList(var1.size() + HHCCHCHOHCOOIIHCOHICIOIORHRHOR.size());
            int var3 = 0;

            for (Breadcrumb var5 : HHCCHCHOHCOOIIHCOHICIOIORHRHOR) {
               if (!var1.contains(var5)) {
                  var2.add(var5);
               } else {
                  var3++;
               }
            }

            int var9 = HHCCHCHOHCOOIIHCOHICIOIORHRHOR.size() - var3;
            if (var1.size() + var9 <= 100) {
               var2.addAll(var1);
            } else {
               int var10 = 100 - var9;
               ArrayList var6 = new ArrayList(100);

               for (int var7 = var1.size() - 1; var7 > 0; var7--) {
                  Breadcrumb var8 = (Breadcrumb)var1.get(var7);
                  if (!HHCCHCHOHCOOIIHCOHICIOIORHRHOR.contains(var8)) {
                     if (var10 == 0) {
                        continue;
                     }

                     var10--;
                  }

                  var6.add(0, var8);
               }

               var2.addAll(var6);
            }

            var0.setBreadcrumbs(var2);
         } else {
            var0.setBreadcrumbs(new ArrayList<>(HHCCHCHOHCOOIIHCOHICIOIORHRHOR));
         }
      }
   }

   @Nullable
   private static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SentryLevel var0, String var1, String var2, Throwable var3, @Nullable Hint var4) {
      var3 = CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var3);
      SentryId var5 = Sentry.captureException(var3, var4, var2x -> {
         var2x.setLevel(var0);
         var2x.setTag("capture_location", var2);
      });
      return var5.equals(SentryId.EMPTY_ID) ? null : var1 + "-" + var5;
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Throwable var0, String var1) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, true, null);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Throwable var0, String var1, boolean var2, @Nullable Hint var3) {
      if (var2) {
         var0.printStackTrace();
      }

      String var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SentryLevel.ERROR, "LCEX", var1, var0, var3);
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var1, "Submitting Sentry event with ID " + var4
      );
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
   ) {
      IIRHOHRIHCRIRHRHIRRIIIIOOCRIOO = true;
      Throwable var1 = var0.bridge$getCause();
      String var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SentryLevel.FATAL, "LCCR", "Minecraft Crash Report Handler", var1, null);
      if (var2 != null) {
         IIHRRHORCRCROCHHOHORCHCROCIHRO.CROIHRIIRROCHORIIRIOCROOORRCCH(var2);
      }

      try {
         UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
      } catch (Exception var5) {
      }

      if (var1 instanceof OutOfMemoryError) {
         new Thread(
               () -> JOptionPane.showMessageDialog(
                  null,
                  "Your client has ran out of memory.\nYou can increase memory allocation in the launcher. \n\nPlease use the following code (also copied to your clipboard) when submitting a bug report: \n\n"
                     + var2,
                  "Out of Memory",
                  2
               )
            )
            .start();
      } else {
         new Thread(
               () -> JOptionPane.showMessageDialog(
                  null,
                  "Your client has crashed. \n\nPlease use the following code (also copied to your clipboard) when submitting a bug report: \n\n" + var2,
                  "Something went wrong",
                  2
               )
            )
            .start();
      }

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("==============================");
      if (var2 != null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("Report Id: " + var2);
      }

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "MC version: "
            + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().RIOHOIHIOORHIIICRCOCRCICORICRH()
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Branch: " + com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRIIICIRRIIRICRRORCCRCOHIHIO
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Commit: "
            + com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCICHOOCICHRIIIHHROHCRHHROOHIO
            + " ("
            + com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOCRRHCRORRCCCIRHOIORIHRIIHOOC
            + ")"
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Modules: " + Arrays.toString(OIORCIOOOOHIOCCCHIIHHOHIIOROOO())
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "OS: " + IIRHCHHOICHRICOOCRORCCIOOIHOIR.HIOCHICRIOCICHRCOOCOROIHIIHCHO
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Arch: " + IIRHCHHOICHRICOOCRORCCIOOIHOIR.OCOIIIHIRRCCCCCHCHRIOCHHRHIICI
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Launcher Version: " + IRRCHICCRHCHRRCHIOHIIRIORIRHRI.ORCCHCHHORORRHCHRRCCHICHIHCCCO
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Launcher ID: " + IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CIIRORRIRORRRHCROCICCCHIHOHRCR
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Overwolf MUID: " + IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOROIOCCRCOROORRIOOOICRHHRIHHC
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Launch ID: " + IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOHOHIOIORIORCHRORCHIOCHOIRCCO
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Sentry Trace ID: " + IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CCHHHCROHRCOCHHORCORROCIIOOHOC
      );
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("==============================");
      if (com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR) {
         try {
            Thread.sleep(5000L);
         } catch (InterruptedException var4) {
         }
      }
   }

   public static String[] OIORCIOOOOHIOCCCHIIHHOHIIOROOO() {
      return IchorAPI.getPipeline(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getClassLoader())
         .map(var0 -> var0.HCCIOOOIRIRHCOHOIRCHIIOHCRRIIR().keySet().toArray(String[]::new))
         .orElse(new String[0]);
   }

   public static String OCCORIIORHORROHHROHHOORHIHRIOO(List<String> var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-1");
         var1.update(String.join(",", var0).getBytes(StandardCharsets.UTF_8));
         return com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(
            var1.digest()
         );
      } catch (Exception var2) {
         return "unknown";
      }
   }

   @NotNull
   private static Queue<Breadcrumb> createBreadcrumbsList(int var0) {
      return Queues.synchronizedQueue(EvictingQueue.create(var0));
   }

   @Generated
   public static boolean HROHHROCICICRHHRCHCRHROIHRHIHI() {
      return IIRHOHRIHCRIRHRHIRRIIIIOOCRIOO;
   }
}
