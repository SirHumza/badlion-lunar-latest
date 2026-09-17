package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface AutocompleteSuggestionOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   String getPrimaryAddress();

   ByteString getPrimaryAddressBytes();

   List<String> getAddressesList();

   int getAddressesCount();

   String getAddresses(int var1);

   ByteString getAddressesBytes(int var1);
}
