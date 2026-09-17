package com.moonsworth.lunar.genesis;

import com.moonsworth.lunar.ichor.api.IchorAPI;
import io.sentry.Sentry;
import io.sentry.SentryEvent;
import io.sentry.protocol.App;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.User;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private static final String OORCICIROIHORRICRRHOICCRIHHIHO = "https://49db0029d2304d69bd80986185f7fafd@o923049.ingest.sentry.io/6029559";
   private static final String OCHCOHOHOCRORHIHHCOCCCRRCRHCRI = "https://49c0ccff7276e28e55e9e82de4addd1d@o923049.ingest.sentry.io/6029559";

   public static void init() {
      if (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RORHOOOCCRROOORROIOIRCHIIOCOOI) {
         RIROICHCRROROHCCROOCCCCOCHCCRI(
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOIHCRHIIHIHCRIRRHOROCIICROIOC,
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.HOOCICHHOCOOIIIORRIOCCHHHRCRCI,
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHORHHIRCHOHCOIROHRCHRRORIIOCI
         );
      }
   }

   public static void setUser(String var0) {
      User var1 = new User();
      var1.setUsername(var0);
      Sentry.setUser(var1);
   }

   private static void RIROICHCRROROHCCROOCCCCOCHCCRI(String var0, String var1, String var2) {
      Sentry.init(
         var3 -> {
            var3.setBeforeSend(RRCRRCORICCHOHHIRCHIROOHIIOHCO::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
            var3.setAttachServerName(false);
            var3.setDsn(
               var0.equals("master")
                  ? "https://49db0029d2304d69bd80986185f7fafd@o923049.ingest.sentry.io/6029559"
                  : "https://49c0ccff7276e28e55e9e82de4addd1d@o923049.ingest.sentry.io/6029559"
            );
            var3.setEnvironment(var0.replaceAll("/", "_"));
            var3.setProguardUuid(var2);
            String var4 = var0 + "@" + var1;
            var3.setRelease(var4.replace('/', '_'));
            var3.setEnableUncaughtExceptionHandler(false);
            if (var0.equals("master")) {
               var3.setTracesSampleRate(0.1);
            } else {
               var3.setTracesSampleRate(1.0);
            }
         },
         true
      );
   }

   private static SentryEvent RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@NotNull SentryEvent var0, @Nullable Object var1) {
      String var2 = "Sending event to Sentry: " + var0.getEventId();
      Throwable var3 = var0.getThrowable();
      if (var3 != null) {
         var2 = var2 + " (" + var3.getClass().getName() + ": " + var3.getMessage() + ")";
      }

      System.err.println(var2);
      HashMap var4 = new HashMap();
      var0.setTag("lunar_version", CROIHRIIRROCHORIIRIOCROOORRCCH());
      IchorAPI.getPipeline(Genesis.class.getClassLoader())
         .ifPresentOrElse(
            var2x -> {
               List var3x = var2x.OICHHOCICHCIIOCHRIIRRHRHRIIIIR().map(var0xx -> var0xx.getId() + "=" + var0xx.getVersion()).sorted().toList();
               var0.setTag(
                  "minecraft_version",
                  com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
                        var2x.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
                     )
                     .RIOHOIHIOORHIIICRCOCRCICORICRH()
               );
               var0.setTag("ichor_modules", String.join(",", var2x.HCCIOOOIRIRHCOHOIRCHIIOHCRRIIR().keySet().toArray(String[]::new)));
               var0.setTag("external_mods", OCCORIIORHORROHHROHHOORHIHRIOO(var3x));
               var4.put("external_mods", String.join(",", var3x));
            },
            () -> {
               var0.setTag("minecraft_version", "unknown");
               var0.setTag("ichor_modules", "unknown");
               var0.setTag("external_mods", "unknown");
               var4.put("external_mods", "unknown");
            }
         );
      Contexts var5 = var0.getContexts();
      OperatingSystem var6 = new OperatingSystem();
      var6.setName(System.getProperty("os.name"));
      var6.setVersion(System.getProperty("os.version"));
      var5.setOperatingSystem(var6);
      App var7 = new App();
      Runtime var8 = Runtime.getRuntime();
      var4.put("total_memory_mb", (int)(var8.totalMemory() / 1048576.0));
      var4.put("free_memory_mb", (int)(var8.freeMemory() / 1048576.0));
      var4.put("max_memory_mb", (int)(var8.maxMemory() / 1048576.0));
      var7.setUnknown(var4);
      var5.setApp(var7);
      return var0;
   }

   private static String CROIHRIIRROCHORIIRIOCROOORRCCH() {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOIHCRHIIHIHCRIRRHOROCIICROIOC.equals("master")
         ? "v" + HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRIORROIIRHIRHRHHRIOCCCIIOIHHC
         : HHCCIRHCCCIIRHCROHIORHIRHHIORH.HIRIICICCIOHIIROHIHCOCORORRRCI + "/" + HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOIHCRHIIHIHCRIRRHOROCIICROIOC;
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
}
