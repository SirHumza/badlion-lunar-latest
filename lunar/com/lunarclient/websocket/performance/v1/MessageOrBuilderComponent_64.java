package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface StartJfrUploadResponseOrBuilder extends MessageOrBuilder {
   List<StartJfrUploadResponse.File> getFilesList();

   StartJfrUploadResponse.File getFiles(int var1);

   int getFilesCount();

   List<? extends StartJfrUploadResponse.FileOrBuilder> getFilesOrBuilderList();

   StartJfrUploadResponse.FileOrBuilder getFilesOrBuilder(int var1);

   String getUploadId();

   ByteString getUploadIdBytes();

   int getStatusValue();

   StartJfrUploadResponse.Status getStatus();
}
