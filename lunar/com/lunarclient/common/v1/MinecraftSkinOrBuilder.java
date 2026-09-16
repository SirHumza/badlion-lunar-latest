package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface MinecraftSkinOrBuilder extends MessageOrBuilder {
   String getTextureId();

   ByteString getTextureIdBytes();

   int getModelValue();

   MinecraftSkinModel getModel();
}
