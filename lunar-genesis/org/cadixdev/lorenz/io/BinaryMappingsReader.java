package org.cadixdev.lorenz.io;

import java.io.DataInputStream;
import java.io.InputStream;

public abstract class BinaryMappingsReader extends MappingsReader {
   protected final DataInputStream stream;

   protected BinaryMappingsReader(InputStream var1) {
      this.stream = new DataInputStream(var1);
   }

   @Override
   public void close() {
      this.stream.close();
   }
}
