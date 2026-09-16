package org.cadixdev.lorenz.io.srg.tsrg;

import java.io.Reader;
import java.io.Writer;
import java.util.Optional;
import org.cadixdev.lorenz.io.MappingsReader;
import org.cadixdev.lorenz.io.MappingsWriter;
import org.cadixdev.lorenz.io.TextMappingFormat;

public class TSrgMappingFormat implements TextMappingFormat {
   @Override
   public MappingsReader createReader(Reader var1) {
      return new TSrgReader(var1);
   }

   @Override
   public MappingsWriter createWriter(Writer var1) {
      return new TSrgWriter(var1);
   }

   @Override
   public Optional<String> getStandardFileExtension() {
      return Optional.of("tsrg");
   }

   @Override
   public String toString() {
      return "tsrg";
   }
}
