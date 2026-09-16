package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface MarkerStyleOrBuilder extends MessageOrBuilder {
   float getScale();

   boolean getAnimateMarkerOnHover();

   boolean getCompactMode();

   boolean getTextShadow();

   String getOwnerSuffix();

   ByteString getOwnerSuffixBytes();

   int getOwnerDisplayValue();

   MarkerOwnerDisplay getOwnerDisplay();

   int getShowOwnerValue();

   MarkerDisplayCondition getShowOwner();

   int getShowCoordinatesValue();

   MarkerDisplayCondition getShowCoordinates();

   int getShowDistanceValue();

   MarkerDisplayCondition getShowDistance();

   int getShowDescriptionValue();

   MarkerDisplayCondition getShowDescription();

   int getDescriptionDisplayValue();

   MarkerDescriptionDisplay getDescriptionDisplay();
}
