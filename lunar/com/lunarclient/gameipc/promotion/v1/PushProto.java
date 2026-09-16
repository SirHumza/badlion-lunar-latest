package com.lunarclient.gameipc.promotion.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_promotion_v1_PendingPromotionUpdatePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_promotion_v1_PendingPromotionUpdatePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_promotion_v1_PendingPromotionUpdatePush_descriptor, new String[]{"HasPendingPromotion", "PendingPromotions"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PushProto() {
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
         "\n+lunarclient/gameipc/promotion/v1/push.proto\u0012 lunarclient.gameipc.promotion.v1\u001a-lunarclient/gameipc/promotion/v1/common.proto\"´\u0001\n\u001aPendingPromotionUpdatePush\u00126\n\u0015has_pending_promotion\u0018\u0001 \u0001(\bB\u0002\u0018\u0001R\u0013hasPendingPromotion\u0012^\n\u0012pending_promotions\u0018\u0002 \u0003(\u000e2/.lunarclient.gameipc.promotion.v1.PromotionTypeR\u0011pendingPromotionsBÔ\u0001\n$com.lunarclient.gameipc.promotion.v1B\tPushProtoP\u0001¢\u0002\u0003LGPª\u0002 Lunarclient.Gameipc.Promotion.V1Ê\u0002 Lunarclient\\Gameipc\\Promotion\\V1â\u0002,Lunarclient\\Gameipc\\Promotion\\V1\\GPBMetadataê\u0002#Lunarclient::Gameipc::Promotion::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      CommonProto.getDescriptor();
   }
}
