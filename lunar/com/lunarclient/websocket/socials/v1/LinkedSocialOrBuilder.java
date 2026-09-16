package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.UserSocial;
import com.lunarclient.common.v1.UserSocialOrBuilder;

public interface LinkedSocialOrBuilder extends MessageOrBuilder {
   boolean hasSocial();

   UserSocial getSocial();

   UserSocialOrBuilder getSocialOrBuilder();

   boolean hasLinkedAt();

   Timestamp getLinkedAt();

   TimestampOrBuilder getLinkedAtOrBuilder();

   boolean hasCommunity();

   LinkedSocialCommunity getCommunity();

   LinkedSocialCommunityOrBuilder getCommunityOrBuilder();
}
