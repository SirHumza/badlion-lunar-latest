package com.moonsworth.lunar.client.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.lunarclient.apollo.player.v1.EmbeddedCheckoutSupport;
import com.lunarclient.gameipc.auth.v1.AuthService;
import com.lunarclient.gameipc.browser.v1.BrowserService;
import com.lunarclient.gameipc.handshake.v1.Handshake;
import com.lunarclient.gameipc.launch.v1.ExitGamePush;
import com.lunarclient.gameipc.launch.v1.LaunchService;
import com.lunarclient.gameipc.launch.v1.PlayServerPush;
import com.lunarclient.gameipc.location.v1.FocusGamePush;
import com.lunarclient.gameipc.location.v1.LocationService;
import com.lunarclient.gameipc.location.v1.UpdateFocusRequest;
import com.lunarclient.gameipc.paynow.v1.CheckPayNowCapabilitiesRequest;
import com.lunarclient.gameipc.paynow.v1.PayNowService;
import com.lunarclient.gameipc.promotion.v1.CheckPendingPromotionRequest;
import com.lunarclient.gameipc.promotion.v1.PendingPromotionUpdatePush;
import com.lunarclient.gameipc.promotion.v1.PromotionService;
import com.lunarclient.gameipc.protocol.v1.GameboundIPCMessage;
import com.lunarclient.gameipc.store.v1.StartStorePreviewSessionPush;
import com.lunarclient.gameipc.styngr.v1.StyngrRadioService;
import com.lunarclient.gameipc.tebex.v1.CheckTebexCapabilitiesRequest;
import com.lunarclient.gameipc.tebex.v1.TebexJsCheckoutClosed;
import com.lunarclient.gameipc.tebex.v1.TebexService;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.CHRCRHHRCCOICCOOIIRIOHCOHCHHIC;
import com.moonsworth.lunar.client.util.HRHIHIRHRCHHRORRRCORHOCIRHRIOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import javax.annotation.Nonnull;
import lombok.Generated;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends WebSocketClient {
   private static RRCRRCORICCHOHHIRCHIROOHIIOHCO CRICRCIOOOHIIHROORIRCCORIHICCO;
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH OHCCHOHCCIIHCOHHHHOHHOCRCCROOH = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(this);
   private final Map<Class<? extends Message>, Consumer<? extends Message>> RCROIROHCIIRCHOHCHHRCHIHRCHRRR = new ConcurrentHashMap<>();
   private final AuthService.Interface IOHHHOOCIOIHHIRRHCRHCCRCRIIRHR = AuthService.newStub(this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH);
   private final LaunchService.Interface HHROHHHIIHHHHCCHIHOHICCHORCIRC = LaunchService.newStub(this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH);
   private final LocationService.Interface CIORHOIHHHOCCOOOCROORCCHRIRRRC = LocationService.newStub(this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH);
   private final TebexService.Interface RHIROROIRROOROHRCOOOIRRIHRHROH = TebexService.newStub(this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH);
   private final PayNowService.Interface IOIIHCRRIRCHCIOOHRHIHIRIOCOIRH = PayNowService.newStub(this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH);
   private final BrowserService.Interface CRHCHRCCIHOIHOICHIHOHOHHOHIOHH = BrowserService.newStub(this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH);
   private final PromotionService.Interface OCIOHCRCHIOOCOOICIIRCCHIHOHOCC = PromotionService.newStub(this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH);
   private final StyngrRadioService.Interface HCORIRRCIHIRHIHIOROOCICIRORHIR = StyngrRadioService.newStub(this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH);
   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RIROOHCHCHIHCOHOICHOCRHCHHOIIC = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED;
   private EmbeddedCheckoutSupport IHCHHRIORCIHOCRRHORCRRHORCRIOH = EmbeddedCheckoutSupport.EMBEDDED_CHECKOUT_SUPPORT_UNSPECIFIED;
   private boolean RIOOCIRIHOCHRRORIICOIICCCIHRRC = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isWindowFocused();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nonnull Handshake var1) {
      super(
         URI.create("ws://127.0.0.1:" + IRRCHICCRHCHRRCHIOHIIRIORIRHRI.IRIICHIROOICIIOCCCIOHRRCIIHCCR),
         new Draft_6455(),
         Map.of("lc-handshake", Base64.getEncoder().encodeToString(var1.toByteArray())),
         3000
      );
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(TebexJsCheckoutClosed.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
   }

   public <T extends Message> void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Class<T> var1, Consumer<T> var2) {
      this.RCROIROHCIIRCHOHCHHRCHIHRCHRRR.put(var1, var2);
   }

   @Override
   public void onOpen(ServerHandshake var1) {
      CRICRCIOOOHIIHROORIRCCORIHICCO = null;
      this.RIROOHCHCHIHCOHOICHOCRHCHHOIIC = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.READY;
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("IPC", "Connection established");
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .ICRIOCOOICRIIIRIHIRIOIHCOHHIIC()
         .IOOIOIRHHCHIROHHCCCORCRCHICROO();
      if (var2 != null) {
         var2.CRCICOIHIIOIHIOOIIHORHOOCROHIR(false);
      }

      this.RHCOOROOCIRCCCCCCCHHIOCROHRICR()
         .updateFocus(
            null,
            UpdateFocusRequest.newBuilder().setFocused(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isWindowFocused()).build(),
            var0 -> {}
         );
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(PlayServerPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ExitGamePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(FocusGamePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(PendingPromotionUpdatePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(StartStorePreviewSessionPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.CIORRCCOCRORIRICORHOOIROHRIHHC();
      this.IOCICIROOCIOOCHRIHCHOHRHHRIRHH();
   }

   private void CIORRCCOCRORIRICORHOOIROHRIHHC() {
      this.OCCOCOOHIICIHCRCIOIIHICRORRIRR().checkTebexCapabilities(null, CheckTebexCapabilitiesRequest.getDefaultInstance(), var1 -> {
         this.IHCHHRIORCIHOCRRHORCRRHORCRIOH = switch (var1.getEmbeddedCheckout()) {
            case EMBEDDED_CHECKOUT_OVERWOLF_OVERLAY -> EmbeddedCheckoutSupport.EMBEDDED_CHECKOUT_SUPPORT_OVERLAY;
            case EMBEDDED_CHECKOUT_ELECTRON_WINDOW -> EmbeddedCheckoutSupport.EMBEDDED_CHECKOUT_SUPPORT_WINDOW;
            default -> EmbeddedCheckoutSupport.EMBEDDED_CHECKOUT_SUPPORT_UNSPECIFIED;
         };
      });
      this.ROIHOHIICIIHIHRIIHRCCCICHRHROO().checkPayNowCapabilities(null, CheckPayNowCapabilitiesRequest.getDefaultInstance(), var1 -> {
         this.IHCHHRIORCIHOCRRHORCRRHORCRIOH = switch (var1.getEmbeddedCheckout()) {
            case EMBEDDED_CHECKOUT_OVERWOLF_OVERLAY -> EmbeddedCheckoutSupport.EMBEDDED_CHECKOUT_SUPPORT_OVERLAY;
            case EMBEDDED_CHECKOUT_ELECTRON_WINDOW -> EmbeddedCheckoutSupport.EMBEDDED_CHECKOUT_SUPPORT_WINDOW;
            default -> EmbeddedCheckoutSupport.EMBEDDED_CHECKOUT_SUPPORT_UNSPECIFIED;
         };
      });
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FocusGamePush var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "IPC", "Received focus game push, focusing window"
      );
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$focusWindow();
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PendingPromotionUpdatePush var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "IPC", "Received pending promotion push"
      );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RCICCRRICHCCRHHCOCOIRCRIICCOIH()
         .IIIRHHOCRRRCOHCHCRIHRCOOIRRHCH(var1.getPendingPromotionsList());
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StartStorePreviewSessionPush var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "IPC", "Received start store preview session push"
      );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().ICHHCOOCHRRHICRROCROHIRCCRRHOC().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void IOCICIROOCIOOCHRIHCHOHRHHRIRHH() {
      this.IOIHCOROOICCRIRHRHHHHOCOHIHIOC()
         .checkPendingPromotion(
            null,
            CheckPendingPromotionRequest.getDefaultInstance(),
            var0 -> IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .RCICCRRICHCCRHHCOCOIRCRIICCOIH()
               .IIIRHHOCRRRCOHCHCRIHRCOOIRRHCH(var0.getPendingPromotionsList())
         );
      com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RCOIHOICHRIIHOCCCIHRRHHRROORCR();
      if (var1 != null) {
         var1.RHHROIIIHCCIHOCOCOHCHIHIOOIRIO();
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ExitGamePush var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "IPC", "Received exit game push, shutting down"
      );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$shutdownMinecraftApplet();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PlayServerPush var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession() == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "IPC", "Received play server push but no session is available... ignoring"
         );
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "IPC", "Received play server push, connecting to %s", var1.getAutoJoinServerIp()
         );
         CHRCRHHRCCOICCOOIIRIOHCOHCHHIC.OOCHCRIRHOHRCIHHRCROOOIHCCOCIR();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(null);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$connect(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getAutoJoinServerIp(), var1.getAutoJoinServerIp(), false),
               null
            );
      }
   }

   @Override
   public void onMessage(String var1) {
   }

   @Override
   public void onMessage(ByteBuffer var1) {
      GameboundIPCMessage var2;
      try {
         var2 = GameboundIPCMessage.parseFrom(var1);
      } catch (InvalidProtocolBufferException var9) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "IPC", "Failed to parse clientbound WebSocket message"
         );
         var9.printStackTrace();
         return;
      }

      if (var2.getContentsCase() == GameboundIPCMessage.ContentsCase.RPC_RESPONSE) {
         this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getRpcResponse());
      } else if (var2.getContentsCase() == GameboundIPCMessage.ContentsCase.PUSH_NOTIFICATION) {
         Any var3 = var2.getPushNotification();

         for (Entry var5 : this.RCROIROHCIIRCHOHCHHRCHIHRCHRRR.entrySet()) {
            if (var3.is((Class)var5.getKey())) {
               Message var6;
               try {
                  var6 = var3.unpack((Class<Message>)var5.getKey());
               } catch (InvalidProtocolBufferException var8) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "IPC", "Failed to parse wrapped message for " + var3.getTypeUrl()
                  );
                  return;
               }

               HRHIHIRHRCHHRORRRCORHOCIRHRIOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6, (Consumer<Message>)var5.getValue());
               return;
            }
         }

         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "IPC", "Failed to find handler for push notification " + var3.getTypeUrl()
         );
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "IPC", "Unknown response type to consume"
         );
      }
   }

   @Override
   public void onClose(int var1, String var2, boolean var3) {
      this.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH.HIIIRHIIHCIOOCCCCRCHRRRHCROOCC();
      if (this.RIROOHCHCHIHCOHOICHOCRHCHHOIIC == null) {
         CRICRCIOOOHIIHROORIRCCORIHICCO = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(null, 5000L);
      }

      if (this.RIROOHCHCHIHCOHOICHOCRHCHHOIIC == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.READY) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "IPC", "Connection closed (%d, \"%s\")", var1, var2
         );
      }

      this.RIROOHCHCHIHCOHOICHOCRHCHHOIIC = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED;
   }

   @Override
   public void onError(Exception var1) {
      if (!var1.getMessage().startsWith("Connection refused:")
         && (
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
               || IICCOOCHCHROORHHIIHROHCCRHRCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IPC
               )
         )) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "IPC", "WS-Error: " + var1.getMessage()
         );
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IPC
      )) {
         var1.printStackTrace();
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TebexJsCheckoutClosed var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(null);
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Tebex", "Embedded checkout closed."
      );
   }

   public static void bootstrap() {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            RIROICHCRROROHCCROOCCCCOCHCCRI.class,
            var0 -> {
               if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC().isEmpty()
                     || IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC().get().ROORROCCCRCRCOHHOROROIRHCIROHR()
                        == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED) {
                     if (CRICRCIOOOHIIHROORIRCCORIHICCO == null) {
                        CRICRCIOOOHIIHROORIRCCORIHICCO = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(null, 5000L);
                     }

                     if (CRICRCIOOOHIIHROORIRCCORIHICCO.OICHRIIHIORHOOOIOCHHOCRORIHIOH()) {
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().ORRORHRIRHOCCRIROCCIIRRHHOHOIC();
                     }
                  }

                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC()
                     .ifPresent(
                        var0x -> {
                           if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isWindowFocused()
                              != var0x.OIIHORORCCOHIICOHRRORHRIIOHIHH()) {
                              var0x.CHIIIIIHRCROHOHHHRRIHHRIIICIIC(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isWindowFocused());
                              var0x.RHCOOROOCIRCCCCCCCHHIOCROHRICR()
                                 .updateFocus(
                                    null,
                                    UpdateFocusRequest.newBuilder()
                                       .setFocused(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isWindowFocused())
                                       .build(),
                                    var0xx -> {}
                                 );
                           }
                        }
                     );
               }
            }
         );
   }

   @Generated
   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0) {
      CRICRCIOOOHIIHROORIRCCORIHICCO = var0;
   }

   @Generated
   public AuthService.Interface ICROIHIIIRHHHOHIOHOOOROHIORHIR() {
      return this.IOHHHOOCIOIHHIRRHCRHCCRCRIIRHR;
   }

   @Generated
   public LaunchService.Interface IIIOIHCHIHCOHHRROHHCIRCIRIHRRH() {
      return this.HHROHHHIIHHHHCCHIHOHICCHORCIRC;
   }

   @Generated
   public LocationService.Interface RHCOOROOCIRCCCCCCCHHIOCROHRICR() {
      return this.CIORHOIHHHOCCOOOCROORCCHRIRRRC;
   }

   @Generated
   public TebexService.Interface OCCOCOOHIICIHCRCIOIIHICRORRIRR() {
      return this.RHIROROIRROOROHRCOOOIRRIHRHROH;
   }

   @Generated
   public PayNowService.Interface ROIHOHIICIIHIHRIIHRCCCICHRHROO() {
      return this.IOIIHCRRIRCHCIOOHRHIHIRIOCOIRH;
   }

   @Generated
   public BrowserService.Interface HRHOROIIOOIRIICOHIHCHCRCOHCIIO() {
      return this.CRHCHRCCIHOIHOICHIHOHOHHOHIOHH;
   }

   @Generated
   public PromotionService.Interface IOIHCOROOICCRIRHRHHHHOCOHIHIOC() {
      return this.OCIOHCRCHIOOCOOICIIRCCHIHOHOCC;
   }

   @Generated
   public StyngrRadioService.Interface CICRHIIRHRHCOHRHRHHIIHRROOHCRC() {
      return this.HCORIRRCIHIRHIHIOROOCICIRORHIR;
   }

   @Generated
   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ROORROCCCRCRCOHHOROROIRHCIROHR() {
      return this.RIROOHCHCHIHCOHOICHOCRHCHHOIIC;
   }

   @Generated
   public EmbeddedCheckoutSupport HRORHHRHHOIIIOOHIIOHOHRCHROOOC() {
      return this.IHCHHRIORCIHOCRRHORCRRHORCRIOH;
   }

   @Generated
   public boolean OIIHORORCCOHIICOHRRORHRIIOHIHH() {
      return this.RIOOCIRIHOCHRRORIICOIICCCIHRRC;
   }

   @Generated
   public void CHIIIIIHRCROHOHHHRRIHHRIIICIIC(boolean var1) {
      this.RIOOCIRIHOCHRRORIICOIICCCIHRRC = var1;
   }
}
