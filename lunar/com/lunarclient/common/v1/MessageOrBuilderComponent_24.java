package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PlayerModpackOrBuilder extends MessageOrBuilder {
   String getModrinthId();

   ByteString getModrinthIdBytes();

   String getName();

   ByteString getNameBytes();

   String getIconUrl();

   ByteString getIconUrlBytes();

   String getModrinthVersionId();

   ByteString getModrinthVersionIdBytes();

   String getCurseforgeId();

   ByteString getCurseforgeIdBytes();

   String getCurseforgeFileId();

   ByteString getCurseforgeFileIdBytes();
}
