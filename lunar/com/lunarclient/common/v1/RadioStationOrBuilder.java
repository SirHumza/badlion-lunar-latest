package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface RadioStationOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   String getDescription();

   ByteString getDescriptionBytes();

   String getStationId();

   ByteString getStationIdBytes();

   String getImageUrl();

   ByteString getImageUrlBytes();
}
