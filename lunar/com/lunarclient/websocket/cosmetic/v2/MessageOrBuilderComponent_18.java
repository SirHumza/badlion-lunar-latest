package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface DeleteOutfitRequestOrBuilder extends MessageOrBuilder {
   boolean hasOutfitId();

   Uuid getOutfitId();

   UuidOrBuilder getOutfitIdOrBuilder();
}
