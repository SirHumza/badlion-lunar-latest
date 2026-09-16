package com.lunarclient.apollo.transfer.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PingResponseOrBuilder extends MessageOrBuilder {
   ByteString getRequestId();

   List<PingData> getPingDataList();

   PingData getPingData(int var1);

   int getPingDataCount();

   List<? extends PingDataOrBuilder> getPingDataOrBuilderList();

   PingDataOrBuilder getPingDataOrBuilder(int var1);
}
