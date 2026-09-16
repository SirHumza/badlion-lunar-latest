package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackControlsUpdate_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackControlsUpdate_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackControlsUpdate_descriptor, new String[]{"Playing", "Muted", "Volume"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackProgressUpdate_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackProgressUpdate_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackProgressUpdate_descriptor, new String[]{"Duration", "Position"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackUpdate_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackUpdate_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackUpdate_descriptor, new String[]{"Track"}
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
         "\n(lunarclient/gameipc/styngr/v1/push.proto\u0012\u001dlunarclient.gameipc.styngr.v1\u001a*lunarclient/gameipc/styngr/v1/common.proto\"c\n\u0019StyngrTrackControlsUpdate\u0012\u0018\n\u0007playing\u0018\u0001 \u0001(\bR\u0007playing\u0012\u0014\n\u0005muted\u0018\u0002 \u0001(\bR\u0005muted\u0012\u0016\n\u0006volume\u0018\u0003 \u0001(\u0002R\u0006volume\"S\n\u0019StyngrTrackProgressUpdate\u0012\u001a\n\bduration\u0018\u0001 \u0001(\u0002R\bduration\u0012\u001a\n\bposition\u0018\u0002 \u0001(\u0002R\bposition\"i\n\u0011StyngrTrackUpdate\u0012J\n\u0005track\u0018\u0001 \u0001(\u000b2/.lunarclient.gameipc.styngr.v1.StyngrTrackStateH\u0000R\u0005track\u0088\u0001\u0001B\b\n\u0006_trackBÅ\u0001\n!com.lunarclient.gameipc.styngr.v1B\tPushProtoP\u0001¢\u0002\u0003LGSª\u0002\u001dLunarclient.Gameipc.Styngr.V1Ê\u0002\u001dLunarclient\\Gameipc\\Styngr\\V1â\u0002)Lunarclient\\Gameipc\\Styngr\\V1\\GPBMetadataê\u0002 Lunarclient::Gameipc::Styngr::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      CommonProto.getDescriptor();
   }
}
