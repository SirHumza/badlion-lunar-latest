package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface RadioTrackOrBuilder extends MessageOrBuilder {
   String getTitle();

   ByteString getTitleBytes();

   List<String> getArtistNamesList();

   int getArtistNamesCount();

   String getArtistNames(int var1);

   ByteString getArtistNamesBytes(int var1);

   int getDuration();

   int getProgress();

   boolean getPaused();

   String getImageUrl();

   ByteString getImageUrlBytes();
}
