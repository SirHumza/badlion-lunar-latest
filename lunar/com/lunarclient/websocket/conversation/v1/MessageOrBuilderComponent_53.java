package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface GetUploadUrlsResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   GetUploadUrlsResponse.Status getStatus();

   List<PresignedUpload> getUploadsList();

   PresignedUpload getUploads(int var1);

   int getUploadsCount();

   List<? extends PresignedUploadOrBuilder> getUploadsOrBuilderList();

   PresignedUploadOrBuilder getUploadsOrBuilder(int var1);
}
