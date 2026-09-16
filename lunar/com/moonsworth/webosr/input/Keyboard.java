package com.moonsworth.webosr.input;

public final class Keyboard {
   public enum Action {
      DOWN,
      UP,
      CHAR,
      RAW_DOWN;

      public int getValue() {
         return this.ordinal();
      }

      public Keyboard.Action fromValue(int var1) {
         return values()[var1];
      }
   }
}
