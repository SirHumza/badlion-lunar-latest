package com.lunarclient.websocket.handshake.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.util.List;

public interface MinecraftIdentityOrBuilder extends MessageOrBuilder {
   boolean hasPlayer();

   UuidAndUsername getPlayer();

   UuidAndUsernameOrBuilder getPlayerOrBuilder();

   int getTypeValue();

   MinecraftIdentity.Type getType();

   String getAuthenticatorJwt();

   ByteString getAuthenticatorJwtBytes();

   List<MinecraftIdentity.Skin> getSkinsList();

   MinecraftIdentity.Skin getSkins(int var1);

   int getSkinsCount();

   List<? extends MinecraftIdentity.SkinOrBuilder> getSkinsOrBuilderList();

   MinecraftIdentity.SkinOrBuilder getSkinsOrBuilder(int var1);

   List<MinecraftIdentity.Cape> getCapesList();

   MinecraftIdentity.Cape getCapes(int var1);

   int getCapesCount();

   List<? extends MinecraftIdentity.CapeOrBuilder> getCapesOrBuilderList();

   MinecraftIdentity.CapeOrBuilder getCapesOrBuilder(int var1);

   boolean hasAttributes();

   MinecraftIdentity.Attributes getAttributes();

   MinecraftIdentity.AttributesOrBuilder getAttributesOrBuilder();

   boolean hasCreatedAt();

   Timestamp getCreatedAt();

   TimestampOrBuilder getCreatedAtOrBuilder();

   boolean hasNameChange();

   MinecraftIdentity.NameChange getNameChange();

   MinecraftIdentity.NameChangeOrBuilder getNameChangeOrBuilder();

   boolean getOwnsBedrockEdition();
}
