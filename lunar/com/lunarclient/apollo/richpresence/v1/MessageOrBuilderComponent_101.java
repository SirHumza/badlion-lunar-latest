package com.lunarclient.apollo.richpresence.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OverrideServerRichPresenceMessageOrBuilder extends MessageOrBuilder {
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
