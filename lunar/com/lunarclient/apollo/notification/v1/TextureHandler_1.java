package com.lunarclient.apollo.notification.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.IconOrBuilder;

public interface DisplayNotificationMessageOrBuilder extends MessageOrBuilder {
   @Deprecated
   String getTitle();

   @Deprecated
   ByteString getTitleBytes();

   @Deprecated
   String getDescription();

   @Deprecated
   ByteString getDescriptionBytes();

   @Deprecated
   String getResourceLocation();

   @Deprecated
   ByteString getResourceLocationBytes();

   boolean hasDisplayTime();

   Duration getDisplayTime();

   DurationOrBuilder getDisplayTimeOrBuilder();

   String getTitleAdventureJsonLines();

   ByteString getTitleAdventureJsonLinesBytes();

   String getDescriptionAdventureJsonLines();

   ByteString getDescriptionAdventureJsonLinesBytes();

   boolean hasIcon();

   Icon getIcon();

   IconOrBuilder getIconOrBuilder();
}
