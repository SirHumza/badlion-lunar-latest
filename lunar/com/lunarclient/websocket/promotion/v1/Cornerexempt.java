package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_LoginResponse_descriptor,
      new String[]{"CornerExempt", "ShowAds", "OutplayedPromotionState", "PendingRewards", "MedalPromotionState"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewRequest_descriptor, new String[]{"PromotionId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewRequest_descriptor, new String[]{"PromotionId", "Completed"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewResponse_descriptor, new String[]{"Rewards"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardRequest_descriptor, new String[]{"Initiator"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardResponse_descriptor, new String[]{"Result"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardRequest_descriptor, new String[]{"Solution"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardResponse_descriptor, new String[]{"Result"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardRequest_descriptor, new String[]{"Initiator", "Type", "Reward"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardResponse_descriptor, new String[]{"Result"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServiceProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n0lunarclient/websocket/promotion/v1/service.proto\u0012\"lunarclient.websocket.promotion.v1\u001a/lunarclient/websocket/promotion/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"\u000e\n\fLoginRequest\"¢\u0006\n\rLoginResponse\u0012'\n\rcorner_exempt\u0018\u0001 \u0001(\bB\u0002\u0018\u0001R\fcornerExempt\u0012\u0019\n\bshow_ads\u0018\u0002 \u0001(\bR\u0007showAds\u0012\u0085\u0001\n\u0019outplayed_promotion_state\u0018\u0003 \u0001(\u000e2I.lunarclient.websocket.promotion.v1.LoginResponse.OutplayedPromotionStateR\u0017outplayedPromotionState\u0012Z\n\u000fpending_rewards\u0018\u0004 \u0003(\u000b21.lunarclient.websocket.promotion.v1.PendingRewardR\u000ependingRewards\u0012y\n\u0015medal_promotion_state\u0018\u0005 \u0001(\u000e2E.lunarclient.websocket.promotion.v1.LoginResponse.MedalPromotionStateR\u0013medalPromotionState\"¿\u0001\n\u0017OutplayedPromotionState\u0012)\n%OUTPLAYED_PROMOTION_STATE_UNSPECIFIED\u0010\u0000\u0012)\n%OUTPLAYED_PROMOTION_STATE_UNAVAILABLE\u0010\u0001\u0012'\n#OUTPLAYED_PROMOTION_STATE_AVAILABLE\u0010\u0002\u0012%\n!OUTPLAYED_PROMOTION_STATE_CLAIMED\u0010\u0003\"«\u0001\n\u0013MedalPromotionState\u0012%\n!MEDAL_PROMOTION_STATE_UNSPECIFIED\u0010\u0000\u0012%\n!MEDAL_PROMOTION_STATE_UNAVAILABLE\u0010\u0001\u0012#\n\u001fMEDAL_PROMOTION_STATE_AVAILABLE\u0010\u0002\u0012!\n\u001dMEDAL_PROMOTION_STATE_CLAIMED\u0010\u0003\">\n\u0019StartPromotionViewRequest\u0012!\n\fpromotion_id\u0018\u0001 \u0001(\tR\u000bpromotionId\"\u001c\n\u001aStartPromotionViewResponse\"Z\n\u0017EndPromotionViewRequest\u0012!\n\fpromotion_id\u0018\u0001 \u0001(\tR\u000bpromotionId\u0012\u001c\n\tcompleted\u0018\u0002 \u0001(\bR\tcompleted\"i\n\u0018EndPromotionViewResponse\u0012M\n\u0007rewards\u0018\u0001 \u0003(\u000b23.lunarclient.websocket.promotion.v1.PromotionRewardR\u0007rewards\"Ô\u0002\n\u001bClaimOutplayedRewardRequest\u0012g\n\tinitiator\u0018\u0001 \u0001(\u000e2I.lunarclient.websocket.promotion.v1.ClaimOutplayedRewardRequest.InitiatorR\tinitiator\"Ë\u0001\n\tInitiator\u0012\u0019\n\u0015INITIATOR_UNSPECIFIED\u0010\u0000\u0012\u0014\n\u0010INITIATOR_TOPBAR\u0010\u0001\u0012\u0015\n\u0011INITIATOR_SIDEBAR\u0010\u0002\u0012\u001c\n\u0018INITIATOR_HOME_BLOG_POST\u0010\u0003\u0012\u001a\n\u0016INITIATOR_ANNOUNCEMENT\u0010\u0004\u0012\u001f\n\u001bINITIATOR_HOME_CAROUSEL_CTA\u0010\u0005\u0012\u001b\n\u0017INITIATOR_GAME_HOME_CTA\u0010\u0006\"Ã\u0002\n\u001cClaimOutplayedRewardResponse\u0012_\n\u0006result\u0018\u0001 \u0001(\u000e2G.lunarclient.websocket.promotion.v1.ClaimOutplayedRewardResponse.ResultR\u0006result\"Á\u0001\n\u0006Result\u0012\u0016\n\u0012RESULT_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eRESULT_SUCCESS\u0010\u0001\u0012!\n\u001dRESULT_PLAYER_ALREADY_CLAIMED\u0010\u0002\u0012,\n(RESULT_OUTPLAYED_INSTALL_ALREADY_CLAIMED\u0010\u0003\u0012\u0016\n\u0012RESULT_NOT_WINDOWS\u0010\u0004\u0012\"\n\u001eRESULT_OUTPLAYED_NOT_INSTALLED\u0010\u0005\"<\n\u001eClaimRewindPuzzleRewardRequest\u0012\u001a\n\bsolution\u0018\u0001 \u0001(\tR\bsolution\"\u009f\u0002\n\u001fClaimRewindPuzzleRewardResponse\u0012b\n\u0006result\u0018\u0001 \u0001(\u000e2J.lunarclient.websocket.promotion.v1.ClaimRewindPuzzleRewardResponse.ResultR\u0006result\"\u0097\u0001\n\u0006Result\u0012\u0016\n\u0012RESULT_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eRESULT_SUCCESS\u0010\u0001\u0012\u001d\n\u0019RESULT_INCORRECT_SOLUTION\u0010\u0002\u0012!\n\u001dRESULT_PLAYER_ALREADY_CLAIMED\u0010\u0003\u0012\u001f\n\u001bRESULT_MAX_REWARDS_EXCEEDED\u0010\u0004\"Û\u0002\n\u0019ClaimPendingRewardRequest\u0012e\n\tinitiator\u0018\u0001 \u0001(\u000e2G.lunarclient.websocket.promotion.v1.ClaimPendingRewardRequest.InitiatorR\tinitiator\u0012I\n\u0004type\u0018\u0002 \u0001(\u000e25.lunarclient.websocket.promotion.v1.PendingRewardTypeR\u0004type\u0012K\n\u0006reward\u0018\u0003 \u0001(\u000b23.lunarclient.websocket.promotion.v1.PromotionRewardR\u0006reward\"?\n\tInitiator\u0012\u0019\n\u0015INITIATOR_UNSPECIFIED\u0010\u0000\u0012\u0017\n\u0013INITIATOR_GAME_HOME\u0010\u0001\"õ\u0001\n\u001aClaimPendingRewardResponse\u0012]\n\u0006result\u0018\u0001 \u0001(\u000e2E.lunarclient.websocket.promotion.v1.ClaimPendingRewardResponse.ResultR\u0006result\"x\n\u0006Result\u0012\u0016\n\u0012RESULT_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eRESULT_SUCCESS\u0010\u0001\u0012\u001f\n\u001bRESULT_PLAYER_ALREADY_OWNED\u0010\u0002\u0012!\n\u001dRESULT_PLAYER_ALREADY_CLAIMED\u0010\u00032¡\u0007\n\u0010PromotionService\u0012r\n\u0005Login\u00120.lunarclient.websocket.promotion.v1.LoginRequest\u001a1.lunarclient.websocket.promotion.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0099\u0001\n\u0012StartPromotionView\u0012=.lunarclient.websocket.promotion.v1.StartPromotionViewRequest\u001a>.lunarclient.websocket.promotion.v1.StartPromotionViewResponse\"\u0004\u0088µ\u0018\u0002\u0012\u0093\u0001\n\u0010EndPromotionView\u0012;.lunarclient.websocket.promotion.v1.EndPromotionViewRequest\u001a<.lunarclient.websocket.promotion.v1.EndPromotionViewResponse\"\u0004\u0088µ\u0018\u0002\u0012\u009f\u0001\n\u0014ClaimOutplayedReward\u0012?.lunarclient.websocket.promotion.v1.ClaimOutplayedRewardRequest\u001a@.lunarclient.websocket.promotion.v1.ClaimOutplayedRewardResponse\"\u0004\u0088µ\u0018\u0002\u0012¨\u0001\n\u0017ClaimRewindPuzzleReward\u0012B.lunarclient.websocket.promotion.v1.ClaimRewindPuzzleRewardRequest\u001aC.lunarclient.websocket.promotion.v1.ClaimRewindPuzzleRewardResponse\"\u0004\u0088µ\u0018\u0002\u0012\u0099\u0001\n\u0012ClaimPendingReward\u0012=.lunarclient.websocket.promotion.v1.ClaimPendingRewardRequest\u001a>.lunarclient.websocket.promotion.v1.ClaimPendingRewardResponse\"\u0004\u0088µ\u0018\u0003Bä\u0001\n&com.lunarclient.websocket.promotion.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWPª\u0002\"Lunarclient.Websocket.Promotion.V1Ê\u0002\"Lunarclient\\Websocket\\Promotion\\V1â\u0002.Lunarclient\\Websocket\\Promotion\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Promotion::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor(), com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor()}
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
   }
}
