package com.lunarclient.apollo.cooldown.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.IconOrBuilder;

public interface DisplayCooldownMessageOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   boolean hasDuration();

   Duration getDuration();

   DurationOrBuilder getDurationOrBuilder();

   boolean hasIcon();

   Icon getIcon();

   IconOrBuilder getIconOrBuilder();

   boolean hasStyle();

   CooldownStyle getStyle();

   CooldownStyleOrBuilder getStyleOrBuilder();
}
