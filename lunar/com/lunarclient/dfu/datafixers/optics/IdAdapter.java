package com.lunarclient.dfu.datafixers.optics;

class IdAdapter<S, T> implements Adapter<S, T, S, T> {
   static final IdAdapter<?, ?> INSTANCE = new IdAdapter();

   private IdAdapter() {
   }

   @Override
   public S from(S var1) {
      return (S)var1;
   }

   @Override
   public T to(T var1) {
      return (T)var1;
   }

   @Override
   public String toString() {
      return "id";
   }
}
