package org.cadixdev.lorenz.io;

import java.io.PrintWriter;
import java.io.Writer;

public abstract class TextMappingsWriter extends MappingsWriter {
   protected final PrintWriter writer;

   protected TextMappingsWriter(Writer var1) {
      if (var1 instanceof PrintWriter) {
         this.writer = (PrintWriter)var1;
      } else {
         this.writer = new PrintWriter(var1);
      }
   }

   @Override
   public void close() {
      this.writer.flush();
      this.writer.close();
   }
}
