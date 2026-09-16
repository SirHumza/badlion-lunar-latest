package com.lunarclient.websocket.language.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LanguageOrBuilder extends MessageOrBuilder {
   boolean hasIso6393Code();

   String getIso6393Code();

   ByteString getIso6393CodeBytes();

   boolean hasMinecraftCode();

   String getMinecraftCode();

   ByteString getMinecraftCodeBytes();

   Language.LanguageCase getLanguageCase();
}
