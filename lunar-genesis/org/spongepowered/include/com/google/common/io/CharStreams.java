package org.spongepowered.include.com.google.common.io;

import java.nio.CharBuffer;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class CharStreams {
   static CharBuffer createBuffer() {
      return CharBuffer.allocate(2048);
   }

   @CanIgnoreReturnValue
   public static <T> T readLines(Readable var0, LineProcessor<T> var1) {
      Preconditions.checkNotNull(var0);
      Preconditions.checkNotNull(var1);
      LineReader var2 = new LineReader(var0);

      String var3;
      while ((var3 = var2.readLine()) != null && var1.processLine(var3)) {
      }

      return (T)var1.getResult();
   }
}
