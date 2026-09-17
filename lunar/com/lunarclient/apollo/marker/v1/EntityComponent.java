package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.MessageOrBuilder;

public interface MarkerTargetOrBuilder extends MessageOrBuilder {
   boolean hasItem();

   ItemTarget getItem();

   ItemTargetOrBuilder getItemOrBuilder();

   boolean hasBlock();

   BlockTarget getBlock();

   BlockTargetOrBuilder getBlockOrBuilder();

   boolean hasEntity();

   EntityTarget getEntity();

   EntityTargetOrBuilder getEntityOrBuilder();

   boolean hasPlayer();

   PlayerTarget getPlayer();

   PlayerTargetOrBuilder getPlayerOrBuilder();

   MarkerTarget.TargetCase getTargetCase();
}
