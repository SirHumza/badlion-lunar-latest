package com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   private static ByteBuffer OIHRRIIHOCRHIICCCHHHCCIRHRRCRH = null;

   public static ByteBuffer HCIIROHROIOOHIIOOHCIHHIRCCCHRH(int var0) {
      ByteBuffer var1 = OIHRRIIHOCRHIICCCHHHCCIRHRRCRH;
      if (var1 == null || var1.capacity() < var0) {
         OIHRRIIHOCRHIICCCHHHCCIRHRRCRH = var1 = BufferUtils.createByteBuffer(var0);
      }

      var1.position(0);
      var1.limit(var1.capacity());
      return var1;
   }
}
