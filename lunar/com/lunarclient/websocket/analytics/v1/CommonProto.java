package com.lunarclient.websocket.analytics.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_analytics_v1_CounterUpdate_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_analytics_v1_CounterUpdate_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_analytics_v1_CounterUpdate_descriptor, new String[]{"Counter", "Delta"}
   );
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
         "\n/lunarclient/websocket/analytics/v1/common.proto\u0012\"lunarclient.websocket.analytics.v1\"?\n\rCounterUpdate\u0012\u0018\n\u0007counter\u0018\u0001 \u0001(\tR\u0007counter\u0012\u0014\n\u0005delta\u0018\u0002 \u0001(\u0005R\u0005deltaBà\u0001\n&com.lunarclient.websocket.analytics.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWAª\u0002\"Lunarclient.Websocket.Analytics.V1Ê\u0002\"Lunarclient\\Websocket\\Analytics\\V1â\u0002.Lunarclient\\Websocket\\Analytics\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Analytics::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
