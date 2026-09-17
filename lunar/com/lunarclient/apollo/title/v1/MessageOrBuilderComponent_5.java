package com.lunarclient.apollo.title.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Component;
import com.lunarclient.apollo.common.v1.ComponentOrBuilder;

public interface DisplayTitleMessageOrBuilder extends MessageOrBuilder {
   int getTitleTypeValue();

   TitleType getTitleType();

   @Deprecated
   boolean hasMessage();

   @Deprecated
   Component getMessage();

   @Deprecated
   ComponentOrBuilder getMessageOrBuilder();

   float getScale();

   boolean hasFadeInTime();

   Duration getFadeInTime();

   DurationOrBuilder getFadeInTimeOrBuilder();

   boolean hasDisplayTime();

   Duration getDisplayTime();

   DurationOrBuilder getDisplayTimeOrBuilder();

   boolean hasFadeOutTime();

   Duration getFadeOutTime();

   DurationOrBuilder getFadeOutTimeOrBuilder();

   String getAdventureJsonMessage();

   ByteString getAdventureJsonMessageBytes();

   float getInterpolationScale();

   float getInterpolationRate();
}
