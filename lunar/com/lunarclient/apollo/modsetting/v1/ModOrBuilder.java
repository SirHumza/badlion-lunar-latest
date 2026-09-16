package com.lunarclient.apollo.modsetting.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ModOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getVersion();

   ByteString getVersionBytes();
}
