package com.lunarclient.authenticator.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ProtocolProto {
   static final Descriptors.Descriptor internal_static_lunarclient_authenticator_v1_ServerboundWebSocketMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_authenticator_v1_ServerboundWebSocketMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_authenticator_v1_ServerboundWebSocketMessage_descriptor,
      new String[]{"Hello", "EncryptionResponse", "EncryptionFail", "Contents"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_authenticator_v1_ClientboundWebSocketMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_authenticator_v1_ClientboundWebSocketMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_authenticator_v1_ClientboundWebSocketMessage_descriptor, new String[]{"EncryptionRequest", "AuthSuccess", "Contents"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ProtocolProto() {
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
         "\n+lunarclient/authenticator/v1/protocol.proto\u0012\u001clunarclient.authenticator.v1\u001a*lunarclient/authenticator/v1/message.proto\"¹\u0002\n\u001bServerboundWebSocketMessage\u0012B\n\u0005hello\u0018\u0001 \u0001(\u000b2*.lunarclient.authenticator.v1.HelloMessageH\u0000R\u0005hello\u0012j\n\u0013encryption_response\u0018\u0002 \u0001(\u000b27.lunarclient.authenticator.v1.EncryptionResponseMessageH\u0000R\u0012encryptionResponse\u0012^\n\u000fencryption_fail\u0018\u0003 \u0001(\u000b23.lunarclient.authenticator.v1.EncryptionFailMessageH\u0000R\u000eencryptionFailB\n\n\bcontents\"é\u0001\n\u001bClientboundWebSocketMessage\u0012g\n\u0012encryption_request\u0018\u0001 \u0001(\u000b26.lunarclient.authenticator.v1.EncryptionRequestMessageH\u0000R\u0011encryptionRequest\u0012U\n\fauth_success\u0018\u0002 \u0001(\u000b20.lunarclient.authenticator.v1.AuthSuccessMessageH\u0000R\u000bauthSuccessB\n\n\bcontentsBÃ\u0001\n com.lunarclient.authenticator.v1B\rProtocolProtoP\u0001¢\u0002\u0003LAXª\u0002\u001cLunarclient.Authenticator.V1Ê\u0002\u001cLunarclient\\Authenticator\\V1â\u0002(Lunarclient\\Authenticator\\V1\\GPBMetadataê\u0002\u001eLunarclient::Authenticator::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{MessageProto.getDescriptor()});
      MessageProto.getDescriptor();
   }
}
