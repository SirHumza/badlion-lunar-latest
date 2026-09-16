package org.cadixdev.lorenz.io.srg.csrg;

import java.io.Reader;
import java.io.Writer;
import java.util.Optional;
import org.cadixdev.lorenz.io.MappingsReader;
import org.cadixdev.lorenz.io.MappingsWriter;
import org.cadixdev.lorenz.io.TextMappingFormat;

public class CSrgMappingFormat implements TextMappingFormat {
   @Override
   public MappingsReader createReader(Reader var1) {
      return new CSrgReader(var1);
   }

   @Override
   public MappingsWriter createWriter(Writer var1) {
      return new CSrgWriter(var1);
   }

   @Override
   public Optional<String> getStandardFileExtension() {
      return Optional.of("csrg");
   }

   @Override
   public String toString() {
      return "csrg";
   }
}
