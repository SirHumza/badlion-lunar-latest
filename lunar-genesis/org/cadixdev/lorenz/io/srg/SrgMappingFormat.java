package org.cadixdev.lorenz.io.srg;

import java.io.Reader;
import java.io.Writer;
import java.util.Optional;
import org.cadixdev.lorenz.io.MappingsReader;
import org.cadixdev.lorenz.io.MappingsWriter;
import org.cadixdev.lorenz.io.TextMappingFormat;

public class SrgMappingFormat implements TextMappingFormat {
   @Override
   public MappingsReader createReader(Reader var1) {
      return new SrgReader(var1);
   }

   @Override
   public MappingsWriter createWriter(Writer var1) {
      return new SrgWriter(var1);
   }

   @Override
   public Optional<String> getStandardFileExtension() {
      return Optional.of("srg");
   }

   @Override
   public String toString() {
      return "srg";
   }
}
