package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.MessageOrBuilder;

public interface GlobalAnnouncementOrBuilder extends MessageOrBuilder {
   boolean hasAnnouncement();

   Announcement getAnnouncement();

   AnnouncementOrBuilder getAnnouncementOrBuilder();

   boolean hasServer();

   ServerCard getServer();

   ServerCardOrBuilder getServerOrBuilder();
}
