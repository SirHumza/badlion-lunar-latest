package com.lunarclient.apollo.chat.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.button.v1.Button;
import com.lunarclient.apollo.button.v1.ButtonOrBuilder;

public interface ChatButtonOrBuilder extends MessageOrBuilder {
   boolean hasButton();

   Button getButton();

   ButtonOrBuilder getButtonOrBuilder();
}
