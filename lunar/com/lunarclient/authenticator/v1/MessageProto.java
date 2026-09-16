package com.lunarclient.authenticator.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class MessageProto {
   static final Descriptors.Descriptor internal_static_lunarclient_authenticator_v1_HelloMessage_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_authenticator_v1_HelloMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_authenticator_v1_HelloMessage_descriptor, new String[]{"Identity", "Initiator"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_authenticator_v1_EncryptionRequestMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_authenticator_v1_EncryptionRequestMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_authenticator_v1_EncryptionRequestMessage_descriptor, new String[]{"PublicKey", "RandomBytes"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_authenticator_v1_EncryptionFailMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_authenticator_v1_EncryptionFailMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_authenticator_v1_EncryptionFailMessage_descriptor, new String[]{"Reason"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_authenticator_v1_EncryptionResponseMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_authenticator_v1_EncryptionResponseMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_authenticator_v1_EncryptionResponseMessage_descriptor, new String[]{"SecretKey", "PublicKey"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_authenticator_v1_AuthSuccessMessage_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_authenticator_v1_AuthSuccessMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_authenticator_v1_AuthSuccessMessage_descriptor, new String[]{"Jwt"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private MessageProto() {
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
         "\n*lunarclient/authenticator/v1/message.proto\u0012\u001clunarclient.authenticator.v1\u001a lunarclient/common/v1/uuid.proto\"p\n\fHelloMessage\u0012B\n\bidentity\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\bidentity\u0012\u001c\n\tinitiator\u0018\u0002 \u0001(\tR\tinitiator\"\\\n\u0018EncryptionRequestMessage\u0012\u001d\n\npublic_key\u0018\u0001 \u0001(\fR\tpublicKey\u0012!\n\frandom_bytes\u0018\u0002 \u0001(\fR\u000brandomBytes\"/\n\u0015EncryptionFailMessage\u0012\u0016\n\u0006reason\u0018\u0001 \u0001(\tR\u0006reason\"Y\n\u0019EncryptionResponseMessage\u0012\u001d\n\nsecret_key\u0018\u0001 \u0001(\fR\tsecretKey\u0012\u001d\n\npublic_key\u0018\u0002 \u0001(\fR\tpublicKey\"&\n\u0012AuthSuccessMessage\u0012\u0010\n\u0003jwt\u0018\u0001 \u0001(\tR\u0003jwtBÂ\u0001\n com.lunarclient.authenticator.v1B\fMessageProtoP\u0001¢\u0002\u0003LAXª\u0002\u001cLunarclient.Authenticator.V1Ê\u0002\u001cLunarclient\\Authenticator\\V1â\u0002(Lunarclient\\Authenticator\\V1\\GPBMetadataê\u0002\u001eLunarclient::Authenticator::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
