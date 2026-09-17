package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.common.collect.Maps;
import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import com.google.protobuf.ProtocolStringList;
import com.lunarclient.apollo.transfer.v1.PingData;
import com.lunarclient.apollo.transfer.v1.PingRequest;
import com.lunarclient.apollo.transfer.v1.PingResponse;
import com.lunarclient.apollo.transfer.v1.TransferRequest;
import com.lunarclient.apollo.transfer.v1.TransferResponse;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import io.netty.util.concurrent.DefaultThreadFactory;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final int HRIIRRHCOIRRHRHIIRIIRICOIRHOOR = 10;
   private static final long HOHIRICCOIHIRIORIHOHORCRCHCIOR = 3000L;
   private static final ExecutorService HCHRRCIIIIHOCRHRIIOROCCHHCOHII = Executors.newCachedThreadPool(
      new DefaultThreadFactory("lunar-client-transfer-thread", true)
   );
   private final Map<ByteString, Map<String, HHCCIRHCCCIIRHCROHIORHIRHHIORH>> OCCHORHIHRCOOHCRIRHOOICRROHOII = Maps.newConcurrentMap();
   private RRCRRCORICCHOHHIRCHIROOHIIOHCO HICROOROOIIHCROHIIRIICOOHROORI;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      super("transfer", "Transfer");
      this.handle(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, this::HHCCIRHCCCIIRHCROHIORHIRHHIORH);
   }

   @Override
   protected void onDisable() {
      this.OCCHORHIHRCOOHCRIRHOOICRROHOII.clear();
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(TransferRequest.class, TransferResponse.class, PingRequest.class, PingResponse.class);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         TransferRequest.class,
         var1x -> {
            if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
               .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
               String var2 = var1x.getServerIp();
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getCurrentServerData();
               this.debug("Transfer request %s -> %s", var1x.getRequestId().toStringUtf8(), var2);
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                  .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                  .HCOHHCCRCIORCCOORRHIOHHHOCOOCI()
                  .get()) {
                  com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     var2,
                     var4 -> {
                        if (var4 != null && !var4.isEmpty()) {
                           if (var3 != null) {
                              if (var4.stream()
                                 .anyMatch(
                                    var1xxx -> com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR(
                                       var1xxx, var3.bridge$serverIP()
                                    )
                                 )) {
                                 IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(() -> {
                                    this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, TransferResponse.Status.STATUS_ACCEPTED);
                                    this.RHCHRCCRRHORIOCIOHHCRHCHICRIHH(var2);
                                 });
                              } else {
                                 IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                                    .bridge$submit(
                                       () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                                          .bridge$displayScreen(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var2))
                                    );
                              }
                           }
                        } else {
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                              .bridge$submit(
                                 () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                                    .bridge$displayScreen(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var2))
                              );
                        }
                     }
                  );
               } else {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, TransferResponse.Status.STATUS_ACCEPTED);
                  this.RHCHRCCRRHORIOCIOHHCRHCHICRIHH(var2);
               }
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         PingRequest.class,
         var1x -> {
            if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
               .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
               ProtocolStringList var2 = var1x.getServerIpsList();
               if (this.HICROOROOIIHCROHIIRIICOOHROORI == null) {
                  this.HICROOROOIIHCROHIIRIICOOHROORI = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .IHHOICIRHRHHRRCROIOROOCCCOROIR();
               }

               HashMap var3 = new HashMap();
               long var4 = System.currentTimeMillis() + 3000L;

               for (String var7 : var2) {
                  HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = new HHCCIRHCCCIIRHCROHIORHIRHHIORH(false, false, var4, null);
                  if (var3.putIfAbsent(var7, var8) == null) {
                     if (var3.size() > 10) {
                        var8.IHICORCROOROHCIHIHCOIHRRHICICO(true);
                     } else {
                        HCHRRCIIIIHOCRHRIIOROCCHHCOHII.submit(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var8));
                     }
                  }
               }

               this.OCCHORHIHRCOOHCRIRHOOICRROHOII.put(var1x.getRequestId(), var3);
               this.debug(
                  "Ping request %s: %s addresses (%s unique), pinging %s",
                  var1x.getRequestId().toStringUtf8(),
                  var2.size(),
                  var3.size(),
                  Math.min(var3.size(), 10)
               );
            }
         }
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH var2) {
      InetSocketAddress var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$resolveAddress(var1).orElse(null);
      if (var3 != null && !this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.getAddress())) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.getHostName(), var3.getHostString() + ":" + var3.getPort(), false);
         var4.bridge$setPingCallback(var3x -> {
            var2.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(true);
            this.debug("%s -> pong, ping=%sms", var1, var3x);
         });
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);

         try {
            this.HICROOROOIIHCROHIIRIICOOHROORI.bridge$ping(var4);
         } catch (Exception var6) {
            var2.IHICORCROOROHCIHIHCOIHRRHICICO(true);
            this.debug("%s -> ping threw %s, timed out immediately", var1, var6.getClass().getSimpleName());
         }
      } else {
         var2.IHICORCROOROHCIHIHCOIHRRHICICO(true);
         this.debug("%s -> unresolvable or private, timed out immediately", var1);
      }
   }

   private boolean RHOORRIIOCHIRRHOHOOHIROHCRICRO() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRROIRCCCRHRROHRIORCCIIOORRRHH();
      return var1 != null && var1.isEnabled() && var1.HROICIRRHHHICCCORCOOHRRRHOROIO();
   }

   private void debug(String var1, Object... var2) {
      if (this.RHOORRIIOCHIRRHOHOOHIROHCRICRO()) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RRROIRCCCRHRROHRIORCCIIOORRRHH()
            .CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2);
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 7 && this.HICROOROOIIHCROHIIRIICOOHROORI != null) {
         this.HICROOROOIIHCROHIIRIICOOHROORI.bridge$tick();
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RHRIRROIOROICIOOCCOHOOROHHCOCO() != null && !this.OCCHORHIHRCOOHCRIRHOOICRROHOII.isEmpty()) {
         for (Entry var3 : this.OCCHORHIHRCOOHCRIRHOOICRROHOII.entrySet()) {
            boolean var4 = false;
            ByteString var5 = (ByteString)var3.getKey();
            Map var6 = (Map)var3.getValue();

            for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 : var6.values()) {
               if (!var8.OROHIHCCRHRHOOHIOHHOICHIOHIOCO() && !var8.RIRRCRRIHRORROIOOHIHIOCRIROOHC()) {
                  if (var8.ROHIICRIRROCRHRHOOHORCIRHOIOII() < System.currentTimeMillis()) {
                     var8.IHICORCROOROHCIHIHCOIHRRHICICO(true);
                  } else {
                     var4 = true;
                  }
               }
            }

            if (!var4) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var6);
               this.OCCHORHIHRCOOHCRIRHOOICRROHOII.remove(var5);
            }
         }
      }
   }

   private ORHIOICIOCRRHOOCOHRORIHICHRCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TransferRequest var1, String var2) {
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen();
      String var4 = this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("message", var2);
      String var5 = var4.substring(0, var4.length() / 2);
      String var6 = var4.substring(var4.length() / 2);
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         () -> new String[]{this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("header"), var5, var6},
         this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("cancel"),
         this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("confirm"),
         var4x -> {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4x ? TransferResponse.Status.STATUS_ACCEPTED : TransferResponse.Status.STATUS_REJECTED);
            if (var4x) {
               this.RHCHRCCRRHORIOCIOHHCRHCHICRIHH(var2);
            } else {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(var3);
            }
         }
      );
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7);
   }

   private void RHCHRCCRRHORIOCIOHHCRHCHICRIHH(String var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO().bridge$submit(() -> {
         this.debug("Transferring to %s", var1);
         this.IRCCRRIOIROIORCOICRROIOOCIOOCH();
         this.RCOCHOROICROOIRHRCRIOHIHCOCIII(var1);
      });
   }

   private void IRCCRRIOIROIORCOICRROIOOCIOOCH() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RHRIRROIOROICIOOCCOHOOROHHCOCO();
      if (var1 != null) {
         var1.bridge$transferQuit();
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$loadWorld(null);
   }

   private void RCOCHOROICROOIRHRCRIOHIHCOCIII(String var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var1, false);
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO().bridge$connect(var2, null);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TransferRequest var1, TransferResponse.Status var2) {
      this.debug("Transfer response %s -> %s", var1.getRequestId().toStringUtf8(), var2);
      TransferResponse var3 = TransferResponse.newBuilder().setRequestId(var1.getRequestId()).setStatus(var2).build();
      this.sendPacket(var3);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ByteString var1, Map<String, HHCCIRHCCCIIRHCROHIORHIRHHIORH> var2) {
      List var3 = var2.entrySet().stream().map(var0 -> {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var1x = (HHCCIRHCCCIIRHCROHIORHIRHHIORH)var0.getValue();
         boolean var2x = !var1x.RIRRCRRIHRORROIOOHIHIOCRIROOHC() && var1x.HROORRHRIICCHICHORHOHCCORICIIH() != null;
         int var3x = var2x ? (int)var1x.HROORRHRIICCHICHORHOHCCORICIIH().bridge$getPingToServer() : 0;
         PingData.Status var4x = var2x ? PingData.Status.STATUS_SUCCESS : PingData.Status.STATUS_TIMED_OUT;
         return PingData.newBuilder().setServerIp((String)var0.getKey()).setStatus(var4x).setPing(var3x).build();
      }).toList();
      PingResponse var4 = PingResponse.newBuilder().setRequestId(var1).addAllPingData(var3).build();
      if (this.RHOORRIIOCHIRRHOHOOHIROHCRICRO()) {
         long var5 = var2.values().stream().findFirst().map(var0 -> System.currentTimeMillis() - (var0.ROHIICRIRROCRHRHOOHORCIRHOIOII() - 3000L)).orElse(0L);
         this.debug(
            "Ping response %s after %sms: %s",
            var1.toStringUtf8(),
            var5,
            var3.stream().map(var0 -> var0.getServerIp() + "=" + var0.getStatus() + "/" + var0.getPing() + "ms").toList()
         );
      }

      this.sendPacket(var4);
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InetAddress var1) {
      return var1.isLoopbackAddress() || var1.isSiteLocalAddress();
   }

   @Override
   public String getLanguagePath() {
      return "gui.transfer";
   }
}
