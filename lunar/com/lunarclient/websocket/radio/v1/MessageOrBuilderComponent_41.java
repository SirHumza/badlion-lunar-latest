package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface InboundRadioStationOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   String getDescription();

   ByteString getDescriptionBytes();

   String getStationId();

   ByteString getStationIdBytes();

   int getTrackCount();

   int getStationTypeValue();

   InboundRadioStation.StationType getStationType();

   int getMonetizationTypeValue();

   InboundRadioStation.MonetizationType getMonetizationType();

   int getDuration();

   String getLicensedSessionId();

   ByteString getLicensedSessionIdBytes();

   String getImageUrl();

   ByteString getImageUrlBytes();
}
