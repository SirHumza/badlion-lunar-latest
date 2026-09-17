package com.lunarclient.websocket.server.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface GetPlayerCountsRequestOrBuilder extends MessageOrBuilder {
   List<String> getServerIdsList();

   int getServerIdsCount();

   String getServerIds(int var1);

   ByteString getServerIdsBytes(int var1);
}
