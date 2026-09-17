package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;

public interface EquippedCosmeticOrBuilder extends MessageOrBuilder {
   int getCosmeticId();

   boolean hasMetadata();

   Struct getMetadata();

   StructOrBuilder getMetadataOrBuilder();
}
