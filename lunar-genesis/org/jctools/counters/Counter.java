package org.jctools.counters;

public interface Counter {
   void inc();

   void inc(long var1);

   long get();

   long getAndReset();
}
