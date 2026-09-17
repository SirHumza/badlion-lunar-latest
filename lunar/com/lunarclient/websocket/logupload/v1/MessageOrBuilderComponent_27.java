package com.lunarclient.websocket.logupload.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface StartLogUploadRequestOrBuilder extends MessageOrBuilder {
   List<StartLogUploadRequest.File> getFilesList();

   StartLogUploadRequest.File getFiles(int var1);

   int getFilesCount();

   List<? extends StartLogUploadRequest.FileOrBuilder> getFilesOrBuilderList();

   StartLogUploadRequest.FileOrBuilder getFilesOrBuilder(int var1);

   String getSentryCrashId();

   ByteString getSentryCrashIdBytes();

   String getSolutionId();

   ByteString getSolutionIdBytes();
}
