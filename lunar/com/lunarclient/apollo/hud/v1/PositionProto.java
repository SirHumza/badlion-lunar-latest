package com.lunarclient.apollo.hud.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PositionProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_hud_v1_HudPosition_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_hud_v1_HudPosition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_hud_v1_HudPosition_descriptor, new String[]{"X", "Y"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PositionProto() {
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
         "\n(lunarclient/apollo/hud/v1/position.proto\u0012\u0019lunarclient.apollo.hud.v1\")\n\u000bHudPosition\u0012\f\n\u0001x\u0018\u0001 \u0001(\u0002R\u0001x\u0012\f\n\u0001y\u0018\u0002 \u0001(\u0002R\u0001yBµ\u0001\n\u001dcom.lunarclient.apollo.hud.v1B\rPositionProtoP\u0001¢\u0002\u0003LAHª\u0002\u0019Lunarclient.Apollo.Hud.V1Ê\u0002\u0019Lunarclient\\Apollo\\Hud\\V1â\u0002%Lunarclient\\Apollo\\Hud\\V1\\GPBMetadataê\u0002\u001cLunarclient::Apollo::Hud::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
