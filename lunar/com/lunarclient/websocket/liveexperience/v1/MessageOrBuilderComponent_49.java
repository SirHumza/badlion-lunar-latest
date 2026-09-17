package com.lunarclient.websocket.liveexperience.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LiveExperienceOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getName();

   ByteString getNameBytes();

   String getBackgroundImage();

   ByteString getBackgroundImageBytes();

   String getForegroundImage();

   ByteString getForegroundImageBytes();
}
