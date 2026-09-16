package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface EntityTargetOrBuilder extends MessageOrBuilder {
   String getEntityType();

   ByteString getEntityTypeBytes();
}
