package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface LocalServerOrBuilder extends MessageOrBuilder {
   boolean hasRichStatus();

   ServerRichStatus getRichStatus();

   ServerRichStatusOrBuilder getRichStatusOrBuilder();
}
