package com.lunarclient.websocket.liveexperience.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface JoinLiveExperienceResponseOrBuilder extends MessageOrBuilder {
   boolean hasServer();

   AddressAndPort getServer();

   AddressAndPortOrBuilder getServerOrBuilder();

   boolean hasErrorMessage();

   String getErrorMessage();

   ByteString getErrorMessageBytes();

   JoinLiveExperienceResponse.ResultCase getResultCase();
}
