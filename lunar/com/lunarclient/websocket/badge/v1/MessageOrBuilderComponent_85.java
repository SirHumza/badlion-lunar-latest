package com.lunarclient.websocket.badge.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   List<OwnedBadge> getOwnedBadgesList();

   OwnedBadge getOwnedBadges(int var1);

   int getOwnedBadgesCount();

   List<? extends OwnedBadgeOrBuilder> getOwnedBadgesOrBuilderList();

   OwnedBadgeOrBuilder getOwnedBadgesOrBuilder(int var1);

   int getEquippedBadgeId();

   boolean getHasAllBadgesFlag();
}
