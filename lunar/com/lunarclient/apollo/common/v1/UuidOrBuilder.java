package com.lunarclient.apollo.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface UuidOrBuilder extends MessageOrBuilder {
   long getHigh64();

   long getLow64();
}
