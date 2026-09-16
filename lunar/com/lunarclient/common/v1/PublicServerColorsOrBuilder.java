package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface PublicServerColorsOrBuilder extends MessageOrBuilder {
   boolean hasPrimary();

   Color getPrimary();

   ColorOrBuilder getPrimaryOrBuilder();

   boolean hasSecondary();

   Color getSecondary();

   ColorOrBuilder getSecondaryOrBuilder();
}
