package com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.gson.JsonObject;
import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.lunarclient.common.v1.InMenus;
import com.lunarclient.common.v1.InboundHostedWorld;
import com.lunarclient.common.v1.InboundInMenus;
import com.lunarclient.common.v1.InboundLocation;
import com.lunarclient.common.v1.InboundMinecraftRealms;
import com.lunarclient.common.v1.InboundReplayWorld;
import com.lunarclient.common.v1.InboundRewindWorld;
import com.lunarclient.common.v1.InboundServer;
import com.lunarclient.common.v1.InboundSinglePlayer;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.ServerRichStatus;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.gameipc.location.v1.UpdateLocationRequest;
import com.lunarclient.gameipc.promotion.v1.PromotionType;
import com.lunarclient.websocket.analytics.v1.AnalyticsService;
import com.lunarclient.websocket.analytics.v1.RecordPinnedServerInteractionRequest;
import com.lunarclient.websocket.apollo.v1.ApolloService;
import com.lunarclient.websocket.badge.v1.BadgeService;
import com.lunarclient.websocket.badge.v1.RefreshBadgesPush;
import com.lunarclient.websocket.conversation.v1.ConversationAddParticipantsPush;
import com.lunarclient.websocket.conversation.v1.ConversationAddPinnedMessagePush;
import com.lunarclient.websocket.conversation.v1.ConversationAddedPush;
import com.lunarclient.websocket.conversation.v1.ConversationMessageHistoryDeletedPush;
import com.lunarclient.websocket.conversation.v1.ConversationMessagePush;
import com.lunarclient.websocket.conversation.v1.ConversationOwnerUpdatePush;
import com.lunarclient.websocket.conversation.v1.ConversationPreSendActionPush;
import com.lunarclient.websocket.conversation.v1.ConversationRemoveMessagePush;
import com.lunarclient.websocket.conversation.v1.ConversationRemoveParticipantPush;
import com.lunarclient.websocket.conversation.v1.ConversationRemovePinnedMessagePush;
import com.lunarclient.websocket.conversation.v1.ConversationRemovedPush;
import com.lunarclient.websocket.conversation.v1.ConversationService;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateIconPolicyPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateIconPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateInvitePolicyPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateMessagePinningPolicyPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateNamePolicyPush;
import com.lunarclient.websocket.conversation.v1.ConversationUpdateNamePush;
import com.lunarclient.websocket.conversation.v1.RefreshConversationsPush;
import com.lunarclient.websocket.cosmetic.v2.CosmeticOwnershipVisibility;
import com.lunarclient.websocket.cosmetic.v2.CosmeticService;
import com.lunarclient.websocket.cosmetic.v2.PlayerCosmeticsPushV2;
import com.lunarclient.websocket.cosmetic.v2.RefreshCosmeticsPush;
import com.lunarclient.websocket.emote.v1.EmoteService;
import com.lunarclient.websocket.emote.v1.EquippedEmote;
import com.lunarclient.websocket.emote.v1.RecommendedJam;
import com.lunarclient.websocket.emote.v1.RefreshEmotesPush;
import com.lunarclient.websocket.emote.v1.StopEmotePush;
import com.lunarclient.websocket.emote.v1.UseEmotePush;
import com.lunarclient.websocket.friend.v1.BroadcastLocationChangeRequest;
import com.lunarclient.websocket.friend.v1.BroadcastServerKickRequest;
import com.lunarclient.websocket.friend.v1.FriendRadioInfoPush;
import com.lunarclient.websocket.friend.v1.FriendRemovedYouPush;
import com.lunarclient.websocket.friend.v1.FriendRequest;
import com.lunarclient.websocket.friend.v1.FriendRequestAcceptedPush;
import com.lunarclient.websocket.friend.v1.FriendRequestCanceledPush;
import com.lunarclient.websocket.friend.v1.FriendRequestDeniedPush;
import com.lunarclient.websocket.friend.v1.FriendRequestReceivedPush;
import com.lunarclient.websocket.friend.v1.FriendService;
import com.lunarclient.websocket.friend.v1.FriendSocials;
import com.lunarclient.websocket.friend.v1.FriendStatusPush;
import com.lunarclient.websocket.friend.v1.LastSeenVisibility;
import com.lunarclient.websocket.friend.v1.OfflineFriend;
import com.lunarclient.websocket.friend.v1.OnlineFriend;
import com.lunarclient.websocket.handshake.v1.Handshake;
import com.lunarclient.websocket.handshake.v1.SessionIdentifyPush;
import com.lunarclient.websocket.heartbeat.v1.HeartbeatService;
import com.lunarclient.websocket.heartbeat.v1.RefreshMetadataPush;
import com.lunarclient.websocket.hostedworld.v1.HostedWorldAvailablePush;
import com.lunarclient.websocket.hostedworld.v1.HostedWorldService;
import com.lunarclient.websocket.hostedworld.v1.HostedWorldStatusPush;
import com.lunarclient.websocket.hostedworld.v1.HostedWorldWhitelistedPush;
import com.lunarclient.websocket.hostedworld.v1.JoinHostedWorldPush;
import com.lunarclient.websocket.hostedworld.v1.Joinability;
import com.lunarclient.websocket.hostedworld.v1.LoginRequest;
import com.lunarclient.websocket.jam.v1.JamService;
import com.lunarclient.websocket.jam.v1.RefreshJamsPush;
import com.lunarclient.websocket.legacyapi.v1.LegacyApiService;
import com.lunarclient.websocket.liveexperience.v1.LiveExperienceService;
import com.lunarclient.websocket.marker.v1.MarkerService;
import com.lunarclient.websocket.marker.v1.NewMarkerPush;
import com.lunarclient.websocket.notification.v1.DisplayChatMessagePush;
import com.lunarclient.websocket.notification.v1.DisplayNotificationPush;
import com.lunarclient.websocket.notification.v1.NotificationService;
import com.lunarclient.websocket.paynow.v1.OpenPayNowCheckoutPush;
import com.lunarclient.websocket.performance.v1.PerformanceService;
import com.lunarclient.websocket.promotion.v1.LoginResponse;
import com.lunarclient.websocket.promotion.v1.PromotionService;
import com.lunarclient.websocket.protocol.v1.ClientboundWebSocketMessage;
import com.lunarclient.websocket.protocol.v1.WebSocketRichClosePush;
import com.lunarclient.websocket.radio.v1.PlayerRadioPush;
import com.lunarclient.websocket.radio.v1.RadioService;
import com.lunarclient.websocket.screenshot.v1.ScreenshotService;
import com.lunarclient.websocket.server.v1.ServerService;
import com.lunarclient.websocket.serverdiscovery.v1.ServerDiscoveryService;
import com.lunarclient.websocket.serverdiscovery.v1.ServerSectionCardsPush;
import com.lunarclient.websocket.skyblock.v1.DungeonUpdatePush;
import com.lunarclient.websocket.skyblock.v1.SkyblockService;
import com.lunarclient.websocket.socials.v1.RefreshSocialsPush;
import com.lunarclient.websocket.socials.v1.SocialsService;
import com.lunarclient.websocket.spray.v1.RemoveSprayPush;
import com.lunarclient.websocket.spray.v1.SprayService;
import com.lunarclient.websocket.spray.v1.UseSprayPush;
import com.lunarclient.websocket.store.v1.IncomingGiftPrivacy;
import com.lunarclient.websocket.store.v1.StoreService;
import com.lunarclient.websocket.subscription.v1.SubscriptionService;
import com.lunarclient.websocket.tebex.v1.OpenTebexJsCheckoutPush;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOCCRCRCOHIIORCCORCRCIRRROIOOR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.HRHIHIRHRCHHRORRRCORHOCIRHRIOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import com.moonsworth.lunar.client.util.OCOROCROIRCHIHIHHOOIRIIIRRCRHI;
import com.moonsworth.lunar.client.util.RCOCRROHHROHHOCRCCCHCIROIIOORC;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import io.sentry.Breadcrumb;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.Serializable;
import java.net.URI;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends WebSocketClient
   implements com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static UUID IOICHORCOOIICOOCOIHIOCIIRCCIHC;
   private static InboundLocation HIOCCOCHOORRCRCHCCOHHIIIOIHOOO = InboundLocation.newBuilder().setInMenus(InboundInMenus.newBuilder().build()).build();
   private static Location COOCHHRROHRCCIOIOHRRIIOHCIRCCH = Location.newBuilder().setInMenus(InMenus.newBuilder().build()).build();
   private static RRCRRCORICCHOHHIRCHIROOHIIOHCO CRICRCIOOOHIIHROORIRCCORIHICCO;
   private final Handshake CRIRRICIRRIOHRHCOORIOHIIHIIOIC;
   private final CRICCOOHHHCHOORCICOCOHIHOIRHOO HOICHCICORRCCOCICIIROIIRIIRHHR = new CRICCOOHHHCHOORCICOCOHIHOIRHOO(this);
   private final Map<Class<? extends Message>, Consumer<? extends Message>> IHHIRIHROIIORICRIIROCIIICIIIOC = new HashMap<>();
   private final Map<Class<? extends Message>, Cache<UUID, ? extends Message>> RRCCHIROHRORRIORHHCRHOICIRHCRR = new HashMap<>();
   private WebSocketRichClosePush CCCHCRRRIRRHICOOIOCHCHRCRICHOC = null;
   private final ApolloService.Interface CCROCCHOCHCIRCIHROHHICIHIICROH = ApolloService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final ConversationService.Interface HIRHCCCROOHORORRRRCHICHROHRRIH = ConversationService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final CosmeticService.Interface HOIIROHHIIROROHCRROHCORIOHCIHH = CosmeticService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final RadioService.Interface CRIRROHICRHRROCIHOHRCICCRCORHO = RadioService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final StoreService.Interface ROCICROOOORCIRIIRRCICIHRHIORHH = StoreService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final EmoteService.Interface OCHRROICICIRRCOCRRRICIIRCHIORR = EmoteService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final SprayService.Interface CRHRICHCCHHIHHOROCHOIHHOCCIHHH = SprayService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final BadgeService.Interface HIOCCRHOROOHCHHHICHOCRCIHHOHOR = BadgeService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final FriendService.Interface HRHIOHRHORHOCIICRCHICCOIROORHC = FriendService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final HeartbeatService.Interface OICCIICHOOHHCCRCRCCRHCOCHHROCO = HeartbeatService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final NotificationService.Interface IRIRIIIOOCOIIICRHHRHROHHCHORCI = NotificationService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final SubscriptionService.Interface CCOOHCORIOIRCOICIOIOOCRIICCHCO = SubscriptionService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final LegacyApiService.Interface IIIOIHOHRIROHRIIHIHHIHHOOHRRHI = LegacyApiService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final PerformanceService.Interface CIRRHIRCICHCCRCIICOIORROOCHOIC = PerformanceService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final HostedWorldService.Interface ROHOCIORHOICIICRIIHOCICCHIICHH = HostedWorldService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final AnalyticsService.Interface IHOCORIIOCCIRCCOORRIIOOHCCHCIO = AnalyticsService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final LiveExperienceService.Interface HRRHORHIOHORCHHCRIOCRRCIRIRIOO = LiveExperienceService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final ScreenshotService.Interface HOIIRIICCOOHHRHOROOOHRHRRHHOCH = ScreenshotService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final ServerService.Interface HIHHHCRRHCORRCHCHHIRRIRROCIOCC = ServerService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final SocialsService.Interface IICCHHIIHICHICHRICCIICCROIRRCR = SocialsService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final JamService.Interface HHIHCCIIHOIRCHIIIRCHHRCCCOIRCC = JamService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final SkyblockService.Interface COIOIIOOCIRCCHIRHHCOROOHHCOIIC = SkyblockService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final PromotionService.Interface OHHHRIHRRHICHCCOHCRCIHOICCRIRO = PromotionService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final MarkerService.Interface OOCIHORCCHOIHHRCHRICHOCIHHRCOI = MarkerService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private final ServerDiscoveryService.Interface HIHICIOOHRRHIOIIIIHCCRRCHCRHCI = ServerDiscoveryService.newStub(this.HOICHCICORRCCOCICIIROIIRIIRHHR);
   private boolean ICROIRICORRHRCRRIOOCCRRIIOHICI = false;
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH OHHCOORRRORHHICIICRCCHRRRHOCOO = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private final com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCRRROOOOICIORIRCIROCROROHIORR;
   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RIROOHCHCHIHCOHOICHOCRHCHHOIIC = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED;
   private boolean RCCCROCCCRORIOCIROROOOHHHRCHRO;
   private LastSeenVisibility IRROICROIHCCCRRHIHCCOOCOOOHOCI;
   private IncomingGiftPrivacy CIRIOIHIRCCCRORHRCHIRCHOCHHCHH;
   private CosmeticOwnershipVisibility IRIRHCHIORRHIOHOICORICRIHRCRHI;
   private long IHRCOHHOHRHHOCCCCRHOIICHCOCORC;
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH HHHCIHORICHROCOCRRRCCCICOCOORI = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Handshake var1) {
      super(
         URI.create(RIROICHCRROROHCCROOCCCCOCHCCRI.HCRCHIOHOIROOCIROROHIRRIIRRHHO() + "/game"),
         new Draft_6455(),
         Map.of(
            "sentry-trace",
            IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CCHHHCROHRCOCHHORCORROCIIOOHOC,
            "User-Agent",
            "Lunar Client " + com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CROIHRIIRROCHORIIRIOCROOORRCCH()
         ),
         30000
      );
      this.HHHCIHORICHROCOCRRRCCCICOCOORI.CROCIHOHROHRCOHRHOCHICOCRIIIHO(var1.getIdentity().getAuthenticatorJwt());
      this.CRIRRICIRRIOHRHCOORIOHIIHIIOIC = var1;
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("Assets", "Instantiate");
      this.OCRRROOOOICIORIRCIROCROROHIORR = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED);
      this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("admin", false);
      this.HCHRIROHHHCORIOCROOCHRCIOROOCI(false);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LastSeenVisibility.LAST_SEEN_VISIBILITY_UNSPECIFIED);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IncomingGiftPrivacy.INCOMING_GIFT_PRIVACY_UNSPECIFIED);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CosmeticOwnershipVisibility.COSMETIC_OWNERSHIP_VISIBILITY_UNSPECIFIED);
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(0L);
      this.OCIRIHHHIICCRCHICCCHHHHIOHCHHH();
      if (this.OCRRROOOOICIORIRCIROCROROHIORR.RROHIIOHORHICRHIHCCRRRHIHCHRCC() != null) {
         this.OHHCOORRRORHHICIICRCCHRRRHOCOO
            .IIHRRHORCRCROCHHOHORCHCROCIHRO(
               "onlineStatus", this.OCRRROOOOICIORIRCIROCROROHIORR.RROHIIOHORHICRHIHCCRRRHIHCHRCC().CIHIIIROIRCIRROICHIHHCOHCCHHOC().getName()
            );
      }

      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RefreshMetadataPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationMessagePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationPreSendActionPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationOwnerUpdatePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationAddParticipantsPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationRemoveParticipantPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateNamePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateIconPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationAddPinnedMessagePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationRemovePinnedMessagePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateInvitePolicyPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateNamePolicyPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateIconPolicyPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationUpdateMessagePinningPolicyPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationAddedPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationRemovedPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationRemoveMessagePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ConversationMessageHistoryDeletedPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RefreshConversationsPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(FriendStatusPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(FriendRemovedYouPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(DisplayChatMessagePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(PlayerCosmeticsPushV2.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(PlayerRadioPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(UseEmotePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(StopEmotePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(UseSprayPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RemoveSprayPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(FriendRequestReceivedPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(DisplayNotificationPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(FriendRequestAcceptedPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(FriendRequestDeniedPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(FriendRequestCanceledPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(FriendRadioInfoPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RefreshEmotesPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RefreshCosmeticsPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(JoinHostedWorldPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(HostedWorldStatusPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(HostedWorldWhitelistedPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(HostedWorldAvailablePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(OpenTebexJsCheckoutPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(OpenPayNowCheckoutPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(SessionIdentifyPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RefreshSocialsPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RefreshBadgesPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(RefreshJamsPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(DungeonUpdatePush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(NewMarkerPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(ServerSectionCardsPush.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
   }

   private <T extends Message> void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Class<T> var1, Consumer<T> var2) {
      this.IHHIRIHROIIORICRIIROCIIICIIIOC.put(var1, var2);
      this.RRCCHIROHRORRIORHHCRHOICIRHCRR.put(var1, CacheBuilder.newBuilder().expireAfterWrite(1L, TimeUnit.MINUTES).build());
   }

   public boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(Any var1) {
      for (Entry var3 : this.IHHIRIHROIIORICRIIROCIIICIIIOC.entrySet()) {
         Class var4 = (Class)var3.getKey();
         if (var1.is(var4)) {
            Message var5;
            try {
               var5 = var1.unpack(var4);
            } catch (InvalidProtocolBufferException var7) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Assets", "Failed to parse wrapped message for " + var1.getTypeUrl()
               );
               return false;
            }

            HRHIHIRHRCHHRORRRCORHOCIRHRIOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, (Consumer<Message>)var3.getValue());
            return true;
         }
      }

      return false;
   }

   private <T extends Message> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, Class<T> var2) {
      Cache var3 = this.RRCCHIROHRORRIORHHCRHOICIRHCRR.get(var2);
      if (var3 != null) {
         Message var4 = (Message)var3.getIfPresent(var1);
         if (var4 != null) {
            var3.invalidate(var1);
            Consumer var5 = this.IHHIRIHROIIORICRIIROCIIICIIIOC.get(var2);
            HRHIHIRHRCHHRORRRCORHOCIRHRIOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4, var5);
         }
      }
   }

   private <T extends Message> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, T var2) {
      Class var3 = var2.getClass();
      Cache var4 = this.RRCCHIROHRORRIORHHCRHOICIRHCRR.get(var3);
      if (var4 == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Assets", "Attempted to delay unregistered message type: " + var3.getSimpleName()
         );
      } else {
         var4.put(var1, var2);
      }
   }

   @Override
   public void onOpen(ServerHandshake var1) {
      this.send(this.CRIRRICIRRIOHRHCOORIOHIIHIIOIC.toByteArray());
      CRICRCIOOOHIIHROORIRCCORIHICCO = null;
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.READY);
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Assets",
         "Connection established as %s (%s)",
         this.OCRRROOOOICIORIRCIROCROROHIORR.RROHIIOHORHICRHIHCCRRRHIHCHRCC().getName(),
         this.OCRRROOOOICIORIRCIROCROROHIORR.RROHIIOHORHICRHIHCCRRRHIHCHRCC().CIHIIIROIRCIRROICHIHHCOHCCHHOC().getName()
      );
      this.OCRRROOOOICIORIRCIROCROROHIORR.CICIHRIOIHHROIRHIIRORIOIIRCIRR().OIIIORCIHHHICIHHRIORCHOCCIOROC();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::new
               )
         );
      this.HOHIROROCHIROOCCROHOCOORCHCORC();
      com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CCRHICOCOHIIRIHCOCIRCHHROHCCRR();
      if (var2 != null) {
         var2.RIHRROICOICHIHIHOROCOCRCRCIHII();
         this.ROHOCIORHOICIICRIIHOCICCHIICHH.login(null, LoginRequest.newBuilder().build(), var2::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      }

      this.HRHIOHRHORHOCIICRCHICCOIROORHC
         .login(
            null,
            com.lunarclient.websocket.friend.v1.LoginRequest.getDefaultInstance(),
            var1x -> {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .RROHIIOHORHICRHIHCCRRRHIHCHRCC()
                  .IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.fromProtobuf(var1x.getCurrentStatus()));
               this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().clear();
               this.OCRRROOOOICIORIRCIROCROROHIORR.OIICRCOIOOHOOHORCRCIOHRCOIIHIC().clear();
               HashSet var2x = new HashSet();

               for (OnlineFriend var4 : var1x.getOnlineFriendsList()) {
                  UUID var5 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.getPlayer().getUuid());
                  com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = new com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var5, var4.getPlayer().getUsername()
                  );
                  var6.IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.fromProtobuf(var4.getStatus()));
                  var6.CCHORHIOORICCIRIHRIIHIICORIORO(System.currentTimeMillis());
                  var6.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4.getLocation());
                  var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.getHostedWorldJoinability());
                  if (var6.getHostedWorldJoinability() != Joinability.JOINABILITY_ALLOWED) {
                     var6.IRHCROCOORCOOCIIOORRCCORRIOORO(false);
                  }

                  com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.get(var4.getMinecraftVersion().getEnum())
                     .ifPresent(var6::CRRRICCRROCOHHOHIICIHORCOORRRH);
                  var6.IOCCIOHHRCIOHOHOHCOHCRHCCRIIOI(var4.getPlusColor().getColor());
                  var6.OHORCCHOIOCRHROIRRHICHCIIOCRCH(var4.getLogoColor().getColor());
                  var6.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HCOHROCRRIIHOORRCCROCROICRICIC()
                        .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                        .get(var4.getBadgeId())
                  );
                  var6.ROCCROHOHRHROOOORROCICOCCOCORO(var4.getRankName());
                  if (var4.hasFriendsSince()) {
                     var6.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.getFriendsSince()));
                  }

                  FriendSocials var7 = var4.getSocials();
                  if (var4.hasSocials()) {
                     var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7);
                  }

                  this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
                  var2x.add(var5);
               }

               for (OfflineFriend var12 : var1x.getOfflineFriendsList()) {
                  UUID var16 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12.getPlayer().getUuid());
                  if (!var2x.contains(var16)) {
                     com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var18 = new com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var16, var12.getPlayer().getUsername()
                     );
                     var18.IRCIIHHICIHRCOCRROCOICRIHHCCHH((Location)null);
                     var18.IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.OFFLINE);
                     var18.CRRRICCRROCOHHOHIICIHORCOORRRH(
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .HCOHROCRRIIHOORRCCROCROICRICIC()
                           .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                           .get(var12.getBadgeId())
                     );
                     var18.OHORCCHOIOCRHROIRRHICHCIIOCRCH(var12.getLogoColor().getColor());
                     var18.IOCCIOHHRCIOHOHOHCOHCRHCCRIIOI(var12.getPlusColor().getColor());
                     var18.ROCCROHOHRHROOOORROCICOCCOCORO(var12.getRankName());
                     if (var12.hasLastVisibleOnline()) {
                        var18.CCHORHIOORICCIRIHRIIHIICORIORO(var12.getLastVisibleOnline().getSeconds() * 1000L);
                     } else {
                        var18.CCHORHIOORICCIRIHRIIHIICORIORO(-1L);
                     }

                     if (var12.hasFriendsSince()) {
                        var18.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12.getFriendsSince()));
                     }

                     FriendSocials var20 = var12.getSocials();
                     if (var12.hasSocials()) {
                        var18.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var20);
                     }

                     this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var18);
                  }
               }

               for (Uuid var13 : var1x.getPinnedFriendsList()) {
                  UUID var17 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13);
                  com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var19 = this.OCRRROOOOICIORIRCIROCROROHIORR
                     .RORROHRORCOOOOHRROHIOHCRHHCRCO()
                     .CCHORHIOORICCIRIHRIIHIICORIORO(var17);
                  if (var19 != null) {
                     var19.HHIHIIOICHCCHIIRRCCRHHHOOCOOCO(true);
                  }
               }

               this.HCHRIROHHHCORIOCROOCHRCIOROOCI(var1x.getAllowFriendRequests());
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x.getLastSeenVisibility());

               for (FriendRequest var14 : var1x.getOutboundFriendAddRequestsList()) {
                  this.OCRRROOOOICIORIRCIROCROROHIORR
                     .OIICRCOIOOHOOHORCRCIOHRCOIIHIC()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14));
               }

               for (FriendRequest var15 : var1x.getInboundFriendAddRequestsList()) {
                  this.OCRRROOOOICIORIRCIROCROROHIORR
                     .OIICRCOIOOHOOHORCRCIOHRCOIIHIC()
                     .IRCIIHHICIHRCOCRROCOICRIHHCCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15));
               }

               if (var1x.hasUserCreatedAt()) {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .ICRIOCOOICRIIIRIHIRIOIHCOHHIIC()
                     .HHCCIRHCCCIIRHCROHIORHIRHHIORH(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x.getUserCreatedAt()));
               }

               this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
            }
         );
      this.HRHHOCIORIIRRHIOORIORHOIHHROOH();
      this.OCHRCCCICRIOCRCOORCIRCHRIHOIRO();
      this.OHIROHHCCHRIIORCHRCOIICOHOOCOO();
      this.HRIOCRHIOOHOHOCRCROIIRORHICICC();
      this.CCCIOOHOCOCHCRIRHIIORCRIOOIRHO();
      this.HROHRRCRRHOIRHIRICOOROHRRRORIH();
      this.IOHOCCRORRHOHRROHCIHIIROIHRHOO();
      this.CHIOCHOIHHHCHOIHHIIHIOHCRHRIII();
      this.OIORROROOROHHRIIORIHHHOCIIHRRC();
      this.RHHROIIIHCCIHOCOCOHCHIHIOOIRIO();
   }

   private void HRHHOCIORIIRRHIOORIORHOIHHROOH() {
      this.HIRHCCCROOHORORRRRCHICHROHRRIH
         .login(
            null,
            com.lunarclient.websocket.conversation.v1.LoginRequest.newBuilder().setUsingSatellite(true).build(),
            var1 -> {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "Conversation", "Conversation login successful"
               );
               this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
               this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IOHRRHOHCHIRRIRRHCRHIHHOCCROCO();
            }
         );
   }

   private void OCHRCCCICRIOCRCOORCIRCHRIHOIRO() {
      this.HIHICIOOHRRHIOIIIIHCCRRCHCRHCI.login(null, com.lunarclient.websocket.serverdiscovery.v1.LoginRequest.getDefaultInstance(), var1 -> {
         this.OCRRROOOOICIORIRCIROCROROHIORR.HOICCHRHOCIORIICICCOOIHRRHIIOR().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
         this.RCIICOICCOIOCCCHCOOCCRHRIHOOHI();
      });
   }

   private void HRIOCRHIOOHOHOCRCROIIRORHICICC() {
      this.OCHRROICICIRRCOCRRRICIIRCHIORR
         .login(
            null,
            com.lunarclient.websocket.emote.v1.LoginRequest.getDefaultInstance(),
            var1 -> {
               ArrayList var2 = new ArrayList();
               var1.getOwnedEmotesList()
                  .forEach(
                     var2x -> {
                        List var3x = var2x.getRecommendedJamsList().isEmpty()
                           ? new ArrayList()
                           : var2x.getRecommendedJamsList().stream().map(RecommendedJam::getJamId).toList();
                        com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var2x.hasGiftInfo()
                           ? new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                              CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x.getGiftInfo().getGiftedBy().getUuid()),
                              var2x.getGiftInfo().getGiftedBy().getUsername(),
                              var2x.getGiftInfo().getMessage(),
                              var2x.getGiftInfo().getIsAnonymous()
                           )
                           : null;
                        com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5x = new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           var2x.getEmoteId(),
                           var2x.getExpiresAt().getSeconds() * 1000L,
                           CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x.getGrantedAt()),
                           var3x,
                           var4
                        );
                        com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var6x = (com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH)IIHRRHORCRCROCHHOHORCHCROCIHRO.IOCICHRIHOHOHRRHIRIHHCROCCOCIR
                           .get(var2x.getEmoteId());
                        if (var6x != null) {
                           var6x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5x);
                        }

                        if (!var1.getHasAllEmotesFlag()) {
                           var2.add(var5x);
                        }
                     }
                  );
               if (var1.getHasAllEmotesFlag()) {
                  IIHRRHORCRCROCHHOHORCHCROCIHRO.IOCICHRIHOHOHRRHIRIHHCROCCOCIR
                     .forEach(
                        (var1x, var2x) -> {
                           com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3x = new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                              var1x, -1L, null, new ArrayList<>(), null
                           );
                           var2x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3x);
                           var2.add(var3x);
                        }
                     );
               }

               this.OCRRROOOOICIORIRCIROCROROHIORR.COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().RHHIOCHRCICCHOHCIHOOHOIHCCHRCO(var2);
               HashSet var3 = new HashSet();

               for (EquippedEmote var5 : var1.getEquippedEmotesList()) {
                  com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var6 = new com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     var5.getEmoteId(), var5.getSlotNumber(), var5.getAttachedJamId()
                  );
                  var3.removeIf(var1x -> var1x.getSlotId() == var6.getSlotId());
                  var2.stream().filter(var1x -> var1x.id() == var5.getEmoteId()).findFirst().ifPresent(var6::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
                  var3.add(var6);
               }

               this.OCRRROOOOICIORIRCIROCROROHIORR.COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var3);
               this.OCRRROOOOICIORIRCIROCROROHIORR.COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().CCIHHRIOOOOCOHRCIHOHROOICIORCC(var1.getLunarPlusFreeEmoteId());
               this.OCRRROOOOICIORIRCIROCROROHIORR
                  .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
                  .OIRRROORIIRHHROOCCRIIIRRIOCCCO(
                     this.OCRRROOOOICIORIRCIROCROROHIORR
                        .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
                        .IRIRIICCORRCHICCRRCRIRHCIIRROR()
                        .stream()
                        .anyMatch(var1x -> var1x.id() == var1.getLunarPlusFreeEmoteId())
                  );
               this.OCRRROOOOICIORIRCIROCROROHIORR.COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().OOIHIRRHCRHOCRCCCIHIHIIHOOIOIH();
               this.OCRRROOOOICIORIRCIROCROROHIORR.COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().CRHCHHCHHICCHOHOHHCOICCRIRHHRR();
            }
         );
   }

   private void CCCIOOHOCOCHCRIRHIIORCRIOOIRHO() {
      this.HOIIROHHIIROROHCRROHCORIOHCIHH
         .login(
            null,
            com.lunarclient.websocket.cosmetic.v2.LoginRequest.getDefaultInstance(),
            var1 -> {
               this.OCRRROOOOICIORIRCIROCROROHIORR.IHIHCOIRIHIRHICORCCHCOOICIIOIC().HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
               this.OCRRROOOOICIORIRCIROCROROHIORR.HCCICHCRRIICICCHCIRCRRIIRROHHC().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
               this.OCRRROOOOICIORIRCIROCROROHIORR.IHIHCOIRIHIRHICORCCHCOOICIIOIC().HIIRCHIIRCCHHROCOICCCCIHHROROO();
               this.OCRRROOOOICIORIRCIROCROROHIORR.RCRIIICORIICOIIOHIIHICCCOCRICC().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getOutfitsList(), var1.getOutfitTree());
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getCosmeticOwnershipVisibility());
               if (this.OCRRROOOOICIORIRCIROCROROHIORR.RROHIIOHORHICRHIHCCRRRHIHCHRCC() != null) {
                  this.OCRRROOOOICIORIRCIROCROROHIORR.RROHIIOHORHICRHIHCCRRRHIHCHRCC().ROCCROHOHRHROOOORROCICOCCOCORO(var1.getRankName());
                  this.OCRRROOOOICIORIRCIROCROROHIORR.RROHIIOHORHICRHIHCCRRRHIHCHRCC().HICHHHOOCRROHCCCCOOHOCHHOIOHCR(var1.getArtistTools());
                  this.OCRRROOOOICIORIRCIROCROROHIORR.RROHIIOHORHICRHIHCCRRRHIHCHRCC().RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC(var1.getTesterTools());
                  if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
                     || var1.getArtistTools()) {
                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .RCRIHICIRICIOIRHHICCICRHCIOOIR();
                     var2.OICHHRHCOIIOOCICCCIRRIROROCOCR();
                     if (!var2.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO)) {
                        var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO, OHHRIOHROOIHOROCIRHCHORIHRRRRI.OHOORHOHICRCIRRIHRIOICHHOHIOOH()
                        );
                        var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHHOHIIOCRIOOOHCRIROCRRCCICIHI, var2.CIHORCCRORHIICRIRORIOIOIHRIHIC()
                        );
                        var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO, var2.IICCOHOIROCIHRRORCHROIHCICCCIR()
                        );
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR var3 = var2.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                        );
                        if (var3 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var4
                           )
                         {
                           var4.unlock();
                        }
                     }

                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .OHOHOOHHHICIHIORCHIIOHRRRCHRHI();
                     var8.OICHHRHCOIIOOCICCCIRRIROROCOCR();
                     if (!var8.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO)) {
                        var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO, OHHRIOHROOIHOROCIRHCHORIHRRRRI.OHOORHOHICRCIRRIHRIOICHHOHIOOH()
                        );
                        var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHHOHIIOCRIOOOHCRIROCRRCCICIHI, var8.CIHORCCRORHIICRIRORIOIOIHRIHIC()
                        );
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR var11 = var8.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                        );
                        if (var11 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var5
                           )
                         {
                           var5.unlock();
                        }
                     }

                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HCCICHCRRIICICCHCIRCRRIIRROHHC().ICHHRRHHCCCCIRHCORIHIRHHOCHIOO(false);
                  }

                  if (var1.getTesterTools()) {
                     HICHRCOHCCRHOHCICOOCHOIHCCHIRI var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .HICCIICOCIIICICCICCCCRIOIOHOIO();
                     if (!var7.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO)) {
                        var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO, OHHRIOHROOIHOROCIRHCHORIHRRRRI.OHOORHOHICRCIRRIHRIOICHHOHIOOH()
                        );
                        var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHHOHIIOCRIOOOHCRIROCRRCCICIHI, var7.CIHORCCRORHIICRIRORIOIOIHRIHIC()
                        );
                        var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO, var7.IICCOHOIROCIHRRORCHROIHCICCCIR()
                        );
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR var9 = var7.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                        );
                        if (var9 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var12
                           )
                         {
                           var12.unlock();
                        }
                     }

                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .HHCOIIICCHROIROOOICIIOCRHHIIRH();
                     var10.OICHHRHCOIIOOCICCCIRRIROROCOCR();
                     if (!var10.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO)) {
                        var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO, OHHRIOHROOIHOROCIRHCHORIHRRRRI.OHOORHOHICRCIRRIHRIOICHHOHIOOH()
                        );
                        var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHHOHIIOCRIOOOHCRIROCRRCCICIHI, var10.CIHORCCRORHIICRIRORIOIOIHRIHIC()
                        );
                        var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO, var10.IICCOHOIROCIHRRORCHROIHCICCCIR()
                        );
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR var13 = var10.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                        );
                        if (var13 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var15
                           )
                         {
                           var15.unlock();
                        }
                     }

                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .ICIHHROIHRHIHRIIRRORIOICCRIRHC();
                     if (!var14.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO)) {
                        var14.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO, OHHRIOHROOIHOROCIRHCHORIHRRRRI.OHOORHOHICRCIRRIHRIOICHHOHIOOH()
                        );
                        var14.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHHOHIIOCRIOOOHCRIROCRRCCICIHI, var14.CIHORCCRORHIICRIRORIOIOIHRIHIC()
                        );
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR var16 = var14.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                        );
                        if (var16 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var6
                           )
                         {
                           var6.unlock();
                        }
                     }

                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .IRHCIHIROHCOIIOCRORHHRIRRCIIIC();
                     if (!var17.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO)) {
                        var17.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHCHRCCCCRRHCICORHHCIHOCIIIRCO, OHHRIOHROOIHOROCIRHCHORIHRRRRI.OHOORHOHICRCIRRIHRIOICHHOHIOOH()
                        );
                        var17.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHHOHIIOCRIOOOHCRIROCRRCCICIHI, var17.CIHORCCRORHIICRIRORIOIOIHRIHIC()
                        );
                     }
                  }
               }

               this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("cosmeticState", RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.READY.getId());
            }
         );
   }

   private void OHIROHHCCHRIIORCHRCOIICOHOOCOO() {
      this.ROCICROOOORCIRIIRRCICIHRHIORHH.login(null, com.lunarclient.websocket.store.v1.LoginRequest.getDefaultInstance(), var1 -> {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getIncomingGiftPrivacy());
         this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1.getCoins());
      });
   }

   private void HROHRRCRRHOIRHIRICOOROHRRRORIH() {
      this.IICCHHIIHICHICHRICCIICCROIRRCR
         .login(
            null,
            com.lunarclient.websocket.socials.v1.LoginRequest.getDefaultInstance(),
            var1 -> this.OCRRROOOOICIORIRCIROCROROHIORR.HHCHCOIHCIIROIOIOCHOOORRCOIHCI().CCHHRHRHCRHIHIHRIOICROHCHIIIHI(var1.getLinkedSocialsList())
         );
   }

   private void IOHOCCRORRHOHRROHCIHIIROIHRHOO() {
      this.HIOCCRHOROOHCHHHICHOCRCIHHOHOR
         .login(
            null,
            com.lunarclient.websocket.badge.v1.LoginRequest.getDefaultInstance(),
            var1 -> {
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = this.OCRRROOOOICIORIRCIROCROROHIORR
                  .HCOHROCRRIIHOORRCCROCROICRICIC();
               List var3;
               if (var1.getHasAllBadgesFlag()) {
                  var3 = var2.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                     .values()
                     .stream()
                     .map(com.moonsworth.lunar.client.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)
                     .toList();
               } else {
                  var3 = var1.getOwnedBadgesList()
                     .stream()
                     .map(com.moonsworth.lunar.client.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)
                     .filter(Optional::isPresent)
                     .map(Optional::get)
                     .toList();
               }

               var2.COIOORHCRHCRCOROOHCHIRRIIOIOHR(var3);
               var2.HOHIHCIHIHRCOOIOCOHIOHROHHIOHR(var1.getEquippedBadgeId());
            }
         );
   }

   private void CHIOCHOIHHHCHOIHHIIHIOHCRHRIII() {
      this.HHIHCCIIHOIRCHIIIRCHHRCCCOIRCC
         .login(
            null,
            com.lunarclient.websocket.jam.v1.LoginRequest.getDefaultInstance(),
            var0 -> IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .OIOOIHRRCRIIOCCRROOOROOIOCCOHO()
               .OHRRIORRCRIRORHRIOOCORIIRRRRRO(var0.getOwnedJamsList())
         );
   }

   private void OIORROROOROHHRIIORIHHHOCIIHRRC() {
      this.CRHRICHCCHHIHHOROCHOIHHOCCIHHH
         .login(
            null,
            com.lunarclient.websocket.spray.v1.LoginRequest.getDefaultInstance(),
            var0 -> {
               Object2LongOpenHashMap var1 = new Object2LongOpenHashMap();
               OOCCRCRCOHIIORCCORCRCIRRROIOOR var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RHOOIIHCIOORCHHHRCHORROICICIHO();
               if (!var0.getHasAllSpraysFlag()) {
                  var0.getOwnedSpraysList()
                     .forEach(
                        var2x -> {
                           com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3x = var2.HIHROCOCCHRHHRROHCRCCHOIRCHIHI(
                              var2x.getSprayId()
                           );
                           var1.put(var3x, var2x.getExpiresAt().getSeconds() * 20L);
                        }
                     );
               } else {
                  ObjectIterator var3 = var2.RCIHCRCOHOOCCRHHOOCCRCHHROIHOR().values().iterator();

                  while (var3.hasNext()) {
                     com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3.next();
                     var1.put(var4, -1L);
                  }
               }

               var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
               var2.IIRHCHHOICHRICOOCRORCCIOOIHOIR(new LinkedHashSet<>(var0.getEquippedSpraysList()));
               var2.OCIOROHIHRROROOIRRHRRCCHHRRRHI(var0.getLunarPlusFreeSprayIdsList());
               var2.OOICHHIHHIHROCCRRRIIIIRIRICCIH(var0.getMaxActiveSprays());
            }
         );
   }

   public void RHHROIIIHCCIHOCOCOHCHIHIOOIRIO() {
      this.OHHHRIHRRHICHCCOHCRCIHOICCRIRO.login(null, com.lunarclient.websocket.promotion.v1.LoginRequest.getDefaultInstance(), var1 -> {
         if (var1.getMedalPromotionState() == LoginResponse.MedalPromotionState.MEDAL_PROMOTION_STATE_AVAILABLE) {
            this.OCRRROOOOICIORIRCIROCROROHIORR.RCICCRRICHCCRHHCOCOIRCRIICCOIH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PromotionType.PROMOTION_TYPE_MEDAL);
         } else {
            this.OCRRROOOOICIORIRCIROCROROHIORR.RCICCRRICHCCRHHCOCOIRCRIICCOIH().IRCIIHHICIHRCOCRROCOICRIHHCCHH(PromotionType.PROMOTION_TYPE_MEDAL);
         }

         this.OCRRROOOOICIORIRCIROCROROHIORR.RCICCRRICHCCRHHCOCOIRCRIICCOIH().RICHHRCCHRIICHROOROCCICOIRRHCR(var1.getPendingRewardsList());
      });
   }

   @Override
   public void onClose(int var1, String var2, boolean var3) {
      this.HOICHCICORRCCOCICIIROIIRIIRHHR.HIIIRHIIHCIOOCCCCRCHRRRHCROOCC();
      String var4 = CRICRCIOOOHIIHROORIRCCORIHICCO == null ? null : CRICRCIOOOHIIHROORIRCCORIHICCO.RCHHCIORHROICHORIROHHOOHHCRIHO().orElse(null);
      CRICRCIOOOHIIHROORIRCCORIHICCO = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.CCCHCRRRIRRHICOOIOCHCHRCRICHOC);
      this.CCCHCRRRIRRHICOOIOCHCHRCRICHOC = null;
      if (CRICRCIOOOHIIHROORIRCCORIHICCO.RCHHCIORHROICHORIROHHOOHHCRIHO().isEmpty() && var4 != null) {
         CRICRCIOOOHIIHROORIRCCORIHICCO.IRRHHRCHIRRCHICHIORIICHRCHOCHR(var4);
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED);
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Assets", "Connection closed (%d, \"%s\")", var1, var2
      );
      com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Breadcrumb.debug("Disconnected from the AssetServer")
      );
      this.HCHRIROHHHCORIOCROOCHRCIOROOCI(false);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LastSeenVisibility.LAST_SEEN_VISIBILITY_UNSPECIFIED);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IncomingGiftPrivacy.INCOMING_GIFT_PRIVACY_UNSPECIFIED);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CosmeticOwnershipVisibility.COSMETIC_OWNERSHIP_VISIBILITY_UNSPECIFIED);
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(0L);
      COOCHHRROHRCCIOIOHRRIIOHCIRCCH = Location.newBuilder().setInMenus(InMenus.newBuilder().build()).build();
      this.HOHIROROCHIROOCCROHOCOORCHCORC();
      this.OCRRROOOOICIORIRCIROCROROHIORR.CICIHRIOIHHROIRHIIRORIOIIRCIRR().RRCRHRRIRRORCOOCORCRRHOCHROIIH();
      this.OCRRROOOOICIORIRCIROCROROHIORR.COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().RRCRHRRIRRORCOOCORCRRHOCHROIIH();
      this.OCRRROOOOICIORIRCIROCROROHIORR.HHCHCOIHCIIROIOIOCHOOORRCOIHCI().RRCRHRRIRRORCOOCORCRRHOCHROIIH();
      this.OCRRROOOOICIORIRCIROCROROHIORR.IHIHCOIRIHIRHICORCCHCOOICIIOIC().RRCRHRRIRRORCOOCORCRRHOCHROIIH();
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().RRCRHRRIRRORCOOCORCRRHOCHROIIH();
   }

   @Override
   public void onMessage(ByteBuffer var1) {
      ClientboundWebSocketMessage var2;
      try {
         var2 = ClientboundWebSocketMessage.parseFrom(var1);
      } catch (InvalidProtocolBufferException var10) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Assets", "Failed to parse clientbound WebSocket message"
         );
         var10.printStackTrace();
         return;
      }

      if (var2.getContentsCase() == ClientboundWebSocketMessage.ContentsCase.RPC_RESPONSE) {
         this.HOICHCICORRCCOCICIIROIIRIIRHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getRpcResponse());
      } else if (var2.getContentsCase() == ClientboundWebSocketMessage.ContentsCase.PUSH_NOTIFICATION) {
         Any var3 = var2.getPushNotification();
         if (var3.is(WebSocketRichClosePush.class)) {
            try {
               this.CCCHCRRRIRRHICOOIOCHCHRCRICHOC = var3.unpack(WebSocketRichClosePush.class);
            } catch (InvalidProtocolBufferException var8) {
            }

            return;
         }

         for (Entry var5 : this.IHHIRIHROIIORICRIIROCIIICIIIOC.entrySet()) {
            if (var3.is((Class)var5.getKey())) {
               Message var6;
               try {
                  var6 = var3.unpack((Class<Message>)var5.getKey());
               } catch (InvalidProtocolBufferException var9) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "Assets", "Failed to parse wrapped message for " + var3.getTypeUrl()
                  );
                  return;
               }

               HRHIHIRHRCHHRORRRCORHOCIRHRIOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6, (Consumer<Message>)var5.getValue());
               return;
            }
         }

         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Assets", "Failed to find handler for push notification " + var3.getTypeUrl()
         );
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Assets", "Unknown response type to consume"
         );
      }
   }

   @Override
   public void onError(Exception var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
         "Assets", "WS-Error:" + var1.getMessage()
      );
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ASSET_SERVER
      )) {
         var1.printStackTrace();
      }
   }

   @Override
   public void onMessage(String var1) {
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InboundLocation var1, BroadcastLocationChangeRequest.Trigger var2, @Nullable Runnable var3) {
      HIOCCOCHOORRCRCHCCOHHIIIOIHOOO = var1;
      this.HRHIOHRHORHOCIICRCHICCOIROORHC
         .broadcastLocationChange(
            null,
            BroadcastLocationChangeRequest.newBuilder().setNewLocation(var1).setTrigger(var2).build(),
            var3x -> {
               COOCHHRROHRCCIOIOHRRIIOHCIRCCH = var3x.getNewLocation();
               this.HOHIROROCHIROOCCROHOCOORCHCORC();
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC()
                  .ifPresent(
                     var2xx -> var2xx.RHCOOROOCIRCCCCCCCHHIOCROHRICR()
                        .updateLocation(
                           null, UpdateLocationRequest.newBuilder().setLocation(var3x.getNewLocation()).setInboundLocation(var1).build(), var0x -> {}
                        )
                  );
               if (var3 != null) {
                  var3.run();
               }
            }
         );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerRichStatus var1) {
      if (!HIOCCOCHOORRCRCHCCOHHIIIOIHOOO.hasServer()) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Assets", "Rich server status received while not on a server. (" + HIOCCOCHOORRCRCHCCOHHIIIOIHOOO.getLocationCase() + ")"
         );
      } else {
         InboundServer var2 = HIOCCOCHOORRCRCHCCOHHIIIOIHOOO.getServer();
         if (!var2.getRichStatus().equals(var1)) {
            InboundServer var3 = var2.toBuilder().setRichStatus(var1).build();
            InboundLocation var4 = InboundLocation.newBuilder().setServer(var3).build();
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, BroadcastLocationChangeRequest.Trigger.TRIGGER_SERVER_RICH_STATUS, null);
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@NotNull HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, RecordPinnedServerInteractionRequest.InteractionType var2) {
      this.IHOCORIIOCCIRCCOORRIIOOHCCHCIO
         .recordPinnedServerInteraction(
            null, RecordPinnedServerInteractionRequest.newBuilder().setServerIp(var1.bridge$serverIP()).setInteractionType(var2).build(), var0 -> {}
         );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OpenTebexJsCheckoutPush var1) {
      OCOROCROIRCHIHIHHOOIRIIIRRCRHI.OCRCHRHOCCHCHRCORHIHRRRRHCHHCH(var1.getBasketIdent(), var1.getLocale());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OpenPayNowCheckoutPush var1) {
      OCOROCROIRCHIHIHHOOIRIIIRRCRHI.HHCCIRORCRCHOIOHRRIRRRIORRCRRR(var1.getCheckoutToken());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationMessagePush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationPreSendActionPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationOwnerUpdatePush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationAddParticipantsPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationRemoveParticipantPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationUpdateNamePush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationUpdateIconPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationAddPinnedMessagePush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationRemovePinnedMessagePush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationUpdateInvitePolicyPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationUpdateNamePolicyPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationUpdateIconPolicyPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationUpdateMessagePinningPolicyPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationAddedPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationRemovedPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationRemoveMessagePush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConversationMessageHistoryDeletedPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RefreshConversationsPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.IORIICHCCOROCHIIIICCCOCIHCHHHO().IOHRRHOHCHIRRIRRHCRHIHHOCCROCO();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FriendRequestAcceptedPush var1) {
      UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getNewFriend().getUuid());
      this.OCRRROOOOICIORIRCIROCROROHIORR.OIICRCOIOOHOOHORCRCIOHRCOIIHIC().OCIIROIOORRIOIIIRHIRRCCIIRRROH(var2);
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.OCRRROOOOICIORIRCIROCROROHIORR
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .CCHORHIOORICCIRIHRIIHIICORIORO(var2);
      if (var3 == null) {
         var3 = new com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var1.getNewFriend().getUsername());
         this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
      }

      this.OCRRROOOOICIORIRCIROCROROHIORR
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            var2,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BOLD
               + var3.getName()
               + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RESET
               + " has accepted your friend request!"
         );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JoinHostedWorldPush var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getIntegratedServer();
      UUID var3 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getJoinerUuid());
      if (var2 != null && var2.bridge$getPublishedPort() != -1) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CCRHICOCOHIIRIHCOCIRCHHROHCCRR()
            .COIHOORIRRCRCRHRCIROHCHHIIRHHR()
            .add(var1.getRelaySessionId());
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CCRHICOCOHIIRIHCOCIRCHHROHCCRR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1.getSimpleVoiceChatEndpoint());
         new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            var1.getRelaySessionId(), var1.getRelay().getAddress(), var1.getRelay().getPort(), var2.bridge$getPublishedPort()
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HostedWorldStatusPush var1) {
      com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CCRHICOCOHIIRIHCOCIRCHHROHCCRR();
      if (!var2.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
         var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HostedWorldAvailablePush var1) {
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .CCHORHIOORICCIRIHRIIHIICORIORO(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getWorldHost().getUuid()));
      if (var2 == null || var2.CIIRCROIRCROCCIIHCOIHOIHOCHRCI()) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .IICHCOCCIOIIHRHHROCOIOHOHCIHCH(
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "hostedWorldAvailable", var1.getWorldHost().getUsername()
               )
            );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HostedWorldWhitelistedPush var1) {
      UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getWorldHost().getUuid());
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.OCRRROOOOICIORIRCIROCROROHIORR
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .CCHORHIOORICCIRIHRIIHIICORIORO(var2);
      if (var3 != null) {
         var3.IRHCROCOORCOOCIIOORRCCORRIOORO(true);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                  var2,
                  var3,
                  com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                     "hostedWorldWhitelisted", var1.getWorldHost().getUsername()
                  )
               )
            );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FriendRequestDeniedPush var1) {
      UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getDenierUuid());
      this.OCRRROOOOICIORIRCIROCROROHIORR.OIICRCOIOOHOOHORCRCIOHRCOIIHIC().OCIIROIOORRIOIIIRHIRRCCIIRRROH(var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FriendRequestCanceledPush var1) {
      UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getSenderUuid());
      this.OCRRROOOOICIORIRCIROCROROHIORR.OIICRCOIOOHOOHORCRCIOHRCOIIHIC().OCIIROIOORRIOIIIRHIRRCCIIRRROH(var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FriendStatusPush var1) {
      if (var1.getFriendCase() == FriendStatusPush.FriendCase.ONLINE_FRIEND) {
         OnlineFriend var2 = var1.getOnlineFriend();
         UUID var3 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getPlayer().getUuid());
         com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this.OCRRROOOOICIORIRCIROCROROHIORR
            .RORROHRORCOOOOHRROHIOHCRHHCRCO()
            .CCHORHIOORICCIRIHRIIHIICORIORO(var3);
         if (var4 == null) {
            var4 = new com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var2.getPlayer().getUsername());
         } else {
            var4.setName(var2.getPlayer().getUsername());
         }

         CORCOCICIRIOHROHROIIOOHICCHCRR var5 = CORCOCICIRIOHROHROIIOOHICCHCRR.fromProtobuf(var2.getStatus());
         if (this.OCRRROOOOICIORIRCIROCROROHIORR.HHHIHROORHHOOCCOOCHRIRHRHCRHIH().OHOHCHORHIIHCCOIHOHCCICRHHICIR().RHHIROIIIOIOIRIHRHHIRCIOOROICO().get()
            && var2.getJustCameOnline()) {
            this.OCRRROOOOICIORIRCIROCROROHIORR
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  var4.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(),
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.GREEN.toString()
                     + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BOLD
                     + var4.getName()
                     + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.WHITE
                     + " is now online"
               );
         }

         var4.CRRRICCRROCOHHOHIICIHORCOORRRH(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCOHROCRRIIHOORRCCROCROICRICIC()
               .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
               .get(var2.getBadgeId())
         );
         var4.ROCCROHOHRHROOOORROCICOCCOCORO(var2.getRankName());
         var4.OHORCCHOIOCRHROIRRHICHCIIOCRCH(var2.getLogoColor().getColor());
         var4.IOCCIOHHRCIOHOHOHCOHCRHCCRIIOI(var2.getPlusColor().getColor());
         var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5);
         var4.CCHORHIOORICCIRIHRIIHIICORIORO(System.currentTimeMillis());
         var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2.getLocation());
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getHostedWorldJoinability());
         if (var4.getHostedWorldJoinability() != Joinability.JOINABILITY_ALLOWED) {
            var4.IRHCROCOORCOOCIIOORRCCORRIOORO(false);
         }

         com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.get(var2.getMinecraftVersion().getEnum())
            .ifPresent(var4::CRRRICCRROCOHHOHIICIHORCOORRRH);
         if (var2.hasFriendsSince()) {
            var4.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getFriendsSince()));
         }

         FriendSocials var6 = var2.getSocials();
         if (var2.hasSocials()) {
            var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
         }

         if (!this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().HRRHRCCOOIOIIIRORIOOORORHOORIH(var4.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI())) {
            this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(), FriendRadioInfoPush.class);
         }

         this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
      } else if (var1.getFriendCase() == FriendStatusPush.FriendCase.OFFLINE_FRIEND) {
         OfflineFriend var7 = var1.getOfflineFriend();
         UUID var8 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7.getPlayer().getUuid());
         com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = this.OCRRROOOOICIORIRCIROCROROHIORR
            .RORROHRORCOOOOHRROHIOHCRHHCRCO()
            .CCHORHIOORICCIRIHRIIHIICORIORO(var8);
         if (var9 == null) {
            var9 = new com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8, var7.getPlayer().getUsername());
         } else {
            var9.setName(var7.getPlayer().getUsername());
         }

         var9.CRRRICCRROCOHHOHIICIHORCOORRRH(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCOHROCRRIIHOORRCCROCROICRICIC()
               .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
               .get(var7.getBadgeId())
         );
         var9.ROCCROHOHRHROOOORROCICOCCOCORO(var7.getRankName());
         var9.OHORCCHOIOCRHROIRRHICHCIIOCRCH(var7.getLogoColor().getColor());
         var9.IOCCIOHHRCIOHOHOHCOHCRHCCRIIOI(var7.getPlusColor().getColor());
         var9.IRCIIHHICIHRCOCRROCOICRIHHCCHH((Location)null);
         var9.IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.OFFLINE);
         if (var7.hasLastVisibleOnline()) {
            var9.CCHORHIOORICCIRIHRIIHIICORIORO(var7.getLastVisibleOnline().getSeconds() * 1000L);
         } else {
            var9.CCHORHIOORICCIRIHRIIHIICORIORO(-1L);
         }

         if (var7.hasFriendsSince()) {
            var9.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7.getFriendsSince()));
         }

         FriendSocials var10 = var7.getSocials();
         if (var7.hasSocials()) {
            var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10);
         }

         if (!this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().HRRHRCCOOIOIIIRORIOOORORHOORIH(var9.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI())) {
            this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(), FriendRadioInfoPush.class);
         }

         this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Assets", "Unknown friend case " + var1.getFriendCase()
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FriendRadioInfoPush var1) {
      UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getFriendUuid());
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.OCRRROOOOICIORIRCIROCROROHIORR
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .CCHORHIOORICCIRIHRIIHIICORIORO(var2);
      if (var3 == null) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1);
      } else {
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getRadioInfo());
         this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DisplayChatMessagePush var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      if (var2.bridge$getGuiIngame() != null && var2.bridge$getGuiIngame().bridge$getChatGUI() != null) {
         IHIRRIIORRHORHRORIHOROIRCORCOO var3 = var2.bridge$getGuiIngame().bridge$getChatGUI();
         var3.bridge$addMessage(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .CCRIHCIIOOIOHIRCCHIICCRHIROORC(var1.getChatMessage())
         );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DisplayNotificationPush var1) {
      String var2 = var1.getNotificationTitle();
      String var3 = var1.getNotificationMessage();
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Assets",
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
            "[" + var2 + "] " + var3
         )
      );
      this.OCRRROOOOICIORIRCIROCROROHIORR.IHCHHRRIIIORORCHIICIIOORCOIOIO().ORCOCORROHIROCCIORORRRRCHIOOCH(var2, var3);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FriendRequestReceivedPush var1) {
      UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getSender().getUuid());
      Serializable var3 = var1.getSender().getUsername();
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
         CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getSender().getUuid()),
         var1.getSender().getUsername(),
         Instant.now(),
         var1.getSenderLogoColor().getColor(),
         var1.getSenderPlusColor().getColor(),
         var1.getSenderBadgeId() > 0
            ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCOHROCRRIIHOORRCCROCROICRICIC()
               .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
               .get(var1.getSenderBadgeId())
            : null,
         var1.getSenderRankName()
      );
      this.OCRRROOOOICIORIRCIROCROROHIORR.OIICRCOIOOHOOHORCRCIOHRCOIIHIC().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4);
      this.OCRRROOOOICIORIRCIROCROROHIORR
         .IHCHHRRIIIORORCHIICIIOORCOIOIO()
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            var2,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BOLD
               + var3
               + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RESET
               + " wants to be your friend"
         );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FriendRemovedYouPush var1) {
      UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getFriendUuid());
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.OCRRROOOOICIORIRCIROCROROHIORR
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .CCHORHIOORICCIRIHRIIHIICORIORO(var2);
      if (var3 != null) {
         this.OCRRROOOOICIORIRCIROCROROHIORR.RORROHRORCOOOOHRROHIOHCRHHCRCO().OCIIROIOORRIOIIIRHIRRCCIIRRROH(var2);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PlayerCosmeticsPushV2 var1) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         || this.ICROIRICORRHRCRRIOOCCRRIIOHICI) {
         UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPlayerUuid());
         this.OCRRROOOOICIORIRCIROCROROHIORR.HCCICHCRRIICICCHCIRCRRIIRROHHC().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1, var1.getBadgeId());
         this.OCRRROOOOICIORIRCIROCROROHIORR.RCRIIICORIICOIIOHIIHICCCOCRICC().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IOHRIRCHOCIOIOIHIHOCCCHOHOHOCH().CHHIICHRIIROIOHIHIIROICOCCROCI(var2);
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, PlayerRadioPush.class);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PlayerRadioPush var1) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         || this.ICROIRICORRHRCRRIOOCCRRIIOHICI) {
         UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPlayerUuid());
         this.OCRRROOOOICIORIRCIROCROROHIORR.HCCICHCRRIICICCHCIRCRRIIRROHHC().CIIIIHORRORIHCCOOOOCIIRORCIOOH().compute(var2, (var2x, var3) -> {
            if (var3 == null) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x, var1);
               return null;
            } else {
               return var3.RHIOICROIRRRIROHIHICIRRHCCIRHO(var1.getRadioPlaying());
            }
         });
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UseEmotePush var1) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         || this.ICROIRICORRHRCRRIOOCCRRIIOHICI) {
         UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPlayerUuid());
         if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .HIRIIHHOCHORROOOHCOIHCHICCOOIH()
            .get()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getPlayer();
            if (var5 != null && var2.equals(var5.bridge$getUniqueID())) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups", "emotesDisabled")
                  );
            }
         } else {
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.OCRRROOOOICIORIRCIROCROROHIORR
               .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
               .RCCRRRIHRRHCIIHRIOHHROHIOOCRIC(var1.getEmoteId());
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
            if (var4 != null) {
               var4.bridge$getPlayerByUniqueId(var2)
                  .ifPresent(
                     var3x -> {
                        if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                           .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                           .OCOHORHCROHICRRIHCIHHRRCIHICRI(var3x)) {
                           com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4x = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCCIIOHOROCIICCOOORHCHRRCHROHC()
                              .get(var1.getEmoteJamId());
                           this.OCRRROOOOICIORIRCIROCROROHIORR
                              .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                 var3x, var3, var1.getEmoteMetadata(), var1.getEmoteSoundtrackUrl(), var4x != null ? var4x.getId() : 0
                              );
                        }
                     }
                  );
            }

            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StopEmotePush var1) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         || this.ICROIRICORRHRCRRIOOCCRRIIOHICI) {
         UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPlayerUuid());
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
         if (var3 != null) {
            var3.bridge$getPlayerByUniqueId(var2)
               .ifPresent(var1x -> this.OCRRROOOOICIORIRCIROCROROHIORR.COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, null, 0, null, 0));
         }

         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Message var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      Any var2;
      if (var3.isRecording()) {
         var2 = Any.pack(var1);
         var3.OHOHRHIIIIIORCIHCHCHCIIHOOIIOI().OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
      } else {
         var2 = null;
      }

      com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         )
         .ifPresent(
            var2x -> {
               if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .HOOHRIIRIHCIHIIHIOHHOHHORIOHOR()
                  .isEnabled()) {
                  var2x.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2 == null ? Any.pack(var1) : var2);
               }
            }
         );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UseSprayPush var1) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         || this.ICROIRICORRHRCRRIOOCCRRIIOHICI) {
         UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPlayerUuid());
         if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .OHOOHIHIHRHHIHRCIORHORIRCIHCRC()
            .get()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getPlayer();
            if (var4 != null && var2.equals(var4.bridge$getUniqueID())) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups", "spraysDisabled")
                  );
            }
         } else {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
            if (var3 != null) {
               var3.bridge$getPlayerByUniqueId(var2)
                  .ifPresent(
                     var3x -> {
                        if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                           .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                           .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var3x)) {
                           Vector3f var4x = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPos());
                           OOCCRCRCOHIIORCCORCRCIRRROIOOR var5 = this.OCRRROOOOICIORIRCIROCROROHIORR.RHOOIIHCIOORCHHHRCHORROICICIHO();
                           com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = var5.HIHROCOCCHRHHRROHCRCCHOIRCHIHI(
                              var1.getSprayId()
                           );
                           if (var6 != null) {
                              com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH var7 = var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                 var6, var4x, CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getFacing()), var1.getRotation()
                              );
                              if (var7 != null) {
                                 double var8 = var3x.bridge$blockInteractionRange() * 1.6;
                                 if (var3x.CORCOCICIRIOHROHROIIOOHICCHCRR(var4x.x, var4x.y, var4x.z) <= var8) {
                                    var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var7, var1.getMaxActiveSprays(), false);
                                 }
                              }
                           }
                        }
                     }
                  );
            }

            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RemoveSprayPush var1) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         || this.ICROIRICORRHRCRRIOOCCRRIIOHICI) {
         this.OCRRROOOOICIORIRCIROCROROHIORR
            .RHOOIIHCIOORCHHHRCHORROICICIHO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPlayerUuid()),
               CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getPos())
            );
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RefreshMetadataPush var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCRRCCORORHORHOOIOIRCROCIROOCR().IHIRRIIORRHORHRORIHOROIRCORCOO(null);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RefreshEmotesPush var1) {
      this.HRIOCRHIOOHOHOCRCROIIRORHICICC();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RefreshCosmeticsPush var1) {
      this.CCCIOOHOCOCHCRIRHIIORCRIOOIRHO();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RefreshSocialsPush var1) {
      this.HROHRRCRRHOIRHIRICOOROHRRRORIH();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RefreshBadgesPush var1) {
      this.IOHOCCRORRHOHRROHCIHIIROIHRHOO();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RefreshJamsPush var1) {
      this.CHIOCHOIHHHCHOIHHIIHIOHCRHRIII();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DungeonUpdatePush var1) {
      com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         )
         .flatMap(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::OCHICCHCROOOHRHCIIIIHORRCRCROO
         )
         .ifPresent(var1x -> var1x.RHIOHIRIHHCIHRIIIIIOIRRHRHRIII().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1));
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(NewMarkerPush var1) {
      UUID var2 = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getSenderUuid());
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRCOIOICOHCCICIHRROICHRCRRORII()
         .OOOOICRCCHRHOHHICHCORRHIIHIIRC()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1.getMarker());
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      this.RIROOHCHCHIHCOHOICHOCRHCHHOIIC = var1;
      this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("state", var1.getId());
      if (var1 == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED) {
         this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("cosmeticState", var1.getId());
         this.OCIRIHHHIICCRCHICCCHHHHIOHCHHH();
      }
   }

   private void OCIRIHHHIICCRCHICCCHHHHIOHCHHH() {
      this.OCRRROOOOICIORIRCIROCROROHIORR.HOICCHRHOCIORIICICCOOIHRRHIIOR().CHCCOIRIORCCOCHCCOCRCHOHCORHII();
      this.RCIICOICCOIOCCCHCOOCCRHRIHOOHI();
   }

   private void RCIICOICCOIOCCCHCOOCCRHRIHOOHI() {
      this.OHHCOORRRORHHICIICRCCHRRRHOCOO
         .IIHRRHORCRCROCHHOHORCHCROCIHRO(
            "serverDiscovery", this.OCRRROOOOICIORIRCIROCROROHIORR.HOICCHRHOCIORIICICCOOIHRRHIIOR().RHHROHCHCIIHCHICOCHHCCIOOIRIOH()
         );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerSectionCardsPush var1) {
      this.OCRRROOOOICIORIRCIROCROROHIORR.HOICCHRHOCIORIICICCOOIHRRHIIOR().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   public void HCHRIROHHHCORIOCROOCHRCIOROOCI(boolean var1) {
      this.RCCCROCCCRORIOCIROROOOHHHRCHRO = var1;
      this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("allowFriendRequests", var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LastSeenVisibility var1) {
      this.IRROICROIHCCCRRHIHCCOOCOOOHOCI = var1;
      this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("lastSeenVisibility", var1.name());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IncomingGiftPrivacy var1) {
      this.CIRIOIHIRCCCRORHRCHIRCHOCHHCHH = var1;
      this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("incomingGiftPrivacy", var1.name());
   }

   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(long var1) {
      this.IHRCOHHOHRHHOCCCCRHOIICHCOCORC = var1;
      this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("coins", var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CosmeticOwnershipVisibility var1) {
      this.IRIRHCHIORRHIOHOICORICRIHRCRHI = var1;
      this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("cosmeticOwnershipVisibility", var1.name());
   }

   public static void bootstrap() {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
            var0 -> {
               if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null
                  && !com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().ROCIHHOOOHCROIRIRCHRICCICOHRIR()) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO().isEmpty()
                     || IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO().get().ROORROCCCRCRCOHHOROROIRHCIROHR()
                        == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED) {
                     if (CRICRCIOOOHIIHROORIRCCORIHICCO == null) {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           "Assets Reconnect", "There was no closedConnection for a disconnected player."
                        );
                        CRICRCIOOOHIIHROORIRCCORIHICCO = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(null);
                     }

                     if (CRICRCIOOOHIIHROORIRCCORIHICCO.OICHRIIHIORHOOOIOCHHOCRORIHIOH()) {
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRICRCIOOOHIIHROORIRCCORIHICCO);
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           "Assets Reconnect", "Reconnecting to the assets server..."
                        );
                     }
                  }
               }
            }
         );
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
            var0 -> IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
               .ifPresent(
                  var1 -> var1.HCRCHOCOIOIIIRRCOIOORIHHRIIROO()
                     .broadcastServerKick(null, BroadcastServerKickRequest.newBuilder().setKickReason(var0.getReason()).build(), var0xx -> {})
               )
         );
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
            var0 -> IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
               .ifPresent(
                  var0x -> var0x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     InboundLocation.newBuilder().setInMenus(InboundInMenus.getDefaultInstance()).build(),
                     BroadcastLocationChangeRequest.Trigger.TRIGGER_DISCONNECT_EVENT,
                     null
                  )
               )
         );
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.class,
            var0 -> IROHORIIHOCCORRIHICCROIHRRIRCI()
         );
   }

   public static void IROHORIIHOCCORRIHICCROIHRRIRCI() {
      com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CCRHICOCOHIIRIHCOCIRCHHROHCCRR();
      if (!var0.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO().orElse(null);
         if (var1 != null) {
            Runnable var3 = null;
            InboundLocation var2;
            if (var0.CIOOORRCOROIHHIHIOIRRRHRHOORRR() != null) {
               var2 = InboundLocation.newBuilder()
                  .setHostedWorld(
                     InboundHostedWorld.newBuilder()
                        .setWorldHost(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var0.CIOOORRCOROIHHIHIOIRRRHRHOORRR()))
                        .build()
                  )
                  .build();
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
               .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
                  .HOROHROIORRIRIIIOOCCIROCRCROHI();
               var2 = InboundLocation.newBuilder()
                  .setRewindWorld(
                     InboundRewindWorld.newBuilder()
                        .setType(
                           var4.HOCCHIRHIIOOOIHIHHICHRIRIHHHRO() != null && var4.HOCCHIRHIIOOOIHIHHICHRIRIHHHRO().IOHHOICRCORHRCICOCHIORRHHHCORC()
                              ? InboundRewindWorld.RewindWorldType.REWIND_WORLD_TYPE_PREVIEW
                              : InboundRewindWorld.RewindWorldType.REWIND_WORLD_TYPE_PROJECT
                        )
                        .build()
                  )
                  .build();
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .HOOHRIIRIHCIHIIHIOHHOHHORIOHOR()
               .CIHCIHCORCICOHIRICHRRIORROOICH()) {
               var2 = InboundLocation.newBuilder().setReplayWorld(InboundReplayWorld.getDefaultInstance()).build();
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentServerData() == null) {
               var2 = InboundLocation.newBuilder().setSinglePlayer(InboundSinglePlayer.getDefaultInstance()).build();
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isConnectedToRealms()) {
               var2 = InboundLocation.newBuilder().setMinecraftRealms(InboundMinecraftRealms.getDefaultInstance()).build();
            } else {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getCurrentServerData();
               var2 = InboundLocation.newBuilder().setServer(InboundServer.newBuilder().setServerIp(var5.bridge$serverIP()).build()).build();
               var3 = () -> {
                  if (var5.bridge$wasPinnedClicked()) {
                     var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, RecordPinnedServerInteractionRequest.InteractionType.INTERACTION_TYPE_PLAY);
                     var5.bridge$setPinnedClicked(false);
                  }
               };
               if (HIOCCOCHOORRCRCHCCOHHIIIOIHOOO.hasServer()
                  && HIOCCOCHOORRCRCHCCOHHIIIOIHOOO.getServer().getServerIp().equals(var2.getServer().getServerIp())) {
                  return;
               }
            }

            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, BroadcastLocationChangeRequest.Trigger.TRIGGER_JOIN_EVENT, var3);
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SessionIdentifyPush var1) {
      IOICHORCOOIICOOCOIHIOCIIRCCIHC = CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getSessionId());
   }

   private void HOHIROROCHIROOCCROHOCOORCHCORC() {
      JsonObject var1 = RCOCRROHHROHHOCRCCCHCIROIIOORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RROHIIOHORHICRHIHCCRRRHIHCHRCC().HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(),
         COOCHHRROHRCCIOIOHRRIIOHCIRCCH,
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RROHIIOHORHICRHIHCCRRRHIHCHRCC().CIHIIIROIRCIRROICHIHHCOHCCHHOC(),
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RROHIIOHORHICRHIHCCRRRHIHCHRCC().RCCCCICCICIHHCOORIIOCRCCROIOCI()
      );
      this.OHHCOORRRORHHICIICRCCHRRRHOCOO.IIHRRHORCRCROCHHOHORCHCROCIHRO("statusDetails", var1);
   }

   @Generated
   public static UUID CIIHCIOHIICOOOOIIOIRCICRRICCOH() {
      return IOICHORCOOIICOOCOIHIOCIIRCCIHC;
   }

   @Generated
   public static void RHOCHHIRRCHHHOHOIRROIROHHHIHIO(UUID var0) {
      IOICHORCOOIICOOCOIHIOCIIRCCIHC = var0;
   }

   @Generated
   public static InboundLocation CRHHOHCOORHRIIRCHCHCORIIORCOHC() {
      return HIOCCOCHOORRCRCHCCOHHIIIOIHOOO;
   }

   @Generated
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InboundLocation var0) {
      HIOCCOCHOORRCRCHCCOHHIIIOIHOOO = var0;
   }

   @Generated
   public static Location HORCOHHRCCOICRCIOHHRRHHCRHCCOR() {
      return COOCHHRROHRCCIOIOHRRIIOHCIRCCH;
   }

   @Generated
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Location var0) {
      COOCHHRROHRCCIOIOHRRIIOHCIRCCH = var0;
   }

   @Generated
   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0) {
      CRICRCIOOOHIIHROORIRCCORIHICCO = var0;
   }

   @Generated
   public ApolloService.Interface OCCCOHHOICRHORIICHHRCCCRHOOCII() {
      return this.CCROCCHOCHCIRCIHROHHICIHIICROH;
   }

   @Generated
   public ConversationService.Interface OOIOOICRHHHIICOHOHCOHCRRRCRCHH() {
      return this.HIRHCCCROOHORORRRRCHICHROHRRIH;
   }

   @Generated
   public CosmeticService.Interface RRICCCRROHRIHHIOCIRCOCCIRHHIIO() {
      return this.HOIIROHHIIROROHCRROHCORIOHCIHH;
   }

   @Generated
   public RadioService.Interface CRHOICIHHOCICHICICRRORHOHRIROH() {
      return this.CRIRROHICRHRROCIHOHRCICCRCORHO;
   }

   @Generated
   public StoreService.Interface HRCHHIRIHROOIHHRCHICORRROHRCRR() {
      return this.ROCICROOOORCIRIIRRCICIHRHIORHH;
   }

   @Generated
   public EmoteService.Interface RRIOIROCRCCCCROHHCRHOOROOHRROI() {
      return this.OCHRROICICIRRCOCRRRICIIRCHIORR;
   }

   @Generated
   public SprayService.Interface ORRHICRCROIRCICRCCIRRIRHCRICRI() {
      return this.CRHRICHCCHHIHHOROCHOIHHOCCIHHH;
   }

   @Generated
   public BadgeService.Interface ICRIIOCRRORIOIIRORHORIOHHCCOCO() {
      return this.HIOCCRHOROOHCHHHICHOCRCIHHOHOR;
   }

   @Generated
   public FriendService.Interface HCRCHOCOIOIIIRRCOIOORIHHRIIROO() {
      return this.HRHIOHRHORHOCIICRCHICCOIROORHC;
   }

   @Generated
   public HeartbeatService.Interface HRHIRCRROIHRIOHCOOCCHIHCCROHRR() {
      return this.OICCIICHOOHHCCRCRCCRHCOCHHROCO;
   }

   @Generated
   public NotificationService.Interface OIRHCCHIOOIIIOIRCHCOHOHOIOCIOC() {
      return this.IRIRIIIOOCOIIICRHHRHROHHCHORCI;
   }

   @Generated
   public SubscriptionService.Interface IOHCCHCCHHRRRICOCRHHIRICCCCOOO() {
      return this.CCOOHCORIOIRCOICIOIOOCRIICCHCO;
   }

   @Generated
   public LegacyApiService.Interface RICIRORIRHHIHIICHOHROROHRIIOOR() {
      return this.IIIOIHOHRIROHRIIHIHHIHHOOHRRHI;
   }

   @Generated
   public PerformanceService.Interface HHHROIRRRRCHCHROHCORIIOHOIIOCC() {
      return this.CIRRHIRCICHCCRCIICOIORROOCHOIC;
   }

   @Generated
   public HostedWorldService.Interface IRROIHHOOHCIOHICHHROOOCOCHCCOI() {
      return this.ROHOCIORHOICIICRIIHOCICCHIICHH;
   }

   @Generated
   public AnalyticsService.Interface IOIOORHICOIOOHCRIIROHCIROICCCO() {
      return this.IHOCORIIOCCIRCCOORRIIOOHCCHCIO;
   }

   @Generated
   public LiveExperienceService.Interface OHORCIHORHOCIRIIIRCCRHRCOCCHCH() {
      return this.HRRHORHIOHORCHHCRIOCRRCIRIRIOO;
   }

   @Generated
   public ScreenshotService.Interface HIRROHCROOOIRHOOCRIRRORORIIRCI() {
      return this.HOIIRIICCOOHHRHOROOOHRHRRHHOCH;
   }

   @Generated
   public ServerService.Interface CRHHIRIIHRRIRCOHRIORHORCOCIHHI() {
      return this.HIHHHCRRHCORRCHCHHIRRIRROCIOCC;
   }

   @Generated
   public SocialsService.Interface ICRIHROIRHIHOCOOCRCHCHRRCHOHHC() {
      return this.IICCHHIIHICHICHRICCIICCROIRRCR;
   }

   @Generated
   public JamService.Interface RCRCORCICHOIHRHRCICOCCIRHIHICR() {
      return this.HHIHCCIIHOIRCHIIIRCHHRCCCOIRCC;
   }

   @Generated
   public SkyblockService.Interface CIRORIOCCCICOHIHRICOHOCIICIOIH() {
      return this.COIOIIOOCIRCCHIRHHCOROOHHCOIIC;
   }

   @Generated
   public PromotionService.Interface HCORIRRICOOCHCORIIIROIOCHOCCCR() {
      return this.OHHHRIHRRHICHCCOHCRCIHOICCRIRO;
   }

   @Generated
   public MarkerService.Interface HHOHOCIOHIHHCCOCIOROCIHRORCIHI() {
      return this.OOCIHORCCHOIHHRCHRICHOCIHHRCOI;
   }

   @Generated
   public ServerDiscoveryService.Interface ROOCHOCCIHCIIIRHHCROCIHHCICOIH() {
      return this.HIHICIOOHRRHIOIIIIHCCRRCHCRHCI;
   }

   @Generated
   public void CCIHHRIOOOOCOHRCIHOHROOICIORCC(boolean var1) {
      this.ICROIRICORRHRCRRIOOCCRRIIOHICI = var1;
   }

   @Generated
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.OHHCOORRRORHHICIICRCCHRRRHOCOO;
   }

   @Generated
   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ROORROCCCRCRCOHHOROROIRHCIROHR() {
      return this.RIROOHCHCHIHCOHOICHOCRHCHHOIIC;
   }

   @Generated
   public boolean CCICICRIROHROHHOICIRHICOICIICC() {
      return this.RCCCROCCCRORIOCIROROOOHHHRCHRO;
   }

   @Generated
   public LastSeenVisibility getLastSeenVisibility() {
      return this.IRROICROIHCCCRRHIHCCOOCOOOHOCI;
   }

   @Generated
   public IncomingGiftPrivacy getIncomingGiftPrivacy() {
      return this.CIRIOIHIRCCCRORHRCHIRCHOCHHCHH;
   }

   @Generated
   public CosmeticOwnershipVisibility getCosmeticOwnershipVisibility() {
      return this.IRIRHCHIORRHIOHOICORICRIHRCRHI;
   }

   @Generated
   public long ORCROCOOIHHHHOOHOIRIIHHCRIHIRR() {
      return this.IHRCOHHOHRHHOCCCCRHOIICHCOCORC;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH RCRIHICRIIROCHHHHCROCRCHHRIIOI() {
      return this.HHHCIHORICHROCOCRRRCCCICOCOORI;
   }
}
