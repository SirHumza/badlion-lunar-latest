package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UserSocialPlatform;

public interface UnlinkSocialRequestOrBuilder extends MessageOrBuilder {
   int getPlatformValue();

   UserSocialPlatform getPlatform();
}
