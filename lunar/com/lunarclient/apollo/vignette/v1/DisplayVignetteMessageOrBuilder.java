package com.lunarclient.apollo.vignette.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface DisplayVignetteMessageOrBuilder extends MessageOrBuilder {
   String getResourceLocation();

   ByteString getResourceLocationBytes();

   float getOpacity();
}
