package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   int getTotalServers();

   boolean hasAnnouncement();

   GlobalAnnouncement getAnnouncement();

   GlobalAnnouncementOrBuilder getAnnouncementOrBuilder();

   List<ServerGameType> getGameTypesList();

   ServerGameType getGameTypes(int var1);

   int getGameTypesCount();

   List<? extends ServerGameTypeOrBuilder> getGameTypesOrBuilderList();

   ServerGameTypeOrBuilder getGameTypesOrBuilder(int var1);
}
