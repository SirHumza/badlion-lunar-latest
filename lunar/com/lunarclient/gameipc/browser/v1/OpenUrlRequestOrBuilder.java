package com.lunarclient.gameipc.browser.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OpenUrlRequestOrBuilder extends MessageOrBuilder {
   String getUrl();

   ByteString getUrlBytes();

   int getInitiatorValue();

   OpenUrlRequest.Initiator getInitiator();

   int getOpenTypeValue();

   OpenUrlRequest.OpenType getOpenType();
}
