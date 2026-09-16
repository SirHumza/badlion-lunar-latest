package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.MessageOrBuilder;

public interface EventTeamStatusMessageOrBuilder extends MessageOrBuilder {
   float getTopWitherHealth();

   float getTopCrystalHealth();

   float getMiddleWitherHealth();

   float getMiddleCrystalHealth();

   float getBottomWitherHealth();

   float getBottomCrystalHealth();

   float getDragonHealth();
}
