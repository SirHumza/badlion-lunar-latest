package com.lunarclient.gameipc.promotion.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;

public final class CommonProto {
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
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
         "\n-lunarclient/gameipc/promotion/v1/common.proto\u0012 lunarclient.gameipc.promotion.v1*\u0081\u0001\n\rPromotionType\u0012\u001e\n\u001aPROMOTION_TYPE_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014PROMOTION_TYPE_VIDEO\u0010\u0001\u0012\u001c\n\u0018PROMOTION_TYPE_OUTPLAYED\u0010\u0002\u0012\u0018\n\u0014PROMOTION_TYPE_MEDAL\u0010\u0003BÖ\u0001\n$com.lunarclient.gameipc.promotion.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LGPª\u0002 Lunarclient.Gameipc.Promotion.V1Ê\u0002 Lunarclient\\Gameipc\\Promotion\\V1â\u0002,Lunarclient\\Gameipc\\Promotion\\V1\\GPBMetadataê\u0002#Lunarclient::Gameipc::Promotion::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
