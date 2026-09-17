package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LunarClientUiVersionOrBuilder extends MessageOrBuilder {
   String getGitBranch();

   ByteString getGitBranchBytes();

   String getGitCommit();

   ByteString getGitCommitBytes();
}
