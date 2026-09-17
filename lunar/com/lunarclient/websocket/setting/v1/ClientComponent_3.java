package com.lunarclient.websocket.setting.v1;

import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ClientSettingOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   boolean hasValue();

   Any getValue();

   AnyOrBuilder getValueOrBuilder();

   boolean getChangedValue();

   boolean getDefaultValue();
}
