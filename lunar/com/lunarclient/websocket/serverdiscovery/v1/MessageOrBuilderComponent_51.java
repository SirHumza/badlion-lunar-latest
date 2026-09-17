package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.MessageOrBuilder;

public interface LoadServerModalResponseOrBuilder extends MessageOrBuilder {
   boolean hasDetails();

   ServerModalDetails getDetails();

   ServerModalDetailsOrBuilder getDetailsOrBuilder();
}
