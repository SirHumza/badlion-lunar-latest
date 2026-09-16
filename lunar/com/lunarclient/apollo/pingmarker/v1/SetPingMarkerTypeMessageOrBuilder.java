package com.lunarclient.apollo.pingmarker.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.IconOrBuilder;

public interface SetPingMarkerTypeMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   boolean hasIcon();

   Icon getIcon();

   IconOrBuilder getIconOrBuilder();
}
