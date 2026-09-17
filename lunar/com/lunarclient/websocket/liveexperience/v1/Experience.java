package com.lunarclient.websocket.liveexperience.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceResponse_descriptor, new String[]{"Experience"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceRequest_descriptor, new String[]{"ExperienceId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceResponse_descriptor, new String[]{"Server", "ErrorMessage", "Result"}
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
         "\n5lunarclient/websocket/liveexperience/v1/service.proto\u0012'lunarclient.websocket.liveexperience.v1\u001a4lunarclient/websocket/liveexperience/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"\u001b\n\u0019LoadLiveExperienceRequest\"u\n\u001aLoadLiveExperienceResponse\u0012W\n\nexperience\u0018\u0001 \u0001(\u000b27.lunarclient.websocket.liveexperience.v1.LiveExperienceR\nexperience\"@\n\u0019JoinLiveExperienceRequest\u0012#\n\rexperience_id\u0018\u0001 \u0001(\tR\fexperienceId\" \u0001\n\u001aJoinLiveExperienceResponse\u0012Q\n\u0006server\u0018\u0001 \u0001(\u000b27.lunarclient.websocket.liveexperience.v1.AddressAndPortH\u0000R\u0006server\u0012%\n\rerror_message\u0018\u0002 \u0001(\tH\u0000R\ferrorMessageB\b\n\u0006result2ã\u0002\n\u0015LiveExperienceService\u0012£\u0001\n\u0012LoadLiveExperience\u0012B.lunarclient.websocket.liveexperience.v1.LoadLiveExperienceRequest\u001aC.lunarclient.websocket.liveexperience.v1.LoadLiveExperienceResponse\"\u0004\u0088µ\u0018\u0003\u0012£\u0001\n\u0012JoinLiveExperience\u0012B.lunarclient.websocket.liveexperience.v1.JoinLiveExperienceRequest\u001aC.lunarclient.websocket.liveexperience.v1.JoinLiveExperienceResponse\"\u0004\u0088µ\u0018\u0003Bý\u0001\n+com.lunarclient.websocket.liveexperience.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWLª\u0002'Lunarclient.Websocket.Liveexperience.V1Ê\u0002'Lunarclient\\Websocket\\Liveexperience\\V1â\u00023Lunarclient\\Websocket\\Liveexperience\\V1\\GPBMetadataê\u0002*Lunarclient::Websocket::Liveexperience::V1b\u0006proto3"
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
