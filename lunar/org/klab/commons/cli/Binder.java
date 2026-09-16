package org.klab.commons.cli;

public interface Binder<T> {
   void bind(T var1, String[] var2, Binder.Context var3);

   abstract class Context {
      public abstract boolean hasOption(String var1);
   }
}
