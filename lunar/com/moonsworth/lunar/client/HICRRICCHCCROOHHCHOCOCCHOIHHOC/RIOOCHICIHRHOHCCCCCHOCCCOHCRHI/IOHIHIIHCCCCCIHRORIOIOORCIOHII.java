package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOHIHIIHCCCCCIHRORIOIOORCIOHII implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private static final Pattern RCIOOOHOOICCCICIOICHHHHHORORHI = Pattern.compile("(?i)§[0-9A-FK-OR]");
   private static final Pattern OIORCCRHIICICRHIIRRCIOIOICCHOI = Pattern.compile("(\\d{1,9})\\s*/\\s*(\\d{1,9})");
   private static final int RHHRORCIRRIOROHCIOOCRORIHROCRC = 5;
   private final Map<String, IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HHCCHOOCCHRRCHOCRICOIOICRORICI = new ConcurrentHashMap<>();
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO HICROOROOIIHCROHIIRIICOOHROORI;
   private Future<Void> HRHHCRCOCRHHRICRIRCICCHHHORCHI;
   private ExecutorService OICHCCCOROICHRCIOORCHROHHCCIIC;
   private volatile boolean closed;

   @Override
   public void init() {
      this.HICROOROOIIHCROHIIRIICOOHROORI = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .IHHOICIRHRHHRRCROIOROOCCCOROIR();
      this.OICHCCCOROICHRCIOORCHROHHCCIIC = Executors.newCachedThreadPool(
         new ThreadFactoryBuilder().setNameFormat("lunar-server-ping-%d").setDaemon(true).build()
      );
      this.HRHHCRCOCRHHRICRIRCICCHHHORCHI = ORCOCORROHIROCCIORORRRRCHIOOCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(() -> {
         if (!this.closed && this.HICROOROOIIHCROHIIRIICOOHROORI != null && !this.HHCCHOOCCHRRCHOCRICOIOICRORICI.isEmpty()) {
            this.HICROOROOIIHCROHIIRIICOOHROORI.bridge$tick();
         }
      }, 0, 1);
   }

   @Override
   public void close() {
      this.closed = true;
      if (this.HRHHCRCOCRHHRICRIRCICCHHHORCHI != null) {
         this.HRHHCRCOCRHHRICRIRCICCHHHORCHI.cancel(true);
      }

      if (this.OICHCCCOROICHRCIOORCHROHHCCIIC != null) {
         this.OICHCCCOROICHRCIOORCHROHHCCIIC.shutdownNow();
      }

      for (IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : this.HHCCHOOCCHRRCHOCRICOIOICRORICI.values()) {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var2.address, "Client is shutting down.")
         );
      }

      this.HHCCHOOCCHRRCHOCRICOIOICRORICI.clear();
   }

   public CompletableFuture<IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RROOHOHRIIOIRCIORHRHIRCICIROCO(String var1) {
      String var2 = OICOOCHHCCICIORCRIRIORIRIHHOOR(var1);
      if (var2 == null) {
         return CompletableFuture.completedFuture(
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIROOIHIHRHOCCHIIIROOCRIIOCRR("", "Enter a server address.")
         );
      }

      if (this.closed) {
         return CompletableFuture.completedFuture(
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var2, "Server pinger is closed.")
         );
      }

      IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = this.HHCCHOOCCHRRCHOCRICOIOICRORICI.putIfAbsent(var2, var3);
      if (var4 != null) {
         return var4.CHOHHCIOHHHHRROOHROHHHCCORRCOI;
      }

      try {
         this.OICHCCCOROICHRCIOORCHROHHCCIIC.execute(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3));
      } catch (RejectedExecutionException var6) {
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var2, "Server pinger is closed.")
         );
      }

      return var3.CHOHHCIOHHHHRROOHROHHHCCORRCOI;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (this.closed) {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var1.address, "Server pinger is closed.")
         );
      } else {
         var1.HICHHICCROIIICCORIOHCHHHHIHCHR = ORCOCORROHIROCCIORORRRRCHIOOCH.RHHHOORICOOIRHCRIOIRRIHHIIOIRI()
            .schedule(
               () -> var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RROHIRRCRIICIHCRCHROHCHCOIHRHC(var1.address)
               ),
               5L,
               TimeUnit.SECONDS
            );
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.address, var1.address, false);
         var1.IHHCHOCIHOHCHICOHCCHOIRROCICOI = var2;
         var2.bridge$setPingCallback(
            var2x -> var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.address, var2)
            )
         );

         try {
            this.HICROOROOIIHCROHIIRIICOOHROORI.bridge$ping(var2);
         } catch (UnknownHostException var4) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var1.address, "Unknown host.")
            );
         } catch (Throwable var5) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var1.address, "Unable to ping server.")
            );
         }
      }
   }

   private static String OICOOCHHCCICIORCRIRIORIRIHHOOR(String var0) {
      if (var0 == null) {
         return null;
      }

      String var1 = var0.trim();
      return var1.isEmpty() ? null : var1.toLowerCase(Locale.ROOT);
   }

   public static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private static final String IIROORCOCOOOHHRHCOICCICCHROCRO = "success";
      private static final String CRICORCIOHOCHROOHIOIHHORHRHHHO = "timeout";
      private static final String IROOHHOCCOHRCORRIROOOIHCICHICH = "error";
      @SerializedName("status")
      private final String OCRCROROIOCHRHIIIOIOIOICCHIOOC;
      @SerializedName("address")
      private final String OICHOIIOOCCORRHIHHCOICROIOHCIC;
      @SerializedName("ping")
      private final long ping;
      @SerializedName("playersOnline")
      private final int IHCIIHCRORHRCHIICHIOORIOCRHIII;
      @SerializedName("playersMax")
      private final int CROOCORHCHHORCOOROHHOIIRIRICOC;
      @SerializedName("lunarServer")
      private final String IICOOOCOIIHOCCHRCCIRORCRRCRCIO;
      @SerializedName("error")
      private final String error;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, long var3, int var5, int var6, String var7, String var8) {
         this.OCRCROROIOCHRHIIIOIOIOICCHIOOC = var1;
         this.OICHOIIOOCCORRHIHHCOICROIOHCIC = var2;
         this.ping = var3;
         this.IHCIIHCRORHRCHIICHIOORIOCRHIII = var5;
         this.CROOCORHCHHORCOOROHHOIIRIRICOC = var6;
         this.IICOOOCOIIHOCCHRCCIRORCRRCRCIO = var7;
         this.error = var8;
      }

      private static IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         String var0,
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
      ) {
         String var2 = var1.bridge$getPopulationInfo();
         int var3 = 0;
         int var4 = 0;
         if (var2 != null) {
            Matcher var5 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.OIORCCRHIICICRHIIRRCIOIOICCHOI
               .matcher(IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIOOOHOOICCCICIOICHHHHHORORHI.matcher(var2).replaceAll(""));
            if (var5.find()) {
               var3 = Integer.parseInt(var5.group(1));
               var4 = Integer.parseInt(var5.group(2));
            }
         }

         return new IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "success", var0, var1.bridge$getPingToServer(), var3, var4, var1.getLunarServer(), null
         );
      }

      private static IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH RROHIRRCRIICIHCRCHROHCHCOIHRHC(String var0) {
         return new IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH("timeout", var0, -1L, -1, -1, null, "Server ping timed out.");
      }

      private static IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH OCIROOIHIHRHOCCHIIIROOCRIIOCRR(String var0, String var1) {
         return new IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH("error", var0, -1L, -1, -1, null, var1);
      }
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final String address;
      private final CompletableFuture<IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH> CHOHHCIOHHHHRROOHROHHHCCORRCOI = new CompletableFuture<>();
      private volatile ScheduledFuture<?> HICHHICCROIIICCORIOHCHHHHIHCHR;
      private volatile com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH IHHCHOCIHOHCHICOHCCHOIRROCICOI;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var2) {
         this.address = var2;
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         if (this.CHOHHCIOHHHHRROOHROHHHCCORRCOI.complete(var1)) {
            if (this.HICHHICCROIIICCORIOHCHHHHIHCHR != null) {
               this.HICHHICCROIIICCORIOHCHHHHIHCHR.cancel(false);
            }

            if (this.IHHCHOCIHOHCHICOHCCHOIRROCICOI != null) {
               this.IHHCHOCIHOHCHICOHCCHOIRROCICOI.bridge$setPingCallback(null);
            }

            IOHIHIIHCCCCCIHRORIOIOORCIOHII.this.HHCCHOOCCHRRCHOCRICOIOICRORICI.remove(this.address, this);
         }
      }
   }
}
