package com.lunarclient.websocket.analytics.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface RecordCountersRequestOrBuilder extends MessageOrBuilder {
   List<CounterUpdate> getUpdatesList();

   CounterUpdate getUpdates(int var1);

   int getUpdatesCount();

   List<? extends CounterUpdateOrBuilder> getUpdatesOrBuilderList();

   CounterUpdateOrBuilder getUpdatesOrBuilder(int var1);
}
