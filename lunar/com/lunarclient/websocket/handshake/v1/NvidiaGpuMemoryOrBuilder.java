package com.lunarclient.websocket.handshake.v1;

import com.google.protobuf.MessageOrBuilder;

public interface NvidiaGpuMemoryOrBuilder extends MessageOrBuilder {
   int getDedicatedVramKb();

   int getTotalAvailableMemoryKb();
}
