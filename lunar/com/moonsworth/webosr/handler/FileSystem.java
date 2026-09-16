package com.moonsworth.webosr.handler;

import java.nio.ByteBuffer;

public interface FileSystem {
   FileSystem.Payload onRequest(String var1);

   boolean doesResourceExist(String var1);

   record Payload() {
      private final ByteBuffer buffer;
      private final int length;
      private final String mimeType;
      private final int statusCode;

      public Payload(ByteBuffer var1, int var2, String var3, int var4) {
         this.buffer = var1;
         this.length = var2;
         this.mimeType = var3;
         this.statusCode = var4;
      }
   }
}
