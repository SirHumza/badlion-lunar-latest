package com.moonsworth.webosr.wrappers.image;

import com.moonsworth.webosr.NativeHandle;

public final class ChildImageSource extends NativeHandle implements ImageSource {
   private ChildImageSource(long var1) {
      super(var1);
   }

   @Override
   public native void bind();

   @Override
   public native void unbind();

   @Override
   public native void uv(int var1, int var2, int var3, int var4);

   @Override
   protected native void destroy();
}
