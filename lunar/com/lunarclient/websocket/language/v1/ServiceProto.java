package com.lunarclient.websocket.language.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_language_v1_UpdateLanguageRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_language_v1_UpdateLanguageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_language_v1_UpdateLanguageRequest_descriptor, new String[]{"NewLanguage"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_language_v1_UpdateLanguageResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_language_v1_UpdateLanguageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_language_v1_UpdateLanguageResponse_descriptor, new String[0]
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
         "\n/lunarclient/websocket/language/v1/service.proto\u0012!lunarclient.websocket.language.v1\u001a.lunarclient/websocket/language/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"g\n\u0015UpdateLanguageRequest\u0012N\n\fnew_language\u0018\u0001 \u0001(\u000b2+.lunarclient.websocket.language.v1.LanguageR\u000bnewLanguage\"\u0018\n\u0016UpdateLanguageResponse2\u009f\u0001\n\u000fLanguageService\u0012\u008b\u0001\n\u000eUpdateLanguage\u00128.lunarclient.websocket.language.v1.UpdateLanguageRequest\u001a9.lunarclient.websocket.language.v1.UpdateLanguageResponse\"\u0004\u0088µ\u0018\u0003Bß\u0001\n%com.lunarclient.websocket.language.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWLª\u0002!Lunarclient.Websocket.Language.V1Ê\u0002!Lunarclient\\Websocket\\Language\\V1â\u0002-Lunarclient\\Websocket\\Language\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Language::V1b\u0006proto3"
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
