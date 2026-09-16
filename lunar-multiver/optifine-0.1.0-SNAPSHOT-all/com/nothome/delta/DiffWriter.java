package com.nothome.delta;

import java.io.Closeable;

public interface DiffWriter extends Closeable {
   void addCopy(long var1, int var3);

   void addData(byte var1);

   void flush();

   @Override
   void close();
}
