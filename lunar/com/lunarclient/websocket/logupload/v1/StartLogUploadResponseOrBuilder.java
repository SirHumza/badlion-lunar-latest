package com.lunarclient.websocket.logupload.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface StartLogUploadResponseOrBuilder extends MessageOrBuilder {
   List<StartLogUploadResponse.File> getFilesList();

   StartLogUploadResponse.File getFiles(int var1);

   int getFilesCount();

   List<? extends StartLogUploadResponse.FileOrBuilder> getFilesOrBuilderList();

   StartLogUploadResponse.FileOrBuilder getFilesOrBuilder(int var1);

   String getUploadId();

   ByteString getUploadIdBytes();

   int getStatusValue();

   StartLogUploadResponse.Status getStatus();
}
