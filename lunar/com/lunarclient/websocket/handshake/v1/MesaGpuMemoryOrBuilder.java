package com.lunarclient.websocket.handshake.v1;

import com.google.protobuf.MessageOrBuilder;

public interface MesaGpuMemoryOrBuilder extends MessageOrBuilder {
   int getTotalVramMb();

   boolean getUnifiedMemory();
}
