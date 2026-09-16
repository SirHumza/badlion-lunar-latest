package org.spongepowered.include.com.google.common.io;

import java.io.Reader;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public abstract class CharSource {
   protected CharSource() {
   }

   public abstract Reader openStream();

   @CanIgnoreReturnValue
   public <T> T readLines(LineProcessor<T> var1) {
      Preconditions.checkNotNull(var1);
      Closer var2 = Closer.create();

      try {
         Reader var3 = var2.register(this.openStream());
         return CharStreams.readLines(var3, var1);
      } catch (Throwable var8) {
         throw var2.rethrow(var8);
      } finally {
         var2.close();
      }
   }
}
