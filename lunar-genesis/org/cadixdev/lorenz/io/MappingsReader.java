package org.cadixdev.lorenz.io;

import java.io.Closeable;
import org.cadixdev.lorenz.MappingSet;

public abstract class MappingsReader implements Closeable {
   public MappingSet read() {
      return this.read(MappingSet.create());
   }

   public abstract MappingSet read(MappingSet var1);
}
