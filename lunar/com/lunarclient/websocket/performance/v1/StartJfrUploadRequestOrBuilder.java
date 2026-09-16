package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface StartJfrUploadRequestOrBuilder extends MessageOrBuilder {
   List<StartJfrUploadRequest.File> getFilesList();

   StartJfrUploadRequest.File getFiles(int var1);

   int getFilesCount();

   List<? extends StartJfrUploadRequest.FileOrBuilder> getFilesOrBuilderList();

   StartJfrUploadRequest.FileOrBuilder getFilesOrBuilder(int var1);
}
