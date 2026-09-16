package com.nothome.delta;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface SeekableSource extends Closeable {
   void seek(long var1);

   int read(ByteBuffer var1);
}
