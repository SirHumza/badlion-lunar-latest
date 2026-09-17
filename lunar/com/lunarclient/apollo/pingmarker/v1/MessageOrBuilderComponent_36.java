package com.lunarclient.apollo.pingmarker.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface SetPingMarkerTypesMessageOrBuilder extends MessageOrBuilder {
   List<SetPingMarkerTypeMessage> getTypesList();

   SetPingMarkerTypeMessage getTypes(int var1);

   int getTypesCount();

   List<? extends SetPingMarkerTypeMessageOrBuilder> getTypesOrBuilderList();

   SetPingMarkerTypeMessageOrBuilder getTypesOrBuilder(int var1);
}
