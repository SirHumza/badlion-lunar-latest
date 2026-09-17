package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import java.util.List;

public interface ServerCardOrBuilder extends MessageOrBuilder {
   String getRecommendationId();

   ByteString getRecommendationIdBytes();

   String getServerMappingsId();

   ByteString getServerMappingsIdBytes();

   String getName();

   ByteString getNameBytes();

   String getLogoUrl();

   ByteString getLogoUrlBytes();

   String getBackgroundUrl();

   ByteString getBackgroundUrlBytes();

   boolean hasPrimaryColor();

   Color getPrimaryColor();

   ColorOrBuilder getPrimaryColorOrBuilder();

   String getPrimaryAddress();

   ByteString getPrimaryAddressBytes();

   int getBadgeValue();

   ServerCard.Badge getBadge();

   boolean hasLastJoined();

   Timestamp getLastJoined();

   TimestampOrBuilder getLastJoinedOrBuilder();

   @Deprecated
   List<String> getGameModesList();

   @Deprecated
   int getGameModesCount();

   @Deprecated
   String getGameModes(int var1);

   @Deprecated
   ByteString getGameModesBytes(int var1);

   boolean hasAnnouncement();

   Announcement getAnnouncement();

   AnnouncementOrBuilder getAnnouncementOrBuilder();

   List<String> getRegionCodesList();

   int getRegionCodesCount();

   String getRegionCodes(int var1);

   ByteString getRegionCodesBytes(int var1);

   List<ServerGameType> getGameTypesList();

   ServerGameType getGameTypes(int var1);

   int getGameTypesCount();

   List<? extends ServerGameTypeOrBuilder> getGameTypesOrBuilderList();

   ServerGameTypeOrBuilder getGameTypesOrBuilder(int var1);
}
