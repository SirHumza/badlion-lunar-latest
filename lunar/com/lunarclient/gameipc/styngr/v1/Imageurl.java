package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackState_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackState_descriptor,
      new String[]{"ImageUrl", "Title", "ArtistNames", "Liked", "RemainingSkips", "PlaylistId", "PlaylistName"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_StyngrControlsState_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_StyngrControlsState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_StyngrControlsState_descriptor, new String[]{"Playing", "Muted", "Volume"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_StyngrProgressState_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_StyngrProgressState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_StyngrProgressState_descriptor, new String[]{"Duration", "Position"}
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
         "\n*lunarclient/gameipc/styngr/v1/common.proto\u0012\u001dlunarclient.gameipc.styngr.v1\"í\u0001\n\u0010StyngrTrackState\u0012\u001b\n\timage_url\u0018\u0001 \u0001(\tR\bimageUrl\u0012\u0014\n\u0005title\u0018\u0002 \u0001(\tR\u0005title\u0012!\n\fartist_names\u0018\u0003 \u0003(\tR\u000bartistNames\u0012\u0014\n\u0005liked\u0018\u0004 \u0001(\bR\u0005liked\u0012'\n\u000fremaining_skips\u0018\u0005 \u0001(\u0005R\u000eremainingSkips\u0012\u001f\n\u000bplaylist_id\u0018\u0006 \u0001(\tR\nplaylistId\u0012#\n\rplaylist_name\u0018\u0007 \u0001(\tR\fplaylistName\"]\n\u0013StyngrControlsState\u0012\u0018\n\u0007playing\u0018\u0001 \u0001(\bR\u0007playing\u0012\u0014\n\u0005muted\u0018\u0002 \u0001(\bR\u0005muted\u0012\u0016\n\u0006volume\u0018\u0003 \u0001(\u0002R\u0006volume\"M\n\u0013StyngrProgressState\u0012\u001a\n\bduration\u0018\u0001 \u0001(\u0002R\bduration\u0012\u001a\n\bposition\u0018\u0002 \u0001(\u0002R\bposition*u\n\u000fPlaylistLicense\u0012 \n\u001cPLAYLIST_LICENSE_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019PLAYLIST_LICENSE_LICENSED\u0010\u0001\u0012!\n\u001dPLAYLIST_LICENSE_ROYALTY_FREE\u0010\u0002*¼\u0001\n\u0014PlaylistMonetization\u0012%\n!PLAYLIST_MONETIZATION_UNSPECIFIED\u0010\u0000\u0012,\n(PLAYLIST_MONETIZATION_INTERNAL_AD_FUNDED\u0010\u0001\u0012,\n(PLAYLIST_MONETIZATION_EXTERNAL_AD_FUNDED\u0010\u0002\u0012!\n\u001dPLAYLIST_MONETIZATION_PREMIUM\u0010\u0003BÇ\u0001\n!com.lunarclient.gameipc.styngr.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LGSª\u0002\u001dLunarclient.Gameipc.Styngr.V1Ê\u0002\u001dLunarclient\\Gameipc\\Styngr\\V1â\u0002)Lunarclient\\Gameipc\\Styngr\\V1\\GPBMetadataê\u0002 Lunarclient::Gameipc::Styngr::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
