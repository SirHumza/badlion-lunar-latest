package com.lunarclient.websocket.language.v1;

import com.google.protobuf.MessageOrBuilder;

public interface UpdateLanguageRequestOrBuilder extends MessageOrBuilder {
   boolean hasNewLanguage();

   Language getNewLanguage();

   LanguageOrBuilder getNewLanguageOrBuilder();
}
