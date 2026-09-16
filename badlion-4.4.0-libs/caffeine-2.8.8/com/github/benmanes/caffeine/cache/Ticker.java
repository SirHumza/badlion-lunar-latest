package com.github.benmanes.caffeine.cache;

import org.checkerframework.checker.nullness.qual.NonNull;

public interface Ticker {
   long read();

   static @NonNull Ticker systemTicker() {
      return SystemTicker.INSTANCE;
   }

   static @NonNull Ticker disabledTicker() {
      return DisabledTicker.INSTANCE;
   }
}
