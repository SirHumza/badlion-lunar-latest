package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface RunningInstanceLoaderOrBuilder extends MessageOrBuilder {
   String getLoader();

   ByteString getLoaderBytes();

   String getLoaderVersion();

   ByteString getLoaderVersionBytes();

   boolean getLoaderVersionRecommended();
}
