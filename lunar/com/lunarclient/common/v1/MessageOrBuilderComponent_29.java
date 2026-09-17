package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PublicServerOrBuilder extends MessageOrBuilder {
   String getServerMappingsId();

   ByteString getServerMappingsIdBytes();

   String getName();

   ByteString getNameBytes();

   String getLogoUrl();

   ByteString getLogoUrlBytes();

   String getPrimaryAddress();

   ByteString getPrimaryAddressBytes();

   boolean hasColors();

   PublicServerColors getColors();

   PublicServerColorsOrBuilder getColorsOrBuilder();

   boolean hasVersions();

   PublicServerVersions getVersions();

   PublicServerVersionsOrBuilder getVersionsOrBuilder();

   @Deprecated
   boolean getSupportsDiscordRichPresence();

   boolean hasRichStatus();

   ServerRichStatus getRichStatus();

   ServerRichStatusOrBuilder getRichStatusOrBuilder();
}
