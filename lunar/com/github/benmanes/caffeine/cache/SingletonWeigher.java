package com.github.benmanes.caffeine.cache;

enum SingletonWeigher implements Weigher<Object, Object> {
   INSTANCE;

   @Override
   public int weigh(Object var1, Object var2) {
      return 1;
   }
}
