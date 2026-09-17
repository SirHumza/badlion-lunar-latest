package com.lunarclient.websocket.liveexperience.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface AddressAndPortOrBuilder extends MessageOrBuilder {
   String getAddress();

   ByteString getAddressBytes();

   int getPort();
}
