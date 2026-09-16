package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface UserSocialOrBuilder extends MessageOrBuilder {
   int getPlatformValue();

   UserSocialPlatform getPlatform();

   String getUsername();

   ByteString getUsernameBytes();

   String getAvatar();

   ByteString getAvatarBytes();
}
