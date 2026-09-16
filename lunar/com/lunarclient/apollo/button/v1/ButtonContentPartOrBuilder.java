package com.lunarclient.apollo.button.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.IconOrBuilder;

public interface ButtonContentPartOrBuilder extends MessageOrBuilder {
   boolean hasAdventureJsonText();

   String getAdventureJsonText();

   ByteString getAdventureJsonTextBytes();

   boolean hasIcon();

   Icon getIcon();

   IconOrBuilder getIconOrBuilder();

   ButtonContentPart.PartCase getPartCase();
}
