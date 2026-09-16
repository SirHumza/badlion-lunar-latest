package com.github.benmanes.caffeine.cache;

@FunctionalInterface
public interface Ticker {
   long read();

   static Ticker systemTicker() {
      return SystemTicker.INSTANCE;
   }

   static Ticker disabledTicker() {
      return DisabledTicker.INSTANCE;
   }
}
