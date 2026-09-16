package org.cadixdev.lorenz.io;

import java.io.DataOutputStream;
import java.io.OutputStream;

public abstract class BinaryMappingsWriter extends MappingsWriter {
   protected final DataOutputStream stream;

   protected BinaryMappingsWriter(OutputStream var1) {
      this.stream = new DataOutputStream(var1);
   }

   @Override
   public void close() {
      this.stream.close();
   }
}
