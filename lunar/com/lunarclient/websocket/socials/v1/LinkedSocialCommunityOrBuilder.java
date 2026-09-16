package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;

public interface LinkedSocialCommunityOrBuilder extends MessageOrBuilder {
   boolean getIsMember();

   boolean hasJoinedAt();

   Timestamp getJoinedAt();

   TimestampOrBuilder getJoinedAtOrBuilder();

   boolean hasLeftAt();

   Timestamp getLeftAt();

   TimestampOrBuilder getLeftAtOrBuilder();

   boolean getHasFlair();
}
