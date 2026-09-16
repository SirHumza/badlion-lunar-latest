package com.moonsworth.webosr.wrappers.image;

import com.moonsworth.webosr.NativeHandle;
import java.nio.ByteBuffer;

public final class TexturedImageSource extends NativeHandle implements ImageSource {
   private TexturedImageSource(long var1) {
      super(var1);
   }

   public native void update(ByteBuffer var1);

   public native void size(int var1, int var2);

   public native ChildImageSource makeChild(String var1);

   @Override
   public native void uv(int var1, int var2, int var3, int var4);

   @Override
   public native void bind();

   @Override
   public native void unbind();

   @Override
   protected native void destroy();
}
