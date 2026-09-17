package com.lunarclient.apollo.limb.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.util.List;

public interface HideBodyPartMessageOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   List<BodyPart> getBodyPartsList();

   int getBodyPartsCount();

   BodyPart getBodyParts(int var1);

   List<Integer> getBodyPartsValueList();

   int getBodyPartsValue(int var1);
}
