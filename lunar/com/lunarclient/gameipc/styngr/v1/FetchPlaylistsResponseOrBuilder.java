package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface FetchPlaylistsResponseOrBuilder extends MessageOrBuilder {
   List<FetchPlaylistsResponse.Playlist> getPlaylistsList();

   FetchPlaylistsResponse.Playlist getPlaylists(int var1);

   int getPlaylistsCount();

   List<? extends FetchPlaylistsResponse.PlaylistOrBuilder> getPlaylistsOrBuilderList();

   FetchPlaylistsResponse.PlaylistOrBuilder getPlaylistsOrBuilder(int var1);

   boolean getPremium();
}
