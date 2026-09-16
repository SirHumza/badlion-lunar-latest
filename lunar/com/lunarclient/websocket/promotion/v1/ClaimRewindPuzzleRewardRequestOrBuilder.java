package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ClaimRewindPuzzleRewardRequestOrBuilder extends MessageOrBuilder {
   String getSolution();

   ByteString getSolutionBytes();
}
