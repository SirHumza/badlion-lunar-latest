package com.lunarclient.apollo.button.v1;

import com.google.protobuf.MessageOrBuilder;

public interface ButtonUpdateOrBuilder extends MessageOrBuilder {
   boolean hasContent();

   ButtonContent getContent();

   ButtonContentOrBuilder getContentOrBuilder();

   boolean hasTooltip();

   ButtonTooltip getTooltip();

   ButtonTooltipOrBuilder getTooltipOrBuilder();
}
