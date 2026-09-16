package com.lunarclient.gameipc.promotion.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_promotion_v1_CheckPendingPromotionRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_promotion_v1_CheckPendingPromotionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_promotion_v1_CheckPendingPromotionRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_promotion_v1_CheckPendingPromotionResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_promotion_v1_CheckPendingPromotionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_promotion_v1_CheckPendingPromotionResponse_descriptor, new String[]{"HasPendingPromotion", "PendingPromotions"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionRequest_descriptor, new String[]{"Type"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionResponse_descriptor, new String[0]
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
         "\n.lunarclient/gameipc/promotion/v1/service.proto\u0012 lunarclient.gameipc.promotion.v1\u001a-lunarclient/gameipc/promotion/v1/common.proto\"\u001e\n\u001cCheckPendingPromotionRequest\"·\u0001\n\u001dCheckPendingPromotionResponse\u00126\n\u0015has_pending_promotion\u0018\u0001 \u0001(\bB\u0002\u0018\u0001R\u0013hasPendingPromotion\u0012^\n\u0012pending_promotions\u0018\u0002 \u0003(\u000e2/.lunarclient.gameipc.promotion.v1.PromotionTypeR\u0011pendingPromotions\"[\n\u0014PlayPromotionRequest\u0012C\n\u0004type\u0018\u0001 \u0001(\u000e2/.lunarclient.gameipc.promotion.v1.PromotionTypeR\u0004type\"\u0017\n\u0015PlayPromotionResponse2°\u0002\n\u0010PromotionService\u0012\u0098\u0001\n\u0015CheckPendingPromotion\u0012>.lunarclient.gameipc.promotion.v1.CheckPendingPromotionRequest\u001a?.lunarclient.gameipc.promotion.v1.CheckPendingPromotionResponse\u0012\u0080\u0001\n\rPlayPromotion\u00126.lunarclient.gameipc.promotion.v1.PlayPromotionRequest\u001a7.lunarclient.gameipc.promotion.v1.PlayPromotionResponseBÚ\u0001\n$com.lunarclient.gameipc.promotion.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LGPª\u0002 Lunarclient.Gameipc.Promotion.V1Ê\u0002 Lunarclient\\Gameipc\\Promotion\\V1â\u0002,Lunarclient\\Gameipc\\Promotion\\V1\\GPBMetadataê\u0002#Lunarclient::Gameipc::Promotion::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      CommonProto.getDescriptor();
   }
}
