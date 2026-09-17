package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.MessageOrBuilder;

public interface MarkerFlagOrBuilder extends MessageOrBuilder {
   boolean hasNormal();

   NormalMarker getNormal();

   NormalMarkerOrBuilder getNormalOrBuilder();

   boolean hasDanger();

   DangerMarker getDanger();

   DangerMarkerOrBuilder getDangerOrBuilder();

   boolean hasInfo();

   InfoMarker getInfo();

   InfoMarkerOrBuilder getInfoOrBuilder();

   boolean hasInterest();

   InterestMarker getInterest();

   InterestMarkerOrBuilder getInterestOrBuilder();

   MarkerFlag.FlagCase getFlagCase();
}
