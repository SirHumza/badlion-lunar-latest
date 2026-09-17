package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_FetchStateRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_FetchStateRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_FetchStateRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_FetchStateResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_FetchStateResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_FetchStateResponse_descriptor, new String[]{"Track", "Controls", "Progress"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_descriptor, new String[]{"Playlists", "Premium"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_Playlist_descriptor = internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_Playlist_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_Playlist_descriptor,
      new String[]{"Id", "Name", "Description", "TrackCount", "Duration", "License", "Monetization"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistRequest_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistRequest_descriptor, new String[]{"PlaylistType", "PlaylistId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_NextTrackRequest_descriptor = getDescriptor().getMessageTypes().get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_NextTrackRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_NextTrackRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_NextTrackResponse_descriptor = getDescriptor().getMessageTypes().get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_NextTrackResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_NextTrackResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_SetPlayingRequest_descriptor = getDescriptor().getMessageTypes().get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_SetPlayingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_SetPlayingRequest_descriptor, new String[]{"Playing"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_SetPlayingResponse_descriptor = getDescriptor().getMessageTypes().get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_SetPlayingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_SetPlayingResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_SetMutedRequest_descriptor = getDescriptor().getMessageTypes().get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_SetMutedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_SetMutedRequest_descriptor, new String[]{"Muted"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_SetMutedResponse_descriptor = getDescriptor().getMessageTypes().get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_SetMutedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_SetMutedResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_SetVolumeRequest_descriptor = getDescriptor().getMessageTypes().get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_SetVolumeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_SetVolumeRequest_descriptor, new String[]{"Volume"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_SetVolumeResponse_descriptor = getDescriptor().getMessageTypes().get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_SetVolumeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_SetVolumeResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_ToggleLikedRequest_descriptor = getDescriptor().getMessageTypes().get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_ToggleLikedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_ToggleLikedRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_ToggleLikedResponse_descriptor = getDescriptor().getMessageTypes().get(15);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_ToggleLikedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_ToggleLikedResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorRequest_descriptor = getDescriptor().getMessageTypes().get(16);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(17);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorResponse_descriptor, new String[0]
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
         "\n+lunarclient/gameipc/styngr/v1/service.proto\u0012\u001dlunarclient.gameipc.styngr.v1\u001a\u001egoogle/protobuf/duration.proto\u001a*lunarclient/gameipc/styngr/v1/common.proto\"\u0013\n\u0011FetchStateRequest\"û\u0001\n\u0012FetchStateResponse\u0012E\n\u0005track\u0018\u0001 \u0001(\u000b2/.lunarclient.gameipc.styngr.v1.StyngrTrackStateR\u0005track\u0012N\n\bcontrols\u0018\u0002 \u0001(\u000b22.lunarclient.gameipc.styngr.v1.StyngrControlsStateR\bcontrols\u0012N\n\bprogress\u0018\u0003 \u0001(\u000b22.lunarclient.gameipc.styngr.v1.StyngrProgressStateR\bprogress\"\u0017\n\u0015FetchPlaylistsRequest\"ó\u0003\n\u0016FetchPlaylistsResponse\u0012\\\n\tplaylists\u0018\u0001 \u0003(\u000b2>.lunarclient.gameipc.styngr.v1.FetchPlaylistsResponse.PlaylistR\tplaylists\u0012\u0018\n\u0007premium\u0018\u0002 \u0001(\bR\u0007premium\u001aà\u0002\n\bPlaylist\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012%\n\u000bdescription\u0018\u0003 \u0001(\tH\u0000R\u000bdescription\u0088\u0001\u0001\u0012\u001f\n\u000btrack_count\u0018\u0004 \u0001(\u0005R\ntrackCount\u00125\n\bduration\u0018\u0005 \u0001(\u000b2\u0019.google.protobuf.DurationR\bduration\u0012H\n\u0007license\u0018\u0006 \u0001(\u000e2..lunarclient.gameipc.styngr.v1.PlaylistLicenseR\u0007license\u0012W\n\fmonetization\u0018\u0007 \u0001(\u000e23.lunarclient.gameipc.styngr.v1.PlaylistMonetizationR\fmonetizationB\u000e\n\f_description\"\u008c\u0001\n\u0014StartPlaylistRequest\u0012S\n\rplaylist_type\u0018\u0001 \u0001(\u000e2..lunarclient.gameipc.styngr.v1.PlaylistLicenseR\fplaylistType\u0012\u001f\n\u000bplaylist_id\u0018\u0002 \u0001(\tR\nplaylistId\"\u0017\n\u0015StartPlaylistResponse\"\u0012\n\u0010NextTrackRequest\"\u0013\n\u0011NextTrackResponse\"-\n\u0011SetPlayingRequest\u0012\u0018\n\u0007playing\u0018\u0001 \u0001(\bR\u0007playing\"\u0014\n\u0012SetPlayingResponse\"'\n\u000fSetMutedRequest\u0012\u0014\n\u0005muted\u0018\u0001 \u0001(\bR\u0005muted\"\u0012\n\u0010SetMutedResponse\"*\n\u0010SetVolumeRequest\u0012\u0016\n\u0006volume\u0018\u0001 \u0001(\u0002R\u0006volume\"\u0013\n\u0011SetVolumeResponse\"\u0014\n\u0012ToggleLikedRequest\"\u0015\n\u0013ToggleLikedResponse\"\u0015\n\u0013OpenSelectorRequest\"\u0016\n\u0014OpenSelectorResponse2±\b\n\u0012StyngrRadioService\u0012q\n\nFetchState\u00120.lunarclient.gameipc.styngr.v1.FetchStateRequest\u001a1.lunarclient.gameipc.styngr.v1.FetchStateResponse\u0012}\n\u000eFetchPlaylists\u00124.lunarclient.gameipc.styngr.v1.FetchPlaylistsRequest\u001a5.lunarclient.gameipc.styngr.v1.FetchPlaylistsResponse\u0012z\n\rStartPlaylist\u00123.lunarclient.gameipc.styngr.v1.StartPlaylistRequest\u001a4.lunarclient.gameipc.styngr.v1.StartPlaylistResponse\u0012n\n\tNextTrack\u0012/.lunarclient.gameipc.styngr.v1.NextTrackRequest\u001a0.lunarclient.gameipc.styngr.v1.NextTrackResponse\u0012q\n\nSetPlaying\u00120.lunarclient.gameipc.styngr.v1.SetPlayingRequest\u001a1.lunarclient.gameipc.styngr.v1.SetPlayingResponse\u0012k\n\bSetMuted\u0012..lunarclient.gameipc.styngr.v1.SetMutedRequest\u001a/.lunarclient.gameipc.styngr.v1.SetMutedResponse\u0012n\n\tSetVolume\u0012/.lunarclient.gameipc.styngr.v1.SetVolumeRequest\u001a0.lunarclient.gameipc.styngr.v1.SetVolumeResponse\u0012t\n\u000bToggleLiked\u00121.lunarclient.gameipc.styngr.v1.ToggleLikedRequest\u001a2.lunarclient.gameipc.styngr.v1.ToggleLikedResponse\u0012w\n\fOpenSelector\u00122.lunarclient.gameipc.styngr.v1.OpenSelectorRequest\u001a3.lunarclient.gameipc.styngr.v1.OpenSelectorResponseBË\u0001\n!com.lunarclient.gameipc.styngr.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LGSª\u0002\u001dLunarclient.Gameipc.Styngr.V1Ê\u0002\u001dLunarclient\\Gameipc\\Styngr\\V1â\u0002)Lunarclient\\Gameipc\\Styngr\\V1\\GPBMetadataê\u0002 Lunarclient::Gameipc::Styngr::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{DurationProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      DurationProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
