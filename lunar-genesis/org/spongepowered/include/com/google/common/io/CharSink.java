package org.spongepowered.include.com.google.common.io;

import java.io.Writer;
import org.spongepowered.include.com.google.common.base.Preconditions;

public abstract class CharSink {
   protected CharSink() {
   }

   public abstract Writer openStream();

   public void write(CharSequence var1) {
      Preconditions.checkNotNull(var1);
      Closer var2 = Closer.create();

      try {
         Writer var3 = var2.register(this.openStream());
         var3.append(var1);
         var3.flush();
      } catch (Throwable var7) {
         throw var2.rethrow(var7);
      } finally {
         var2.close();
      }
   }
}
