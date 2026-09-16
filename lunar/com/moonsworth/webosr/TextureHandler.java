package com.moonsworth.webosr;

import java.nio.ByteBuffer;

public interface TextureHandler {
   int createTexture(int var1, int var2, int var3);

   void resizeTexture(int var1, int var2, int var3, int var4);

   void uploadTexture(int var1, ByteBuffer var2, int var3, int var4, int var5, int var6, int var7);

   void readTexture(int var1, ByteBuffer var2, int var3, int var4, int var5);

   void deleteTexture(int var1);
}
