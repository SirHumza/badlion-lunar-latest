package com.lunarclient.apollo.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LunarClientVersionOrBuilder extends MessageOrBuilder {
   String getGitBranch();

   ByteString getGitBranchBytes();

   String getGitCommit();

   ByteString getGitCommitBytes();

   String getSemver();

   ByteString getSemverBytes();
}
