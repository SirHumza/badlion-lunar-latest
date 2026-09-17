package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.PositionProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_LoginResponse_descriptor,
      new String[]{"OwnedSprays", "EquippedSprays", "LunarPlusFreeSprayId", "HasAllSpraysFlag", "MaxActiveSprays", "LunarPlusFreeSprayIds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_UseSprayRequest_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_UseSprayRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_UseSprayRequest_descriptor, new String[]{"SprayId", "Pos", "Facing", "Rotation"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_UseSprayResponse_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_UseSprayResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_UseSprayResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_RemoveSprayRequest_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_RemoveSprayRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_RemoveSprayRequest_descriptor, new String[]{"Pos"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_RemoveSprayResponse_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_RemoveSprayResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_RemoveSprayResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysRequest_descriptor, new String[]{"EquippedSprays"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysResponse_descriptor, new String[0]
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
         "\n,lunarclient/websocket/spray/v1/service.proto\u0012\u001elunarclient.websocket.spray.v1\u001a$lunarclient/common/v1/position.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a+lunarclient/websocket/spray/v1/common.proto\"\u000e\n\fLoginRequest\"\u0087\u0003\n\rLoginResponse\u0012M\n\fowned_sprays\u0018\u0001 \u0003(\u000b2*.lunarclient.websocket.spray.v1.OwnedSprayR\u000bownedSprays\u0012V\n\u000fequipped_sprays\u0018\u0002 \u0003(\u000b2-.lunarclient.websocket.spray.v1.EquippedSprayR\u000eequippedSprays\u0012:\n\u0018lunar_plus_free_spray_id\u0018\u0003 \u0001(\u0005B\u0002\u0018\u0001R\u0014lunarPlusFreeSprayId\u0012-\n\u0013has_all_sprays_flag\u0018\u0004 \u0001(\bR\u0010hasAllSpraysFlag\u0012*\n\u0011max_active_sprays\u0018\u0005 \u0001(\u0005R\u000fmaxActiveSprays\u00128\n\u0019lunar_plus_free_spray_ids\u0018\u0006 \u0003(\u0005R\u0015lunarPlusFreeSprayIds\"µ\u0001\n\u000fUseSprayRequest\u0012\u0019\n\bspray_id\u0018\u0001 \u0001(\u0005R\u0007sprayId\u00121\n\u0003pos\u0018\u0002 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector3fR\u0003pos\u00128\n\u0006facing\u0018\u0003 \u0001(\u000e2 .lunarclient.common.v1.DirectionR\u0006facing\u0012\u001a\n\brotation\u0018\u0004 \u0001(\u0002R\brotation\"°\u0001\n\u0010UseSprayResponse\u0012O\n\u0006status\u0018\u0001 \u0001(\u000e27.lunarclient.websocket.spray.v1.UseSprayResponse.StatusR\u0006status\"K\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001a\n\u0016STATUS_SPRAY_NOT_OWNED\u0010\u0002\"G\n\u0012RemoveSprayRequest\u00121\n\u0003pos\u0018\u0001 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector3fR\u0003pos\"\u0015\n\u0013RemoveSprayResponse\"u\n\u001bUpdateEquippedSpraysRequest\u0012V\n\u000fequipped_sprays\u0018\u0001 \u0003(\u000b2-.lunarclient.websocket.spray.v1.EquippedSprayR\u000eequippedSprays\"\u001e\n\u001cUpdateEquippedSpraysResponse2\u0087\u0004\n\fSprayService\u0012j\n\u0005Login\u0012,.lunarclient.websocket.spray.v1.LoginRequest\u001a-.lunarclient.websocket.spray.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012s\n\bUseSpray\u0012/.lunarclient.websocket.spray.v1.UseSprayRequest\u001a0.lunarclient.websocket.spray.v1.UseSprayResponse\"\u0004\u0088µ\u0018\u0001\u0012|\n\u000bRemoveSpray\u00122.lunarclient.websocket.spray.v1.RemoveSprayRequest\u001a3.lunarclient.websocket.spray.v1.RemoveSprayResponse\"\u0004\u0088µ\u0018\u0001\u0012\u0097\u0001\n\u0014UpdateEquippedSprays\u0012;.lunarclient.websocket.spray.v1.UpdateEquippedSpraysRequest\u001a<.lunarclient.websocket.spray.v1.UpdateEquippedSpraysResponse\"\u0004\u0088µ\u0018\u0001BÐ\u0001\n\"com.lunarclient.websocket.spray.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWSª\u0002\u001eLunarclient.Websocket.Spray.V1Ê\u0002\u001eLunarclient\\Websocket\\Spray\\V1â\u0002*Lunarclient\\Websocket\\Spray\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Spray::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            PositionProto.getDescriptor(), com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(), CommonProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      PositionProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
