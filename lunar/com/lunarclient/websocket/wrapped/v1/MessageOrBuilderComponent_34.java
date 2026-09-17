package com.lunarclient.websocket.wrapped.v1;

import com.google.protobuf.MessageOrBuilder;

public interface SetLeaderboardVisibilityRequestOrBuilder extends MessageOrBuilder {
   int getLeaderboardVisibilityValue();

   WrappedLeaderboardVisibility getLeaderboardVisibility();
}
