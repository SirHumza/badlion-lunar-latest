package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface InboundServerOrBuilder extends MessageOrBuilder {
   String getServerIp();

   ByteString getServerIpBytes();

   boolean hasRichStatus();

   ServerRichStatus getRichStatus();

   ServerRichStatusOrBuilder getRichStatusOrBuilder();
}
