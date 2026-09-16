package org.cadixdev.lorenz.io.srg.xsrg;

import java.io.Reader;
import java.io.Writer;
import java.util.Optional;
import org.cadixdev.lorenz.io.MappingsReader;
import org.cadixdev.lorenz.io.MappingsWriter;
import org.cadixdev.lorenz.io.TextMappingFormat;

public class XSrgMappingFormat implements TextMappingFormat {
   @Override
   public MappingsReader createReader(Reader var1) {
      return new XSrgReader(var1);
   }

   @Override
   public MappingsWriter createWriter(Writer var1) {
      return new XSrgWriter(var1);
   }

   @Override
   public Optional<String> getStandardFileExtension() {
      return Optional.of("xsrg");
   }

   @Override
   public String toString() {
      return "xsrg";
   }
}
