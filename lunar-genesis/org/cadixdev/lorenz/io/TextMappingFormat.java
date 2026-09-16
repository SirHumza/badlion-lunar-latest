package org.cadixdev.lorenz.io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public interface TextMappingFormat extends MappingFormat {
   MappingsReader createReader(Reader var1);

   @Override
   default MappingsReader createReader(InputStream var1) {
      return this.createReader(new InputStreamReader(var1, StandardCharsets.UTF_8));
   }

   @Override
   default MappingsReader createReader(Path var1) {
      return this.createReader(Files.newBufferedReader(var1));
   }

   MappingsWriter createWriter(Writer var1);

   @Override
   default MappingsWriter createWriter(OutputStream var1) {
      return this.createWriter(new OutputStreamWriter(var1, StandardCharsets.UTF_8));
   }

   @Override
   default MappingsWriter createWriter(Path var1) {
      return this.createWriter(Files.newBufferedWriter(var1));
   }
}
