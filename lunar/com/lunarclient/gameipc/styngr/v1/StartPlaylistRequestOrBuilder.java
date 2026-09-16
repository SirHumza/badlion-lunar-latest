package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface StartPlaylistRequestOrBuilder extends MessageOrBuilder {
   int getPlaylistTypeValue();

   PlaylistLicense getPlaylistType();

   String getPlaylistId();

   ByteString getPlaylistIdBytes();
}
