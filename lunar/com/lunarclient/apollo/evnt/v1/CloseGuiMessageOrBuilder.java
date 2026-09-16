package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.MessageOrBuilder;

public interface CloseGuiMessageOrBuilder extends MessageOrBuilder {
   int getGuiTypeValue();

   GuiType getGuiType();
}
