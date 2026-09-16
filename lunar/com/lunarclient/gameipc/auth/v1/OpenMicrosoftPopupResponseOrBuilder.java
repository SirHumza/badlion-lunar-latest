package com.lunarclient.gameipc.auth.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OpenMicrosoftPopupResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   OpenMicrosoftPopupResponse.Status getStatus();

   String getUrl();

   ByteString getUrlBytes();
}
