package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface UpdateCosmeticsMessageOrBuilder extends MessageOrBuilder {
   List<String> getModelLocationsList();

   int getModelLocationsCount();

   String getModelLocations(int var1);

   ByteString getModelLocationsBytes(int var1);

   List<String> getAnimationLocationsList();

   int getAnimationLocationsCount();

   String getAnimationLocations(int var1);

   ByteString getAnimationLocationsBytes(int var1);
}
