package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LauncherVersionOrBuilder extends MessageOrBuilder {
   String getSemver();

   ByteString getSemverBytes();
}
