package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ServerRichStatusOrBuilder extends MessageOrBuilder {
   int getSourceValue();

   ServerRichStatus.Source getSource();

   String getGameName();

   ByteString getGameNameBytes();

   String getGameVariantName();

   ByteString getGameVariantNameBytes();

   String getGameState();

   ByteString getGameStateBytes();

   String getPlayerState();

   ByteString getPlayerStateBytes();

   String getMapName();

   ByteString getMapNameBytes();

   String getSubServer();

   ByteString getSubServerBytes();

   int getTeamCurrentSize();

   int getTeamMaxSize();
}
