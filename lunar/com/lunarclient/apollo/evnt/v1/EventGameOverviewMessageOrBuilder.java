package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.MessageOrBuilder;

public interface EventGameOverviewMessageOrBuilder extends MessageOrBuilder {
   boolean hasTeamOneStatus();

   EventTeamStatusMessage getTeamOneStatus();

   EventTeamStatusMessageOrBuilder getTeamOneStatusOrBuilder();

   boolean hasTeamTwoStatus();

   EventTeamStatusMessage getTeamTwoStatus();

   EventTeamStatusMessageOrBuilder getTeamTwoStatusOrBuilder();

   float getTierThreeHealth();

   long getGameStartTime();

   boolean getWitherShields();

   boolean getLockGameTime();

   long getMidRespawnTime();
}
