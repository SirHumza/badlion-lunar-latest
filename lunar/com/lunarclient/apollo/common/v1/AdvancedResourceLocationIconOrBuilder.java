package com.lunarclient.apollo.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface AdvancedResourceLocationIconOrBuilder extends MessageOrBuilder {
   String getResourceLocation();

   ByteString getResourceLocationBytes();

   float getWidth();

   float getHeight();

   float getMinU();

   float getMaxU();

   float getMinV();

   float getMaxV();
}
