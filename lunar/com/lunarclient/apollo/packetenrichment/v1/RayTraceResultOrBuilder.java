package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.MessageOrBuilder;

public interface RayTraceResultOrBuilder extends MessageOrBuilder {
   boolean hasBlock();

   BlockHit getBlock();

   BlockHitOrBuilder getBlockOrBuilder();

   boolean hasEntity();

   EntityHit getEntity();

   EntityHitOrBuilder getEntityOrBuilder();

   boolean hasMiss();

   Miss getMiss();

   MissOrBuilder getMissOrBuilder();

   RayTraceResult.HitCase getHitCase();
}
