package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;

public interface ServerModalDetailsOrBuilder extends MessageOrBuilder {
   String getDescription();

   ByteString getDescriptionBytes();

   String getTwitter();

   ByteString getTwitterBytes();

   String getDiscord();

   ByteString getDiscordBytes();

   String getYoutube();

   ByteString getYoutubeBytes();

   String getInstagram();

   ByteString getInstagramBytes();

   String getTwitch();

   ByteString getTwitchBytes();

   String getTelegram();

   ByteString getTelegramBytes();

   String getReddit();

   ByteString getRedditBytes();

   String getTiktok();

   ByteString getTiktokBytes();

   String getFacebook();

   ByteString getFacebookBytes();

   boolean hasModpack();

   PlayerModpack getModpack();

   PlayerModpackOrBuilder getModpackOrBuilder();
}
