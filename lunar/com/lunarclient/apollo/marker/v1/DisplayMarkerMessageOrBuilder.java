package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface DisplayMarkerMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   boolean hasLocation();

   Location getLocation();

   LocationOrBuilder getLocationOrBuilder();

   boolean hasOwnerId();

   Uuid getOwnerId();

   UuidOrBuilder getOwnerIdOrBuilder();

   String getOwnerName();

   ByteString getOwnerNameBytes();

   boolean hasFlag();

   MarkerFlag getFlag();

   MarkerFlagOrBuilder getFlagOrBuilder();

   boolean hasTarget();

   MarkerTarget getTarget();

   MarkerTargetOrBuilder getTargetOrBuilder();

   boolean hasDuration();

   Duration getDuration();

   DurationOrBuilder getDurationOrBuilder();

   boolean getInGameNotification();

   boolean getChatNotify();

   boolean getMiddleClickRemove();

   boolean hasStyle();

   MarkerStyle getStyle();

   MarkerStyleOrBuilder getStyleOrBuilder();
}
