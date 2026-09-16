package com.lunarclient.websocket.apollo.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface TrackFeatureAdoptionRequestOrBuilder extends MessageOrBuilder {
   String getModule();

   ByteString getModuleBytes();

   String getFeature();

   ByteString getFeatureBytes();
}
