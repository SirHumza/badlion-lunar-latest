package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface StyngrTrackStateOrBuilder extends MessageOrBuilder {
   String getImageUrl();

   ByteString getImageUrlBytes();

   String getTitle();

   ByteString getTitleBytes();

   List<String> getArtistNamesList();

   int getArtistNamesCount();

   String getArtistNames(int var1);

   ByteString getArtistNamesBytes(int var1);

   boolean getLiked();

   int getRemainingSkips();

   String getPlaylistId();

   ByteString getPlaylistIdBytes();

   String getPlaylistName();

   ByteString getPlaylistNameBytes();
}
