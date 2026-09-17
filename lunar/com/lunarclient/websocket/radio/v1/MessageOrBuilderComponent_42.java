package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
import java.util.Map;

public interface InboundRadioTrackOrBuilder extends MessageOrBuilder {
   String getTitle();

   ByteString getTitleBytes();

   int getTrackId();

   int getAssetId();

   boolean getLiked();

   List<String> getArtistNamesList();

   int getArtistNamesCount();

   String getArtistNames(int var1);

   ByteString getArtistNamesBytes(int var1);

   int getDuration();

   int getProgress();

   int getPosition();

   boolean getPaused();

   String getImageUrl();

   ByteString getImageUrlBytes();

   int getCustomMetadataCount();

   boolean containsCustomMetadata(String var1);

   @Deprecated
   Map<String, String> getCustomMetadata();

   Map<String, String> getCustomMetadataMap();

   String getCustomMetadataOrDefault(String var1, String var2);

   String getCustomMetadataOrThrow(String var1);

   String getAlbumName();

   ByteString getAlbumNameBytes();

   String getRoyaltyFreeUsageReportId();

   ByteString getRoyaltyFreeUsageReportIdBytes();
}
