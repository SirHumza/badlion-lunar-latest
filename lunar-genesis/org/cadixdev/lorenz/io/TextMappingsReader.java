package org.cadixdev.lorenz.io;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.cadixdev.lorenz.MappingSet;

public abstract class TextMappingsReader extends MappingsReader {
   protected final BufferedReader reader;
   protected final Function<MappingSet, TextMappingsReader.Processor> processor;

   protected TextMappingsReader(Reader var1, Function<MappingSet, TextMappingsReader.Processor> var2) {
      this.reader = var1 instanceof BufferedReader ? (BufferedReader)var1 : new BufferedReader(var1);
      this.processor = var2;
   }

   @Override
   public MappingSet read(MappingSet var1) {
      TextMappingsReader.Processor var2 = this.processor.apply(var1);
      this.reader.lines().forEach(var2);
      return var1;
   }

   @Override
   public void close() {
      this.reader.close();
   }

   public abstract static class Processor implements Consumer<String> {
      protected static final Pattern SPACE = Pattern.compile(" ", 16);
      protected final MappingSet mappings;

      protected Processor(MappingSet var1) {
         this.mappings = var1;
      }

      public MappingSet getMappings() {
         return this.mappings;
      }
   }
}
