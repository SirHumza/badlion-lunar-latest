package com.lunarclient.apollo.glow.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface OverrideGlowEffectMessageOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   boolean hasColor();

   Color getColor();

   ColorOrBuilder getColorOrBuilder();
}
