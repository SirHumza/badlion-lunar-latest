package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface EventStatusOverviewMessageOrBuilder extends MessageOrBuilder {
   List<EventPlayerStatusMessage> getTeamOneStatusList();

   EventPlayerStatusMessage getTeamOneStatus(int var1);

   int getTeamOneStatusCount();

   List<? extends EventPlayerStatusMessageOrBuilder> getTeamOneStatusOrBuilderList();

   EventPlayerStatusMessageOrBuilder getTeamOneStatusOrBuilder(int var1);

   List<EventPlayerStatusMessage> getTeamTwoStatusList();

   EventPlayerStatusMessage getTeamTwoStatus(int var1);

   int getTeamTwoStatusCount();

   List<? extends EventPlayerStatusMessageOrBuilder> getTeamTwoStatusOrBuilderList();

   EventPlayerStatusMessageOrBuilder getTeamTwoStatusOrBuilder(int var1);
}
