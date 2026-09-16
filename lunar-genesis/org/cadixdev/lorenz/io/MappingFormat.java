package org.cadixdev.lorenz.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import org.cadixdev.lorenz.MappingSet;

public interface MappingFormat {
   MappingsReader createReader(InputStream var1);

   default MappingsReader createReader(Path var1) {
      return this.createReader(Files.newInputStream(var1));
   }

   default MappingSet read(MappingSet var1, Path var2) {
      MappingsReader var3 = this.createReader(var2);

      try {
         var3.read(var1);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }

      return var1;
   }

   default MappingSet read(Path var1) {
      return this.read(MappingSet.create(), var1);
   }

   MappingsWriter createWriter(OutputStream var1);

   default MappingsWriter createWriter(Path var1) {
      return this.createWriter(Files.newOutputStream(var1));
   }

   default void write(MappingSet var1, Path var2) {
      MappingsWriter var3 = this.createWriter(var2);

      try {
         var3.write(var1);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }
   }

   default void write(MappingSet var1, Path var2, MappingsWriterConfig var3) {
      MappingsWriter var4 = this.createWriter(var2);

      try {
         var4.setConfig(var3);
         var4.write(var1);
      } catch (Throwable var8) {
         if (var4 != null) {
            try {
               var4.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var4 != null) {
         var4.close();
      }
   }

   Optional<String> getStandardFileExtension();
}
