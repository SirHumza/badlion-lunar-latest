package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import java.util.Map;

public interface PresignedUploadOrBuilder extends MessageOrBuilder {
   String getUploadUrl();

   ByteString getUploadUrlBytes();

   int getRequiredHeadersCount();

   boolean containsRequiredHeaders(String var1);

   @Deprecated
   Map<String, String> getRequiredHeaders();

   Map<String, String> getRequiredHeadersMap();

   String getRequiredHeadersOrDefault(String var1, String var2);

   String getRequiredHeadersOrThrow(String var1);

   long getMaxBytes();

   String getAcceptedContentType();

   ByteString getAcceptedContentTypeBytes();

   boolean hasExpiresAt();

   Timestamp getExpiresAt();

   TimestampOrBuilder getExpiresAtOrBuilder();

   String getFinishedUrl();

   ByteString getFinishedUrlBytes();
}
