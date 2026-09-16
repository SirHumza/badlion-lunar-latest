package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UserSocialPlatform;

public interface UnlinkSocialResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   UnlinkSocialResponse.Status getStatus();

   int getPlatformValue();

   UserSocialPlatform getPlatform();
}
