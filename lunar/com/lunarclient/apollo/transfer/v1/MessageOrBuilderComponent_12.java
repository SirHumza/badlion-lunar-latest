package com.lunarclient.apollo.transfer.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface TransferResponseOrBuilder extends MessageOrBuilder {
   ByteString getRequestId();

   int getStatusValue();

   TransferResponse.Status getStatus();
}
