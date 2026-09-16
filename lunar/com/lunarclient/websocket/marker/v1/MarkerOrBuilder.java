package com.lunarclient.websocket.marker.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3fOrBuilder;
import java.util.List;

public interface MarkerOrBuilder extends MessageOrBuilder {
   boolean hasPosition();

   Vector3f getPosition();

   Vector3fOrBuilder getPositionOrBuilder();

   List<String> getDescriptionList();

   int getDescriptionCount();

   String getDescription(int var1);

   ByteString getDescriptionBytes(int var1);

   String getSource();

   ByteString getSourceBytes();
}
