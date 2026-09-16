package com.nothome.delta.text;

import java.io.Closeable;

public interface DiffTextWriter extends Closeable {
   void addCopy(int var1, int var2);

   void addData(char var1);

   void flush();

   @Override
   void close();
}
