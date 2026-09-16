package com.lunarclient.websocket.wrapped.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_wrapped_v1_RecordCountersRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_wrapped_v1_RecordCountersRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_wrapped_v1_RecordCountersRequest_descriptor, new String[]{"Updates"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_wrapped_v1_RecordCountersResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_wrapped_v1_RecordCountersResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_wrapped_v1_RecordCountersResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_wrapped_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_wrapped_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_wrapped_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_wrapped_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_wrapped_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_wrapped_v1_LoginResponse_descriptor, new String[]{"LeaderboardVisibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityRequest_descriptor, new String[]{"LeaderboardVisibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityResponse_descriptor, new String[0]
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
         "\n.lunarclient/websocket/wrapped/v1/service.proto\u0012 lunarclient.websocket.wrapped.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a-lunarclient/websocket/wrapped/v1/common.proto\"b\n\u0015RecordCountersRequest\u0012I\n\u0007updates\u0018\u0001 \u0003(\u000b2/.lunarclient.websocket.wrapped.v1.CounterUpdateR\u0007updates\"\u0018\n\u0016RecordCountersResponse\"\u000e\n\fLoginRequest\"\u0086\u0001\n\rLoginResponse\u0012u\n\u0016leaderboard_visibility\u0018\u0001 \u0001(\u000e2>.lunarclient.websocket.wrapped.v1.WrappedLeaderboardVisibilityR\u0015leaderboardVisibility\"\u0098\u0001\n\u001fSetLeaderboardVisibilityRequest\u0012u\n\u0016leaderboard_visibility\u0018\u0001 \u0001(\u000e2>.lunarclient.websocket.wrapped.v1.WrappedLeaderboardVisibilityR\u0015leaderboardVisibility\"\"\n SetLeaderboardVisibilityResponse2¶\u0003\n\u000eWrappedService\u0012n\n\u0005Login\u0012..lunarclient.websocket.wrapped.v1.LoginRequest\u001a/.lunarclient.websocket.wrapped.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0089\u0001\n\u000eRecordCounters\u00127.lunarclient.websocket.wrapped.v1.RecordCountersRequest\u001a8.lunarclient.websocket.wrapped.v1.RecordCountersResponse\"\u0004\u0088µ\u0018\u0003\u0012§\u0001\n\u0018SetLeaderboardVisibility\u0012A.lunarclient.websocket.wrapped.v1.SetLeaderboardVisibilityRequest\u001aB.lunarclient.websocket.wrapped.v1.SetLeaderboardVisibilityResponse\"\u0004\u0088µ\u0018\u0003BÚ\u0001\n$com.lunarclient.websocket.wrapped.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWWª\u0002 Lunarclient.Websocket.Wrapped.V1Ê\u0002 Lunarclient\\Websocket\\Wrapped\\V1â\u0002,Lunarclient\\Websocket\\Wrapped\\V1\\GPBMetadataê\u0002#Lunarclient::Websocket::Wrapped::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
