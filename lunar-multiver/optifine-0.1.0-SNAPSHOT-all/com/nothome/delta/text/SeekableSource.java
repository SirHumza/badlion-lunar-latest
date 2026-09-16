package com.nothome.delta.text;

import java.io.Closeable;

public interface SeekableSource extends Closeable, Readable {
   void seek(long var1);
}
